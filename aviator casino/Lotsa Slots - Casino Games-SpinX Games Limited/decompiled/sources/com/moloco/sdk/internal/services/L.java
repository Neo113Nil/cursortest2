package com.moloco.sdk.internal.services;

/* loaded from: classes5.dex */
public final class L {
    public static final int c = 8;

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f7208a;
    public final com.moloco.sdk.acm.recorder.MetricsRecorder b;

    public L(android.content.Context context, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f7208a = context;
        this.b = metricsRecorder;
    }

    public final java.lang.Object a() {
        android.content.pm.PackageInfo currentWebViewPackage = androidx.webkit.WebViewCompat.getCurrentWebViewPackage(this.f7208a);
        if (currentWebViewPackage == null) {
            a("no_package");
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("No current WebView package exists")));
        }
        try {
            int applicationEnabledSetting = this.f7208a.getPackageManager().getApplicationEnabledSetting(currentWebViewPackage.packageName);
            if (applicationEnabledSetting == 2) {
                a("disabled_by_system");
                kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
                return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("WebView component is disabled by system")));
            }
            if (applicationEnabledSetting == 3) {
                a("disabled_by_user");
                kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
                return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("WebView component is disabled by user")));
            }
            if (applicationEnabledSetting != 4) {
                kotlin.Result.Companion companion4 = kotlin.Result.INSTANCE;
                return kotlin.Result.m10798constructorimpl(kotlin.Unit.INSTANCE);
            }
            a("disabled_until_used");
            kotlin.Result.Companion companion5 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(new java.lang.Exception("WebView component is disabled until used")));
        } catch (java.lang.IllegalArgumentException e) {
            a("unknown_package");
            kotlin.Result.Companion companion6 = kotlin.Result.INSTANCE;
            return kotlin.Result.m10798constructorimpl(kotlin.ResultKt.createFailure(e));
        }
    }

    public final void a(java.lang.String str) {
        this.b.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.Z.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), str));
    }
}
