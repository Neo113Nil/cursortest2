package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class FormatRelativeTimeUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.FormatRelativeTimeUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormattingStrategy>> getHighSpeedVideoFpsRanges;

    private FormatRelativeTimeUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider, dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormattingStrategy>> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.FormatRelativeTimeUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.FormatRelativeTimeUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider, dagger.internal.Provider<java.util.Set<com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormattingStrategy>> provider2) {
        return new com.paypal.oslo.core.i18n.domain.usecase.FormatRelativeTimeUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.FormatRelativeTimeUseCase newInstance(com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache, java.util.Set<com.paypal.oslo.core.i18n.domain.strategy.RelativeTimeFormattingStrategy> set) {
        return new com.paypal.oslo.core.i18n.domain.usecase.FormatRelativeTimeUseCase(localeResolverCache, set);
    }
}
