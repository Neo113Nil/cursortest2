package com.paypal.oslo.feature.notificationcenter.ui.viewmodels;

/* loaded from: classes13.dex */
public final class NotificationViewModel_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel> {
    private final dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.domain.provider.TimeProvider> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.domain.usecase.UpdateNotificationsTrackingStatusUseCase> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.domain.usecase.GetNotificationsUseCase> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.badge.api.NotificationBadgeManager> getHighSpeedVideoSizes;

    private NotificationViewModel_Factory(dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.domain.usecase.GetNotificationsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.domain.usecase.UpdateNotificationsTrackingStatusUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.badge.api.NotificationBadgeManager> provider3, dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.domain.provider.TimeProvider> provider4, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider5) {
        this.getHighSpeedVideoFpsRangesFor = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoSizes = provider3;
        this.Camera2StreamConfigurationMap = provider4;
        this.getHighResolutionOutputSizeshNQ4ISI = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel get() {
        return newInstance(this.getHighSpeedVideoFpsRangesFor.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoSizes.get(), this.Camera2StreamConfigurationMap.get(), this.getHighResolutionOutputSizeshNQ4ISI.get());
    }

    public static com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.domain.usecase.GetNotificationsUseCase> provider, dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.domain.usecase.UpdateNotificationsTrackingStatusUseCase> provider2, dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.badge.api.NotificationBadgeManager> provider3, dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.domain.provider.TimeProvider> provider4, dagger.internal.Provider<com.paypal.oslo.core.remoteconfig.contract.FeatureGate> provider5) {
        return new com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel newInstance(com.paypal.oslo.feature.notificationcenter.domain.usecase.GetNotificationsUseCase getNotificationsUseCase, com.paypal.oslo.feature.notificationcenter.domain.usecase.UpdateNotificationsTrackingStatusUseCase updateNotificationsTrackingStatusUseCase, com.paypal.oslo.feature.notificationcenter.badge.api.NotificationBadgeManager notificationBadgeManager, com.paypal.oslo.feature.notificationcenter.domain.provider.TimeProvider timeProvider, com.paypal.oslo.core.remoteconfig.contract.FeatureGate featureGate) {
        return new com.paypal.oslo.feature.notificationcenter.ui.viewmodels.NotificationViewModel(getNotificationsUseCase, updateNotificationsTrackingStatusUseCase, notificationBadgeManager, timeProvider, featureGate);
    }
}
