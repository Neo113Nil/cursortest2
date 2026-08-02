package com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui;

/* loaded from: classes13.dex */
public final class PhoneStepViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel> {
    private final dagger.internal.Provider<kotlin.coroutines.CoroutineContext> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetRegionCodeForCallingCodeUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase> getInputFormats;

    private PhoneStepViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetRegionCodeForCallingCodeUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase> provider5, dagger.internal.Provider<kotlin.coroutines.CoroutineContext> provider6) {
        this.getInputFormats = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
        this.Camera2StreamConfigurationMap = provider6;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel get() {
        return newInstance(this.getInputFormats.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetRegionCodeForCallingCodeUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase> provider5, dagger.internal.Provider<kotlin.coroutines.CoroutineContext> provider6) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel_Factory(provider, provider2, provider3, provider4, provider5, provider6);
    }

    public static com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel newInstance(com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase phoneNumberParseUseCase, com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase formatAsTypedUseCase, com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider, com.paypal.oslo.core.i18n.domain.usecase.GetRegionCodeForCallingCodeUseCase getRegionCodeForCallingCodeUseCase, com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase getCallingCodeUseCase, kotlin.coroutines.CoroutineContext coroutineContext) {
        return new com.paypal.oslo.feature.oneonboarding.inventory.steps.phone.ui.PhoneStepViewModel(phoneNumberParseUseCase, formatAsTypedUseCase, localeProvider, getRegionCodeForCallingCodeUseCase, getCallingCodeUseCase, coroutineContext);
    }
}
