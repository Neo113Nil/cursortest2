package com.paypal.oslo.feature.bnplacquisition.domain.usecase;

/* loaded from: classes11.dex */
public final class GetPaymentFundingInstrumentsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetPaymentFundingInstrumentsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.PaymentFundingInstrumentsRepository> Camera2StreamConfigurationMap;

    private GetPaymentFundingInstrumentsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.PaymentFundingInstrumentsRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetPaymentFundingInstrumentsUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetPaymentFundingInstrumentsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.repository.PaymentFundingInstrumentsRepository> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetPaymentFundingInstrumentsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetPaymentFundingInstrumentsUseCase newInstance(com.paypal.oslo.feature.bnplacquisition.domain.repository.PaymentFundingInstrumentsRepository paymentFundingInstrumentsRepository) {
        return new com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetPaymentFundingInstrumentsUseCase(paymentFundingInstrumentsRepository);
    }
}
