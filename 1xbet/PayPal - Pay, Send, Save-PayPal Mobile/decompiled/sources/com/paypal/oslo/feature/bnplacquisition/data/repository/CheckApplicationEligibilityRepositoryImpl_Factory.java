package com.paypal.oslo.feature.bnplacquisition.data.repository;

/* loaded from: classes11.dex */
public final class CheckApplicationEligibilityRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.data.repository.CheckApplicationEligibilityRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private CheckApplicationEligibilityRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.data.repository.CheckApplicationEligibilityRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoSizes));
    }

    public static com.paypal.oslo.feature.bnplacquisition.data.repository.CheckApplicationEligibilityRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.bnplacquisition.data.repository.CheckApplicationEligibilityRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplacquisition.data.repository.CheckApplicationEligibilityRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.bnplacquisition.data.repository.CheckApplicationEligibilityRepositoryImpl(lazy);
    }
}
