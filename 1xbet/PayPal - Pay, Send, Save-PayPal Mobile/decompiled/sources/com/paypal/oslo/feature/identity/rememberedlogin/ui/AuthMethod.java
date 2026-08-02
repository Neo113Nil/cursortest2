package com.paypal.oslo.feature.identity.rememberedlogin.ui;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/rememberedlogin/ui/AuthMethod;", "", "<init>", "(Ljava/lang/String;I)V", "BIOMETRIC", "PASSKEY", "OTP", "PASSWORD"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AuthMethod {
    public static final com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod BIOMETRIC;
    public static final com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod OTP;
    public static final com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod PASSKEY;
    public static final com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod PASSWORD;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod[] getHighSpeedVideoSizes;

    private AuthMethod(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod authMethod = new com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod("BIOMETRIC", 0);
        BIOMETRIC = authMethod;
        com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod authMethod2 = new com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod("PASSKEY", 1);
        PASSKEY = authMethod2;
        com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod authMethod3 = new com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod("OTP", 2);
        OTP = authMethod3;
        com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod authMethod4 = new com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod("PASSWORD", 3);
        PASSWORD = authMethod4;
        com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod[] authMethodArr = {authMethod, authMethod2, authMethod3, authMethod4};
        getHighSpeedVideoSizes = authMethodArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(authMethodArr);
    }

    public static com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod[] values() {
        return (com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.rememberedlogin.ui.AuthMethod> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
