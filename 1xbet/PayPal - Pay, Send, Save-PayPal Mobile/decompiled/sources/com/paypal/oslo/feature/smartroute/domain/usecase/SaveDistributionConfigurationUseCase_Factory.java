package com.paypal.oslo.feature.smartroute.domain.usecase;

/* loaded from: classes15.dex */
public final class SaveDistributionConfigurationUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.repository.DistributionRepository> getHighSpeedVideoSizes;

    private SaveDistributionConfigurationUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.repository.DistributionRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.repository.DistributionRepository> provider) {
        return new com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase newInstance(com.paypal.oslo.feature.smartroute.domain.repository.DistributionRepository distributionRepository) {
        return new com.paypal.oslo.feature.smartroute.domain.usecase.SaveDistributionConfigurationUseCase(distributionRepository);
    }
}
