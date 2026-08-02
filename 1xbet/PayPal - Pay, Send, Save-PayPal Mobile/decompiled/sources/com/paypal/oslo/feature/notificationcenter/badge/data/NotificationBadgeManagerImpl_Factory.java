package com.paypal.oslo.feature.notificationcenter.badge.data;

/* loaded from: classes13.dex */
public final class NotificationBadgeManagerImpl_Factory implements dagger.internal.Factory<com.paypal.oslo.feature.notificationcenter.badge.data.NotificationBadgeManagerImpl> {
    private final dagger.internal.Provider<androidx.view.Lifecycle> Camera2StreamConfigurationMap;
    private final dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> getHighResolutionOutputSizeshNQ4ISI;
    private final dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> getHighSpeedVideoFpsRanges;
    private final dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> getHighSpeedVideoFpsRangesFor;
    private final dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.badge.domain.repository.NotificationBadgeRepository> getHighSpeedVideoSizes;

    private NotificationBadgeManagerImpl_Factory(dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.badge.domain.repository.NotificationBadgeRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider2, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4, dagger.internal.Provider<androidx.view.Lifecycle> provider5) {
        this.getHighSpeedVideoSizes = provider;
        this.getHighSpeedVideoFpsRanges = provider2;
        this.getHighSpeedVideoFpsRangesFor = provider3;
        this.getHighResolutionOutputSizeshNQ4ISI = provider4;
        this.Camera2StreamConfigurationMap = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.paypal.oslo.feature.notificationcenter.badge.data.NotificationBadgeManagerImpl get() {
        return newInstance(this.getHighSpeedVideoSizes.get(), this.getHighSpeedVideoFpsRanges.get(), this.getHighSpeedVideoFpsRangesFor.get(), this.getHighResolutionOutputSizeshNQ4ISI.get(), this.Camera2StreamConfigurationMap.get());
    }

    public static com.paypal.oslo.feature.notificationcenter.badge.data.NotificationBadgeManagerImpl_Factory create(dagger.internal.Provider<com.paypal.oslo.feature.notificationcenter.badge.domain.repository.NotificationBadgeRepository> provider, dagger.internal.Provider<com.paypal.oslo.core.persistence.appstorage.AppStorage> provider2, dagger.internal.Provider<com.paypal.oslo.core.userstore.UserStore> provider3, dagger.internal.Provider<kotlinx.coroutines.CoroutineDispatcher> provider4, dagger.internal.Provider<androidx.view.Lifecycle> provider5) {
        return new com.paypal.oslo.feature.notificationcenter.badge.data.NotificationBadgeManagerImpl_Factory(provider, provider2, provider3, provider4, provider5);
    }

    public static com.paypal.oslo.feature.notificationcenter.badge.data.NotificationBadgeManagerImpl newInstance(com.paypal.oslo.feature.notificationcenter.badge.domain.repository.NotificationBadgeRepository notificationBadgeRepository, com.paypal.oslo.core.persistence.appstorage.AppStorage appStorage, com.paypal.oslo.core.userstore.UserStore userStore, kotlinx.coroutines.CoroutineDispatcher coroutineDispatcher, androidx.view.Lifecycle lifecycle) {
        return new com.paypal.oslo.feature.notificationcenter.badge.data.NotificationBadgeManagerImpl(notificationBadgeRepository, appStorage, userStore, coroutineDispatcher, lifecycle);
    }
}
