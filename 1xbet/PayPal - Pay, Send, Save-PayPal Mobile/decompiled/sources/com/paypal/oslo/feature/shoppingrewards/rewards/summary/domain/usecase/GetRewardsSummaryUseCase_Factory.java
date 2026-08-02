package com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase;

/* loaded from: classes15.dex */
public final class GetRewardsSummaryUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.PayPalDebitCardRepository> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.RedeemMethodsRepository> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.RewardsSummaryRepository> getHighSpeedVideoSizes;

    private GetRewardsSummaryUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.RewardsSummaryRepository> provider3, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.RedeemMethodsRepository> provider4, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.PayPalDebitCardRepository> provider5) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.RewardsSummaryRepository> provider3, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.RedeemMethodsRepository> provider4, dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.PayPalDebitCardRepository> provider5) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase newInstance(com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.AdjustDebitCardVisibilityUseCase adjustDebitCardVisibilityUseCase, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.ResolveRedeemEligibilityUseCase resolveRedeemEligibilityUseCase, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.RewardsSummaryRepository rewardsSummaryRepository, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.RedeemMethodsRepository redeemMethodsRepository, com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.repository.PayPalDebitCardRepository payPalDebitCardRepository) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.summary.domain.usecase.GetRewardsSummaryUseCase(adjustDebitCardVisibilityUseCase, resolveRedeemEligibilityUseCase, rewardsSummaryRepository, redeemMethodsRepository, payPalDebitCardRepository);
    }
}
