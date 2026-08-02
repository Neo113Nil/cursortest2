package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class LogicModule_ProvideCoroutineDispatcherProvider$core_releaseFactory implements dagger.internal.Factory<com.payair.logic.managers.CoroutineDispatcherProvider> {
    public static com.payair.logic.di.LogicModule_ProvideCoroutineDispatcherProvider$core_releaseFactory create() {
        return com.payair.logic.di.c.f4435a;
    }

    public static com.payair.logic.managers.CoroutineDispatcherProvider provideCoroutineDispatcherProvider$core_release() {
        return (com.payair.logic.managers.CoroutineDispatcherProvider) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.LogicModule.INSTANCE.provideCoroutineDispatcherProvider$core_release());
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.managers.CoroutineDispatcherProvider get() {
        return provideCoroutineDispatcherProvider$core_release();
    }
}
