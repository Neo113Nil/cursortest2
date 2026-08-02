package com.paypal.oslo.feature.businessinventory.ui.edititem;

/* renamed from: com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C0320BusinessInventoryEditViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.domain.usecase.GetBusinessInventoryItemsListUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.AddItemUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.domain.usecase.GetBusinessInventoryTaxesUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.GetCurrencyUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.DeleteItemUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.SyncTaxOptionsUseCase> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.validator.ItemLibraryEntityValidator> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.SaveItemUseCase> getOutputFormats;

    private C0320BusinessInventoryEditViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.domain.usecase.GetBusinessInventoryItemsListUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.validator.ItemLibraryEntityValidator> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.AddItemUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.SaveItemUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.DeleteItemUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.domain.usecase.GetBusinessInventoryTaxesUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.SyncTaxOptionsUseCase> provider7, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.GetCurrencyUseCase> provider8) {
        this.Camera2StreamConfigurationMap = provider;
        this.getInputSizeshNQ4ISI = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getOutputFormats = provider4;
        this.getHighSpeedVideoSizes = provider5;
        this.getHighSpeedVideoFpsRanges = provider6;
        this.getHighSpeedVideoSizesFor = provider7;
        this.getHighSpeedVideoFpsRangesFor = provider8;
    }

    public final com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel get(com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType flowType) {
        return newInstance(flowType, this.Camera2StreamConfigurationMap.get(), this.getInputSizeshNQ4ISI.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getOutputFormats.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.businessinventory.ui.edititem.C0320BusinessInventoryEditViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.domain.usecase.GetBusinessInventoryItemsListUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.validator.ItemLibraryEntityValidator> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.AddItemUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.SaveItemUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.DeleteItemUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.api.domain.usecase.GetBusinessInventoryTaxesUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.SyncTaxOptionsUseCase> provider7, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.GetCurrencyUseCase> provider8) {
        return new com.paypal.oslo.feature.businessinventory.ui.edititem.C0320BusinessInventoryEditViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel newInstance(com.paypal.oslo.feature.businessinventory.ui.edititem.FlowType flowType, com.paypal.oslo.feature.businessinventory.api.domain.usecase.GetBusinessInventoryItemsListUseCase getBusinessInventoryItemsListUseCase, com.paypal.oslo.feature.businessinventory.domain.validator.ItemLibraryEntityValidator itemLibraryEntityValidator, com.paypal.oslo.feature.businessinventory.domain.usecase.AddItemUseCase addItemUseCase, com.paypal.oslo.feature.businessinventory.domain.usecase.SaveItemUseCase saveItemUseCase, com.paypal.oslo.feature.businessinventory.domain.usecase.DeleteItemUseCase deleteItemUseCase, com.paypal.oslo.feature.businessinventory.api.domain.usecase.GetBusinessInventoryTaxesUseCase getBusinessInventoryTaxesUseCase, com.paypal.oslo.feature.businessinventory.domain.usecase.SyncTaxOptionsUseCase syncTaxOptionsUseCase, com.paypal.oslo.feature.businessinventory.domain.usecase.GetCurrencyUseCase getCurrencyUseCase) {
        return new com.paypal.oslo.feature.businessinventory.ui.edititem.BusinessInventoryEditViewModel(flowType, getBusinessInventoryItemsListUseCase, itemLibraryEntityValidator, addItemUseCase, saveItemUseCase, deleteItemUseCase, getBusinessInventoryTaxesUseCase, syncTaxOptionsUseCase, getCurrencyUseCase);
    }
}
