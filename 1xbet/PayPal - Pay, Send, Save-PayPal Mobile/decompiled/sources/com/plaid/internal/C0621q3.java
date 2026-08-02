package com.plaid.internal;

/* renamed from: com.plaid.internal.q3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0621q3 implements dagger.internal.Factory<com.plaid.internal.L7> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider<com.plaid.internal.C0457b1> f6544a;

    public C0621q3(com.plaid.internal.C0504d3 c0504d3, javax.inject.Provider<com.plaid.internal.C0457b1> provider) {
        this.f6544a = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.C0457b1 c0457b1 = this.f6544a.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0457b1, "");
        return (com.plaid.internal.L7) dagger.internal.Preconditions.checkNotNullFromProvides(new com.plaid.internal.L7(new com.plaid.internal.C0469c3(c0457b1)));
    }
}
