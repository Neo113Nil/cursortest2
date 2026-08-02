package com.paypal.oslo.feature.taptopay.ui.router.setasdefault;

/* loaded from: classes15.dex */
public final class SetAsDefaultRouterViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsDefaultPaymentAppUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase> getHighSpeedVideoSizes;

    private SetAsDefaultRouterViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsDefaultPaymentAppUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsDefaultPaymentAppUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker> provider3) {
        return new com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterViewModel newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase payPalGetAllCardsUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.payment.paypal.PayPalIsDefaultPaymentAppUseCase payPalIsDefaultPaymentAppUseCase, com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker payLaterExpiryChecker) {
        return new com.paypal.oslo.feature.taptopay.ui.router.setasdefault.SetAsDefaultRouterViewModel(payPalGetAllCardsUseCase, payPalIsDefaultPaymentAppUseCase, payLaterExpiryChecker);
    }
}
