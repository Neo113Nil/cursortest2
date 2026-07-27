package com.inmobi.media;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.xm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4223xm {

    /* renamed from: a, reason: collision with root package name */
    public final C3888lm f7484a;
    public final double b;

    public C4223xm(C3888lm telemetryConfigMetaData, double d) {
        Intrinsics.checkNotNullParameter(telemetryConfigMetaData, "telemetryConfigMetaData");
        this.f7484a = telemetryConfigMetaData;
        this.b = d;
    }

    public final int a(String eventType) {
        Intrinsics.checkNotNullParameter(eventType, "eventType");
        if (this.b >= this.f7484a.g) {
            return 0;
        }
        C3829jm c3829jm = C3829jm.f7187a;
        C3829jm c3829jm2 = C3829jm.f7187a;
        String str = "Event is not sampled " + eventType;
        return 2;
    }
}
