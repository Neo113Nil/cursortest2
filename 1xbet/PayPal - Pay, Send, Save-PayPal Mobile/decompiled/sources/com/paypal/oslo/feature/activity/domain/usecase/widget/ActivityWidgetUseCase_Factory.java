package com.paypal.oslo.feature.activity.domain.usecase.widget;

/* loaded from: classes10.dex */
public final class ActivityWidgetUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository> getHighSpeedVideoFpsRanges;

    private ActivityWidgetUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository> provider) {
        this.getHighSpeedVideoFpsRanges = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository> provider) {
        return new com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetUseCase_Factory(provider);
    }

    public static com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetUseCase newInstance(com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository iActivityLedgerRepository) {
        return new com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetUseCase(iActivityLedgerRepository);
    }
}
