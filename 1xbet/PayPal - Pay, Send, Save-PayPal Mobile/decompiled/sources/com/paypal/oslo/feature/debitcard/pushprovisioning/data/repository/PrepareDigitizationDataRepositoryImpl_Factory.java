package com.paypal.oslo.feature.debitcard.pushprovisioning.data.repository;

/* loaded from: classes12.dex */
public final class PrepareDigitizationDataRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.pushprovisioning.data.repository.PrepareDigitizationDataRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoSizes;

    private PrepareDigitizationDataRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.pushprovisioning.data.repository.PrepareDigitizationDataRepositoryImpl get() {
        return newInstance(dagger.internal.DoubleCheck.lazy((dagger.internal.Provider) this.getHighSpeedVideoSizes));
    }

    public static com.paypal.oslo.feature.debitcard.pushprovisioning.data.repository.PrepareDigitizationDataRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider) {
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.data.repository.PrepareDigitizationDataRepositoryImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.pushprovisioning.data.repository.PrepareDigitizationDataRepositoryImpl newInstance(dagger.Lazy<com.apollographql.apollo.ApolloClient> lazy) {
        return new com.paypal.oslo.feature.debitcard.pushprovisioning.data.repository.PrepareDigitizationDataRepositoryImpl(lazy);
    }
}
