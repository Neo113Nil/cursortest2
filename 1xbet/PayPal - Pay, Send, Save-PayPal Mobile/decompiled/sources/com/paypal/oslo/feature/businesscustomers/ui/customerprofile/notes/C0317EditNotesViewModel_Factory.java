package com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes;

/* renamed from: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C0317EditNotesViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.UpdateCustomerUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private C0317EditNotesViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.UpdateCustomerUseCase> provider) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
    }

    public final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel get(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode) {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), customer, customersPresentationMode);
    }

    public static com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.C0317EditNotesViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.UpdateCustomerUseCase> provider) {
        return new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.C0317EditNotesViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel newInstance(com.paypal.oslo.feature.businesscustomers.domain.usecase.UpdateCustomerUseCase updateCustomerUseCase, com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode) {
        return new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.notes.EditNotesViewModel(updateCustomerUseCase, customer, customersPresentationMode);
    }
}
