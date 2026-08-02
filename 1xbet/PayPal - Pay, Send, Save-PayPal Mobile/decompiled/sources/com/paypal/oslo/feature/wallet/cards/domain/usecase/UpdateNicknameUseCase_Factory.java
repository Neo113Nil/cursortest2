package com.paypal.oslo.feature.wallet.cards.domain.usecase;

/* loaded from: classes15.dex */
public final class UpdateNicknameUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateNicknameUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository> getHighSpeedVideoSizes;

    private UpdateNicknameUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateNicknameUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateNicknameUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository> provider) {
        return new com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateNicknameUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateNicknameUseCase newInstance(com.paypal.oslo.feature.wallet.cards.domain.repository.CardRepository cardRepository) {
        return new com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateNicknameUseCase(cardRepository);
    }
}
