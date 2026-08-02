package com.paypal.oslo.feature.taptopay.domain.usecase.card;

/* loaded from: classes15.dex */
public final class ActivateCardUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.card.ActivateCardUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.SetDefaultCardUseCase> getHighSpeedVideoFpsRangesFor;

    private ActivateCardUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.SetDefaultCardUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.card.ActivateCardUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.ActivateCardUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.SetDefaultCardUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase> provider3) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.ActivateCardUseCase_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.ActivateCardUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.oslo.feature.taptopay.domain.usecase.card.SetDefaultCardUseCase setDefaultCardUseCase, com.paypal.oslo.feature.taptopay.domain.usecase.card.GetAllCardsUseCase getAllCardsUseCase) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.ActivateCardUseCase(cardRepository, setDefaultCardUseCase, getAllCardsUseCase);
    }
}
