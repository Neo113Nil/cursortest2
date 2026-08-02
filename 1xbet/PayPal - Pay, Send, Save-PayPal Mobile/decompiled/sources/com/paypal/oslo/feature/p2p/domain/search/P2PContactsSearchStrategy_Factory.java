package com.paypal.oslo.feature.p2p.domain.search;

/* loaded from: classes13.dex */
public final class P2PContactsSearchStrategy_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.contacts.api.usecase.DeleteRecentSearchUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.contacts.api.usecase.GetRecentContactsUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.contacts.api.usecase.DeleteAllRecentSearchesUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.contacts.api.usecase.AddStringRecentSearchUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.contacts.api.usecase.AddContactRecentSearchUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.contacts.api.usecase.SearchContactsUseCase> getOutputFormats;

    private P2PContactsSearchStrategy_Factory(dagger.internal.Provider<com.paypal.oslo.feature.contacts.api.usecase.SearchContactsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.contacts.api.usecase.GetRecentContactsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.contacts.api.usecase.AddContactRecentSearchUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.contacts.api.usecase.AddStringRecentSearchUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.contacts.api.usecase.DeleteRecentSearchUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.contacts.api.usecase.DeleteAllRecentSearchesUseCase> provider6) {
        this.getOutputFormats = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.Camera2StreamConfigurationMap = provider5;
        this.getHighSpeedVideoFpsRanges = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy get() {
        return newInstance(this.getOutputFormats.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.contacts.api.usecase.SearchContactsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.contacts.api.usecase.GetRecentContactsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.contacts.api.usecase.AddContactRecentSearchUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.contacts.api.usecase.AddStringRecentSearchUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.contacts.api.usecase.DeleteRecentSearchUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.contacts.api.usecase.DeleteAllRecentSearchesUseCase> provider6) {
        return new com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy newInstance(com.paypal.oslo.feature.contacts.api.usecase.SearchContactsUseCase searchContactsUseCase, com.paypal.oslo.feature.contacts.api.usecase.GetRecentContactsUseCase getRecentContactsUseCase, com.paypal.oslo.feature.contacts.api.usecase.AddContactRecentSearchUseCase addContactRecentSearchUseCase, com.paypal.oslo.feature.contacts.api.usecase.AddStringRecentSearchUseCase addStringRecentSearchUseCase, com.paypal.oslo.feature.contacts.api.usecase.DeleteRecentSearchUseCase deleteRecentSearchUseCase, com.paypal.oslo.feature.contacts.api.usecase.DeleteAllRecentSearchesUseCase deleteAllRecentSearchesUseCase) {
        return new com.paypal.oslo.feature.p2p.domain.search.P2PContactsSearchStrategy(searchContactsUseCase, getRecentContactsUseCase, addContactRecentSearchUseCase, addStringRecentSearchUseCase, deleteRecentSearchUseCase, deleteAllRecentSearchesUseCase);
    }
}
