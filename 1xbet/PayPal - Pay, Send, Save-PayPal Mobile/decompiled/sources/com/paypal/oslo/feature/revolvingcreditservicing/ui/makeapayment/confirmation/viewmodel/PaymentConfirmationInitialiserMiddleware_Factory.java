package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel;

/* loaded from: classes14.dex */
public final class PaymentConfirmationInitialiserMiddleware_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationInitialiserMiddleware> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> getHighSpeedVideoFpsRangesFor;

    private PaymentConfirmationInitialiserMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationInitialiserMiddleware get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationInitialiserMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationInitialiserMiddleware_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationInitialiserMiddleware newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.viewmodel.PaymentConfirmationInitialiserMiddleware(currencyFormatterFacade);
    }
}
