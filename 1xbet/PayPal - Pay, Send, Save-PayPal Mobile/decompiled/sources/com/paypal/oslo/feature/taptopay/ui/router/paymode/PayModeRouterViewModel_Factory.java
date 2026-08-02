package com.paypal.oslo.feature.taptopay.ui.router.paymode;

/* loaded from: classes15.dex */
public final class PayModeRouterViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker> getHighSpeedVideoSizes;

    private PayModeRouterViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker> provider2) {
        return new com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterViewModel newInstance(com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.PayPalGetAllCardsUseCase payPalGetAllCardsUseCase, com.paypal.oslo.feature.taptopay.ui.core.util.PayLaterExpiryChecker payLaterExpiryChecker) {
        return new com.paypal.oslo.feature.taptopay.ui.router.paymode.PayModeRouterViewModel(payPalGetAllCardsUseCase, payLaterExpiryChecker);
    }
}
