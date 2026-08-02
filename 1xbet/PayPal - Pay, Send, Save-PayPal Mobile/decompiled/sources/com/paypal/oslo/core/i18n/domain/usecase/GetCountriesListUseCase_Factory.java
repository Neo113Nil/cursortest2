package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class GetCountriesListUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.LocaleResolverRepository> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> getHighSpeedVideoFpsRangesFor;

    private GetCountriesListUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.LocaleResolverRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.LocaleResolverRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider2) {
        return new com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase newInstance(com.paypal.oslo.core.i18n.domain.repository.LocaleResolverRepository localeResolverRepository, com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache) {
        return new com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase(localeResolverRepository, localeResolverCache);
    }
}
