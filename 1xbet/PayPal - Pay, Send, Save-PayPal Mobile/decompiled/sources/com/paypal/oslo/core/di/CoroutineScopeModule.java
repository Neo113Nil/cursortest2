package com.paypal.oslo.core.di;

@kotlin.Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lcom/paypal/oslo/core/di/CoroutineScopeModule;", "", "<init>", "()V", "Lkotlinx/coroutines/CoroutineScope;", "provideApplicationScope", "()Lkotlinx/coroutines/CoroutineScope;"}, k = 1, mv = {2, 3, 0}, xi = 48)
@dagger.Module
/* loaded from: classes4.dex */
public final class CoroutineScopeModule {
    public static final com.paypal.oslo.core.di.CoroutineScopeModule INSTANCE = new com.paypal.oslo.core.di.CoroutineScopeModule();

    private CoroutineScopeModule() {
    }

    @dagger.Provides
    @javax.inject.Singleton
    @com.paypal.oslo.core.di.annotations.IoApplicationScope
    public final kotlinx.coroutines.CoroutineScope provideApplicationScope() {
        return kotlinx.coroutines.CoroutineScopeKt.CoroutineScope(kotlinx.coroutines.Dispatchers.getIO().plus(kotlinx.coroutines.SupervisorKt.SupervisorJob$default((kotlinx.coroutines.Job) null, 1, (java.lang.Object) null)));
    }
}
