package com.plaid.internal;

/* renamed from: com.plaid.internal.c2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0468c2 implements dagger.internal.Factory<com.plaid.internal.x8> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.J1 f6005a;

    public C0468c2(com.plaid.internal.I1 i1, com.plaid.internal.J1 j1) {
        this.f6005a = j1;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.C c = (com.plaid.internal.C) this.f6005a.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c, "");
        return (com.plaid.internal.x8) dagger.internal.Preconditions.checkNotNullFromProvides(c);
    }
}
