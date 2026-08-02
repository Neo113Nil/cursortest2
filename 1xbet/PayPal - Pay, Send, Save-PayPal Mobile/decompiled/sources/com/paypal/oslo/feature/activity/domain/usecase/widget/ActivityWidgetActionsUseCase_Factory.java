package com.paypal.oslo.feature.activity.domain.usecase.widget;

/* loaded from: classes10.dex */
public final class ActivityWidgetActionsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetActionsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> getHighSpeedVideoFpsRangesFor;

    private ActivityWidgetActionsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> provider2) {
        this.Camera2StreamConfigurationMap = provider;
        this.getHighSpeedVideoFpsRangesFor = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetActionsUseCase get() {
        return newInstance(this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRangesFor.get());
    }

    public static com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetActionsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> provider2) {
        return new com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetActionsUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetActionsUseCase newInstance(com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider activityBaseActionsProvider, com.paypal.oslo.feature.activity.manager.ActivityFeatureManager activityFeatureManager) {
        return new com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetActionsUseCase(activityBaseActionsProvider, activityFeatureManager);
    }
}
