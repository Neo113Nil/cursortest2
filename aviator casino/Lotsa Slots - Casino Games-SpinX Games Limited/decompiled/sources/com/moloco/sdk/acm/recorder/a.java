package com.moloco.sdk.acm.recorder;

/* loaded from: classes5.dex */
public final class a implements com.moloco.sdk.acm.recorder.MetricsRecorder {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6912a;

    /* JADX WARN: Multi-variable type inference failed */
    public a() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // com.moloco.sdk.acm.recorder.MetricsRecorder
    public void recordCountEvent(com.moloco.sdk.acm.CountEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        java.lang.String str = this.f6912a;
        if (str == null || str.length() == 0) {
            com.moloco.sdk.acm.AndroidClientMetrics.INSTANCE.recordCountEvent$moloco_android_client_metrics_release(event);
        } else {
            com.moloco.sdk.acm.AndroidClientMetrics.INSTANCE.recordCountEvent$moloco_android_client_metrics_release(event.withTag(com.moloco.sdk.acm.recorder.b.f6913a, this.f6912a));
        }
    }

    @Override // com.moloco.sdk.acm.recorder.MetricsRecorder
    public void recordTimerEvent(com.moloco.sdk.acm.TimerEvent event) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(event, "event");
        java.lang.String str = this.f6912a;
        if (str == null || str.length() == 0) {
            com.moloco.sdk.acm.AndroidClientMetrics.INSTANCE.recordTimerEvent$moloco_android_client_metrics_release(event);
        } else {
            com.moloco.sdk.acm.AndroidClientMetrics.INSTANCE.recordTimerEvent$moloco_android_client_metrics_release(event.withTag(com.moloco.sdk.acm.recorder.b.f6913a, this.f6912a));
        }
    }

    @Override // com.moloco.sdk.acm.recorder.MetricsRecorder
    public com.moloco.sdk.acm.TimerEvent startTimerEvent(java.lang.String str) {
        return com.moloco.sdk.acm.recorder.MetricsRecorder.a.a(this, str);
    }

    public a(java.lang.String str) {
        this.f6912a = str;
    }

    public /* synthetic */ a(java.lang.String str, int i, kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str);
    }
}
