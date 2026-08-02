package com.plaid.internal;

/* renamed from: com.plaid.internal.s3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0638s3 implements dagger.internal.Factory<com.plaid.internal.y8> {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.C0549i3 f6565a;

    public C0638s3(com.plaid.internal.C0504d3 c0504d3, com.plaid.internal.C0549i3 c0549i3) {
        this.f6565a = c0549i3;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        com.plaid.internal.C0630r4 c0630r4 = (com.plaid.internal.C0630r4) this.f6565a.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0630r4, "");
        return (com.plaid.internal.y8) dagger.internal.Preconditions.checkNotNullFromProvides(c0630r4);
    }
}
