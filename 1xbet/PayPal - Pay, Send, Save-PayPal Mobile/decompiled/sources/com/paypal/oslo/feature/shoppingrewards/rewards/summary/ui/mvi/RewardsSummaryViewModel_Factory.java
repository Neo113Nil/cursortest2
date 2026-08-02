package com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi;

/* loaded from: classes15.dex */
public final class RewardsSummaryViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.UiDataMappers> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase> getHighSpeedVideoSizes;

    private RewardsSummaryViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.UiDataMappers> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider> provider2, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.UiDataMappers> provider3) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryViewModel newInstance(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase getRewardsSummaryUseCase, com.paypal.oslo.feature.shoppingrewards.shared.domain.usecase.StringResourceProvider stringResourceProvider, com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.models.UiDataMappers uiDataMappers) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.ui.mvi.RewardsSummaryViewModel(getRewardsSummaryUseCase, stringResourceProvider, uiDataMappers);
    }
}
