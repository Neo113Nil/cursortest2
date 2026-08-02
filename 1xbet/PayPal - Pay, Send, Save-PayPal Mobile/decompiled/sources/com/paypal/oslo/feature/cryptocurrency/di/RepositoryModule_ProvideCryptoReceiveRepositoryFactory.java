package com.paypal.oslo.feature.cryptocurrency.di;

/* loaded from: classes12.dex */
public final class RepositoryModule_ProvideCryptoReceiveRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.domain.repository.receive.CryptoReceiveRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl> Camera2StreamConfigurationMap;

    private RepositoryModule_ProvideCryptoReceiveRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.domain.repository.receive.CryptoReceiveRepository get() {
        return provideCryptoReceiveRepository(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.di.RepositoryModule_ProvideCryptoReceiveRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.di.RepositoryModule_ProvideCryptoReceiveRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.repository.receive.CryptoReceiveRepository provideCryptoReceiveRepository(com.paypal.oslo.feature.cryptocurrency.data.repository.receive.CryptoReceiveRepositoryImpl cryptoReceiveRepositoryImpl) {
        return (com.paypal.oslo.feature.cryptocurrency.domain.repository.receive.CryptoReceiveRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.cryptocurrency.di.RepositoryModule.INSTANCE.provideCryptoReceiveRepository(cryptoReceiveRepositoryImpl));
    }
}
