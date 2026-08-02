package com.paypal.oslo.app.config;

/* loaded from: classes10.dex */
public final class AppGraphQlConfigProvider_Factory implements dagger.internal.Factory<com.paypal.oslo.app.config.AppGraphQlConfigProvider> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentProvider> getHighSpeedVideoSizes;

    private AppGraphQlConfigProvider_Factory(dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentProvider> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.app.config.AppGraphQlConfigProvider get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.app.config.AppGraphQlConfigProvider_Factory create(dagger.internal.Provider<com.paypal.oslo.app.environment.EnvironmentProvider> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2) {
        return new com.paypal.oslo.app.config.AppGraphQlConfigProvider_Factory(provider, provider2);
    }

    public static com.paypal.oslo.app.config.AppGraphQlConfigProvider newInstance(com.paypal.oslo.app.environment.EnvironmentProvider environmentProvider, kotlinx.coroutines.CoroutineScope coroutineScope) {
        return new com.paypal.oslo.app.config.AppGraphQlConfigProvider(environmentProvider, coroutineScope);
    }
}
