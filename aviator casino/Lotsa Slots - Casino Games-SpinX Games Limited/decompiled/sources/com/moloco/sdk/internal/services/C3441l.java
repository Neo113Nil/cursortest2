package com.moloco.sdk.internal.services;

/* renamed from: com.moloco.sdk.internal.services.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3441l implements com.moloco.sdk.internal.services.InterfaceC3440k {
    public static final int c = 8;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7306a;
    public com.moloco.sdk.internal.services.C3439j b;

    public C3441l(android.content.Context context) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        this.f7306a = context;
    }

    @Override // com.moloco.sdk.internal.services.InterfaceC3440k
    public com.moloco.sdk.internal.services.C3439j invoke() {
        java.lang.Object m10798constructorimpl;
        com.moloco.sdk.internal.services.C3439j c3439j = this.b;
        if (c3439j != null) {
            return c3439j;
        }
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            android.content.Context context = this.f7306a;
            java.lang.String obj = context.getPackageManager().getApplicationLabel(context.getApplicationInfo()).toString();
            android.content.pm.PackageInfo a2 = com.moloco.sdk.internal.services.m.a(this.f7306a);
            java.lang.String packageName = a2.packageName;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(packageName, "packageName");
            java.lang.String versionName = a2.versionName;
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(versionName, "versionName");
            com.moloco.sdk.internal.services.C3439j c3439j2 = new com.moloco.sdk.internal.services.C3439j(obj, packageName, versionName);
            this.b = c3439j2;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(c3439j2);
        } catch (java.lang.Throwable th) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m10798constructorimpl = kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(th));
        }
        if (kotlin.Result.m10804isFailureimpl(m10798constructorimpl)) {
            m10798constructorimpl = null;
        }
        com.moloco.sdk.internal.services.C3439j c3439j3 = (com.moloco.sdk.internal.services.C3439j) m10798constructorimpl;
        return c3439j3 == null ? new com.moloco.sdk.internal.services.C3439j("", "", "") : c3439j3;
    }
}
