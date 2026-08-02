package com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.repository;

/* loaded from: classes12.dex */
public final class PasskeyCreateRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.repository.PasskeyCreateRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private PasskeyCreateRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.repository.PasskeyCreateRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.repository.PasskeyCreateRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.repository.PasskeyCreateRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.repository.PasskeyCreateRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.identity.passkey.management.enrollment.create.data.repository.PasskeyCreateRepositoryImpl(apolloClient);
    }
}
