package com.paypal.oslo.feature.wallet.cards.domain.usecase;

/* loaded from: classes15.dex */
public final class GetCardRewardsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardRewardsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository> getHighSpeedVideoFpsRanges;

    private GetCardRewardsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardRewardsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardRewardsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository> provider) {
        return new com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardRewardsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardRewardsUseCase newInstance(com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository cardRepository) {
        return new com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardRewardsUseCase(cardRepository);
    }
}
