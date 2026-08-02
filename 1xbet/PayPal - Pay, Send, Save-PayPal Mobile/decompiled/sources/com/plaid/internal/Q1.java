package com.plaid.internal;

/* loaded from: classes16.dex */
public final class Q1 implements dagger.internal.Factory<com.plaid.internal.InterfaceC0695y6> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.I1 f5897a;
    public final javax.inject.Provider<com.plaid.internal.L4> b;

    public Q1(com.plaid.internal.I1 i1, javax.inject.Provider<com.plaid.internal.L4> provider) {
        this.f5897a = i1;
        this.b = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.L4 l4 = this.b.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l4, "");
        return (com.plaid.internal.InterfaceC0695y6) dagger.internal.Preconditions.checkNotNullFromProvides(l4);
    }
}
