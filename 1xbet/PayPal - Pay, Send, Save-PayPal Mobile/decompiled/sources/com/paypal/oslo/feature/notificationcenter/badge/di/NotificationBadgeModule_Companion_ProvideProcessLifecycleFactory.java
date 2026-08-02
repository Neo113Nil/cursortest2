package com.paypal.oslo.feature.notificationcenter.badge.di;

/* loaded from: classes5.dex */
public final class NotificationBadgeModule_Companion_ProvideProcessLifecycleFactory implements dagger.internal.Factory<androidx.view.Lifecycle> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final androidx.view.Lifecycle get() {
        return provideProcessLifecycle();
    }

    public static com.paypal.oslo.feature.notificationcenter.badge.di.NotificationBadgeModule_Companion_ProvideProcessLifecycleFactory create() {
        return com.paypal.oslo.feature.notificationcenter.badge.di.NotificationBadgeModule_Companion_ProvideProcessLifecycleFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static androidx.view.Lifecycle provideProcessLifecycle() {
        return (androidx.view.Lifecycle) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.notificationcenter.badge.di.NotificationBadgeModule.INSTANCE.provideProcessLifecycle());
    }

    /* loaded from: classes13.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.notificationcenter.badge.di.NotificationBadgeModule_Companion_ProvideProcessLifecycleFactory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.notificationcenter.badge.di.NotificationBadgeModule_Companion_ProvideProcessLifecycleFactory();

        private InstanceHolder() {
        }
    }
}
