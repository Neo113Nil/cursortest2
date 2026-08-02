package com.paypal.oslo.feature.activity.domain.usecase.widgetFullScreen;

/* loaded from: classes10.dex */
public final class ActivityWidgetLandingActionsUseCase_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.domain.usecase.widgetFullScreen.ActivityWidgetLandingActionsUseCase> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider> getHighSpeedVideoFpsRanges;

    private ActivityWidgetLandingActionsUseCase_Factory(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> provider2) {
        this.getHighSpeedVideoFpsRanges = provider;
        this.getHighResolutionOutputSizeshNQ4ISI = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.domain.usecase.widgetFullScreen.ActivityWidgetLandingActionsUseCase get() {
        return newInstance(this.getHighSpeedVideoFpsRanges.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.activity.domain.usecase.widgetFullScreen.ActivityWidgetLandingActionsUseCase_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.manager.ActivityFeatureManager> provider2) {
        return new com.paypal.oslo.feature.activity.domain.usecase.widgetFullScreen.ActivityWidgetLandingActionsUseCase_Factory(provider, provider2);
    }

    public static com.paypal.oslo.feature.activity.domain.usecase.widgetFullScreen.ActivityWidgetLandingActionsUseCase newInstance(com.paypal.oslo.feature.activity.domain.common.provider.ActivityBaseActionsProvider activityBaseActionsProvider, com.paypal.oslo.feature.activity.manager.ActivityFeatureManager activityFeatureManager) {
        return new com.paypal.oslo.feature.activity.domain.usecase.widgetFullScreen.ActivityWidgetLandingActionsUseCase(activityBaseActionsProvider, activityFeatureManager);
    }
}
