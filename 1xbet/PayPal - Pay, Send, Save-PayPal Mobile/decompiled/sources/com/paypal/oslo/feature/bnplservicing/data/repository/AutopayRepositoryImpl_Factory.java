package com.paypal.oslo.feature.bnplservicing.data.repository;

/* loaded from: classes11.dex */
public final class AutopayRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.data.repository.AutopayRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private AutopayRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.data.repository.AutopayRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRanges));
    }

    public static com.paypal.oslo.feature.bnplservicing.data.repository.AutopayRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.bnplservicing.data.repository.AutopayRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.bnplservicing.data.repository.AutopayRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.bnplservicing.data.repository.AutopayRepositoryImpl(lazy);
    }
}
