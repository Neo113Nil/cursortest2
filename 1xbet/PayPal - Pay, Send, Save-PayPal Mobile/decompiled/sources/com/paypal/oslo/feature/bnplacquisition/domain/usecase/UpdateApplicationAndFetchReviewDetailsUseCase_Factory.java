package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

/* loaded from: classes11.dex */
public final class UpdateApplicationAndFetchReviewDetailsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.usecase.UpdateApplicationAndFetchReviewDetailsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository> getHighSpeedVideoFpsRangesFor;

    private UpdateApplicationAndFetchReviewDetailsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.usecase.UpdateApplicationAndFetchReviewDetailsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.UpdateApplicationAndFetchReviewDetailsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.UpdateApplicationAndFetchReviewDetailsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.UpdateApplicationAndFetchReviewDetailsUseCase newInstance(com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository updateApplicationRepository) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.UpdateApplicationAndFetchReviewDetailsUseCase(updateApplicationRepository);
    }
}
