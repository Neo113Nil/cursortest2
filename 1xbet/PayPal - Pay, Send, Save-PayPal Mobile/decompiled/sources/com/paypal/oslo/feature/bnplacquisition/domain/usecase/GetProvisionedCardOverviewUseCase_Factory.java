package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

/* loaded from: classes11.dex */
public final class GetProvisionedCardOverviewUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetProvisionedCardOverviewUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.ProvisionedCardOverviewRepository> getHighSpeedVideoSizes;

    private GetProvisionedCardOverviewUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.ProvisionedCardOverviewRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetProvisionedCardOverviewUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetProvisionedCardOverviewUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.ProvisionedCardOverviewRepository> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetProvisionedCardOverviewUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetProvisionedCardOverviewUseCase newInstance(com.paypal.oslo.feature.bnplacquisition.domain.repository.ProvisionedCardOverviewRepository provisionedCardOverviewRepository) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetProvisionedCardOverviewUseCase(provisionedCardOverviewRepository);
    }
}
