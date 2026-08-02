package com.paypal.oslo.feature.businesscustomers.ui.customerprofile;

/* renamed from: com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C0316CustomerProfileViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.GetCustomersUpdatesUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.RemoveCustomerUseCase> getHighSpeedVideoSizes;

    private C0316CustomerProfileViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.RemoveCustomerUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.GetCustomersUpdatesUseCase> provider3) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    public final com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel get(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode) {
        return newInstance(customer, customersPresentationMode, this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.businesscustomers.ui.customerprofile.C0316CustomerProfileViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.RemoveCustomerUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.GetCustomersUpdatesUseCase> provider3) {
        return new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.C0316CustomerProfileViewModel_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel newInstance(com.paypal.oslo.feature.businesscustomers.api.domain.model.Customer customer, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode, com.paypal.oslo.feature.businesscustomers.domain.usecase.RemoveCustomerUseCase removeCustomerUseCase, com.paypal.oslo.core.i18n.domain.usecase.FormatAddressUseCase formatAddressUseCase, com.paypal.oslo.feature.businesscustomers.domain.usecase.GetCustomersUpdatesUseCase getCustomersUpdatesUseCase) {
        return new com.paypal.oslo.feature.businesscustomers.ui.customerprofile.CustomerProfileViewModel(customer, customersPresentationMode, removeCustomerUseCase, formatAddressUseCase, getCustomersUpdatesUseCase);
    }
}
