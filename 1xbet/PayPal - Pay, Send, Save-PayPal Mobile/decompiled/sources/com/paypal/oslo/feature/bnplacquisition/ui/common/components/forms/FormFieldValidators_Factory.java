package com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms;

/* loaded from: classes11.dex */
public final class FormFieldValidators_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators> {
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DOBValidationUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.AddressValidationMapper> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.ValidateDocumentIdUseCase> getInputSizeshNQ4ISI;

    private FormFieldValidators_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.AddressValidationMapper> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DOBValidationUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.ValidateDocumentIdUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider6) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.getInputSizeshNQ4ISI = provider5;
        this.Camera2StreamConfigurationMap = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getInputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.AddressValidationMapper> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DOBValidationUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.ValidateDocumentIdUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider6) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators newInstance(com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter bnplAcquisitionFormatter, com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase validateAddressUseCase, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.AddressValidationMapper addressValidationMapper, com.paypal.oslo.core.i18n.domain.usecase.DOBValidationUseCase dOBValidationUseCase, com.paypal.oslo.core.i18n.domain.usecase.ValidateDocumentIdUseCase validateDocumentIdUseCase, com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators(bnplAcquisitionFormatter, validateAddressUseCase, addressValidationMapper, dOBValidationUseCase, validateDocumentIdUseCase, localeInformation);
    }
}
