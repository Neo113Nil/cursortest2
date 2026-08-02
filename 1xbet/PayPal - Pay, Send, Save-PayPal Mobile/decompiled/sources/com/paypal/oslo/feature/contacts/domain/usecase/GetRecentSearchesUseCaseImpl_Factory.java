package com.paypal.oslo.feature.contacts.domain.usecase;

/* loaded from: classes12.dex */
public final class GetRecentSearchesUseCaseImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.contacts.domain.usecase.GetRecentSearchesUseCaseImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.contacts.domain.repository.RecentSearchesRepository> getHighSpeedVideoFpsRanges;

    private GetRecentSearchesUseCaseImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.contacts.domain.repository.RecentSearchesRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.contacts.domain.usecase.GetRecentSearchesUseCaseImpl get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.contacts.domain.usecase.GetRecentSearchesUseCaseImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.contacts.domain.repository.RecentSearchesRepository> provider) {
        return new com.paypal.oslo.feature.contacts.domain.usecase.GetRecentSearchesUseCaseImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.contacts.domain.usecase.GetRecentSearchesUseCaseImpl newInstance(com.paypal.oslo.feature.contacts.domain.repository.RecentSearchesRepository recentSearchesRepository) {
        return new com.paypal.oslo.feature.contacts.domain.usecase.GetRecentSearchesUseCaseImpl(recentSearchesRepository);
    }
}
