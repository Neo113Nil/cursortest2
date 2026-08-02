package com.paypal.oslo.core.remoteconfig.cdn;

/* loaded from: classes10.dex */
public final class StatsigCdnFetcher_Factory implements dagger.internal.Factory<com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnFetcher> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnService> getHighSpeedVideoSizes;

    private StatsigCdnFetcher_Factory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnService> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnFetcher get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnFetcher_Factory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnService> provider) {
        return new com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnFetcher_Factory(provider);
    }

    public static com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnFetcher newInstance(com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnService statsigCdnService) {
        return new com.paypal.oslo.core.remoteconfig.cdn.StatsigCdnFetcher(statsigCdnService);
    }
}
