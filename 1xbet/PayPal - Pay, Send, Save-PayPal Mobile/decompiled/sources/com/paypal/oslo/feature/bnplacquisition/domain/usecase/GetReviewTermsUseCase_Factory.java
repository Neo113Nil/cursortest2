package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

/* loaded from: classes11.dex */
public final class GetReviewTermsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetReviewTermsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository> getHighResolutionOutputSizeshNQ4ISI;

    private GetReviewTermsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetReviewTermsUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetReviewTermsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetReviewTermsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetReviewTermsUseCase newInstance(com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository updateApplicationRepository) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetReviewTermsUseCase(updateApplicationRepository);
    }
}
