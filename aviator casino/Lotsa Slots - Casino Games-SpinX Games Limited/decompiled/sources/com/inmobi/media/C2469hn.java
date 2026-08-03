package com.inmobi.media;

/* renamed from: com.inmobi.media.hn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C2469hn {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f5247a;
    public final boolean b;
    public final com.inmobi.media.Og c;
    public final com.inmobi.media.O1 d;
    public final com.inmobi.media.Zn e;

    public C2469hn(boolean z, com.inmobi.media.ads.network.inmobiJson.model.VideoExperience videoExperience, com.inmobi.media.core.config.models.AdConfig.NativeConfig nativeConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoExperience, "videoExperience");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(nativeConfig, "nativeConfig");
        this.f5247a = z;
        java.lang.Boolean loopVideoOnComplete = videoExperience.getLoopVideoOnComplete();
        this.b = loopVideoOnComplete != null ? loopVideoOnComplete.booleanValue() : nativeConfig.getVideoPlayerConfig().getLoopVideoOnComplete();
        this.c = new com.inmobi.media.Og(videoExperience, nativeConfig.getVideoPlayerConfig().getLoopVideoOnComplete(), nativeConfig.getVideoPlayerConfig().getProgressConfig());
        this.d = new com.inmobi.media.O1(videoExperience, nativeConfig.getVideoPlayerConfig().getAudioConfig());
        this.e = new com.inmobi.media.Zn(nativeConfig.getVideoPlayerConfig().getViewability());
    }
}
