package com.paypal.oslo.feature.cryptocurrency.di;

/* loaded from: classes12.dex */
public final class RepositoryModule_ProvideCryptoFundingRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.domain.repository.funding.CryptoFundingRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.funding.CryptoFundingRepositoryImpl> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoFundingRepository> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> getHighSpeedVideoSizes;

    private RepositoryModule_ProvideCryptoFundingRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoFundingRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.funding.CryptoFundingRepositoryImpl> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.domain.repository.funding.CryptoFundingRepository get() {
        return provideCryptoFundingRepository(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.di.RepositoryModule_ProvideCryptoFundingRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoFundingRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.funding.CryptoFundingRepositoryImpl> provider3) {
        return new com.paypal.oslo.feature.cryptocurrency.di.RepositoryModule_ProvideCryptoFundingRepositoryFactory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.repository.funding.CryptoFundingRepository provideCryptoFundingRepository(com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager, com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoFundingRepository mockCryptoFundingRepository, com.paypal.oslo.feature.cryptocurrency.data.repository.funding.CryptoFundingRepositoryImpl cryptoFundingRepositoryImpl) {
        return (com.paypal.oslo.feature.cryptocurrency.domain.repository.funding.CryptoFundingRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.cryptocurrency.di.RepositoryModule.INSTANCE.provideCryptoFundingRepository(featureGateManager, mockCryptoFundingRepository, cryptoFundingRepositoryImpl));
    }
}
