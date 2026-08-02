package com.paypal.oslo.core.i18n.di;

/* loaded from: classes10.dex */
public final class I18nNetworkModule_ProvideApiServiceFactory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.data.service.I18nMetadataApiService> {
    private final dagger.internal.Provider<retrofit2.Retrofit> Camera2StreamConfigurationMap;

    private I18nNetworkModule_ProvideApiServiceFactory(dagger.internal.Provider<retrofit2.Retrofit> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.data.service.I18nMetadataApiService get() {
        return provideApiService(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.core.i18n.di.I18nNetworkModule_ProvideApiServiceFactory create(dagger.internal.Provider<retrofit2.Retrofit> provider) {
        return new com.paypal.oslo.core.i18n.di.I18nNetworkModule_ProvideApiServiceFactory(provider);
    }

    public static com.paypal.oslo.core.i18n.data.service.I18nMetadataApiService provideApiService(retrofit2.Retrofit retrofit) {
        return (com.paypal.oslo.core.i18n.data.service.I18nMetadataApiService) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.i18n.di.I18nNetworkModule.INSTANCE.provideApiService(retrofit));
    }
}
