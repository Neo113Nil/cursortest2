package com.paypal.oslo.feature.inappcheckout.di;

/* loaded from: classes13.dex */
public final class InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_ProvideUpdateCardRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.repository.UpdateCardRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.UpdateCardRepositoryImpl> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockUpdateCardRepository> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> getHighSpeedVideoFpsRangesFor;

    private InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_ProvideUpdateCardRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockUpdateCardRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.UpdateCardRepositoryImpl> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.repository.UpdateCardRepository get() {
        return provideUpdateCardRepository(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_ProvideUpdateCardRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockUpdateCardRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.UpdateCardRepositoryImpl> provider3) {
        return new com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_ProvideUpdateCardRepositoryFactory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.repository.UpdateCardRepository provideUpdateCardRepository(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager featureGateManager, com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockUpdateCardRepository mockUpdateCardRepository, com.paypal.oslo.feature.inappcheckout.data.repository.UpdateCardRepositoryImpl updateCardRepositoryImpl) {
        return (com.paypal.oslo.feature.inappcheckout.domain.repository.UpdateCardRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule.INSTANCE.provideUpdateCardRepository(featureGateManager, mockUpdateCardRepository, updateCardRepositoryImpl));
    }
}
