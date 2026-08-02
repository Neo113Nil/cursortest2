package com.plaid.internal;

/* renamed from: com.plaid.internal.a2, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0448a2 implements dagger.internal.Factory<com.plaid.internal.M7> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.I1 f5993a;
    public final javax.inject.Provider<com.plaid.internal.T3> b;

    public C0448a2(com.plaid.internal.I1 i1, javax.inject.Provider<com.plaid.internal.T3> provider) {
        this.f5993a = i1;
        this.b = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.T3 t3 = this.b.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t3, "");
        return (com.plaid.internal.M7) dagger.internal.Preconditions.checkNotNullFromProvides(new com.plaid.internal.M7(t3));
    }
}
