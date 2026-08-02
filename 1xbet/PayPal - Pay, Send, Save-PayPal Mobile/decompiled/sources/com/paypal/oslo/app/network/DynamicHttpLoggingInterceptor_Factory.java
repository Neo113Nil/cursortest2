package com.paypal.oslo.app.network;

/* loaded from: classes10.dex */
public final class DynamicHttpLoggingInterceptor_Factory implements dagger.internal.Factory<com.paypal.oslo.app.network.DynamicHttpLoggingInterceptor> {
    private final dagger.internal.Provider<com.paypal.oslo.app.network.NetworkLoggingLevelProvider> Camera2StreamConfigurationMap;

    private DynamicHttpLoggingInterceptor_Factory(dagger.internal.Provider<com.paypal.oslo.app.network.NetworkLoggingLevelProvider> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.network.DynamicHttpLoggingInterceptor get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.app.network.DynamicHttpLoggingInterceptor_Factory create(dagger.internal.Provider<com.paypal.oslo.app.network.NetworkLoggingLevelProvider> provider) {
        return new com.paypal.oslo.app.network.DynamicHttpLoggingInterceptor_Factory(provider);
    }

    public static com.paypal.oslo.app.network.DynamicHttpLoggingInterceptor newInstance(com.paypal.oslo.app.network.NetworkLoggingLevelProvider networkLoggingLevelProvider) {
        return new com.paypal.oslo.app.network.DynamicHttpLoggingInterceptor(networkLoggingLevelProvider);
    }
}
