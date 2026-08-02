package com.paypal.oslo.feature.pushnotification.preferences.data.service;

/* loaded from: classes13.dex */
public final class PushPreferenceDataServiceImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.pushnotification.preferences.data.service.PushPreferenceDataServiceImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private PushPreferenceDataServiceImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.pushnotification.preferences.data.service.PushPreferenceDataServiceImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.pushnotification.preferences.data.service.PushPreferenceDataServiceImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.pushnotification.preferences.data.service.PushPreferenceDataServiceImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.pushnotification.preferences.data.service.PushPreferenceDataServiceImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.pushnotification.preferences.data.service.PushPreferenceDataServiceImpl(apolloClient);
    }
}
