package com.plaid.internal;

/* loaded from: classes16.dex */
public final class J7 implements dagger.internal.Factory<com.plaid.internal.I7> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider<com.plaid.internal.C0683x3> f5820a;
    public final javax.inject.Provider<com.plaid.internal.B6> b;

    public J7(javax.inject.Provider<com.plaid.internal.C0683x3> provider, javax.inject.Provider<com.plaid.internal.B6> provider2) {
        this.f5820a = provider;
        this.b = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        return new com.plaid.internal.I7(this.f5820a.get(), this.b.get());
    }
}
