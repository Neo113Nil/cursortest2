package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class ReconfigureI18nUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.ReconfigureI18nUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.I18NConfigurator> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoSizes;

    private ReconfigureI18nUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.I18NConfigurator> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.ReconfigureI18nUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.ReconfigureI18nUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache> provider, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.I18NConfigurator> provider3) {
        return new com.paypal.oslo.core.i18n.domain.usecase.ReconfigureI18nUseCase_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.ReconfigureI18nUseCase newInstance(com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache localeResolverCache, com.paypal.oslo.core.userstore.UserStore userStore, com.paypal.oslo.core.i18n.domain.interfaces.I18NConfigurator i18NConfigurator) {
        return new com.paypal.oslo.core.i18n.domain.usecase.ReconfigureI18nUseCase(localeResolverCache, userStore, i18NConfigurator);
    }
}
