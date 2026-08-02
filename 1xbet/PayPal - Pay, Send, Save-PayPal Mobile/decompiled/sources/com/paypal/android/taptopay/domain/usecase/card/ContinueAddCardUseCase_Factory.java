package com.paypal.android.taptopay.domain.usecase.card;

/* loaded from: classes10.dex */
public final class ContinueAddCardUseCase_Factory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.usecase.card.ContinueAddCardUseCase> {
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.usecase.card.SetDefaultCardUseCase> Camera2StreamConfigurationMap;
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> getHighSpeedVideoFpsRangesFor;
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase> getHighSpeedVideoSizes;

    public ContinueAddCardUseCase_Factory(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> provider, javax.inject.Provider<com.paypal.android.taptopay.domain.usecase.card.SetDefaultCardUseCase> provider2, javax.inject.Provider<com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.usecase.card.ContinueAddCardUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.android.taptopay.domain.usecase.card.ContinueAddCardUseCase_Factory create(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> provider, javax.inject.Provider<com.paypal.android.taptopay.domain.usecase.card.SetDefaultCardUseCase> provider2, javax.inject.Provider<com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase> provider3) {
        return new com.paypal.android.taptopay.domain.usecase.card.ContinueAddCardUseCase_Factory(provider, provider2, provider3);
    }

    public static com.paypal.android.taptopay.domain.usecase.card.ContinueAddCardUseCase newInstance(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.android.taptopay.domain.usecase.card.SetDefaultCardUseCase setDefaultCardUseCase, com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase getAllCardsUseCase) {
        return new com.paypal.android.taptopay.domain.usecase.card.ContinueAddCardUseCase(cardRepository, setDefaultCardUseCase, getAllCardsUseCase);
    }
}
