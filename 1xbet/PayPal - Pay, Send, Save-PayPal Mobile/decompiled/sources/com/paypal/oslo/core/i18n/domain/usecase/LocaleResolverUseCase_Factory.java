package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class LocaleResolverUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.resolver.LanguageResolver> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.LocaleResolverRepository> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.resolver.CountryResolver> getHighSpeedVideoSizes;

    private LocaleResolverUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.LocaleResolverRepository> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.resolver.CountryResolver> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.resolver.LanguageResolver> provider4) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.LocaleResolverRepository> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.resolver.CountryResolver> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.resolver.LanguageResolver> provider4) {
        return new com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase newInstance(com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache, com.paypal.oslo.core.i18n.domain.repository.LocaleResolverRepository localeResolverRepository, com.paypal.oslo.core.i18n.domain.resolver.CountryResolver countryResolver, com.paypal.oslo.core.i18n.domain.resolver.LanguageResolver languageResolver) {
        return new com.paypal.oslo.core.i18n.domain.usecase.LocaleResolverUseCase(localeResolverCache, localeResolverRepository, countryResolver, languageResolver);
    }
}
