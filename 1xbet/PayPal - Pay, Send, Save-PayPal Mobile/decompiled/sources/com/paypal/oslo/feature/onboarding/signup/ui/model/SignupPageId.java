package com.paypal.oslo.feature.onboarding.signup.ui.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/ui/model/SignupPageId;", "", "<init>", "(Ljava/lang/String;I)V", "EMAIL", "PHONE_ENTRY", "PASSWORD", "PERSONAL_INFO", "ADDRESS_INFO"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignupPageId {
    public static final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId ADDRESS_INFO;
    private static final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId EMAIL;
    public static final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId PASSWORD;
    public static final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId PERSONAL_INFO;
    public static final com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId PHONE_ENTRY;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoSizes;

    private SignupPageId(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId signupPageId = new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId("EMAIL", 0);
        EMAIL = signupPageId;
        com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId signupPageId2 = new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId("PHONE_ENTRY", 1);
        PHONE_ENTRY = signupPageId2;
        com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId signupPageId3 = new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId("PASSWORD", 2);
        PASSWORD = signupPageId3;
        com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId signupPageId4 = new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId("PERSONAL_INFO", 3);
        PERSONAL_INFO = signupPageId4;
        com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId signupPageId5 = new com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId("ADDRESS_INFO", 4);
        ADDRESS_INFO = signupPageId5;
        com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId[] signupPageIdArr = {signupPageId, signupPageId2, signupPageId3, signupPageId4, signupPageId5};
        Camera2StreamConfigurationMap = signupPageIdArr;
        getHighSpeedVideoSizes = kotlin.enums.EnumEntriesKt.enumEntries(signupPageIdArr);
    }

    public static com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId[] values() {
        return (com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId) java.lang.Enum.valueOf(com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.onboarding.signup.ui.model.SignupPageId> getEntries() {
        return getHighSpeedVideoSizes;
    }
}
