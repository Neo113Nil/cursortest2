package com.paypal.oslo.feature.bnplservicing.common.utils;

/* loaded from: classes11.dex */
public final class BnplServFormatter_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatISODurationUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<android.content.Context> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> getHighSpeedVideoSizes;

    private BnplServFormatter_Factory(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatISODurationUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> provider4, dagger.internal.Provider<android.content.Context> provider5) {
        this.getHighSpeedVideoSizes = provider;
        this.Camera2StreamConfigurationMap = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
        this.getHighSpeedVideoFpsRanges = provider4;
        this.getHighSpeedVideoFpsRangesFor = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter_Factory create(dagger.internal.Provider<com.paypal.oslo.core.appidentity.domain.LocaleInformation> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatISODurationUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> provider4, dagger.internal.Provider<android.content.Context> provider5) {
        return new com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter newInstance(com.paypal.oslo.core.appidentity.domain.LocaleInformation localeInformation, com.paypal.oslo.core.i18n.domain.usecase.FormatCurrencyUseCase formatCurrencyUseCase, com.paypal.oslo.core.i18n.domain.usecase.FormatISODurationUseCase formatISODurationUseCase, com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase, android.content.Context context) {
        return new com.paypal.oslo.feature.bnplservicing.common.utils.BnplServFormatter(localeInformation, formatCurrencyUseCase, formatISODurationUseCase, dateTimeFormatUseCase, context);
    }
}
