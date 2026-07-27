package com.inmobi.media;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.wm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C4196wm {

    /* renamed from: a, reason: collision with root package name */
    public final C3888lm f7464a;
    public final C3772hk b;
    public final C4223xm c;

    public C4196wm(C3888lm telemetryConfigMetaData, List samplingEvents) {
        Intrinsics.checkNotNullParameter(telemetryConfigMetaData, "telemetryConfigMetaData");
        Intrinsics.checkNotNullParameter(samplingEvents, "samplingEvents");
        this.f7464a = telemetryConfigMetaData;
        double random = Math.random();
        this.b = new C3772hk(telemetryConfigMetaData, random, samplingEvents);
        this.c = new C4223xm(telemetryConfigMetaData, random);
    }
}
