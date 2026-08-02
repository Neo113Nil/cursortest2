package com.paypal.oslo.core.i18n.domain.usecase;

/* loaded from: classes10.dex */
public final class DateMaskFormatToPartUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatToPartUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.DateTimeRepository> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatToPartsUseCase> getHighResolutionOutputSizeshNQ4ISI;

    private DateMaskFormatToPartUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatToPartsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.DateTimeRepository> provider2) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatToPartUseCase get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatToPartUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatToPartsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.repository.DateTimeRepository> provider2) {
        return new com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatToPartUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatToPartUseCase newInstance(com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatToPartsUseCase dateTimeFormatToPartsUseCase, com.paypal.oslo.core.i18n.domain.repository.DateTimeRepository dateTimeRepository) {
        return new com.paypal.oslo.core.i18n.domain.usecase.DateMaskFormatToPartUseCase(dateTimeFormatToPartsUseCase, dateTimeRepository);
    }
}
