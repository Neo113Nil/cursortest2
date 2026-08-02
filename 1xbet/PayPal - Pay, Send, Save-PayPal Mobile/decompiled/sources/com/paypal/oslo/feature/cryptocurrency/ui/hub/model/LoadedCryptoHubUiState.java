package com.paypal.oslo.feature.cryptocurrency.ui.hub.model;

@kotlin.Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0016\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\t0\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0016J\u0010\u0010\u0019\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ`\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\r2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010$\u001a\u00020#HÖ\u0001¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0014R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b+\u0010\u0016R \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010*\u001a\u0004\b,\u0010\u0016R \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010*\u001a\u0004\b-\u0010\u0016R\u001a\u0010\u000e\u001a\u00020\r8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010.\u001a\u0004\b\u000e\u0010\u001a"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/LoadedCryptoHubUiState;", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHoldingsCardUiState;", "cryptoHoldingsCardUiState", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsCardUiState;", "pyusdRewardsCardUiState", "", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoMarketPriceUi;", "cryptoMarketPrices", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHoldingUi;", "cryptoHoldingsAssets", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoSettingsOptions;", "cryptoSettingsOptions", "", "isCelsiusCardVisible", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHoldingsCardUiState;Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsCardUiState;Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHoldingsCardUiState;", "component2", "()Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsCardUiState;", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "()Z", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHoldingsCardUiState;Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsCardUiState;Ljava/util/List;Ljava/util/List;Ljava/util/List;Z)Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/LoadedCryptoHubUiState;", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHoldingsCardUiState;", "getCryptoHoldingsCardUiState", "Lcom/paypal/oslo/feature/cryptocurrency/ui/rewards/pyusd/model/PYUSDRewardsCardUiState;", "getPyusdRewardsCardUiState", "Ljava/util/List;", "getCryptoMarketPrices", "getCryptoHoldingsAssets", "getCryptoSettingsOptions", "Z"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class LoadedCryptoHubUiState {
    public static final int $stable = 0;
    private final java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHoldingUi> cryptoHoldingsAssets;
    private final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHoldingsCardUiState cryptoHoldingsCardUiState;
    private final java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoMarketPriceUi> cryptoMarketPrices;
    private final java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions> cryptoSettingsOptions;
    private final boolean isCelsiusCardVisible;
    private final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState pyusdRewardsCardUiState;

    /* JADX WARN: Multi-variable type inference failed */
    public LoadedCryptoHubUiState(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHoldingsCardUiState cryptoHoldingsCardUiState, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState pYUSDRewardsCardUiState, java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoMarketPriceUi> list, java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHoldingUi> list2, java.util.List<? extends com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions> list3, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoHoldingsCardUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(list3, "");
        this.cryptoHoldingsCardUiState = cryptoHoldingsCardUiState;
        this.pyusdRewardsCardUiState = pYUSDRewardsCardUiState;
        this.cryptoMarketPrices = list;
        this.cryptoHoldingsAssets = list2;
        this.cryptoSettingsOptions = list3;
        this.isCelsiusCardVisible = z;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHoldingsCardUiState getCryptoHoldingsCardUiState() {
        return this.cryptoHoldingsCardUiState;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState getPyusdRewardsCardUiState() {
        return this.pyusdRewardsCardUiState;
    }

    public /* synthetic */ LoadedCryptoHubUiState(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHoldingsCardUiState cryptoHoldingsCardUiState, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState pYUSDRewardsCardUiState, java.util.List list, java.util.List list2, java.util.List list3, boolean z, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this(cryptoHoldingsCardUiState, pYUSDRewardsCardUiState, (i & 4) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list, (i & 8) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list2, (i & 16) != 0 ? kotlin.collections.CollectionsKt.emptyList() : list3, (i & 32) != 0 ? false : z);
    }

    public final java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoMarketPriceUi> getCryptoMarketPrices() {
        return this.cryptoMarketPrices;
    }

    public final java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHoldingUi> getCryptoHoldingsAssets() {
        return this.cryptoHoldingsAssets;
    }

    public final java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions> getCryptoSettingsOptions() {
        return this.cryptoSettingsOptions;
    }

    public final boolean isCelsiusCardVisible() {
        return this.isCelsiusCardVisible;
    }

    public final java.lang.String toString() {
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHoldingsCardUiState cryptoHoldingsCardUiState = this.cryptoHoldingsCardUiState;
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState pYUSDRewardsCardUiState = this.pyusdRewardsCardUiState;
        java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoMarketPriceUi> list = this.cryptoMarketPrices;
        java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHoldingUi> list2 = this.cryptoHoldingsAssets;
        java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions> list3 = this.cryptoSettingsOptions;
        boolean z = this.isCelsiusCardVisible;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("LoadedCryptoHubUiState(cryptoHoldingsCardUiState=");
        sb.append(cryptoHoldingsCardUiState);
        sb.append(", pyusdRewardsCardUiState=");
        sb.append(pYUSDRewardsCardUiState);
        sb.append(", cryptoMarketPrices=");
        sb.append(list);
        sb.append(", cryptoHoldingsAssets=");
        sb.append(list2);
        sb.append(", cryptoSettingsOptions=");
        sb.append(list3);
        sb.append(", isCelsiusCardVisible=");
        sb.append(z);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = this.cryptoHoldingsCardUiState.hashCode();
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState pYUSDRewardsCardUiState = this.pyusdRewardsCardUiState;
        return (((((((((hashCode * 31) + (pYUSDRewardsCardUiState == null ? 0 : pYUSDRewardsCardUiState.hashCode())) * 31) + this.cryptoMarketPrices.hashCode()) * 31) + this.cryptoHoldingsAssets.hashCode()) * 31) + this.cryptoSettingsOptions.hashCode()) * 31) + java.lang.Boolean.hashCode(this.isCelsiusCardVisible);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.LoadedCryptoHubUiState)) {
            return false;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.hub.model.LoadedCryptoHubUiState loadedCryptoHubUiState = (com.paypal.oslo.feature.cryptocurrency.ui.hub.model.LoadedCryptoHubUiState) other;
        return kotlin.jvm.internal.Intrinsics.areEqual(this.cryptoHoldingsCardUiState, loadedCryptoHubUiState.cryptoHoldingsCardUiState) && kotlin.jvm.internal.Intrinsics.areEqual(this.pyusdRewardsCardUiState, loadedCryptoHubUiState.pyusdRewardsCardUiState) && kotlin.jvm.internal.Intrinsics.areEqual(this.cryptoMarketPrices, loadedCryptoHubUiState.cryptoMarketPrices) && kotlin.jvm.internal.Intrinsics.areEqual(this.cryptoHoldingsAssets, loadedCryptoHubUiState.cryptoHoldingsAssets) && kotlin.jvm.internal.Intrinsics.areEqual(this.cryptoSettingsOptions, loadedCryptoHubUiState.cryptoSettingsOptions) && this.isCelsiusCardVisible == loadedCryptoHubUiState.isCelsiusCardVisible;
    }

    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.LoadedCryptoHubUiState copy(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHoldingsCardUiState cryptoHoldingsCardUiState, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState pyusdRewardsCardUiState, java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoMarketPriceUi> cryptoMarketPrices, java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHoldingUi> cryptoHoldingsAssets, java.util.List<? extends com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions> cryptoSettingsOptions, boolean isCelsiusCardVisible) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoHoldingsCardUiState, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoMarketPrices, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoHoldingsAssets, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(cryptoSettingsOptions, "");
        return new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.LoadedCryptoHubUiState(cryptoHoldingsCardUiState, pyusdRewardsCardUiState, cryptoMarketPrices, cryptoHoldingsAssets, cryptoSettingsOptions, isCelsiusCardVisible);
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsCelsiusCardVisible() {
        return this.isCelsiusCardVisible;
    }

    public final java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoSettingsOptions> component5() {
        return this.cryptoSettingsOptions;
    }

    public final java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHoldingUi> component4() {
        return this.cryptoHoldingsAssets;
    }

    public final java.util.List<com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoMarketPriceUi> component3() {
        return this.cryptoMarketPrices;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState getPyusdRewardsCardUiState() {
        return this.pyusdRewardsCardUiState;
    }

    /* renamed from: component1, reason: from getter */
    public final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHoldingsCardUiState getCryptoHoldingsCardUiState() {
        return this.cryptoHoldingsCardUiState;
    }

    public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.hub.model.LoadedCryptoHubUiState copy$default(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.LoadedCryptoHubUiState loadedCryptoHubUiState, com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHoldingsCardUiState cryptoHoldingsCardUiState, com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState pYUSDRewardsCardUiState, java.util.List list, java.util.List list2, java.util.List list3, boolean z, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            cryptoHoldingsCardUiState = loadedCryptoHubUiState.cryptoHoldingsCardUiState;
        }
        if ((i & 2) != 0) {
            pYUSDRewardsCardUiState = loadedCryptoHubUiState.pyusdRewardsCardUiState;
        }
        com.paypal.oslo.feature.cryptocurrency.ui.rewards.pyusd.model.PYUSDRewardsCardUiState pYUSDRewardsCardUiState2 = pYUSDRewardsCardUiState;
        if ((i & 4) != 0) {
            list = loadedCryptoHubUiState.cryptoMarketPrices;
        }
        java.util.List list4 = list;
        if ((i & 8) != 0) {
            list2 = loadedCryptoHubUiState.cryptoHoldingsAssets;
        }
        java.util.List list5 = list2;
        if ((i & 16) != 0) {
            list3 = loadedCryptoHubUiState.cryptoSettingsOptions;
        }
        java.util.List list6 = list3;
        if ((i & 32) != 0) {
            z = loadedCryptoHubUiState.isCelsiusCardVisible;
        }
        return loadedCryptoHubUiState.copy(cryptoHoldingsCardUiState, pYUSDRewardsCardUiState2, list4, list5, list6, z);
    }
}
