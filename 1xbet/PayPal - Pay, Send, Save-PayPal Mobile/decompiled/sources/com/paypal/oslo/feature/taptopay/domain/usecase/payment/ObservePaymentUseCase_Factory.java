package com.paypal.oslo.feature.taptopay.domain.usecase.payment;

/* loaded from: classes15.dex */
public final class ObservePaymentUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.payment.ObservePaymentUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository> Camera2StreamConfigurationMap;

    private ObservePaymentUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.payment.ObservePaymentUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.payment.ObservePaymentUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.payment.ObservePaymentUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.payment.ObservePaymentUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.repository.payment.PaymentRepository paymentRepository) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.payment.ObservePaymentUseCase(paymentRepository);
    }
}
