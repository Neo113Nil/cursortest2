package com.paypal.oslo.feature.businesscustomers.ui.emailmodal;

/* loaded from: classes11.dex */
public final class AddEmailViewModel_Factory_Impl implements com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel.Factory {
    private final com.paypal.oslo.feature.businesscustomers.ui.emailmodal.C0319AddEmailViewModel_Factory getHighSpeedVideoSizes;

    private AddEmailViewModel_Factory_Impl(com.paypal.oslo.feature.businesscustomers.ui.emailmodal.C0319AddEmailViewModel_Factory c0319AddEmailViewModel_Factory) {
        this.getHighSpeedVideoSizes = c0319AddEmailViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel.Factory
    public final com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel create(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode) {
        return this.getHighSpeedVideoSizes.get(customer, customersPresentationMode);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel.Factory> create(com.paypal.oslo.feature.businesscustomers.ui.emailmodal.C0319AddEmailViewModel_Factory c0319AddEmailViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel_Factory_Impl(c0319AddEmailViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.businesscustomers.ui.emailmodal.C0319AddEmailViewModel_Factory c0319AddEmailViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel_Factory_Impl(c0319AddEmailViewModel_Factory));
    }
}
