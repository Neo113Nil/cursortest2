package com.paypal.oslo.feature.consumerprivacy.data.apollo;

/* loaded from: classes11.dex */
public final class ConnectedAppsApiImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.data.apollo.ConnectedAppsApiImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    private ConnectedAppsApiImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.data.apollo.ConnectedAppsApiImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.apollo.ConnectedAppsApiImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.data.apollo.ConnectedAppsApiImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.apollo.ConnectedAppsApiImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.consumerprivacy.data.apollo.ConnectedAppsApiImpl(apolloClient);
    }
}
