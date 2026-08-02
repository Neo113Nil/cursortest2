package com.paypal.oslo.feature.activity.domain.usecase.widgetFullScreen;

/* loaded from: classes10.dex */
public final class ActivityWidgetFullScreenUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.domain.usecase.widgetFullScreen.ActivityWidgetFullScreenUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository> getHighSpeedVideoFpsRanges;

    private ActivityWidgetFullScreenUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.domain.usecase.widgetFullScreen.ActivityWidgetFullScreenUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.activity.domain.usecase.widgetFullScreen.ActivityWidgetFullScreenUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository> provider) {
        return new com.paypal.oslo.feature.activity.domain.usecase.widgetFullScreen.ActivityWidgetFullScreenUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.activity.domain.usecase.widgetFullScreen.ActivityWidgetFullScreenUseCase newInstance(com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository iActivityLedgerRepository) {
        return new com.paypal.oslo.feature.activity.domain.usecase.widgetFullScreen.ActivityWidgetFullScreenUseCase(iActivityLedgerRepository);
    }
}
