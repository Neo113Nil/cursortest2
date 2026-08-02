package com.paypal.oslo.feature.cryptocurrency.domain.model.holdings;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0016J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0016J\u0010\u0010\u001b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0010\u0010\u001c\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u0016J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b$\u0010%J\u009e\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020)2\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b*\u0010+J\u0010\u0010-\u001a\u00020,HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b/\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u00100\u001a\u0004\b2\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u00100\u001a\u0004\b3\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u00100\u001a\u0004\b4\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u00100\u001a\u0004\b5\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b6\u0010\u0016R\u001a\u0010\t\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b7\u0010\u0016R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b8\u0010\u0016R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b9\u0010\u0016R\u001c\u0010\r\u001a\u0004\u0018\u00010\f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010 R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b<\u0010\u0016R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010=\u001a\u0004\b>\u0010#R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010?\u001a\u0004\b@\u0010%"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHolding;", "", "", "assetName", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "assetQuantity", "fiatPriceValue", "fiatAmountCurrencyCode", "fiatAmountValue", "logoUrl", "gainOrLossAmount", "gainOrLossPercent", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoGainOrLossStatus;", "gainOrLossStatus", "priceMovementPercent", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoPriceMovementIndicator;", "priceMovementIndicator", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/PYUSDRewardHoldings;", "pyusdRewardHoldings", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoGainOrLossStatus;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoPriceMovementIndicator;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/PYUSDRewardHoldings;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoGainOrLossStatus;", "component11", "component12", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoPriceMovementIndicator;", "component13", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/PYUSDRewardHoldings;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoGainOrLossStatus;Ljava/lang/String;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoPriceMovementIndicator;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/PYUSDRewardHoldings;)Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHolding;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAssetName", "getAssetSymbol", "getAssetQuantity", "getFiatPriceValue", "getFiatAmountCurrencyCode", "getFiatAmountValue", "getLogoUrl", "getGainOrLossAmount", "getGainOrLossPercent", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoGainOrLossStatus;", "getGainOrLossStatus", "getPriceMovementPercent", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoPriceMovementIndicator;", "getPriceMovementIndicator", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/PYUSDRewardHoldings;", "getPyusdRewardHoldings"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoHolding {
    public static final int $stable = 0;
    private final java.lang.String assetName;
    private final java.lang.String assetQuantity;
    private final java.lang.String assetSymbol;
    private final java.lang.String fiatAmountCurrencyCode;
    private final java.lang.String fiatAmountValue;
    private final java.lang.String fiatPriceValue;
    private final java.lang.String gainOrLossAmount;
    private final java.lang.String gainOrLossPercent;
    private final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus gainOrLossStatus;
    private final java.lang.String logoUrl;
    private final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator priceMovementIndicator;
    private final java.lang.String priceMovementPercent;
    private final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.PYUSDRewardHoldings pyusdRewardHoldings;

    public CryptoHolding(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, java.lang.String str9, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus cryptoGainOrLossStatus, java.lang.String str10, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator cryptoPriceMovementIndicator, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.PYUSDRewardHoldings pYUSDRewardHoldings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str6, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str7, "");
        this.assetName = str;
        this.assetSymbol = str2;
        this.assetQuantity = str3;
        this.fiatPriceValue = str4;
        this.fiatAmountCurrencyCode = str5;
        this.fiatAmountValue = str6;
        this.logoUrl = str7;
        this.gainOrLossAmount = str8;
        this.gainOrLossPercent = str9;
        this.gainOrLossStatus = cryptoGainOrLossStatus;
        this.priceMovementPercent = str10;
        this.priceMovementIndicator = cryptoPriceMovementIndicator;
        this.pyusdRewardHoldings = pYUSDRewardHoldings;
    }

    public final java.lang.String getAssetName() {
        return this.assetName;
    }

    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    public final java.lang.String getAssetQuantity() {
        return this.assetQuantity;
    }

    public final java.lang.String getFiatPriceValue() {
        return this.fiatPriceValue;
    }

    public final java.lang.String getFiatAmountCurrencyCode() {
        return this.fiatAmountCurrencyCode;
    }

    public final java.lang.String getFiatAmountValue() {
        return this.fiatAmountValue;
    }

    public final java.lang.String getLogoUrl() {
        return this.logoUrl;
    }

    public final java.lang.String getGainOrLossAmount() {
        return this.gainOrLossAmount;
    }

    public final java.lang.String getGainOrLossPercent() {
        return this.gainOrLossPercent;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus getGainOrLossStatus() {
        return this.gainOrLossStatus;
    }

    public final java.lang.String getPriceMovementPercent() {
        return this.priceMovementPercent;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator getPriceMovementIndicator() {
        return this.priceMovementIndicator;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.PYUSDRewardHoldings getPyusdRewardHoldings() {
        return this.pyusdRewardHoldings;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.assetName;
        java.lang.String str2 = this.assetSymbol;
        java.lang.String str3 = this.assetQuantity;
        java.lang.String str4 = this.fiatPriceValue;
        java.lang.String str5 = this.fiatAmountCurrencyCode;
        java.lang.String str6 = this.fiatAmountValue;
        java.lang.String str7 = this.logoUrl;
        java.lang.String str8 = this.gainOrLossAmount;
        java.lang.String str9 = this.gainOrLossPercent;
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus cryptoGainOrLossStatus = this.gainOrLossStatus;
        java.lang.String str10 = this.priceMovementPercent;
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator cryptoPriceMovementIndicator = this.priceMovementIndicator;
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.PYUSDRewardHoldings pYUSDRewardHoldings = this.pyusdRewardHoldings;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoHolding(assetName=");
        sb.append(str);
        sb.append(", assetSymbol=");
        sb.append(str2);
        sb.append(", assetQuantity=");
        sb.append(str3);
        sb.append(", fiatPriceValue=");
        sb.append(str4);
        sb.append(", fiatAmountCurrencyCode=");
        sb.append(str5);
        sb.append(", fiatAmountValue=");
        sb.append(str6);
        sb.append(", logoUrl=");
        sb.append(str7);
        sb.append(", gainOrLossAmount=");
        sb.append(str8);
        sb.append(", gainOrLossPercent=");
        sb.append(str9);
        sb.append(", gainOrLossStatus=");
        sb.append(cryptoGainOrLossStatus);
        sb.append(", priceMovementPercent=");
        sb.append(str10);
        sb.append(", priceMovementIndicator=");
        sb.append(cryptoPriceMovementIndicator);
        sb.append(", pyusdRewardHoldings=");
        sb.append(pYUSDRewardHoldings);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.assetName.hashCode();
        int hashCode2 = this.assetSymbol.hashCode();
        int hashCode3 = this.assetQuantity.hashCode();
        int hashCode4 = this.fiatPriceValue.hashCode();
        int hashCode5 = this.fiatAmountCurrencyCode.hashCode();
        int hashCode6 = this.fiatAmountValue.hashCode();
        int hashCode7 = this.logoUrl.hashCode();
        java.lang.String str = this.gainOrLossAmount;
        int hashCode8 = str == null ? 0 : str.hashCode();
        java.lang.String str2 = this.gainOrLossPercent;
        int hashCode9 = str2 == null ? 0 : str2.hashCode();
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus cryptoGainOrLossStatus = this.gainOrLossStatus;
        int hashCode10 = cryptoGainOrLossStatus == null ? 0 : cryptoGainOrLossStatus.hashCode();
        java.lang.String str3 = this.priceMovementPercent;
        int hashCode11 = str3 == null ? 0 : str3.hashCode();
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator cryptoPriceMovementIndicator = this.priceMovementIndicator;
        int hashCode12 = cryptoPriceMovementIndicator == null ? 0 : cryptoPriceMovementIndicator.hashCode();
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.PYUSDRewardHoldings pYUSDRewardHoldings = this.pyusdRewardHoldings;
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + (pYUSDRewardHoldings != null ? pYUSDRewardHoldings.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding cryptoHolding = (com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.assetName, cryptoHolding.assetName) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, cryptoHolding.assetSymbol) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetQuantity, cryptoHolding.assetQuantity) && kotlin.jvm.internal.Intrinsics.areEqual(this.fiatPriceValue, cryptoHolding.fiatPriceValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.fiatAmountCurrencyCode, cryptoHolding.fiatAmountCurrencyCode) && kotlin.jvm.internal.Intrinsics.areEqual(this.fiatAmountValue, cryptoHolding.fiatAmountValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoUrl, cryptoHolding.logoUrl) && kotlin.jvm.internal.Intrinsics.areEqual(this.gainOrLossAmount, cryptoHolding.gainOrLossAmount) && kotlin.jvm.internal.Intrinsics.areEqual(this.gainOrLossPercent, cryptoHolding.gainOrLossPercent) && this.gainOrLossStatus == cryptoHolding.gainOrLossStatus && kotlin.jvm.internal.Intrinsics.areEqual(this.priceMovementPercent, cryptoHolding.priceMovementPercent) && this.priceMovementIndicator == cryptoHolding.priceMovementIndicator && kotlin.jvm.internal.Intrinsics.areEqual(this.pyusdRewardHoldings, cryptoHolding.pyusdRewardHoldings);
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding copy(java.lang.String assetName, java.lang.String assetSymbol, java.lang.String assetQuantity, java.lang.String fiatPriceValue, java.lang.String fiatAmountCurrencyCode, java.lang.String fiatAmountValue, java.lang.String logoUrl, java.lang.String gainOrLossAmount, java.lang.String gainOrLossPercent, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus gainOrLossStatus, java.lang.String priceMovementPercent, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator priceMovementIndicator, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.PYUSDRewardHoldings pyusdRewardHoldings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetQuantity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiatPriceValue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiatAmountCurrencyCode, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiatAmountValue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logoUrl, "");
        return new com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHolding(assetName, assetSymbol, assetQuantity, fiatPriceValue, fiatAmountCurrencyCode, fiatAmountValue, logoUrl, gainOrLossAmount, gainOrLossPercent, gainOrLossStatus, priceMovementPercent, priceMovementIndicator, pyusdRewardHoldings);
    }

    /* renamed from: component9, reason: from getter */
    public final java.lang.String getGainOrLossPercent() {
        return this.gainOrLossPercent;
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getGainOrLossAmount() {
        return this.gainOrLossAmount;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getLogoUrl() {
        return this.logoUrl;
    }

    /* renamed from: component6, reason: from getter */
    public final java.lang.String getFiatAmountValue() {
        return this.fiatAmountValue;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getFiatAmountCurrencyCode() {
        return this.fiatAmountCurrencyCode;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.String getFiatPriceValue() {
        return this.fiatPriceValue;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getAssetQuantity() {
        return this.assetQuantity;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    /* renamed from: component13, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.PYUSDRewardHoldings getPyusdRewardHoldings() {
        return this.pyusdRewardHoldings;
    }

    /* renamed from: component12, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoPriceMovementIndicator getPriceMovementIndicator() {
        return this.priceMovementIndicator;
    }

    /* renamed from: component11, reason: from getter */
    public final java.lang.String getPriceMovementPercent() {
        return this.priceMovementPercent;
    }

    /* renamed from: component10, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoGainOrLossStatus getGainOrLossStatus() {
        return this.gainOrLossStatus;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAssetName() {
        return this.assetName;
    }
}
