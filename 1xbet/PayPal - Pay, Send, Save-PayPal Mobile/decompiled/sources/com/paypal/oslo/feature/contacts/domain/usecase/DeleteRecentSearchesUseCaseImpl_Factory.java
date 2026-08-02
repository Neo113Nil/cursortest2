package com.paypal.oslo.feature.contacts.domain.usecase;

/* loaded from: classes12.dex */
public final class DeleteRecentSearchesUseCaseImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.contacts.domain.usecase.DeleteRecentSearchesUseCaseImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.contacts.domain.repository.DeleteRecentSearchesRepository> getHighResolutionOutputSizeshNQ4ISI;

    private DeleteRecentSearchesUseCaseImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.contacts.domain.repository.DeleteRecentSearchesRepository> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.contacts.domain.usecase.DeleteRecentSearchesUseCaseImpl get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.contacts.domain.usecase.DeleteRecentSearchesUseCaseImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.contacts.domain.repository.DeleteRecentSearchesRepository> provider) {
        return new com.paypal.oslo.feature.contacts.domain.usecase.DeleteRecentSearchesUseCaseImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.contacts.domain.usecase.DeleteRecentSearchesUseCaseImpl newInstance(com.paypal.oslo.feature.contacts.domain.repository.DeleteRecentSearchesRepository deleteRecentSearchesRepository) {
        return new com.paypal.oslo.feature.contacts.domain.usecase.DeleteRecentSearchesUseCaseImpl(deleteRecentSearchesRepository);
    }
}
