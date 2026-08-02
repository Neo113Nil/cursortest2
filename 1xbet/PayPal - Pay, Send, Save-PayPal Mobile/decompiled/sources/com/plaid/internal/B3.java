package com.plaid.internal;

/* loaded from: classes16.dex */
public final class B3 implements dagger.internal.Factory<com.plaid.internal.C0683x3> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0629r3 f5756a;
    public final com.plaid.internal.C0531g3 b;

    public B3(com.plaid.internal.C0629r3 c0629r3, com.plaid.internal.C0531g3 c0531g3) {
        this.f5756a = c0629r3;
        this.b = c0531g3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        return new com.plaid.internal.C0683x3((com.plaid.internal.i8) this.f5756a.get(), (com.plaid.internal.A3) this.b.get());
    }
}
