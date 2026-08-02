package com.paypal.oslo.feature.helpcenter.di;

/* loaded from: classes5.dex */
public final class DispatcherModule_ProvideIoDispatcherFactory implements dagger.internal.Factory<kotlinx.coroutines.CoroutineDispatcher> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.coroutines.CoroutineDispatcher get() {
        return provideIoDispatcher();
    }

    public static com.paypal.oslo.feature.helpcenter.di.DispatcherModule_ProvideIoDispatcherFactory create() {
        return com.paypal.oslo.feature.helpcenter.di.DispatcherModule_ProvideIoDispatcherFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static kotlinx.coroutines.CoroutineDispatcher provideIoDispatcher() {
        return (kotlinx.coroutines.CoroutineDispatcher) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.helpcenter.di.DispatcherModule.INSTANCE.provideIoDispatcher());
    }

    /* loaded from: classes12.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.helpcenter.di.DispatcherModule_ProvideIoDispatcherFactory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.helpcenter.di.DispatcherModule_ProvideIoDispatcherFactory();

        private InstanceHolder() {
        }
    }
}
