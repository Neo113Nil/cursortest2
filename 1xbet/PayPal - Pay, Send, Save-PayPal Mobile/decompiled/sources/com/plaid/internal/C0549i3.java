package com.plaid.internal;

/* renamed from: com.plaid.internal.i3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0549i3 implements dagger.internal.Factory<com.plaid.internal.C0630r4> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0504d3 f6437a;
    public final javax.inject.Provider<com.plaid.internal.T3> b;

    public C0549i3(com.plaid.internal.C0504d3 c0504d3, javax.inject.Provider<com.plaid.internal.T3> provider) {
        this.f6437a = c0504d3;
        this.b = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.T3 t3 = this.b.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t3, "");
        return (com.plaid.internal.C0630r4) dagger.internal.Preconditions.checkNotNullFromProvides(new com.plaid.internal.C0630r4(t3));
    }
}
