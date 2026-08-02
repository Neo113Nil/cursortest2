package com.paypal.oslo.feature.businesshome.di;

/* loaded from: classes5.dex */
public final class RepositoryModule_Companion_ProvideMerchantInsightsRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.businesshome.domain.repository.MerchantInsightsRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesshome.data.repository.MerchantInsightsRepositoryImpl> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesshome.data.repository.mock.DemoMerchantInsightsRepository> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoSizes;

    private RepositoryModule_Companion_ProvideMerchantInsightsRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesshome.data.repository.MerchantInsightsRepositoryImpl> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businesshome.data.repository.mock.DemoMerchantInsightsRepository> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesshome.domain.repository.MerchantInsightsRepository get() {
        return provideMerchantInsightsRepository(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.businesshome.di.RepositoryModule_Companion_ProvideMerchantInsightsRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesshome.data.repository.MerchantInsightsRepositoryImpl> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businesshome.data.repository.mock.DemoMerchantInsightsRepository> provider3) {
        return new com.paypal.oslo.feature.businesshome.di.RepositoryModule_Companion_ProvideMerchantInsightsRepositoryFactory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.businesshome.domain.repository.MerchantInsightsRepository provideMerchantInsightsRepository(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.businesshome.data.repository.MerchantInsightsRepositoryImpl merchantInsightsRepositoryImpl, com.paypal.oslo.feature.businesshome.data.repository.mock.DemoMerchantInsightsRepository demoMerchantInsightsRepository) {
        return (com.paypal.oslo.feature.businesshome.domain.repository.MerchantInsightsRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.businesshome.di.RepositoryModule.INSTANCE.provideMerchantInsightsRepository(featureGate, merchantInsightsRepositoryImpl, demoMerchantInsightsRepository));
    }
}
