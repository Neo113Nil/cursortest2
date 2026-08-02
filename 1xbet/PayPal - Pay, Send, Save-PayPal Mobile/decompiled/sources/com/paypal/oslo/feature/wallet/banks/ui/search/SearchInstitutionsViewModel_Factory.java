package com.paypal.oslo.feature.wallet.banks.ui.search;

/* loaded from: classes15.dex */
public final class SearchInstitutionsViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.SearchInstitutionsUseCase> getHighSpeedVideoFpsRanges;

    private SearchInstitutionsViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.SearchInstitutionsUseCase> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.wallet.banks.domain.usecase.SearchInstitutionsUseCase> provider) {
        return new com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel newInstance(com.paypal.oslo.feature.wallet.banks.domain.usecase.SearchInstitutionsUseCase searchInstitutionsUseCase) {
        return new com.paypal.oslo.feature.wallet.banks.ui.search.SearchInstitutionsViewModel(searchInstitutionsUseCase);
    }
}
