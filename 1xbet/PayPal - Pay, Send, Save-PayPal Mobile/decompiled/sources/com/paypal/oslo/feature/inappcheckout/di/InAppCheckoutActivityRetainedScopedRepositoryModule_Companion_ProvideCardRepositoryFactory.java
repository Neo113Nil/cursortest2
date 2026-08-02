package com.paypal.oslo.feature.inappcheckout.di;

/* loaded from: classes13.dex */
public final class InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_ProvideCardRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.repository.CardRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.CardRepositoryImpl> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardRepository> getHighSpeedVideoSizes;

    private InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_ProvideCardRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.CardRepositoryImpl> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.repository.CardRepository get() {
        return provideCardRepository(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_ProvideCardRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.CardRepositoryImpl> provider3) {
        return new com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_ProvideCardRepositoryFactory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.repository.CardRepository provideCardRepository(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager featureGateManager, com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardRepository mockCardRepository, com.paypal.oslo.feature.inappcheckout.data.repository.CardRepositoryImpl cardRepositoryImpl) {
        return (com.paypal.oslo.feature.inappcheckout.domain.repository.CardRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule.INSTANCE.provideCardRepository(featureGateManager, mockCardRepository, cardRepositoryImpl));
    }
}
