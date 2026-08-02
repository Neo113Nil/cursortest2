package com.paypal.oslo.feature.cryptocurrency.di;

/* loaded from: classes12.dex */
public final class RepositoryModule_ProvideCryptoMarketPricesRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.prices.CryptoMarketPricesRepositoryImpl> getHighSpeedVideoSizes;

    private RepositoryModule_ProvideCryptoMarketPricesRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.prices.CryptoMarketPricesRepositoryImpl> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository get() {
        return provideCryptoMarketPricesRepository(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.di.RepositoryModule_ProvideCryptoMarketPricesRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.prices.CryptoMarketPricesRepositoryImpl> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.di.RepositoryModule_ProvideCryptoMarketPricesRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository provideCryptoMarketPricesRepository(com.paypal.oslo.feature.cryptocurrency.data.repository.prices.CryptoMarketPricesRepositoryImpl cryptoMarketPricesRepositoryImpl) {
        return (com.paypal.oslo.feature.cryptocurrency.domain.repository.prices.CryptoMarketPricesRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.cryptocurrency.di.RepositoryModule.INSTANCE.provideCryptoMarketPricesRepository(cryptoMarketPricesRepositoryImpl));
    }
}
