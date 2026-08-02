package com.paypal.oslo.feature.inappcheckout.di;

/* loaded from: classes13.dex */
public final class InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_BindAuthRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthRepository> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.AuthRepositoryImpl> getHighSpeedVideoFpsRanges;

    private InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_BindAuthRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.AuthRepositoryImpl> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository get() {
        return bindAuthRepository(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_BindAuthRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.AuthRepositoryImpl> provider3) {
        return new com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_BindAuthRepositoryFactory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository bindAuthRepository(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager featureGateManager, com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockAuthRepository mockAuthRepository, com.paypal.oslo.feature.inappcheckout.data.repository.AuthRepositoryImpl authRepositoryImpl) {
        return (com.paypal.oslo.feature.inappcheckout.domain.repository.AuthRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule.INSTANCE.bindAuthRepository(featureGateManager, mockAuthRepository, authRepositoryImpl));
    }
}
