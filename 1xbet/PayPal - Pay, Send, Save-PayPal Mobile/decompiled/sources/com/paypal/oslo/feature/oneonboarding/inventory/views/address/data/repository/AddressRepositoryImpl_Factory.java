package com.paypal.oslo.feature.oneonboarding.inventory.views.address.data.repository;

/* loaded from: classes13.dex */
public final class AddressRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.inventory.views.address.data.repository.AddressRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ErrorMapper> getHighSpeedVideoSizes;

    private AddressRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ErrorMapper> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.inventory.views.address.data.repository.AddressRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.Camera2StreamConfigurationMap), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.address.data.repository.AddressRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ErrorMapper> provider2) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.data.repository.AddressRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.views.address.data.repository.AddressRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.oneonboarding.inventory.views.address.domain.error.ErrorMapper errorMapper) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.views.address.data.repository.AddressRepositoryImpl(lazy, errorMapper);
    }
}
