package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

/* loaded from: classes5.dex */
public final class j {
    public static final int h = 8;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7630a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final java.lang.String e;
    public final java.lang.String f;
    public final com.moloco.sdk.acm.recorder.MetricsRecorder g;

    public j(boolean z, boolean z2, boolean z3, boolean z4, java.lang.String str, java.lang.String str2, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        this.f7630a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = str;
        this.f = str2;
        this.g = metricsRecorder;
    }

    public final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.l a(com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.h hVar) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        return ((this.f7630a || this.c || this.b) && hVar != null) ? new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.e(hVar, externalLinkHandler, this.f7630a, this.b, this.c, this.d, this.e, this.f, this.g) : new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall.f(externalLinkHandler);
    }
}
