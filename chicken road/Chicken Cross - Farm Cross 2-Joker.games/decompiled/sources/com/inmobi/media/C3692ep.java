package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.ep, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3692ep {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7093a;
    public final boolean b;
    public final Xh c;
    public final C3753h2 d;
    public final Wp e;

    public C3692ep(boolean z, VideoExperience videoExperience, AdConfig.NativeConfig nativeConfig) {
        Intrinsics.checkNotNullParameter(videoExperience, "videoExperience");
        Intrinsics.checkNotNullParameter(nativeConfig, "nativeConfig");
        this.f7093a = z;
        Boolean loopVideoOnComplete = videoExperience.getLoopVideoOnComplete();
        this.b = loopVideoOnComplete != null ? loopVideoOnComplete.booleanValue() : nativeConfig.getVideoPlayerConfig().getLoopVideoOnComplete();
        this.c = new Xh(videoExperience, nativeConfig.getVideoPlayerConfig().getLoopVideoOnComplete(), nativeConfig.getVideoPlayerConfig().getProgressConfig());
        this.d = new C3753h2(videoExperience, nativeConfig.getVideoPlayerConfig().getAudioConfig());
        this.e = new Wp(nativeConfig.getVideoPlayerConfig().getViewability());
    }
}
