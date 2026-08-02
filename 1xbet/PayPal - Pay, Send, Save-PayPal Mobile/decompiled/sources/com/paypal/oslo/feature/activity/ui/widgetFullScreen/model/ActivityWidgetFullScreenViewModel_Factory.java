package com.paypal.oslo.feature.activity.ui.widgetFullScreen.model;

/* loaded from: classes10.dex */
public final class ActivityWidgetFullScreenViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.widgetFullScreen.ActivityWidgetLandingActionsUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.widgetFullScreen.ActivityWidgetFullScreenUseCase> getHighSpeedVideoSizes;

    private ActivityWidgetFullScreenViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.widgetFullScreen.ActivityWidgetFullScreenUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.widgetFullScreen.ActivityWidgetLandingActionsUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> provider5) {
        this.getHighResolutionOutputSizeshNQ4ISI = provider;
        this.getHighSpeedVideoSizes = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighSpeedVideoFpsRanges = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel get() {
        return newInstance(this.getHighResolutionOutputSizeshNQ4ISI.get(), this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.Camera2StreamConfigurationMap.get(), this.getHighSpeedVideoFpsRanges.get());
    }

    public static com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.widgetFullScreen.ActivityWidgetFullScreenUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.widgetFullScreen.ActivityWidgetLandingActionsUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase> provider4, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper> provider5) {
        return new com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel newInstance(com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig activityComposeConfig, com.paypal.oslo.feature.activity.domain.usecase.widgetFullScreen.ActivityWidgetFullScreenUseCase activityWidgetFullScreenUseCase, com.paypal.oslo.feature.activity.domain.usecase.widgetFullScreen.ActivityWidgetLandingActionsUseCase activityWidgetLandingActionsUseCase, com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase activityNavigationUseCase, com.paypal.oslo.feature.activity.domain.base.error.IActivityErrorMapper iActivityErrorMapper) {
        return new com.paypal.oslo.feature.activity.ui.widgetFullScreen.model.ActivityWidgetFullScreenViewModel(activityComposeConfig, activityWidgetFullScreenUseCase, activityWidgetLandingActionsUseCase, activityNavigationUseCase, iActivityErrorMapper);
    }
}
