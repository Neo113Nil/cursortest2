package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

/* loaded from: classes11.dex */
public final class CreateCreditApplicationUsecase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.usecase.CreateCreditApplicationUsecase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.CreateCreditApplicationRepository> getHighSpeedVideoFpsRanges;

    private CreateCreditApplicationUsecase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.CreateCreditApplicationRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.usecase.CreateCreditApplicationUsecase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.CreateCreditApplicationUsecase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.CreateCreditApplicationRepository> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.CreateCreditApplicationUsecase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.CreateCreditApplicationUsecase newInstance(com.paypal.oslo.feature.bnplacquisition.domain.repository.CreateCreditApplicationRepository createCreditApplicationRepository) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.CreateCreditApplicationUsecase(createCreditApplicationRepository);
    }
}
