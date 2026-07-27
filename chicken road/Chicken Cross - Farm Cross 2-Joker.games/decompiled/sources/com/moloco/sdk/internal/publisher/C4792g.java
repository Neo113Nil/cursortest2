package com.moloco.sdk.internal.publisher;

import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import com.moloco.sdk.publisher.AdFormatType;
import com.moloco.sdk.publisher.AdLoad;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.moloco.sdk.internal.publisher.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C4792g {
    public static /* synthetic */ z a(AdLoad.Listener listener, TimerEvent timerEvent, AdFormatType adFormatType, MetricsRecorder metricsRecorder, Function0 function0, int i, Object obj) {
        if ((i & 16) != 0) {
            function0 = null;
        }
        return a(listener, timerEvent, adFormatType, metricsRecorder, function0);
    }

    public static final z a(AdLoad.Listener listener, TimerEvent acmLoadTimerEvent, AdFormatType adFormatType, MetricsRecorder metricsRecorder, Function0<? extends com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.j> function0) {
        Intrinsics.checkNotNullParameter(acmLoadTimerEvent, "acmLoadTimerEvent");
        Intrinsics.checkNotNullParameter(adFormatType, "adFormatType");
        Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        return new C4791f(listener, com.moloco.sdk.internal.A.b(), acmLoadTimerEvent, adFormatType, metricsRecorder, function0);
    }
}
