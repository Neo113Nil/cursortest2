package com.paypal.oslo.feature.directdeposit.domain.usecase;

/* loaded from: classes12.dex */
public final class GetSmartRoutePreferencesUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.directdeposit.domain.usecase.GetSmartRoutePreferencesUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.repository.SmartRoutePreferencesRepository> getHighSpeedVideoSizes;

    private GetSmartRoutePreferencesUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.repository.SmartRoutePreferencesRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.directdeposit.domain.usecase.GetSmartRoutePreferencesUseCase get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.directdeposit.domain.usecase.GetSmartRoutePreferencesUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.directdeposit.domain.repository.SmartRoutePreferencesRepository> provider) {
        return new com.paypal.oslo.feature.directdeposit.domain.usecase.GetSmartRoutePreferencesUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.directdeposit.domain.usecase.GetSmartRoutePreferencesUseCase newInstance(com.paypal.oslo.feature.directdeposit.domain.repository.SmartRoutePreferencesRepository smartRoutePreferencesRepository) {
        return new com.paypal.oslo.feature.directdeposit.domain.usecase.GetSmartRoutePreferencesUseCase(smartRoutePreferencesRepository);
    }
}
