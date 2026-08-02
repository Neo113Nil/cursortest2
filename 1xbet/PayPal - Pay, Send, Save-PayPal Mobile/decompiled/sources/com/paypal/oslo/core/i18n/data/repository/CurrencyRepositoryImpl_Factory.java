package com.paypal.oslo.core.i18n.data.repository;

/* loaded from: classes10.dex */
public final class CurrencyRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.data.repository.CurrencyRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.data.repository.NetworkRepository> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<kotlinx.serialization.json.Json> getHighSpeedVideoSizes;

    private CurrencyRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.data.repository.NetworkRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider2, dagger.internal.Provider<kotlinx.serialization.json.Json> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.data.repository.CurrencyRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.core.i18n.data.repository.CurrencyRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.data.repository.NetworkRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider2, dagger.internal.Provider<kotlinx.serialization.json.Json> provider3) {
        return new com.paypal.oslo.core.i18n.data.repository.CurrencyRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.core.i18n.data.repository.CurrencyRepositoryImpl newInstance(com.paypal.oslo.core.i18n.data.repository.NetworkRepository networkRepository, com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache, kotlinx.serialization.json.Json json) {
        return new com.paypal.oslo.core.i18n.data.repository.CurrencyRepositoryImpl(networkRepository, localeResolverCache, json);
    }
}
