package com.paypal.oslo.feature.onboarding.signup.ui.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupComponentType;", "", "<init>", "(Ljava/lang/String;I)V", "HEADER", "EMAIL", "PHONE", "ADDRESS", "NAME", "PASSWORD", "TERMS_AND_CONDITIONS", "LINK", "DROPDOWN", "BUTTON"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignupComponentType {
    public static final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType ADDRESS;
    public static final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType BUTTON;
    private static final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType DROPDOWN;
    public static final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType EMAIL;
    public static final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType HEADER;
    public static final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType LINK;
    public static final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType NAME;
    public static final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType PASSWORD;
    public static final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType PHONE;
    public static final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType TERMS_AND_CONDITIONS;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private SignupComponentType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType signupComponentType = new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType("HEADER", 0);
        HEADER = signupComponentType;
        com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType signupComponentType2 = new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType("EMAIL", 1);
        EMAIL = signupComponentType2;
        com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType signupComponentType3 = new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType("PHONE", 2);
        PHONE = signupComponentType3;
        com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType signupComponentType4 = new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType("ADDRESS", 3);
        ADDRESS = signupComponentType4;
        com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType signupComponentType5 = new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType("NAME", 4);
        NAME = signupComponentType5;
        com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType signupComponentType6 = new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType("PASSWORD", 5);
        PASSWORD = signupComponentType6;
        com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType signupComponentType7 = new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType("TERMS_AND_CONDITIONS", 6);
        TERMS_AND_CONDITIONS = signupComponentType7;
        com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType signupComponentType8 = new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType("LINK", 7);
        LINK = signupComponentType8;
        com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType signupComponentType9 = new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType("DROPDOWN", 8);
        DROPDOWN = signupComponentType9;
        com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType signupComponentType10 = new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType("BUTTON", 9);
        BUTTON = signupComponentType10;
        com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType[] signupComponentTypeArr = {signupComponentType, signupComponentType2, signupComponentType3, signupComponentType4, signupComponentType5, signupComponentType6, signupComponentType7, signupComponentType8, signupComponentType9, signupComponentType10};
        Camera2StreamConfigurationMap = signupComponentTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(signupComponentTypeArr);
    }

    public static com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType[] values() {
        return (com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType) java.lang.Enum.valueOf(com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.onboarding.signup.ui.model.SignupComponentType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
