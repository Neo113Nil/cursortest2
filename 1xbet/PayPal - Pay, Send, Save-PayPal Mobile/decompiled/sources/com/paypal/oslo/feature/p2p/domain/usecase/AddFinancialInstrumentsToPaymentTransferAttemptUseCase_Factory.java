package com.paypal.oslo.feature.p2p.domain.usecase;

/* loaded from: classes13.dex */
public final class AddFinancialInstrumentsToPaymentTransferAttemptUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.domain.usecase.AddFinancialInstrumentsToPaymentTransferAttemptUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository> getHighResolutionOutputSizeshNQ4ISI;

    private AddFinancialInstrumentsToPaymentTransferAttemptUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.domain.usecase.AddFinancialInstrumentsToPaymentTransferAttemptUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.p2p.domain.usecase.AddFinancialInstrumentsToPaymentTransferAttemptUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository> provider) {
        return new com.paypal.oslo.feature.p2p.domain.usecase.AddFinancialInstrumentsToPaymentTransferAttemptUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.p2p.domain.usecase.AddFinancialInstrumentsToPaymentTransferAttemptUseCase newInstance(com.paypal.oslo.feature.p2p.domain.repository.TransferFlowRepository transferFlowRepository) {
        return new com.paypal.oslo.feature.p2p.domain.usecase.AddFinancialInstrumentsToPaymentTransferAttemptUseCase(transferFlowRepository);
    }
}
