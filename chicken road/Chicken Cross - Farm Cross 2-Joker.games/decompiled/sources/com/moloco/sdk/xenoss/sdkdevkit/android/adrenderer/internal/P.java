package com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal;

import android.content.Context;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.internal.ortb.model.C4782e;
import com.moloco.sdk.service_locator.a;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class P {
    public static /* synthetic */ com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m a(Context context, C4782e c4782e, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z zVar, MetricsRecorder metricsRecorder, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d dVar, InterfaceC4827m interfaceC4827m, int i, Object obj) {
        if ((i & 32) != 0) {
            dVar = com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.f.a(context);
        }
        com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d dVar2 = dVar;
        if ((i & 64) != 0) {
            interfaceC4827m = a.C1507a.f10866a.a();
        }
        return a(context, c4782e, z, zVar, metricsRecorder, dVar2, interfaceC4827m);
    }

    public static final com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.m<com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.x, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.y> a(Context context, C4782e bid, boolean z, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.z watermark, MetricsRecorder metricsRecorder, com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.d loadVast, InterfaceC4827m decLoader) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(bid, "bid");
        Intrinsics.checkNotNullParameter(watermark, "watermark");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        Intrinsics.checkNotNullParameter(loadVast, "loadVast");
        Intrinsics.checkNotNullParameter(decLoader, "decLoader");
        return new O(context, bid, loadVast, decLoader, z, watermark, metricsRecorder);
    }
}
