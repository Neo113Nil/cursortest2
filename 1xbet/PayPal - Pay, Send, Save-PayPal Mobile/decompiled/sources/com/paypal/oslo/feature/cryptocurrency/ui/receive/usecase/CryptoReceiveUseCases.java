package com.paypal.oslo.feature.cryptocurrency.ui.receive.usecase;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B!\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\u000f"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/usecase/CryptoReceiveUseCases;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/receive/EvaluateCryptocurrencyTradeUseCase;", "evaluateCryptocurrencyTrade", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/receive/GetAvailableNetworksUseCase;", "getAvailableNetworks", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/receive/GenerateReceiveAddressUseCase;", "generateReceiveAddress", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/receive/EvaluateCryptocurrencyTradeUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/receive/GetAvailableNetworksUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/receive/GenerateReceiveAddressUseCase;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/receive/EvaluateCryptocurrencyTradeUseCase;", "component2", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/receive/GetAvailableNetworksUseCase;", "component3", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/receive/GenerateReceiveAddressUseCase;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/receive/EvaluateCryptocurrencyTradeUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/receive/GetAvailableNetworksUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/receive/GenerateReceiveAddressUseCase;)Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/usecase/CryptoReceiveUseCases;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/receive/EvaluateCryptocurrencyTradeUseCase;", "getEvaluateCryptocurrencyTrade", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/receive/GetAvailableNetworksUseCase;", "getGetAvailableNetworks", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/receive/GenerateReceiveAddressUseCase;", "getGenerateReceiveAddress"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoReceiveUseCases {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.EvaluateCryptocurrencyTradeUseCase evaluateCryptocurrencyTrade;
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GenerateReceiveAddressUseCase generateReceiveAddress;
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase getAvailableNetworks;

    @javax.inject.Inject
    public CryptoReceiveUseCases(com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.EvaluateCryptocurrencyTradeUseCase evaluateCryptocurrencyTradeUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase getAvailableNetworksUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GenerateReceiveAddressUseCase generateReceiveAddressUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluateCryptocurrencyTradeUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAvailableNetworksUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(generateReceiveAddressUseCase, "");
        this.evaluateCryptocurrencyTrade = evaluateCryptocurrencyTradeUseCase;
        this.getAvailableNetworks = getAvailableNetworksUseCase;
        this.generateReceiveAddress = generateReceiveAddressUseCase;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.EvaluateCryptocurrencyTradeUseCase getEvaluateCryptocurrencyTrade() {
        return this.evaluateCryptocurrencyTrade;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase getGetAvailableNetworks() {
        return this.getAvailableNetworks;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GenerateReceiveAddressUseCase getGenerateReceiveAddress() {
        return this.generateReceiveAddress;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.EvaluateCryptocurrencyTradeUseCase evaluateCryptocurrencyTradeUseCase = this.evaluateCryptocurrencyTrade;
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase getAvailableNetworksUseCase = this.getAvailableNetworks;
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GenerateReceiveAddressUseCase generateReceiveAddressUseCase = this.generateReceiveAddress;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoReceiveUseCases(evaluateCryptocurrencyTrade=");
        sb.append(evaluateCryptocurrencyTradeUseCase);
        sb.append(", getAvailableNetworks=");
        sb.append(getAvailableNetworksUseCase);
        sb.append(", generateReceiveAddress=");
        sb.append(generateReceiveAddressUseCase);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((this.evaluateCryptocurrencyTrade.hashCode() * 31) + this.getAvailableNetworks.hashCode()) * 31) + this.generateReceiveAddress.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.receive.usecase.CryptoReceiveUseCases)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.receive.usecase.CryptoReceiveUseCases cryptoReceiveUseCases = (com.paypal.oslo.feature.cryptocurrency.ui.receive.usecase.CryptoReceiveUseCases) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.evaluateCryptocurrencyTrade, cryptoReceiveUseCases.evaluateCryptocurrencyTrade) && kotlin.jvm.internal.Intrinsics.areEqual(this.getAvailableNetworks, cryptoReceiveUseCases.getAvailableNetworks) && kotlin.jvm.internal.Intrinsics.areEqual(this.generateReceiveAddress, cryptoReceiveUseCases.generateReceiveAddress);
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.receive.usecase.CryptoReceiveUseCases copy(com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.EvaluateCryptocurrencyTradeUseCase evaluateCryptocurrencyTrade, com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase getAvailableNetworks, com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GenerateReceiveAddressUseCase generateReceiveAddress) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(evaluateCryptocurrencyTrade, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getAvailableNetworks, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(generateReceiveAddress, "");
        return new com.paypal.oslo.feature.cryptocurrency.ui.receive.usecase.CryptoReceiveUseCases(evaluateCryptocurrencyTrade, getAvailableNetworks, generateReceiveAddress);
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GenerateReceiveAddressUseCase getGenerateReceiveAddress() {
        return this.generateReceiveAddress;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase getGetAvailableNetworks() {
        return this.getAvailableNetworks;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.EvaluateCryptocurrencyTradeUseCase getEvaluateCryptocurrencyTrade() {
        return this.evaluateCryptocurrencyTrade;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.receive.usecase.CryptoReceiveUseCases copy$default(com.paypal.oslo.feature.cryptocurrency.ui.receive.usecase.CryptoReceiveUseCases cryptoReceiveUseCases, com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.EvaluateCryptocurrencyTradeUseCase evaluateCryptocurrencyTradeUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GetAvailableNetworksUseCase getAvailableNetworksUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.receive.GenerateReceiveAddressUseCase generateReceiveAddressUseCase, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            evaluateCryptocurrencyTradeUseCase = cryptoReceiveUseCases.evaluateCryptocurrencyTrade;
        }
        if ((i & 2) != 0) {
            getAvailableNetworksUseCase = cryptoReceiveUseCases.getAvailableNetworks;
        }
        if ((i & 4) != 0) {
            generateReceiveAddressUseCase = cryptoReceiveUseCases.generateReceiveAddress;
        }
        return cryptoReceiveUseCases.copy(evaluateCryptocurrencyTradeUseCase, getAvailableNetworksUseCase, generateReceiveAddressUseCase);
    }
}
