package com.paypal.oslo.feature.revolvingcreditservicing.di;

/* loaded from: classes14.dex */
public final class RepositoryBindingsModule_Companion_ProvideFinancialActivityRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.FinancialActivityRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.FinancialActivityRepositoryImpl> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockFinancialActivityRepositoryImpl> getHighSpeedVideoSizes;

    private RepositoryBindingsModule_Companion_ProvideFinancialActivityRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockFinancialActivityRepositoryImpl> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.FinancialActivityRepositoryImpl> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.FinancialActivityRepository get() {
        return provideFinancialActivityRepository(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.di.RepositoryBindingsModule_Companion_ProvideFinancialActivityRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockFinancialActivityRepositoryImpl> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.FinancialActivityRepositoryImpl> provider3) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.di.RepositoryBindingsModule_Companion_ProvideFinancialActivityRepositoryFactory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.FinancialActivityRepository provideFinancialActivityRepository(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockFinancialActivityRepositoryImpl mockFinancialActivityRepositoryImpl, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.FinancialActivityRepositoryImpl financialActivityRepositoryImpl) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.FinancialActivityRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.revolvingcreditservicing.di.RepositoryBindingsModule.INSTANCE.provideFinancialActivityRepository(featureGateManager, mockFinancialActivityRepositoryImpl, financialActivityRepositoryImpl));
    }
}
