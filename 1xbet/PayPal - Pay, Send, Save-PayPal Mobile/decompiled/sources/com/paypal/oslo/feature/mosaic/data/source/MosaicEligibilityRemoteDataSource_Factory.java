package com.paypal.oslo.feature.mosaic.data.source;

/* loaded from: classes13.dex */
public final class MosaicEligibilityRemoteDataSource_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.mosaic.data.source.MosaicEligibilityRemoteDataSource> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private MosaicEligibilityRemoteDataSource_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.mosaic.data.source.MosaicEligibilityRemoteDataSource get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.mosaic.data.source.MosaicEligibilityRemoteDataSource_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.mosaic.data.source.MosaicEligibilityRemoteDataSource_Factory(provider);
    }

    public static com.paypal.oslo.feature.mosaic.data.source.MosaicEligibilityRemoteDataSource newInstance(com.apollographql.apollo.ApolloClient apolloClient) {
        return new com.paypal.oslo.feature.mosaic.data.source.MosaicEligibilityRemoteDataSource(apolloClient);
    }
}
