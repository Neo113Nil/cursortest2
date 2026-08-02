package com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0005\u0004\u0005\u0006\u0007\bB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0005\t\n\u000b\f\r"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEffect;", "", "<init>", "()V", "NavigateBack", "NavigateToBuyAmountEntry", "NavigateToSellAmountEntry", "NavigateToReceiveScreen", "ShowNetworkSelectionSheet", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEffect$NavigateBack;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEffect$NavigateToBuyAmountEntry;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEffect$NavigateToReceiveScreen;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEffect$NavigateToSellAmountEntry;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEffect$ShowNetworkSelectionSheet;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class CryptoAssetSelectionEffect {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEffect$NavigateBack;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateBack INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateBack();

        public final int hashCode() {
            return -475589584;
        }

        private NavigateBack() {
            super(null);
        }

        public final java.lang.String toString() {
            return "NavigateBack";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    private CryptoAssetSelectionEffect() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEffect$NavigateToBuyAmountEntry;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEffect;", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEffect$NavigateToBuyAmountEntry;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAssetSymbol"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToBuyAmountEntry extends com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect {
        public static final int $stable = 0;
        private final java.lang.String assetSymbol;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToBuyAmountEntry(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.assetSymbol = str;
        }

        public final java.lang.String getAssetSymbol() {
            return this.assetSymbol;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.assetSymbol;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToBuyAmountEntry(assetSymbol=");
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
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToBuyAmountEntry) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, ((com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToBuyAmountEntry) other).assetSymbol);
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToBuyAmountEntry copy(java.lang.String assetSymbol) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToBuyAmountEntry(assetSymbol);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAssetSymbol() {
            return this.assetSymbol;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToBuyAmountEntry copy$default(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToBuyAmountEntry navigateToBuyAmountEntry, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToBuyAmountEntry.assetSymbol;
            }
            return navigateToBuyAmountEntry.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEffect$NavigateToSellAmountEntry;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEffect;", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEffect$NavigateToSellAmountEntry;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAssetSymbol"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToSellAmountEntry extends com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect {
        public static final int $stable = 0;
        private final java.lang.String assetSymbol;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToSellAmountEntry(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.assetSymbol = str;
        }

        public final java.lang.String getAssetSymbol() {
            return this.assetSymbol;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.assetSymbol;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToSellAmountEntry(assetSymbol=");
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
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToSellAmountEntry) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, ((com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToSellAmountEntry) other).assetSymbol);
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToSellAmountEntry copy(java.lang.String assetSymbol) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToSellAmountEntry(assetSymbol);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAssetSymbol() {
            return this.assetSymbol;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToSellAmountEntry copy$default(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToSellAmountEntry navigateToSellAmountEntry, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToSellAmountEntry.assetSymbol;
            }
            return navigateToSellAmountEntry.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\nJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\nJ:\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\nR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001c\u0010\nR\u001a\u0010\u0006\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001d\u0010\n"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEffect$NavigateToReceiveScreen;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEffect;", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_NETWORK_ID, "assetName", "logoUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEffect$NavigateToReceiveScreen;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAssetSymbol", "getNetworkId", "getAssetName", "getLogoUrl"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateToReceiveScreen extends com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect {
        public static final int $stable = 0;
        private final java.lang.String assetName;
        private final java.lang.String assetSymbol;
        private final java.lang.String logoUrl;
        private final java.lang.String networkId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NavigateToReceiveScreen(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str3, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str4, "");
            this.assetSymbol = str;
            this.networkId = str2;
            this.assetName = str3;
            this.logoUrl = str4;
        }

        public /* synthetic */ NavigateToReceiveScreen(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
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
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NavigateToReceiveScreen(assetSymbol=");
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToReceiveScreen)) {
                return false;
            }
            com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToReceiveScreen navigateToReceiveScreen = (com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToReceiveScreen) other;
            return kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, navigateToReceiveScreen.assetSymbol) && kotlin.jvm.internal.Intrinsics.areEqual(this.networkId, navigateToReceiveScreen.networkId) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetName, navigateToReceiveScreen.assetName) && kotlin.jvm.internal.Intrinsics.areEqual(this.logoUrl, navigateToReceiveScreen.logoUrl);
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToReceiveScreen copy(java.lang.String assetSymbol, java.lang.String networkId, java.lang.String assetName, java.lang.String logoUrl) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetName, "");
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(logoUrl, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToReceiveScreen(assetSymbol, networkId, assetName, logoUrl);
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

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToReceiveScreen copy$default(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.NavigateToReceiveScreen navigateToReceiveScreen, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = navigateToReceiveScreen.assetSymbol;
            }
            if ((i & 2) != 0) {
                str2 = navigateToReceiveScreen.networkId;
            }
            if ((i & 4) != 0) {
                str3 = navigateToReceiveScreen.assetName;
            }
            if ((i & 8) != 0) {
                str4 = navigateToReceiveScreen.logoUrl;
            }
            return navigateToReceiveScreen.copy(str, str2, str3, str4);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEffect$ShowNetworkSelectionSheet;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEffect;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShowNetworkSelectionSheet extends com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.ShowNetworkSelectionSheet INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.ShowNetworkSelectionSheet();

        public final int hashCode() {
            return 140745420;
        }

        private ShowNetworkSelectionSheet() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ShowNetworkSelectionSheet";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEffect.ShowNetworkSelectionSheet)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ CryptoAssetSelectionEffect(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
