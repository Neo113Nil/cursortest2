package com.paypal.oslo.core.pushnotification.di;

/* loaded from: classes5.dex */
public final class PushNotificationDispatcherModule_ProvideIoDispatcherFactory implements dagger.internal.Factory<kotlinx.coroutines.CoroutineDispatcher> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.coroutines.CoroutineDispatcher get() {
        return provideIoDispatcher();
    }

    public static com.paypal.oslo.core.pushnotification.di.PushNotificationDispatcherModule_ProvideIoDispatcherFactory create() {
        return com.paypal.oslo.core.pushnotification.di.PushNotificationDispatcherModule_ProvideIoDispatcherFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static kotlinx.coroutines.CoroutineDispatcher provideIoDispatcher() {
        return (kotlinx.coroutines.CoroutineDispatcher) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.pushnotification.di.PushNotificationDispatcherModule.INSTANCE.provideIoDispatcher());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.core.pushnotification.di.PushNotificationDispatcherModule_ProvideIoDispatcherFactory Camera2StreamConfigurationMap = new com.paypal.oslo.core.pushnotification.di.PushNotificationDispatcherModule_ProvideIoDispatcherFactory();

        private InstanceHolder() {
        }
    }
}
