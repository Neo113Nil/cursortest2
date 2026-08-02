package com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper;

/* loaded from: classes14.dex */
public final class ReviewPaymentUiModelMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade> getHighSpeedVideoFpsRangesFor;

    private ReviewPaymentUiModelMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade> provider2) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade dateFormatterFacade) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.makeapayment.reviewpayment.mapper.ReviewPaymentUiModelMapper(currencyFormatterFacade, dateFormatterFacade);
    }
}
