package com.paypal.oslo.core.network.connectivity;

/* loaded from: classes10.dex */
public final class DefaultNetworkConnectivityChecker_Factory implements dagger.internal.Factory<com.paypal.oslo.core.network.connectivity.DefaultNetworkConnectivityChecker> {
    private final dagger.internal.Provider<com.paypal.oslo.core.network.connectivity.NetworkStateProvider> getHighResolutionOutputSizeshNQ4ISI;

    private DefaultNetworkConnectivityChecker_Factory(dagger.internal.Provider<com.paypal.oslo.core.network.connectivity.NetworkStateProvider> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.network.connectivity.DefaultNetworkConnectivityChecker get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.network.connectivity.DefaultNetworkConnectivityChecker_Factory create(dagger.internal.Provider<com.paypal.oslo.core.network.connectivity.NetworkStateProvider> provider) {
        return new com.paypal.oslo.core.network.connectivity.DefaultNetworkConnectivityChecker_Factory(provider);
    }

    public static com.paypal.oslo.core.network.connectivity.DefaultNetworkConnectivityChecker newInstance(com.paypal.oslo.core.network.connectivity.NetworkStateProvider networkStateProvider) {
        return new com.paypal.oslo.core.network.connectivity.DefaultNetworkConnectivityChecker(networkStateProvider);
    }
}
