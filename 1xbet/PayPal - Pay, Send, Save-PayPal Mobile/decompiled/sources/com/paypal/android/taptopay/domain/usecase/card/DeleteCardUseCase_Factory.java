package com.paypal.android.taptopay.domain.usecase.card;

/* loaded from: classes10.dex */
public final class DeleteCardUseCase_Factory implements dagger.internal.Factory<com.paypal.android.taptopay.domain.usecase.card.DeleteCardUseCase> {
    private final javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> getHighSpeedVideoSizes;

    public DeleteCardUseCase_Factory(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.android.taptopay.domain.usecase.card.DeleteCardUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.android.taptopay.domain.usecase.card.DeleteCardUseCase_Factory create(javax.inject.Provider<com.paypal.android.taptopay.domain.repository.card.CardRepository> provider) {
        return new com.paypal.android.taptopay.domain.usecase.card.DeleteCardUseCase_Factory(provider);
    }

    public static com.paypal.android.taptopay.domain.usecase.card.DeleteCardUseCase newInstance(com.paypal.android.taptopay.domain.repository.card.CardRepository cardRepository) {
        return new com.paypal.android.taptopay.domain.usecase.card.DeleteCardUseCase(cardRepository);
    }
}
