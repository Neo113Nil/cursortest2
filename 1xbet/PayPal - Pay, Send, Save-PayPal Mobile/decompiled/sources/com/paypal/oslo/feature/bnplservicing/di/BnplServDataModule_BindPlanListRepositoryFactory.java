package com.paypal.oslo.feature.bnplservicing.di;

/* loaded from: classes11.dex */
public final class BnplServDataModule_BindPlanListRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.domain.repository.PlanListRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanListRepository> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.PlanListRepositoryImpl> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoFpsRanges;

    private BnplServDataModule_BindPlanListRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanListRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.PlanListRepositoryImpl> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.domain.repository.PlanListRepository get() {
        return bindPlanListRepository(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.di.BnplServDataModule_BindPlanListRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanListRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.PlanListRepositoryImpl> provider3) {
        return new com.paypal.oslo.feature.bnplservicing.di.BnplServDataModule_BindPlanListRepositoryFactory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.repository.PlanListRepository bindPlanListRepository(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanListRepository mockPlanListRepository, com.paypal.oslo.feature.bnplservicing.data.repository.PlanListRepositoryImpl planListRepositoryImpl) {
        return (com.paypal.oslo.feature.bnplservicing.domain.repository.PlanListRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bnplservicing.di.BnplServDataModule.INSTANCE.bindPlanListRepository(featureGate, mockPlanListRepository, planListRepositoryImpl));
    }
}
