package com.paypal.oslo.feature.settings.data.apollo;

/* loaded from: classes14.dex */
public final class SettingsApolloClientImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private SettingsApolloClientImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.settings.data.apollo.SettingsApolloClientImpl(apolloClient);
    }
}
