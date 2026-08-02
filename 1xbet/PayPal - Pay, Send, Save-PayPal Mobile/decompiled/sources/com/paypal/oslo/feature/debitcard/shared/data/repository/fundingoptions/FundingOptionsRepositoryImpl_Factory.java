package com.paypal.oslo.feature.debitcard.shared.data.repository.fundingoptions;

/* loaded from: classes12.dex */
public final class FundingOptionsRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.shared.data.repository.fundingoptions.FundingOptionsRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;

    private FundingOptionsRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.shared.data.repository.fundingoptions.FundingOptionsRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.Camera2StreamConfigurationMap));
    }

    public static com.paypal.oslo.feature.debitcard.shared.data.repository.fundingoptions.FundingOptionsRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.debitcard.shared.data.repository.fundingoptions.FundingOptionsRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.shared.data.repository.fundingoptions.FundingOptionsRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.debitcard.shared.data.repository.fundingoptions.FundingOptionsRepositoryImpl(lazy);
    }
}
