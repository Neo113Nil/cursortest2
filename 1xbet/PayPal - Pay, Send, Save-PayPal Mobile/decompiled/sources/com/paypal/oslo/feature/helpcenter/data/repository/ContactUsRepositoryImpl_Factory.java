package com.paypal.oslo.feature.helpcenter.data.repository;

/* loaded from: classes12.dex */
public final class ContactUsRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.helpcenter.data.repository.ContactUsRepositoryImpl> {
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighSpeedVideoSizes;

    private ContactUsRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.helpcenter.data.repository.ContactUsRepositoryImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.helpcenter.data.repository.ContactUsRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider2) {
        return new com.paypal.oslo.feature.helpcenter.data.repository.ContactUsRepositoryImpl_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.helpcenter.data.repository.ContactUsRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher) {
        return new com.paypal.oslo.feature.helpcenter.data.repository.ContactUsRepositoryImpl(apolloClient, coroutineDispatcher);
    }
}
