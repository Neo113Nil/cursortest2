package com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper;

/* loaded from: classes14.dex */
public final class SpecialFinancingMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> getHighResolutionOutputSizeshNQ4ISI;

    private SpecialFinancingMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade> provider2) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade dateFormatterFacade) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.specialfinancing.list.mapper.SpecialFinancingMapper(currencyFormatterFacade, dateFormatterFacade);
    }
}
