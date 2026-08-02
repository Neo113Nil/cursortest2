package com.plaid.internal;

/* loaded from: classes16.dex */
public final class Y1 implements dagger.internal.Factory<com.plaid.internal.InterfaceC0669v7> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.Factory f5978a;

    public Y1(com.plaid.internal.I1 i1, dagger.internal.Factory factory) {
        this.f5978a = factory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        android.app.Application application = (android.app.Application) this.f5978a.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        android.content.Context applicationContext = application.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext, "");
        return (com.plaid.internal.InterfaceC0669v7) dagger.internal.Preconditions.checkNotNullFromProvides(new com.plaid.internal.N(new com.plaid.internal.L(applicationContext, new com.plaid.internal.J())));
    }
}
