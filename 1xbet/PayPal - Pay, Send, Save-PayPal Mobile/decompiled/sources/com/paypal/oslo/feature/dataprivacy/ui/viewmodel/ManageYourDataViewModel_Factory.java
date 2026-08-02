package com.paypal.oslo.feature.dataprivacy.ui.viewmodel;

/* loaded from: classes12.dex */
public final class ManageYourDataViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ManageYourDataViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfiguration> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.usecase.GetErasureRequestsUseCase> getHighSpeedVideoFpsRanges;

    private ManageYourDataViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfiguration> provider, dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.usecase.GetErasureRequestsUseCase> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ManageYourDataViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ManageYourDataViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfiguration> provider, dagger.internal.Provider<com.paypal.oslo.feature.dataprivacy.domain.usecase.GetErasureRequestsUseCase> provider2) {
        return new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ManageYourDataViewModel_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ManageYourDataViewModel newInstance(com.paypal.oslo.feature.dataprivacy.config.DataPrivacyDynamicConfiguration dataPrivacyDynamicConfiguration, com.paypal.oslo.feature.dataprivacy.domain.usecase.GetErasureRequestsUseCase getErasureRequestsUseCase) {
        return new com.paypal.oslo.feature.dataprivacy.ui.viewmodel.ManageYourDataViewModel(dataPrivacyDynamicConfiguration, getErasureRequestsUseCase);
    }
}
