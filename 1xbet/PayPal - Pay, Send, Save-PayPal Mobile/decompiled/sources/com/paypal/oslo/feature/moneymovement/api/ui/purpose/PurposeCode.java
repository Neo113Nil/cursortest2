package com.paypal.oslo.feature.moneymovement.api.ui.purpose;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u000b\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/purpose/PurposeCode;", "", "<init>", "(Ljava/lang/String;I)V", "BILLS_AND_UTILITIES", "EDUCATION", "ENTERTAINMENT_AND_GAMES", "FOOD_AND_DRINKS", "HEALTHCARE", "PURCHASE_OF_GENERAL_MERCHANDISE", "TRANSPORT", "TRAVEL_AND_ACCOMMODATION", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class PurposeCode {
    public static final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode BILLS_AND_UTILITIES;
    private static final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode EDUCATION;
    public static final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode ENTERTAINMENT_AND_GAMES;
    public static final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode FOOD_AND_DRINKS;
    public static final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode HEALTHCARE;
    public static final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode PURCHASE_OF_GENERAL_MERCHANDISE;
    public static final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode TRANSPORT;
    public static final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode TRAVEL_AND_ACCOMMODATION;
    public static final com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode UNKNOWN;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRanges;

    private PurposeCode(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode purposeCode = new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode("BILLS_AND_UTILITIES", 0);
        BILLS_AND_UTILITIES = purposeCode;
        com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode purposeCode2 = new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode("EDUCATION", 1);
        EDUCATION = purposeCode2;
        com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode purposeCode3 = new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode("ENTERTAINMENT_AND_GAMES", 2);
        ENTERTAINMENT_AND_GAMES = purposeCode3;
        com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode purposeCode4 = new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode("FOOD_AND_DRINKS", 3);
        FOOD_AND_DRINKS = purposeCode4;
        com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode purposeCode5 = new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode("HEALTHCARE", 4);
        HEALTHCARE = purposeCode5;
        com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode purposeCode6 = new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode("PURCHASE_OF_GENERAL_MERCHANDISE", 5);
        PURCHASE_OF_GENERAL_MERCHANDISE = purposeCode6;
        com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode purposeCode7 = new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode("TRANSPORT", 6);
        TRANSPORT = purposeCode7;
        com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode purposeCode8 = new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode("TRAVEL_AND_ACCOMMODATION", 7);
        TRAVEL_AND_ACCOMMODATION = purposeCode8;
        com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode purposeCode9 = new com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode("UNKNOWN", 8);
        UNKNOWN = purposeCode9;
        com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode[] purposeCodeArr = {purposeCode, purposeCode2, purposeCode3, purposeCode4, purposeCode5, purposeCode6, purposeCode7, purposeCode8, purposeCode9};
        Camera2StreamConfigurationMap = purposeCodeArr;
        getHighSpeedVideoFpsRanges = kotlin.enums.EnumEntriesKt.enumEntries(purposeCodeArr);
    }

    public static com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode[] values() {
        return (com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode) java.lang.Enum.valueOf(com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.moneymovement.api.ui.purpose.PurposeCode> getEntries() {
        return getHighSpeedVideoFpsRanges;
    }
}
