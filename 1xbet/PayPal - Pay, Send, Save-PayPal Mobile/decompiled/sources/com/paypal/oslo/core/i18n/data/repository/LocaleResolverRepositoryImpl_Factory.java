package com.paypal.oslo.core.i18n.data.repository;

/* loaded from: classes10.dex */
public final class LocaleResolverRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.data.repository.LocaleResolverRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.data.datasource.LocaleResolverAssetMetadata> getHighSpeedVideoSizes;

    private LocaleResolverRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.data.datasource.LocaleResolverAssetMetadata> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.data.repository.LocaleResolverRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.core.i18n.data.repository.LocaleResolverRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.data.datasource.LocaleResolverAssetMetadata> provider) {
        return new com.paypal.oslo.core.i18n.data.repository.LocaleResolverRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.core.i18n.data.repository.LocaleResolverRepositoryImpl newInstance(com.paypal.oslo.core.i18n.data.datasource.LocaleResolverAssetMetadata localeResolverAssetMetadata) {
        return new com.paypal.oslo.core.i18n.data.repository.LocaleResolverRepositoryImpl(localeResolverAssetMetadata);
    }
}
