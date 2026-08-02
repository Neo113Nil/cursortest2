package com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper;

/* loaded from: classes14.dex */
public final class ActivityHubTransactionItemUiModelMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> getHighSpeedVideoFpsRanges;

    private ActivityHubTransactionItemUiModelMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> provider, dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade> provider2) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade, com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.date.DateFormatterFacade dateFormatterFacade) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.activity.mapper.ActivityHubTransactionItemUiModelMapper(currencyFormatterFacade, dateFormatterFacade);
    }
}
