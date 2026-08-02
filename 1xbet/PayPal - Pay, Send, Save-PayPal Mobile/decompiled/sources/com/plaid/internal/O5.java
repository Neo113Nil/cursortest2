package com.plaid.internal;

/* loaded from: classes16.dex */
public final class O5 implements dagger.internal.Factory<com.plaid.internal.N5> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.Factory f5871a;

    public O5(dagger.internal.Factory factory) {
        this.f5871a = factory;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        return new com.plaid.internal.N5((android.app.Application) this.f5871a.get());
    }
}
