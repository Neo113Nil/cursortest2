package com.plaid.internal;

/* renamed from: com.plaid.internal.n6, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0597n6 implements dagger.internal.Factory<com.plaid.internal.C0588m6> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider<com.plaid.internal.N5> f6509a;
    public final javax.inject.Provider<com.plaid.internal.C0471c5> b;
    public final javax.inject.Provider<kotlinx.serialization.json.Json> c;

    public C0597n6(javax.inject.Provider<com.plaid.internal.N5> provider, javax.inject.Provider<com.plaid.internal.C0471c5> provider2, javax.inject.Provider<kotlinx.serialization.json.Json> provider3) {
        this.f6509a = provider;
        this.b = provider2;
        this.c = provider3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        return new com.plaid.internal.C0588m6(this.f6509a.get(), this.b.get(), this.c.get());
    }
}
