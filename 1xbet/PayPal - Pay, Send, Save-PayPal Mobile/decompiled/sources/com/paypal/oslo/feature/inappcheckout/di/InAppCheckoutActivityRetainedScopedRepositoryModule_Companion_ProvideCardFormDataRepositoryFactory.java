package com.paypal.oslo.feature.inappcheckout.di;

/* loaded from: classes13.dex */
public final class InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_ProvideCardFormDataRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.repository.CardFormDataRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardFormDataRepository> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.CardFormDataRepositoryImpl> getHighSpeedVideoFpsRangesFor;

    private InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_ProvideCardFormDataRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardFormDataRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.CardFormDataRepositoryImpl> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.repository.CardFormDataRepository get() {
        return provideCardFormDataRepository(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_ProvideCardFormDataRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardFormDataRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.CardFormDataRepositoryImpl> provider3) {
        return new com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_ProvideCardFormDataRepositoryFactory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.repository.CardFormDataRepository provideCardFormDataRepository(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager featureGateManager, com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockCardFormDataRepository mockCardFormDataRepository, com.paypal.oslo.feature.inappcheckout.data.repository.CardFormDataRepositoryImpl cardFormDataRepositoryImpl) {
        return (com.paypal.oslo.feature.inappcheckout.domain.repository.CardFormDataRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule.INSTANCE.provideCardFormDataRepository(featureGateManager, mockCardFormDataRepository, cardFormDataRepositoryImpl));
    }
}
