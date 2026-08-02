package com.paypal.oslo.feature.contacts.domain.usecase;

/* loaded from: classes12.dex */
public final class SearchContactsUseCaseImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.contacts.domain.usecase.SearchContactsUseCaseImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.contacts.domain.repository.ContactSearchRepository> getHighSpeedVideoFpsRangesFor;

    private SearchContactsUseCaseImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.contacts.domain.repository.ContactSearchRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.contacts.domain.usecase.SearchContactsUseCaseImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.contacts.domain.usecase.SearchContactsUseCaseImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.contacts.domain.repository.ContactSearchRepository> provider) {
        return new com.paypal.oslo.feature.contacts.domain.usecase.SearchContactsUseCaseImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.contacts.domain.usecase.SearchContactsUseCaseImpl newInstance(com.paypal.oslo.feature.contacts.domain.repository.ContactSearchRepository contactSearchRepository) {
        return new com.paypal.oslo.feature.contacts.domain.usecase.SearchContactsUseCaseImpl(contactSearchRepository);
    }
}
