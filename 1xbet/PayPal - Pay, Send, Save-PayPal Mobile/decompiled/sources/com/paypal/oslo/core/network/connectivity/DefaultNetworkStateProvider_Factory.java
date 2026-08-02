package com.paypal.oslo.core.network.connectivity;

/* loaded from: classes10.dex */
public final class DefaultNetworkStateProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.core.network.connectivity.DefaultNetworkStateProvider> {
    private final dagger.internal.Provider<android.content.Context> getHighResolutionOutputSizeshNQ4ISI;

    private DefaultNetworkStateProvider_Factory(dagger.internal.Provider<android.content.Context> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.network.connectivity.DefaultNetworkStateProvider get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.network.connectivity.DefaultNetworkStateProvider_Factory create(dagger.internal.Provider<android.content.Context> provider) {
        return new com.paypal.oslo.core.network.connectivity.DefaultNetworkStateProvider_Factory(provider);
    }

    public static com.paypal.oslo.core.network.connectivity.DefaultNetworkStateProvider newInstance(android.content.Context context) {
        return new com.paypal.oslo.core.network.connectivity.DefaultNetworkStateProvider(context);
    }
}
