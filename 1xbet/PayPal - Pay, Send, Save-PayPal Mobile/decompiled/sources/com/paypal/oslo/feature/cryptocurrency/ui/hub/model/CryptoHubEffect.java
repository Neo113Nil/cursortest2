package com.paypal.oslo.feature.cryptocurrency.ui.hub.model;

@kotlin.Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\n\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\u0082\u0001\n\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014\u0015À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect;", "", "NavigateToDetailsScreen", "NavigateToAssetSelectionScreen", "NavigateToSendFlow", "ShowProvisioningFlow", "NavigateToPYUSDRewardsSettingsScreen", "ShowPYUSDRewardsLearnMoreBottomSheet", "ShowPYUSDRewardsOptInSuccessBottomSheet", "NavigateToBuyMorePYUSD", "NavigateToCelsiusClaimCodeScreen", "NavigateToErrorScreen", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect$NavigateToAssetSelectionScreen;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect$NavigateToBuyMorePYUSD;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect$NavigateToCelsiusClaimCodeScreen;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect$NavigateToDetailsScreen;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect$NavigateToErrorScreen;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect$NavigateToPYUSDRewardsSettingsScreen;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect$NavigateToSendFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect$ShowPYUSDRewardsLearnMoreBottomSheet;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect$ShowPYUSDRewardsOptInSuccessBottomSheet;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect$ShowProvisioningFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface CryptoHubEffect {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect$NavigateToDetailsScreen;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect;", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect$NavigateToDetailsScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAssetSymbol"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToDetailsScreen implements com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect {
        public static final int $stable = 0;
        private final java.lang.String assetSymbol;

        public NavigateToDetailsScreen(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.assetSymbol = str;
        }

        public final java.lang.String getAssetSymbol() {
            return this.assetSymbol;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.assetSymbol;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToDetailsScreen(assetSymbol=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.assetSymbol.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToDetailsScreen) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, ((com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToDetailsScreen) other).assetSymbol);
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToDetailsScreen copy(java.lang.String assetSymbol) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToDetailsScreen(assetSymbol);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAssetSymbol() {
            return this.assetSymbol;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToDetailsScreen copy$default(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToDetailsScreen navigateToDetailsScreen, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToDetailsScreen.assetSymbol;
            }
            return navigateToDetailsScreen.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect$NavigateToAssetSelectionScreen;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/AssetSelectionOperationType;", "operationType", "<init>", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/AssetSelectionOperationType;)V", "component1", "()Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/AssetSelectionOperationType;", "copy", "(Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/AssetSelectionOperationType;)Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect$NavigateToAssetSelectionScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/AssetSelectionOperationType;", "getOperationType"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToAssetSelectionScreen implements com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect {
        public static final int $stable = 0;
        private final com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType operationType;

        public NavigateToAssetSelectionScreen(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType assetSelectionOperationType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSelectionOperationType, "");
            this.operationType = assetSelectionOperationType;
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType getOperationType() {
            return this.operationType;
        }

        public final java.lang.String toString() {
            com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType assetSelectionOperationType = this.operationType;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToAssetSelectionScreen(operationType=");
            sb.append(assetSelectionOperationType);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.operationType.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToAssetSelectionScreen) && this.operationType == ((com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToAssetSelectionScreen) other).operationType;
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToAssetSelectionScreen copy(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType operationType) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(operationType, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToAssetSelectionScreen(operationType);
        }

        /* renamed from: component1, reason: from getter */
        public final com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType getOperationType() {
            return this.operationType;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToAssetSelectionScreen copy$default(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToAssetSelectionScreen navigateToAssetSelectionScreen, com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.AssetSelectionOperationType assetSelectionOperationType, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                assetSelectionOperationType = navigateToAssetSelectionScreen.operationType;
            }
            return navigateToAssetSelectionScreen.copy(assetSelectionOperationType);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect$NavigateToSendFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToSendFlow implements com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToSendFlow INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToSendFlow();

        public final int hashCode() {
            return -2119557736;
        }

        private NavigateToSendFlow() {
        }

        public final java.lang.String toString() {
            return "NavigateToSendFlow";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToSendFlow)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect$ShowProvisioningFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect;", "", "intent", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect$ShowProvisioningFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowProvisioningFlow implements com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect {
        public static final int $stable = 0;
        private final java.lang.String intent;

        public ShowProvisioningFlow(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.intent = str;
        }

        public final java.lang.String getIntent() {
            return this.intent;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.intent;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("ShowProvisioningFlow(intent=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.intent.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.ShowProvisioningFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.intent, ((com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.ShowProvisioningFlow) other).intent);
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.ShowProvisioningFlow copy(java.lang.String intent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.ShowProvisioningFlow(intent);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getIntent() {
            return this.intent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.ShowProvisioningFlow copy$default(com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.ShowProvisioningFlow showProvisioningFlow, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showProvisioningFlow.intent;
            }
            return showProvisioningFlow.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect$NavigateToPYUSDRewardsSettingsScreen;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToPYUSDRewardsSettingsScreen implements com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToPYUSDRewardsSettingsScreen INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToPYUSDRewardsSettingsScreen();

        public final int hashCode() {
            return -1488540648;
        }

        private NavigateToPYUSDRewardsSettingsScreen() {
        }

        public final java.lang.String toString() {
            return "NavigateToPYUSDRewardsSettingsScreen";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToPYUSDRewardsSettingsScreen)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect$ShowPYUSDRewardsLearnMoreBottomSheet;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowPYUSDRewardsLearnMoreBottomSheet implements com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.ShowPYUSDRewardsLearnMoreBottomSheet INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.ShowPYUSDRewardsLearnMoreBottomSheet();

        public final int hashCode() {
            return -422886635;
        }

        private ShowPYUSDRewardsLearnMoreBottomSheet() {
        }

        public final java.lang.String toString() {
            return "ShowPYUSDRewardsLearnMoreBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.ShowPYUSDRewardsLearnMoreBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect$ShowPYUSDRewardsOptInSuccessBottomSheet;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowPYUSDRewardsOptInSuccessBottomSheet implements com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.ShowPYUSDRewardsOptInSuccessBottomSheet INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.ShowPYUSDRewardsOptInSuccessBottomSheet();

        public final int hashCode() {
            return 1083344495;
        }

        private ShowPYUSDRewardsOptInSuccessBottomSheet() {
        }

        public final java.lang.String toString() {
            return "ShowPYUSDRewardsOptInSuccessBottomSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.ShowPYUSDRewardsOptInSuccessBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect$NavigateToBuyMorePYUSD;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToBuyMorePYUSD implements com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToBuyMorePYUSD INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToBuyMorePYUSD();

        public final int hashCode() {
            return 60550244;
        }

        private NavigateToBuyMorePYUSD() {
        }

        public final java.lang.String toString() {
            return "NavigateToBuyMorePYUSD";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToBuyMorePYUSD)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect$NavigateToCelsiusClaimCodeScreen;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToCelsiusClaimCodeScreen implements com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToCelsiusClaimCodeScreen INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToCelsiusClaimCodeScreen();

        public final int hashCode() {
            return -874170183;
        }

        private NavigateToCelsiusClaimCodeScreen() {
        }

        public final java.lang.String toString() {
            return "NavigateToCelsiusClaimCodeScreen";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToCelsiusClaimCodeScreen)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect$NavigateToErrorScreen;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/hub/model/CryptoHubEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToErrorScreen implements com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToErrorScreen INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToErrorScreen();

        public final int hashCode() {
            return 717270162;
        }

        private NavigateToErrorScreen() {
        }

        public final java.lang.String toString() {
            return "NavigateToErrorScreen";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.hub.model.CryptoHubEffect.NavigateToErrorScreen)) {
                return false;
            }
            return true;
        }
    }
}
