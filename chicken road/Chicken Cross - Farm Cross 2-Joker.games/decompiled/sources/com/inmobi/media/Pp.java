package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SharedFlowKt;

/* loaded from: classes6.dex */
public final class Pp {

    /* renamed from: a, reason: collision with root package name */
    public final Oh f6790a;
    public final Rp b;
    public final MutableSharedFlow c;
    public final Qp d;
    public Job e;

    public Pp(Oh visibilityTracker, Rp viewabilityTrackerConfig) {
        Intrinsics.checkNotNullParameter(visibilityTracker, "visibilityTracker");
        Intrinsics.checkNotNullParameter(viewabilityTrackerConfig, "viewabilityTrackerConfig");
        this.f6790a = visibilityTracker;
        this.b = viewabilityTrackerConfig;
        this.c = SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.d = new Qp();
    }
}
