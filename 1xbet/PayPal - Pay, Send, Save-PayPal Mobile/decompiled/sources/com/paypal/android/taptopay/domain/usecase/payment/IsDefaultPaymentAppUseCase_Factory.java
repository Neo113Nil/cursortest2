package com.paypal.android.taptopay.domain.usecase.payment;

/* loaded from: classes10.dex */
public final class IsDefaultPaymentAppUseCase_Factory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.usecase.payment.IsDefaultPaymentAppUseCase> {
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.PaymentRepository> getHighSpeedVideoFpsRangesFor;

    public IsDefaultPaymentAppUseCase_Factory(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.PaymentRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.usecase.payment.IsDefaultPaymentAppUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.android.taptopay.domain.usecase.payment.IsDefaultPaymentAppUseCase_Factory create(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.payment.PaymentRepository> provider) {
        return new com.paypal.android.taptopay.domain.usecase.payment.IsDefaultPaymentAppUseCase_Factory(provider);
    }

    public static com.paypal.android.taptopay.domain.usecase.payment.IsDefaultPaymentAppUseCase newInstance(com.paypal.android.taptopay.domain.repository.payment.PaymentRepository paymentRepository) {
        return new com.paypal.android.taptopay.domain.usecase.payment.IsDefaultPaymentAppUseCase(paymentRepository);
    }
}
