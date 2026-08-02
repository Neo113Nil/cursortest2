package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class FormatAmountUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.FormatAmountUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatNumberUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> getHighSpeedVideoFpsRanges;

    private FormatAmountUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatNumberUseCase> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.FormatAmountUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.FormatAmountUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatNumberUseCase> provider2) {
        return new com.paypal.oslo.core.i18n.domain.usecase.FormatAmountUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.FormatAmountUseCase newInstance(com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache, com.paypal.oslo.core.i18n.domain.usecase.FormatNumberUseCase formatNumberUseCase) {
        return new com.paypal.oslo.core.i18n.domain.usecase.FormatAmountUseCase(localeResolverCache, formatNumberUseCase);
    }
}
