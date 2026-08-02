package com.paypal.oslo.feature.onboarding.signup.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0010\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011"}, d2 = {"Lcom/paypal/oslo/feature/onboarding/signup/domain/model/SignupFieldType;", "", "<init>", "(Ljava/lang/String;I)V", "HEADER", "SUBHEADER", "EMAIL", "PHONE", "ADDRESS_LINE1", "ADDRESS_LINE2", "ADDRESS_LINE3", "ADMIN_AREA1", "ADMIN_AREA2", com.google.android.gms.maps.model.FeatureType.POSTAL_CODE, "COMPRESSED_ADDRESS", "FIRST_NAME", "LAST_NAME", "DROPDOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SignupFieldType {
    public static final com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType ADDRESS_LINE1;
    public static final com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType ADDRESS_LINE2;
    public static final com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType ADDRESS_LINE3;
    public static final com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType ADMIN_AREA1;
    public static final com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType ADMIN_AREA2;
    public static final com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType COMPRESSED_ADDRESS;
    public static final com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType DROPDOWN;
    public static final com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType EMAIL;
    public static final com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType FIRST_NAME;
    public static final com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType HEADER;
    public static final com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType LAST_NAME;
    public static final com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType PHONE;
    public static final com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType POSTAL_CODE;
    public static final com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType SUBHEADER;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;
    private static final /* synthetic */ com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType[] getHighSpeedVideoSizes;

    private SignupFieldType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType signupFieldType = new com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType("HEADER", 0);
        HEADER = signupFieldType;
        com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType signupFieldType2 = new com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType("SUBHEADER", 1);
        SUBHEADER = signupFieldType2;
        com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType signupFieldType3 = new com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType("EMAIL", 2);
        EMAIL = signupFieldType3;
        com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType signupFieldType4 = new com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType("PHONE", 3);
        PHONE = signupFieldType4;
        com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType signupFieldType5 = new com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType("ADDRESS_LINE1", 4);
        ADDRESS_LINE1 = signupFieldType5;
        com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType signupFieldType6 = new com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType("ADDRESS_LINE2", 5);
        ADDRESS_LINE2 = signupFieldType6;
        com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType signupFieldType7 = new com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType("ADDRESS_LINE3", 6);
        ADDRESS_LINE3 = signupFieldType7;
        com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType signupFieldType8 = new com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType("ADMIN_AREA1", 7);
        ADMIN_AREA1 = signupFieldType8;
        com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType signupFieldType9 = new com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType("ADMIN_AREA2", 8);
        ADMIN_AREA2 = signupFieldType9;
        com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType signupFieldType10 = new com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType(com.google.android.gms.maps.model.FeatureType.POSTAL_CODE, 9);
        POSTAL_CODE = signupFieldType10;
        com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType signupFieldType11 = new com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType("COMPRESSED_ADDRESS", 10);
        COMPRESSED_ADDRESS = signupFieldType11;
        com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType signupFieldType12 = new com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType("FIRST_NAME", 11);
        FIRST_NAME = signupFieldType12;
        com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType signupFieldType13 = new com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType("LAST_NAME", 12);
        LAST_NAME = signupFieldType13;
        com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType signupFieldType14 = new com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType("DROPDOWN", 13);
        DROPDOWN = signupFieldType14;
        com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType[] signupFieldTypeArr = {signupFieldType, signupFieldType2, signupFieldType3, signupFieldType4, signupFieldType5, signupFieldType6, signupFieldType7, signupFieldType8, signupFieldType9, signupFieldType10, signupFieldType11, signupFieldType12, signupFieldType13, signupFieldType14};
        getHighSpeedVideoSizes = signupFieldTypeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(signupFieldTypeArr);
    }

    public static com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType[] values() {
        return (com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType[]) getHighSpeedVideoSizes.clone();
    }

    public static com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType) java.lang.Enum.valueOf(com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.onboarding.signup.domain.model.SignupFieldType> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
