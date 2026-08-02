package com.paypal.oslo.feature.revolvingcreditservicing.di;

/* loaded from: classes14.dex */
public final class RepositoryBindingsModule_Companion_ProvideAccountSummaryRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.AccountSummaryRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAccountSummaryRepository> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager> getHighSpeedVideoFpsRanges;

    private RepositoryBindingsModule_Companion_ProvideAccountSummaryRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAccountSummaryRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.AccountSummaryRepository get() {
        return provideAccountSummaryRepository(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.di.RepositoryBindingsModule_Companion_ProvideAccountSummaryRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAccountSummaryRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl> provider3) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.di.RepositoryBindingsModule_Companion_ProvideAccountSummaryRepositoryFactory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.AccountSummaryRepository provideAccountSummaryRepository(com.paypal.oslo.feature.revolvingcreditservicing.remoteConfig.featureFlags.FeatureGateManager featureGateManager, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.mock.MockAccountSummaryRepository mockAccountSummaryRepository, com.paypal.oslo.feature.revolvingcreditservicing.data.repository.AccountSummaryRepositoryImpl accountSummaryRepositoryImpl) {
        return (com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.AccountSummaryRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.revolvingcreditservicing.di.RepositoryBindingsModule.INSTANCE.provideAccountSummaryRepository(featureGateManager, mockAccountSummaryRepository, accountSummaryRepositoryImpl));
    }
}
