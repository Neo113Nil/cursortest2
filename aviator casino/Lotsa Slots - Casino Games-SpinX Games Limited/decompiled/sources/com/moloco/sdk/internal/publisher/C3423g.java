package com.moloco.sdk.internal.publisher;

/* renamed from: com.moloco.sdk.internal.publisher.g, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3423g {
    public static /* synthetic */ com.moloco.sdk.internal.publisher.y a(com.moloco.sdk.publisher.AdLoad.Listener listener, com.moloco.sdk.acm.TimerEvent timerEvent, com.moloco.sdk.publisher.AdFormatType adFormatType, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, kotlin.jvm.functions.Function0 function0, int i, java.lang.Object obj) {
        if ((i & 16) != 0) {
            function0 = null;
        }
        return a(listener, timerEvent, adFormatType, metricsRecorder, function0);
    }

    public static final com.moloco.sdk.internal.publisher.y a(com.moloco.sdk.publisher.AdLoad.Listener listener, com.moloco.sdk.acm.TimerEvent acmLoadTimerEvent, com.moloco.sdk.publisher.AdFormatType adFormatType, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, kotlin.jvm.functions.Function0<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.i> function0) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(acmLoadTimerEvent, "acmLoadTimerEvent");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new com.moloco.sdk.internal.publisher.C3422f(listener, com.moloco.sdk.internal.y.b(), acmLoadTimerEvent, adFormatType, metricsRecorder, function0);
    }
}
