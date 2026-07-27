package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

import android.content.Context;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.ortb.model.C4782e;
import com.moloco.sdk.service_locator.a;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C4816c;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class o {
    public static /* synthetic */ m a(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, j jVar, C4782e c4782e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, z zVar, MetricsRecorder metricsRecorder, int i, Object obj) {
        if ((i & 4) != 0) {
            jVar = null;
        }
        return a(context, aVar, jVar, c4782e, rVar, zVar, metricsRecorder);
    }

    public static final m<h, i> a(Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, j jVar, C4782e bid, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, z watermark, MetricsRecorder metricsRecorder) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new C4816c(context, customUserEventBuilderService, jVar, bid, externalLinkHandler, watermark, metricsRecorder);
    }

    public static /* synthetic */ m a(Context context, String str, com.moloco.sdk.internal.services.s sVar, z zVar, MetricsRecorder metricsRecorder, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a aVar, int i, Object obj) {
        if ((i & 32) != 0) {
            z = true;
        }
        boolean z2 = z;
        if ((i & 64) != 0) {
            aVar = null;
        }
        return a(context, str, sVar, zVar, metricsRecorder, z2, aVar);
    }

    public static final m<v, u> a(Context context, String adm, com.moloco.sdk.internal.services.s clickthroughService, z watermark, MetricsRecorder metricsRecorder, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.templates.renderer.a aVar) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adm, "adm");
        Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new J(context, adm, clickthroughService, watermark, a.h.f10873a.f(), a.i.f10874a.c(), metricsRecorder, z, aVar);
    }
}
