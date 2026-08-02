package com.paypal.oslo.feature.wallet.cards.ui.details;

/* loaded from: classes15.dex */
public final class CardDetailViewModelImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDetailUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager> getHighSpeedVideoSizes;

    private CardDetailViewModelImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDetailUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider2, dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getHighSpeedVideoSizes = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDetailUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.navigation.AppNavigator> provider2, dagger.internal.Provider<com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager> provider3) {
        return new com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl newInstance(com.paypal.oslo.feature.wallet.cards.domain.usecase.GetCardDetailUseCase getCardDetailUseCase, com.paypal.oslo.core.navigation.AppNavigator appNavigator, com.paypal.oslo.feature.wallet.common.config.WalletFeatureManager walletFeatureManager) {
        return new com.paypal.oslo.feature.wallet.cards.ui.details.CardDetailViewModelImpl(getCardDetailUseCase, appNavigator, walletFeatureManager);
    }
}
