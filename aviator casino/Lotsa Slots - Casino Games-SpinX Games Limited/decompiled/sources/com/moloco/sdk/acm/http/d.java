package com.moloco.sdk.acm.http;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List<com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent> f6908a;
    public final java.util.List<com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent> b;

    public d(java.util.List<com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent> counts, java.util.List<com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent> timers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(counts, "counts");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(timers, "timers");
        this.f6908a = counts;
        this.b = timers;
    }

    public final java.util.List<com.moloco.sdk.MetricsRequest.PostMetricsRequest.CountEvent> a() {
        return this.f6908a;
    }

    public final java.util.List<com.moloco.sdk.MetricsRequest.PostMetricsRequest.TimerEvent> b() {
        return this.b;
    }
}
