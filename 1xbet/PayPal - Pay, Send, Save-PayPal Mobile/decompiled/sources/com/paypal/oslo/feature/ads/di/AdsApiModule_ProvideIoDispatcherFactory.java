package com.paypal.oslo.feature.ads.di;

/* loaded from: classes5.dex */
public final class AdsApiModule_ProvideIoDispatcherFactory implements dagger.internal.Factory<kotlinx.coroutines.CoroutineDispatcher> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.coroutines.CoroutineDispatcher get() {
        return provideIoDispatcher();
    }

    public static com.paypal.oslo.feature.ads.di.AdsApiModule_ProvideIoDispatcherFactory create() {
        return com.paypal.oslo.feature.ads.di.AdsApiModule_ProvideIoDispatcherFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static kotlinx.coroutines.CoroutineDispatcher provideIoDispatcher() {
        return (kotlinx.coroutines.CoroutineDispatcher) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.ads.di.AdsApiModule.INSTANCE.provideIoDispatcher());
    }

    /* loaded from: classes11.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.ads.di.AdsApiModule_ProvideIoDispatcherFactory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.ads.di.AdsApiModule_ProvideIoDispatcherFactory();

        private InstanceHolder() {
        }
    }
}
