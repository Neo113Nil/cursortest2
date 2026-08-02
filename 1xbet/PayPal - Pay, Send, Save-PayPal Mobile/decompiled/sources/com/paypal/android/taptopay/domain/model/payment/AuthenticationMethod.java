package com.paypal.android.taptopay.domain.model.payment;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/android/taptopay/domain/model/payment/AuthenticationMethod;", "", "<init>", "(Ljava/lang/String;I)V", "BIOMETRICS", "KEYGUARD", "PIN", "NONE"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AuthenticationMethod {
    public static final com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod BIOMETRICS;
    private static final /* synthetic */ com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod[] Camera2StreamConfigurationMap;
    public static final com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod KEYGUARD;
    public static final com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod NONE;
    public static final com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod PIN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private AuthenticationMethod(java.lang.String str, int i) {
    }

    static {
        com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod authenticationMethod = new com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod("BIOMETRICS", 0);
        BIOMETRICS = authenticationMethod;
        com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod authenticationMethod2 = new com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod("KEYGUARD", 1);
        KEYGUARD = authenticationMethod2;
        com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod authenticationMethod3 = new com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod("PIN", 2);
        PIN = authenticationMethod3;
        com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod authenticationMethod4 = new com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod("NONE", 3);
        NONE = authenticationMethod4;
        com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod[] authenticationMethodArr = {authenticationMethod, authenticationMethod2, authenticationMethod3, authenticationMethod4};
        Camera2StreamConfigurationMap = authenticationMethodArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(authenticationMethodArr);
    }

    public static com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod[] values() {
        return (com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod valueOf(java.lang.String str) {
        return (com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod) java.lang.Enum.valueOf(com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.android.taptopay.domain.model.payment.AuthenticationMethod> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
