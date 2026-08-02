package com.plaid.internal;

/* renamed from: com.plaid.internal.r3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0629r3 implements dagger.internal.Factory<com.plaid.internal.i8> {

    /* renamed from: a, reason: collision with root package name */
    public final javax.inject.Provider<com.plaid.internal.E5> f6555a;
    public final javax.inject.Provider<com.plaid.internal.C0587m5> b;

    public C0629r3(com.plaid.internal.C0504d3 c0504d3, javax.inject.Provider<com.plaid.internal.E5> provider, javax.inject.Provider<com.plaid.internal.C0587m5> provider2) {
        this.f6555a = provider;
        this.b = provider2;
    }

    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        java.lang.String str;
        com.plaid.internal.E5 e5 = this.f6555a.get();
        com.plaid.internal.C0587m5 c0587m5 = this.b.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0587m5, "");
        com.plaid.internal.EnumC0560j5 b = c0587m5.b();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(b, "");
        int i = com.plaid.internal.C0569k5.f6463a[b.ordinal()];
        if (i != 1) {
            if (i == 2) {
                str = "https://development.plaid.com/";
            } else if (i == 3) {
                str = "https://sandbox.plaid.com/";
            }
            java.lang.Object create = e5.a(str, new com.plaid.internal.G5(null, 3)).create(com.plaid.internal.i8.class);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create, "");
            return (com.plaid.internal.i8) dagger.internal.Preconditions.checkNotNullFromProvides((com.plaid.internal.i8) create);
        }
        str = "https://production.plaid.com/";
        java.lang.Object create2 = e5.a(str, new com.plaid.internal.G5(null, 3)).create(com.plaid.internal.i8.class);
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(create2, "");
        return (com.plaid.internal.i8) dagger.internal.Preconditions.checkNotNullFromProvides((com.plaid.internal.i8) create2);
    }
}
