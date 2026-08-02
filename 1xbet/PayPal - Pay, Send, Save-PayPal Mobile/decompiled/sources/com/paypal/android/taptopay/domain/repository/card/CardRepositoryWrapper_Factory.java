package com.paypal.android.taptopay.domain.repository.card;

/* loaded from: classes10.dex */
public final class CardRepositoryWrapper_Factory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.repository.card.CardRepositoryWrapper> {
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> getHighResolutionOutputSizeshNQ4ISI;
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.di.ImplementationSelector> getHighSpeedVideoFpsRanges;
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> getHighSpeedVideoSizes;

    public CardRepositoryWrapper_Factory(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> provider, javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> provider2, javax.inject.Provider<com.paypal.android.taptopay.domain.di.ImplementationSelector> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.repository.card.CardRepositoryWrapper get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.android.taptopay.domain.repository.card.CardRepositoryWrapper_Factory create(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> provider, javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> provider2, javax.inject.Provider<com.paypal.android.taptopay.domain.di.ImplementationSelector> provider3) {
        return new com.paypal.android.taptopay.domain.repository.card.CardRepositoryWrapper_Factory(provider, provider2, provider3);
    }

    public static com.paypal.android.taptopay.domain.repository.card.CardRepositoryWrapper newInstance(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository2, com.paypal.android.taptopay.domain.di.ImplementationSelector implementationSelector) {
        return new com.paypal.android.taptopay.domain.repository.card.CardRepositoryWrapper(cardRepository, cardRepository2, implementationSelector);
    }
}
