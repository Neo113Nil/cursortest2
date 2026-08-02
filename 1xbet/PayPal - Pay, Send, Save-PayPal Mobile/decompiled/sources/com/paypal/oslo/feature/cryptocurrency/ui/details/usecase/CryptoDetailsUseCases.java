package com.paypal.oslo.feature.cryptocurrency.ui.details.usecase;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JB\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0013R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/usecase/CryptoDetailsUseCases;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/GetAssetCurrentPriceUseCase;", "getAssetCurrentPrice", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/holdings/GetAssetHoldingUseCase;", "getAssetHolding", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/GetAssetPriceHistoryUseCase;", "getAssetPriceHistory", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/polling/PollCryptoDetailsUseCase;", "pollCryptoDetails", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/receive/GetAvailableNetworksUseCase;", "getAvailableNetworks", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/GetAssetCurrentPriceUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/holdings/GetAssetHoldingUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/GetAssetPriceHistoryUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/polling/PollCryptoDetailsUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/receive/GetAvailableNetworksUseCase;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/GetAssetCurrentPriceUseCase;", "component2", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/holdings/GetAssetHoldingUseCase;", "component3", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/GetAssetPriceHistoryUseCase;", "component4", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/polling/PollCryptoDetailsUseCase;", "component5", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/receive/GetAvailableNetworksUseCase;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/GetAssetCurrentPriceUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/holdings/GetAssetHoldingUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/GetAssetPriceHistoryUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/polling/PollCryptoDetailsUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/receive/GetAvailableNetworksUseCase;)Lcom/paypal/oslo/feature/cryptocurrency/ui/details/usecase/CryptoDetailsUseCases;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/GetAssetCurrentPriceUseCase;", "getGetAssetCurrentPrice", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/holdings/GetAssetHoldingUseCase;", "getGetAssetHolding", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/GetAssetPriceHistoryUseCase;", "getGetAssetPriceHistory", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/polling/PollCryptoDetailsUseCase;", "getPollCryptoDetails", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/receive/GetAvailableNetworksUseCase;", "getGetAvailableNetworks"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoDetailsUseCases {
    public static final int $stable = 8;
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase getAssetCurrentPrice;
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase getAssetHolding;
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetPriceHistoryUseCase getAssetPriceHistory;
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase getAvailableNetworks;
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase pollCryptoDetails;

    @javax.inject.Inject
    public CryptoDetailsUseCases(com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase getAssetCurrentPriceUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase getAssetHoldingUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetPriceHistoryUseCase getAssetPriceHistoryUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase pollCryptoDetailsUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase getAvailableNetworksUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAssetCurrentPriceUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAssetHoldingUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAssetPriceHistoryUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pollCryptoDetailsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAvailableNetworksUseCase, "");
        this.getAssetCurrentPrice = getAssetCurrentPriceUseCase;
        this.getAssetHolding = getAssetHoldingUseCase;
        this.getAssetPriceHistory = getAssetPriceHistoryUseCase;
        this.pollCryptoDetails = pollCryptoDetailsUseCase;
        this.getAvailableNetworks = getAvailableNetworksUseCase;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase getGetAssetCurrentPrice() {
        return this.getAssetCurrentPrice;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase getGetAssetHolding() {
        return this.getAssetHolding;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetPriceHistoryUseCase getGetAssetPriceHistory() {
        return this.getAssetPriceHistory;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase getPollCryptoDetails() {
        return this.pollCryptoDetails;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase getGetAvailableNetworks() {
        return this.getAvailableNetworks;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase getAssetCurrentPriceUseCase = this.getAssetCurrentPrice;
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase getAssetHoldingUseCase = this.getAssetHolding;
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetPriceHistoryUseCase getAssetPriceHistoryUseCase = this.getAssetPriceHistory;
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase pollCryptoDetailsUseCase = this.pollCryptoDetails;
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase getAvailableNetworksUseCase = this.getAvailableNetworks;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoDetailsUseCases(getAssetCurrentPrice=");
        sb.append(getAssetCurrentPriceUseCase);
        sb.append(", getAssetHolding=");
        sb.append(getAssetHoldingUseCase);
        sb.append(", getAssetPriceHistory=");
        sb.append(getAssetPriceHistoryUseCase);
        sb.append(", pollCryptoDetails=");
        sb.append(pollCryptoDetailsUseCase);
        sb.append(", getAvailableNetworks=");
        sb.append(getAvailableNetworksUseCase);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.getAssetCurrentPrice.hashCode() * 31) + this.getAssetHolding.hashCode()) * 31) + this.getAssetPriceHistory.hashCode()) * 31) + this.pollCryptoDetails.hashCode()) * 31) + this.getAvailableNetworks.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.usecase.CryptoDetailsUseCases)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.details.usecase.CryptoDetailsUseCases cryptoDetailsUseCases = (com.paypal.oslo.feature.cryptocurrency.ui.details.usecase.CryptoDetailsUseCases) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getAssetCurrentPrice, cryptoDetailsUseCases.getAssetCurrentPrice) && kotlin.jvm.internal.Intrinsics.areEqual(this.getAssetHolding, cryptoDetailsUseCases.getAssetHolding) && kotlin.jvm.internal.Intrinsics.areEqual(this.getAssetPriceHistory, cryptoDetailsUseCases.getAssetPriceHistory) && kotlin.jvm.internal.Intrinsics.areEqual(this.pollCryptoDetails, cryptoDetailsUseCases.pollCryptoDetails) && kotlin.jvm.internal.Intrinsics.areEqual(this.getAvailableNetworks, cryptoDetailsUseCases.getAvailableNetworks);
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.details.usecase.CryptoDetailsUseCases copy(com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase getAssetCurrentPrice, com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase getAssetHolding, com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetPriceHistoryUseCase getAssetPriceHistory, com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase pollCryptoDetails, com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase getAvailableNetworks) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAssetCurrentPrice, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAssetHolding, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAssetPriceHistory, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(pollCryptoDetails, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAvailableNetworks, "");
        return new com.paypal.oslo.feature.cryptocurrency.ui.details.usecase.CryptoDetailsUseCases(getAssetCurrentPrice, getAssetHolding, getAssetPriceHistory, pollCryptoDetails, getAvailableNetworks);
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase getGetAvailableNetworks() {
        return this.getAvailableNetworks;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase getPollCryptoDetails() {
        return this.pollCryptoDetails;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetPriceHistoryUseCase getGetAssetPriceHistory() {
        return this.getAssetPriceHistory;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase getGetAssetHolding() {
        return this.getAssetHolding;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase getGetAssetCurrentPrice() {
        return this.getAssetCurrentPrice;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.details.usecase.CryptoDetailsUseCases copy$default(com.paypal.oslo.feature.cryptocurrency.ui.details.usecase.CryptoDetailsUseCases cryptoDetailsUseCases, com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetCurrentPriceUseCase getAssetCurrentPriceUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase getAssetHoldingUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetPriceHistoryUseCase getAssetPriceHistoryUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase pollCryptoDetailsUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase getAvailableNetworksUseCase, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            getAssetCurrentPriceUseCase = cryptoDetailsUseCases.getAssetCurrentPrice;
        }
        if ((i & 2) != 0) {
            getAssetHoldingUseCase = cryptoDetailsUseCases.getAssetHolding;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetAssetHoldingUseCase getAssetHoldingUseCase2 = getAssetHoldingUseCase;
        if ((i & 4) != 0) {
            getAssetPriceHistoryUseCase = cryptoDetailsUseCases.getAssetPriceHistory;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetAssetPriceHistoryUseCase getAssetPriceHistoryUseCase2 = getAssetPriceHistoryUseCase;
        if ((i & 8) != 0) {
            pollCryptoDetailsUseCase = cryptoDetailsUseCases.pollCryptoDetails;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.polling.PollCryptoDetailsUseCase pollCryptoDetailsUseCase2 = pollCryptoDetailsUseCase;
        if ((i & 16) != 0) {
            getAvailableNetworksUseCase = cryptoDetailsUseCases.getAvailableNetworks;
        }
        return cryptoDetailsUseCases.copy(getAssetCurrentPriceUseCase, getAssetHoldingUseCase2, getAssetPriceHistoryUseCase2, pollCryptoDetailsUseCase2, getAvailableNetworksUseCase);
    }
}
