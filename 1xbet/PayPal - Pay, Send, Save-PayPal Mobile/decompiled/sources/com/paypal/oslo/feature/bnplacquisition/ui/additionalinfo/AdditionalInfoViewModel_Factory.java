package com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo;

/* loaded from: classes11.dex */
public final class AdditionalInfoViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetReviewTermsUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoReducer> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiMapper> getHighSpeedVideoSizes;

    private AdditionalInfoViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetReviewTermsUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> provider5) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRanges = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoReducer> provider, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiMapper> provider2, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators> provider3, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetReviewTermsUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage> provider5) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel newInstance(com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoReducer additionalInfoReducer, com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoUiMapper additionalInfoUiMapper, com.paypal.oslo.feature.bnplacquisition.ui.common.components.forms.FormFieldValidators formFieldValidators, com.paypal.oslo.feature.bnplacquisition.domain.usecase.GetReviewTermsUseCase getReviewTermsUseCase, com.paypal.oslo.feature.bnplacquisition.ui.SessionStorage sessionStorage) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.additionalinfo.AdditionalInfoViewModel(additionalInfoReducer, additionalInfoUiMapper, formFieldValidators, getReviewTermsUseCase, sessionStorage);
    }
}
