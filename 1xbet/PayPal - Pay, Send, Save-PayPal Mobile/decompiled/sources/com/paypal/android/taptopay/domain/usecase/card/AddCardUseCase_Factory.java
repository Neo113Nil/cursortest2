package com.paypal.android.taptopay.domain.usecase.card;

/* loaded from: classes10.dex */
public final class AddCardUseCase_Factory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.usecase.card.AddCardUseCase> {
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.usecase.card.SetDefaultCardUseCase> Camera2StreamConfigurationMap;
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> getHighResolutionOutputSizeshNQ4ISI;
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase> getHighSpeedVideoSizes;

    public AddCardUseCase_Factory(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> provider, javax.inject.Provider<com.paypal.android.taptopay.domain.usecase.card.SetDefaultCardUseCase> provider2, javax.inject.Provider<com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.usecase.card.AddCardUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.android.taptopay.domain.usecase.card.AddCardUseCase_Factory create(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> provider, javax.inject.Provider<com.paypal.android.taptopay.domain.usecase.card.SetDefaultCardUseCase> provider2, javax.inject.Provider<com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase> provider3) {
        return new com.paypal.android.taptopay.domain.usecase.card.AddCardUseCase_Factory(provider, provider2, provider3);
    }

    public static com.paypal.android.taptopay.domain.usecase.card.AddCardUseCase newInstance(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.android.taptopay.domain.usecase.card.SetDefaultCardUseCase setDefaultCardUseCase, com.paypal.android.taptopay.domain.usecase.card.GetAllCardsUseCase getAllCardsUseCase) {
        return new com.paypal.android.taptopay.domain.usecase.card.AddCardUseCase(cardRepository, setDefaultCardUseCase, getAllCardsUseCase);
    }
}
