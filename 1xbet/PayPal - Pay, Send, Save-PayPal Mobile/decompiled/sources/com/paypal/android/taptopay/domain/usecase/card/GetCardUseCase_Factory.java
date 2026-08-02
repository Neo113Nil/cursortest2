package com.paypal.android.taptopay.domain.usecase.card;

/* loaded from: classes10.dex */
public final class GetCardUseCase_Factory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.usecase.card.GetCardUseCase> {
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> Camera2StreamConfigurationMap;
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.usecase.card.GetCardArtUseCase> getHighSpeedVideoFpsRangesFor;

    public GetCardUseCase_Factory(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> provider, javax.inject.Provider<com.paypal.android.taptopay.domain.usecase.card.GetCardArtUseCase> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.usecase.card.GetCardUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.android.taptopay.domain.usecase.card.GetCardUseCase_Factory create(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> provider, javax.inject.Provider<com.paypal.android.taptopay.domain.usecase.card.GetCardArtUseCase> provider2) {
        return new com.paypal.android.taptopay.domain.usecase.card.GetCardUseCase_Factory(provider, provider2);
    }

    public static com.paypal.android.taptopay.domain.usecase.card.GetCardUseCase newInstance(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.android.taptopay.domain.usecase.card.GetCardArtUseCase getCardArtUseCase) {
        return new com.paypal.android.taptopay.domain.usecase.card.GetCardUseCase(cardRepository, getCardArtUseCase);
    }
}
