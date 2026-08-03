package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Gm extends com.inmobi.media.C6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4731a;
    public final java.util.ArrayList b;
    public final java.util.ArrayList c;
    public final com.inmobi.media.core.config.models.AdConfig.VastVideoConfig d;
    public final com.inmobi.media.C2469hn e;
    public final com.inmobi.media.C2363dm f;
    public final com.inmobi.media.Hn g;
    public final com.inmobi.media.Z3 h;

    public Gm(java.lang.String mediaDuration, java.util.ArrayList companionAds, java.util.ArrayList mediaFiles, com.inmobi.media.core.config.models.AdConfig.VastVideoConfig vastVideoConfig, com.inmobi.media.C2469hn videoPlayerConfig, com.inmobi.media.C2363dm videoBeaconProcessor, com.inmobi.media.Hn videoTelemetryHelper, com.inmobi.media.Z3 companionTelemetryHelper) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaDuration, "mediaDuration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companionAds, "companionAds");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(vastVideoConfig, "vastVideoConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoPlayerConfig, "videoPlayerConfig");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoBeaconProcessor, "videoBeaconProcessor");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoTelemetryHelper, "videoTelemetryHelper");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companionTelemetryHelper, "companionTelemetryHelper");
        this.f4731a = mediaDuration;
        this.b = companionAds;
        this.c = mediaFiles;
        this.d = vastVideoConfig;
        this.e = videoPlayerConfig;
        this.f = videoBeaconProcessor;
        this.g = videoTelemetryHelper;
        this.h = companionTelemetryHelper;
    }
}
