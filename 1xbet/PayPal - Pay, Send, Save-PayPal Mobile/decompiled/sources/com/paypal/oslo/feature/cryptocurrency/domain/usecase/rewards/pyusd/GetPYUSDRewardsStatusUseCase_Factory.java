package com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd;

/* loaded from: classes12.dex */
public final class GetPYUSDRewardsStatusUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.preferences.CryptoPreferencesRepository> getHighSpeedVideoSizes;

    private GetPYUSDRewardsStatusUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.preferences.CryptoPreferencesRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cryptocurrency.domain.repository.preferences.CryptoPreferencesRepository> provider) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase newInstance(com.paypal.oslo.feature.cryptocurrency.domain.repository.preferences.CryptoPreferencesRepository cryptoPreferencesRepository) {
        return new com.paypal.oslo.feature.cryptocurrency.domain.usecase.rewards.pyusd.GetPYUSDRewardsStatusUseCase(cryptoPreferencesRepository);
    }
}
