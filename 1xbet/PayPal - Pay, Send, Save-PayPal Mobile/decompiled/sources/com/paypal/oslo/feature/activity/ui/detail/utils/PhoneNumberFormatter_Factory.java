package com.paypal.oslo.feature.activity.ui.detail.utils;

/* loaded from: classes10.dex */
public final class PhoneNumberFormatter_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.ui.detail.utils.PhoneNumberFormatter> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatPhoneNumberUseCase> getHighSpeedVideoFpsRanges;

    private PhoneNumberFormatter_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatPhoneNumberUseCase> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.ui.detail.utils.PhoneNumberFormatter get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.activity.ui.detail.utils.PhoneNumberFormatter_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.FormatPhoneNumberUseCase> provider) {
        return new com.paypal.oslo.feature.activity.ui.detail.utils.PhoneNumberFormatter_Factory(provider);
    }

    public static com.paypal.oslo.feature.activity.ui.detail.utils.PhoneNumberFormatter newInstance(com.paypal.oslo.core.i18n.domain.usecase.FormatPhoneNumberUseCase formatPhoneNumberUseCase) {
        return new com.paypal.oslo.feature.activity.ui.detail.utils.PhoneNumberFormatter(formatPhoneNumberUseCase);
    }
}
