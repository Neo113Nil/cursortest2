package com.paypal.android.taptopay.domain.usecase.payment;

/* loaded from: classes10.dex */
public final class IsListedAsPaymentAppUseCase_Factory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.usecase.payment.IsListedAsPaymentAppUseCase> {
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.PaymentRepository> Camera2StreamConfigurationMap;

    public IsListedAsPaymentAppUseCase_Factory(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.PaymentRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.usecase.payment.IsListedAsPaymentAppUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.android.taptopay.domain.usecase.payment.IsListedAsPaymentAppUseCase_Factory create(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.PaymentRepository> provider) {
        return new com.paypal.android.taptopay.domain.usecase.payment.IsListedAsPaymentAppUseCase_Factory(provider);
    }

    public static com.paypal.android.taptopay.domain.usecase.payment.IsListedAsPaymentAppUseCase newInstance(com.paypal.android.taptopay.domain.repository.payment.PaymentRepository paymentRepository) {
        return new com.paypal.android.taptopay.domain.usecase.payment.IsListedAsPaymentAppUseCase(paymentRepository);
    }
}
