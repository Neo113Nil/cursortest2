package com.paypal.oslo.feature.debitcard.shared.util;

/* loaded from: classes12.dex */
public final class DebitCardDateFormatter_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.debitcard.shared.util.DebitCardDateFormatter> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> Camera2StreamConfigurationMap;

    private DebitCardDateFormatter_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.debitcard.shared.util.DebitCardDateFormatter get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.debitcard.shared.util.DebitCardDateFormatter_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> provider) {
        return new com.paypal.oslo.feature.debitcard.shared.util.DebitCardDateFormatter_Factory(provider);
    }

    public static com.paypal.oslo.feature.debitcard.shared.util.DebitCardDateFormatter newInstance(com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase) {
        return new com.paypal.oslo.feature.debitcard.shared.util.DebitCardDateFormatter(dateTimeFormatUseCase);
    }
}
