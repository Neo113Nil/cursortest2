package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase;

/* loaded from: classes15.dex */
public final class RedeemPointsToSavingsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToSavingsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsToSavingsRepository> getHighResolutionOutputSizeshNQ4ISI;

    private RedeemPointsToSavingsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsToSavingsRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToSavingsUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToSavingsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsToSavingsRepository> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToSavingsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToSavingsUseCase newInstance(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsToSavingsRepository redeemPointsToSavingsRepository) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToSavingsUseCase(redeemPointsToSavingsRepository);
    }
}
