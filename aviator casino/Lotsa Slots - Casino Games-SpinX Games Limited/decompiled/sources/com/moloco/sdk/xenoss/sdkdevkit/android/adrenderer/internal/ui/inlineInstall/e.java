package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

/* loaded from: classes5.dex */
public final class e implements com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l {
    public static final int j = 8;

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.h f7626a;
    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final java.lang.String g;
    public final java.lang.String h;
    public final com.moloco.sdk.acm.recorder.MetricsRecorder i;

    public e(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.h inlineInstallSheetLauncher, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r fallbackHandler, boolean z, boolean z2, boolean z3, boolean z4, java.lang.String str, java.lang.String str2, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(inlineInstallSheetLauncher, "inlineInstallSheetLauncher");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(fallbackHandler, "fallbackHandler");
        this.f7626a = inlineInstallSheetLauncher;
        this.b = fallbackHandler;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = z4;
        this.g = str;
        this.h = str2;
        this.i = metricsRecorder;
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l
    public void a(java.lang.String url) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(url, "url");
        if (this.c) {
            this.f7626a.b(url, this.b);
        } else {
            this.b.a(url);
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l
    public void b(java.lang.String str) {
        if (this.d && !this.f) {
            this.f7626a.a(str, this.b);
            return;
        }
        if (this.f) {
            java.lang.String str2 = this.g;
            if (str2 != null) {
                str = str2;
            }
            if (str != null) {
                this.b.a(str);
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.i;
                if (metricsRecorder != null) {
                    metricsRecorder.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.R.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "auto_fullsheet_shown_complete"));
                }
                java.lang.String str3 = this.h;
                if (str3 != null) {
                    com.moloco.sdk.service_locator.a.i.f7350a.c().a(str3);
                }
            }
        }
    }

    @Override // com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l
    public void c(java.lang.String str) {
        if (this.e && !this.f) {
            this.f7626a.a(str, this.b);
            return;
        }
        if (this.f) {
            java.lang.String str2 = this.g;
            if (str2 != null) {
                str = str2;
            }
            if (str != null) {
                this.b.a(str);
                com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.i;
                if (metricsRecorder != null) {
                    metricsRecorder.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.R.c()).withTag(com.moloco.sdk.internal.client_metrics_data.d.d.c(), "auto_fullsheet_shown_skip"));
                }
                java.lang.String str3 = this.h;
                if (str3 != null) {
                    com.moloco.sdk.service_locator.a.i.f7350a.c().a(str3);
                }
            }
        }
    }
}
