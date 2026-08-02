package com.paypal.oslo.feature.xoom.di;

/* loaded from: classes16.dex */
public final class XoomModule_ProvideIoDispatcherFactory implements dagger.internal.Factory<kotlinx.coroutines.CoroutineDispatcher> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.coroutines.CoroutineDispatcher get() {
        return provideIoDispatcher();
    }

    public static com.paypal.oslo.feature.xoom.di.XoomModule_ProvideIoDispatcherFactory create() {
        return com.paypal.oslo.feature.xoom.di.XoomModule_ProvideIoDispatcherFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static kotlinx.coroutines.CoroutineDispatcher provideIoDispatcher() {
        return (kotlinx.coroutines.CoroutineDispatcher) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.xoom.di.XoomModule.INSTANCE.provideIoDispatcher());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.xoom.di.XoomModule_ProvideIoDispatcherFactory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.xoom.di.XoomModule_ProvideIoDispatcherFactory();

        private InstanceHolder() {
        }
    }
}
