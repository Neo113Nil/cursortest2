package com.paypal.oslo.feature.cryptocurrency.di;

/* loaded from: classes12.dex */
public final class RepositoryModule_ProvideCryptoPreferencesRepositoryFactory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.domain.repository.preferences.CryptoPreferencesRepository> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.preferences.CryptoPreferencesRepositoryImpl> getHighResolutionOutputSizeshNQ4ISI;

    private RepositoryModule_ProvideCryptoPreferencesRepositoryFactory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.preferences.CryptoPreferencesRepositoryImpl> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.domain.repository.preferences.CryptoPreferencesRepository get() {
        return provideCryptoPreferencesRepository(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.di.RepositoryModule_ProvideCryptoPreferencesRepositoryFactory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.data.repository.preferences.CryptoPreferencesRepositoryImpl> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.di.RepositoryModule_ProvideCryptoPreferencesRepositoryFactory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.repository.preferences.CryptoPreferencesRepository provideCryptoPreferencesRepository(com.paypal.oslo.feature.cryptocurrency.data.repository.preferences.CryptoPreferencesRepositoryImpl cryptoPreferencesRepositoryImpl) {
        return (com.paypal.oslo.feature.cryptocurrency.domain.repository.preferences.CryptoPreferencesRepository) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.cryptocurrency.di.RepositoryModule.INSTANCE.provideCryptoPreferencesRepository(cryptoPreferencesRepositoryImpl));
    }
}
