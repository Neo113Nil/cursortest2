package com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.date;

/* loaded from: classes14.dex */
public final class DateFormatterFacadeImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.date.DateFormatterFacadeImpl> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> Camera2StreamConfigurationMap;

    private DateFormatterFacadeImpl_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.date.DateFormatterFacadeImpl get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.date.DateFormatterFacadeImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> provider) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.date.DateFormatterFacadeImpl_Factory(provider);
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.date.DateFormatterFacadeImpl newInstance(com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase) {
        return new com.paypal.oslo.feature.revolvingcreditservicing.data.formatter.date.DateFormatterFacadeImpl(dateTimeFormatUseCase);
    }
}
