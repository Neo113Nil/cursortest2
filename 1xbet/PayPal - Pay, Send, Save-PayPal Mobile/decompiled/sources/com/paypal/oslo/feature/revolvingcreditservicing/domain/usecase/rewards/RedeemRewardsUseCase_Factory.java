package com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.rewards;

/* loaded from: classes14.dex */
public final class RedeemRewardsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.rewards.RedeemRewardsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsRepository> getHighSpeedVideoSizes;

    private RedeemRewardsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.rewards.RedeemRewardsUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.rewards.RedeemRewardsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsRepository> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.rewards.RedeemRewardsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.rewards.RedeemRewardsUseCase newInstance(com.paypal.oslo.feature.revolvingcreditservicing.domain.repository.RedeemRewardsRepository redeemRewardsRepository) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.domain.usecase.rewards.RedeemRewardsUseCase(redeemRewardsRepository);
    }
}
