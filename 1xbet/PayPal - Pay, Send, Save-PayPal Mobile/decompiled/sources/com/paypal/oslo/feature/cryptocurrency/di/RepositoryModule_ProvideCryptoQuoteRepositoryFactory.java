package com.paypal.oslo.feature.cryptocurrency.di;

/* loaded from: classes12.dex */
public final class RepositoryModule_ProvideCryptoQuoteRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.domain.repository.quote.CryptoQuoteRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoQuoteRepository> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.quote.CryptoQuoteRepositoryImpl> getHighSpeedVideoSizes;

    private RepositoryModule_ProvideCryptoQuoteRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoQuoteRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.quote.CryptoQuoteRepositoryImpl> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.domain.repository.quote.CryptoQuoteRepository get() {
        return provideCryptoQuoteRepository(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.di.RepositoryModule_ProvideCryptoQuoteRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoQuoteRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.quote.CryptoQuoteRepositoryImpl> provider3) {
        return new com.paypal.oslo.feature.cryptocurrency.di.RepositoryModule_ProvideCryptoQuoteRepositoryFactory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.repository.quote.CryptoQuoteRepository provideCryptoQuoteRepository(com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager, com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoQuoteRepository mockCryptoQuoteRepository, com.paypal.oslo.feature.cryptocurrency.data.repository.quote.CryptoQuoteRepositoryImpl cryptoQuoteRepositoryImpl) {
        return (com.paypal.oslo.feature.cryptocurrency.domain.repository.quote.CryptoQuoteRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.cryptocurrency.di.RepositoryModule.INSTANCE.provideCryptoQuoteRepository(featureGateManager, mockCryptoQuoteRepository, cryptoQuoteRepositoryImpl));
    }
}
