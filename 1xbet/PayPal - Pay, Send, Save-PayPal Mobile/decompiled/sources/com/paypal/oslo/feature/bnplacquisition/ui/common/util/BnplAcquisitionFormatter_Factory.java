package com.paypal.oslo.feature.bnplacquisition.ui.common.util;

/* loaded from: classes11.dex */
public final class BnplAcquisitionFormatter_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatToPartUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> getHighSpeedVideoSizes;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatISODurationUseCase> getHighSpeedVideoSizesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatPhoneNumberUseCase> getInputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase> getInputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase> getOutputFormats;
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> getOutputMinFrameDuration;

    private BnplAcquisitionFormatter_Factory(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatToPartUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatPhoneNumberUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatISODurationUseCase> provider7, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase> provider8, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase> provider9, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase> provider10) {
        this.getOutputMinFrameDuration = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
        this.getInputFormats = provider6;
        this.getHighSpeedVideoSizesFor = provider7;
        this.getOutputFormats = provider8;
        this.getInputSizeshNQ4ISI = provider9;
        this.getHighResolutionOutputSizeshNQ4ISI = provider10;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter get() {
        return newInstance(this.getOutputMinFrameDuration.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getInputFormats.get(), this.getHighSpeedVideoSizesFor.get(), this.getOutputFormats.get(), this.getInputSizeshNQ4ISI.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter_Factory create(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatToPartUseCase> provider5, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatPhoneNumberUseCase> provider6, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatISODurationUseCase> provider7, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase> provider8, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase> provider9, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase> provider10) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter_Factory(provider, provider2, provider3, provider4, provider5, provider6, provider7, provider8, provider9, provider10);
    }

    public static com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter newInstance(com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase, com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatUseCase dateMaskFormatUseCase, com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatToPartUseCase dateMaskFormatToPartUseCase, com.paypal.oslo.core.i18n.domain.usecase.FormatPhoneNumberUseCase formatPhoneNumberUseCase, com.paypal.oslo.core.i18n.domain.usecase.FormatISODurationUseCase formatISODurationUseCase, com.paypal.oslo.core.i18n.domain.usecase.GetCallingCodeUseCase getCallingCodeUseCase, com.paypal.oslo.core.i18n.domain.usecase.NameFormatUseCase nameFormatUseCase, com.paypal.oslo.core.i18n.domain.usecase.FormatAsTypedUseCase formatAsTypedUseCase) {
        return new com.paypal.oslo.feature.bnplacquisition.ui.common.util.BnplAcquisitionFormatter(localeInformation, formatCurrencyUseCase, dateTimeFormatUseCase, dateMaskFormatUseCase, dateMaskFormatToPartUseCase, formatPhoneNumberUseCase, formatISODurationUseCase, getCallingCodeUseCase, nameFormatUseCase, formatAsTypedUseCase);
    }
}
