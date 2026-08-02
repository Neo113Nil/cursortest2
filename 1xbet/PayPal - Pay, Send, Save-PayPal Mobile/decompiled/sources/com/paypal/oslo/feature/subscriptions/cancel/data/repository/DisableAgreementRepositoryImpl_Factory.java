package com.paypal.oslo.feature.subscriptions.cancel.data.repository;

/* loaded from: classes15.dex */
public final class DisableAgreementRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.subscriptions.cancel.data.repository.DisableAgreementRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRanges;

    private DisableAgreementRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.subscriptions.cancel.data.repository.DisableAgreementRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoFpsRanges));
    }

    public static com.paypal.oslo.feature.subscriptions.cancel.data.repository.DisableAgreementRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.subscriptions.cancel.data.repository.DisableAgreementRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.subscriptions.cancel.data.repository.DisableAgreementRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.subscriptions.cancel.data.repository.DisableAgreementRepositoryImpl(lazy);
    }
}
