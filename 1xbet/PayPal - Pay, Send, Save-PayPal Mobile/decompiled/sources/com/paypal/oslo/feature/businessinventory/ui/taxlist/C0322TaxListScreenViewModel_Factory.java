package com.paypal.oslo.feature.businessinventory.ui.taxlist;

/* renamed from: com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C0322TaxListScreenViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.SyncTaxOptionsUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.GetBusinessInventoryUpdatesUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.domain.usecase.GetBusinessInventoryTaxesUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.ItemLibraryAnalytics> getHighSpeedVideoSizes;

    private C0322TaxListScreenViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.GetBusinessInventoryUpdatesUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.domain.usecase.GetBusinessInventoryTaxesUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.SyncTaxOptionsUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.ItemLibraryAnalytics> provider4) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoSizes = provider4;
    }

    public final com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel get(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode taxesPresentationMode) {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), taxesPresentationMode, this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get());
    }

    public static com.paypal.oslo.feature.businessinventory.ui.taxlist.C0322TaxListScreenViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.GetBusinessInventoryUpdatesUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.domain.usecase.GetBusinessInventoryTaxesUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.SyncTaxOptionsUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.ItemLibraryAnalytics> provider4) {
        return new com.paypal.oslo.feature.businessinventory.ui.taxlist.C0322TaxListScreenViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel newInstance(com.paypal.oslo.feature.businessinventory.domain.usecase.GetBusinessInventoryUpdatesUseCase getBusinessInventoryUpdatesUseCase, com.paypal.oslo.feature.businessinventory.api.domain.usecase.GetBusinessInventoryTaxesUseCase getBusinessInventoryTaxesUseCase, com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode taxesPresentationMode, com.paypal.oslo.feature.businessinventory.domain.usecase.SyncTaxOptionsUseCase syncTaxOptionsUseCase, com.paypal.oslo.feature.businessinventory.domain.ItemLibraryAnalytics itemLibraryAnalytics) {
        return new com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel(getBusinessInventoryUpdatesUseCase, getBusinessInventoryTaxesUseCase, taxesPresentationMode, syncTaxOptionsUseCase, itemLibraryAnalytics);
    }
}
