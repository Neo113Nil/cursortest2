package com.paypal.oslo.core.i18n.di;

/* loaded from: classes10.dex */
public final class I18nNetworkModule_ProvideNetworkRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.data.repository.NetworkRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.data.service.I18nMetadataApiService> getHighResolutionOutputSizeshNQ4ISI;

    private I18nNetworkModule_ProvideNetworkRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.core.i18n.data.service.I18nMetadataApiService> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.data.repository.NetworkRepository get() {
        return provideNetworkRepository(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.i18n.di.I18nNetworkModule_ProvideNetworkRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.data.service.I18nMetadataApiService> provider) {
        return new com.paypal.oslo.core.i18n.di.I18nNetworkModule_ProvideNetworkRepositoryFactory(provider);
    }

    public static com.paypal.oslo.core.i18n.data.repository.NetworkRepository provideNetworkRepository(com.paypal.oslo.core.i18n.data.service.I18nMetadataApiService i18nMetadataApiService) {
        return (com.paypal.oslo.core.i18n.data.repository.NetworkRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.i18n.di.I18nNetworkModule.INSTANCE.provideNetworkRepository(i18nMetadataApiService));
    }
}
