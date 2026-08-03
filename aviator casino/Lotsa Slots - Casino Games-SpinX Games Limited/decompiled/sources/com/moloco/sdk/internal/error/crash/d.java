package com.moloco.sdk.internal.error.crash;

/* loaded from: classes5.dex */
public final class d implements com.moloco.sdk.internal.error.crash.c {
    public static final int e = 8;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List<com.moloco.sdk.internal.error.crash.filters.a> f6960a;
    public final com.moloco.sdk.internal.error.api.a b;
    public final com.moloco.sdk.acm.recorder.MetricsRecorder c;
    public final java.lang.String d;

    /* JADX WARN: Multi-variable type inference failed */
    public d(java.util.List<? extends com.moloco.sdk.internal.error.crash.filters.a> exceptionFilters, com.moloco.sdk.internal.error.api.a errorReporter, com.moloco.sdk.acm.recorder.MetricsRecorder metricsRecorder) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(exceptionFilters, "exceptionFilters");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(errorReporter, "errorReporter");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(metricsRecorder, "metricsRecorder");
        this.f6960a = exceptionFilters;
        this.b = errorReporter;
        this.c = metricsRecorder;
        this.d = "CrashHandlerService";
    }

    @Override // com.moloco.sdk.internal.error.crash.c
    public void a(java.lang.Throwable crash) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(crash, "crash");
        if (!b(crash)) {
            com.moloco.sdk.internal.MolocoLogger.error$default(com.moloco.sdk.internal.MolocoLogger.INSTANCE, this.d, "App Crashed", null, false, 12, null);
        } else {
            this.c.recordCountEvent(new com.moloco.sdk.acm.CountEvent(com.moloco.sdk.internal.client_metrics_data.b.F.c()));
            this.b.a(crash);
        }
    }

    public final boolean b(java.lang.Throwable th) {
        java.util.Iterator<com.moloco.sdk.internal.error.crash.filters.a> it = this.f6960a.iterator();
        while (it.hasNext()) {
            if (it.next().a(th)) {
                return true;
            }
        }
        return false;
    }
}
