package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer;

/* loaded from: classes5.dex */
public final class n {
    public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l a(android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a aVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i iVar, com.moloco.sdk.internal.ortb.model.C3415e c3415e, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r rVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, int i, java.lang.Object obj) {
        if ((i & 4) != 0) {
            iVar = null;
        }
        return a(context, aVar, iVar, c3415e, rVar, yVar, metricsRecorder);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.g, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.h> a(android.content.Context context, com.moloco.sdk.xenoss.sdkdevkit.android.core.services.a customUserEventBuilderService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i iVar, com.moloco.sdk.internal.ortb.model.C3415e bid, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.r externalLinkHandler, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(customUserEventBuilderService, "customUserEventBuilderService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bid, "bid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(externalLinkHandler, "externalLinkHandler");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.C3446c(context, customUserEventBuilderService, iVar, bid, externalLinkHandler, watermark, metricsRecorder);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.u, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.t> a(android.content.Context context, java.lang.String adm, com.moloco.sdk.internal.services.s clickthroughService, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, boolean z) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adm, "adm");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickthroughService, "clickthroughService");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.J(context, adm, clickthroughService, watermark, com.moloco.sdk.service_locator.a.h.f7349a.f(), com.moloco.sdk.service_locator.a.i.f7350a.c(), metricsRecorder, z);
    }
}
