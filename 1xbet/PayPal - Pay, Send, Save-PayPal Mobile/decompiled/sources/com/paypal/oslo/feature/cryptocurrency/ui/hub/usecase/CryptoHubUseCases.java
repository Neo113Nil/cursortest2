package com.paypal.oslo.feature.cryptocurrency.ui.hub.usecase;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B1\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017JB\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\nHÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010$\u001a\u0004\b%\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010&\u001a\u0004\b'\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010\u0013R\u001a\u0010\t\u001a\u00020\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b+\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\n8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010,\u001a\u0004\b-\u0010\u0017"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/usecase/CryptoHubUseCases;", "", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/holdings/GetCryptoHoldingsUseCase;", "getCryptoHoldings", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/GetCurrentMarketPricesUseCase;", "getCryptoMarketPrices", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/FilterMarketPricesUseCase;", "filterMarketPrices", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/capabilities/GetCryptoCapabilitiesUseCase;", "getCryptoCapabilities", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/provisioning/CheckCryptoProvisioningUseCase;", "checkCryptoProvisioningUseCase", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/holdings/GetCryptoHoldingsUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/GetCurrentMarketPricesUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/FilterMarketPricesUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/capabilities/GetCryptoCapabilitiesUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/provisioning/CheckCryptoProvisioningUseCase;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/holdings/GetCryptoHoldingsUseCase;", "component2", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/GetCurrentMarketPricesUseCase;", "component3", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/FilterMarketPricesUseCase;", "component4", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/capabilities/GetCryptoCapabilitiesUseCase;", "component5", "()Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/provisioning/CheckCryptoProvisioningUseCase;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/holdings/GetCryptoHoldingsUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/GetCurrentMarketPricesUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/FilterMarketPricesUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/capabilities/GetCryptoCapabilitiesUseCase;Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/provisioning/CheckCryptoProvisioningUseCase;)Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/usecase/CryptoHubUseCases;", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/holdings/GetCryptoHoldingsUseCase;", "getGetCryptoHoldings", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/GetCurrentMarketPricesUseCase;", "getGetCryptoMarketPrices", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/prices/FilterMarketPricesUseCase;", "getFilterMarketPrices", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/capabilities/GetCryptoCapabilitiesUseCase;", "getGetCryptoCapabilities", "Lcom/paypal/oslo/feature/cryptocurrency/domain/usecase/provisioning/CheckCryptoProvisioningUseCase;", "getCheckCryptoProvisioningUseCase"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CryptoHubUseCases {
    public static final int $stable = 0;
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase checkCryptoProvisioningUseCase;
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.FilterMarketPricesUseCase filterMarketPrices;
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.capabilities.GetCryptoCapabilitiesUseCase getCryptoCapabilities;
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetCryptoHoldingsUseCase getCryptoHoldings;
    private final com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetCurrentMarketPricesUseCase getCryptoMarketPrices;

    @javax.inject.Inject
    public CryptoHubUseCases(com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetCryptoHoldingsUseCase getCryptoHoldingsUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetCurrentMarketPricesUseCase getCurrentMarketPricesUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.FilterMarketPricesUseCase filterMarketPricesUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.capabilities.GetCryptoCapabilitiesUseCase getCryptoCapabilitiesUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase checkCryptoProvisioningUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCryptoHoldingsUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCurrentMarketPricesUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterMarketPricesUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCryptoCapabilitiesUseCase, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkCryptoProvisioningUseCase, "");
        this.getCryptoHoldings = getCryptoHoldingsUseCase;
        this.getCryptoMarketPrices = getCurrentMarketPricesUseCase;
        this.filterMarketPrices = filterMarketPricesUseCase;
        this.getCryptoCapabilities = getCryptoCapabilitiesUseCase;
        this.checkCryptoProvisioningUseCase = checkCryptoProvisioningUseCase;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetCryptoHoldingsUseCase getGetCryptoHoldings() {
        return this.getCryptoHoldings;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetCurrentMarketPricesUseCase getGetCryptoMarketPrices() {
        return this.getCryptoMarketPrices;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.FilterMarketPricesUseCase getFilterMarketPrices() {
        return this.filterMarketPrices;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.capabilities.GetCryptoCapabilitiesUseCase getGetCryptoCapabilities() {
        return this.getCryptoCapabilities;
    }

    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase getCheckCryptoProvisioningUseCase() {
        return this.checkCryptoProvisioningUseCase;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetCryptoHoldingsUseCase getCryptoHoldingsUseCase = this.getCryptoHoldings;
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetCurrentMarketPricesUseCase getCurrentMarketPricesUseCase = this.getCryptoMarketPrices;
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.FilterMarketPricesUseCase filterMarketPricesUseCase = this.filterMarketPrices;
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.capabilities.GetCryptoCapabilitiesUseCase getCryptoCapabilitiesUseCase = this.getCryptoCapabilities;
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase checkCryptoProvisioningUseCase = this.checkCryptoProvisioningUseCase;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoHubUseCases(getCryptoHoldings=");
        sb.append(getCryptoHoldingsUseCase);
        sb.append(", getCryptoMarketPrices=");
        sb.append(getCurrentMarketPricesUseCase);
        sb.append(", filterMarketPrices=");
        sb.append(filterMarketPricesUseCase);
        sb.append(", getCryptoCapabilities=");
        sb.append(getCryptoCapabilitiesUseCase);
        sb.append(", checkCryptoProvisioningUseCase=");
        sb.append(checkCryptoProvisioningUseCase);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        return (((((((this.getCryptoHoldings.hashCode() * 31) + this.getCryptoMarketPrices.hashCode()) * 31) + this.filterMarketPrices.hashCode()) * 31) + this.getCryptoCapabilities.hashCode()) * 31) + this.checkCryptoProvisioningUseCase.hashCode();
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.usecase.CryptoHubUseCases)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.hub.usecase.CryptoHubUseCases cryptoHubUseCases = (com.paypal.oslo.feature.cryptocurrency.ui.hub.usecase.CryptoHubUseCases) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.getCryptoHoldings, cryptoHubUseCases.getCryptoHoldings) && kotlin.jvm.internal.Intrinsics.areEqual(this.getCryptoMarketPrices, cryptoHubUseCases.getCryptoMarketPrices) && kotlin.jvm.internal.Intrinsics.areEqual(this.filterMarketPrices, cryptoHubUseCases.filterMarketPrices) && kotlin.jvm.internal.Intrinsics.areEqual(this.getCryptoCapabilities, cryptoHubUseCases.getCryptoCapabilities) && kotlin.jvm.internal.Intrinsics.areEqual(this.checkCryptoProvisioningUseCase, cryptoHubUseCases.checkCryptoProvisioningUseCase);
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.usecase.CryptoHubUseCases copy(com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetCryptoHoldingsUseCase getCryptoHoldings, com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetCurrentMarketPricesUseCase getCryptoMarketPrices, com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.FilterMarketPricesUseCase filterMarketPrices, com.paypal.oslo.feature.cryptocurrency.domain.usecase.capabilities.GetCryptoCapabilitiesUseCase getCryptoCapabilities, com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase checkCryptoProvisioningUseCase) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCryptoHoldings, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCryptoMarketPrices, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(filterMarketPrices, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(getCryptoCapabilities, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(checkCryptoProvisioningUseCase, "");
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.usecase.CryptoHubUseCases(getCryptoHoldings, getCryptoMarketPrices, filterMarketPrices, getCryptoCapabilities, checkCryptoProvisioningUseCase);
    }

    /* renamed from: component5, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase getCheckCryptoProvisioningUseCase() {
        return this.checkCryptoProvisioningUseCase;
    }

    /* renamed from: component4, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.capabilities.GetCryptoCapabilitiesUseCase getGetCryptoCapabilities() {
        return this.getCryptoCapabilities;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.FilterMarketPricesUseCase getFilterMarketPrices() {
        return this.filterMarketPrices;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetCurrentMarketPricesUseCase getGetCryptoMarketPrices() {
        return this.getCryptoMarketPrices;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetCryptoHoldingsUseCase getGetCryptoHoldings() {
        return this.getCryptoHoldings;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.hub.usecase.CryptoHubUseCases copy$default(com.paypal.oslo.feature.cryptocurrency.ui.hub.usecase.CryptoHubUseCases cryptoHubUseCases, com.paypal.oslo.feature.cryptocurrency.domain.usecase.holdings.GetCryptoHoldingsUseCase getCryptoHoldingsUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetCurrentMarketPricesUseCase getCurrentMarketPricesUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.FilterMarketPricesUseCase filterMarketPricesUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.capabilities.GetCryptoCapabilitiesUseCase getCryptoCapabilitiesUseCase, com.paypal.oslo.feature.cryptocurrency.domain.usecase.provisioning.CheckCryptoProvisioningUseCase checkCryptoProvisioningUseCase, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            getCryptoHoldingsUseCase = cryptoHubUseCases.getCryptoHoldings;
        }
        if ((i & 2) != 0) {
            getCurrentMarketPricesUseCase = cryptoHubUseCases.getCryptoMarketPrices;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.GetCurrentMarketPricesUseCase getCurrentMarketPricesUseCase2 = getCurrentMarketPricesUseCase;
        if ((i & 4) != 0) {
            filterMarketPricesUseCase = cryptoHubUseCases.filterMarketPrices;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.prices.FilterMarketPricesUseCase filterMarketPricesUseCase2 = filterMarketPricesUseCase;
        if ((i & 8) != 0) {
            getCryptoCapabilitiesUseCase = cryptoHubUseCases.getCryptoCapabilities;
        }
        com.paypal.oslo.feature.cryptocurrency.domain.usecase.capabilities.GetCryptoCapabilitiesUseCase getCryptoCapabilitiesUseCase2 = getCryptoCapabilitiesUseCase;
        if ((i & 16) != 0) {
            checkCryptoProvisioningUseCase = cryptoHubUseCases.checkCryptoProvisioningUseCase;
        }
        return cryptoHubUseCases.copy(getCryptoHoldingsUseCase, getCurrentMarketPricesUseCase2, filterMarketPricesUseCase2, getCryptoCapabilitiesUseCase2, checkCryptoProvisioningUseCase);
    }
}
