package com.paypal.oslo.feature.businesscustomers.ui.customerform;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t"}, d2 = {"Lcom/paypal/oslo/feature/businesscustomers/ui/customerform/CustomerFormError;", "", "<init>", "(Ljava/lang/String;I)V", "EmptyName", "EmptyEmail", "InvalidEmail", "InvalidPhone", "InvalidLengthInCustomerNotes", "ServerFailure"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CustomerFormError {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError EmptyEmail;
    public static final com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError EmptyName;
    public static final com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError InvalidEmail;
    public static final com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError InvalidLengthInCustomerNotes;
    public static final com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError InvalidPhone;
    public static final com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError ServerFailure;
    private static final /* synthetic */ com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError[] getHighSpeedVideoFpsRangesFor;

    private CustomerFormError(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError customerFormError = new com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError("EmptyName", 0);
        EmptyName = customerFormError;
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError customerFormError2 = new com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError("EmptyEmail", 1);
        EmptyEmail = customerFormError2;
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError customerFormError3 = new com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError("InvalidEmail", 2);
        InvalidEmail = customerFormError3;
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError customerFormError4 = new com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError("InvalidPhone", 3);
        InvalidPhone = customerFormError4;
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError customerFormError5 = new com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError("InvalidLengthInCustomerNotes", 4);
        InvalidLengthInCustomerNotes = customerFormError5;
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError customerFormError6 = new com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError("ServerFailure", 5);
        ServerFailure = customerFormError6;
        com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError[] customerFormErrorArr = {customerFormError, customerFormError2, customerFormError3, customerFormError4, customerFormError5, customerFormError6};
        getHighSpeedVideoFpsRangesFor = customerFormErrorArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(customerFormErrorArr);
    }

    public static com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError[] values() {
        return (com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError) java.lang.Enum.valueOf(com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormError> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
