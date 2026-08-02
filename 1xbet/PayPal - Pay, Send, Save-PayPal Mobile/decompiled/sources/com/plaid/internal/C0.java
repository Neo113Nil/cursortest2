package com.plaid.internal;

/* loaded from: classes16.dex */
public final class C0 implements dagger.internal.Factory<com.plaid.internal.A0> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider<com.plaid.internal.InterfaceC0695y6> f5760a;

    public C0(javax.inject.Provider<com.plaid.internal.InterfaceC0695y6> provider) {
        this.f5760a = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        return new com.plaid.internal.A0(this.f5760a.get());
    }
}
