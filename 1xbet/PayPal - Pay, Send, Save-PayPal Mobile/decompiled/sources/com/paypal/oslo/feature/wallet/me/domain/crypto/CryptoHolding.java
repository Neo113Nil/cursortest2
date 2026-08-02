package com.paypal.oslo.feature.wallet.me.domain.crypto;

@kotlin.Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0010J\u0010\u0010\u0013\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0010J\u0010\u0010\u0016\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0010Jd\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u0010R\u001a\u0010\u0004\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010$\u001a\u0004\b&\u0010\u0010R\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010$\u001a\u0004\b'\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010$\u001a\u0004\b*\u0010\u0010R\u001a\u0010\n\u001a\u00020\t8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010\u0017R\u001a\u0010\u000b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b-\u0010\u0010R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b.\u0010\u0010"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoHolding;", "", "", "assetName", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "quantity", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "fiatValue", "logoUrl", "Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoGainOrLoss;", "dailyGainOrLoss", "dailyGainOrLossPercent", "rewardApy", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoGainOrLoss;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "component5", "component6", "()Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoGainOrLoss;", "component7", "component8", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Ljava/lang/String;Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoGainOrLoss;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoHolding;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAssetName", "getAssetSymbol", "getQuantity", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "getFiatValue", "getLogoUrl", "Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoGainOrLoss;", "getDailyGainOrLoss", "getDailyGainOrLossPercent", "getRewardApy"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class CryptoHolding {
    public static final int $stable = 0;
    private final java.lang.String assetName;
    private final java.lang.String assetSymbol;
    private final com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss dailyGainOrLoss;
    private final java.lang.String dailyGainOrLossPercent;
    private final com.paypal.oslo.feature.wallet.common.domain.model.Money fiatValue;
    private final java.lang.String logoUrl;
    private final java.lang.String quantity;
    private final java.lang.String rewardApy;

    public CryptoHolding(java.lang.String str, java.lang.String str2, java.lang.String str3, com.paypal.oslo.feature.wallet.common.domain.model.Money money, java.lang.String str4, com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss cryptoGainOrLoss, java.lang.String str5, java.lang.String str6) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoGainOrLoss, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str5, "");
        this.assetName = str;
        this.assetSymbol = str2;
        this.quantity = str3;
        this.fiatValue = money;
        this.logoUrl = str4;
        this.dailyGainOrLoss = cryptoGainOrLoss;
        this.dailyGainOrLossPercent = str5;
        this.rewardApy = str6;
    }

    public final java.lang.String getAssetName() {
        return this.assetName;
    }

    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    public final java.lang.String getQuantity() {
        return this.quantity;
    }

    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getFiatValue() {
        return this.fiatValue;
    }

    public final java.lang.String getLogoUrl() {
        return this.logoUrl;
    }

    public final com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss getDailyGainOrLoss() {
        return this.dailyGainOrLoss;
    }

    public final java.lang.String getDailyGainOrLossPercent() {
        return this.dailyGainOrLossPercent;
    }

    public final java.lang.String getRewardApy() {
        return this.rewardApy;
    }

    public final java.lang.String toString() {
        java.lang.String str = this.assetName;
        java.lang.String str2 = this.assetSymbol;
        java.lang.String str3 = this.quantity;
        com.paypal.oslo.feature.wallet.common.domain.model.Money money = this.fiatValue;
        java.lang.String str4 = this.logoUrl;
        com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss cryptoGainOrLoss = this.dailyGainOrLoss;
        java.lang.String str5 = this.dailyGainOrLossPercent;
        java.lang.String str6 = this.rewardApy;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoHolding(assetName=");
        sb.append(str);
        sb.append(", assetSymbol=");
        sb.append(str2);
        sb.append(", quantity=");
        sb.append(str3);
        sb.append(", fiatValue=");
        sb.append(money);
        sb.append(", logoUrl=");
        sb.append(str4);
        sb.append(", dailyGainOrLoss=");
        sb.append(cryptoGainOrLoss);
        sb.append(", dailyGainOrLossPercent=");
        sb.append(str5);
        sb.append(", rewardApy=");
        sb.append(str6);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.assetName.hashCode();
        int hashCode2 = this.assetSymbol.hashCode();
        int hashCode3 = this.quantity.hashCode();
        int hashCode4 = this.fiatValue.hashCode();
        java.lang.String str = this.logoUrl;
        int hashCode5 = str == null ? 0 : str.hashCode();
        int hashCode6 = this.dailyGainOrLoss.hashCode();
        int hashCode7 = this.dailyGainOrLossPercent.hashCode();
        java.lang.String str2 = this.rewardApy;
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + (str2 != null ? str2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoHolding)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoHolding cryptoHolding = (com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoHolding) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.assetName, cryptoHolding.assetName) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, cryptoHolding.assetSymbol) && kotlin.jvm.internal.Intrinsics.areEqual(this.quantity, cryptoHolding.quantity) && kotlin.jvm.internal.Intrinsics.areEqual(this.fiatValue, cryptoHolding.fiatValue) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoUrl, cryptoHolding.logoUrl) && this.dailyGainOrLoss == cryptoHolding.dailyGainOrLoss && kotlin.jvm.internal.Intrinsics.areEqual(this.dailyGainOrLossPercent, cryptoHolding.dailyGainOrLossPercent) && kotlin.jvm.internal.Intrinsics.areEqual(this.rewardApy, cryptoHolding.rewardApy);
    }

    public final com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoHolding copy(java.lang.String assetName, java.lang.String assetSymbol, java.lang.String quantity, com.paypal.oslo.feature.wallet.common.domain.model.Money fiatValue, java.lang.String logoUrl, com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss dailyGainOrLoss, java.lang.String dailyGainOrLossPercent, java.lang.String rewardApy) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetName, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quantity, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fiatValue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dailyGainOrLoss, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(dailyGainOrLossPercent, "");
        return new com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoHolding(assetName, assetSymbol, quantity, fiatValue, logoUrl, dailyGainOrLoss, dailyGainOrLossPercent, rewardApy);
    }

    /* renamed from: component8, reason: from getter */
    public final java.lang.String getRewardApy() {
        return this.rewardApy;
    }

    /* renamed from: component7, reason: from getter */
    public final java.lang.String getDailyGainOrLossPercent() {
        return this.dailyGainOrLossPercent;
    }

    /* renamed from: component6, reason: from getter */
    public final com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss getDailyGainOrLoss() {
        return this.dailyGainOrLoss;
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.String getLogoUrl() {
        return this.logoUrl;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getFiatValue() {
        return this.fiatValue;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getQuantity() {
        return this.quantity;
    }

    /* renamed from: component2, reason: from getter */
    public final java.lang.String getAssetSymbol() {
        return this.assetSymbol;
    }

    /* renamed from: component1, reason: from getter */
    public final java.lang.String getAssetName() {
        return this.assetName;
    }
}
