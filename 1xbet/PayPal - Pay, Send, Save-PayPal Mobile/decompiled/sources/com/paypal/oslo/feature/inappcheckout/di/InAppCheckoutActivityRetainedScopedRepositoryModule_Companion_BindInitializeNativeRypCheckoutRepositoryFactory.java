package com.paypal.oslo.feature.inappcheckout.di;

/* loaded from: classes13.dex */
public final class InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_BindInitializeNativeRypCheckoutRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.inappcheckout.domain.repository.InitializeNativeRypCheckoutRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockInitializeNativeRypCheckoutRepository> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl> getHighSpeedVideoSizes;

    private InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_BindInitializeNativeRypCheckoutRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockInitializeNativeRypCheckoutRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.inappcheckout.domain.repository.InitializeNativeRypCheckoutRepository get() {
        return bindInitializeNativeRypCheckoutRepository(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_BindInitializeNativeRypCheckoutRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockInitializeNativeRypCheckoutRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl> provider3) {
        return new com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule_Companion_BindInitializeNativeRypCheckoutRepositoryFactory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.inappcheckout.domain.repository.InitializeNativeRypCheckoutRepository bindInitializeNativeRypCheckoutRepository(com.paypal.oslo.feature.inappcheckout.features.statsig.featureGate.FeatureGateManager featureGateManager, com.paypal.oslo.feature.inappcheckout.data.repository.mock.MockInitializeNativeRypCheckoutRepository mockInitializeNativeRypCheckoutRepository, com.paypal.oslo.feature.inappcheckout.data.repository.InitializeNativeRypCheckoutRepositoryImpl initializeNativeRypCheckoutRepositoryImpl) {
        return (com.paypal.oslo.feature.inappcheckout.domain.repository.InitializeNativeRypCheckoutRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutActivityRetainedScopedRepositoryModule.INSTANCE.bindInitializeNativeRypCheckoutRepository(featureGateManager, mockInitializeNativeRypCheckoutRepository, initializeNativeRypCheckoutRepositoryImpl));
    }
}
