package com.paypal.oslo.feature.businesshome.di;

/* loaded from: classes5.dex */
public final class RepositoryModule_Companion_ProvideAccountSetupRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesshome.data.repository.AccountSetupRepositoryImpl> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesshome.data.repository.mock.DemoAccountSetupRepository> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoSizes;

    private RepositoryModule_Companion_ProvideAccountSetupRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesshome.data.repository.AccountSetupRepositoryImpl> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businesshome.data.repository.mock.DemoAccountSetupRepository> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository get() {
        return provideAccountSetupRepository(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.businesshome.di.RepositoryModule_Companion_ProvideAccountSetupRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesshome.data.repository.AccountSetupRepositoryImpl> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businesshome.data.repository.mock.DemoAccountSetupRepository> provider3) {
        return new com.paypal.oslo.feature.businesshome.di.RepositoryModule_Companion_ProvideAccountSetupRepositoryFactory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository provideAccountSetupRepository(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.businesshome.data.repository.AccountSetupRepositoryImpl accountSetupRepositoryImpl, com.paypal.oslo.feature.businesshome.data.repository.mock.DemoAccountSetupRepository demoAccountSetupRepository) {
        return (com.paypal.oslo.feature.businesshome.domain.repository.AccountSetupRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.businesshome.di.RepositoryModule.INSTANCE.provideAccountSetupRepository(featureGate, accountSetupRepositoryImpl, demoAccountSetupRepository));
    }
}
