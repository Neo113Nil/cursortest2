package com.paypal.oslo.feature.bnplservicing.di;

/* loaded from: classes11.dex */
public final class BnplServDataModule_BindPlanDetailsOverviewRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.domain.repository.PlanDetailsOverviewRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.PlanDetailsOverviewRepositoryImpl> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanDetailsOverviewRepository> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighSpeedVideoSizes;

    private BnplServDataModule_BindPlanDetailsOverviewRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanDetailsOverviewRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.PlanDetailsOverviewRepositoryImpl> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.domain.repository.PlanDetailsOverviewRepository get() {
        return bindPlanDetailsOverviewRepository(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.di.BnplServDataModule_BindPlanDetailsOverviewRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanDetailsOverviewRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.PlanDetailsOverviewRepositoryImpl> provider3) {
        return new com.paypal.oslo.feature.bnplservicing.di.BnplServDataModule_BindPlanDetailsOverviewRepositoryFactory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.repository.PlanDetailsOverviewRepository bindPlanDetailsOverviewRepository(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPlanDetailsOverviewRepository mockPlanDetailsOverviewRepository, com.paypal.oslo.feature.bnplservicing.data.repository.PlanDetailsOverviewRepositoryImpl planDetailsOverviewRepositoryImpl) {
        return (com.paypal.oslo.feature.bnplservicing.domain.repository.PlanDetailsOverviewRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bnplservicing.di.BnplServDataModule.INSTANCE.bindPlanDetailsOverviewRepository(featureGate, mockPlanDetailsOverviewRepository, planDetailsOverviewRepositoryImpl));
    }
}
