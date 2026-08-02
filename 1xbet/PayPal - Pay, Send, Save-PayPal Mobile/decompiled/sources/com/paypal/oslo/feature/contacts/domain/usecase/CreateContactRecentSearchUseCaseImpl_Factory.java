package com.paypal.oslo.feature.contacts.domain.usecase;

/* loaded from: classes12.dex */
public final class CreateContactRecentSearchUseCaseImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.contacts.domain.usecase.CreateContactRecentSearchUseCaseImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.contacts.domain.repository.CreateRecentSearchRepository> getHighSpeedVideoFpsRangesFor;

    private CreateContactRecentSearchUseCaseImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.contacts.domain.repository.CreateRecentSearchRepository> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.contacts.domain.usecase.CreateContactRecentSearchUseCaseImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.contacts.domain.usecase.CreateContactRecentSearchUseCaseImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.contacts.domain.repository.CreateRecentSearchRepository> provider) {
        return new com.paypal.oslo.feature.contacts.domain.usecase.CreateContactRecentSearchUseCaseImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.contacts.domain.usecase.CreateContactRecentSearchUseCaseImpl newInstance(com.paypal.oslo.feature.contacts.domain.repository.CreateRecentSearchRepository createRecentSearchRepository) {
        return new com.paypal.oslo.feature.contacts.domain.usecase.CreateContactRecentSearchUseCaseImpl(createRecentSearchRepository);
    }
}
