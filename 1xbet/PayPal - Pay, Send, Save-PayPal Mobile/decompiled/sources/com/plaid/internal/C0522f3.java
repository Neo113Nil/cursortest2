package com.plaid.internal;

/* renamed from: com.plaid.internal.f3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0522f3 implements dagger.internal.Factory<com.plaid.internal.Y2> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0629r3 f6408a;
    public final javax.inject.Provider<com.plaid.internal.C0683x3> b;
    public final javax.inject.Provider<com.plaid.internal.L4> c;
    public final com.plaid.internal.G3 d;
    public final javax.inject.Provider<com.plaid.internal.n8> e;
    public final javax.inject.Provider<com.plaid.internal.y8> f;
    public final javax.inject.Provider<com.plaid.internal.H6> g;

    public C0522f3(com.plaid.internal.C0504d3 c0504d3, com.plaid.internal.C0629r3 c0629r3, javax.inject.Provider provider, javax.inject.Provider provider2, com.plaid.internal.G3 g3, javax.inject.Provider provider3, javax.inject.Provider provider4, javax.inject.Provider provider5) {
        this.f6408a = c0629r3;
        this.b = provider;
        this.c = provider2;
        this.d = g3;
        this.e = provider3;
        this.f = provider4;
        this.g = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.i8 i8Var = (com.plaid.internal.i8) this.f6408a.get();
        com.plaid.internal.C0683x3 c0683x3 = this.b.get();
        com.plaid.internal.L4 l4 = this.c.get();
        com.plaid.internal.F3 f3 = (com.plaid.internal.F3) this.d.get();
        com.plaid.internal.n8 n8Var = this.e.get();
        com.plaid.internal.y8 y8Var = this.f.get();
        com.plaid.internal.H6 h6 = this.g.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i8Var, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0683x3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l4, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(f3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(n8Var, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(y8Var, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h6, "");
        return (com.plaid.internal.Y2) dagger.internal.Preconditions.checkNotNullFromProvides(new com.plaid.internal.Y2(i8Var, l4, c0683x3, f3, n8Var, y8Var, h6));
    }
}
