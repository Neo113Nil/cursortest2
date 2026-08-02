package com.paypal.oslo.core.network.connectivity;

@kotlin.Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0005\u001a\u00020\u0004*\u00020\u0000H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0007H\u0000¢\u0006\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Landroid/net/NetworkCapabilities;", "Lcom/paypal/oslo/core/network/connectivity/NetworkState;", "toNetworkState", "(Landroid/net/NetworkCapabilities;)Lcom/paypal/oslo/core/network/connectivity/NetworkState;", "Lcom/paypal/oslo/core/network/connectivity/NetworkTransport;", "toNetworkTransport", "(Landroid/net/NetworkCapabilities;)Lcom/paypal/oslo/core/network/connectivity/NetworkTransport;", "", "Lcom/paypal/oslo/core/network/connectivity/NetworkQuality;", "toQuality", "(I)Lcom/paypal/oslo/core/network/connectivity/NetworkQuality;", "getHighSpeedVideoFpsRanges", "Lcom/paypal/oslo/core/network/connectivity/NetworkState;", "getHighResolutionOutputSizeshNQ4ISI"}, k = 2, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DefaultNetworkStateProviderKt {
    private static final com.paypal.oslo.core.network.connectivity.NetworkState getHighSpeedVideoFpsRanges = new com.paypal.oslo.core.network.connectivity.NetworkState(false, com.paypal.oslo.core.network.connectivity.NetworkTransport.NONE, com.paypal.oslo.core.network.connectivity.NetworkQuality.OFFLINE, null, null);

    public static final com.paypal.oslo.core.network.connectivity.NetworkState toNetworkState(android.net.NetworkCapabilities networkCapabilities) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkCapabilities, "");
        if (!networkCapabilities.hasCapability(12) || !networkCapabilities.hasCapability(16)) {
            return getHighSpeedVideoFpsRanges;
        }
        com.paypal.oslo.core.network.connectivity.NetworkTransport networkTransport = toNetworkTransport(networkCapabilities);
        int linkDownstreamBandwidthKbps = networkCapabilities.getLinkDownstreamBandwidthKbps();
        return new com.paypal.oslo.core.network.connectivity.NetworkState(true, networkTransport, toQuality(linkDownstreamBandwidthKbps), java.lang.Integer.valueOf(linkDownstreamBandwidthKbps), java.lang.Integer.valueOf(networkCapabilities.getLinkUpstreamBandwidthKbps()));
    }

    public static final com.paypal.oslo.core.network.connectivity.NetworkTransport toNetworkTransport(android.net.NetworkCapabilities networkCapabilities) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkCapabilities, "");
        return networkCapabilities.hasTransport(1) ? com.paypal.oslo.core.network.connectivity.NetworkTransport.WIFI : networkCapabilities.hasTransport(0) ? com.paypal.oslo.core.network.connectivity.NetworkTransport.CELLULAR : networkCapabilities.hasTransport(3) ? com.paypal.oslo.core.network.connectivity.NetworkTransport.ETHERNET : networkCapabilities.hasTransport(2) ? com.paypal.oslo.core.network.connectivity.NetworkTransport.BLUETOOTH : com.paypal.oslo.core.network.connectivity.NetworkTransport.UNKNOWN;
    }

    public static final com.paypal.oslo.core.network.connectivity.NetworkQuality toQuality(int i) {
        if (i <= 150) {
            return com.paypal.oslo.core.network.connectivity.NetworkQuality.SLOW;
        }
        if (i <= 2048) {
            return com.paypal.oslo.core.network.connectivity.NetworkQuality.MODERATE;
        }
        return com.paypal.oslo.core.network.connectivity.NetworkQuality.FAST;
    }
}
