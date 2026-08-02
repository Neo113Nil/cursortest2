package com.paypal.oslo.feature.consumerprivacy.data.repository;

/* loaded from: classes11.dex */
public final class ConnectedAppsRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.apollo.ConnectedAppsApi> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.mapper.ConnectedAppsDataMapper> getHighSpeedVideoSizes;

    private ConnectedAppsRepositoryImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.apollo.ConnectedAppsApi> provider, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.mapper.ConnectedAppsDataMapper> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.apollo.ConnectedAppsApi> provider, dagger.internal.Provider<com.paypal.oslo.feature.consumerprivacy.data.mapper.ConnectedAppsDataMapper> provider2) {
        return new com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl newInstance(com.paypal.oslo.feature.consumerprivacy.data.apollo.ConnectedAppsApi connectedAppsApi, com.paypal.oslo.feature.consumerprivacy.data.mapper.ConnectedAppsDataMapper connectedAppsDataMapper) {
        return new com.paypal.oslo.feature.consumerprivacy.data.repository.ConnectedAppsRepositoryImpl(connectedAppsApi, connectedAppsDataMapper);
    }
}
