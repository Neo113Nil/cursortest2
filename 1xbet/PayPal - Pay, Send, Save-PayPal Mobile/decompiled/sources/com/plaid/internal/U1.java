package com.plaid.internal;

/* loaded from: classes16.dex */
public final class U1 implements dagger.internal.Factory<com.plaid.internal.B6> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0448a2 f5933a;

    public U1(com.plaid.internal.I1 i1, com.plaid.internal.C0448a2 c0448a2) {
        this.f5933a = c0448a2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.M7 m7 = (com.plaid.internal.M7) this.f5933a.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m7, "");
        return (com.plaid.internal.B6) dagger.internal.Preconditions.checkNotNullFromProvides(m7);
    }
}
