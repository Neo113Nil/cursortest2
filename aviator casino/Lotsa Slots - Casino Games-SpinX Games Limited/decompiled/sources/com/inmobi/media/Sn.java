package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Sn {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.Fg f4963a;
    public final com.inmobi.media.Un b;
    public final kotlinx.coroutines.flow.MutableSharedFlow c;
    public final com.inmobi.media.Tn d;
    public kotlinx.coroutines.Job e;

    public Sn(com.inmobi.media.Fg visibilityTracker, com.inmobi.media.Un viewabilityTrackerConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(visibilityTracker, "visibilityTracker");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(viewabilityTrackerConfig, "viewabilityTrackerConfig");
        this.f4963a = visibilityTracker;
        this.b = viewabilityTrackerConfig;
        this.c = kotlinx.coroutines.flow.SharedFlowKt.MutableSharedFlow$default(0, 0, null, 6, null);
        this.d = new com.inmobi.media.Tn();
    }
}
