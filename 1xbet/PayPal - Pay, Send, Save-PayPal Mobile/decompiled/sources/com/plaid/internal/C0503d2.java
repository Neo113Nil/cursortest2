package com.plaid.internal;

/* renamed from: com.plaid.internal.d2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0503d2 implements dagger.internal.Factory<com.plaid.internal.z8> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.N1 f6391a;

    public C0503d2(com.plaid.internal.I1 i1, com.plaid.internal.N1 n1) {
        this.f6391a = n1;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.C0472c6 c0472c6 = (com.plaid.internal.C0472c6) this.f6391a.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0472c6, "");
        return (com.plaid.internal.z8) dagger.internal.Preconditions.checkNotNullFromProvides(c0472c6);
    }
}
