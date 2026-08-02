package com.paypal.oslo.feature.pools.di;

/* loaded from: classes5.dex */
public final class PoolsDispatcherModule_ProvideIoDispatcherFactory implements dagger.internal.Factory<kotlinx.coroutines.CoroutineDispatcher> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.coroutines.CoroutineDispatcher get() {
        return provideIoDispatcher();
    }

    public static com.paypal.oslo.feature.pools.di.PoolsDispatcherModule_ProvideIoDispatcherFactory create() {
        return com.paypal.oslo.feature.pools.di.PoolsDispatcherModule_ProvideIoDispatcherFactory.InstanceHolder.getHighResolutionOutputSizeshNQ4ISI;
    }

    public static kotlinx.coroutines.CoroutineDispatcher provideIoDispatcher() {
        return (kotlinx.coroutines.CoroutineDispatcher) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.pools.di.PoolsDispatcherModule.INSTANCE.provideIoDispatcher());
    }

    /* loaded from: classes13.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.pools.di.PoolsDispatcherModule_ProvideIoDispatcherFactory getHighResolutionOutputSizeshNQ4ISI = new com.paypal.oslo.feature.pools.di.PoolsDispatcherModule_ProvideIoDispatcherFactory();

        private InstanceHolder() {
        }
    }
}
