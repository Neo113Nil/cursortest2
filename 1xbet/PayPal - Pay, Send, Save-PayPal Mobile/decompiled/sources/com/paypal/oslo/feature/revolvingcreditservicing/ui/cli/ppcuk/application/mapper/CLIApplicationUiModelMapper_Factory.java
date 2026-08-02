package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.mapper;

/* loaded from: classes14.dex */
public final class CLIApplicationUiModelMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.mapper.CLIApplicationUiModelMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> getHighSpeedVideoFpsRanges;

    private CLIApplicationUiModelMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.mapper.CLIApplicationUiModelMapper get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.mapper.CLIApplicationUiModelMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.mapper.CLIApplicationUiModelMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.mapper.CLIApplicationUiModelMapper newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.application.mapper.CLIApplicationUiModelMapper(currencyFormatterFacade);
    }
}
