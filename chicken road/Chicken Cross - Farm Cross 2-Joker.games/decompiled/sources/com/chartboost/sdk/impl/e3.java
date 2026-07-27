package com.chartboost.sdk.impl;

import java.util.concurrent.Executor;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class e3 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f4742a;
    public final nd b;
    public final f3 c;
    public final ph d;
    public final oi e;
    public final Executor f;
    public final l7 g;

    public e3(Executor backgroundExecutor, nd factory, f3 reachability, ph timeSource, oi uiPoster, Executor networkExecutor, l7 eventTrackerProvider) {
        Intrinsics.checkNotNullParameter(backgroundExecutor, "backgroundExecutor");
        Intrinsics.checkNotNullParameter(factory, "factory");
        Intrinsics.checkNotNullParameter(reachability, "reachability");
        Intrinsics.checkNotNullParameter(timeSource, "timeSource");
        Intrinsics.checkNotNullParameter(uiPoster, "uiPoster");
        Intrinsics.checkNotNullParameter(networkExecutor, "networkExecutor");
        Intrinsics.checkNotNullParameter(eventTrackerProvider, "eventTrackerProvider");
        this.f4742a = backgroundExecutor;
        this.b = factory;
        this.c = reachability;
        this.d = timeSource;
        this.e = uiPoster;
        this.f = networkExecutor;
        this.g = eventTrackerProvider;
    }

    public final String a() {
        return d4.b.b();
    }

    public final void a(a3 request) {
        Intrinsics.checkNotNullParameter(request, "request");
        mb.d("Execute request: " + request.e(), null);
        this.f.execute(new md(this.f4742a, this.b, this.c, this.d, this.e, request, this.g.a()));
    }
}
