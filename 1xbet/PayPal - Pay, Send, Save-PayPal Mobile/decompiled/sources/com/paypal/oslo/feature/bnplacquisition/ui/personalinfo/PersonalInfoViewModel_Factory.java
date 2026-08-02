package com.paypal.oslo.feature.bnplacquisition.ui.personalinfo;

/* loaded from: classes11.dex */
public final class PersonalInfoViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetWalletFundingInstrumentsUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConfig> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.SaveAddressUsecase> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiMapper> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoReducer> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoAnalyticsHelper> getOutputMinFrameDuration;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.UpdateApplicationAndFetchReviewDetailsUseCase> getOutputMinFrameDurationlomOqCM;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.UpdateApplicationAndFetchOffersUseCase> getOutputSizeshNQ4ISI;

    private PersonalInfoViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.UpdateApplicationAndFetchOffersUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.UpdateApplicationAndFetchReviewDetailsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.SaveAddressUsecase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetWalletFundingInstrumentsUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> provider5, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoReducer> provider6, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter> provider7, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators> provider8, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter> provider9, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiMapper> provider10, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConfig> provider11, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoAnalyticsHelper> provider12) {
        this.getOutputSizeshNQ4ISI = provider;
        this.getOutputMinFrameDurationlomOqCM = provider2;
        this.getHighSpeedVideoSizesFor = provider3;
        this.getHighSpeedVideoFpsRangesFor = provider4;
        this.getInputSizeshNQ4ISI = provider5;
        this.getOutputFormats = provider6;
        this.Camera2StreamConfigurationMap = provider7;
        this.getHighSpeedVideoFpsRanges = provider8;
        this.getHighResolutionOutputSizeshNQ4ISI = provider9;
        this.getInputFormats = provider10;
        this.getHighSpeedVideoSizes = provider11;
        this.getOutputMinFrameDuration = provider12;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel get() {
        return newInstance(this.getOutputSizeshNQ4ISI.get(), this.getOutputMinFrameDurationlomOqCM.get(), this.getHighSpeedVideoSizesFor.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getInputSizeshNQ4ISI.get(), this.getOutputFormats.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getInputFormats.get(), this.getHighSpeedVideoSizes.get(), this.getOutputMinFrameDuration.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.UpdateApplicationAndFetchOffersUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.UpdateApplicationAndFetchReviewDetailsUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.SaveAddressUsecase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetWalletFundingInstrumentsUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> provider5, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoReducer> provider6, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter> provider7, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators> provider8, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter> provider9, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiMapper> provider10, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConfig> provider11, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoAnalyticsHelper> provider12) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10, provider11, provider12);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel newInstance(com.paypal.oslo.feature.bnplacquisition.domain.usecase.UpdateApplicationAndFetchOffersUseCase updateApplicationAndFetchOffersUseCase, com.paypal.oslo.feature.bnplacquisition.domain.usecase.UpdateApplicationAndFetchReviewDetailsUseCase updateApplicationAndFetchReviewDetailsUseCase, com.paypal.oslo.feature.bnplacquisition.domain.usecase.SaveAddressUsecase saveAddressUsecase, com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetWalletFundingInstrumentsUseCase getWalletFundingInstrumentsUseCase, com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoReducer personalInfoReducer, com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter bnplAcquisitionFormatter, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators formFieldValidators, com.paypal.oslo.feature.bnplacquisition.ui.common.util.AddressFormatter addressFormatter, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoUiMapper personalInfoUiMapper, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoConfig personalInfoConfig, com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoAnalyticsHelper personalInfoAnalyticsHelper) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.personalinfo.PersonalInfoViewModel(updateApplicationAndFetchOffersUseCase, updateApplicationAndFetchReviewDetailsUseCase, saveAddressUsecase, getWalletFundingInstrumentsUseCase, sessionStorage, personalInfoReducer, bnplAcquisitionFormatter, formFieldValidators, addressFormatter, personalInfoUiMapper, personalInfoConfig, personalInfoAnalyticsHelper);
    }
}
