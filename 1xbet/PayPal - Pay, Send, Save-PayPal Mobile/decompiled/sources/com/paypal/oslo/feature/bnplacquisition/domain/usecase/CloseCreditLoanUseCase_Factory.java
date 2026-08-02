package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

/* loaded from: classes11.dex */
public final class CloseCreditLoanUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.usecase.CloseCreditLoanUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.CloseCreditLoanRepository> Camera2StreamConfigurationMap;

    private CloseCreditLoanUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.CloseCreditLoanRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.usecase.CloseCreditLoanUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.CloseCreditLoanUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.CloseCreditLoanRepository> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.CloseCreditLoanUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.CloseCreditLoanUseCase newInstance(com.paypal.oslo.feature.bnplacquisition.domain.repository.CloseCreditLoanRepository closeCreditLoanRepository) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.CloseCreditLoanUseCase(closeCreditLoanRepository);
    }
}
