package com.paypal.android.taptopay.domain.usecase.card;

/* loaded from: classes10.dex */
public final class ActivateCardUseCase_Factory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.usecase.card.ActivateCardUseCase> {
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.usecase.card.SetDefaultCardUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase> getHighSpeedVideoFpsRanges;
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> getHighSpeedVideoSizes;

    public ActivateCardUseCase_Factory(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> provider, javax.inject.Provider<com.paypal.android.taptopay.domain.usecase.card.SetDefaultCardUseCase> provider2, javax.inject.Provider<com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.usecase.card.ActivateCardUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.android.taptopay.domain.usecase.card.ActivateCardUseCase_Factory create(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> provider, javax.inject.Provider<com.paypal.android.taptopay.domain.usecase.card.SetDefaultCardUseCase> provider2, javax.inject.Provider<com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase> provider3) {
        return new com.paypal.android.taptopay.domain.usecase.card.ActivateCardUseCase_Factory(provider, provider2, provider3);
    }

    public static com.paypal.android.taptopay.domain.usecase.card.ActivateCardUseCase newInstance(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.android.taptopay.domain.usecase.card.SetDefaultCardUseCase setDefaultCardUseCase, com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase getAllCardsUseCase) {
        return new com.paypal.android.taptopay.domain.usecase.card.ActivateCardUseCase(cardRepository, setDefaultCardUseCase, getAllCardsUseCase);
    }
}
