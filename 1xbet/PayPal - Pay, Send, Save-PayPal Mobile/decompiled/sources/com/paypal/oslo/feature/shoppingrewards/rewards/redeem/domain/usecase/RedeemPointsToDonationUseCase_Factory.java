package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase;

/* loaded from: classes15.dex */
public final class RedeemPointsToDonationUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsToCharityRepository> getHighResolutionOutputSizeshNQ4ISI;

    private RedeemPointsToDonationUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsToCharityRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsToCharityRepository> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase newInstance(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsToCharityRepository redeemPointsToCharityRepository) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToDonationUseCase(redeemPointsToCharityRepository);
    }
}
