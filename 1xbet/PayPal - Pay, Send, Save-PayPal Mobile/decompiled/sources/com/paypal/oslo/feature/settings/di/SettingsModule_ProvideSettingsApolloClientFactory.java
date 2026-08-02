package com.paypal.oslo.feature.settings.di;

/* loaded from: classes14.dex */
public final class SettingsModule_ProvideSettingsApolloClientFactory implements dagger.internal.Factory<com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private SettingsModule_ProvideSettingsApolloClientFactory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient get() {
        return provideSettingsApolloClient(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.settings.di.SettingsModule_ProvideSettingsApolloClientFactory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.settings.di.SettingsModule_ProvideSettingsApolloClientFactory(provider);
    }

    public static com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient provideSettingsApolloClient(com.apollographql.apollo.ApolloClient apolloClient) {
        return (com.paypal.oslo.feature.settings.data.apollo.ISettingsApolloClient) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.settings.di.SettingsModule.INSTANCE.provideSettingsApolloClient(apolloClient));
    }
}
