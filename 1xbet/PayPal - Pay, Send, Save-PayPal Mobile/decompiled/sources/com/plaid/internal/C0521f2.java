package com.plaid.internal;

/* renamed from: com.plaid.internal.f2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0521f2 implements dagger.internal.Factory<com.plaid.internal.B8> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0448a2 f6407a;

    public C0521f2(com.plaid.internal.I1 i1, com.plaid.internal.C0448a2 c0448a2) {
        this.f6407a = c0448a2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.M7 m7 = (com.plaid.internal.M7) this.f6407a.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m7, "");
        return (com.plaid.internal.B8) dagger.internal.Preconditions.checkNotNullFromProvides(m7);
    }
}
