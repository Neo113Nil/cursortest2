package com.paypal.oslo.feature.home.data.mapper;

/* loaded from: classes12.dex */
public final class HomeFeedMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.data.mapper.HomeFeedMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.domain.StringProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.featureflags.HomeConfigManager> getHighSpeedVideoFpsRanges;

    private HomeFeedMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.home.domain.StringProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.home.featureflags.HomeConfigManager> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.data.mapper.HomeFeedMapper get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.home.data.mapper.HomeFeedMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.home.domain.StringProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.home.featureflags.HomeConfigManager> provider2) {
        return new com.paypal.oslo.feature.home.data.mapper.HomeFeedMapper_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.home.data.mapper.HomeFeedMapper newInstance(com.paypal.oslo.feature.home.domain.StringProvider stringProvider, com.paypal.oslo.feature.home.featureflags.HomeConfigManager homeConfigManager) {
        return new com.paypal.oslo.feature.home.data.mapper.HomeFeedMapper(stringProvider, homeConfigManager);
    }
}
