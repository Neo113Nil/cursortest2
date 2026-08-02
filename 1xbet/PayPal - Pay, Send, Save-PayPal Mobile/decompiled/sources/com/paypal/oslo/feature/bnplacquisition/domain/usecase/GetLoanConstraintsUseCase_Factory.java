package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

/* loaded from: classes11.dex */
public final class GetLoanConstraintsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetLoanConstraintsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.LoanConstraintsRepository> getHighResolutionOutputSizeshNQ4ISI;

    private GetLoanConstraintsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.LoanConstraintsRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetLoanConstraintsUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetLoanConstraintsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.LoanConstraintsRepository> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetLoanConstraintsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetLoanConstraintsUseCase newInstance(com.paypal.oslo.feature.bnplacquisition.domain.repository.LoanConstraintsRepository loanConstraintsRepository) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetLoanConstraintsUseCase(loanConstraintsRepository);
    }
}
