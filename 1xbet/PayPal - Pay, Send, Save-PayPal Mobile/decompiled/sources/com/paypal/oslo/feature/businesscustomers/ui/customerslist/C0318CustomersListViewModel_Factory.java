package com.paypal.oslo.feature.businesscustomers.ui.customerslist;

/* renamed from: com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C0318CustomersListViewModel_Factory {
    private final dagger.internal.Provider<androidx.view.SavedStateHandle> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.SearchCustomersUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.GetCustomersUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.GetCustomersUpdatesUseCase> getHighSpeedVideoSizes;

    private C0318CustomersListViewModel_Factory(dagger.internal.Provider<androidx.view.SavedStateHandle> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.GetCustomersUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.SearchCustomersUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.GetCustomersUpdatesUseCase> provider4) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoSizes = provider4;
    }

    public final com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel get(com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode) {
        return newInstance(customersPresentationMode, this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.businesscustomers.ui.customerslist.C0318CustomersListViewModel_Factory create(dagger.internal.Provider<androidx.view.SavedStateHandle> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.GetCustomersUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.SearchCustomersUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.GetCustomersUpdatesUseCase> provider4) {
        return new com.paypal.oslo.feature.businesscustomers.ui.customerslist.C0318CustomersListViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel newInstance(com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode, androidx.view.SavedStateHandle savedStateHandle, com.paypal.oslo.feature.businesscustomers.domain.usecase.GetCustomersUseCase getCustomersUseCase, com.paypal.oslo.feature.businesscustomers.domain.usecase.SearchCustomersUseCase searchCustomersUseCase, com.paypal.oslo.feature.businesscustomers.domain.usecase.GetCustomersUpdatesUseCase getCustomersUpdatesUseCase) {
        return new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel(customersPresentationMode, savedStateHandle, getCustomersUseCase, searchCustomersUseCase, getCustomersUpdatesUseCase);
    }
}
