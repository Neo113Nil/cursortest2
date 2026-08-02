package com.plaid.internal;

/* loaded from: classes16.dex */
public final class X1 implements dagger.internal.Factory<com.plaid.internal.C0651t7> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider<com.plaid.internal.InterfaceC0669v7> f5970a;
    public final com.plaid.internal.W1 b;

    public X1(com.plaid.internal.I1 i1, javax.inject.Provider provider, com.plaid.internal.W1 w1) {
        this.f5970a = provider;
        this.b = w1;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.InterfaceC0669v7 interfaceC0669v7 = this.f5970a.get();
        com.plaid.internal.InterfaceC0535g7 interfaceC0535g7 = (com.plaid.internal.InterfaceC0535g7) this.b.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interfaceC0669v7, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(interfaceC0535g7, "");
        return (com.plaid.internal.C0651t7) dagger.internal.Preconditions.checkNotNullFromProvides(new com.plaid.internal.C0651t7(interfaceC0669v7, interfaceC0535g7));
    }
}
