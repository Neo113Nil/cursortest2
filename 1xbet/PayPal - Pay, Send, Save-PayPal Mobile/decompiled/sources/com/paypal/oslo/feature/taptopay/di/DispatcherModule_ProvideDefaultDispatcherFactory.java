package com.paypal.oslo.feature.taptopay.di;

/* loaded from: classes5.dex */
public final class DispatcherModule_ProvideDefaultDispatcherFactory implements dagger.internal.Factory<kotlinx.coroutines.CoroutineDispatcher> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.coroutines.CoroutineDispatcher get() {
        return provideDefaultDispatcher();
    }

    public static com.paypal.oslo.feature.taptopay.di.DispatcherModule_ProvideDefaultDispatcherFactory create() {
        return com.paypal.oslo.feature.taptopay.di.DispatcherModule_ProvideDefaultDispatcherFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static kotlinx.coroutines.CoroutineDispatcher provideDefaultDispatcher() {
        return (kotlinx.coroutines.CoroutineDispatcher) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.taptopay.di.DispatcherModule.INSTANCE.provideDefaultDispatcher());
    }

    /* loaded from: classes15.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.taptopay.di.DispatcherModule_ProvideDefaultDispatcherFactory Camera2StreamConfigurationMap = new com.paypal.oslo.feature.taptopay.di.DispatcherModule_ProvideDefaultDispatcherFactory();

        private InstanceHolder() {
        }
    }
}
