package com.paypal.oslo.feature.dataprivacy.di;

/* loaded from: classes5.dex */
public final class NetworkModule_ProvideDataPrivacyRestServiceFactory implements dagger.internal.Factory<com.paypal.oslo.feature.dataprivacy.data.network.DataPrivacyRestService> {
    private final dagger.internal.Provider<retrofit2.Retrofit> getHighSpeedVideoSizes;

    private NetworkModule_ProvideDataPrivacyRestServiceFactory(dagger.internal.Provider<retrofit2.Retrofit> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.dataprivacy.data.network.DataPrivacyRestService get() {
        return provideDataPrivacyRestService(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.dataprivacy.di.NetworkModule_ProvideDataPrivacyRestServiceFactory create(dagger.internal.Provider<retrofit2.Retrofit> provider) {
        return new com.paypal.oslo.feature.dataprivacy.di.NetworkModule_ProvideDataPrivacyRestServiceFactory(provider);
    }

    public static com.paypal.oslo.feature.dataprivacy.data.network.DataPrivacyRestService provideDataPrivacyRestService(retrofit2.Retrofit retrofit) {
        return (com.paypal.oslo.feature.dataprivacy.data.network.DataPrivacyRestService) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.dataprivacy.di.NetworkModule.INSTANCE.provideDataPrivacyRestService(retrofit));
    }
}
