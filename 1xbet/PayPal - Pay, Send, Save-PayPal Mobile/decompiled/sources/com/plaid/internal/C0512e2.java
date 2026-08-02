package com.plaid.internal;

/* renamed from: com.plaid.internal.e2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0512e2 implements dagger.internal.Factory<com.plaid.internal.A8> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.Z1 f6401a;

    public C0512e2(com.plaid.internal.I1 i1, com.plaid.internal.Z1 z1) {
        this.f6401a = z1;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.E7 e7 = (com.plaid.internal.E7) this.f6401a.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e7, "");
        return (com.plaid.internal.A8) dagger.internal.Preconditions.checkNotNullFromProvides(e7);
    }
}
