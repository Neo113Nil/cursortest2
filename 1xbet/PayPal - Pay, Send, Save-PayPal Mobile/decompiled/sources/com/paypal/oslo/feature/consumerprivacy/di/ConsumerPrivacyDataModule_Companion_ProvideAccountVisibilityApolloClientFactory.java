package com.paypal.oslo.feature.consumerprivacy.di;

/* loaded from: classes12.dex */
public final class ConsumerPrivacyDataModule_Companion_ProvideAccountVisibilityApolloClientFactory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityApi> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    private ConsumerPrivacyDataModule_Companion_ProvideAccountVisibilityApolloClientFactory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityApi get() {
        return provideAccountVisibilityApolloClient(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.di.ConsumerPrivacyDataModule_Companion_ProvideAccountVisibilityApolloClientFactory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.di.ConsumerPrivacyDataModule_Companion_ProvideAccountVisibilityApolloClientFactory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityApi provideAccountVisibilityApolloClient(com.apollographql.apollo.ApolloClient apolloClient) {
        return (com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityApi) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.consumerprivacy.di.ConsumerPrivacyDataModule.INSTANCE.provideAccountVisibilityApolloClient(apolloClient));
    }
}
