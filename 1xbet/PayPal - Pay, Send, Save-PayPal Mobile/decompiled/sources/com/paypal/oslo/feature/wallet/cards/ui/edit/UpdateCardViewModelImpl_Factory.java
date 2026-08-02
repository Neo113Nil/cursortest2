package com.paypal.oslo.feature.wallet.cards.ui.edit;

/* loaded from: classes15.dex */
public final class UpdateCardViewModelImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardViewModelImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDefinitionsUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.GetUserProfileUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateCardUseCase> getHighSpeedVideoSizes;

    private UpdateCardViewModelImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.GetUserProfileUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider2, dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateCardUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDefinitionsUseCase> provider4, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider5) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardViewModelImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardViewModelImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.GetUserProfileUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider2, dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateCardUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDefinitionsUseCase> provider4, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider5) {
        return new com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardViewModelImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardViewModelImpl newInstance(com.paypal.oslo.feature.wallet.cards.domain.usecase.GetUserProfileUseCase getUserProfileUseCase, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.cards.domain.usecase.UpdateCardUseCase updateCardUseCase, com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDefinitionsUseCase getCardDefinitionsUseCase, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.wallet.cards.ui.edit.UpdateCardViewModelImpl(getUserProfileUseCase, appNavigator, updateCardUseCase, getCardDefinitionsUseCase, coroutineDispatcher);
    }
}
