package com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal;

/* loaded from: classes15.dex */
public final class PayPalObservePaymentUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObservePaymentUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.ObservePaymentUseCase> getHighSpeedVideoFpsRanges;

    private PayPalObservePaymentUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.ObservePaymentUseCase> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObservePaymentUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObservePaymentUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.ObservePaymentUseCase> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObservePaymentUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObservePaymentUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.payment.ObservePaymentUseCase observePaymentUseCase) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalObservePaymentUseCase(observePaymentUseCase);
    }
}
