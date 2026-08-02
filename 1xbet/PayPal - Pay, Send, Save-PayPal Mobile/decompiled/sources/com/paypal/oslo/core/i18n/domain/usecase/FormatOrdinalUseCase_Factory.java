package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class FormatOrdinalUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> getHighSpeedVideoFpsRanges;

    private FormatOrdinalUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider) {
        return new com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase_Factory(provider);
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase newInstance(com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache) {
        return new com.paypal.oslo.core.i18n.domain.usecase.FormatOrdinalUseCase(localeResolverCache);
    }
}
