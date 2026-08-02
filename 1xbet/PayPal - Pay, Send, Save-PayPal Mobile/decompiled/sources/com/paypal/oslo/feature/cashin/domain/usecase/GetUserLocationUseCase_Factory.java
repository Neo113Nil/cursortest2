package com.paypal.oslo.feature.cashin.domain.usecase;

/* loaded from: classes11.dex */
public final class GetUserLocationUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.cashin.domain.usecase.GetUserLocationUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.repository.LocationRepository> getHighSpeedVideoSizes;

    private GetUserLocationUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.repository.LocationRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.cashin.domain.usecase.GetUserLocationUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.cashin.domain.usecase.GetUserLocationUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.cashin.domain.repository.LocationRepository> provider) {
        return new com.paypal.oslo.feature.cashin.domain.usecase.GetUserLocationUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.cashin.domain.usecase.GetUserLocationUseCase newInstance(com.paypal.oslo.feature.cashin.domain.repository.LocationRepository locationRepository) {
        return new com.paypal.oslo.feature.cashin.domain.usecase.GetUserLocationUseCase(locationRepository);
    }
}
