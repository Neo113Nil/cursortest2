package com.moloco.sdk.internal.services;

import android.content.Context;
import android.content.pm.PackageInfo;
import androidx.webkit.WebViewCompat;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class K {
    public static final int c = 8;

    /* renamed from: a, reason: collision with root package name */
    public final Context f10728a;
    public final MetricsRecorder b;

    public K(Context context, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f10728a = context;
        this.b = metricsRecorder;
    }

    public final Object a() {
        PackageInfo currentWebViewPackage = WebViewCompat.getCurrentWebViewPackage(this.f10728a);
        if (currentWebViewPackage == null) {
            a("no_package");
            Result.Companion companion = Result.INSTANCE;
            return Result.m8079constructorimpl(ResultKt.createFailure(new Exception("No current WebView package exists")));
        }
        try {
            int applicationEnabledSetting = this.f10728a.getPackageManager().getApplicationEnabledSetting(currentWebViewPackage.packageName);
            if (applicationEnabledSetting == 2) {
                a("disabled_by_system");
                Result.Companion companion2 = Result.INSTANCE;
                return Result.m8079constructorimpl(ResultKt.createFailure(new Exception("WebView component is disabled by system")));
            }
            if (applicationEnabledSetting == 3) {
                a("disabled_by_user");
                Result.Companion companion3 = Result.INSTANCE;
                return Result.m8079constructorimpl(ResultKt.createFailure(new Exception("WebView component is disabled by user")));
            }
            if (applicationEnabledSetting != 4) {
                Result.Companion companion4 = Result.INSTANCE;
                return Result.m8079constructorimpl(Unit.INSTANCE);
            }
            a("disabled_until_used");
            Result.Companion companion5 = Result.INSTANCE;
            return Result.m8079constructorimpl(ResultKt.createFailure(new Exception("WebView component is disabled until used")));
        } catch (IllegalArgumentException e) {
            a("unknown_package");
            Result.Companion companion6 = Result.INSTANCE;
            return Result.m8079constructorimpl(ResultKt.createFailure(e));
        }
    }

    public final void a(String str) {
        this.b.recordCountEvent(new CountEvent(com.moloco.sdk.internal.client_metrics_data.b.Z.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.b.c(), str));
    }
}
