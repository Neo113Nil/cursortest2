package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.ui.inlineInstall;

import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class i {
    public static final int h = 8;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f11164a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final String e;
    public final String f;
    public final MetricsRecorder g;

    public i(boolean z, boolean z2, boolean z3, boolean z4, String str, String str2, MetricsRecorder metricsRecorder) {
        this.f11164a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
        this.e = str;
        this.f = str2;
        this.g = metricsRecorder;
    }

    public final k a(r externalLinkHandler, g gVar) {
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        return ((this.f11164a || this.c || this.b) && gVar != null) ? new e(gVar, externalLinkHandler, this.f11164a, this.b, this.c, this.d, this.e, this.f, this.g) : new f(externalLinkHandler);
    }
}
