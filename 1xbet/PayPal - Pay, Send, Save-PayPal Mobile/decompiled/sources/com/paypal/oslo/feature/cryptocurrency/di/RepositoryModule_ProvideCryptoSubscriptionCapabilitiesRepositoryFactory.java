package com.paypal.oslo.feature.cryptocurrency.di;

/* loaded from: classes12.dex */
public final class RepositoryModule_ProvideCryptoSubscriptionCapabilitiesRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.domain.repository.subscriptions.CryptoSubscriptionCapabilitiesRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.subscriptions.CryptoSubscriptionCapabilitiesRepositoryImpl> getHighSpeedVideoFpsRangesFor;

    private RepositoryModule_ProvideCryptoSubscriptionCapabilitiesRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.subscriptions.CryptoSubscriptionCapabilitiesRepositoryImpl> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.domain.repository.subscriptions.CryptoSubscriptionCapabilitiesRepository get() {
        return provideCryptoSubscriptionCapabilitiesRepository(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.di.RepositoryModule_ProvideCryptoSubscriptionCapabilitiesRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.subscriptions.CryptoSubscriptionCapabilitiesRepositoryImpl> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.di.RepositoryModule_ProvideCryptoSubscriptionCapabilitiesRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.repository.subscriptions.CryptoSubscriptionCapabilitiesRepository provideCryptoSubscriptionCapabilitiesRepository(com.paypal.oslo.feature.cryptocurrency.data.repository.subscriptions.CryptoSubscriptionCapabilitiesRepositoryImpl cryptoSubscriptionCapabilitiesRepositoryImpl) {
        return (com.paypal.oslo.feature.cryptocurrency.domain.repository.subscriptions.CryptoSubscriptionCapabilitiesRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.cryptocurrency.di.RepositoryModule.INSTANCE.provideCryptoSubscriptionCapabilitiesRepository(cryptoSubscriptionCapabilitiesRepositoryImpl));
    }
}
