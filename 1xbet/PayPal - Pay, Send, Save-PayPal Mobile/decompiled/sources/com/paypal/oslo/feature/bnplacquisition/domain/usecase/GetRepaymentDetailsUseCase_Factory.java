package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

/* loaded from: classes11.dex */
public final class GetRepaymentDetailsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetRepaymentDetailsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository> getHighSpeedVideoFpsRanges;

    private GetRepaymentDetailsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetRepaymentDetailsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetRepaymentDetailsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetRepaymentDetailsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetRepaymentDetailsUseCase newInstance(com.paypal.oslo.feature.bnplacquisition.domain.repository.UpdateApplicationRepository updateApplicationRepository) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetRepaymentDetailsUseCase(updateApplicationRepository);
    }
}
