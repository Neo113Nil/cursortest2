package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class FormatCurrencyUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.CurrencyRepository> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.CurrencyUtil> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAmountUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> getHighSpeedVideoFpsRangesFor;

    private FormatCurrencyUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.CurrencyRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.CurrencyUtil> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAmountUseCase> provider4) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.CurrencyRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.CurrencyUtil> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAmountUseCase> provider4) {
        return new com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase newInstance(com.paypal.oslo.core.i18n.domain.repository.CurrencyRepository currencyRepository, com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache, com.paypal.oslo.core.i18n.domain.util.CurrencyUtil currencyUtil, com.paypal.oslo.core.i18n.domain.usecase.FormatAmountUseCase formatAmountUseCase) {
        return new com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase(currencyRepository, localeResolverCache, currencyUtil, formatAmountUseCase);
    }
}
