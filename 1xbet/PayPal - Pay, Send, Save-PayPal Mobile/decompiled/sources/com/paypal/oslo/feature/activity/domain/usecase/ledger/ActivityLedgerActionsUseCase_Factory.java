package com.paypal.oslo.feature.activity.domain.usecase.ledger;

/* loaded from: classes10.dex */
public final class ActivityLedgerActionsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerActionsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider> getHighSpeedVideoFpsRanges;

    private ActivityLedgerActionsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerActionsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerActionsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> provider2) {
        return new com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerActionsUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerActionsUseCase newInstance(com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider activityBaseActionsProvider, com.paypal.oslo.feature.activity.manager.ActivityFeatureManager activityFeatureManager) {
        return new com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerActionsUseCase(activityBaseActionsProvider, activityFeatureManager);
    }
}
