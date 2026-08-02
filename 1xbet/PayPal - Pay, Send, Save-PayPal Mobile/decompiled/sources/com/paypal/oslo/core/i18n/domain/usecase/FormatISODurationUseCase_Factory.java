package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class FormatISODurationUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.FormatISODurationUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.ISODurationParser> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatRelativeTimeUseCase> getHighSpeedVideoFpsRangesFor;

    private FormatISODurationUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.ISODurationParser> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatRelativeTimeUseCase> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.FormatISODurationUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.FormatISODurationUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.ISODurationParser> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatRelativeTimeUseCase> provider2) {
        return new com.paypal.oslo.core.i18n.domain.usecase.FormatISODurationUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.FormatISODurationUseCase newInstance(com.paypal.oslo.core.i18n.domain.util.ISODurationParser iSODurationParser, com.paypal.oslo.core.i18n.domain.usecase.FormatRelativeTimeUseCase formatRelativeTimeUseCase) {
        return new com.paypal.oslo.core.i18n.domain.usecase.FormatISODurationUseCase(iSODurationParser, formatRelativeTimeUseCase);
    }
}
