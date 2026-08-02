package com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment;

/* loaded from: classes15.dex */
public final class ChooseDefaultPaymentViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsDefaultPaymentAppUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.SetDefaultPaymentAppUseCase> getHighSpeedVideoSizes;

    private ChooseDefaultPaymentViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsDefaultPaymentAppUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.SetDefaultPaymentAppUseCase> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsDefaultPaymentAppUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.SetDefaultPaymentAppUseCase> provider2) {
        return new com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentViewModel newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsDefaultPaymentAppUseCase payPalIsDefaultPaymentAppUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.payment.SetDefaultPaymentAppUseCase setDefaultPaymentAppUseCase) {
        return new com.paypal.oslo.feature.taptopay.ui.shared.defaultpayment.ChooseDefaultPaymentViewModel(payPalIsDefaultPaymentAppUseCase, setDefaultPaymentAppUseCase);
    }
}
