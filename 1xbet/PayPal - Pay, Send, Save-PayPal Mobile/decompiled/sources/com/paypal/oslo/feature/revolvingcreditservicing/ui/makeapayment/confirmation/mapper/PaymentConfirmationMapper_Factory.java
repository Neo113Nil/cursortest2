package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.mapper;

/* loaded from: classes14.dex */
public final class PaymentConfirmationMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.mapper.PaymentConfirmationMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade> getHighSpeedVideoFpsRangesFor;

    private PaymentConfirmationMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.mapper.PaymentConfirmationMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.mapper.PaymentConfirmationMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.mapper.PaymentConfirmationMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.mapper.PaymentConfirmationMapper newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade dateFormatterFacade) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.confirmation.mapper.PaymentConfirmationMapper(dateFormatterFacade);
    }
}
