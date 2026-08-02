package com.plaid.internal;

/* loaded from: classes16.dex */
public final class L1 implements dagger.internal.Factory<com.plaid.internal.InterfaceC0655u2> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider<com.plaid.internal.G2> f5831a;
    public final javax.inject.Provider<com.plaid.internal.Z2> b;
    public final javax.inject.Provider<com.plaid.internal.Y2> c;
    public final javax.inject.Provider<com.plaid.internal.y8> d;
    public final javax.inject.Provider<com.plaid.internal.C8> e;
    public final javax.inject.Provider<com.plaid.internal.x8> f;
    public final javax.inject.Provider<com.plaid.internal.B8> g;
    public final javax.inject.Provider<com.plaid.internal.A8> h;
    public final com.plaid.internal.C0 i;

    public L1(com.plaid.internal.I1 i1, javax.inject.Provider provider, javax.inject.Provider provider2, javax.inject.Provider provider3, javax.inject.Provider provider4, javax.inject.Provider provider5, javax.inject.Provider provider6, javax.inject.Provider provider7, javax.inject.Provider provider8, com.plaid.internal.C0 c0) {
        this.f5831a = provider;
        this.b = provider2;
        this.c = provider3;
        this.d = provider4;
        this.e = provider5;
        this.f = provider6;
        this.g = provider7;
        this.h = provider8;
        this.i = c0;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.G2 g2 = this.f5831a.get();
        com.plaid.internal.Z2 z2 = this.b.get();
        com.plaid.internal.Y2 y2 = this.c.get();
        com.plaid.internal.y8 y8Var = this.d.get();
        com.plaid.internal.C8 c8 = this.e.get();
        com.plaid.internal.x8 x8Var = this.f.get();
        com.plaid.internal.B8 b8 = this.g.get();
        com.plaid.internal.A8 a8 = this.h.get();
        com.plaid.internal.A0 a0 = (com.plaid.internal.A0) this.i.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(g2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(z2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(y2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(y8Var, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c8, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(x8Var, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b8, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a8, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(a0, "");
        return (com.plaid.internal.InterfaceC0655u2) dagger.internal.Preconditions.checkNotNullFromProvides(new com.plaid.internal.C0646t2(g2, z2, y2, y8Var, c8, x8Var, b8, a8, a0));
    }
}
