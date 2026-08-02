package com.paypal.oslo.feature.bnplservicing.data.repository;

/* loaded from: classes11.dex */
public final class PlanDetailsOverviewRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.data.repository.PlanDetailsOverviewRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    private PlanDetailsOverviewRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.data.repository.PlanDetailsOverviewRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.Camera2StreamConfigurationMap));
    }

    public static com.paypal.oslo.feature.bnplservicing.data.repository.PlanDetailsOverviewRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.bnplservicing.data.repository.PlanDetailsOverviewRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplservicing.data.repository.PlanDetailsOverviewRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.bnplservicing.data.repository.PlanDetailsOverviewRepositoryImpl(lazy);
    }
}
