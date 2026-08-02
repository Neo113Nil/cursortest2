package com.paypal.oslo.feature.businesscustomers.ui.emailmodal;

/* renamed from: com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C0319AddEmailViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.UpdateCustomerUseCase> Camera2StreamConfigurationMap;

    private C0319AddEmailViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.UpdateCustomerUseCase> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    public final com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel get(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode) {
        return newInstance(customer, customersPresentationMode, this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.businesscustomers.ui.emailmodal.C0319AddEmailViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.UpdateCustomerUseCase> provider) {
        return new com.paypal.oslo.feature.businesscustomers.ui.emailmodal.C0319AddEmailViewModel_Factory(provider);
    }

    public static com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel newInstance(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode, com.paypal.oslo.feature.businesscustomers.domain.usecase.UpdateCustomerUseCase updateCustomerUseCase) {
        return new com.paypal.oslo.feature.businesscustomers.ui.emailmodal.AddEmailViewModel(customer, customersPresentationMode, updateCustomerUseCase);
    }
}
