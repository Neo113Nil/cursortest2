package com.paypal.oslo.feature.dataprivacy.data.source;

/* loaded from: classes12.dex */
public final class DataPrivacyGraphQLDataSource_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.data.network.DataPrivacyRestService> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private DataPrivacyGraphQLDataSource_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.data.network.DataPrivacyRestService> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.data.network.DataPrivacyRestService> provider2) {
        return new com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.dataprivacy.data.network.DataPrivacyRestService dataPrivacyRestService) {
        return new com.paypal.oslo.feature.dataprivacy.data.source.DataPrivacyGraphQLDataSource(apolloClient, dataPrivacyRestService);
    }
}
