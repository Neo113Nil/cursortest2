package com.plaid.internal;

/* loaded from: classes16.dex */
public final class R1 implements dagger.internal.Factory<com.plaid.internal.InterfaceC0704z6> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.N1 f5903a;

    public R1(com.plaid.internal.I1 i1, com.plaid.internal.N1 n1) {
        this.f5903a = n1;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.C0472c6 c0472c6 = (com.plaid.internal.C0472c6) this.f5903a.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0472c6, "");
        return (com.plaid.internal.InterfaceC0704z6) dagger.internal.Preconditions.checkNotNullFromProvides(c0472c6);
    }
}
