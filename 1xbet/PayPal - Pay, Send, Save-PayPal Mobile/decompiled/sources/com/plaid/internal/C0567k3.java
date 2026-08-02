package com.plaid.internal;

/* renamed from: com.plaid.internal.k3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0567k3 implements dagger.internal.Factory<com.plaid.internal.I> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0504d3 f6461a;
    public final javax.inject.Provider<com.plaid.internal.I5> b;

    public C0567k3(com.plaid.internal.C0504d3 c0504d3, javax.inject.Provider<com.plaid.internal.I5> provider) {
        this.f6461a = c0504d3;
        this.b = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.I5 i5 = this.b.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i5, "");
        return (com.plaid.internal.I) dagger.internal.Preconditions.checkNotNullFromProvides(new com.plaid.internal.I(i5));
    }
}
