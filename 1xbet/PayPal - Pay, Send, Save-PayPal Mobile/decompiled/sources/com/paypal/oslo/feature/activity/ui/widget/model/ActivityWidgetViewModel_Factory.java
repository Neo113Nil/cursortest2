package com.paypal.oslo.feature.activity.ui.widget.model;

/* loaded from: classes10.dex */
public final class ActivityWidgetViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetActionsUseCase> getHighSpeedVideoSizes;

    private ActivityWidgetViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetActionsUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase> provider4) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.Camera2StreamConfigurationMap = provider4;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig> provider, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetActionsUseCase> provider3, dagger.internal.Provider<com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase> provider4) {
        return new com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel_Factory(provider, provider2, provider3, provider4);
    }

    public static com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel newInstance(com.paypal.oslo.feature.activity.domain.navigation.ActivityComposeConfig activityComposeConfig, com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetUseCase activityWidgetUseCase, com.paypal.oslo.feature.activity.domain.usecase.widget.ActivityWidgetActionsUseCase activityWidgetActionsUseCase, com.paypal.oslo.feature.activity.domain.usecase.common.ActivityNavigationUseCase activityNavigationUseCase) {
        return new com.paypal.oslo.feature.activity.ui.widget.model.ActivityWidgetViewModel(activityComposeConfig, activityWidgetUseCase, activityWidgetActionsUseCase, activityNavigationUseCase);
    }
}
