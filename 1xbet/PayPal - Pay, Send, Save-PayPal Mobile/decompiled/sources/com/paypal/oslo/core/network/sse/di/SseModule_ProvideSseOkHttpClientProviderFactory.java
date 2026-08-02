package com.paypal.oslo.core.network.sse.di;

/* loaded from: classes4.dex */
public final class SseModule_ProvideSseOkHttpClientProviderFactory implements dagger.internal.Factory<com.paypal.oslo.core.network.sse.di.SseOkHttpClientProvider> {
    private final dagger.internal.Provider<com.paypal.oslo.core.network.sse.config.SseConfig> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> getHighSpeedVideoSizes;

    private SseModule_ProvideSseOkHttpClientProviderFactory(dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2, dagger.internal.Provider<com.paypal.oslo.core.network.sse.config.SseConfig> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.network.sse.di.SseOkHttpClientProvider get() {
        return provideSseOkHttpClientProvider(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.core.network.sse.di.SseModule_ProvideSseOkHttpClientProviderFactory create(dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineScope> provider2, dagger.internal.Provider<com.paypal.oslo.core.network.sse.config.SseConfig> provider3) {
        return new com.paypal.oslo.core.network.sse.di.SseModule_ProvideSseOkHttpClientProviderFactory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.core.network.sse.di.SseOkHttpClientProvider provideSseOkHttpClientProvider(com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider dynamicOkHttpClientProvider, kotlinx.coroutines.CoroutineScope coroutineScope, com.paypal.oslo.core.network.sse.config.SseConfig sseConfig) {
        return (com.paypal.oslo.core.network.sse.di.SseOkHttpClientProvider) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.network.sse.di.SseModule.INSTANCE.provideSseOkHttpClientProvider(dynamicOkHttpClientProvider, coroutineScope, sseConfig));
    }
}
