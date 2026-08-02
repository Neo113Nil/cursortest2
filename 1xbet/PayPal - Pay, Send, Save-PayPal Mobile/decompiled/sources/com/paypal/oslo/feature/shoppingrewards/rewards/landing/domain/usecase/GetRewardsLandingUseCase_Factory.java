package com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase;

/* loaded from: classes15.dex */
public final class GetRewardsLandingUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.repository.RewardsLandingRepository> getHighSpeedVideoSizes;

    private GetRewardsLandingUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.repository.RewardsLandingRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.repository.RewardsLandingRepository> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase newInstance(com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.repository.RewardsLandingRepository rewardsLandingRepository) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.landing.domain.usecase.GetRewardsLandingUseCase(rewardsLandingRepository);
    }
}
