package com.paypal.oslo.feature.contacts.domain.usecase;

/* loaded from: classes12.dex */
public final class CreateStringRecentSearchUseCaseImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.contacts.domain.usecase.CreateStringRecentSearchUseCaseImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.contacts.domain.repository.CreateRecentSearchRepository> getHighSpeedVideoSizes;

    private CreateStringRecentSearchUseCaseImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.contacts.domain.repository.CreateRecentSearchRepository> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.contacts.domain.usecase.CreateStringRecentSearchUseCaseImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.contacts.domain.usecase.CreateStringRecentSearchUseCaseImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.contacts.domain.repository.CreateRecentSearchRepository> provider) {
        return new com.paypal.oslo.feature.contacts.domain.usecase.CreateStringRecentSearchUseCaseImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.contacts.domain.usecase.CreateStringRecentSearchUseCaseImpl newInstance(com.paypal.oslo.feature.contacts.domain.repository.CreateRecentSearchRepository createRecentSearchRepository) {
        return new com.paypal.oslo.feature.contacts.domain.usecase.CreateStringRecentSearchUseCaseImpl(createRecentSearchRepository);
    }
}
