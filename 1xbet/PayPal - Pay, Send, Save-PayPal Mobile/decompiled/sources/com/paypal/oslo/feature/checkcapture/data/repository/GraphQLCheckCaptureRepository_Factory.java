package com.paypal.oslo.feature.checkcapture.data.repository;

/* loaded from: classes11.dex */
public final class GraphQLCheckCaptureRepository_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.checkcapture.data.repository.GraphQLCheckCaptureRepository> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    private GraphQLCheckCaptureRepository_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.checkcapture.data.repository.GraphQLCheckCaptureRepository get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.checkcapture.data.repository.GraphQLCheckCaptureRepository_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.checkcapture.data.repository.GraphQLCheckCaptureRepository_Factory(provider);
    }

    public static com.paypal.oslo.feature.checkcapture.data.repository.GraphQLCheckCaptureRepository newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.checkcapture.data.repository.GraphQLCheckCaptureRepository(apolloClient);
    }
}
