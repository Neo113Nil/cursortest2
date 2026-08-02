package com.paypal.oslo.feature.businesscustomers.data.repository;

/* loaded from: classes11.dex */
public final class CustomersRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.api.common.BusinessCustomerFeatureGateManager> getHighSpeedVideoSizes;

    private CustomersRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.api.common.BusinessCustomerFeatureGateManager> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRangesFor), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.api.common.BusinessCustomerFeatureGateManager> provider2) {
        return new com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.businesscustomers.api.common.BusinessCustomerFeatureGateManager businessCustomerFeatureGateManager) {
        return new com.paypal.oslo.feature.businesscustomers.data.repository.CustomersRepositoryImpl(lazy, businessCustomerFeatureGateManager);
    }
}
