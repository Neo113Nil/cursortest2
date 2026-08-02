package com.plaid.internal;

/* renamed from: com.plaid.internal.c5, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C0471c5 {

    /* renamed from: a, reason: collision with root package name */
    public final com.plaid.internal.X6 f6008a;
    public final com.plaid.internal.C0456b0 b;
    public final com.plaid.internal.C0564k0 c;

    public C0471c5(android.app.Application application, com.plaid.internal.core.crashreporting.internal.models.SentryProject.LinkSdk linkSdk, java.lang.String str, com.plaid.internal.Z.a aVar, com.plaid.internal.E5 e5, com.plaid.internal.C0587m5 c0587m5, com.plaid.internal.M2 m2) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(application, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(linkSdk, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(e5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0587m5, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(m2, "");
        android.content.res.Resources resources = application.getResources();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(resources, "");
        com.plaid.internal.core.crashreporting.internal.models.CrashApiOptions crashOptions = com.plaid.internal.core.crashreporting.internal.models.CrashApiOptionsKt.toCrashOptions(linkSdk, resources, str);
        com.plaid.internal.W w = new com.plaid.internal.W(e5);
        com.plaid.internal.V.a aVar2 = com.plaid.internal.Z.a.b;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(aVar2, "");
        com.plaid.internal.X6 a2 = w.a(aVar2.f5945a);
        this.f6008a = a2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crashOptions, "");
        a2.c = crashOptions;
        android.content.Context applicationContext = application.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext, "");
        com.plaid.internal.C0456b0 c0456b0 = new com.plaid.internal.C0456b0(applicationContext, crashOptions, c0587m5);
        this.b = c0456b0;
        android.content.Context applicationContext2 = application.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(applicationContext2, "");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(c0456b0, "");
        java.io.File filesDir = applicationContext2.getFilesDir();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(filesDir, "");
        com.plaid.internal.C0537h0 c0537h0 = new com.plaid.internal.C0537h0(new com.plaid.internal.C0551i5(filesDir, "plaid-sdk/crashes"), c0456b0);
        android.content.Context applicationContext3 = application.getApplicationContext();
        kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(applicationContext3, "");
        com.plaid.internal.C0564k0 c0564k0 = new com.plaid.internal.C0564k0(applicationContext3, c0537h0, aVar2, crashOptions);
        this.c = c0564k0;
        new com.plaid.internal.Z4(c0456b0, c0564k0, m2).a();
    }

    public final void a(com.plaid.internal.X x) {
        com.plaid.internal.core.crashreporting.internal.models.Breadcrumb breadcrumb;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(x, "");
        com.plaid.internal.C0456b0 c0456b0 = this.b;
        if (x instanceof com.plaid.internal.C0514e4) {
            com.plaid.internal.C0514e4 c0514e4 = (com.plaid.internal.C0514e4) x;
            breadcrumb = new com.plaid.internal.core.crashreporting.internal.models.Breadcrumb(com.plaid.internal.core.crashreporting.internal.models.Breadcrumb.Type.NAVIGATION, x.f5968a, com.plaid.internal.X.a(c0514e4.d), c0514e4.b, null, c0514e4.c, 16, null);
        } else {
            if (!(x instanceof com.plaid.internal.A1)) {
                throw new kotlin.NoWhenBranchMatchedException();
            }
            com.plaid.internal.core.crashreporting.internal.models.Breadcrumb.Type type = com.plaid.internal.core.crashreporting.internal.models.Breadcrumb.Type.DEFAULT;
            com.plaid.internal.A1 a1 = (com.plaid.internal.A1) x;
            java.lang.String str = a1.b;
            java.util.Map<java.lang.String, java.lang.String> map = a1.c;
            int i = a1.d;
            java.util.Map mutableMap = kotlin.collections.MapsKt.toMutableMap(map);
            mutableMap.put("level", com.plaid.internal.X.a(i).name());
            breadcrumb = new com.plaid.internal.core.crashreporting.internal.models.Breadcrumb(type, x.f5968a, com.plaid.internal.X.a(a1.d), str, null, mutableMap, 16, null);
        }
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(breadcrumb, "");
        com.plaid.internal.P6<com.plaid.internal.core.crashreporting.internal.models.Breadcrumb> p6 = c0456b0.e;
        if (p6.f5883a.get(p6.c) != null) {
            p6.b = (p6.b + 1) % 50;
        }
        p6.f5883a.set(p6.c, breadcrumb);
        p6.c = (p6.c + 1) % 50;
        int i2 = p6.d;
        if (i2 != 50) {
            p6.d = i2 + 1;
        }
    }
}
