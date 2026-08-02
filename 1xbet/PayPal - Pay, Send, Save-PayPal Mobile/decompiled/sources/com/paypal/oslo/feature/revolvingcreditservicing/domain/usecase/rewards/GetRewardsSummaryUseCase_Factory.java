package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.rewards;

/* loaded from: classes14.dex */
public final class GetRewardsSummaryUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.rewards.GetRewardsSummaryUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsRepository> getHighSpeedVideoFpsRanges;

    private GetRewardsSummaryUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.rewards.GetRewardsSummaryUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.rewards.GetRewardsSummaryUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsRepository> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.rewards.GetRewardsSummaryUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.rewards.GetRewardsSummaryUseCase newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsRepository redeemRewardsRepository) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.rewards.GetRewardsSummaryUseCase(redeemRewardsRepository);
    }
}
