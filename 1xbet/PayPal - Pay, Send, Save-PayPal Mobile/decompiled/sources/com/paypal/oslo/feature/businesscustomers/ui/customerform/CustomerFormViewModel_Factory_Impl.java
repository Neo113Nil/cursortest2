package com.paypal.oslo.feature.businesscustomers.ui.customerform;

/* loaded from: classes11.dex */
public final class CustomerFormViewModel_Factory_Impl implements com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.Factory {
    private final com.paypal.oslo.feature.businesscustomers.ui.customerform.C0315CustomerFormViewModel_Factory getHighResolutionOutputSizeshNQ4ISI;

    private CustomerFormViewModel_Factory_Impl(com.paypal.oslo.feature.businesscustomers.ui.customerform.C0315CustomerFormViewModel_Factory c0315CustomerFormViewModel_Factory) {
        this.getHighResolutionOutputSizeshNQ4ISI = c0315CustomerFormViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.Factory
    public final com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel create(com.paypal.oslo.feature.businesscustomers.ui.customerform.FlowType flowType, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode) {
        return this.getHighResolutionOutputSizeshNQ4ISI.get(flowType, customersPresentationMode);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.Factory> create(com.paypal.oslo.feature.businesscustomers.ui.customerform.C0315CustomerFormViewModel_Factory c0315CustomerFormViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel_Factory_Impl(c0315CustomerFormViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.businesscustomers.ui.customerform.C0315CustomerFormViewModel_Factory c0315CustomerFormViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel_Factory_Impl(c0315CustomerFormViewModel_Factory));
    }
}
