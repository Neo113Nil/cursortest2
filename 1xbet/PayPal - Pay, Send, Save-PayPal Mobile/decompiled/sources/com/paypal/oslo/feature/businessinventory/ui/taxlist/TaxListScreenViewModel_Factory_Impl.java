package com.paypal.oslo.feature.businessinventory.ui.taxlist;

/* loaded from: classes11.dex */
public final class TaxListScreenViewModel_Factory_Impl implements com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel.Factory {
    private final com.paypal.oslo.feature.businessinventory.ui.taxlist.C0322TaxListScreenViewModel_Factory getHighSpeedVideoFpsRangesFor;

    private TaxListScreenViewModel_Factory_Impl(com.paypal.oslo.feature.businessinventory.ui.taxlist.C0322TaxListScreenViewModel_Factory c0322TaxListScreenViewModel_Factory) {
        this.getHighSpeedVideoFpsRangesFor = c0322TaxListScreenViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel.Factory
    public final com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel create(com.paypal.oslo.feature.businessinventory.navigation.TaxesPresentationMode taxesPresentationMode) {
        return this.getHighSpeedVideoFpsRangesFor.get(taxesPresentationMode);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel.Factory> create(com.paypal.oslo.feature.businessinventory.ui.taxlist.C0322TaxListScreenViewModel_Factory c0322TaxListScreenViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel_Factory_Impl(c0322TaxListScreenViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.businessinventory.ui.taxlist.C0322TaxListScreenViewModel_Factory c0322TaxListScreenViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businessinventory.ui.taxlist.TaxListScreenViewModel_Factory_Impl(c0322TaxListScreenViewModel_Factory));
    }
}
