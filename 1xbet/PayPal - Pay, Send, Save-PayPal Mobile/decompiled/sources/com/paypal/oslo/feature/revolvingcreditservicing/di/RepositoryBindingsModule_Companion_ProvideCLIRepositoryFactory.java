package com.paypal.oslo.feature.revolvingcreditservicing.di;

/* loaded from: classes14.dex */
public final class RepositoryBindingsModule_Companion_ProvideCLIRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CLIRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIRepositoryImpl> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIRepository> getHighSpeedVideoFpsRangesFor;

    private RepositoryBindingsModule_Companion_ProvideCLIRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIRepositoryImpl> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CLIRepository get() {
        return provideCLIRepository(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.di.RepositoryBindingsModule_Companion_ProvideCLIRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIRepositoryImpl> provider3) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.di.RepositoryBindingsModule_Companion_ProvideCLIRepositoryFactory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CLIRepository provideCLIRepository(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockCLIRepository mockCLIRepository, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.CLIRepositoryImpl cLIRepositoryImpl) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.CLIRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.revolvingcreditservicing.di.RepositoryBindingsModule.INSTANCE.provideCLIRepository(featureGateManager, mockCLIRepository, cLIRepositoryImpl));
    }
}
