package com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000f\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010"}, d2 = {"Lcom/paypal/oslo/feature/identity/passkey/login/challenge/domain/model/ChallengeType;", "", "<init>", "(Ljava/lang/String;I)V", "PASSWORD", "ONE_TIME_PASSWORD", "PASSKEY", "STEP_UP", "TWO_FACTOR_AUTH", "BIOMETRIC", "USER_PREVIEW", "VERIFY_CREDENTIAL", "PASSKEY_REQUEST_OPTION", "ONE_TIME_PASSWORD_GENERATE_CODE", "NOTIFY_STEP_UP", "VALIDATE_STEP_UP", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ChallengeType {
    public static final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType BIOMETRIC;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType NOTIFY_STEP_UP;
    public static final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType ONE_TIME_PASSWORD;
    public static final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType ONE_TIME_PASSWORD_GENERATE_CODE;
    public static final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType PASSKEY;
    public static final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType PASSKEY_REQUEST_OPTION;
    public static final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType PASSWORD;
    public static final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType STEP_UP;
    public static final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType TWO_FACTOR_AUTH;
    public static final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType UNKNOWN;
    public static final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType USER_PREVIEW;
    public static final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType VALIDATE_STEP_UP;
    public static final com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType VERIFY_CREDENTIAL;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType[] getHighSpeedVideoFpsRanges;

    private ChallengeType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType challengeType = new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType("PASSWORD", 0);
        PASSWORD = challengeType;
        com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType challengeType2 = new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType("ONE_TIME_PASSWORD", 1);
        ONE_TIME_PASSWORD = challengeType2;
        com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType challengeType3 = new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType("PASSKEY", 2);
        PASSKEY = challengeType3;
        com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType challengeType4 = new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType("STEP_UP", 3);
        STEP_UP = challengeType4;
        com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType challengeType5 = new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType("TWO_FACTOR_AUTH", 4);
        TWO_FACTOR_AUTH = challengeType5;
        com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType challengeType6 = new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType("BIOMETRIC", 5);
        BIOMETRIC = challengeType6;
        com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType challengeType7 = new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType("USER_PREVIEW", 6);
        USER_PREVIEW = challengeType7;
        com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType challengeType8 = new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType("VERIFY_CREDENTIAL", 7);
        VERIFY_CREDENTIAL = challengeType8;
        com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType challengeType9 = new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType("PASSKEY_REQUEST_OPTION", 8);
        PASSKEY_REQUEST_OPTION = challengeType9;
        com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType challengeType10 = new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType("ONE_TIME_PASSWORD_GENERATE_CODE", 9);
        ONE_TIME_PASSWORD_GENERATE_CODE = challengeType10;
        com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType challengeType11 = new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType("NOTIFY_STEP_UP", 10);
        NOTIFY_STEP_UP = challengeType11;
        com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType challengeType12 = new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType("VALIDATE_STEP_UP", 11);
        VALIDATE_STEP_UP = challengeType12;
        com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType challengeType13 = new com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType("UNKNOWN", 12);
        UNKNOWN = challengeType13;
        com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType[] challengeTypeArr = {challengeType, challengeType2, challengeType3, challengeType4, challengeType5, challengeType6, challengeType7, challengeType8, challengeType9, challengeType10, challengeType11, challengeType12, challengeType13};
        getHighSpeedVideoFpsRanges = challengeTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(challengeTypeArr);
    }

    public static com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType[] values() {
        return (com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.passkey.login.challenge.domain.model.ChallengeType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
