package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Co extends Z6 {

    /* renamed from: a, reason: collision with root package name */
    public final String f6501a;
    public final ArrayList b;
    public final ArrayList c;
    public final AdConfig.VastVideoConfig d;
    public final C3692ep e;
    public final Yn f;
    public final Ep g;
    public final C4178w4 h;

    public Co(String mediaDuration, ArrayList companionAds, ArrayList mediaFiles, AdConfig.VastVideoConfig vastVideoConfig, C3692ep videoPlayerConfig, Yn videoBeaconProcessor, Ep videoTelemetryHelper, C4178w4 companionTelemetryHelper) {
        Intrinsics.checkNotNullParameter(mediaDuration, "mediaDuration");
        Intrinsics.checkNotNullParameter(companionAds, "companionAds");
        Intrinsics.checkNotNullParameter(mediaFiles, "mediaFiles");
        Intrinsics.checkNotNullParameter(vastVideoConfig, "vastVideoConfig");
        Intrinsics.checkNotNullParameter(videoPlayerConfig, "videoPlayerConfig");
        Intrinsics.checkNotNullParameter(videoBeaconProcessor, "videoBeaconProcessor");
        Intrinsics.checkNotNullParameter(videoTelemetryHelper, "videoTelemetryHelper");
        Intrinsics.checkNotNullParameter(companionTelemetryHelper, "companionTelemetryHelper");
        this.f6501a = mediaDuration;
        this.b = companionAds;
        this.c = mediaFiles;
        this.d = vastVideoConfig;
        this.e = videoPlayerConfig;
        this.f = videoBeaconProcessor;
        this.g = videoTelemetryHelper;
        this.h = companionTelemetryHelper;
    }
}
