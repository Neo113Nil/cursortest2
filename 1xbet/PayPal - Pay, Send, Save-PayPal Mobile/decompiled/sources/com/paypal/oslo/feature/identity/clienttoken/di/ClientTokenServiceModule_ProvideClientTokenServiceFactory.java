package com.paypal.oslo.feature.identity.clienttoken.di;

/* loaded from: classes5.dex */
public final class ClientTokenServiceModule_ProvideClientTokenServiceFactory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.clienttoken.data.service.ClientTokenService> {
    private final dagger.internal.Provider<retrofit2.Retrofit> getHighSpeedVideoSizes;

    private ClientTokenServiceModule_ProvideClientTokenServiceFactory(dagger.internal.Provider<retrofit2.Retrofit> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.clienttoken.data.service.ClientTokenService get() {
        return provideClientTokenService(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.identity.clienttoken.di.ClientTokenServiceModule_ProvideClientTokenServiceFactory create(dagger.internal.Provider<retrofit2.Retrofit> provider) {
        return new com.paypal.oslo.feature.identity.clienttoken.di.ClientTokenServiceModule_ProvideClientTokenServiceFactory(provider);
    }

    public static com.paypal.oslo.feature.identity.clienttoken.data.service.ClientTokenService provideClientTokenService(retrofit2.Retrofit retrofit) {
        return (com.paypal.oslo.feature.identity.clienttoken.data.service.ClientTokenService) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.identity.clienttoken.di.ClientTokenServiceModule.INSTANCE.provideClientTokenService(retrofit));
    }
}
