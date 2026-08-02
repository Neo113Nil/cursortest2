package com.plaid.internal;

/* loaded from: classes16.dex */
public final class N1 implements dagger.internal.Factory<com.plaid.internal.C0472c6> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.I1 f5850a;
    public final javax.inject.Provider<com.plaid.internal.T3> b;

    public N1(com.plaid.internal.I1 i1, javax.inject.Provider<com.plaid.internal.T3> provider) {
        this.f5850a = i1;
        this.b = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.T3 t3 = this.b.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t3, "");
        return (com.plaid.internal.C0472c6) dagger.internal.Preconditions.checkNotNullFromProvides(new com.plaid.internal.C0472c6(t3));
    }
}
