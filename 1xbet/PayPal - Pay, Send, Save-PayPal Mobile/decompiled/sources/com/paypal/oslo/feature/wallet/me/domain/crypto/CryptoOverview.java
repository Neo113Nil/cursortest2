package com.paypal.oslo.feature.wallet.me.domain.crypto;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0018\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J@\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0012R\"\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b&\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoOverview;", "", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "portfolioValue", "Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoGainOrLoss;", "portfolioGainOrLoss", "", "portfolioGainOrLossPercent", "", "Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoHolding;", "holdings", "<init>", "(Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoGainOrLoss;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "component2", "()Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoGainOrLoss;", "component3", "()Ljava/lang/String;", "component4", "()Ljava/util/List;", "copy", "(Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoGainOrLoss;Ljava/lang/String;Ljava/util/List;)Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoOverview;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Lcom/paypal/oslo/feature/wallet/common/domain/model/Money;", "getPortfolioValue", "Lcom/paypal/oslo/feature/wallet/me/domain/crypto/CryptoGainOrLoss;", "getPortfolioGainOrLoss", "Ljava/lang/String;", "getPortfolioGainOrLossPercent", "Ljava/util/List;", "getHoldings"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class CryptoOverview {
    public static final int $stable = 8;
    private final java.util.List<com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoHolding> holdings;
    private final com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss portfolioGainOrLoss;
    private final java.lang.String portfolioGainOrLossPercent;
    private final com.paypal.oslo.feature.wallet.common.domain.model.Money portfolioValue;

    public CryptoOverview(com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss cryptoGainOrLoss, java.lang.String str, java.util.List<com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoHolding> list) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(money, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoGainOrLoss, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        this.portfolioValue = money;
        this.portfolioGainOrLoss = cryptoGainOrLoss;
        this.portfolioGainOrLossPercent = str;
        this.holdings = list;
    }

    public /* synthetic */ CryptoOverview(com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss cryptoGainOrLoss, java.lang.String str, java.util.List list, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(money, cryptoGainOrLoss, str, (i & 8) != 0 ? null : list);
    }

    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getPortfolioValue() {
        return this.portfolioValue;
    }

    public final com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss getPortfolioGainOrLoss() {
        return this.portfolioGainOrLoss;
    }

    public final java.lang.String getPortfolioGainOrLossPercent() {
        return this.portfolioGainOrLossPercent;
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoHolding> getHoldings() {
        return this.holdings;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.wallet.common.domain.model.Money money = this.portfolioValue;
        com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss cryptoGainOrLoss = this.portfolioGainOrLoss;
        java.lang.String str = this.portfolioGainOrLossPercent;
        java.util.List<com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoHolding> list = this.holdings;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoOverview(portfolioValue=");
        sb.append(money);
        sb.append(", portfolioGainOrLoss=");
        sb.append(cryptoGainOrLoss);
        sb.append(", portfolioGainOrLossPercent=");
        sb.append(str);
        sb.append(", holdings=");
        sb.append(list);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.portfolioValue.hashCode();
        int hashCode2 = this.portfolioGainOrLoss.hashCode();
        int hashCode3 = this.portfolioGainOrLossPercent.hashCode();
        java.util.List<com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoHolding> list = this.holdings;
        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + (list == null ? 0 : list.hashCode());
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoOverview)) {
            return false;
        }
        com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoOverview cryptoOverview = (com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoOverview) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.portfolioValue, cryptoOverview.portfolioValue) && this.portfolioGainOrLoss == cryptoOverview.portfolioGainOrLoss && kotlin.jvm.internal.Intrinsics.areEqual(this.portfolioGainOrLossPercent, cryptoOverview.portfolioGainOrLossPercent) && kotlin.jvm.internal.Intrinsics.areEqual(this.holdings, cryptoOverview.holdings);
    }

    public final com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoOverview copy(com.paypal.oslo.feature.wallet.common.domain.model.Money portfolioValue, com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss portfolioGainOrLoss, java.lang.String portfolioGainOrLossPercent, java.util.List<com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoHolding> holdings) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(portfolioValue, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(portfolioGainOrLoss, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(portfolioGainOrLossPercent, "");
        return new com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoOverview(portfolioValue, portfolioGainOrLoss, portfolioGainOrLossPercent, holdings);
    }

    public final java.util.List<com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoHolding> component4() {
        return this.holdings;
    }

    /* renamed from: component3, reason: from getter */
    public final java.lang.String getPortfolioGainOrLossPercent() {
        return this.portfolioGainOrLossPercent;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss getPortfolioGainOrLoss() {
        return this.portfolioGainOrLoss;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.wallet.common.domain.model.Money getPortfolioValue() {
        return this.portfolioValue;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoOverview copy$default(com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoOverview cryptoOverview, com.paypal.oslo.feature.wallet.common.domain.model.Money money, com.paypal.oslo.feature.wallet.me.domain.crypto.CryptoGainOrLoss cryptoGainOrLoss, java.lang.String str, java.util.List list, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            money = cryptoOverview.portfolioValue;
        }
        if ((i & 2) != 0) {
            cryptoGainOrLoss = cryptoOverview.portfolioGainOrLoss;
        }
        if ((i & 4) != 0) {
            str = cryptoOverview.portfolioGainOrLossPercent;
        }
        if ((i & 8) != 0) {
            list = cryptoOverview.holdings;
        }
        return cryptoOverview.copy(money, cryptoGainOrLoss, str, list);
    }
}
