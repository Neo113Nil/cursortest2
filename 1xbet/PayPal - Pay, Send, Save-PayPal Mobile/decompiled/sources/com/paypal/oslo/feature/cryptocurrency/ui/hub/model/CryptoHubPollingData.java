package com.paypal.oslo.feature.cryptocurrency.ui.hub.model;

@kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0018\u001a\u0004\b\u0019\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubPollingData;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHoldings;", "holdings", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoMarketPrices;", "marketPrices", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHoldings;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoMarketPrices;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHoldings;", "component2", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoMarketPrices;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHoldings;Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoMarketPrices;)Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubPollingData;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/holdings/CryptoHoldings;", "getHoldings", "Lcom/paypal/oslo/feature/cryptocurrency/domain/model/prices/CryptoMarketPrices;", "getMarketPrices"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoHubPollingData {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings holdings;
    private final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices marketPrices;

    public CryptoHubPollingData(com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings cryptoHoldings, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices cryptoMarketPrices) {
        this.holdings = cryptoHoldings;
        this.marketPrices = cryptoMarketPrices;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings getHoldings() {
        return this.holdings;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices getMarketPrices() {
        return this.marketPrices;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings cryptoHoldings = this.holdings;
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices cryptoMarketPrices = this.marketPrices;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoHubPollingData(holdings=");
        sb.append(cryptoHoldings);
        sb.append(", marketPrices=");
        sb.append(cryptoMarketPrices);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings cryptoHoldings = this.holdings;
        int hashCode = cryptoHoldings == null ? 0 : cryptoHoldings.hashCode();
        com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices cryptoMarketPrices = this.marketPrices;
        return (hashCode * 31) + (cryptoMarketPrices != null ? cryptoMarketPrices.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubPollingData)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubPollingData cryptoHubPollingData = (com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubPollingData) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.holdings, cryptoHubPollingData.holdings) && kotlin.jvm.internal.Intrinsics.areEqual(this.marketPrices, cryptoHubPollingData.marketPrices);
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubPollingData copy(com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings holdings, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices marketPrices) {
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubPollingData(holdings, marketPrices);
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices getMarketPrices() {
        return this.marketPrices;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings getHoldings() {
        return this.holdings;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubPollingData copy$default(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubPollingData cryptoHubPollingData, com.paypal.oslo.feature.cryptocurrency.domain.model.holdings.CryptoHoldings cryptoHoldings, com.paypal.oslo.feature.cryptocurrency.domain.model.prices.CryptoMarketPrices cryptoMarketPrices, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cryptoHoldings = cryptoHubPollingData.holdings;
        }
        if ((i & 2) != 0) {
            cryptoMarketPrices = cryptoHubPollingData.marketPrices;
        }
        return cryptoHubPollingData.copy(cryptoHoldings, cryptoMarketPrices);
    }
}
