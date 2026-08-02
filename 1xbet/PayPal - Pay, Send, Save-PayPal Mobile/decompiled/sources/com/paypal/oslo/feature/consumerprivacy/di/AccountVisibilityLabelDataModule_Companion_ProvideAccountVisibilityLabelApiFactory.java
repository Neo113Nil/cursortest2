package com.paypal.oslo.feature.consumerprivacy.di;

/* loaded from: classes12.dex */
public final class AccountVisibilityLabelDataModule_Companion_ProvideAccountVisibilityLabelApiFactory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityLabelApi> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    private AccountVisibilityLabelDataModule_Companion_ProvideAccountVisibilityLabelApiFactory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityLabelApi get() {
        return provideAccountVisibilityLabelApi(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.di.AccountVisibilityLabelDataModule_Companion_ProvideAccountVisibilityLabelApiFactory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.di.AccountVisibilityLabelDataModule_Companion_ProvideAccountVisibilityLabelApiFactory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityLabelApi provideAccountVisibilityLabelApi(com.apollographql.apollo.ApolloClient apolloClient) {
        return (com.paypal.oslo.feature.consumerprivacy.data.apollo.AccountVisibilityLabelApi) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.consumerprivacy.di.AccountVisibilityLabelDataModule.INSTANCE.provideAccountVisibilityLabelApi(apolloClient));
    }
}
