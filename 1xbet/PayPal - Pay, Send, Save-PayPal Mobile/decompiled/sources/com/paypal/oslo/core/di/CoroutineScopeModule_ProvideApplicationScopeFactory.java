package com.paypal.oslo.core.di;

/* loaded from: classes4.dex */
public final class CoroutineScopeModule_ProvideApplicationScopeFactory implements dagger.internal.Factory<kotlinx.coroutines.CoroutineScope> {
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final kotlinx.coroutines.CoroutineScope get() {
        return provideApplicationScope();
    }

    public static com.paypal.oslo.core.di.CoroutineScopeModule_ProvideApplicationScopeFactory create() {
        return com.paypal.oslo.core.di.CoroutineScopeModule_ProvideApplicationScopeFactory.InstanceHolder.Camera2StreamConfigurationMap;
    }

    public static kotlinx.coroutines.CoroutineScope provideApplicationScope() {
        return (kotlinx.coroutines.CoroutineScope) dagger.internal.Preconditions.checkNotNullFromProvides(com.paypal.oslo.core.di.CoroutineScopeModule.INSTANCE.provideApplicationScope());
    }

    /* loaded from: classes10.dex */
    static final class InstanceHolder {
        static final com.paypal.oslo.core.di.CoroutineScopeModule_ProvideApplicationScopeFactory Camera2StreamConfigurationMap = new com.paypal.oslo.core.di.CoroutineScopeModule_ProvideApplicationScopeFactory();

        private InstanceHolder() {
        }
    }
}
