package com.paypal.oslo.feature.identity.unifiedalert.di;

/* loaded from: classes5.dex */
public final class UnifiedAlertsModule_Companion_ProvideIoDispatcherFactory implements dagger.internal.Factory<kotlinx.coroutines.CoroutineDispatcher> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.coroutines.CoroutineDispatcher get() {
        return provideIoDispatcher();
    }

    public static com.paypal.oslo.feature.identity.unifiedalert.di.UnifiedAlertsModule_Companion_ProvideIoDispatcherFactory create() {
        return com.paypal.oslo.feature.identity.unifiedalert.di.UnifiedAlertsModule_Companion_ProvideIoDispatcherFactory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static kotlinx.coroutines.CoroutineDispatcher provideIoDispatcher() {
        return (kotlinx.coroutines.CoroutineDispatcher) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.feature.identity.unifiedalert.di.UnifiedAlertsModule.INSTANCE.provideIoDispatcher());
    }

    /* loaded from: classes13.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.feature.identity.unifiedalert.di.UnifiedAlertsModule_Companion_ProvideIoDispatcherFactory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.feature.identity.unifiedalert.di.UnifiedAlertsModule_Companion_ProvideIoDispatcherFactory();

        private InstanceHolder() {
        }
    }
}
