package com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard;

/* loaded from: classes15.dex */
public final class SharedCardConsentViewModelImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModelImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.AddCardUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoFpsRangesFor;

    private SharedCardConsentViewModelImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.AddCardUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModelImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModelImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.AddCardUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        return new com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModelImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModelImpl newInstance(com.paypal.oslo.feature.wallet.cards.domain.usecase.AddCardUseCase addCardUseCase, com.paypal.oslo.core.navigation.AppNavigator appNavigator, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.wallet.cards.ui.add.sharedcard.SharedCardConsentViewModelImpl(addCardUseCase, appNavigator, coroutineDispatcher);
    }
}
