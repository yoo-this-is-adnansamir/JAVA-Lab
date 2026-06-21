public class PersonalInfo {
    public static void main(String[] args) {
        String name = "Adnan Samir";
        String studentId = "E253017";
        int age = 21;
        String email = "adnan230205@gmail.com";
        String phone = "+880123456789";
        String address = "Sitakunda,Chattogram";

        
        System.out.println("Personal Information:");
        System.out.println("Name: " + name);
        System.out.println("Student ID: " + studentId);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);

        System.out.printf("\nFormatted Personal Information:\n");       
        System.out.printf("Name: %s\n", name);
        System.out.printf("Student ID: %s\n", studentId);   
        System.out.printf("Age: %d\n", age);
        System.out.printf("Email: %s\n", email);        
        System.out.printf("Phone: %s\n", phone);
        System.out.printf("Address: %s\n", address);
                
    }
}
