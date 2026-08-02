package com.paypal.oslo.feature.inappcheckout.di;

/* loaded from: classes13.dex */
public final class InAppCheckoutModule_IoDispatcherFactory implements dagger.internal.Factory<kotlinx.coroutines.CoroutineDispatcher> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.coroutines.CoroutineDispatcher get() {
        return ioDispatcher();
    }

    public static com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutModule_IoDispatcherFactory create() {
        return com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutModule_IoDispatcherFactory.InstanceHolder.getHighSpeedVideoFpsRanges;
    }

    public static kotlinx.coroutines.CoroutineDispatcher ioDispatcher() {
        return (kotlinx.coroutines.CoroutineDispatcher) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutModule.INSTANCE.ioDispatcher());
    }

    static final class InstanceHolder {
        static final com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutModule_IoDispatcherFactory getHighSpeedVideoFpsRanges = new com.paypal.oslo.feature.inappcheckout.di.InAppCheckoutModule_IoDispatcherFactory();

        private InstanceHolder() {
        }
    }
}
