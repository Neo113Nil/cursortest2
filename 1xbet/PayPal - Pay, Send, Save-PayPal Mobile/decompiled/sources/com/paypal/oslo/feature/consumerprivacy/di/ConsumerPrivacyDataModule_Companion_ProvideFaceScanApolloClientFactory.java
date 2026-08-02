package com.paypal.oslo.feature.consumerprivacy.di;

/* loaded from: classes12.dex */
public final class ConsumerPrivacyDataModule_Companion_ProvideFaceScanApolloClientFactory implements dagger.internal.Factory<com.paypal.oslo.feature.consumerprivacy.data.apollo.FaceScanApi> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private ConsumerPrivacyDataModule_Companion_ProvideFaceScanApolloClientFactory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.consumerprivacy.data.apollo.FaceScanApi get() {
        return provideFaceScanApolloClient(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.consumerprivacy.di.ConsumerPrivacyDataModule_Companion_ProvideFaceScanApolloClientFactory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.consumerprivacy.di.ConsumerPrivacyDataModule_Companion_ProvideFaceScanApolloClientFactory(provider);
    }

    public static com.paypal.oslo.feature.consumerprivacy.data.apollo.FaceScanApi provideFaceScanApolloClient(com.apollographql.apollo.ApolloClient apolloClient) {
        return (com.paypal.oslo.feature.consumerprivacy.data.apollo.FaceScanApi) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.consumerprivacy.di.ConsumerPrivacyDataModule.INSTANCE.provideFaceScanApolloClient(apolloClient));
    }
}
