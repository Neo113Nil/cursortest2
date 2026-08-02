package com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service;

/* loaded from: classes13.dex */
public final class PushTokenDataServiceImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataServiceImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private PushTokenDataServiceImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataServiceImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataServiceImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataServiceImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataServiceImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.pushnotification.tokenmanagement.data.service.PushTokenDataServiceImpl(apolloClient);
    }
}
