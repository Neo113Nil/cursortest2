package com.paypal.oslo.feature.p2p.data.repository;

/* loaded from: classes13.dex */
public final class ClaimMoneyRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.data.repository.ClaimMoneyRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.ClaimMoneyTransferMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.CompletePaymentTransferMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private ClaimMoneyRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.ClaimMoneyTransferMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.CompletePaymentTransferMapper> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.data.repository.ClaimMoneyRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor, this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.p2p.data.repository.ClaimMoneyRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.ClaimMoneyTransferMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.p2p.data.mapper.CompletePaymentTransferMapper> provider3) {
        return new com.paypal.oslo.feature.p2p.data.repository.ClaimMoneyRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.p2p.data.repository.ClaimMoneyRepositoryImpl newInstance(javax.inject.Provider<com.apollographql.apollo.ApolloClient> provider, com.paypal.oslo.feature.p2p.data.mapper.ClaimMoneyTransferMapper claimMoneyTransferMapper, com.paypal.oslo.feature.p2p.data.mapper.CompletePaymentTransferMapper completePaymentTransferMapper) {
        return new com.paypal.oslo.feature.p2p.data.repository.ClaimMoneyRepositoryImpl(provider, claimMoneyTransferMapper, completePaymentTransferMapper);
    }
}
