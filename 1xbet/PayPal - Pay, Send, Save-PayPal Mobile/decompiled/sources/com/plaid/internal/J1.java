package com.plaid.internal;

/* loaded from: classes16.dex */
public final class J1 implements dagger.internal.Factory<com.plaid.internal.C> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.I1 f5816a;
    public final javax.inject.Provider<com.plaid.internal.T3> b;
    public final javax.inject.Provider<kotlinx.serialization.json.Json> c;

    public J1(com.plaid.internal.I1 i1, javax.inject.Provider<com.plaid.internal.T3> provider, javax.inject.Provider<kotlinx.serialization.json.Json> provider2) {
        this.f5816a = i1;
        this.b = provider;
        this.c = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.T3 t3 = this.b.get();
        kotlinx.serialization.json.Json json = this.c.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(t3, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(json, "");
        return (com.plaid.internal.C) dagger.internal.Preconditions.checkNotNullFromProvides(new com.plaid.internal.C(t3, json));
    }
}
