package com.paypal.oslo.feature.consumerprivacy.di;

/* loaded from: classes12.dex */
public final class ConsumerPrivacyDataModule_Companion_ProvideGranularAccountVisibilityApolloClientFactory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.data.apollo.GranularAccountVisibilityApi> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private ConsumerPrivacyDataModule_Companion_ProvideGranularAccountVisibilityApolloClientFactory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.data.apollo.GranularAccountVisibilityApi get() {
        return provideGranularAccountVisibilityApolloClient(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.di.ConsumerPrivacyDataModule_Companion_ProvideGranularAccountVisibilityApolloClientFactory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.di.ConsumerPrivacyDataModule_Companion_ProvideGranularAccountVisibilityApolloClientFactory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.apollo.GranularAccountVisibilityApi provideGranularAccountVisibilityApolloClient(com.apollographql.apollo.ApolloClient apolloClient) {
        return (com.paypal.oslo.feature.consumerprivacy.data.apollo.GranularAccountVisibilityApi) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.consumerprivacy.di.ConsumerPrivacyDataModule.INSTANCE.provideGranularAccountVisibilityApolloClient(apolloClient));
    }
}
