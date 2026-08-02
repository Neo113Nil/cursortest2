package com.paypal.oslo.feature.contacts.data.repository;

/* loaded from: classes12.dex */
public final class ContactSearchRepositoryImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.contacts.data.repository.ContactSearchRepositoryImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.contacts.domain.remoteconfig.ContactsFeatureGateManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.apollographql.apollo.ApolloClient> getHighSpeedVideoFpsRangesFor;

    private ContactSearchRepositoryImpl_Factory(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.contacts.domain.remoteconfig.ContactsFeatureGateManager> provider3) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.contacts.data.repository.ContactSearchRepositoryImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.contacts.data.repository.ContactSearchRepositoryImpl_Factory create(dagger.internal.Provider<com.apollographql.apollo.ApolloClient> provider, dagger.internal.Provider<com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.contacts.domain.remoteconfig.ContactsFeatureGateManager> provider3) {
        return new com.paypal.oslo.feature.contacts.data.repository.ContactSearchRepositoryImpl_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.contacts.data.repository.ContactSearchRepositoryImpl newInstance(com.apollographql.apollo.ApolloClient apolloClient, com.paypal.oslo.feature.contacts.data.mapper.ContactDomainModelMapper contactDomainModelMapper, com.paypal.oslo.feature.contacts.domain.remoteconfig.ContactsFeatureGateManager contactsFeatureGateManager) {
        return new com.paypal.oslo.feature.contacts.data.repository.ContactSearchRepositoryImpl(apolloClient, contactDomainModelMapper, contactsFeatureGateManager);
    }
}
