package com.paypal.oslo.feature.home.domain.loading;

/* loaded from: classes12.dex */
public final class HomeFeedSectionLoadingFactory_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.domain.loading.HomeFeedSectionLoadingFactory> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.domain.loading.MerchantSectionLoadingFactory> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.domain.loading.HeroProductSectionLoadingFactory> getHighSpeedVideoSizes;

    private HomeFeedSectionLoadingFactory_Factory(dagger.internal.Provider<com.paypal.oslo.feature.home.domain.loading.HeroProductSectionLoadingFactory> provider, dagger.internal.Provider<com.paypal.oslo.feature.home.domain.loading.MerchantSectionLoadingFactory> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.domain.loading.HomeFeedSectionLoadingFactory get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.home.domain.loading.HomeFeedSectionLoadingFactory_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.home.domain.loading.HeroProductSectionLoadingFactory> provider, dagger.internal.Provider<com.paypal.oslo.feature.home.domain.loading.MerchantSectionLoadingFactory> provider2) {
        return new com.paypal.oslo.feature.home.domain.loading.HomeFeedSectionLoadingFactory_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.home.domain.loading.HomeFeedSectionLoadingFactory newInstance(com.paypal.oslo.feature.home.domain.loading.HeroProductSectionLoadingFactory heroProductSectionLoadingFactory, com.paypal.oslo.feature.home.domain.loading.MerchantSectionLoadingFactory merchantSectionLoadingFactory) {
        return new com.paypal.oslo.feature.home.domain.loading.HomeFeedSectionLoadingFactory(heroProductSectionLoadingFactory, merchantSectionLoadingFactory);
    }
}
