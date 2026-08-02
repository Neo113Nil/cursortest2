package com.paypal.oslo.feature.consumerprivacy.di;

/* loaded from: classes12.dex */
public final class ConsumerPrivacyDataModule_Companion_ProvidePersonalizedShoppingApolloClientFactory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedShoppingApi> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    private ConsumerPrivacyDataModule_Companion_ProvidePersonalizedShoppingApolloClientFactory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedShoppingApi get() {
        return providePersonalizedShoppingApolloClient(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.di.ConsumerPrivacyDataModule_Companion_ProvidePersonalizedShoppingApolloClientFactory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.di.ConsumerPrivacyDataModule_Companion_ProvidePersonalizedShoppingApolloClientFactory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedShoppingApi providePersonalizedShoppingApolloClient(com.apollographql.apollo.ApolloClient apolloClient) {
        return (com.paypal.oslo.feature.consumerprivacy.data.apollo.PersonalizedShoppingApi) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.consumerprivacy.di.ConsumerPrivacyDataModule.INSTANCE.providePersonalizedShoppingApolloClient(apolloClient));
    }
}
