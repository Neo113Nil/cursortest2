package com.paypal.oslo.core.network.connectivity;

@kotlin.Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0013\b\u0007\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\f\u0010\bR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0012\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0015"}, d2 = {"Lcom/paypal/oslo/core/network/connectivity/DefaultNetworkStateProvider;", "Lcom/paypal/oslo/core/network/connectivity/NetworkStateProvider;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lcom/paypal/oslo/core/network/connectivity/NetworkState;", "currentState", "()Lcom/paypal/oslo/core/network/connectivity/NetworkState;", "Lkotlinx/coroutines/flow/StateFlow;", "observeState", "()Lkotlinx/coroutines/flow/StateFlow;", "getHighSpeedVideoSizes", "Landroid/net/ConnectivityManager;", "getHighSpeedVideoFpsRanges", "Landroid/net/ConnectivityManager;", "getHighResolutionOutputSizeshNQ4ISI", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Camera2StreamConfigurationMap", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/paypal/oslo/core/network/connectivity/DefaultNetworkStateProvider$networkCallback$1;", "Lcom/paypal/oslo/core/network/connectivity/DefaultNetworkStateProvider$networkCallback$1;"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DefaultNetworkStateProvider implements com.paypal.oslo.core.network.connectivity.NetworkStateProvider {

    /* renamed from: Camera2StreamConfigurationMap, reason: from kotlin metadata */
    private final kotlinx.coroutines.flow.MutableStateFlow<com.paypal.oslo.core.network.connectivity.NetworkState> getHighSpeedVideoFpsRanges;

    /* renamed from: getHighResolutionOutputSizeshNQ4ISI, reason: from kotlin metadata */
    private final com.paypal.oslo.core.network.connectivity.DefaultNetworkStateProvider$networkCallback$1 Camera2StreamConfigurationMap;

    /* renamed from: getHighSpeedVideoFpsRanges, reason: from kotlin metadata */
    private final android.net.ConnectivityManager getHighResolutionOutputSizeshNQ4ISI;

    /* JADX WARN: Type inference failed for: r0v4, types: [com.paypal.oslo.core.network.connectivity.DefaultNetworkStateProvider$networkCallback$1] */
    @javax.inject.Inject
    public DefaultNetworkStateProvider(@dagger.hilt.android.qualifiers.ApplicationContext android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "");
        android.net.ConnectivityManager connectivityManager = (android.net.ConnectivityManager) androidx.core.content.ContextCompat.getSystemService(context, android.net.ConnectivityManager.class);
        this.getHighResolutionOutputSizeshNQ4ISI = connectivityManager;
        this.getHighSpeedVideoFpsRanges = kotlinx.coroutines.flow.StateFlowKt.MutableStateFlow(getHighSpeedVideoSizes());
        ?? r0 = new android.net.ConnectivityManager.NetworkCallback() { // from class: com.paypal.oslo.core.network.connectivity.DefaultNetworkStateProvider$networkCallback$1
            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onCapabilitiesChanged(android.net.Network network, android.net.NetworkCapabilities networkCapabilities) {
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(network, "");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(networkCapabilities, "");
                mutableStateFlow = com.paypal.oslo.core.network.connectivity.DefaultNetworkStateProvider.this.getHighSpeedVideoFpsRanges;
                mutableStateFlow.setValue(com.paypal.oslo.core.network.connectivity.DefaultNetworkStateProviderKt.toNetworkState(networkCapabilities));
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onLost(android.net.Network network) {
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
                com.paypal.oslo.core.network.connectivity.NetworkState highSpeedVideoSizes;
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter(network, "");
                mutableStateFlow = com.paypal.oslo.core.network.connectivity.DefaultNetworkStateProvider.this.getHighSpeedVideoFpsRanges;
                highSpeedVideoSizes = com.paypal.oslo.core.network.connectivity.DefaultNetworkStateProvider.this.getHighSpeedVideoSizes();
                mutableStateFlow.setValue(highSpeedVideoSizes);
            }

            @Override // android.net.ConnectivityManager.NetworkCallback
            public final void onUnavailable() {
                kotlinx.coroutines.flow.MutableStateFlow mutableStateFlow;
                com.paypal.oslo.core.network.connectivity.NetworkState networkState;
                mutableStateFlow = com.paypal.oslo.core.network.connectivity.DefaultNetworkStateProvider.this.getHighSpeedVideoFpsRanges;
                networkState = com.paypal.oslo.core.network.connectivity.DefaultNetworkStateProviderKt.getHighSpeedVideoFpsRanges;
                mutableStateFlow.setValue(networkState);
            }
        };
        this.Camera2StreamConfigurationMap = r0;
        if (connectivityManager != null) {
            connectivityManager.registerDefaultNetworkCallback((android.net.ConnectivityManager.NetworkCallback) r0);
        }
    }

    @Override // com.paypal.oslo.core.network.connectivity.NetworkStateProvider
    public final com.paypal.oslo.core.network.connectivity.NetworkState currentState() {
        return this.getHighSpeedVideoFpsRanges.getValue();
    }

    @Override // com.paypal.oslo.core.network.connectivity.NetworkStateProvider
    public final kotlinx.coroutines.flow.StateFlow<com.paypal.oslo.core.network.connectivity.NetworkState> observeState() {
        return kotlinx.coroutines.flow.FlowKt.asStateFlow(this.getHighSpeedVideoFpsRanges);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final com.paypal.oslo.core.network.connectivity.NetworkState getHighSpeedVideoSizes() {
        com.paypal.oslo.core.network.connectivity.NetworkState networkState;
        android.net.Network activeNetwork;
        android.net.NetworkCapabilities networkCapabilities;
        android.net.ConnectivityManager connectivityManager = this.getHighResolutionOutputSizeshNQ4ISI;
        if (connectivityManager == null || (activeNetwork = connectivityManager.getActiveNetwork()) == null || (networkCapabilities = this.getHighResolutionOutputSizeshNQ4ISI.getNetworkCapabilities(activeNetwork)) == null) {
            networkState = com.paypal.oslo.core.network.connectivity.DefaultNetworkStateProviderKt.getHighSpeedVideoFpsRanges;
            return networkState;
        }
        return com.paypal.oslo.core.network.connectivity.DefaultNetworkStateProviderKt.toNetworkState(networkCapabilities);
    }
}
