package com.paypal.oslo.feature.wallet.cards.ui.nickname;

/* loaded from: classes15.dex */
public final class NicknameViewModelImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModelImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateNicknameUseCase> getHighSpeedVideoFpsRangesFor;

    private NicknameViewModelImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateNicknameUseCase> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModelImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModelImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateNicknameUseCase> provider) {
        return new com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModelImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModelImpl newInstance(com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateNicknameUseCase updateNicknameUseCase) {
        return new com.paypal.oslo.feature.wallet.cards.ui.nickname.NicknameViewModelImpl(updateNicknameUseCase);
    }
}
