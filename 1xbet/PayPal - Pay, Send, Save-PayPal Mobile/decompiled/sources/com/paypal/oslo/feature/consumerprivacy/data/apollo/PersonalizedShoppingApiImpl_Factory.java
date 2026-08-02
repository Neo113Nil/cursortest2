package com.paypal.oslo.feature.consumerprivacy.data.apollo;

/* loaded from: classes11.dex */
public final class PersonalizedShoppingApiImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedShoppingApiImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    private PersonalizedShoppingApiImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedShoppingApiImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedShoppingApiImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedShoppingApiImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedShoppingApiImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedShoppingApiImpl(apolloClient);
    }
}
