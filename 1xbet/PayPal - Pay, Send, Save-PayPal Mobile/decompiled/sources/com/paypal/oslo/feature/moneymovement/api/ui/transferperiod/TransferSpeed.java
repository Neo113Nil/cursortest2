package com.paypal.oslo.feature.moneymovement.api.ui.transferperiod;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/paypal/oslo/feature/moneymovement/api/ui/transferperiod/TransferSpeed;", "", "<init>", "(Ljava/lang/String;I)V", "INSTANT", "WITHIN_MINUTES", "WITHIN_AN_HOUR", "SAME_DAY", "ONE_TO_THREE_DAYS", "TWO_TO_THREE_DAYS", "THREE_TO_FIVE_DAYS", "UNKNOWN"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class TransferSpeed {
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed INSTANT;
    public static final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed ONE_TO_THREE_DAYS;
    public static final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed SAME_DAY;
    public static final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed THREE_TO_FIVE_DAYS;
    public static final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed TWO_TO_THREE_DAYS;
    public static final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed UNKNOWN;
    public static final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed WITHIN_AN_HOUR;
    public static final com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed WITHIN_MINUTES;
    private static final /* synthetic */ com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed[] getHighSpeedVideoFpsRangesFor;

    private TransferSpeed(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed transferSpeed = new com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed("INSTANT", 0);
        INSTANT = transferSpeed;
        com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed transferSpeed2 = new com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed("WITHIN_MINUTES", 1);
        WITHIN_MINUTES = transferSpeed2;
        com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed transferSpeed3 = new com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed("WITHIN_AN_HOUR", 2);
        WITHIN_AN_HOUR = transferSpeed3;
        com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed transferSpeed4 = new com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed("SAME_DAY", 3);
        SAME_DAY = transferSpeed4;
        com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed transferSpeed5 = new com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed("ONE_TO_THREE_DAYS", 4);
        ONE_TO_THREE_DAYS = transferSpeed5;
        com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed transferSpeed6 = new com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed("TWO_TO_THREE_DAYS", 5);
        TWO_TO_THREE_DAYS = transferSpeed6;
        com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed transferSpeed7 = new com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed("THREE_TO_FIVE_DAYS", 6);
        THREE_TO_FIVE_DAYS = transferSpeed7;
        com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed transferSpeed8 = new com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed("UNKNOWN", 7);
        UNKNOWN = transferSpeed8;
        com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed[] transferSpeedArr = {transferSpeed, transferSpeed2, transferSpeed3, transferSpeed4, transferSpeed5, transferSpeed6, transferSpeed7, transferSpeed8};
        getHighSpeedVideoFpsRangesFor = transferSpeedArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(transferSpeedArr);
    }

    public static com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed[] values() {
        return (com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed[]) getHighSpeedVideoFpsRangesFor.clone();
    }

    public static com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed) java.lang.Enum.valueOf(com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.moneymovement.api.ui.transferperiod.TransferSpeed> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
