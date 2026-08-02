package com.plaid.internal;

/* loaded from: classes16.dex */
public final class M1 implements dagger.internal.Factory<com.plaid.internal.F> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0629r3 f5841a;

    public M1(com.plaid.internal.I1 i1, com.plaid.internal.C0629r3 c0629r3) {
        this.f5841a = c0629r3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.i8 i8Var = (com.plaid.internal.i8) this.f5841a.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i8Var, "");
        return (com.plaid.internal.F) dagger.internal.Preconditions.checkNotNullFromProvides(new com.plaid.internal.F(i8Var));
    }
}
