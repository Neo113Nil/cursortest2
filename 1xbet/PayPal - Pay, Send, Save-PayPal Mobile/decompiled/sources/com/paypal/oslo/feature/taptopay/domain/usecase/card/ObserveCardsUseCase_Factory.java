package com.paypal.oslo.feature.taptopay.domain.usecase.card;

/* loaded from: classes15.dex */
public final class ObserveCardsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.card.ObserveCardsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository> getHighSpeedVideoFpsRangesFor;

    private ObserveCardsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.card.ObserveCardsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.ObserveCardsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository> provider) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.ObserveCardsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.ObserveCardsUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.ObserveCardsUseCase(cardRepository);
    }
}
