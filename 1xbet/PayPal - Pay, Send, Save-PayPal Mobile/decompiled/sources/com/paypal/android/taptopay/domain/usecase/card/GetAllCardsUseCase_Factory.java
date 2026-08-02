package com.paypal.android.taptopay.domain.usecase.card;

/* loaded from: classes10.dex */
public final class GetAllCardsUseCase_Factory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase> {
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> getHighSpeedVideoFpsRangesFor;
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.usecase.card.GetCardArtUseCase> getHighSpeedVideoSizes;

    public GetAllCardsUseCase_Factory(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> provider, javax.inject.Provider<com.paypal.android.taptopay.domain.usecase.card.GetCardArtUseCase> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase_Factory create(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> provider, javax.inject.Provider<com.paypal.android.taptopay.domain.usecase.card.GetCardArtUseCase> provider2) {
        return new com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase_Factory(provider, provider2);
    }

    public static com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase newInstance(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.android.taptopay.domain.usecase.card.GetCardArtUseCase getCardArtUseCase) {
        return new com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase(cardRepository, getCardArtUseCase);
    }
}
