package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class DateMaskFormatUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatToPartsUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.DateTimeRepository> getHighSpeedVideoFpsRanges;

    private DateMaskFormatUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatToPartsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.DateTimeRepository> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatToPartsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.DateTimeRepository> provider2) {
        return new com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatUseCase newInstance(com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatToPartsUseCase dateTimeFormatToPartsUseCase, com.paypal.oslo.core.i18n.domain.repository.DateTimeRepository dateTimeRepository) {
        return new com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatUseCase(dateTimeFormatToPartsUseCase, dateTimeRepository);
    }
}
