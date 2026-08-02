package com.paypal.oslo.feature.bnplservicing.data.repository;

/* loaded from: classes11.dex */
public final class PrequalifiedAmountRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.data.repository.PrequalifiedAmountRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private PrequalifiedAmountRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.data.repository.PrequalifiedAmountRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoSizes));
    }

    public static com.paypal.oslo.feature.bnplservicing.data.repository.PrequalifiedAmountRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.bnplservicing.data.repository.PrequalifiedAmountRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplservicing.data.repository.PrequalifiedAmountRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.bnplservicing.data.repository.PrequalifiedAmountRepositoryImpl(lazy);
    }
}
