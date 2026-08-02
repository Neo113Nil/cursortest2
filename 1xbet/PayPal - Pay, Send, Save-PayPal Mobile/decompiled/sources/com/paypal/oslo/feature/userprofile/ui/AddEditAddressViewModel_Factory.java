package com.paypal.oslo.feature.userprofile.ui;

/* loaded from: classes15.dex */
public final class AddEditAddressViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.userprofile.ui.AddEditAddressViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.ui.utils.AddressErrorHandler> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.ui.utils.AddressBuilder> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.AddAddressUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressLayoutUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.feature.userprofile.ui.utils.ValidationErrorMapper> getOutputMinFrameDuration;

    private AddEditAddressViewModel_Factory(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressLayoutUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.ui.utils.ValidationErrorMapper> provider5, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.ui.utils.AddressBuilder> provider6, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.AddAddressUseCase> provider7, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.ui.utils.AddressErrorHandler> provider8) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getOutputFormats = provider3;
        this.getInputFormats = provider4;
        this.getOutputMinFrameDuration = provider5;
        this.getHighResolutionOutputSizeshNQ4ISI = provider6;
        this.getHighSpeedVideoFpsRanges = provider7;
        this.Camera2StreamConfigurationMap = provider8;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.userprofile.ui.AddEditAddressViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoSizes.get(), this.getOutputFormats.get(), this.getInputFormats.get(), this.getOutputMinFrameDuration.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.userprofile.ui.AddEditAddressViewModel_Factory create(dagger.internal.Provider<android.content.Context> provider, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressLayoutUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.ui.utils.ValidationErrorMapper> provider5, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.ui.utils.AddressBuilder> provider6, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.domain.usecase.AddAddressUseCase> provider7, dagger.internal.Provider<com.paypal.oslo.feature.userprofile.ui.utils.AddressErrorHandler> provider8) {
        return new com.paypal.oslo.feature.userprofile.ui.AddEditAddressViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8);
    }

    public static com.paypal.oslo.feature.userprofile.ui.AddEditAddressViewModel newInstance(android.content.Context context, com.paypal.oslo.feature.userprofile.domain.usecase.GetAddressLayoutUseCase getAddressLayoutUseCase, com.paypal.oslo.feature.userprofile.domain.usecase.ObserveUserStoreUseCase observeUserStoreUseCase, com.paypal.oslo.core.i18n.domain.usecase.ValidateAddressUseCase validateAddressUseCase, com.paypal.oslo.feature.userprofile.ui.utils.ValidationErrorMapper validationErrorMapper, com.paypal.oslo.feature.userprofile.ui.utils.AddressBuilder addressBuilder, com.paypal.oslo.feature.userprofile.domain.usecase.AddAddressUseCase addAddressUseCase, com.paypal.oslo.feature.userprofile.ui.utils.AddressErrorHandler addressErrorHandler) {
        return new com.paypal.oslo.feature.userprofile.ui.AddEditAddressViewModel(context, getAddressLayoutUseCase, observeUserStoreUseCase, validateAddressUseCase, validationErrorMapper, addressBuilder, addAddressUseCase, addressErrorHandler);
    }
}
