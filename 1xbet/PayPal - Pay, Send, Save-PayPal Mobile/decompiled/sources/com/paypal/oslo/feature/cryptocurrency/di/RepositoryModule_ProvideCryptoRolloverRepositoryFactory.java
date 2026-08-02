package com.paypal.oslo.feature.cryptocurrency.di;

/* loaded from: classes12.dex */
public final class RepositoryModule_ProvideCryptoRolloverRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.domain.repository.rollover.CryptoRolloverRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.rollover.CryptoRolloverRepositoryImpl> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoRolloverRepository> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> getHighSpeedVideoFpsRangesFor;

    private RepositoryModule_ProvideCryptoRolloverRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoRolloverRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.rollover.CryptoRolloverRepositoryImpl> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.domain.repository.rollover.CryptoRolloverRepository get() {
        return provideCryptoRolloverRepository(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.di.RepositoryModule_ProvideCryptoRolloverRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager> provider, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoRolloverRepository> provider2, dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.rollover.CryptoRolloverRepositoryImpl> provider3) {
        return new com.paypal.oslo.feature.cryptocurrency.di.RepositoryModule_ProvideCryptoRolloverRepositoryFactory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.repository.rollover.CryptoRolloverRepository provideCryptoRolloverRepository(com.paypal.oslo.feature.cryptocurrency.domain.remoteconfig.gates.FeatureGateManager featureGateManager, com.paypal.oslo.feature.cryptocurrency.data.repository.mock.MockCryptoRolloverRepository mockCryptoRolloverRepository, com.paypal.oslo.feature.cryptocurrency.data.repository.rollover.CryptoRolloverRepositoryImpl cryptoRolloverRepositoryImpl) {
        return (com.paypal.oslo.feature.cryptocurrency.domain.repository.rollover.CryptoRolloverRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.cryptocurrency.di.RepositoryModule.INSTANCE.provideCryptoRolloverRepository(featureGateManager, mockCryptoRolloverRepository, cryptoRolloverRepositoryImpl));
    }
}
