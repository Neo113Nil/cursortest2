package com.paypal.oslo.feature.cryptocurrency.domain.model.prices;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\rJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J>\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00022\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001c\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b \u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b!\u0010\rR \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\"\u001a\u0004\b#\u0010\u0012"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/AssetPriceHistory;", "", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/PriceTimeRange;", "timeRange", "currencyCode", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/PriceDataPoint;", "dataPoints", "<init>", "(Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/PriceTimeRange;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/PriceTimeRange;", "component3", "component4", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/PriceTimeRange;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/AssetPriceHistory;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAssetSymbol", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/PriceTimeRange;", "getTimeRange", "getCurrencyCode", "Ljava/util/List;", "getDataPoints"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AssetPriceHistory {
    public static final int $stable = 8;
    private final java.lang.String assetSymbol;
    private final java.lang.String currencyCode;
    private final java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceDataPoint> dataPoints;
    private final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange timeRange;

    public AssetPriceHistory(java.lang.String str, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange, java.lang.String str2, java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceDataPoint> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(priceTimeRange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        this.assetSymbol = str;
        this.timeRange = priceTimeRange;
        this.currencyCode = str2;
        this.dataPoints = list;
    }

    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange getTimeRange() {
        return this.timeRange;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceDataPoint> getDataPoints() {
        return this.dataPoints;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.assetSymbol;
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange = this.timeRange;
        java.lang.String str2 = this.currencyCode;
        java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceDataPoint> list = this.dataPoints;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AssetPriceHistory(assetSymbol=");
        sb.append(str);
        sb.append(", timeRange=");
        sb.append(priceTimeRange);
        sb.append(", currencyCode=");
        sb.append(str2);
        sb.append(", dataPoints=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((this.assetSymbol.hashCode() * 31) + this.timeRange.hashCode()) * 31) + this.currencyCode.hashCode()) * 31) + this.dataPoints.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceHistory)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceHistory assetPriceHistory = (com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceHistory) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, assetPriceHistory.assetSymbol) && this.timeRange == assetPriceHistory.timeRange && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, assetPriceHistory.currencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.dataPoints, assetPriceHistory.dataPoints);
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceHistory copy(java.lang.String assetSymbol, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange timeRange, java.lang.String currencyCode, java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceDataPoint> dataPoints) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timeRange, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dataPoints, "");
        return new com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceHistory(assetSymbol, timeRange, currencyCode, dataPoints);
    }

    public final java.util.List<com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceDataPoint> component4() {
        return this.dataPoints;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange getTimeRange() {
        return this.timeRange;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceHistory copy$default(com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceHistory assetPriceHistory, java.lang.String str, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.PriceTimeRange priceTimeRange, java.lang.String str2, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            str = assetPriceHistory.assetSymbol;
        }
        if ((i & 2) != 0) {
            priceTimeRange = assetPriceHistory.timeRange;
        }
        if ((i & 4) != 0) {
            str2 = assetPriceHistory.currencyCode;
        }
        if ((i & 8) != 0) {
            list = assetPriceHistory.dataPoints;
        }
        return assetPriceHistory.copy(str, priceTimeRange, str2, list);
    }
}
