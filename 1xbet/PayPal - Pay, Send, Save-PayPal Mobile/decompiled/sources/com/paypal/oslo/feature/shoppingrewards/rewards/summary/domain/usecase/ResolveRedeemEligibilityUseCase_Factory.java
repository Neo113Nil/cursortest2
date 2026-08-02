package com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase;

/* loaded from: classes15.dex */
public final class ResolveRedeemEligibilityUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryFeatureGates.Manager> getHighSpeedVideoFpsRangesFor;

    private ResolveRedeemEligibilityUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryFeatureGates.Manager> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryFeatureGates.Manager> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase newInstance(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.utils.RewardsSummaryFeatureGates.Manager manager) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase(manager);
    }
}
