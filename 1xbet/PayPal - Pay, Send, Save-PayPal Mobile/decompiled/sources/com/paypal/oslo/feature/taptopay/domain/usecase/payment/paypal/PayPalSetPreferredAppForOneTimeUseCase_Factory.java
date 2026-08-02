package com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal;

/* loaded from: classes15.dex */
public final class PayPalSetPreferredAppForOneTimeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalSetPreferredAppForOneTimeUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsDefaultPaymentAppUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.SetPreferredAppForOneTimeUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private PayPalSetPreferredAppForOneTimeUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.SetPreferredAppForOneTimeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsDefaultPaymentAppUseCase> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalSetPreferredAppForOneTimeUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalSetPreferredAppForOneTimeUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.SetPreferredAppForOneTimeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsDefaultPaymentAppUseCase> provider2) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalSetPreferredAppForOneTimeUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalSetPreferredAppForOneTimeUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.payment.SetPreferredAppForOneTimeUseCase setPreferredAppForOneTimeUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsDefaultPaymentAppUseCase payPalIsDefaultPaymentAppUseCase) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalSetPreferredAppForOneTimeUseCase(setPreferredAppForOneTimeUseCase, payPalIsDefaultPaymentAppUseCase);
    }
}
