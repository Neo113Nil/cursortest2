package com.paypal.oslo.feature.cryptocurrency.di;

/* loaded from: classes12.dex */
public final class RepositoryModule_ProvideCryptoTradeRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.domain.repository.trade.CryptoTradeRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.trade.CryptoTradeRepositoryImpl> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoTradeRepository> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> getHighSpeedVideoSizes;

    private RepositoryModule_ProvideCryptoTradeRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoTradeRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.trade.CryptoTradeRepositoryImpl> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.domain.repository.trade.CryptoTradeRepository get() {
        return provideCryptoTradeRepository(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.di.RepositoryModule_ProvideCryptoTradeRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoTradeRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.trade.CryptoTradeRepositoryImpl> provider3) {
        return new com.paypal.oslo.feature.cryptocurrency.di.RepositoryModule_ProvideCryptoTradeRepositoryFactory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.repository.trade.CryptoTradeRepository provideCryptoTradeRepository(com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager, com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoTradeRepository mockCryptoTradeRepository, com.paypal.oslo.feature.cryptocurrency.data.repository.trade.CryptoTradeRepositoryImpl cryptoTradeRepositoryImpl) {
        return (com.paypal.oslo.feature.cryptocurrency.domain.repository.trade.CryptoTradeRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.cryptocurrency.di.RepositoryModule.INSTANCE.provideCryptoTradeRepository(featureGateManager, mockCryptoTradeRepository, cryptoTradeRepositoryImpl));
    }
}
