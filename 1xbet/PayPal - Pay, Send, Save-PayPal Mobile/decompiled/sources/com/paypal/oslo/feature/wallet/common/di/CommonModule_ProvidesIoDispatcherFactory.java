package com.paypal.oslo.feature.wallet.common.di;

/* loaded from: classes15.dex */
public final class CommonModule_ProvidesIoDispatcherFactory implements dagger.internal.Factory<kotlinx.coroutines.CoroutineDispatcher> {
    private final com.paypal.oslo.feature.wallet.common.di.CommonModule getHighSpeedVideoFpsRanges;

    private CommonModule_ProvidesIoDispatcherFactory(com.paypal.oslo.feature.wallet.common.di.CommonModule commonModule) {
        this.getHighSpeedVideoFpsRanges = commonModule;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.coroutines.CoroutineDispatcher get() {
        return providesIoDispatcher(this.getHighSpeedVideoFpsRanges);
    }

    public static com.paypal.oslo.feature.wallet.common.di.CommonModule_ProvidesIoDispatcherFactory create(com.paypal.oslo.feature.wallet.common.di.CommonModule commonModule) {
        return new com.paypal.oslo.feature.wallet.common.di.CommonModule_ProvidesIoDispatcherFactory(commonModule);
    }

    public static kotlinx.coroutines.CoroutineDispatcher providesIoDispatcher(com.paypal.oslo.feature.wallet.common.di.CommonModule commonModule) {
        return (kotlinx.coroutines.CoroutineDispatcher) dagger.internal.Preconditions.checkNotNullFromProvides(commonModule.providesIoDispatcher());
    }
}
