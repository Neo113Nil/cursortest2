package com.paypal.oslo.feature.smartroute.domain.usecase;

/* loaded from: classes15.dex */
public final class UpdatePyusdOptInStatusUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.smartroute.domain.usecase.UpdatePyusdOptInStatusUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.repository.DistributionRepository> getHighResolutionOutputSizeshNQ4ISI;

    private UpdatePyusdOptInStatusUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.repository.DistributionRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.smartroute.domain.usecase.UpdatePyusdOptInStatusUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.smartroute.domain.usecase.UpdatePyusdOptInStatusUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.smartroute.domain.repository.DistributionRepository> provider) {
        return new com.paypal.oslo.feature.smartroute.domain.usecase.UpdatePyusdOptInStatusUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.smartroute.domain.usecase.UpdatePyusdOptInStatusUseCase newInstance(com.paypal.oslo.feature.smartroute.domain.repository.DistributionRepository distributionRepository) {
        return new com.paypal.oslo.feature.smartroute.domain.usecase.UpdatePyusdOptInStatusUseCase(distributionRepository);
    }
}
