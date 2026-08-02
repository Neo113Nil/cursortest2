package com.paypal.oslo.core.remoteconfig.di;

/* loaded from: classes5.dex */
public final class StatsigCdnModule_ProvideStatsigCdnServiceFactory implements dagger.internal.Factory<com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnService> {
    private final dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> getHighSpeedVideoFpsRanges;

    private StatsigCdnModule_ProvideStatsigCdnServiceFactory(dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnService get() {
        return provideStatsigCdnService(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.remoteconfig.di.StatsigCdnModule_ProvideStatsigCdnServiceFactory create(dagger.internal.Provider<com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider> provider) {
        return new com.paypal.oslo.core.remoteconfig.di.StatsigCdnModule_ProvideStatsigCdnServiceFactory(provider);
    }

    public static com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnService provideStatsigCdnService(com.paypal.oslo.core.network.http.DynamicOkHttpClientProvider dynamicOkHttpClientProvider) {
        return (com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnService) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.remoteconfig.di.StatsigCdnModule.INSTANCE.provideStatsigCdnService(dynamicOkHttpClientProvider));
    }
}
