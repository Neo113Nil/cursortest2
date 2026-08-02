package com.paypal.oslo.feature.businessinventory.data.repository;

/* loaded from: classes11.dex */
public final class BusinessInventoryTaxesRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private BusinessInventoryTaxesRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRanges), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager> provider2) {
        return new com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.businessinventory.api.common.BusinessInventoryFeatureGateManager businessInventoryFeatureGateManager) {
        return new com.paypal.oslo.feature.businessinventory.data.repository.BusinessInventoryTaxesRepositoryImpl(lazy, businessInventoryFeatureGateManager);
    }
}
