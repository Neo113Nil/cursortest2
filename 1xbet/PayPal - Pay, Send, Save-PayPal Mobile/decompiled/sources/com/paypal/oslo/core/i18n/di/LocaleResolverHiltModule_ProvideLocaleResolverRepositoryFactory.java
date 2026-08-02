package com.paypal.oslo.core.i18n.di;

/* loaded from: classes4.dex */
public final class LocaleResolverHiltModule_ProvideLocaleResolverRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.repository.LocaleResolverRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.data.datasource.LocaleResolverAssetMetadata> Camera2StreamConfigurationMap;

    private LocaleResolverHiltModule_ProvideLocaleResolverRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.core.i18n.data.datasource.LocaleResolverAssetMetadata> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.repository.LocaleResolverRepository get() {
        return provideLocaleResolverRepository(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.core.i18n.di.LocaleResolverHiltModule_ProvideLocaleResolverRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.data.datasource.LocaleResolverAssetMetadata> provider) {
        return new com.paypal.oslo.core.i18n.di.LocaleResolverHiltModule_ProvideLocaleResolverRepositoryFactory(provider);
    }

    public static com.paypal.oslo.core.i18n.domain.repository.LocaleResolverRepository provideLocaleResolverRepository(com.paypal.oslo.core.i18n.data.datasource.LocaleResolverAssetMetadata localeResolverAssetMetadata) {
        return (com.paypal.oslo.core.i18n.domain.repository.LocaleResolverRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.i18n.di.LocaleResolverHiltModule.INSTANCE.provideLocaleResolverRepository(localeResolverAssetMetadata));
    }
}
