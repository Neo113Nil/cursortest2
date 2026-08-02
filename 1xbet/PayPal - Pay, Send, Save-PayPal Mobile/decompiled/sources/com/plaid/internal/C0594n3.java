package com.plaid.internal;

/* renamed from: com.plaid.internal.n3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0594n3 implements dagger.internal.Factory<com.plaid.internal.N6> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0629r3 f6506a;
    public final javax.inject.Provider<java.lang.String> b;
    public final javax.inject.Provider<com.plaid.internal.I> c;

    public C0594n3(com.plaid.internal.C0504d3 c0504d3, com.plaid.internal.C0629r3 c0629r3, javax.inject.Provider provider, javax.inject.Provider provider2) {
        this.f6506a = c0629r3;
        this.b = provider;
        this.c = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.i8 i8Var = (com.plaid.internal.i8) this.f6506a.get();
        java.lang.String str = this.b.get();
        com.plaid.internal.I i = this.c.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i8Var, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i, "");
        return (com.plaid.internal.N6) dagger.internal.Preconditions.checkNotNullFromProvides(new com.plaid.internal.N6(i8Var, str, i));
    }
}
