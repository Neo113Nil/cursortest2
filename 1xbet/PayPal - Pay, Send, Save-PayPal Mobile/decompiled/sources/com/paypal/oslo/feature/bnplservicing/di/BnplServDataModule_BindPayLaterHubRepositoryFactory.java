package com.paypal.oslo.feature.bnplservicing.di;

/* loaded from: classes11.dex */
public final class BnplServDataModule_BindPayLaterHubRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.domain.repository.PayLaterHubRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRangesFor;

    private BnplServDataModule_BindPayLaterHubRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.domain.repository.PayLaterHubRepository get() {
        return bindPayLaterHubRepository(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.di.BnplServDataModule_BindPayLaterHubRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl> provider3) {
        return new com.paypal.oslo.feature.bnplservicing.di.BnplServDataModule_BindPayLaterHubRepositoryFactory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.repository.PayLaterHubRepository bindPayLaterHubRepository(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPayLaterHubRepository mockPayLaterHubRepository, com.paypal.oslo.feature.bnplservicing.data.repository.PayLaterHubRepositoryImpl payLaterHubRepositoryImpl) {
        return (com.paypal.oslo.feature.bnplservicing.domain.repository.PayLaterHubRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bnplservicing.di.BnplServDataModule.INSTANCE.bindPayLaterHubRepository(featureGate, mockPayLaterHubRepository, payLaterHubRepositoryImpl));
    }
}
