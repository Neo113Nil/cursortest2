package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class GetCurrencyDetailsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.GetCurrencyDetailsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.CurrencyUtil> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.CurrencyRepository> getHighSpeedVideoFpsRangesFor;

    private GetCurrencyDetailsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.CurrencyRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.CurrencyUtil> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.GetCurrencyDetailsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.GetCurrencyDetailsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.CurrencyRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.CurrencyUtil> provider3) {
        return new com.paypal.oslo.core.i18n.domain.usecase.GetCurrencyDetailsUseCase_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.GetCurrencyDetailsUseCase newInstance(com.paypal.oslo.core.i18n.domain.repository.CurrencyRepository currencyRepository, com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache, com.paypal.oslo.core.i18n.domain.util.CurrencyUtil currencyUtil) {
        return new com.paypal.oslo.core.i18n.domain.usecase.GetCurrencyDetailsUseCase(currencyRepository, localeResolverCache, currencyUtil);
    }
}
