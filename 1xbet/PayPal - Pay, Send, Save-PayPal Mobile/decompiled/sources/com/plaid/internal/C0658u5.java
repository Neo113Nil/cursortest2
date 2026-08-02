package com.plaid.internal;

/* renamed from: com.plaid.internal.u5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0658u5 implements dagger.internal.Factory<com.plaid.internal.C0457b1> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0623q5 f6590a;
    public final javax.inject.Provider<com.plaid.internal.AbstractC0502d1> b;

    public C0658u5(com.plaid.internal.C0623q5 c0623q5, javax.inject.Provider<com.plaid.internal.AbstractC0502d1> provider) {
        this.f6590a = c0623q5;
        this.b = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.AbstractC0502d1 abstractC0502d1 = this.b.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(abstractC0502d1, "");
        return (com.plaid.internal.C0457b1) dagger.internal.Preconditions.checkNotNullFromProvides(new com.plaid.internal.C0457b1(abstractC0502d1));
    }
}
