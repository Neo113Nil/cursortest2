package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class DateTimeFormatToPartsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatToPartsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.DateTimeFormatterHelper> getHighSpeedVideoFpsRangesFor;

    private DateTimeFormatToPartsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.DateTimeFormatterHelper> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatToPartsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatToPartsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.DateTimeFormatterHelper> provider) {
        return new com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatToPartsUseCase_Factory(provider);
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatToPartsUseCase newInstance(com.paypal.oslo.core.i18n.domain.util.DateTimeFormatterHelper dateTimeFormatterHelper) {
        return new com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatToPartsUseCase(dateTimeFormatterHelper);
    }
}
