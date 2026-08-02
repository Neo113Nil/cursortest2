package com.plaid.internal;

/* loaded from: classes16.dex */
public final class T1 implements dagger.internal.Factory<com.plaid.internal.A6> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.Z1 f5923a;

    public T1(com.plaid.internal.I1 i1, com.plaid.internal.Z1 z1) {
        this.f5923a = z1;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.E7 e7 = (com.plaid.internal.E7) this.f5923a.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e7, "");
        return (com.plaid.internal.A6) dagger.internal.Preconditions.checkNotNullFromProvides(e7);
    }
}
