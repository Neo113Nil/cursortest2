package com.paypal.oslo.feature.identity.changepassword.data.repository;

/* loaded from: classes12.dex */
public final class ChangePasswordRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.changepassword.data.repository.ChangePasswordRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private ChangePasswordRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.changepassword.data.repository.ChangePasswordRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRangesFor));
    }

    public static com.paypal.oslo.feature.identity.changepassword.data.repository.ChangePasswordRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.identity.changepassword.data.repository.ChangePasswordRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.changepassword.data.repository.ChangePasswordRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.identity.changepassword.data.repository.ChangePasswordRepositoryImpl(lazy);
    }
}
