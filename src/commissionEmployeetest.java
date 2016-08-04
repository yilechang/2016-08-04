
public class commissionEmployeetest {
	public static void main ( String args[] ){
		commissionEmployee employee = new commissionEmployee( "Sue" , "Jones" , "222-22-222" , 10000  , .06 );
		
		System.out.println( "Employee information obtain by get methods : \n");
		System.out.printf( "%s %s\n", "First name is" , employee.getFirstName() );
		System.out.printf( "%s %s\n", "Last name is" , employee.getLastName() );
		System.out.printf( "%s %s\n", "Social security number is" , employee.getSocialSecurityNumber() );
		System.out.printf( "%s %.2f\n", "Gross sale is" ,employee.getGrossSales() );
		System.out.printf( "%s %.2f\n", "Commission rate is" , employee.getCommissionRate() );
		
		employee.setGrossSales( 500 );
		employee.setCommissionRate(  .1 );
		System.out.printf( "\n%s :\n\n%s\n", "Update employee information obtained by toString" , employee );
	}
}
