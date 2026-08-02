package com.payair.logic.di;

/* loaded from: classes4.dex */
public final class LogicModule_ProvidePaymentServiceManager$core_releaseFactory implements dagger.internal.Factory<com.payair.logic.managers.PaymentServiceManager> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider f4414a;

    public LogicModule_ProvidePaymentServiceManager$core_releaseFactory(javax.inject.Provider<android.content.Context> provider) {
        this.f4414a = provider;
    }

    public static com.payair.logic.di.LogicModule_ProvidePaymentServiceManager$core_releaseFactory create(javax.inject.Provider<android.content.Context> provider) {
        return new com.payair.logic.di.LogicModule_ProvidePaymentServiceManager$core_releaseFactory(provider);
    }

    public static com.payair.logic.managers.PaymentServiceManager providePaymentServiceManager$core_release(android.content.Context context) {
        return (com.payair.logic.managers.PaymentServiceManager) dagger.internal.Preconditions.checkNotNullFromProvides(com.payair.logic.di.LogicModule.INSTANCE.providePaymentServiceManager$core_release(context));
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final com.payair.logic.managers.PaymentServiceManager get() {
        return providePaymentServiceManager$core_release((android.content.Context) this.f4414a.get());
    }
}
