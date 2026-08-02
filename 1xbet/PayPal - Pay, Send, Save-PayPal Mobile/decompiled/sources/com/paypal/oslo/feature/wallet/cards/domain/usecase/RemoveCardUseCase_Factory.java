package com.paypal.oslo.feature.wallet.cards.domain.usecase;

/* loaded from: classes15.dex */
public final class RemoveCardUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.cards.domain.usecase.RemoveCardUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository> getHighSpeedVideoSizes;

    private RemoveCardUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.cards.domain.usecase.RemoveCardUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.wallet.cards.domain.usecase.RemoveCardUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository> provider) {
        return new com.paypal.oslo.feature.wallet.cards.domain.usecase.RemoveCardUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.cards.domain.usecase.RemoveCardUseCase newInstance(com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository cardRepository) {
        return new com.paypal.oslo.feature.wallet.cards.domain.usecase.RemoveCardUseCase(cardRepository);
    }
}
