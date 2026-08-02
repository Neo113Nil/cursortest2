package com.plaid.internal;

/* renamed from: com.plaid.internal.l6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0579l6 implements dagger.internal.Factory<com.plaid.internal.C0570k6> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider<com.plaid.internal.Z2> f6478a;
    public final javax.inject.Provider<com.plaid.internal.Y2> b;
    public final javax.inject.Provider<com.plaid.internal.N5> c;
    public final javax.inject.Provider<com.plaid.internal.C0457b1> d;
    public final com.plaid.internal.C0597n6 e;
    public final javax.inject.Provider<com.plaid.internal.L7> f;

    public C0579l6(javax.inject.Provider provider, javax.inject.Provider provider2, javax.inject.Provider provider3, javax.inject.Provider provider4, com.plaid.internal.C0597n6 c0597n6, javax.inject.Provider provider5) {
        this.f6478a = provider;
        this.b = provider2;
        this.c = provider3;
        this.d = provider4;
        this.e = c0597n6;
        this.f = provider5;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        return new com.plaid.internal.C0570k6(this.f6478a.get(), this.b.get(), this.c.get(), this.d.get(), (com.plaid.internal.C0588m6) this.e.get(), this.f.get());
    }
}
