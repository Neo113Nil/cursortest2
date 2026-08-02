package com.paypal.oslo.feature.notificationcenter.badge.di;

/* loaded from: classes5.dex */
public final class NotificationBadgeDispatcherModule_ProvideIoDispatcherFactory implements dagger.internal.Factory<kotlinx.coroutines.CoroutineDispatcher> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.coroutines.CoroutineDispatcher get() {
        return provideIoDispatcher();
    }

    public static com.paypal.oslo.feature.notificationcenter.badge.di.NotificationBadgeDispatcherModule_ProvideIoDispatcherFactory create() {
        return com.paypal.oslo.feature.notificationcenter.badge.di.NotificationBadgeDispatcherModule_ProvideIoDispatcherFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static kotlinx.coroutines.CoroutineDispatcher provideIoDispatcher() {
        return (kotlinx.coroutines.CoroutineDispatcher) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.notificationcenter.badge.di.NotificationBadgeDispatcherModule.INSTANCE.provideIoDispatcher());
    }

    /* loaded from: classes13.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.notificationcenter.badge.di.NotificationBadgeDispatcherModule_ProvideIoDispatcherFactory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.notificationcenter.badge.di.NotificationBadgeDispatcherModule_ProvideIoDispatcherFactory();

        private InstanceHolder() {
        }
    }
}
