package com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi;

/* loaded from: classes15.dex */
public final class ActiveOffersViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider> getHighSpeedVideoFpsRanges;

    private ActiveOffersViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider> provider2) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersViewModel newInstance(com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.domain.usecase.GetActiveOffersUseCase getActiveOffersUseCase, com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider stringResourceProvider) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.activeoffers.ui.mvi.ActiveOffersViewModel(getActiveOffersUseCase, stringResourceProvider);
    }
}
