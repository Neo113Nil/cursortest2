package com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps;

/* loaded from: classes12.dex */
public final class DeleteAuthConsentUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.DeleteAuthConsentUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.ConnectedAppsRepository> getHighSpeedVideoFpsRanges;

    private DeleteAuthConsentUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.ConnectedAppsRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.DeleteAuthConsentUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.DeleteAuthConsentUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.domain.repository.ConnectedAppsRepository> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.DeleteAuthConsentUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.DeleteAuthConsentUseCase newInstance(com.paypal.oslo.feature.consumerprivacy.domain.repository.ConnectedAppsRepository connectedAppsRepository) {
        return new com.paypal.oslo.feature.consumerprivacy.domain.usecase.connectedApps.DeleteAuthConsentUseCase(connectedAppsRepository);
    }
}
