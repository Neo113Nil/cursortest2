package com.moloco.sdk.acm.recorder;

import com.moloco.sdk.acm.AndroidClientMetrics;
import com.moloco.sdk.acm.CountEvent;
import com.moloco.sdk.acm.TimerEvent;
import com.moloco.sdk.acm.recorder.MetricsRecorder;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class a implements MetricsRecorder {

    /* renamed from: a, reason: collision with root package name */
    public final String f10414a;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.moloco.sdk.acm.recorder.MetricsRecorder
    public void recordCountEvent(CountEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = this.f10414a;
        if (str == null || str.length() == 0) {
            AndroidClientMetrics.INSTANCE.recordCountEvent$moloco_android_client_metrics_release(event);
        } else {
            AndroidClientMetrics.INSTANCE.recordCountEvent$moloco_android_client_metrics_release(event.withTag(b.f10415a, this.f10414a));
        }
    }

    @Override // com.moloco.sdk.acm.recorder.MetricsRecorder
    public void recordTimerEvent(TimerEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        String str = this.f10414a;
        if (str == null || str.length() == 0) {
            AndroidClientMetrics.INSTANCE.recordTimerEvent$moloco_android_client_metrics_release(event);
        } else {
            AndroidClientMetrics.INSTANCE.recordTimerEvent$moloco_android_client_metrics_release(event.withTag(b.f10415a, this.f10414a));
        }
    }

    @Override // com.moloco.sdk.acm.recorder.MetricsRecorder
    public TimerEvent startTimerEvent(String str) {
        return MetricsRecorder.a.a(this, str);
    }

    public a(String str) {
        this.f10414a = str;
    }

    public /* synthetic */ a(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
