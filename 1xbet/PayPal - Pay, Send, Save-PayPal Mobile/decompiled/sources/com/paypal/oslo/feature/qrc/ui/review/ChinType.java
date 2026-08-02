package com.paypal.oslo.feature.qrc.ui.review;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lcom/paypal/oslo/feature/qrc/ui/review/ChinType;", "", "<init>", "(Ljava/lang/String;I)V", "UsePPBalance", "PPBalanceApplied", "PPBalanceAvailable", "Total"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class ChinType {
    private static final /* synthetic */ com.paypal.oslo.feature.qrc.ui.review.ChinType[] Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.qrc.ui.review.ChinType PPBalanceApplied;
    public static final com.paypal.oslo.feature.qrc.ui.review.ChinType PPBalanceAvailable;
    public static final com.paypal.oslo.feature.qrc.ui.review.ChinType Total;
    public static final com.paypal.oslo.feature.qrc.ui.review.ChinType UsePPBalance;
    private static final /* synthetic */ kotlin.enums.EnumEntries getHighSpeedVideoFpsRangesFor;

    private ChinType(java.lang.String str, int i) {
    }

    static {
        com.paypal.oslo.feature.qrc.ui.review.ChinType chinType = new com.paypal.oslo.feature.qrc.ui.review.ChinType("UsePPBalance", 0);
        UsePPBalance = chinType;
        com.paypal.oslo.feature.qrc.ui.review.ChinType chinType2 = new com.paypal.oslo.feature.qrc.ui.review.ChinType("PPBalanceApplied", 1);
        PPBalanceApplied = chinType2;
        com.paypal.oslo.feature.qrc.ui.review.ChinType chinType3 = new com.paypal.oslo.feature.qrc.ui.review.ChinType("PPBalanceAvailable", 2);
        PPBalanceAvailable = chinType3;
        com.paypal.oslo.feature.qrc.ui.review.ChinType chinType4 = new com.paypal.oslo.feature.qrc.ui.review.ChinType("Total", 3);
        Total = chinType4;
        com.paypal.oslo.feature.qrc.ui.review.ChinType[] chinTypeArr = {chinType, chinType2, chinType3, chinType4};
        Camera2StreamConfigurationMap = chinTypeArr;
        getHighSpeedVideoFpsRangesFor = kotlin.enums.EnumEntriesKt.enumEntries(chinTypeArr);
    }

    public static com.paypal.oslo.feature.qrc.ui.review.ChinType[] values() {
        return (com.paypal.oslo.feature.qrc.ui.review.ChinType[]) Camera2StreamConfigurationMap.clone();
    }

    public static com.paypal.oslo.feature.qrc.ui.review.ChinType valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.qrc.ui.review.ChinType) java.lang.Enum.valueOf(com.paypal.oslo.feature.qrc.ui.review.ChinType.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.qrc.ui.review.ChinType> getEntries() {
        return getHighSpeedVideoFpsRangesFor;
    }
}
