package com.paypal.oslo.feature.userprofile.ui.viewmodel;

/* loaded from: classes15.dex */
public final class AddEditPhoneViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.AddPhoneUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.ReplacePhoneUseCase> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetRegionCodeForCallingCodeUseCase> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.ui.utils.PhoneErrorHandler> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase> getOutputMinFrameDuration;

    private AddEditPhoneViewModel_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider2, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.AddPhoneUseCase> provider7, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.ReplacePhoneUseCase> provider8, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetRegionCodeForCallingCodeUseCase> provider9, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.ui.utils.PhoneErrorHandler> provider10) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
        this.getInputFormats = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.getOutputMinFrameDuration = provider5;
        this.Camera2StreamConfigurationMap = provider6;
        this.getHighSpeedVideoSizes = provider7;
        this.getHighSpeedVideoSizesFor = provider8;
        this.getInputSizeshNQ4ISI = provider9;
        this.getOutputFormats = provider10;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getInputFormats.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getOutputMinFrameDuration.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoSizesFor.get(), this.getInputSizeshNQ4ISI.get(), this.getOutputFormats.get());
    }

    public static com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider2, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.AddPhoneUseCase> provider7, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.ReplacePhoneUseCase> provider8, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetRegionCodeForCallingCodeUseCase> provider9, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.ui.utils.PhoneErrorHandler> provider10) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel newInstance(android.content.Context context, com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration, com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase observeUserStoreUseCase, com.paypal.oslo.core.i18n.domain.usecase.GetCountriesListUseCase getCountriesListUseCase, com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase phoneNumberParseUseCase, com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase formatAsTypedUseCase, com.paypal.oslo.feature.userprofile.domain.usecase.AddPhoneUseCase addPhoneUseCase, com.paypal.oslo.feature.userprofile.domain.usecase.ReplacePhoneUseCase replacePhoneUseCase, com.paypal.oslo.core.i18n.domain.usecase.GetRegionCodeForCallingCodeUseCase getRegionCodeForCallingCodeUseCase, com.paypal.oslo.feature.userprofile.ui.utils.PhoneErrorHandler phoneErrorHandler) {
        return new com.paypal.oslo.feature.userprofile.ui.viewmodel.AddEditPhoneViewModel(context, dynamicConfiguration, observeUserStoreUseCase, getCountriesListUseCase, phoneNumberParseUseCase, formatAsTypedUseCase, addPhoneUseCase, replacePhoneUseCase, getRegionCodeForCallingCodeUseCase, phoneErrorHandler);
    }
}
