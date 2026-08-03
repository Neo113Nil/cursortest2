package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Bl {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4629a;
    public final java.lang.String b;
    public final int c;
    public final java.util.ArrayList d;

    public Bl(java.lang.String universalAdId, java.lang.String adServingId, int i, java.util.ArrayList trackers) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(universalAdId, "universalAdId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adServingId, "adServingId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackers, "trackers");
        this.f4629a = universalAdId;
        this.b = adServingId;
        this.c = i;
        this.d = trackers;
    }
}
