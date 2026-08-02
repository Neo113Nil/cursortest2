package com.paypal.oslo.feature.cashin.domain.usecase;

/* loaded from: classes11.dex */
public final class GetMapLocationsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cashin.domain.usecase.GetMapLocationsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.repository.LocationRepository> getHighSpeedVideoSizes;

    private GetMapLocationsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.repository.LocationRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cashin.domain.usecase.GetMapLocationsUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.cashin.domain.usecase.GetMapLocationsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.repository.LocationRepository> provider) {
        return new com.paypal.oslo.feature.cashin.domain.usecase.GetMapLocationsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.cashin.domain.usecase.GetMapLocationsUseCase newInstance(com.paypal.oslo.feature.cashin.domain.repository.LocationRepository locationRepository) {
        return new com.paypal.oslo.feature.cashin.domain.usecase.GetMapLocationsUseCase(locationRepository);
    }
}
