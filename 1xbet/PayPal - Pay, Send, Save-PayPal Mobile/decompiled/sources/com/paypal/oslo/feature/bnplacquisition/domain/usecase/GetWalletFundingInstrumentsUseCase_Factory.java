package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

/* loaded from: classes11.dex */
public final class GetWalletFundingInstrumentsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetWalletFundingInstrumentsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.PaymentFundingInstrumentsRepository> getHighSpeedVideoFpsRanges;

    private GetWalletFundingInstrumentsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.PaymentFundingInstrumentsRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetWalletFundingInstrumentsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetWalletFundingInstrumentsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.PaymentFundingInstrumentsRepository> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetWalletFundingInstrumentsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetWalletFundingInstrumentsUseCase newInstance(com.paypal.oslo.feature.bnplacquisition.domain.repository.PaymentFundingInstrumentsRepository paymentFundingInstrumentsRepository) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetWalletFundingInstrumentsUseCase(paymentFundingInstrumentsRepository);
    }
}
