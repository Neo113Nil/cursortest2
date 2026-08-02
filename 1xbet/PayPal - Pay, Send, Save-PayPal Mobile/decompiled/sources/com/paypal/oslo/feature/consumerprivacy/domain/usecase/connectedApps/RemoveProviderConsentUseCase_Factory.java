package com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps;

/* loaded from: classes12.dex */
public final class RemoveProviderConsentUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.RemoveProviderConsentUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.ConnectedAppsRepository> getHighSpeedVideoFpsRangesFor;

    private RemoveProviderConsentUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.ConnectedAppsRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.RemoveProviderConsentUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.RemoveProviderConsentUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.ConnectedAppsRepository> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.RemoveProviderConsentUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.RemoveProviderConsentUseCase newInstance(com.paypal.oslo.feature.consumerprivacy.domain.repository.ConnectedAppsRepository connectedAppsRepository) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.RemoveProviderConsentUseCase(connectedAppsRepository);
    }
}
