package com.paypal.oslo.feature.wallet.cards.ui.add.manual;

/* loaded from: classes15.dex */
public final class AddCardsManualViewModelImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl> {
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDefinitionsUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.GetUserProfileUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.AutodetectCardUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.AddCardUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoSizesFor;

    private AddCardsManualViewModelImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.GetUserProfileUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.AddCardUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.AutodetectCardUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDefinitionsUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider5, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider6) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getHighSpeedVideoSizesFor = provider5;
        this.Camera2StreamConfigurationMap = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.GetUserProfileUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.AddCardUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.AutodetectCardUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDefinitionsUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider5, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider6) {
        return new com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl newInstance(com.paypal.oslo.feature.wallet.cards.domain.usecase.GetUserProfileUseCase getUserProfileUseCase, com.paypal.oslo.feature.wallet.cards.domain.usecase.AddCardUseCase addCardUseCase, com.paypal.oslo.feature.wallet.cards.domain.usecase.AutodetectCardUseCase autodetectCardUseCase, com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDefinitionsUseCase getCardDefinitionsUseCase, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.wallet.cards.ui.add.manual.AddCardsManualViewModelImpl(getUserProfileUseCase, addCardUseCase, autodetectCardUseCase, getCardDefinitionsUseCase, appNavigator, coroutineDispatcher);
    }
}
