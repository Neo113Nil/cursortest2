package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class LogicModule_ProvideFirebaseInterface$core_releaseFactory implements dagger.internal.Factory<com.payair.logic.implementation.FirebaseInterface> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4409a;

    public LogicModule_ProvideFirebaseInterface$core_releaseFactory(javax.inject.Provider<com.payair.logic.managers.CoroutineDispatcherProvider> provider) {
        this.f4409a = provider;
    }

    public static com.payair.logic.di.LogicModule_ProvideFirebaseInterface$core_releaseFactory create(javax.inject.Provider<com.payair.logic.managers.CoroutineDispatcherProvider> provider) {
        return new com.payair.logic.di.LogicModule_ProvideFirebaseInterface$core_releaseFactory(provider);
    }

    public static com.payair.logic.implementation.FirebaseInterface provideFirebaseInterface$core_release(com.payair.logic.managers.CoroutineDispatcherProvider coroutineDispatcherProvider) {
        return (com.payair.logic.implementation.FirebaseInterface) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.LogicModule.INSTANCE.provideFirebaseInterface$core_release(coroutineDispatcherProvider));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.implementation.FirebaseInterface get() {
        return provideFirebaseInterface$core_release((com.payair.logic.managers.CoroutineDispatcherProvider) this.f4409a.get());
    }
}
