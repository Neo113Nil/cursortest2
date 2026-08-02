package com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd;

/* loaded from: classes12.dex */
public final class GetPYUSDRewardsHoldingsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsHoldingsUseCase> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsHoldingsUseCase get() {
        return newInstance();
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsHoldingsUseCase_Factory create() {
        return com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsHoldingsUseCase_Factory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsHoldingsUseCase newInstance() {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsHoldingsUseCase();
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsHoldingsUseCase_Factory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsHoldingsUseCase_Factory();

        private InstanceHolder() {
        }
    }
}
