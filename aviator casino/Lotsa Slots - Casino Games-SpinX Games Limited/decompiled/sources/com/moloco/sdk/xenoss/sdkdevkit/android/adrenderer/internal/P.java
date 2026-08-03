package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

/* loaded from: classes5.dex */
public final class P {
    public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l a(android.content.Context context, com.moloco.sdk.internal.ortb.model.C3415e c3415e, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y yVar, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d dVar, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC3457m interfaceC3457m, int i, java.lang.Object obj) {
        if ((i & 32) != 0) {
            dVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f.a(context);
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d dVar2 = dVar;
        if ((i & 64) != 0) {
            interfaceC3457m = com.moloco.sdk.service_locator.a.C0211a.f7342a.a();
        }
        return a(context, c3415e, z, yVar, metricsRecorder, dVar2, interfaceC3457m);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.l<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.w, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x> a(android.content.Context context, com.moloco.sdk.internal.ortb.model.C3415e bid, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y watermark, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d loadVast, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.InterfaceC3457m decLoader) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(context, "context");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(bid, "bid");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(watermark, "watermark");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(loadVast, "loadVast");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(decLoader, "decLoader");
        return new com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.O(context, bid, loadVast, decLoader, z, watermark, metricsRecorder);
    }
}
