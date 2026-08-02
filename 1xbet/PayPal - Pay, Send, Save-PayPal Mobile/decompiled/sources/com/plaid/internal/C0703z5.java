package com.plaid.internal;

/* renamed from: com.plaid.internal.z5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0703z5 implements dagger.internal.Factory<com.plaid.internal.W4> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0623q5 f6649a;
    public final javax.inject.Provider<com.plaid.internal.H5> b;

    public C0703z5(com.plaid.internal.C0623q5 c0623q5, javax.inject.Provider<com.plaid.internal.H5> provider) {
        this.f6649a = c0623q5;
        this.b = provider;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.H5 h5 = this.b.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(h5, "");
        return (com.plaid.internal.W4) dagger.internal.Preconditions.checkNotNullFromProvides(new com.plaid.internal.W4(h5));
    }
}
