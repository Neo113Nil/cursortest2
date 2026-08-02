package com.paypal.oslo.feature.cryptocurrency.di;

/* loaded from: classes12.dex */
public final class RepositoryModule_ProvideCryptoHoldingsRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.holdings.CryptoHoldingsRepositoryImpl> getHighSpeedVideoSizes;

    private RepositoryModule_ProvideCryptoHoldingsRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.holdings.CryptoHoldingsRepositoryImpl> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository get() {
        return provideCryptoHoldingsRepository(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.di.RepositoryModule_ProvideCryptoHoldingsRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.holdings.CryptoHoldingsRepositoryImpl> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.di.RepositoryModule_ProvideCryptoHoldingsRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository provideCryptoHoldingsRepository(com.paypal.oslo.feature.cryptocurrency.data.repository.holdings.CryptoHoldingsRepositoryImpl cryptoHoldingsRepositoryImpl) {
        return (com.paypal.oslo.feature.cryptocurrency.domain.repository.holdings.CryptoHoldingsRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.cryptocurrency.di.RepositoryModule.INSTANCE.provideCryptoHoldingsRepository(cryptoHoldingsRepositoryImpl));
    }
}
