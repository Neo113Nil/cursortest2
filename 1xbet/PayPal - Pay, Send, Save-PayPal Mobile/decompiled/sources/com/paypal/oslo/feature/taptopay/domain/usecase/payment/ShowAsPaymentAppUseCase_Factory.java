package com.paypal.oslo.feature.taptopay.domain.usecase.payment;

/* loaded from: classes15.dex */
public final class ShowAsPaymentAppUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.payment.ShowAsPaymentAppUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository> getHighResolutionOutputSizeshNQ4ISI;

    private ShowAsPaymentAppUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.payment.ShowAsPaymentAppUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.payment.ShowAsPaymentAppUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.payment.ShowAsPaymentAppUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.payment.ShowAsPaymentAppUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository paymentRepository) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.payment.ShowAsPaymentAppUseCase(paymentRepository);
    }
}
