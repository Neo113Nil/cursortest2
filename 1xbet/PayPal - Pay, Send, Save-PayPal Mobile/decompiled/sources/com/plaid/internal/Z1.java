package com.plaid.internal;

/* loaded from: classes16.dex */
public final class Z1 implements dagger.internal.Factory<com.plaid.internal.E7> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.I1 f5985a;
    public final javax.inject.Provider<com.plaid.internal.T3> b;
    public final javax.inject.Provider<com.plaid.internal.C0457b1> c;

    public Z1(com.plaid.internal.I1 i1, javax.inject.Provider<com.plaid.internal.T3> provider, javax.inject.Provider<com.plaid.internal.C0457b1> provider2) {
        this.f5985a = i1;
        this.b = provider;
        this.c = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.T3 t3 = this.b.get();
        com.plaid.internal.C0457b1 c0457b1 = this.c.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0457b1, "");
        return (com.plaid.internal.E7) dagger.internal.Preconditions.checkNotNullFromProvides(new com.plaid.internal.E7(t3, c0457b1));
    }
}
