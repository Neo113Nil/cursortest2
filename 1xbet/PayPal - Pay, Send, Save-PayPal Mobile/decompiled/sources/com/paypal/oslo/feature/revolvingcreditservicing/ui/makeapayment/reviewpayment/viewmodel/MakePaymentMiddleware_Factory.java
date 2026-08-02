package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel;

/* loaded from: classes14.dex */
public final class MakePaymentMiddleware_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.MakePaymentMiddleware> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.payment.MakePaymentUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.mapper.PaymentConfirmationMapper> getHighResolutionOutputSizeshNQ4ISI;

    private MakePaymentMiddleware_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.payment.MakePaymentUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.mapper.PaymentConfirmationMapper> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.MakePaymentMiddleware get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.MakePaymentMiddleware_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.payment.MakePaymentUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.mapper.PaymentConfirmationMapper> provider2) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.MakePaymentMiddleware_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.MakePaymentMiddleware newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.payment.MakePaymentUseCase makePaymentUseCase, com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.mapper.PaymentConfirmationMapper paymentConfirmationMapper) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.viewmodel.MakePaymentMiddleware(makePaymentUseCase, paymentConfirmationMapper);
    }
}
