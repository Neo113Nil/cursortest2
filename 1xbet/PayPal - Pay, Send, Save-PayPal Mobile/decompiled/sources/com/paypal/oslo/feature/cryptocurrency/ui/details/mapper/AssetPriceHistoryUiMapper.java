package com.paypal.oslo.feature.cryptocurrency.ui.details.mapper;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/mapper/AssetPriceHistoryUiMapper;", "", "<init>", "()V", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/AssetPriceHistory;", "assetPriceHistory", "Lcom/paypal/oslo/core/commonui/components/chart/TimeSeriesData;", "map", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/AssetPriceHistory;)Lcom/paypal/oslo/core/commonui/components/chart/TimeSeriesData;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AssetPriceHistoryUiMapper {
    public static final int $stable = 0;

    @javax.inject.Inject
    public AssetPriceHistoryUiMapper() {
    }

    public final com.paypal.oslo.core.commonui.components.chart.TimeSeriesData map(com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceHistory assetPriceHistory) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetPriceHistory, "");
        java.lang.String displayName = assetPriceHistory.getTimeRange().getDisplayName();
        java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceDataPoint> dataPoints = assetPriceHistory.getDataPoints();
        java.util.ArrayList arrayList = new java.util.ArrayList(kotlin.collections.CollectionsKt.collectionSizeOrDefault(dataPoints, 10));
        for (com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceDataPoint priceDataPoint : dataPoints) {
            arrayList.add(new com.paypal.oslo.core.commonui.components.chart.PriceDataPoint(priceDataPoint.getTimestamp(), priceDataPoint.getPrice()));
        }
        return new com.paypal.oslo.core.commonui.components.chart.TimeSeriesData(displayName, arrayList);
    }
}
