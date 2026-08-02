package com.paypal.oslo.feature.p2p.data.repository;

/* loaded from: classes13.dex */
public final class CurrencyRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.FxQuoteMapper> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.SupportedDestinationMapper> getHighSpeedVideoSizes;

    private CurrencyRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.SupportedDestinationMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.FxQuoteMapper> provider3) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges, this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.SupportedDestinationMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.FxQuoteMapper> provider3) {
        return new com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl newInstance(javax.inject.Provider<com.apollographql.apollo.ApolloClient> provider, com.paypal.oslo.feature.p2p.data.mapper.SupportedDestinationMapper supportedDestinationMapper, com.paypal.oslo.feature.p2p.data.mapper.FxQuoteMapper fxQuoteMapper) {
        return new com.paypal.oslo.feature.p2p.data.repository.CurrencyRepositoryImpl(provider, supportedDestinationMapper, fxQuoteMapper);
    }
}
