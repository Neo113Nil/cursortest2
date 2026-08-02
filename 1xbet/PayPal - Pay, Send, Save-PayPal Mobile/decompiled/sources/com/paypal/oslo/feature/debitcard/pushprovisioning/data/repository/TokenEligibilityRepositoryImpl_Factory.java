package com.paypal.oslo.feature.debitcard.pushprovisioning.data.repository;

/* loaded from: classes12.dex */
public final class TokenEligibilityRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.pushprovisioning.data.repository.TokenEligibilityRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighResolutionOutputSizeshNQ4ISI;

    private TokenEligibilityRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.pushprovisioning.data.repository.TokenEligibilityRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighResolutionOutputSizeshNQ4ISI));
    }

    public static com.paypal.oslo.feature.debitcard.pushprovisioning.data.repository.TokenEligibilityRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.data.repository.TokenEligibilityRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.pushprovisioning.data.repository.TokenEligibilityRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.data.repository.TokenEligibilityRepositoryImpl(lazy);
    }
}
