package com.paypal.oslo.feature.contacts.domain.usecase;

/* loaded from: classes12.dex */
public final class DeleteRecentSearchUseCaseImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.contacts.domain.usecase.DeleteRecentSearchUseCaseImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.contacts.domain.repository.DeleteRecentSearchRepository> Camera2StreamConfigurationMap;

    private DeleteRecentSearchUseCaseImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.contacts.domain.repository.DeleteRecentSearchRepository> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.contacts.domain.usecase.DeleteRecentSearchUseCaseImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.contacts.domain.usecase.DeleteRecentSearchUseCaseImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.contacts.domain.repository.DeleteRecentSearchRepository> provider) {
        return new com.paypal.oslo.feature.contacts.domain.usecase.DeleteRecentSearchUseCaseImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.contacts.domain.usecase.DeleteRecentSearchUseCaseImpl newInstance(com.paypal.oslo.feature.contacts.domain.repository.DeleteRecentSearchRepository deleteRecentSearchRepository) {
        return new com.paypal.oslo.feature.contacts.domain.usecase.DeleteRecentSearchUseCaseImpl(deleteRecentSearchRepository);
    }
}
