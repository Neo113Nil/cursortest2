package com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model;

@kotlin.Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEvent;", "", "<init>", "()V", "NavigateBack", "CryptoAssetSelected", "NetworkSelectedForReceive", "DismissNetworkSelection", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEvent$CryptoAssetSelected;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEvent$DismissNetworkSelection;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEvent$NavigateBack;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEvent$NetworkSelectedForReceive;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class CryptoAssetSelectionEvent {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEvent$NavigateBack;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEvent.NavigateBack INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEvent.NavigateBack();

        public final int hashCode() {
            return 750407857;
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEvent.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    private CryptoAssetSelectionEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEvent$CryptoAssetSelected;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEvent;", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_ASSET_SYMBOL, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEvent$CryptoAssetSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getAssetSymbol"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CryptoAssetSelected extends com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEvent {
        public static final int $stable = 0;
        private final java.lang.String assetSymbol;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CryptoAssetSelected(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.assetSymbol = str;
        }

        public final java.lang.String getAssetSymbol() {
            return this.assetSymbol;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.assetSymbol;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("CryptoAssetSelected(assetSymbol=");
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
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEvent.CryptoAssetSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.assetSymbol, ((com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEvent.CryptoAssetSelected) other).assetSymbol);
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEvent.CryptoAssetSelected copy(java.lang.String assetSymbol) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(assetSymbol, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEvent.CryptoAssetSelected(assetSymbol);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getAssetSymbol() {
            return this.assetSymbol;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEvent.CryptoAssetSelected copy$default(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEvent.CryptoAssetSelected cryptoAssetSelected, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = cryptoAssetSelected.assetSymbol;
            }
            return cryptoAssetSelected.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEvent$NetworkSelectedForReceive;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEvent;", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_NETWORK_ID, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEvent$NetworkSelectedForReceive;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNetworkId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkSelectedForReceive extends com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEvent {
        public static final int $stable = 0;
        private final java.lang.String networkId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkSelectedForReceive(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.networkId = str;
        }

        public final java.lang.String getNetworkId() {
            return this.networkId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.networkId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkSelectedForReceive(networkId=");
            sb.append(str);
            sb.append(")");
            return sb.toString();
        }

        public final int hashCode() {
            return this.networkId.hashCode();
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEvent.NetworkSelectedForReceive) && kotlin.jvm.internal.Intrinsics.areEqual(this.networkId, ((com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEvent.NetworkSelectedForReceive) other).networkId);
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEvent.NetworkSelectedForReceive copy(java.lang.String networkId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkId, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEvent.NetworkSelectedForReceive(networkId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getNetworkId() {
            return this.networkId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEvent.NetworkSelectedForReceive copy$default(com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEvent.NetworkSelectedForReceive networkSelectedForReceive, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = networkSelectedForReceive.networkId;
            }
            return networkSelectedForReceive.copy(str);
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEvent$DismissNetworkSelection;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/assetselection/model/CryptoAssetSelectionEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class DismissNetworkSelection extends com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEvent.DismissNetworkSelection INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEvent.DismissNetworkSelection();

        public final int hashCode() {
            return 931151183;
        }

        private DismissNetworkSelection() {
            super(null);
        }

        public final java.lang.String toString() {
            return "DismissNetworkSelection";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.assetselection.model.CryptoAssetSelectionEvent.DismissNetworkSelection)) {
                return false;
            }
            return true;
        }
    }

    public /* synthetic */ CryptoAssetSelectionEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
