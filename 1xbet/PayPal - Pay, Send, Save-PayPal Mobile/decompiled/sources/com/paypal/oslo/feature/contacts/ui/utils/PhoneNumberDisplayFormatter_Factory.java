package com.paypal.oslo.feature.contacts.ui.utils;

/* loaded from: classes12.dex */
public final class PhoneNumberDisplayFormatter_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetRegionCodeForCallingCodeUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatPhoneNumberUseCase> getHighSpeedVideoSizes;

    private PhoneNumberDisplayFormatter_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatPhoneNumberUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetRegionCodeForCallingCodeUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> provider5) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.Camera2StreamConfigurationMap = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatPhoneNumberUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetRegionCodeForCallingCodeUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider> provider5) {
        return new com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter newInstance(com.paypal.oslo.core.i18n.domain.usecase.PhoneNumberParseUseCase phoneNumberParseUseCase, com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase getCallingCodeUseCase, com.paypal.oslo.core.i18n.domain.usecase.FormatPhoneNumberUseCase formatPhoneNumberUseCase, com.paypal.oslo.core.i18n.domain.usecase.GetRegionCodeForCallingCodeUseCase getRegionCodeForCallingCodeUseCase, com.paypal.oslo.core.i18n.domain.interfaces.LocaleProvider localeProvider) {
        return new com.paypal.oslo.feature.contacts.ui.utils.PhoneNumberDisplayFormatter(phoneNumberParseUseCase, getCallingCodeUseCase, formatPhoneNumberUseCase, getRegionCodeForCallingCodeUseCase, localeProvider);
    }
}
