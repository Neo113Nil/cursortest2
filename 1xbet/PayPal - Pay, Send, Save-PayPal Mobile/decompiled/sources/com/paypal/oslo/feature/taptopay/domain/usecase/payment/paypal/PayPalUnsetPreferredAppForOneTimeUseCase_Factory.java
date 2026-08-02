package com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal;

/* loaded from: classes15.dex */
public final class PayPalUnsetPreferredAppForOneTimeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalUnsetPreferredAppForOneTimeUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsDefaultPaymentAppUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.UnsetPreferredAppForOneTimeUseCase> getHighSpeedVideoFpsRangesFor;

    private PayPalUnsetPreferredAppForOneTimeUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.UnsetPreferredAppForOneTimeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsDefaultPaymentAppUseCase> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalUnsetPreferredAppForOneTimeUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalUnsetPreferredAppForOneTimeUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.UnsetPreferredAppForOneTimeUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsDefaultPaymentAppUseCase> provider2) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalUnsetPreferredAppForOneTimeUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalUnsetPreferredAppForOneTimeUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.payment.UnsetPreferredAppForOneTimeUseCase unsetPreferredAppForOneTimeUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsDefaultPaymentAppUseCase payPalIsDefaultPaymentAppUseCase) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalUnsetPreferredAppForOneTimeUseCase(unsetPreferredAppForOneTimeUseCase, payPalIsDefaultPaymentAppUseCase);
    }
}
