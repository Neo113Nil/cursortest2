package com.paypal.oslo.feature.home.data.repository.mock;

/* loaded from: classes12.dex */
public final class MockHomeFeedRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.featureflags.HomeConfigManager> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator> getHighSpeedVideoSizes;

    private MockHomeFeedRepository_Factory(dagger.internal.Provider<com.paypal.oslo.feature.home.featureflags.HomeConfigManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.home.featureflags.HomeConfigManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator> provider2) {
        return new com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository newInstance(com.paypal.oslo.feature.home.featureflags.HomeConfigManager homeConfigManager, com.paypal.oslo.feature.home.domain.error.DemoErrorSimulator demoErrorSimulator) {
        return new com.paypal.oslo.feature.home.data.repository.mock.MockHomeFeedRepository(homeConfigManager, demoErrorSimulator);
    }
}
