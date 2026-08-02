package com.plaid.internal;

/* renamed from: com.plaid.internal.g2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0530g2 implements dagger.internal.Factory<com.plaid.internal.C8> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0458b2 f6417a;
    public final javax.inject.Provider<com.plaid.internal.L7> b;

    public C0530g2(com.plaid.internal.I1 i1, com.plaid.internal.C0458b2 c0458b2, javax.inject.Provider provider) {
        this.f6417a = c0458b2;
        this.b = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.O7 o7 = (com.plaid.internal.O7) this.f6417a.get();
        com.plaid.internal.L7 l7 = this.b.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(o7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(l7, "");
        return (com.plaid.internal.C8) dagger.internal.Preconditions.checkNotNullFromProvides(o7);
    }
}
