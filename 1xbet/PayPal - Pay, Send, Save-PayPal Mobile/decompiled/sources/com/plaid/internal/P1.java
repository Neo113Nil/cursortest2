package com.plaid.internal;

/* loaded from: classes16.dex */
public final class P1 implements dagger.internal.Factory<com.plaid.internal.InterfaceC0677w6> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.J1 f5876a;

    public P1(com.plaid.internal.I1 i1, com.plaid.internal.J1 j1) {
        this.f5876a = j1;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.C c = (com.plaid.internal.C) this.f5876a.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "");
        return (com.plaid.internal.InterfaceC0677w6) dagger.internal.Preconditions.checkNotNullFromProvides(c);
    }
}
