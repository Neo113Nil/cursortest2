package com.paypal.android.taptopay.domain.usecase.card;

/* loaded from: classes10.dex */
public final class GetCardArtUseCase_Factory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.usecase.card.GetCardArtUseCase> {
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> getHighSpeedVideoSizes;

    public GetCardArtUseCase_Factory(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.usecase.card.GetCardArtUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.android.taptopay.domain.usecase.card.GetCardArtUseCase_Factory create(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> provider) {
        return new com.paypal.android.taptopay.domain.usecase.card.GetCardArtUseCase_Factory(provider);
    }

    public static com.paypal.android.taptopay.domain.usecase.card.GetCardArtUseCase newInstance(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository) {
        return new com.paypal.android.taptopay.domain.usecase.card.GetCardArtUseCase(cardRepository);
    }
}
