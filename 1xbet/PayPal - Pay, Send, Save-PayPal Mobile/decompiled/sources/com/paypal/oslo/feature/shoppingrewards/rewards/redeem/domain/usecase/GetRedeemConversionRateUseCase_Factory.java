package com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase;

/* loaded from: classes15.dex */
public final class GetRedeemConversionRateUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemConversionRateRepository> getHighSpeedVideoSizes;

    private GetRedeemConversionRateUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemConversionRateRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemConversionRateRepository> provider) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase newInstance(com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.repository.RedeemConversionRateRepository redeemConversionRateRepository) {
        return new com.paypal.oslo.feature.shoppingrewards.rewards.redeem.domain.usecase.GetRedeemConversionRateUseCase(redeemConversionRateRepository);
    }
}
