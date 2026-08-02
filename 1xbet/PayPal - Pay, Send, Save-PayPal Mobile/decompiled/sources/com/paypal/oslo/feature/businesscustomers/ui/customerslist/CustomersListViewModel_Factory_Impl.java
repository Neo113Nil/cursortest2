package com.paypal.oslo.feature.businesscustomers.ui.customerslist;

/* loaded from: classes11.dex */
public final class CustomersListViewModel_Factory_Impl implements com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.Factory {
    private final com.paypal.oslo.feature.businesscustomers.ui.customerslist.C0318CustomersListViewModel_Factory getHighSpeedVideoFpsRanges;

    private CustomersListViewModel_Factory_Impl(com.paypal.oslo.feature.businesscustomers.ui.customerslist.C0318CustomersListViewModel_Factory c0318CustomersListViewModel_Factory) {
        this.getHighSpeedVideoFpsRanges = c0318CustomersListViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.Factory
    public final com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel create(com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode) {
        return this.getHighSpeedVideoFpsRanges.get(customersPresentationMode);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.Factory> create(com.paypal.oslo.feature.businesscustomers.ui.customerslist.C0318CustomersListViewModel_Factory c0318CustomersListViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel_Factory_Impl(c0318CustomersListViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.businesscustomers.ui.customerslist.C0318CustomersListViewModel_Factory c0318CustomersListViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesscustomers.ui.customerslist.CustomersListViewModel_Factory_Impl(c0318CustomersListViewModel_Factory));
    }
}
