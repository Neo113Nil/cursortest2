package com.plaid.internal;

/* renamed from: com.plaid.internal.z1, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0699z1 implements dagger.internal.Factory<com.plaid.internal.C0690y1> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider<com.plaid.internal.H5> f6643a;
    public final javax.inject.Provider<kotlinx.serialization.json.Json> b;

    public C0699z1(javax.inject.Provider<com.plaid.internal.H5> provider, javax.inject.Provider<kotlinx.serialization.json.Json> provider2) {
        this.f6643a = provider;
        this.b = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        return new com.plaid.internal.C0690y1(this.f6643a.get(), dagger.internal.DoubleCheck.lazy(this.b));
    }
}
