package com.paypal.oslo.feature.businessinventory.ui.taxedit;

/* loaded from: classes11.dex */
public final class EditTaxViewModel_Factory_Impl implements com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.Factory {
    private final com.paypal.oslo.feature.businessinventory.ui.taxedit.C0321EditTaxViewModel_Factory getHighSpeedVideoSizes;

    private EditTaxViewModel_Factory_Impl(com.paypal.oslo.feature.businessinventory.ui.taxedit.C0321EditTaxViewModel_Factory c0321EditTaxViewModel_Factory) {
        this.getHighSpeedVideoSizes = c0321EditTaxViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.Factory
    public final com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel create(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode taxesPresentationMode, com.paypal.oslo.feature.businessinventory.api.domain.model.TaxOption taxOption) {
        return this.getHighSpeedVideoSizes.get(taxesPresentationMode, taxOption);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.Factory> create(com.paypal.oslo.feature.businessinventory.ui.taxedit.C0321EditTaxViewModel_Factory c0321EditTaxViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel_Factory_Impl(c0321EditTaxViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.businessinventory.ui.taxedit.C0321EditTaxViewModel_Factory c0321EditTaxViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businessinventory.ui.taxedit.EditTaxViewModel_Factory_Impl(c0321EditTaxViewModel_Factory));
    }
}
