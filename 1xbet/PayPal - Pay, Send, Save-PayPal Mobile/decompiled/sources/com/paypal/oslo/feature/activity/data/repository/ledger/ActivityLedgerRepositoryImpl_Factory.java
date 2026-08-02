package com.paypal.oslo.feature.activity.data.repository.ledger;

/* loaded from: classes10.dex */
public final class ActivityLedgerRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoFpsRanges;

    private ActivityLedgerRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> provider2, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider3) {
        return new com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper iActivityErrorMapper, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.activity.data.repository.ledger.ActivityLedgerRepositoryImpl(apolloClient, iActivityErrorMapper, coroutineDispatcher);
    }
}
