package com.paypal.oslo.feature.consumerprivacy.data.apollo;

/* loaded from: classes11.dex */
public final class FaceScanApiImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.data.apollo.FaceScanApiImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private FaceScanApiImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.data.apollo.FaceScanApiImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.apollo.FaceScanApiImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.data.apollo.FaceScanApiImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.apollo.FaceScanApiImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.consumerprivacy.data.apollo.FaceScanApiImpl(apolloClient);
    }
}
