package com.paypal.oslo.feature.businessinventory.ui.taxedit;

/* renamed from: com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C0321EditTaxViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.DeleteTaxUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.AddTaxUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<androidx.view.SavedStateHandle> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidator> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.UpdateTaxUseCase> getHighSpeedVideoSizes;

    private C0321EditTaxViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidator> provider, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.AddTaxUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.UpdateTaxUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.DeleteTaxUseCase> provider4, dagger.internal.Provider<androidx.view.SavedStateHandle> provider5) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
    }

    public final com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel get(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode taxesPresentationMode, com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption) {
        return newInstance(taxesPresentationMode, taxOption, this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.businessinventory.ui.taxedit.C0321EditTaxViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidator> provider, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.AddTaxUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.UpdateTaxUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.domain.usecase.DeleteTaxUseCase> provider4, dagger.internal.Provider<androidx.view.SavedStateHandle> provider5) {
        return new com.paypal.oslo.feature.businessinventory.ui.taxedit.C0321EditTaxViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel newInstance(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode taxesPresentationMode, com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption, com.paypal.oslo.feature.businessinventory.domain.validator.TaxEntityValidator taxEntityValidator, com.paypal.oslo.feature.businessinventory.domain.usecase.AddTaxUseCase addTaxUseCase, com.paypal.oslo.feature.businessinventory.domain.usecase.UpdateTaxUseCase updateTaxUseCase, com.paypal.oslo.feature.businessinventory.domain.usecase.DeleteTaxUseCase deleteTaxUseCase, androidx.view.SavedStateHandle savedStateHandle) {
        return new com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel(taxesPresentationMode, taxOption, taxEntityValidator, addTaxUseCase, updateTaxUseCase, deleteTaxUseCase, savedStateHandle);
    }
}
