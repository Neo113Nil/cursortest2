package com.moloco.sdk.acm.recorder;

@kotlin.Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u0000 \u000b2\u00020\u0001:\u0001\u000bJ\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0007H&¨\u0006\f"}, d2 = {"Lcom/moloco/sdk/acm/recorder/MetricsRecorder;", "", "recordCountEvent", "", androidx.core.app.NotificationCompat.CATEGORY_EVENT, "Lcom/moloco/sdk/acm/CountEvent;", "startTimerEvent", "Lcom/moloco/sdk/acm/TimerEvent;", com.ironsource.X3.i.j0, "", "recordTimerEvent", com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.vast.k.M, "moloco-android-client-metrics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface MetricsRecorder {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final com.moloco.sdk.acm.recorder.MetricsRecorder.Companion INSTANCE = com.moloco.sdk.acm.recorder.MetricsRecorder.Companion.$$INSTANCE;

    @kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0006\u0010\b\u001a\u00020\u0005¨\u0006\t"}, d2 = {"Lcom/moloco/sdk/acm/recorder/MetricsRecorder$Companion;", "", "<init>", "()V", "create", "Lcom/moloco/sdk/acm/recorder/MetricsRecorder;", "mediation", "", "withNoMediation", "moloco-android-client-metrics_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ com.moloco.sdk.acm.recorder.MetricsRecorder.Companion $$INSTANCE = new com.moloco.sdk.acm.recorder.MetricsRecorder.Companion();

        private Companion() {
        }

        public final com.moloco.sdk.acm.recorder.MetricsRecorder create(java.lang.String mediation) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediation, "mediation");
            return new com.moloco.sdk.acm.recorder.a(mediation);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final com.moloco.sdk.acm.recorder.MetricsRecorder withNoMediation() {
            return new com.moloco.sdk.acm.recorder.a(null, 1, 0 == true ? 1 : 0);
        }
    }

    public static final class a {
        public static com.moloco.sdk.acm.TimerEvent a(com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder, java.lang.String eventName) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(eventName, "eventName");
            return com.moloco.sdk.acm.AndroidClientMetrics.INSTANCE.startTimerEvent$moloco_android_client_metrics_release(eventName);
        }
    }

    void recordCountEvent(com.moloco.sdk.acm.CountEvent event);

    void recordTimerEvent(com.moloco.sdk.acm.TimerEvent event);

    com.moloco.sdk.acm.TimerEvent startTimerEvent(java.lang.String eventName);
}
