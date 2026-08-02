package com.paypal.oslo.core.network.connectivity;

@kotlin.Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014JF\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00022\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001e\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b\u0003\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R\u001a\u0010\u0007\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010%\u001a\u0004\b'\u0010\u0014"}, d2 = {"Lcom/paypal/oslo/core/network/connectivity/NetworkState;", "", "", "isConnected", "Lcom/paypal/oslo/core/network/connectivity/NetworkTransport;", androidx.core.app.NotificationCompat.CATEGORY_TRANSPORT, "Lcom/paypal/oslo/core/network/connectivity/NetworkQuality;", com.daon.sdk.face.license.License.FEATURE_QUALITY, "", "downstreamKbps", "upstreamKbps", "<init>", "(ZLcom/paypal/oslo/core/network/connectivity/NetworkTransport;Lcom/paypal/oslo/core/network/connectivity/NetworkQuality;Ljava/lang/Integer;Ljava/lang/Integer;)V", "component1", "()Z", "component2", "()Lcom/paypal/oslo/core/network/connectivity/NetworkTransport;", "component3", "()Lcom/paypal/oslo/core/network/connectivity/NetworkQuality;", "component4", "()Ljava/lang/Integer;", "component5", "copy", "(ZLcom/paypal/oslo/core/network/connectivity/NetworkTransport;Lcom/paypal/oslo/core/network/connectivity/NetworkQuality;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/paypal/oslo/core/network/connectivity/NetworkState;", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Z", "Lcom/paypal/oslo/core/network/connectivity/NetworkTransport;", "getTransport", "Lcom/paypal/oslo/core/network/connectivity/NetworkQuality;", "getQuality", "Ljava/lang/Integer;", "getDownstreamKbps", "getUpstreamKbps"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class NetworkState {
    private final java.lang.Integer downstreamKbps;
    private final boolean isConnected;
    private final com.paypal.oslo.core.network.connectivity.NetworkQuality quality;
    private final com.paypal.oslo.core.network.connectivity.NetworkTransport transport;
    private final java.lang.Integer upstreamKbps;

    public NetworkState(boolean z, com.paypal.oslo.core.network.connectivity.NetworkTransport networkTransport, com.paypal.oslo.core.network.connectivity.NetworkQuality networkQuality, java.lang.Integer num, java.lang.Integer num2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkTransport, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkQuality, "");
        this.isConnected = z;
        this.transport = networkTransport;
        this.quality = networkQuality;
        this.downstreamKbps = num;
        this.upstreamKbps = num2;
    }

    public final boolean isConnected() {
        return this.isConnected;
    }

    public final com.paypal.oslo.core.network.connectivity.NetworkTransport getTransport() {
        return this.transport;
    }

    public final com.paypal.oslo.core.network.connectivity.NetworkQuality getQuality() {
        return this.quality;
    }

    public final java.lang.Integer getDownstreamKbps() {
        return this.downstreamKbps;
    }

    public final java.lang.Integer getUpstreamKbps() {
        return this.upstreamKbps;
    }

    public final java.lang.String toString() {
        boolean z = this.isConnected;
        com.paypal.oslo.core.network.connectivity.NetworkTransport networkTransport = this.transport;
        com.paypal.oslo.core.network.connectivity.NetworkQuality networkQuality = this.quality;
        java.lang.Integer num = this.downstreamKbps;
        java.lang.Integer num2 = this.upstreamKbps;
        java.lang.StringBuilder sb = new java.lang.StringBuilder("NetworkState(isConnected=");
        sb.append(z);
        sb.append(", transport=");
        sb.append(networkTransport);
        sb.append(", quality=");
        sb.append(networkQuality);
        sb.append(", downstreamKbps=");
        sb.append(num);
        sb.append(", upstreamKbps=");
        sb.append(num2);
        sb.append(")");
        return sb.toString();
    }

    public final int hashCode() {
        int hashCode = java.lang.Boolean.hashCode(this.isConnected);
        int hashCode2 = this.transport.hashCode();
        int hashCode3 = this.quality.hashCode();
        java.lang.Integer num = this.downstreamKbps;
        int hashCode4 = num == null ? 0 : num.hashCode();
        java.lang.Integer num2 = this.upstreamKbps;
        return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + (num2 != null ? num2.hashCode() : 0);
    }

    public final boolean equals(java.lang.Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof com.paypal.oslo.core.network.connectivity.NetworkState)) {
            return false;
        }
        com.paypal.oslo.core.network.connectivity.NetworkState networkState = (com.paypal.oslo.core.network.connectivity.NetworkState) other;
        return this.isConnected == networkState.isConnected && this.transport == networkState.transport && this.quality == networkState.quality && kotlin.jvm.internal.Intrinsics.areEqual(this.downstreamKbps, networkState.downstreamKbps) && kotlin.jvm.internal.Intrinsics.areEqual(this.upstreamKbps, networkState.upstreamKbps);
    }

    public final com.paypal.oslo.core.network.connectivity.NetworkState copy(boolean isConnected, com.paypal.oslo.core.network.connectivity.NetworkTransport transport, com.paypal.oslo.core.network.connectivity.NetworkQuality quality, java.lang.Integer downstreamKbps, java.lang.Integer upstreamKbps) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(transport, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(quality, "");
        return new com.paypal.oslo.core.network.connectivity.NetworkState(isConnected, transport, quality, downstreamKbps, upstreamKbps);
    }

    /* renamed from: component5, reason: from getter */
    public final java.lang.Integer getUpstreamKbps() {
        return this.upstreamKbps;
    }

    /* renamed from: component4, reason: from getter */
    public final java.lang.Integer getDownstreamKbps() {
        return this.downstreamKbps;
    }

    /* renamed from: component3, reason: from getter */
    public final com.paypal.oslo.core.network.connectivity.NetworkQuality getQuality() {
        return this.quality;
    }

    /* renamed from: component2, reason: from getter */
    public final com.paypal.oslo.core.network.connectivity.NetworkTransport getTransport() {
        return this.transport;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsConnected() {
        return this.isConnected;
    }

    public static /* synthetic */ com.paypal.oslo.core.network.connectivity.NetworkState copy$default(com.paypal.oslo.core.network.connectivity.NetworkState networkState, boolean z, com.paypal.oslo.core.network.connectivity.NetworkTransport networkTransport, com.paypal.oslo.core.network.connectivity.NetworkQuality networkQuality, java.lang.Integer num, java.lang.Integer num2, int i, java.lang.Object obj) {
        if ((i & 1) != 0) {
            z = networkState.isConnected;
        }
        if ((i & 2) != 0) {
            networkTransport = networkState.transport;
        }
        com.paypal.oslo.core.network.connectivity.NetworkTransport networkTransport2 = networkTransport;
        if ((i & 4) != 0) {
            networkQuality = networkState.quality;
        }
        com.paypal.oslo.core.network.connectivity.NetworkQuality networkQuality2 = networkQuality;
        if ((i & 8) != 0) {
            num = networkState.downstreamKbps;
        }
        java.lang.Integer num3 = num;
        if ((i & 16) != 0) {
            num2 = networkState.upstreamKbps;
        }
        return networkState.copy(z, networkTransport2, networkQuality2, num3, num2);
    }
}
