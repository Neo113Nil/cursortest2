package com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal;

/* loaded from: classes15.dex */
public final class PayPalShowAsPaymentAppUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalShowAsPaymentAppUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.ShowAsPaymentAppUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private PayPalShowAsPaymentAppUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.ShowAsPaymentAppUseCase> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalShowAsPaymentAppUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalShowAsPaymentAppUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.ShowAsPaymentAppUseCase> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalShowAsPaymentAppUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalShowAsPaymentAppUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.payment.ShowAsPaymentAppUseCase showAsPaymentAppUseCase) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalShowAsPaymentAppUseCase(showAsPaymentAppUseCase);
    }
}
