package com.paypal.oslo.feature.activity.domain.usecase.ledger;

/* loaded from: classes10.dex */
public final class ActivityLedgerUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> getHighSpeedVideoSizes;

    private ActivityLedgerUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> provider2, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider3) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighResolutionOutputSizeshNQ4ISI = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoSizes.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> provider2, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration> provider3) {
        return new com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUseCase_Factory(provider, provider2, provider3);
    }

    public static com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUseCase newInstance(com.paypal.oslo.feature.activity.domain.repository.ledger.IActivityLedgerRepository iActivityLedgerRepository, com.paypal.oslo.feature.activity.manager.ActivityFeatureManager activityFeatureManager, com.paypal.oslo.core.remoteconfig.contract.DynamicConfiguration dynamicConfiguration) {
        return new com.paypal.oslo.feature.activity.domain.usecase.ledger.ActivityLedgerUseCase(iActivityLedgerRepository, activityFeatureManager, dynamicConfiguration);
    }
}
