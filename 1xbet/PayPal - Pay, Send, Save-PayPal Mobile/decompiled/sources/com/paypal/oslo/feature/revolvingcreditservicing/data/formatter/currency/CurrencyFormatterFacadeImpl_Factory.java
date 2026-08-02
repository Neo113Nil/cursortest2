package com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.currency;

/* loaded from: classes14.dex */
public final class CurrencyFormatterFacadeImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.currency.CurrencyFormatterFacadeImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> getHighSpeedVideoFpsRanges;

    private CurrencyFormatterFacadeImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.currency.CurrencyFormatterFacadeImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.currency.CurrencyFormatterFacadeImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.currency.CurrencyFormatterFacadeImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.currency.CurrencyFormatterFacadeImpl newInstance(com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.currency.CurrencyFormatterFacadeImpl(formatCurrencyUseCase);
    }
}
