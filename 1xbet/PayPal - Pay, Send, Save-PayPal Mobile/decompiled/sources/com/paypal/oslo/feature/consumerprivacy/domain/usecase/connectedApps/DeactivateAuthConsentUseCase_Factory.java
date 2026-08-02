package com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps;

/* loaded from: classes12.dex */
public final class DeactivateAuthConsentUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.DeactivateAuthConsentUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.ConnectedAppsRepository> getHighSpeedVideoFpsRanges;

    private DeactivateAuthConsentUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.ConnectedAppsRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.DeactivateAuthConsentUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.DeactivateAuthConsentUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.ConnectedAppsRepository> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.DeactivateAuthConsentUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.DeactivateAuthConsentUseCase newInstance(com.paypal.oslo.feature.consumerprivacy.domain.repository.ConnectedAppsRepository connectedAppsRepository) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.DeactivateAuthConsentUseCase(connectedAppsRepository);
    }
}
