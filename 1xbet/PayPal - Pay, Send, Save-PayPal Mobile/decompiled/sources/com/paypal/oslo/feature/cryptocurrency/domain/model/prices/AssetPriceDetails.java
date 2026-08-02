package com.paypal.oslo.feature.cryptocurrency.domain.model.prices;

@kotlin.Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\b\u0086\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0012J\u0010\u0010\u0017\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0012J\u0010\u0010\u001c\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJl\u0010\u001e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010(\u001a\u0004\b*\u0010\u0012R\u001a\u0010\u0006\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010+\u001a\u0004\b,\u0010\u0015R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b-\u0010\u0012R\u001a\u0010\b\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b.\u0010\u0015R\u001a\u0010\t\u001a\u00020\u00058\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b/\u0010\u0015R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u001aR\u001a\u0010\f\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010(\u001a\u0004\b2\u0010\u0012R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00103\u001a\u0004\b4\u0010\u001d"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/AssetPriceDetails;", "", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "assetName", "", "currentPrice", "currencyCode", "priceChange24h", "priceChangePercent24h", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoPriceMovementIndicator;", "priceMovementIndicator", "logoUrl", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/capabilities/AssetCapabilities;", "assetCapabilities", "<init>", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;DDLcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoPriceMovementIndicator;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/capabilities/AssetCapabilities;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()D", "component4", "component5", "component6", "component7", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoPriceMovementIndicator;", "component8", "component9", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/capabilities/AssetCapabilities;", "copy", "(Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;DDLcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoPriceMovementIndicator;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/capabilities/AssetCapabilities;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/AssetPriceDetails;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAssetSymbol", "getAssetName", "D", "getCurrentPrice", "getCurrencyCode", "getPriceChange24h", "getPriceChangePercent24h", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoPriceMovementIndicator;", "getPriceMovementIndicator", "getLogoUrl", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/capabilities/AssetCapabilities;", "getAssetCapabilities"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AssetPriceDetails {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.AssetCapabilities assetCapabilities;
    private final java.lang.String assetName;
    private final java.lang.String assetSymbol;
    private final java.lang.String currencyCode;
    private final double currentPrice;
    private final java.lang.String logoUrl;
    private final double priceChange24h;
    private final double priceChangePercent24h;
    private final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator priceMovementIndicator;

    public AssetPriceDetails(java.lang.String str, java.lang.String str2, double d, java.lang.String str3, double d2, double d3, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator cryptoPriceMovementIndicator, java.lang.String str4, com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.AssetCapabilities assetCapabilities) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetCapabilities, "");
        this.assetSymbol = str;
        this.assetName = str2;
        this.currentPrice = d;
        this.currencyCode = str3;
        this.priceChange24h = d2;
        this.priceChangePercent24h = d3;
        this.priceMovementIndicator = cryptoPriceMovementIndicator;
        this.logoUrl = str4;
        this.assetCapabilities = assetCapabilities;
    }

    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    public final java.lang.String getAssetName() {
        return this.assetName;
    }

    public final double getCurrentPrice() {
        return this.currentPrice;
    }

    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    public final double getPriceChange24h() {
        return this.priceChange24h;
    }

    public final double getPriceChangePercent24h() {
        return this.priceChangePercent24h;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator getPriceMovementIndicator() {
        return this.priceMovementIndicator;
    }

    public final java.lang.String getLogoUrl() {
        return this.logoUrl;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.AssetCapabilities getAssetCapabilities() {
        return this.assetCapabilities;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.assetSymbol;
        java.lang.String str2 = this.assetName;
        double d = this.currentPrice;
        java.lang.String str3 = this.currencyCode;
        double d2 = this.priceChange24h;
        double d3 = this.priceChangePercent24h;
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator cryptoPriceMovementIndicator = this.priceMovementIndicator;
        java.lang.String str4 = this.logoUrl;
        com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.AssetCapabilities assetCapabilities = this.assetCapabilities;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("AssetPriceDetails(assetSymbol=");
        sb.append(str);
        sb.append(", assetName=");
        sb.append(str2);
        sb.append(", currentPrice=");
        sb.append(d);
        sb.append(", currencyCode=");
        sb.append(str3);
        sb.append(", priceChange24h=");
        sb.append(d2);
        sb.append(", priceChangePercent24h=");
        sb.append(d3);
        sb.append(", priceMovementIndicator=");
        sb.append(cryptoPriceMovementIndicator);
        sb.append(", logoUrl=");
        sb.append(str4);
        sb.append(", assetCapabilities=");
        sb.append(assetCapabilities);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.assetSymbol.hashCode();
        int hashCode2 = this.assetName.hashCode();
        int hashCode3 = java.lang.Double.hashCode(this.currentPrice);
        int hashCode4 = this.currencyCode.hashCode();
        int hashCode5 = java.lang.Double.hashCode(this.priceChange24h);
        int hashCode6 = java.lang.Double.hashCode(this.priceChangePercent24h);
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator cryptoPriceMovementIndicator = this.priceMovementIndicator;
        return (((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + (cryptoPriceMovementIndicator == null ? 0 : cryptoPriceMovementIndicator.hashCode())) * 31) + this.logoUrl.hashCode()) * 31) + this.assetCapabilities.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceDetails)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceDetails assetPriceDetails = (com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceDetails) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, assetPriceDetails.assetSymbol) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetName, assetPriceDetails.assetName) && java.lang.Double.compare(this.currentPrice, assetPriceDetails.currentPrice) == 0 && kotlin.jvm.internal.Intrinsics.areEqual(this.currencyCode, assetPriceDetails.currencyCode) && java.lang.Double.compare(this.priceChange24h, assetPriceDetails.priceChange24h) == 0 && java.lang.Double.compare(this.priceChangePercent24h, assetPriceDetails.priceChangePercent24h) == 0 && this.priceMovementIndicator == assetPriceDetails.priceMovementIndicator && kotlin.jvm.internal.Intrinsics.areEqual(this.logoUrl, assetPriceDetails.logoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetCapabilities, assetPriceDetails.assetCapabilities);
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceDetails copy(java.lang.String assetSymbol, java.lang.String assetName, double currentPrice, java.lang.String currencyCode, double priceChange24h, double priceChangePercent24h, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator priceMovementIndicator, java.lang.String logoUrl, com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.AssetCapabilities assetCapabilities) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(currencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logoUrl, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetCapabilities, "");
        return new com.paypal.oslo.feature.cryptocurrency.domain.model.prices.AssetPriceDetails(assetSymbol, assetName, currentPrice, currencyCode, priceChange24h, priceChangePercent24h, priceMovementIndicator, logoUrl, assetCapabilities);
    }

    /* renamed from: component9, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.model.capabilities.AssetCapabilities getAssetCapabilities() {
        return this.assetCapabilities;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getLogoUrl() {
        return this.logoUrl;
    }

    /* renamed from: component7, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator getPriceMovementIndicator() {
        return this.priceMovementIndicator;
    }

    /* renamed from: component6, reason: from getter */
    public final double getPriceChangePercent24h() {
        return this.priceChangePercent24h;
    }

    /* renamed from: component5, reason: from getter */
    public final double getPriceChange24h() {
        return this.priceChange24h;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getCurrencyCode() {
        return this.currencyCode;
    }

    /* renamed from: component3, reason: from getter */
    public final double getCurrentPrice() {
        return this.currentPrice;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAssetName() {
        return this.assetName;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }
}
