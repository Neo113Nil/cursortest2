package com.paypal.oslo.feature.businesscustomers.ui.customerform;

/* renamed from: com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel_Factory, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C0315CustomerFormViewModel_Factory {
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.GetUserCountryCodeUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.CreateCustomerUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.UpdateCustomerUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase> getHighSpeedVideoSizes;

    private C0315CustomerFormViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.CreateCustomerUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.UpdateCustomerUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.GetUserCountryCodeUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase> provider5) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.Camera2StreamConfigurationMap = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.getHighSpeedVideoSizes = provider5;
    }

    public final com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel get(com.paypal.oslo.feature.businesscustomers.ui.customerform.FlowType flowType, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode) {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), flowType, customersPresentationMode);
    }

    public static com.paypal.oslo.feature.businesscustomers.ui.customerform.C0315CustomerFormViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.CreateCustomerUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.UpdateCustomerUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.businesscustomers.domain.usecase.GetUserCountryCodeUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase> provider5) {
        return new com.paypal.oslo.feature.businesscustomers.ui.customerform.C0315CustomerFormViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel newInstance(com.paypal.oslo.feature.businesscustomers.domain.usecase.CreateCustomerUseCase createCustomerUseCase, com.paypal.oslo.feature.businesscustomers.domain.usecase.UpdateCustomerUseCase updateCustomerUseCase, com.paypal.oslo.feature.businesscustomers.domain.usecase.GetUserCountryCodeUseCase getUserCountryCodeUseCase, com.paypal.oslo.core.i18n.domain.usecase.GetAddressLayoutUseCase getAddressLayoutUseCase, com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase getCountriesListUseCase, com.paypal.oslo.feature.businesscustomers.ui.customerform.FlowType flowType, com.paypal.oslo.feature.businesscustomers.navigation.CustomersPresentationMode customersPresentationMode) {
        return new com.paypal.oslo.feature.businesscustomers.ui.customerform.CustomerFormViewModel(createCustomerUseCase, updateCustomerUseCase, getUserCountryCodeUseCase, getAddressLayoutUseCase, getCountriesListUseCase, flowType, customersPresentationMode);
    }
}
