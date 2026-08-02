package com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal;

/* loaded from: classes15.dex */
public final class PayPalSetDefaultPaymentAppUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalSetDefaultPaymentAppUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.SetDefaultPaymentAppUseCase> Camera2StreamConfigurationMap;

    private PayPalSetDefaultPaymentAppUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.SetDefaultPaymentAppUseCase> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalSetDefaultPaymentAppUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalSetDefaultPaymentAppUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.SetDefaultPaymentAppUseCase> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalSetDefaultPaymentAppUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalSetDefaultPaymentAppUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.payment.SetDefaultPaymentAppUseCase setDefaultPaymentAppUseCase) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalSetDefaultPaymentAppUseCase(setDefaultPaymentAppUseCase);
    }
}
