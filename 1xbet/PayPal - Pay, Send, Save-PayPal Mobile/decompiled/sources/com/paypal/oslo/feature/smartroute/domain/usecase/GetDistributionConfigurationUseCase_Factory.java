package com.paypal.oslo.feature.smartroute.domain.usecase;

/* loaded from: classes15.dex */
public final class GetDistributionConfigurationUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.smartroute.domain.usecase.GetDistributionConfigurationUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.repository.DistributionRepository> getHighSpeedVideoSizes;

    private GetDistributionConfigurationUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.repository.DistributionRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.smartroute.domain.usecase.GetDistributionConfigurationUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.smartroute.domain.usecase.GetDistributionConfigurationUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.repository.DistributionRepository> provider) {
        return new com.paypal.oslo.feature.smartroute.domain.usecase.GetDistributionConfigurationUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.smartroute.domain.usecase.GetDistributionConfigurationUseCase newInstance(com.paypal.oslo.feature.smartroute.domain.repository.DistributionRepository distributionRepository) {
        return new com.paypal.oslo.feature.smartroute.domain.usecase.GetDistributionConfigurationUseCase(distributionRepository);
    }
}
