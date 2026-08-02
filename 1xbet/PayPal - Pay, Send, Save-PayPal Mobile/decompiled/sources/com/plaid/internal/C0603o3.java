package com.plaid.internal;

/* renamed from: com.plaid.internal.o3, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0603o3 implements dagger.internal.Factory<com.plaid.internal.n8> {

    /* renamed from: a, reason: collision with root package name */
    public final dagger.internal.Factory f6517a;
    public final javax.inject.Provider<com.plaid.internal.I5> b;
    public final javax.inject.Provider<com.plaid.internal.C0457b1> c;
    public final com.plaid.internal.C0513e3 d;
    public final javax.inject.Provider<java.lang.String> e;

    public C0603o3(com.plaid.internal.C0504d3 c0504d3, dagger.internal.Factory factory, javax.inject.Provider provider, javax.inject.Provider provider2, com.plaid.internal.C0513e3 c0513e3, javax.inject.Provider provider3) {
        this.f6517a = factory;
        this.b = provider;
        this.c = provider2;
        this.d = c0513e3;
        this.e = provider3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider, jakarta.inject.Provider
    public final java.lang.Object get() {
        android.app.Application application = (android.app.Application) this.f6517a.get();
        com.plaid.internal.I5 i5 = this.b.get();
        com.plaid.internal.C0457b1 c0457b1 = this.c.get();
        com.plaid.internal.C0518f c0518f = (com.plaid.internal.C0518f) this.d.get();
        java.lang.String str = this.e.get();
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(i5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0457b1, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0518f, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        com.plaid.internal.O4 o4 = com.plaid.internal.O4.f5870a;
        java.lang.String a2 = com.plaid.internal.G0.a(application);
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0457b1, "");
        java.lang.String version_name = com.plaid.link.Plaid.getVERSION_NAME();
        android.os.Bundle bundle = i5.f5812a.getPackageManager().getApplicationInfo(i5.f5812a.getPackageName(), 128).metaData;
        java.lang.String string = bundle != null ? bundle.getString("com.plaid.link.react_native") : null;
        android.os.Bundle bundle2 = i5.f5812a.getPackageManager().getApplicationInfo(i5.f5812a.getPackageName(), 128).metaData;
        java.lang.String string2 = bundle2 != null ? bundle2.getString("com.github.jorgefspereira.plaid_flutter.version") : null;
        java.lang.String packageName = application.getPackageName();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "");
        java.lang.String a3 = com.plaid.internal.Q.a(application);
        android.content.pm.PackageManager packageManager = application.getPackageManager();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageManager, "");
        return (com.plaid.internal.n8) dagger.internal.Preconditions.checkNotNullFromProvides(new com.plaid.internal.n8(a2, version_name, string, string2, str, packageName, a3, packageManager, c0518f.a(application), new com.plaid.internal.C0459b3(c0457b1)));
    }
}
