package com.moloco.sdk.internal.client_metrics_data;

/* loaded from: classes5.dex */
public final class a {
    public static final com.moloco.sdk.internal.client_metrics_data.a.C0173a c = new com.moloco.sdk.internal.client_metrics_data.a.C0173a(null);
    public static final int d = 8;
    public static final java.lang.String e = "AcmClickDeduper";

    /* renamed from: a, reason: collision with root package name */
    public final com.moloco.sdk.acm.recorder.MetricsRecorder f6939a;
    public java.util.concurrent.atomic.AtomicBoolean b;

    /* renamed from: com.moloco.sdk.internal.client_metrics_data.a$a, reason: collision with other inner class name */
    public static final class C0173a {
        public /* synthetic */ C0173a(kotlin.jvm.internal.DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public C0173a() {
        }
    }

    public a(com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f6939a = metricsRecorder;
        this.b = new java.util.concurrent.atomic.AtomicBoolean(false);
    }

    public final void a() {
        this.b.set(false);
    }

    public final void a(com.moloco.sdk.publisher.AdFormatType adType) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adType, "adType");
        if (this.b.compareAndSet(false, true)) {
            com.moloco.sdk.internal.MolocoLogger.info$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, e, "Deduped click logged", null, false, 12, null);
            com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder = this.f6939a;
            com.moloco.sdk.acm.CountEvent countEvent = new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.E.c());
            java.lang.String c2 = com.moloco.sdk.internal.client_metrics_data.d.c.c();
            java.lang.String lowerCase = adType.name().toLowerCase(java.util.Locale.ROOT);
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            metricsRecorder.recordCountEvent(countEvent.withTag(c2, lowerCase));
        }
        this.b.set(true);
    }
}
