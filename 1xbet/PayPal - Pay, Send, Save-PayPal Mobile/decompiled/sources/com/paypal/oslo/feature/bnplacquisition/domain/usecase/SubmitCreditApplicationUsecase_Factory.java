package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

/* loaded from: classes11.dex */
public final class SubmitCreditApplicationUsecase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.usecase.SubmitCreditApplicationUsecase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.SubmitCreditApplicationRepository> getHighSpeedVideoFpsRanges;

    private SubmitCreditApplicationUsecase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.SubmitCreditApplicationRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.usecase.SubmitCreditApplicationUsecase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.SubmitCreditApplicationUsecase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.SubmitCreditApplicationRepository> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.SubmitCreditApplicationUsecase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.SubmitCreditApplicationUsecase newInstance(com.paypal.oslo.feature.bnplacquisition.domain.repository.SubmitCreditApplicationRepository submitCreditApplicationRepository) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.SubmitCreditApplicationUsecase(submitCreditApplicationRepository);
    }
}
