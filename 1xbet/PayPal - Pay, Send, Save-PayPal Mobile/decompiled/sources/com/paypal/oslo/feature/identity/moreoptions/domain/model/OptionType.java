package com.paypal.oslo.feature.identity.moreoptions.domain.model;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0014\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015"}, d2 = {"Lcom/paypal/oslo/feature/identity/moreoptions/domain/model/OptionType;", "", "<init>", "(Ljava/lang/String;I)V", "TEXT_NEW_CODE", "USE_DIFFERENT_NUMBER", "USE_FACE_ID", "USE_TOUCH_ID", "USE_PASSKEY", "TEXT_A_CODE", "IVR", "USE_PASSWORD", "EMAIL_CODE", "USE_DIFFERENT_EMAIL", "SEND_WHATSAPP_CODE", "USE_AUTHENTICATOR_APP", "ANSWER_SECURITY_QUESTIONS", "VERIFY_CREDIT_CARD", "USE_DIFFERENT_CARD", "SILENT_AUTH", "CREATE_NEW_PASSWORD", "USE_BIOMETRIC"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class OptionType {
    public static final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType ANSWER_SECURITY_QUESTIONS;
    public static final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType CREATE_NEW_PASSWORD;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType EMAIL_CODE;
    public static final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType IVR;
    public static final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType SEND_WHATSAPP_CODE;
    public static final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType SILENT_AUTH;
    public static final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType TEXT_A_CODE;
    public static final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType TEXT_NEW_CODE;
    public static final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType USE_AUTHENTICATOR_APP;
    public static final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType USE_BIOMETRIC;
    public static final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType USE_DIFFERENT_CARD;
    public static final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType USE_DIFFERENT_EMAIL;
    public static final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType USE_DIFFERENT_NUMBER;
    public static final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType USE_FACE_ID;
    public static final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType USE_PASSKEY;
    public static final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType USE_PASSWORD;
    public static final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType USE_TOUCH_ID;
    public static final com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType VERIFY_CREDIT_CARD;
    private static final /* synthetic */ com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType[] getHighSpeedVideoFpsRanges;

    private OptionType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType = new com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType("TEXT_NEW_CODE", 0);
        TEXT_NEW_CODE = optionType;
        com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType2 = new com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType("USE_DIFFERENT_NUMBER", 1);
        USE_DIFFERENT_NUMBER = optionType2;
        com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType3 = new com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType("USE_FACE_ID", 2);
        USE_FACE_ID = optionType3;
        com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType4 = new com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType("USE_TOUCH_ID", 3);
        USE_TOUCH_ID = optionType4;
        com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType5 = new com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType("USE_PASSKEY", 4);
        USE_PASSKEY = optionType5;
        com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType6 = new com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType("TEXT_A_CODE", 5);
        TEXT_A_CODE = optionType6;
        com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType7 = new com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType("IVR", 6);
        IVR = optionType7;
        com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType8 = new com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType("USE_PASSWORD", 7);
        USE_PASSWORD = optionType8;
        com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType9 = new com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType("EMAIL_CODE", 8);
        EMAIL_CODE = optionType9;
        com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType10 = new com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType("USE_DIFFERENT_EMAIL", 9);
        USE_DIFFERENT_EMAIL = optionType10;
        com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType11 = new com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType("SEND_WHATSAPP_CODE", 10);
        SEND_WHATSAPP_CODE = optionType11;
        com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType12 = new com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType("USE_AUTHENTICATOR_APP", 11);
        USE_AUTHENTICATOR_APP = optionType12;
        com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType13 = new com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType("ANSWER_SECURITY_QUESTIONS", 12);
        ANSWER_SECURITY_QUESTIONS = optionType13;
        com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType14 = new com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType("VERIFY_CREDIT_CARD", 13);
        VERIFY_CREDIT_CARD = optionType14;
        com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType15 = new com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType("USE_DIFFERENT_CARD", 14);
        USE_DIFFERENT_CARD = optionType15;
        com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType16 = new com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType("SILENT_AUTH", 15);
        SILENT_AUTH = optionType16;
        com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType17 = new com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType("CREATE_NEW_PASSWORD", 16);
        CREATE_NEW_PASSWORD = optionType17;
        com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType optionType18 = new com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType("USE_BIOMETRIC", 17);
        USE_BIOMETRIC = optionType18;
        com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType[] optionTypeArr = {optionType, optionType2, optionType3, optionType4, optionType5, optionType6, optionType7, optionType8, optionType9, optionType10, optionType11, optionType12, optionType13, optionType14, optionType15, optionType16, optionType17, optionType18};
        getHighSpeedVideoFpsRanges = optionTypeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(optionTypeArr);
    }

    public static com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType[] values() {
        return (com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType) java.lang.Enum.valueOf(com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.identity.moreoptions.domain.model.OptionType> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
