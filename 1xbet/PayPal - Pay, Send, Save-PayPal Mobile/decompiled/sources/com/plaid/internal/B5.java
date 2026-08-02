package com.plaid.internal;

/* loaded from: classes16.dex */
public final class B5 implements dagger.internal.Factory<com.plaid.internal.E5> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider<com.plaid.internal.I5> f5758a;

    public B5(com.plaid.internal.C0623q5 c0623q5, javax.inject.Provider<com.plaid.internal.I5> provider) {
        this.f5758a = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.I5 i5 = this.f5758a.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i5, "");
        return (com.plaid.internal.E5) dagger.internal.Preconditions.checkNotNullFromProvides(com.plaid.internal.E5.c.a(i5.a()));
    }
}
