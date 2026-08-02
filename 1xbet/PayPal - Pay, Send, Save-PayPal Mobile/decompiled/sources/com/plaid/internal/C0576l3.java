package com.plaid.internal;

/* renamed from: com.plaid.internal.l3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0576l3 implements dagger.internal.Factory<java.lang.String> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.Factory f6473a;

    public C0576l3(com.plaid.internal.C0504d3 c0504d3, dagger.internal.Factory factory) {
        this.f6473a = factory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        android.app.Application application = (android.app.Application) this.f6473a.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        java.lang.String a2 = com.plaid.internal.N4.f5862a.a(application);
        return (java.lang.String) dagger.internal.Preconditions.checkNotNullFromProvides(a2 != null ? a2 : "");
    }
}
