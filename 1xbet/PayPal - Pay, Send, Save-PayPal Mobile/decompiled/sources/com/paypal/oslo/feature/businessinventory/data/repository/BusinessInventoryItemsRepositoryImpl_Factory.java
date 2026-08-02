package com.paypal.oslo.feature.businessinventory.data.repository;

/* loaded from: classes11.dex */
public final class BusinessInventoryItemsRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager> getHighSpeedVideoSizes;

    private BusinessInventoryItemsRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.Camera2StreamConfigurationMap), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager> provider2) {
        return new com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager businessInventoryFeatureGateManager) {
        return new com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryItemsRepositoryImpl(lazy, businessInventoryFeatureGateManager);
    }
}
