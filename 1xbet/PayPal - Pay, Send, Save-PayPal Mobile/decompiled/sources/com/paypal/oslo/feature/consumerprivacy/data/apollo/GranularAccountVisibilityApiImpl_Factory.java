package com.paypal.oslo.feature.consumerprivacy.data.apollo;

/* loaded from: classes11.dex */
public final class GranularAccountVisibilityApiImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.data.apollo.GranularAccountVisibilityApiImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    private GranularAccountVisibilityApiImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.data.apollo.GranularAccountVisibilityApiImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.apollo.GranularAccountVisibilityApiImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.data.apollo.GranularAccountVisibilityApiImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.apollo.GranularAccountVisibilityApiImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.consumerprivacy.data.apollo.GranularAccountVisibilityApiImpl(apolloClient);
    }
}
