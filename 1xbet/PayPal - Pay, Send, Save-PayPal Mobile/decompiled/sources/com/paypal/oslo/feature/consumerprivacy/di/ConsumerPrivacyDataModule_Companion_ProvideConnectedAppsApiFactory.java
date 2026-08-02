package com.paypal.oslo.feature.consumerprivacy.di;

/* loaded from: classes12.dex */
public final class ConsumerPrivacyDataModule_Companion_ProvideConnectedAppsApiFactory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.data.apollo.ConnectedAppsApi> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    private ConsumerPrivacyDataModule_Companion_ProvideConnectedAppsApiFactory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.data.apollo.ConnectedAppsApi get() {
        return provideConnectedAppsApi(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.di.ConsumerPrivacyDataModule_Companion_ProvideConnectedAppsApiFactory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.di.ConsumerPrivacyDataModule_Companion_ProvideConnectedAppsApiFactory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.apollo.ConnectedAppsApi provideConnectedAppsApi(com.apollographql.apollo.ApolloClient apolloClient) {
        return (com.paypal.oslo.feature.consumerprivacy.data.apollo.ConnectedAppsApi) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.consumerprivacy.di.ConsumerPrivacyDataModule.INSTANCE.provideConnectedAppsApi(apolloClient));
    }
}
