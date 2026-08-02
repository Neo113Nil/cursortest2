package com.paypal.oslo.core.network.connectivity;

@kotlin.Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\n\u0010\bR\u0014\u0010\r\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/paypal/oslo/core/network/connectivity/DefaultNetworkConnectivityChecker;", "Lcom/paypal/oslo/core/network/connectivity/NetworkConnectivityChecker;", "Lcom/paypal/oslo/core/network/connectivity/NetworkStateProvider;", "networkStateProvider", "<init>", "(Lcom/paypal/oslo/core/network/connectivity/NetworkStateProvider;)V", "", "isConnected", "()Z", "isConnectedViaWifi", "isConnectedViaCellular", "getHighSpeedVideoSizes", "Lcom/paypal/oslo/core/network/connectivity/NetworkStateProvider;", "Camera2StreamConfigurationMap"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DefaultNetworkConnectivityChecker implements com.paypal.oslo.core.network.connectivity.NetworkConnectivityChecker {

    /* renamed from: getHighSpeedVideoSizes, reason: from kotlin metadata */
    private final com.paypal.oslo.core.network.connectivity.NetworkStateProvider Camera2StreamConfigurationMap;

    @javax.inject.Inject
    public DefaultNetworkConnectivityChecker(com.paypal.oslo.core.network.connectivity.NetworkStateProvider networkStateProvider) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkStateProvider, "");
        this.Camera2StreamConfigurationMap = networkStateProvider;
    }

    @Override // com.paypal.oslo.core.network.connectivity.NetworkConnectivityChecker
    public final boolean isConnected() {
        return this.Camera2StreamConfigurationMap.currentState().isConnected();
    }

    @Override // com.paypal.oslo.core.network.connectivity.NetworkConnectivityChecker
    public final boolean isConnectedViaWifi() {
        com.paypal.oslo.core.network.connectivity.NetworkState currentState = this.Camera2StreamConfigurationMap.currentState();
        return currentState.isConnected() && currentState.getTransport() == com.paypal.oslo.core.network.connectivity.NetworkTransport.WIFI;
    }

    @Override // com.paypal.oslo.core.network.connectivity.NetworkConnectivityChecker
    public final boolean isConnectedViaCellular() {
        com.paypal.oslo.core.network.connectivity.NetworkState currentState = this.Camera2StreamConfigurationMap.currentState();
        return currentState.isConnected() && currentState.getTransport() == com.paypal.oslo.core.network.connectivity.NetworkTransport.CELLULAR;
    }
}
