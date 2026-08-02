package com.paypal.oslo.feature.activity.domain.usecase.detail;

/* loaded from: classes10.dex */
public final class ActivityDetailActionsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailActionsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider> getHighSpeedVideoFpsRangesFor;

    private ActivityDetailActionsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> provider2) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.Camera2StreamConfigurationMap = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailActionsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailActionsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> provider2) {
        return new com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailActionsUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailActionsUseCase newInstance(com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider activityBaseActionsProvider, com.paypal.oslo.feature.activity.manager.ActivityFeatureManager activityFeatureManager) {
        return new com.paypal.oslo.feature.activity.domain.usecase.detail.ActivityDetailActionsUseCase(activityBaseActionsProvider, activityFeatureManager);
    }
}
