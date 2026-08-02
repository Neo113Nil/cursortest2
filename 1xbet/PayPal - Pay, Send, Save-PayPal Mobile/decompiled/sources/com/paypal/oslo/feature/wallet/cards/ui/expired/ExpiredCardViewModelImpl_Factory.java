package com.paypal.oslo.feature.wallet.cards.ui.expired;

/* loaded from: classes15.dex */
public final class ExpiredCardViewModelImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModelImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDefinitionsUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.GetUserProfileUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoFpsRangesFor;

    private ExpiredCardViewModelImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.GetUserProfileUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDefinitionsUseCase> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModelImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModelImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.GetUserProfileUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDefinitionsUseCase> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        return new com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModelImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModelImpl newInstance(com.paypal.oslo.feature.wallet.cards.domain.usecase.GetUserProfileUseCase getUserProfileUseCase, com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDefinitionsUseCase getCardDefinitionsUseCase, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.wallet.cards.ui.expired.ExpiredCardViewModelImpl(getUserProfileUseCase, getCardDefinitionsUseCase, coroutineDispatcher);
    }
}
