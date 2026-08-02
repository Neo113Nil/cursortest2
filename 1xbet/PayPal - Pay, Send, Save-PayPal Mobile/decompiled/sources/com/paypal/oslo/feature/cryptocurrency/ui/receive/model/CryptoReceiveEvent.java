package com.paypal.oslo.feature.cryptocurrency.ui.receive.model;

@kotlin.Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b6\u0018\u00002\u00020\u0001:\u0007\u0004\u0005\u0006\u0007\b\t\nB\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0007\u000b\f\r\u000e\u000f\u0010\u0011"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEvent;", "", "<init>", "()V", "NavigateBack", "CopyAddressClick", "CopyMemoClick", "ShareAddressClick", "HowReceivingWorksClick", "ChangeNetworkClick", "NetworkSelected", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEvent$ChangeNetworkClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEvent$CopyAddressClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEvent$CopyMemoClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEvent$HowReceivingWorksClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEvent$NavigateBack;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEvent$NetworkSelected;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEvent$ShareAddressClick;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes12.dex */
public abstract class CryptoReceiveEvent {
    public static final int $stable = 0;

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEvent$NavigateBack;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NavigateBack extends com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent.NavigateBack INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent.NavigateBack();

        public final int hashCode() {
            return -1536489937;
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
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent.NavigateBack)) {
                return false;
            }
            return true;
        }
    }

    private CryptoReceiveEvent() {
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEvent$CopyAddressClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CopyAddressClick extends com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent.CopyAddressClick INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent.CopyAddressClick();

        public final int hashCode() {
            return -2042674496;
        }

        private CopyAddressClick() {
            super(null);
        }

        public final java.lang.String toString() {
            return "CopyAddressClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent.CopyAddressClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEvent$CopyMemoClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class CopyMemoClick extends com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent.CopyMemoClick INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent.CopyMemoClick();

        public final int hashCode() {
            return 196073250;
        }

        private CopyMemoClick() {
            super(null);
        }

        public final java.lang.String toString() {
            return "CopyMemoClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent.CopyMemoClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEvent$ShareAddressClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ShareAddressClick extends com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent.ShareAddressClick INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent.ShareAddressClick();

        public final int hashCode() {
            return -95501924;
        }

        private ShareAddressClick() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ShareAddressClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent.ShareAddressClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEvent$HowReceivingWorksClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class HowReceivingWorksClick extends com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent.HowReceivingWorksClick INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent.HowReceivingWorksClick();

        public final int hashCode() {
            return 384762669;
        }

        private HowReceivingWorksClick() {
            super(null);
        }

        public final java.lang.String toString() {
            return "HowReceivingWorksClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent.HowReceivingWorksClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÖ\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEvent$ChangeNetworkClick;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEvent;", "<init>", "()V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class ChangeNetworkClick extends com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent {
        public static final int $stable = 0;
        public static final com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent.ChangeNetworkClick INSTANCE = new com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent.ChangeNetworkClick();

        public final int hashCode() {
            return -1681921343;
        }

        private ChangeNetworkClick() {
            super(null);
        }

        public final java.lang.String toString() {
            return "ChangeNetworkClick";
        }

        public final boolean equals(java.lang.Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent.ChangeNetworkClick)) {
                return false;
            }
            return true;
        }
    }

    @kotlin.Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0007"}, d2 = {"Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEvent$NetworkSelected;", "Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEvent;", "", com.paypal.oslo.feature.cryptocurrency.ui.receive.CryptoReceiveViewModel.LOG_KEY_NETWORK_ID, "<init>", "(Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "copy", "(Ljava/lang/String;)Lcom/paypal/oslo/feature/cryptocurrency/ui/receive/model/CryptoReceiveEvent$NetworkSelected;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "Ljava/lang/String;", "getNetworkId"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final /* data */ class NetworkSelected extends com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent {
        public static final int $stable = 0;
        private final java.lang.String networkId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public NetworkSelected(java.lang.String str) {
            super(null);
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
            this.networkId = str;
        }

        public final java.lang.String getNetworkId() {
            return this.networkId;
        }

        public final java.lang.String toString() {
            java.lang.String str = this.networkId;
            java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkSelected(networkId=");
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
            return (other instanceof com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent.NetworkSelected) && kotlin.jvm.internal.Intrinsics.areEqual(this.networkId, ((com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent.NetworkSelected) other).networkId);
        }

        public final com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent.NetworkSelected copy(java.lang.String networkId) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkId, "");
            return new com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent.NetworkSelected(networkId);
        }

        /* renamed from: component1, reason: from getter */
        public final java.lang.String getNetworkId() {
            return this.networkId;
        }

        public static /* synthetic */ com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent.NetworkSelected copy$default(com.paypal.oslo.feature.cryptocurrency.ui.receive.model.CryptoReceiveEvent.NetworkSelected networkSelected, java.lang.String str, int i, java.lang.Object obj) {
            if ((i & 1) != 0) {
                str = networkSelected.networkId;
            }
            return networkSelected.copy(str);
        }
    }

    public /* synthetic */ CryptoReceiveEvent(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
