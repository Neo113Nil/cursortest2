package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class FormatPhoneNumberUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.FormatPhoneNumberUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.MaskPhoneNumberUseCase> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.ValidatePhoneNumberUseCase> getHighSpeedVideoFpsRanges;

    private FormatPhoneNumberUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.ValidatePhoneNumberUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.MaskPhoneNumberUseCase> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.FormatPhoneNumberUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.FormatPhoneNumberUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.ValidatePhoneNumberUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.MaskPhoneNumberUseCase> provider2) {
        return new com.paypal.oslo.core.i18n.domain.usecase.FormatPhoneNumberUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.FormatPhoneNumberUseCase newInstance(com.paypal.oslo.core.i18n.domain.usecase.ValidatePhoneNumberUseCase validatePhoneNumberUseCase, com.paypal.oslo.core.i18n.domain.usecase.MaskPhoneNumberUseCase maskPhoneNumberUseCase) {
        return new com.paypal.oslo.core.i18n.domain.usecase.FormatPhoneNumberUseCase(validatePhoneNumberUseCase, maskPhoneNumberUseCase);
    }
}
