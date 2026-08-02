package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase;

/* loaded from: classes15.dex */
public final class GetCharitiesUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetCharitiesUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.CharityRepository> getHighSpeedVideoFpsRangesFor;

    private GetCharitiesUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.CharityRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetCharitiesUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetCharitiesUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.CharityRepository> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetCharitiesUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetCharitiesUseCase newInstance(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.CharityRepository charityRepository) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetCharitiesUseCase(charityRepository);
    }
}
