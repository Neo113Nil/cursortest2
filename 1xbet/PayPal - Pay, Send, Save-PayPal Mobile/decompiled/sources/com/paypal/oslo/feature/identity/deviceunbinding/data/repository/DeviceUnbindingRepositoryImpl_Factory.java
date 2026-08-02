package com.paypal.oslo.feature.identity.deviceunbinding.data.repository;

/* loaded from: classes12.dex */
public final class DeviceUnbindingRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.deviceunbinding.data.repository.DeviceUnbindingRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private DeviceUnbindingRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.deviceunbinding.data.repository.DeviceUnbindingRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes);
    }

    public static com.paypal.oslo.feature.identity.deviceunbinding.data.repository.DeviceUnbindingRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.identity.deviceunbinding.data.repository.DeviceUnbindingRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.deviceunbinding.data.repository.DeviceUnbindingRepositoryImpl newInstance(javax.inject.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.identity.deviceunbinding.data.repository.DeviceUnbindingRepositoryImpl(provider);
    }
}
