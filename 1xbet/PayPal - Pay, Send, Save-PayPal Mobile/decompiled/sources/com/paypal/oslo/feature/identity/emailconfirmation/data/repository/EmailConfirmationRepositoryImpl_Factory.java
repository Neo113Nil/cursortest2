package com.paypal.oslo.feature.identity.emailconfirmation.data.repository;

/* loaded from: classes12.dex */
public final class EmailConfirmationRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.emailconfirmation.data.repository.EmailConfirmationRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private EmailConfirmationRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.emailconfirmation.data.repository.EmailConfirmationRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRanges));
    }

    public static com.paypal.oslo.feature.identity.emailconfirmation.data.repository.EmailConfirmationRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.identity.emailconfirmation.data.repository.EmailConfirmationRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.emailconfirmation.data.repository.EmailConfirmationRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.identity.emailconfirmation.data.repository.EmailConfirmationRepositoryImpl(lazy);
    }
}
