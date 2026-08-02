package com.paypal.oslo.feature.cryptocurrency.ui.details.model;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\bv\u0018\u00002\u00020\u0001:\r\u0002\u0003\u0004\u0005\u0006\u0007\b\t\n\u000b\f\r\u000e\u0082\u0001\r\u000f\u0010\u0011\u0012\u0013\u0014\u0015\u0016\u0017\u0018\u0019\u001a\u001bÀ\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect;", "", "NavigateToBuyFlow", "NavigateToSellFlow", "NavigateToReceiveFlow", "ShowNetworkSelectionSheet", "NavigateToSendFlow", "NavigateToConvertFlow", "NavigateToRecurringBuys", "NavigateBack", "ShowProvisioningFlow", "ShowPYUSDRewardsLearnMoreBottomSheet", "ShowPYUSDRewardsOptInSuccessBottomSheet", "NavigateToBuyMorePYUSD", "NavigateToErrorScreen", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$NavigateBack;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$NavigateToBuyFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$NavigateToBuyMorePYUSD;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$NavigateToConvertFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$NavigateToErrorScreen;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$NavigateToReceiveFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$NavigateToRecurringBuys;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$NavigateToSellFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$NavigateToSendFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$ShowNetworkSelectionSheet;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$ShowPYUSDRewardsLearnMoreBottomSheet;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$ShowPYUSDRewardsOptInSuccessBottomSheet;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$ShowProvisioningFlow;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface AssetPriceDetailsEffect {

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$NavigateToBuyFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect;", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$NavigateToBuyFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAssetSymbol"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToBuyFlow implements com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect {
        public static final int $stable = 0;
        private final java.lang.String assetSymbol;

        public NavigateToBuyFlow(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.assetSymbol = str;
        }

        public final java.lang.String getAssetSymbol() {
            return this.assetSymbol;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.assetSymbol;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToBuyFlow(assetSymbol=");
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
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToBuyFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, ((com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToBuyFlow) other).assetSymbol);
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToBuyFlow copy(java.lang.String assetSymbol) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToBuyFlow(assetSymbol);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAssetSymbol() {
            return this.assetSymbol;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToBuyFlow copy$default(com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToBuyFlow navigateToBuyFlow, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToBuyFlow.assetSymbol;
            }
            return navigateToBuyFlow.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$NavigateToSellFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect;", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$NavigateToSellFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAssetSymbol"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToSellFlow implements com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect {
        public static final int $stable = 0;
        private final java.lang.String assetSymbol;

        public NavigateToSellFlow(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.assetSymbol = str;
        }

        public final java.lang.String getAssetSymbol() {
            return this.assetSymbol;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.assetSymbol;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToSellFlow(assetSymbol=");
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
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToSellFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, ((com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToSellFlow) other).assetSymbol);
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToSellFlow copy(java.lang.String assetSymbol) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToSellFlow(assetSymbol);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAssetSymbol() {
            return this.assetSymbol;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToSellFlow copy$default(com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToSellFlow navigateToSellFlow, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToSellFlow.assetSymbol;
            }
            return navigateToSellFlow.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ:\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$NavigateToReceiveFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect;", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_NETWORK_ID, "assetName", "logoUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$NavigateToReceiveFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAssetSymbol", "getNetworkId", "getAssetName", "getLogoUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToReceiveFlow implements com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect {
        public static final int $stable = 0;
        private final java.lang.String assetName;
        private final java.lang.String assetSymbol;
        private final java.lang.String logoUrl;
        private final java.lang.String networkId;

        public NavigateToReceiveFlow(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.assetSymbol = str;
            this.networkId = str2;
            this.assetName = str3;
            this.logoUrl = str4;
        }

        public /* synthetic */ NavigateToReceiveFlow(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? "" : str4);
        }

        public final java.lang.String getAssetSymbol() {
            return this.assetSymbol;
        }

        public final java.lang.String getNetworkId() {
            return this.networkId;
        }

        public final java.lang.String getAssetName() {
            return this.assetName;
        }

        public final java.lang.String getLogoUrl() {
            return this.logoUrl;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.assetSymbol;
            java.lang.String str2 = this.networkId;
            java.lang.String str3 = this.assetName;
            java.lang.String str4 = this.logoUrl;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToReceiveFlow(assetSymbol=");
            sb.append(str);
            sb.append(", networkId=");
            sb.append(str2);
            sb.append(", assetName=");
            sb.append(str3);
            sb.append(", logoUrl=");
            sb.append(str4);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            int hashCode = this.assetSymbol.hashCode();
            java.lang.String str = this.networkId;
            return (((((hashCode * 31) + (str == null ? 0 : str.hashCode())) * 31) + this.assetName.hashCode()) * 31) + this.logoUrl.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToReceiveFlow)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToReceiveFlow navigateToReceiveFlow = (com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToReceiveFlow) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, navigateToReceiveFlow.assetSymbol) && kotlin.jvm.internal.Intrinsics.areEqual(this.networkId, navigateToReceiveFlow.networkId) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetName, navigateToReceiveFlow.assetName) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoUrl, navigateToReceiveFlow.logoUrl);
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToReceiveFlow copy(java.lang.String assetSymbol, java.lang.String networkId, java.lang.String assetName, java.lang.String logoUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logoUrl, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToReceiveFlow(assetSymbol, networkId, assetName, logoUrl);
        }

        /* renamed from: component4, reason: from getter */
        public final java.lang.String getLogoUrl() {
            return this.logoUrl;
        }

        /* renamed from: component3, reason: from getter */
        public final java.lang.String getAssetName() {
            return this.assetName;
        }

        /* renamed from: component2, reason: from getter */
        public final java.lang.String getNetworkId() {
            return this.networkId;
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAssetSymbol() {
            return this.assetSymbol;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToReceiveFlow copy$default(com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToReceiveFlow navigateToReceiveFlow, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToReceiveFlow.assetSymbol;
            }
            if ((i & 2) != 0) {
                str2 = navigateToReceiveFlow.networkId;
            }
            if ((i & 4) != 0) {
                str3 = navigateToReceiveFlow.assetName;
            }
            if ((i & 8) != 0) {
                str4 = navigateToReceiveFlow.logoUrl;
            }
            return navigateToReceiveFlow.copy(str, str2, str3, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$ShowNetworkSelectionSheet;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowNetworkSelectionSheet implements com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.ShowNetworkSelectionSheet INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.ShowNetworkSelectionSheet();

        public final int hashCode() {
            return -1730028912;
        }

        private ShowNetworkSelectionSheet() {
        }

        public final java.lang.String toString() {
            return "ShowNetworkSelectionSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.ShowNetworkSelectionSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$NavigateToSendFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect;", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$NavigateToSendFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAssetSymbol"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToSendFlow implements com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect {
        public static final int $stable = 0;
        private final java.lang.String assetSymbol;

        public NavigateToSendFlow(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.assetSymbol = str;
        }

        public final java.lang.String getAssetSymbol() {
            return this.assetSymbol;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.assetSymbol;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToSendFlow(assetSymbol=");
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
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToSendFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, ((com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToSendFlow) other).assetSymbol);
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToSendFlow copy(java.lang.String assetSymbol) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToSendFlow(assetSymbol);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAssetSymbol() {
            return this.assetSymbol;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToSendFlow copy$default(com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToSendFlow navigateToSendFlow, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToSendFlow.assetSymbol;
            }
            return navigateToSendFlow.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$NavigateToConvertFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect;", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$NavigateToConvertFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAssetSymbol"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToConvertFlow implements com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect {
        public static final int $stable = 0;
        private final java.lang.String assetSymbol;

        public NavigateToConvertFlow(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.assetSymbol = str;
        }

        public final java.lang.String getAssetSymbol() {
            return this.assetSymbol;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.assetSymbol;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToConvertFlow(assetSymbol=");
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
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToConvertFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, ((com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToConvertFlow) other).assetSymbol);
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToConvertFlow copy(java.lang.String assetSymbol) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToConvertFlow(assetSymbol);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAssetSymbol() {
            return this.assetSymbol;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToConvertFlow copy$default(com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToConvertFlow navigateToConvertFlow, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToConvertFlow.assetSymbol;
            }
            return navigateToConvertFlow.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$NavigateToRecurringBuys;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect;", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$NavigateToRecurringBuys;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAssetSymbol"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToRecurringBuys implements com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect {
        public static final int $stable = 0;
        private final java.lang.String assetSymbol;

        public NavigateToRecurringBuys(java.lang.String str) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.assetSymbol = str;
        }

        public final java.lang.String getAssetSymbol() {
            return this.assetSymbol;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.assetSymbol;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToRecurringBuys(assetSymbol=");
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
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToRecurringBuys) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, ((com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToRecurringBuys) other).assetSymbol);
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToRecurringBuys copy(java.lang.String assetSymbol) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToRecurringBuys(assetSymbol);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAssetSymbol() {
            return this.assetSymbol;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToRecurringBuys copy$default(com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToRecurringBuys navigateToRecurringBuys, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToRecurringBuys.assetSymbol;
            }
            return navigateToRecurringBuys.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$NavigateBack;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack implements com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateBack();

        public final int hashCode() {
            return -1582791188;
        }

        private NavigateBack() {
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$ShowProvisioningFlow;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect;", "", "intent", "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$ShowProvisioningFlow;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getIntent"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowProvisioningFlow implements com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect {
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
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.ShowProvisioningFlow) && kotlin.jvm.internal.Intrinsics.areEqual(this.intent, ((com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.ShowProvisioningFlow) other).intent);
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.ShowProvisioningFlow copy(java.lang.String intent) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(intent, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.ShowProvisioningFlow(intent);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getIntent() {
            return this.intent;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.ShowProvisioningFlow copy$default(com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.ShowProvisioningFlow showProvisioningFlow, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = showProvisioningFlow.intent;
            }
            return showProvisioningFlow.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$ShowPYUSDRewardsLearnMoreBottomSheet;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowPYUSDRewardsLearnMoreBottomSheet implements com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.ShowPYUSDRewardsLearnMoreBottomSheet INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.ShowPYUSDRewardsLearnMoreBottomSheet();

        public final int hashCode() {
            return -1333621837;
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.ShowPYUSDRewardsLearnMoreBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$ShowPYUSDRewardsOptInSuccessBottomSheet;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowPYUSDRewardsOptInSuccessBottomSheet implements com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.ShowPYUSDRewardsOptInSuccessBottomSheet INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.ShowPYUSDRewardsOptInSuccessBottomSheet();

        public final int hashCode() {
            return 679350545;
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.ShowPYUSDRewardsOptInSuccessBottomSheet)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$NavigateToBuyMorePYUSD;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToBuyMorePYUSD implements com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToBuyMorePYUSD INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToBuyMorePYUSD();

        public final int hashCode() {
            return -595230334;
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToBuyMorePYUSD)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect$NavigateToErrorScreen;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/details/model/AssetPriceDetailsEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToErrorScreen implements com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToErrorScreen INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToErrorScreen();

        public final int hashCode() {
            return -1243546700;
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.details.model.AssetPriceDetailsEffect.NavigateToErrorScreen)) {
                return false;
            }
            return true;
        }
    }
}
