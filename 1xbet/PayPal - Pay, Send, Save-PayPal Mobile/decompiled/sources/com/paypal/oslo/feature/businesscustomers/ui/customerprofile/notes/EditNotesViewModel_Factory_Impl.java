package com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes;

/* loaded from: classes11.dex */
public final class EditNotesViewModel_Factory_Impl implements com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel.Factory {
    private final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.C0317EditNotesViewModel_Factory getHighSpeedVideoSizes;

    private EditNotesViewModel_Factory_Impl(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.C0317EditNotesViewModel_Factory c0317EditNotesViewModel_Factory) {
        this.getHighSpeedVideoSizes = c0317EditNotesViewModel_Factory;
    }

    @Override // com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel.Factory
    public final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel create(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode) {
        return this.getHighSpeedVideoSizes.get(customer, customersPresentationMode);
    }

    public static javax.inject.Provider<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel.Factory> create(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.C0317EditNotesViewModel_Factory c0317EditNotesViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel_Factory_Impl(c0317EditNotesViewModel_Factory));
    }

    public static dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel.Factory> createFactoryProvider(com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.C0317EditNotesViewModel_Factory c0317EditNotesViewModel_Factory) {
        return dagger.internal.InstanceFactory.create(new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel_Factory_Impl(c0317EditNotesViewModel_Factory));
    }
}
