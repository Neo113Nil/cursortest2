package com.paypal.android.taptopay.domain.usecase.card;

/* loaded from: classes10.dex */
public final class IsDefaultCardUseCase_Factory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.usecase.card.IsDefaultCardUseCase> {
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> getHighSpeedVideoFpsRanges;

    public IsDefaultCardUseCase_Factory(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.usecase.card.IsDefaultCardUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.android.taptopay.domain.usecase.card.IsDefaultCardUseCase_Factory create(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> provider) {
        return new com.paypal.android.taptopay.domain.usecase.card.IsDefaultCardUseCase_Factory(provider);
    }

    public static com.paypal.android.taptopay.domain.usecase.card.IsDefaultCardUseCase newInstance(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository) {
        return new com.paypal.android.taptopay.domain.usecase.card.IsDefaultCardUseCase(cardRepository);
    }
}
