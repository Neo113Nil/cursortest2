package com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi;

/* loaded from: classes15.dex */
public final class RewardsLandingViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper> getHighSpeedVideoFpsRanges;

    private RewardsLandingViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper> provider2) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingViewModel newInstance(com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase getRewardsLandingUseCase, com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.models.RewardsLandingUiDataMapper rewardsLandingUiDataMapper) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.landing.ui.mvi.RewardsLandingViewModel(getRewardsLandingUseCase, rewardsLandingUiDataMapper);
    }
}
