package com.paypal.oslo.core.i18n.di;

@kotlin.Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\ba\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH'¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0014\u0010\u0015À\u0006\u0003"}, d2 = {"Lcom/paypal/oslo/core/i18n/di/I18nDataModule;", "", "Lcom/paypal/oslo/core/i18n/data/implementation/I18NConfiguratorImpl;", "i18NConfiguratorImpl", "Lcom/paypal/oslo/core/i18n/domain/interfaces/I18NConfigurator;", "bindI18NConfigurator", "(Lcom/paypal/oslo/core/i18n/data/implementation/I18NConfiguratorImpl;)Lcom/paypal/oslo/core/i18n/domain/interfaces/I18NConfigurator;", "Lcom/paypal/oslo/core/i18n/data/cache/LocaleResolverCacheImpl;", "localeResolverCacheImpl", "Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "bindLocaleResolverCache", "(Lcom/paypal/oslo/core/i18n/data/cache/LocaleResolverCacheImpl;)Lcom/paypal/oslo/core/i18n/domain/cache/LocaleResolverCache;", "Lcom/paypal/oslo/core/i18n/data/implementation/LocaleProviderImpl;", "localeProviderImpl", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "bindLocaleProvider", "(Lcom/paypal/oslo/core/i18n/data/implementation/LocaleProviderImpl;)Lcom/paypal/oslo/core/i18n/domain/interfaces/LocaleProvider;", "Lcom/paypal/oslo/core/i18n/data/implementation/LanguageOverrideStrategyImpl;", "languageOverrideStrategyImpl", "Lcom/paypal/oslo/core/i18n/domain/interfaces/LanguageOverrideStrategy;", "bindLanguageOverrideStrategyImpl", "(Lcom/paypal/oslo/core/i18n/data/implementation/LanguageOverrideStrategyImpl;)Lcom/paypal/oslo/core/i18n/domain/interfaces/LanguageOverrideStrategy;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes10.dex */
public interface I18nDataModule {
    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.i18n.domain.interfaces.I18NConfigurator bindI18NConfigurator(com.paypal.oslo.core.i18n.data.implementation.I18NConfiguratorImpl i18NConfiguratorImpl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.i18n.domain.interfaces.LanguageOverrideStrategy bindLanguageOverrideStrategyImpl(com.paypal.oslo.core.i18n.data.implementation.LanguageOverrideStrategyImpl languageOverrideStrategyImpl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider bindLocaleProvider(com.paypal.oslo.core.i18n.data.implementation.LocaleProviderImpl localeProviderImpl);

    @javax.inject.Singleton
    @dagger.Binds
    com.paypal.oslo.core.i18n.domain.cache.LocaleResolverCache bindLocaleResolverCache(com.paypal.oslo.core.i18n.data.cache.LocaleResolverCacheImpl localeResolverCacheImpl);
}
