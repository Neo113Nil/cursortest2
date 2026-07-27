package com.moloco.sdk.acm.http;

import com.moloco.sdk.MetricsRequest;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final List<MetricsRequest.PostMetricsRequest.CountEvent> f10410a;
    public final List<MetricsRequest.PostMetricsRequest.TimerEvent> b;

    public d(List<MetricsRequest.PostMetricsRequest.CountEvent> counts, List<MetricsRequest.PostMetricsRequest.TimerEvent> timers) {
        Intrinsics.checkNotNullParameter(counts, "counts");
        Intrinsics.checkNotNullParameter(timers, "timers");
        this.f10410a = counts;
        this.b = timers;
    }

    public final List<MetricsRequest.PostMetricsRequest.CountEvent> a() {
        return this.f10410a;
    }

    public final List<MetricsRequest.PostMetricsRequest.TimerEvent> b() {
        return this.b;
    }
}
