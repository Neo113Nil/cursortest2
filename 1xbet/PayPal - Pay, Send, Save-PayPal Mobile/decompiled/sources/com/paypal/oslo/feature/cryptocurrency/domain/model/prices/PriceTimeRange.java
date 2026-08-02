package com.paypal.oslo.feature.cryptocurrency.domain.model.prices;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\r\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/PriceTimeRange;", "", "", "p0", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "displayName", "Ljava/lang/String;", "getDisplayName", "()Ljava/lang/String;", "DAY_24H", "WEEK_1W", "MONTH_1M", "MONTH_6M", "YEAR_1Y", "ALL"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PriceTimeRange {
    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange ALL;
    private static final /* synthetic */ kotlin.enums.EnumEntries Camera2StreamConfigurationMap;
    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange DAY_24H;
    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange MONTH_1M;
    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange MONTH_6M;
    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange WEEK_1W;
    public static final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange YEAR_1Y;
    private static final /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange[] getHighSpeedVideoFpsRanges;
    private final java.lang.String displayName;

    private PriceTimeRange(java.lang.String str, int i, java.lang.String str2) {
        this.displayName = str2;
    }

    public final java.lang.String getDisplayName() {
        return this.displayName;
    }

    static {
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange = new com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange("DAY_24H", 0, "24H");
        DAY_24H = priceTimeRange;
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange2 = new com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange("WEEK_1W", 1, "1W");
        WEEK_1W = priceTimeRange2;
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange3 = new com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange("MONTH_1M", 2, "1M");
        MONTH_1M = priceTimeRange3;
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange4 = new com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange("MONTH_6M", 3, "6M");
        MONTH_6M = priceTimeRange4;
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange5 = new com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange("YEAR_1Y", 4, "1Y");
        YEAR_1Y = priceTimeRange5;
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange6 = new com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange("ALL", 5, "ALL");
        ALL = priceTimeRange6;
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange[] priceTimeRangeArr = {priceTimeRange, priceTimeRange2, priceTimeRange3, priceTimeRange4, priceTimeRange5, priceTimeRange6};
        getHighSpeedVideoFpsRanges = priceTimeRangeArr;
        Camera2StreamConfigurationMap = kotlin.enums.EnumEntriesKt.enumEntries(priceTimeRangeArr);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange[] values() {
        return (com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange[]) getHighSpeedVideoFpsRanges.clone();
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange valueOf(java.lang.String str) {
        return (com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange) java.lang.Enum.valueOf(com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange.class, str);
    }

    public static kotlin.enums.EnumEntries<com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange> getEntries() {
        return Camera2StreamConfigurationMap;
    }
}
