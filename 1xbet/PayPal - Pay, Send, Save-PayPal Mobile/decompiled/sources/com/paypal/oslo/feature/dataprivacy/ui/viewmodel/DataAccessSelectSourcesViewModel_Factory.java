package com.paypal.oslo.feature.dataprivacy.ui.viewmodel;

/* loaded from: classes12.dex */
public final class DataAccessSelectSourcesViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.usecase.GetLinkedAccountsUseCase> getHighSpeedVideoSizes;

    private DataAccessSelectSourcesViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.usecase.GetLinkedAccountsUseCase> provider) {
        this.getHighSpeedVideoSizes = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel get() {
        return newInstance(this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.usecase.GetLinkedAccountsUseCase> provider) {
        return new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel newInstance(com.paypal.oslo.feature.dataprivacy.domain.usecase.GetLinkedAccountsUseCase getLinkedAccountsUseCase) {
        return new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataAccessSelectSourcesViewModel(getLinkedAccountsUseCase);
    }
}
