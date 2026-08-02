package com.paypal.oslo.core.userstore.data.repository;

/* loaded from: classes10.dex */
public final class UserRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.core.userstore.data.repository.UserRepository> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private UserRepository_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.userstore.data.repository.UserRepository get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.core.userstore.data.repository.UserRepository_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.core.userstore.data.repository.UserRepository_Factory(provider);
    }

    public static com.paypal.oslo.core.userstore.data.repository.UserRepository newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.core.userstore.data.repository.UserRepository(apolloClient);
    }
}
