package com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal;

/* loaded from: classes15.dex */
public final class ContinueAddCardUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.ContinueAddCardUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase> getHighSpeedVideoFpsRangesFor;

    private ContinueAddCardUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.ContinueAddCardUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.ContinueAddCardUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase> provider2) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.ContinueAddCardUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.ContinueAddCardUseCase newInstance(com.paypal.oslo.feature.taptopay.domain.repository.card.CardRepository cardRepository, com.paypal.oslo.feature.taptopay.domain.usecase.card.SetAsDefaultIfNeededUseCase setAsDefaultIfNeededUseCase) {
        return new com.paypal.oslo.feature.taptopay.domain.usecase.card.paypal.ContinueAddCardUseCase(cardRepository, setAsDefaultIfNeededUseCase);
    }
}
