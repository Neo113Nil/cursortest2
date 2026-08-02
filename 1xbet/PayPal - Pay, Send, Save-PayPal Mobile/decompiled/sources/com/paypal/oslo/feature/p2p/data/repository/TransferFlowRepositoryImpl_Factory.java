package com.paypal.oslo.feature.p2p.data.repository;

/* loaded from: classes13.dex */
public final class TransferFlowRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.TransferFlowMappers> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private TransferFlowRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.TransferFlowMappers> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRangesFor), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.TransferFlowMappers> provider2) {
        return new com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy, com.paypal.oslo.feature.p2p.data.mapper.TransferFlowMappers transferFlowMappers) {
        return new com.paypal.oslo.feature.p2p.data.repository.TransferFlowRepositoryImpl(lazy, transferFlowMappers);
    }
}
