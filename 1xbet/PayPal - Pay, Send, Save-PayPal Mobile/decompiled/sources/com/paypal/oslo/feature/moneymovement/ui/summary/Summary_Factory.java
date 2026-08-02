package com.paypal.oslo.feature.moneymovement.ui.summary;

/* loaded from: classes13.dex */
public final class Summary_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.moneymovement.ui.summary.Summary> {
    private final dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> Camera2StreamConfigurationMap;

    private Summary_Factory(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> provider) {
        this.Camera2StreamConfigurationMap = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.moneymovement.ui.summary.Summary get() {
        return newInstance(this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.moneymovement.ui.summary.Summary_Factory create(dagger.internal.Provider<com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase> provider) {
        return new com.paypal.oslo.feature.moneymovement.ui.summary.Summary_Factory(provider);
    }

    public static com.paypal.oslo.feature.moneymovement.ui.summary.Summary newInstance(com.paypal.oslo.core.i18n.domain.usecase.DateTimeFormatUseCase dateTimeFormatUseCase) {
        return new com.paypal.oslo.feature.moneymovement.ui.summary.Summary(dateTimeFormatUseCase);
    }
}
