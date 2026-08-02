package com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper;

/* loaded from: classes14.dex */
public final class ScheduledPaymentInfoMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.ScheduledPaymentInfoMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> getHighSpeedVideoSizes;

    private ScheduledPaymentInfoMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade> provider2) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.ScheduledPaymentInfoMapper get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.ScheduledPaymentInfoMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade> provider2) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.ScheduledPaymentInfoMapper_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.ScheduledPaymentInfoMapper newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade dateFormatterFacade) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.common.components.mapper.ScheduledPaymentInfoMapper(currencyFormatterFacade, dateFormatterFacade);
    }
}
