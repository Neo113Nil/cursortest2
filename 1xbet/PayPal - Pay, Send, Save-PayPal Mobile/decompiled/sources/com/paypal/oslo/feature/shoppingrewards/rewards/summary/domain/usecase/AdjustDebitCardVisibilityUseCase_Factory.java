package com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase;

/* loaded from: classes15.dex */
public final class AdjustDebitCardVisibilityUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryFeatureGates.Manager> getHighSpeedVideoSizes;

    private AdjustDebitCardVisibilityUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryFeatureGates.Manager> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryFeatureGates.Manager> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase newInstance(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryFeatureGates.Manager manager) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase(manager);
    }
}
