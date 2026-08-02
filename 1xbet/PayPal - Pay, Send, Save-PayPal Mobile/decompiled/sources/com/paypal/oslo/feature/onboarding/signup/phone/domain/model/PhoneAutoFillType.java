package com.paypal.oslo.feature.onboarding.signup.phone.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/phone/domain/model/PhoneAutoFillType;", "", "<init>", "(Ljava/lang/String;I)V", "WEB", "ANDROID", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PhoneAutoFillType {
    public static final com.paypal.oslo.feature.onboarding.signup.phone.domain.model.PhoneAutoFillType ANDROID;
    private static final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.phone.domain.model.PhoneAutoFillType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.onboarding.signup.phone.domain.model.PhoneAutoFillType UNKNOWN;
    public static final com.paypal.oslo.feature.onboarding.signup.phone.domain.model.PhoneAutoFillType WEB;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighResolutionOutputSizeshNQ4ISI;

    private PhoneAutoFillType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.onboarding.signup.phone.domain.model.PhoneAutoFillType phoneAutoFillType = new com.paypal.oslo.feature.onboarding.signup.phone.domain.model.PhoneAutoFillType("WEB", 0);
        WEB = phoneAutoFillType;
        com.paypal.oslo.feature.onboarding.signup.phone.domain.model.PhoneAutoFillType phoneAutoFillType2 = new com.paypal.oslo.feature.onboarding.signup.phone.domain.model.PhoneAutoFillType("ANDROID", 1);
        ANDROID = phoneAutoFillType2;
        com.paypal.oslo.feature.onboarding.signup.phone.domain.model.PhoneAutoFillType phoneAutoFillType3 = new com.paypal.oslo.feature.onboarding.signup.phone.domain.model.PhoneAutoFillType("UNKNOWN", 2);
        UNKNOWN = phoneAutoFillType3;
        com.paypal.oslo.feature.onboarding.signup.phone.domain.model.PhoneAutoFillType[] phoneAutoFillTypeArr = {phoneAutoFillType, phoneAutoFillType2, phoneAutoFillType3};
        Camera2StreamConfigurationMap = phoneAutoFillTypeArr;
        getHighResolutionOutputSizeshNQ4ISI = kotlin.enums.EnumEntriesKt.enumEntries(phoneAutoFillTypeArr);
    }

    public static com.paypal.oslo.feature.onboarding.signup.phone.domain.model.PhoneAutoFillType[] values() {
        return (com.paypal.oslo.feature.onboarding.signup.phone.domain.model.PhoneAutoFillType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.onboarding.signup.phone.domain.model.PhoneAutoFillType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.onboarding.signup.phone.domain.model.PhoneAutoFillType) java.lang.Enum.valueOf(com.paypal.oslo.feature.onboarding.signup.phone.domain.model.PhoneAutoFillType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.onboarding.signup.phone.domain.model.PhoneAutoFillType> getEntries() {
        return getHighResolutionOutputSizeshNQ4ISI;
    }
}
