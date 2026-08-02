package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase;

/* loaded from: classes15.dex */
public final class RedeemPointsToBalanceUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsToBalanceRepository> Camera2StreamConfigurationMap;

    private RedeemPointsToBalanceUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsToBalanceRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsToBalanceRepository> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase newInstance(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemPointsToBalanceRepository redeemPointsToBalanceRepository) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.RedeemPointsToBalanceUseCase(redeemPointsToBalanceRepository);
    }
}
