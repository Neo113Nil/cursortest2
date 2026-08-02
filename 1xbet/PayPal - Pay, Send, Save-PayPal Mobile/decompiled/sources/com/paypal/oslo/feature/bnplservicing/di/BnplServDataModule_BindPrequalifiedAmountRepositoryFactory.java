package com.paypal.oslo.feature.bnplservicing.di;

/* loaded from: classes11.dex */
public final class BnplServDataModule_BindPrequalifiedAmountRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.domain.repository.PrequalificationSummaryRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPrequalificationSummaryRepository> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.PrequalifiedAmountRepositoryImpl> getHighSpeedVideoSizes;

    private BnplServDataModule_BindPrequalifiedAmountRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPrequalificationSummaryRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.PrequalifiedAmountRepositoryImpl> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.domain.repository.PrequalificationSummaryRepository get() {
        return bindPrequalifiedAmountRepository(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.di.BnplServDataModule_BindPrequalifiedAmountRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPrequalificationSummaryRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplservicing.data.repository.PrequalifiedAmountRepositoryImpl> provider3) {
        return new com.paypal.oslo.feature.bnplservicing.di.BnplServDataModule_BindPrequalifiedAmountRepositoryFactory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.bnplservicing.domain.repository.PrequalificationSummaryRepository bindPrequalifiedAmountRepository(com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate, com.paypal.oslo.feature.bnplservicing.data.repository.mock.MockPrequalificationSummaryRepository mockPrequalificationSummaryRepository, com.paypal.oslo.feature.bnplservicing.data.repository.PrequalifiedAmountRepositoryImpl prequalifiedAmountRepositoryImpl) {
        return (com.paypal.oslo.feature.bnplservicing.domain.repository.PrequalificationSummaryRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.bnplservicing.di.BnplServDataModule.INSTANCE.bindPrequalifiedAmountRepository(featureGate, mockPrequalificationSummaryRepository, prequalifiedAmountRepositoryImpl));
    }
}
