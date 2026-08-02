package com.paypal.oslo.feature.pushnotification.di;

/* loaded from: classes5.dex */
public final class PushNotificationModule_Companion_ProvideCoroutineScopeFactory implements dagger.internal.Factory<kotlinx.coroutines.CoroutineScope> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.coroutines.CoroutineScope get() {
        return provideCoroutineScope();
    }

    public static com.paypal.oslo.feature.pushnotification.di.PushNotificationModule_Companion_ProvideCoroutineScopeFactory create() {
        return com.paypal.oslo.feature.pushnotification.di.PushNotificationModule_Companion_ProvideCoroutineScopeFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static kotlinx.coroutines.CoroutineScope provideCoroutineScope() {
        return (kotlinx.coroutines.CoroutineScope) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.pushnotification.di.PushNotificationModule.INSTANCE.provideCoroutineScope());
    }

    /* loaded from: classes13.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.pushnotification.di.PushNotificationModule_Companion_ProvideCoroutineScopeFactory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.pushnotification.di.PushNotificationModule_Companion_ProvideCoroutineScopeFactory();

        private InstanceHolder() {
        }
    }
}
