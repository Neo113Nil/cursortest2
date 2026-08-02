package com.plaid.internal;

/* loaded from: classes16.dex */
public final class V1 implements dagger.internal.Factory<com.plaid.internal.C6> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0458b2 f5949a;

    public V1(com.plaid.internal.I1 i1, com.plaid.internal.C0458b2 c0458b2) {
        this.f5949a = c0458b2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.O7 o7 = (com.plaid.internal.O7) this.f5949a.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(o7, "");
        return (com.plaid.internal.C6) dagger.internal.Preconditions.checkNotNullFromProvides(o7);
    }
}
