package com.paypal.oslo.feature.dataprivacy.ui.viewmodel;

/* loaded from: classes12.dex */
public final class DataDeletionViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.usecase.GetLinkedAccountsUseCase> Camera2StreamConfigurationMap;

    private DataDeletionViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.usecase.GetLinkedAccountsUseCase> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionViewModel get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.usecase.GetLinkedAccountsUseCase> provider) {
        return new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionViewModel newInstance(com.paypal.oslo.feature.dataprivacy.domain.usecase.GetLinkedAccountsUseCase getLinkedAccountsUseCase) {
        return new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.DataDeletionViewModel(getLinkedAccountsUseCase);
    }
}
