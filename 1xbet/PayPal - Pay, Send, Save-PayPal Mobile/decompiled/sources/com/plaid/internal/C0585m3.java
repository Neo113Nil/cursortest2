package com.plaid.internal;

/* renamed from: com.plaid.internal.m3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0585m3 implements dagger.internal.Factory<com.plaid.internal.H6> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider<com.plaid.internal.N6> f6492a;

    public C0585m3(com.plaid.internal.C0504d3 c0504d3, javax.inject.Provider<com.plaid.internal.N6> provider) {
        this.f6492a = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.N6 n6 = this.f6492a.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(n6, "");
        return (com.plaid.internal.H6) dagger.internal.Preconditions.checkNotNullFromProvides(new com.plaid.internal.H6(n6));
    }
}
