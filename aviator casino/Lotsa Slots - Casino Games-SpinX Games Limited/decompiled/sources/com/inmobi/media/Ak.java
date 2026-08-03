package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Ak {

    /* renamed from: a, reason: collision with root package name */
    public final com.inmobi.media.C2677pk f4606a;
    public final com.inmobi.media.Si b;
    public final com.inmobi.media.Bk c;

    public Ak(com.inmobi.media.C2677pk telemetryConfigMetaData, java.util.List samplingEvents) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(telemetryConfigMetaData, "telemetryConfigMetaData");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(samplingEvents, "samplingEvents");
        this.f4606a = telemetryConfigMetaData;
        double random = java.lang.Math.random();
        this.b = new com.inmobi.media.Si(telemetryConfigMetaData, random, samplingEvents);
        this.c = new com.inmobi.media.Bk(telemetryConfigMetaData, random);
    }
}
