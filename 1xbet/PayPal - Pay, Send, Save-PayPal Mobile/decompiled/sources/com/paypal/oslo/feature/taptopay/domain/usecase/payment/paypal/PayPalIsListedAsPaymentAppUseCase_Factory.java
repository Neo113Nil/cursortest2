package com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal;

/* loaded from: classes15.dex */
public final class PayPalIsListedAsPaymentAppUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsListedAsPaymentAppUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsListedAsPaymentAppUseCase> getHighSpeedVideoFpsRangesFor;

    private PayPalIsListedAsPaymentAppUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsListedAsPaymentAppUseCase> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsListedAsPaymentAppUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsListedAsPaymentAppUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsListedAsPaymentAppUseCase> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsListedAsPaymentAppUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsListedAsPaymentAppUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.payment.IsListedAsPaymentAppUseCase isListedAsPaymentAppUseCase) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsListedAsPaymentAppUseCase(isListedAsPaymentAppUseCase);
    }
}
