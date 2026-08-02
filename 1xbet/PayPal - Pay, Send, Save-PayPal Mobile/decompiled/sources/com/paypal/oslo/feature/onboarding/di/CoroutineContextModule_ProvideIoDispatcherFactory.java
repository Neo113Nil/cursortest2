package com.paypal.oslo.feature.onboarding.di;

/* loaded from: classes13.dex */
public final class CoroutineContextModule_ProvideIoDispatcherFactory implements dagger.internal.Factory<kotlin.coroutines.CoroutineContext> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlin.coroutines.CoroutineContext get() {
        return provideIoDispatcher();
    }

    public static com.paypal.oslo.feature.onboarding.di.CoroutineContextModule_ProvideIoDispatcherFactory create() {
        return com.paypal.oslo.feature.onboarding.di.CoroutineContextModule_ProvideIoDispatcherFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static kotlin.coroutines.CoroutineContext provideIoDispatcher() {
        return (kotlin.coroutines.CoroutineContext) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.onboarding.di.CoroutineContextModule.INSTANCE.provideIoDispatcher());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.onboarding.di.CoroutineContextModule_ProvideIoDispatcherFactory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.onboarding.di.CoroutineContextModule_ProvideIoDispatcherFactory();

        private InstanceHolder() {
        }
    }
}
