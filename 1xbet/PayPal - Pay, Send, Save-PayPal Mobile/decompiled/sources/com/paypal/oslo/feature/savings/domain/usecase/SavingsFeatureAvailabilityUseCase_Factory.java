package com.paypal.oslo.feature.savings.domain.usecase;

/* loaded from: classes14.dex */
public final class SavingsFeatureAvailabilityUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.savings.domain.usecase.SavingsFeatureAvailabilityUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRemoteConfig> getHighSpeedVideoFpsRangesFor;

    private SavingsFeatureAvailabilityUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRemoteConfig> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.savings.domain.usecase.SavingsFeatureAvailabilityUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.savings.domain.usecase.SavingsFeatureAvailabilityUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.savings.domain.repository.SavingsRemoteConfig> provider) {
        return new com.paypal.oslo.feature.savings.domain.usecase.SavingsFeatureAvailabilityUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.savings.domain.usecase.SavingsFeatureAvailabilityUseCase newInstance(com.paypal.oslo.feature.savings.domain.repository.SavingsRemoteConfig savingsRemoteConfig) {
        return new com.paypal.oslo.feature.savings.domain.usecase.SavingsFeatureAvailabilityUseCase(savingsRemoteConfig);
    }
}
