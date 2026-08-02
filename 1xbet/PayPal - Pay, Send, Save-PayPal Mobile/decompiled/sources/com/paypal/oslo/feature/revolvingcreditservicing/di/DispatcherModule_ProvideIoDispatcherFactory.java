package com.paypal.oslo.feature.revolvingcreditservicing.di;

/* loaded from: classes14.dex */
public final class DispatcherModule_ProvideIoDispatcherFactory implements dagger.internal.Factory<kotlinx.coroutines.CoroutineDispatcher> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.coroutines.CoroutineDispatcher get() {
        return provideIoDispatcher();
    }

    public static com.paypal.oslo.feature.revolvingcreditservicing.di.DispatcherModule_ProvideIoDispatcherFactory create() {
        return com.paypal.oslo.feature.revolvingcreditservicing.di.DispatcherModule_ProvideIoDispatcherFactory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static kotlinx.coroutines.CoroutineDispatcher provideIoDispatcher() {
        return (kotlinx.coroutines.CoroutineDispatcher) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.revolvingcreditservicing.di.DispatcherModule.INSTANCE.provideIoDispatcher());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.revolvingcreditservicing.di.DispatcherModule_ProvideIoDispatcherFactory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.revolvingcreditservicing.di.DispatcherModule_ProvideIoDispatcherFactory();

        private InstanceHolder() {
        }
    }
}
