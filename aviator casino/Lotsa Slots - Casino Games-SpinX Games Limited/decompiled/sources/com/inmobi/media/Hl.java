package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Hl {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4749a;
    public final java.lang.String b;
    public final java.util.ArrayList c;
    public final java.lang.String d;
    public final java.lang.String e;
    public final java.util.ArrayList f;
    public final java.util.ArrayList g;

    public Hl(java.lang.String universalAdId, java.lang.String adServingId, java.util.ArrayList trackers, java.lang.String clickThroughUrl, java.lang.String mediaDuration, java.util.ArrayList companionAds, java.util.ArrayList mediaFiles) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(universalAdId, "universalAdId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(adServingId, "adServingId");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(trackers, "trackers");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(clickThroughUrl, "clickThroughUrl");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaDuration, "mediaDuration");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(companionAds, "companionAds");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        this.f4749a = universalAdId;
        this.b = adServingId;
        this.c = trackers;
        this.d = clickThroughUrl;
        this.e = mediaDuration;
        this.f = companionAds;
        this.g = mediaFiles;
    }
}
