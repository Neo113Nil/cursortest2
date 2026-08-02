package com.paypal.android.taptopay.domain.di;

/* loaded from: classes10.dex */
public final class RepositoryProviderModule_ProvideCardRepositoryFactory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.repository.card.CardRepository> {
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepositoryWrapper> getHighSpeedVideoFpsRanges;
    private final com.paypal.android.taptopay.domain.di.RepositoryProviderModule getHighSpeedVideoSizes;

    public RepositoryProviderModule_ProvideCardRepositoryFactory(com.paypal.android.taptopay.domain.di.RepositoryProviderModule repositoryProviderModule, javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepositoryWrapper> provider) {
        this.getHighSpeedVideoSizes = repositoryProviderModule;
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.repository.card.CardRepository get() {
        return provideCardRepository(this.getHighSpeedVideoSizes, this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.android.taptopay.domain.di.RepositoryProviderModule_ProvideCardRepositoryFactory create(com.paypal.android.taptopay.domain.di.RepositoryProviderModule repositoryProviderModule, javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepositoryWrapper> provider) {
        return new com.paypal.android.taptopay.domain.di.RepositoryProviderModule_ProvideCardRepositoryFactory(repositoryProviderModule, provider);
    }

    public static com.paypal.android.taptopay.domain.repository.card.CardRepository provideCardRepository(com.paypal.android.taptopay.domain.di.RepositoryProviderModule repositoryProviderModule, com.paypal.android.taptopay.domain.repository.card.CardRepositoryWrapper cardRepositoryWrapper) {
        return (com.paypal.android.taptopay.domain.repository.card.CardRepository) dagger.internal.Preconditions.checkNotNullFromProvides(repositoryProviderModule.provideCardRepository(cardRepositoryWrapper));
    }
}
