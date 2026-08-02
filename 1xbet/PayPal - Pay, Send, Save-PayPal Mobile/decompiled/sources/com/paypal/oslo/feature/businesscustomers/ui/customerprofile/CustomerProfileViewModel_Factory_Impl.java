package com.paypal.oslo.feature.businesscustomers.ui.customerprofile;

/* loaded from: classes11.dex */
public final class CustomerProfileViewModel_Factory_Impl implements com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.Factory {
    private final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.C0316CustomerProfileViewModel_Factory getHighSpeedVideoFpsRangesFor;

    private CustomerProfileViewModel_Factory_Impl(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.C0316CustomerProfileViewModel_Factory c0316CustomerProfileViewModel_Factory) {
        this.getHighSpeedVideoFpsRangesFor = c0316CustomerProfileViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.Factory
    public final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel create(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode) {
        return this.getHighSpeedVideoFpsRangesFor.get(customer, customersPresentationMode);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.Factory> create(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.C0316CustomerProfileViewModel_Factory c0316CustomerProfileViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel_Factory_Impl(c0316CustomerProfileViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.C0316CustomerProfileViewModel_Factory c0316CustomerProfileViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel_Factory_Impl(c0316CustomerProfileViewModel_Factory));
    }
}
