package com.plaid.internal;

/* loaded from: classes16.dex */
public final class A5 implements dagger.internal.Factory<com.plaid.internal.C0587m5> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.Factory f5750a;

    public A5(com.plaid.internal.C0623q5 c0623q5, dagger.internal.Factory factory) {
        this.f5750a = factory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        android.app.Application application = (android.app.Application) this.f5750a.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        return (com.plaid.internal.C0587m5) dagger.internal.Preconditions.checkNotNullFromProvides(new com.plaid.internal.C0587m5(application));
    }
}
