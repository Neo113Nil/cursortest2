package com.paypal.oslo.core.network.sse.di;

/* loaded from: classes4.dex */
public final class SseModule_ProvideSseRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.core.network.sse.domain.repository.SseRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.core.network.sse.di.SseOkHttpClientProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.network.sse.config.SseConfig> getHighResolutionOutputSizeshNQ4ISI;

    private SseModule_ProvideSseRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.core.network.sse.config.SseConfig> provider, dagger.internal.Provider<com.paypal.oslo.core.network.sse.di.SseOkHttpClientProvider> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.network.sse.domain.repository.SseRepository get() {
        return provideSseRepository(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.core.network.sse.di.SseModule_ProvideSseRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.core.network.sse.config.SseConfig> provider, dagger.internal.Provider<com.paypal.oslo.core.network.sse.di.SseOkHttpClientProvider> provider2) {
        return new com.paypal.oslo.core.network.sse.di.SseModule_ProvideSseRepositoryFactory(provider, provider2);
    }

    public static com.paypal.oslo.core.network.sse.domain.repository.SseRepository provideSseRepository(com.paypal.oslo.core.network.sse.config.SseConfig sseConfig, com.paypal.oslo.core.network.sse.di.SseOkHttpClientProvider sseOkHttpClientProvider) {
        return (com.paypal.oslo.core.network.sse.domain.repository.SseRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.network.sse.di.SseModule.INSTANCE.provideSseRepository(sseConfig, sseOkHttpClientProvider));
    }
}
