package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\tR\u0014\u0010\f\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\tR\u0014\u0010\r\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\tR\u0014\u0010\u000e\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\u0006R\u0014\u0010\u000f\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0006R\u0014\u0010\u0010\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0006R\u0014\u0010\u0011\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\tR\u0014\u0010\u0012\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\tR\u0014\u0010\u0014\u001a\u00020\u00138\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00078\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0016\u0010\tR\u0014\u0010\u0017\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0006R\u0014\u0010\u0019\u001a\u00020\u00188\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/bnplacquisition/ui/personalinfo/PersonalInfoConstants;", "", "<init>", "()V", "", "PHONE_NUMBER_LENGTH", com.visa.cbp.getEncExpo.warmup, "", "PHONE_NUMBER_US_DIAL_CODE", "Ljava/lang/String;", "DOB_DEFAULT_MASK_FORMAT", "DOB_DATE_SERVER_FORMAT", "DOB_DEFAULT_DATE_PATTERN", "DOB_DEFAULT_VALIDATION_PATTERN", "DOB_LENGTH", "SSN_LENGTH", "SSN_VISIBLE_DIGITS", "SSN_MASK_CHAR", "SSN_MASK_HIDDEN", "", "DEFAULT_LOAN_AMOUNT", "D", "CURRENCY_CODE_USD", "MAX_INCOME_LENGTH", "", "MIN_VALID_INCOME", "J"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PersonalInfoConstants {
    public static final int $stable = 0;
    public static final java.lang.String CURRENCY_CODE_USD = "USD";
    public static final double DEFAULT_LOAN_AMOUNT = 400.0d;
    public static final java.lang.String DOB_DATE_SERVER_FORMAT = "yyyy-MM-dd";
    public static final java.lang.String DOB_DEFAULT_DATE_PATTERN = "MM/dd/yyyy";
    public static final java.lang.String DOB_DEFAULT_MASK_FORMAT = "00/00/0000";
    public static final java.lang.String DOB_DEFAULT_VALIDATION_PATTERN = "MMddyyyy";
    public static final int DOB_LENGTH = 8;
    public static final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConstants INSTANCE = new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConstants();
    public static final int MAX_INCOME_LENGTH = 7;
    public static final long MIN_VALID_INCOME = 100;
    public static final int PHONE_NUMBER_LENGTH = 10;
    public static final java.lang.String PHONE_NUMBER_US_DIAL_CODE = "+1";
    public static final int SSN_LENGTH = 4;
    public static final java.lang.String SSN_MASK_CHAR = "••";
    public static final java.lang.String SSN_MASK_HIDDEN = "^^00";
    public static final int SSN_VISIBLE_DIGITS = 2;

    private PersonalInfoConstants() {
    }
}
