package com.paypal.oslo.feature.wallet.cards.domain.usecase;

/* loaded from: classes15.dex */
public final class GetCardDetailUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDetailUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository> getHighSpeedVideoSizes;

    private GetCardDetailUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDetailUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDetailUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository> provider) {
        return new com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDetailUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDetailUseCase newInstance(com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository cardRepository) {
        return new com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDetailUseCase(cardRepository);
    }
}
