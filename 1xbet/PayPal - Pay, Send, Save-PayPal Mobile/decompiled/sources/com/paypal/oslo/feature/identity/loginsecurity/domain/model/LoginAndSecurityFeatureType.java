package com.paypal.oslo.feature.identity.loginsecurity.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/identity/loginsecurity/domain/model/LoginAndSecurityFeatureType;", "", "<init>", "(Ljava/lang/String;I)V", "FACE_ID", "TOUCH_ID", "EXTEND_LOGIN_SESSION", "PASSKEY"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class LoginAndSecurityFeatureType {
    public static final com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType EXTEND_LOGIN_SESSION;
    public static final com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType FACE_ID;
    public static final com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType PASSKEY;
    public static final com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType TOUCH_ID;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType[] getHighResolutionOutputSizeshNQ4ISI;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private LoginAndSecurityFeatureType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType loginAndSecurityFeatureType = new com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType("FACE_ID", 0);
        FACE_ID = loginAndSecurityFeatureType;
        com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType loginAndSecurityFeatureType2 = new com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType("TOUCH_ID", 1);
        TOUCH_ID = loginAndSecurityFeatureType2;
        com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType loginAndSecurityFeatureType3 = new com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType("EXTEND_LOGIN_SESSION", 2);
        EXTEND_LOGIN_SESSION = loginAndSecurityFeatureType3;
        com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType loginAndSecurityFeatureType4 = new com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType("PASSKEY", 3);
        PASSKEY = loginAndSecurityFeatureType4;
        com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType[] loginAndSecurityFeatureTypeArr = {loginAndSecurityFeatureType, loginAndSecurityFeatureType2, loginAndSecurityFeatureType3, loginAndSecurityFeatureType4};
        getHighResolutionOutputSizeshNQ4ISI = loginAndSecurityFeatureTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(loginAndSecurityFeatureTypeArr);
    }

    public static com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType[] values() {
        return (com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType[]) getHighResolutionOutputSizeshNQ4ISI.clone();
    }

    public static com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.loginsecurity.domain.model.LoginAndSecurityFeatureType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
