package com.paypal.oslo.app.config;

/* loaded from: classes10.dex */
public final class AppSSLConfig_Factory implements dagger.internal.Factory<com.paypal.oslo.app.config.AppSSLConfig> {
    private final dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getHighSpeedVideoSizes;

    private AppSSLConfig_Factory(dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentProvider> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.config.AppSSLConfig get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.app.config.AppSSLConfig_Factory create(dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentProvider> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2) {
        return new com.paypal.oslo.app.config.AppSSLConfig_Factory(provider, provider2);
    }

    public static com.paypal.oslo.app.config.AppSSLConfig newInstance(com.paypal.oslo.app.environment.EnvironmentProvider environmentProvider, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return new com.paypal.oslo.app.config.AppSSLConfig(environmentProvider, coroutineScope);
    }
}
