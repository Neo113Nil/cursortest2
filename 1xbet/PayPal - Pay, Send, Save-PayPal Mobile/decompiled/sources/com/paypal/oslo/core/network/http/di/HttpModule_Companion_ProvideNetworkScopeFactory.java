package com.paypal.oslo.core.network.http.di;

/* loaded from: classes4.dex */
public final class HttpModule_Companion_ProvideNetworkScopeFactory implements dagger.internal.Factory<kotlinx.coroutines.CoroutineScope> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.coroutines.CoroutineScope get() {
        return provideNetworkScope();
    }

    public static com.paypal.oslo.core.network.http.di.HttpModule_Companion_ProvideNetworkScopeFactory create() {
        return com.paypal.oslo.core.network.http.di.HttpModule_Companion_ProvideNetworkScopeFactory.InstanceHolder.getHighSpeedVideoFpsRangesFor;
    }

    public static kotlinx.coroutines.CoroutineScope provideNetworkScope() {
        return (kotlinx.coroutines.CoroutineScope) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.network.http.di.HttpModule.INSTANCE.provideNetworkScope());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.core.network.http.di.HttpModule_Companion_ProvideNetworkScopeFactory getHighSpeedVideoFpsRangesFor = new com.paypal.oslo.core.network.http.di.HttpModule_Companion_ProvideNetworkScopeFactory();

        private InstanceHolder() {
        }
    }
}
