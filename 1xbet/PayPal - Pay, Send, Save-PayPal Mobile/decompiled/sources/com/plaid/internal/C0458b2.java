package com.plaid.internal;

/* renamed from: com.plaid.internal.b2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0458b2 implements dagger.internal.Factory<com.plaid.internal.O7> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.I1 f5999a;
    public final javax.inject.Provider<com.plaid.internal.T3> b;

    public C0458b2(com.plaid.internal.I1 i1, javax.inject.Provider<com.plaid.internal.T3> provider) {
        this.f5999a = i1;
        this.b = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.T3 t3 = this.b.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t3, "");
        return (com.plaid.internal.O7) dagger.internal.Preconditions.checkNotNullFromProvides(new com.plaid.internal.O7(t3));
    }
}
