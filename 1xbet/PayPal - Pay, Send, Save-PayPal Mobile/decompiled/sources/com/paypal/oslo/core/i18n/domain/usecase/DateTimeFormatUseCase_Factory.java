package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class DateTimeFormatUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.DateTimeFormatterHelper> getHighSpeedVideoFpsRangesFor;

    private DateTimeFormatUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.DateTimeFormatterHelper> provider) {
        this.getHighSpeedVideoFpsRangesFor = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.util.DateTimeFormatterHelper> provider) {
        return new com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase_Factory(provider);
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase newInstance(com.paypal.oslo.core.i18n.domain.util.DateTimeFormatterHelper dateTimeFormatterHelper) {
        return new com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase(dateTimeFormatterHelper);
    }
}
