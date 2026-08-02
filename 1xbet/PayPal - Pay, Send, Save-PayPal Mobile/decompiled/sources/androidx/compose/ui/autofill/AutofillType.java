package androidx.compose.ui.autofill;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Deprecated(message = "Use the new semantics-based API and androidx.compose.ui.autofill.ContentType instead.")
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b&\b\u0087\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015j\u0002\b\u0016j\u0002\b\u0017j\u0002\b\u0018j\u0002\b\u0019j\u0002\b\u001aj\u0002\b\u001bj\u0002\b\u001cj\u0002\b\u001dj\u0002\b\u001ej\u0002\b\u001fj\u0002\b j\u0002\b!j\u0002\b\"j\u0002\b#j\u0002\b$j\u0002\b%j\u0002\b&j\u0002\b'"}, d2 = {"Landroidx/compose/ui/autofill/AutofillType;", "", "<init>", "(Ljava/lang/String;I)V", "EmailAddress", "Username", "Password", "NewUsername", "NewPassword", "PostalAddress", "PostalCode", "CreditCardNumber", "CreditCardSecurityCode", "CreditCardExpirationDate", "CreditCardExpirationMonth", "CreditCardExpirationYear", "CreditCardExpirationDay", "AddressCountry", "AddressRegion", "AddressLocality", "AddressStreet", "AddressAuxiliaryDetails", "PostalCodeExtended", "PersonFullName", "PersonFirstName", "PersonLastName", "PersonMiddleName", "PersonMiddleInitial", "PersonNamePrefix", "PersonNameSuffix", "PhoneNumber", "PhoneNumberDevice", "PhoneCountryCode", "PhoneNumberNational", "Gender", "BirthDateFull", "BirthDateDay", "BirthDateMonth", "BirthDateYear", "SmsOtpCode"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AutofillType {
    public static final androidx.compose.ui.autofill.AutofillType AddressAuxiliaryDetails;
    public static final androidx.compose.ui.autofill.AutofillType AddressCountry;
    public static final androidx.compose.ui.autofill.AutofillType AddressLocality;
    public static final androidx.compose.ui.autofill.AutofillType AddressRegion;
    public static final androidx.compose.ui.autofill.AutofillType AddressStreet;
    public static final androidx.compose.ui.autofill.AutofillType BirthDateDay;
    public static final androidx.compose.ui.autofill.AutofillType BirthDateFull;
    public static final androidx.compose.ui.autofill.AutofillType BirthDateMonth;
    public static final androidx.compose.ui.autofill.AutofillType BirthDateYear;
    public static final androidx.compose.ui.autofill.AutofillType CreditCardExpirationDate;
    public static final androidx.compose.ui.autofill.AutofillType CreditCardExpirationDay;
    public static final androidx.compose.ui.autofill.AutofillType CreditCardExpirationMonth;
    public static final androidx.compose.ui.autofill.AutofillType CreditCardExpirationYear;
    public static final androidx.compose.ui.autofill.AutofillType CreditCardNumber;
    public static final androidx.compose.ui.autofill.AutofillType CreditCardSecurityCode;
    public static final androidx.compose.ui.autofill.AutofillType EmailAddress;
    public static final androidx.compose.ui.autofill.AutofillType Gender;
    public static final androidx.compose.ui.autofill.AutofillType NewPassword;
    public static final androidx.compose.ui.autofill.AutofillType NewUsername;
    public static final androidx.compose.ui.autofill.AutofillType Password;
    public static final androidx.compose.ui.autofill.AutofillType PersonFirstName;
    public static final androidx.compose.ui.autofill.AutofillType PersonFullName;
    public static final androidx.compose.ui.autofill.AutofillType PersonLastName;
    public static final androidx.compose.ui.autofill.AutofillType PersonMiddleInitial;
    public static final androidx.compose.ui.autofill.AutofillType PersonMiddleName;
    public static final androidx.compose.ui.autofill.AutofillType PersonNamePrefix;
    public static final androidx.compose.ui.autofill.AutofillType PersonNameSuffix;
    public static final androidx.compose.ui.autofill.AutofillType PhoneCountryCode;
    public static final androidx.compose.ui.autofill.AutofillType PhoneNumber;
    public static final androidx.compose.ui.autofill.AutofillType PhoneNumberDevice;
    public static final androidx.compose.ui.autofill.AutofillType PhoneNumberNational;
    public static final androidx.compose.ui.autofill.AutofillType PostalAddress;
    public static final androidx.compose.ui.autofill.AutofillType PostalCode;
    public static final androidx.compose.ui.autofill.AutofillType PostalCodeExtended;
    public static final androidx.compose.ui.autofill.AutofillType SmsOtpCode;
    public static final androidx.compose.ui.autofill.AutofillType Username;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;
    private static final /* synthetic */ androidx.compose.ui.autofill.AutofillType[] getHighSpeedVideoSizes;

    private AutofillType(java.lang.String str, int i) {
    }

    static {
        androidx.compose.ui.autofill.AutofillType autofillType = new androidx.compose.ui.autofill.AutofillType("EmailAddress", 0);
        EmailAddress = autofillType;
        androidx.compose.ui.autofill.AutofillType autofillType2 = new androidx.compose.ui.autofill.AutofillType("Username", 1);
        Username = autofillType2;
        androidx.compose.ui.autofill.AutofillType autofillType3 = new androidx.compose.ui.autofill.AutofillType("Password", 2);
        Password = autofillType3;
        androidx.compose.ui.autofill.AutofillType autofillType4 = new androidx.compose.ui.autofill.AutofillType("NewUsername", 3);
        NewUsername = autofillType4;
        androidx.compose.ui.autofill.AutofillType autofillType5 = new androidx.compose.ui.autofill.AutofillType("NewPassword", 4);
        NewPassword = autofillType5;
        androidx.compose.ui.autofill.AutofillType autofillType6 = new androidx.compose.ui.autofill.AutofillType("PostalAddress", 5);
        PostalAddress = autofillType6;
        androidx.compose.ui.autofill.AutofillType autofillType7 = new androidx.compose.ui.autofill.AutofillType("PostalCode", 6);
        PostalCode = autofillType7;
        androidx.compose.ui.autofill.AutofillType autofillType8 = new androidx.compose.ui.autofill.AutofillType("CreditCardNumber", 7);
        CreditCardNumber = autofillType8;
        androidx.compose.ui.autofill.AutofillType autofillType9 = new androidx.compose.ui.autofill.AutofillType("CreditCardSecurityCode", 8);
        CreditCardSecurityCode = autofillType9;
        androidx.compose.ui.autofill.AutofillType autofillType10 = new androidx.compose.ui.autofill.AutofillType("CreditCardExpirationDate", 9);
        CreditCardExpirationDate = autofillType10;
        androidx.compose.ui.autofill.AutofillType autofillType11 = new androidx.compose.ui.autofill.AutofillType("CreditCardExpirationMonth", 10);
        CreditCardExpirationMonth = autofillType11;
        androidx.compose.ui.autofill.AutofillType autofillType12 = new androidx.compose.ui.autofill.AutofillType("CreditCardExpirationYear", 11);
        CreditCardExpirationYear = autofillType12;
        androidx.compose.ui.autofill.AutofillType autofillType13 = new androidx.compose.ui.autofill.AutofillType("CreditCardExpirationDay", 12);
        CreditCardExpirationDay = autofillType13;
        androidx.compose.ui.autofill.AutofillType autofillType14 = new androidx.compose.ui.autofill.AutofillType("AddressCountry", 13);
        AddressCountry = autofillType14;
        androidx.compose.ui.autofill.AutofillType autofillType15 = new androidx.compose.ui.autofill.AutofillType("AddressRegion", 14);
        AddressRegion = autofillType15;
        androidx.compose.ui.autofill.AutofillType autofillType16 = new androidx.compose.ui.autofill.AutofillType("AddressLocality", 15);
        AddressLocality = autofillType16;
        androidx.compose.ui.autofill.AutofillType autofillType17 = new androidx.compose.ui.autofill.AutofillType("AddressStreet", 16);
        AddressStreet = autofillType17;
        androidx.compose.ui.autofill.AutofillType autofillType18 = new androidx.compose.ui.autofill.AutofillType("AddressAuxiliaryDetails", 17);
        AddressAuxiliaryDetails = autofillType18;
        androidx.compose.ui.autofill.AutofillType autofillType19 = new androidx.compose.ui.autofill.AutofillType("PostalCodeExtended", 18);
        PostalCodeExtended = autofillType19;
        androidx.compose.ui.autofill.AutofillType autofillType20 = new androidx.compose.ui.autofill.AutofillType("PersonFullName", 19);
        PersonFullName = autofillType20;
        androidx.compose.ui.autofill.AutofillType autofillType21 = new androidx.compose.ui.autofill.AutofillType("PersonFirstName", 20);
        PersonFirstName = autofillType21;
        androidx.compose.ui.autofill.AutofillType autofillType22 = new androidx.compose.ui.autofill.AutofillType("PersonLastName", 21);
        PersonLastName = autofillType22;
        androidx.compose.ui.autofill.AutofillType autofillType23 = new androidx.compose.ui.autofill.AutofillType("PersonMiddleName", 22);
        PersonMiddleName = autofillType23;
        androidx.compose.ui.autofill.AutofillType autofillType24 = new androidx.compose.ui.autofill.AutofillType("PersonMiddleInitial", 23);
        PersonMiddleInitial = autofillType24;
        androidx.compose.ui.autofill.AutofillType autofillType25 = new androidx.compose.ui.autofill.AutofillType("PersonNamePrefix", 24);
        PersonNamePrefix = autofillType25;
        androidx.compose.ui.autofill.AutofillType autofillType26 = new androidx.compose.ui.autofill.AutofillType("PersonNameSuffix", 25);
        PersonNameSuffix = autofillType26;
        androidx.compose.ui.autofill.AutofillType autofillType27 = new androidx.compose.ui.autofill.AutofillType("PhoneNumber", 26);
        PhoneNumber = autofillType27;
        androidx.compose.ui.autofill.AutofillType autofillType28 = new androidx.compose.ui.autofill.AutofillType("PhoneNumberDevice", 27);
        PhoneNumberDevice = autofillType28;
        androidx.compose.ui.autofill.AutofillType autofillType29 = new androidx.compose.ui.autofill.AutofillType("PhoneCountryCode", 28);
        PhoneCountryCode = autofillType29;
        androidx.compose.ui.autofill.AutofillType autofillType30 = new androidx.compose.ui.autofill.AutofillType("PhoneNumberNational", 29);
        PhoneNumberNational = autofillType30;
        androidx.compose.ui.autofill.AutofillType autofillType31 = new androidx.compose.ui.autofill.AutofillType("Gender", 30);
        Gender = autofillType31;
        androidx.compose.ui.autofill.AutofillType autofillType32 = new androidx.compose.ui.autofill.AutofillType("BirthDateFull", 31);
        BirthDateFull = autofillType32;
        androidx.compose.ui.autofill.AutofillType autofillType33 = new androidx.compose.ui.autofill.AutofillType("BirthDateDay", 32);
        BirthDateDay = autofillType33;
        androidx.compose.ui.autofill.AutofillType autofillType34 = new androidx.compose.ui.autofill.AutofillType("BirthDateMonth", 33);
        BirthDateMonth = autofillType34;
        androidx.compose.ui.autofill.AutofillType autofillType35 = new androidx.compose.ui.autofill.AutofillType("BirthDateYear", 34);
        BirthDateYear = autofillType35;
        androidx.compose.ui.autofill.AutofillType autofillType36 = new androidx.compose.ui.autofill.AutofillType("SmsOtpCode", 35);
        SmsOtpCode = autofillType36;
        androidx.compose.ui.autofill.AutofillType[] autofillTypeArr = {autofillType, autofillType2, autofillType3, autofillType4, autofillType5, autofillType6, autofillType7, autofillType8, autofillType9, autofillType10, autofillType11, autofillType12, autofillType13, autofillType14, autofillType15, autofillType16, autofillType17, autofillType18, autofillType19, autofillType20, autofillType21, autofillType22, autofillType23, autofillType24, autofillType25, autofillType26, autofillType27, autofillType28, autofillType29, autofillType30, autofillType31, autofillType32, autofillType33, autofillType34, autofillType35, autofillType36};
        getHighSpeedVideoSizes = autofillTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(autofillTypeArr);
    }

    public static androidx.compose.ui.autofill.AutofillType[] values() {
        return (androidx.compose.ui.autofill.AutofillType[]) getHighSpeedVideoSizes.clone();
    }

    public static androidx.compose.ui.autofill.AutofillType valueOf(java.lang.String str) {
        return (androidx.compose.ui.autofill.AutofillType) java.lang.Enum.valueOf(androidx.compose.ui.autofill.AutofillType.class, str);
    }

    public static kotlin.enums.EnumEntries<androidx.compose.ui.autofill.AutofillType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
