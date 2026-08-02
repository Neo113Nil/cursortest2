package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class LogicModule_ProvidePaymentManager$core_releaseFactory implements dagger.internal.Factory<com.payair.logic.managers.PaymentManager> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4413a;
    public final javax.inject.Provider b;

    public LogicModule_ProvidePaymentManager$core_releaseFactory(javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider, javax.inject.Provider<com.payair.logic.managers.CoroutineDispatcherProvider> provider2) {
        this.f4413a = provider;
        this.b = provider2;
    }

    public static com.payair.logic.di.LogicModule_ProvidePaymentManager$core_releaseFactory create(javax.inject.Provider<com.payair.logic.implementation.HceSDKInterface> provider, javax.inject.Provider<com.payair.logic.managers.CoroutineDispatcherProvider> provider2) {
        return new com.payair.logic.di.LogicModule_ProvidePaymentManager$core_releaseFactory(provider, provider2);
    }

    public static com.payair.logic.managers.PaymentManager providePaymentManager$core_release(com.payair.logic.implementation.HceSDKInterface hceSDKInterface, com.payair.logic.managers.CoroutineDispatcherProvider coroutineDispatcherProvider) {
        return (com.payair.logic.managers.PaymentManager) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.LogicModule.INSTANCE.providePaymentManager$core_release(hceSDKInterface, coroutineDispatcherProvider));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.managers.PaymentManager get() {
        return providePaymentManager$core_release((com.payair.logic.implementation.HceSDKInterface) this.f4413a.get(), (com.payair.logic.managers.CoroutineDispatcherProvider) this.b.get());
    }
}
