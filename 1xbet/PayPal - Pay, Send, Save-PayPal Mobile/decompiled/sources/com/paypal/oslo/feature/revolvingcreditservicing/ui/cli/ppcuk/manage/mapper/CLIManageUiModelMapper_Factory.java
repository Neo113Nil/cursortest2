package com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.mapper;

/* loaded from: classes14.dex */
public final class CLIManageUiModelMapper_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.mapper.CLIManageUiModelMapper> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> getHighResolutionOutputSizeshNQ4ISI;

    private CLIManageUiModelMapper_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.mapper.CLIManageUiModelMapper get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.mapper.CLIManageUiModelMapper_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.mapper.CLIManageUiModelMapper_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.mapper.CLIManageUiModelMapper newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.formatter.currency.CurrencyFormatterFacade currencyFormatterFacade) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.ui.cli.ppcuk.manage.mapper.CLIManageUiModelMapper(currencyFormatterFacade);
    }
}
