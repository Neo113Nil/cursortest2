package com.paypal.oslo.feature.qrc.data.repository;

/* loaded from: classes14.dex */
public final class EnrollmentRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.qrc.data.repository.EnrollmentRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private EnrollmentRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.qrc.data.repository.EnrollmentRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.qrc.data.repository.EnrollmentRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.qrc.data.repository.EnrollmentRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.qrc.data.repository.EnrollmentRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.qrc.data.repository.EnrollmentRepositoryImpl(apolloClient);
    }
}
