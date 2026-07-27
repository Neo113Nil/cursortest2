package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class Xh {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f6952a;
    public final boolean b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final long f;

    public Xh(VideoExperience videoExperience, boolean z, AdConfig.VideoPlayerProgressConfig progressConfig) {
        Intrinsics.checkNotNullParameter(videoExperience, "videoExperience");
        Intrinsics.checkNotNullParameter(progressConfig, "progressConfig");
        Boolean showProgress = videoExperience.getProgress().getShowProgress();
        this.f6952a = showProgress != null ? showProgress.booleanValue() : progressConfig.getShowProgress();
        this.b = !(videoExperience.getLoopVideoOnComplete() != null ? r0.booleanValue() : z);
        int[] color = videoExperience.getProgress().getColor();
        this.c = color == null ? CollectionsKt.toIntArray(progressConfig.getForegroundColor()) : color;
        this.d = CollectionsKt.toIntArray(progressConfig.getBackgroundColor());
        Integer height = videoExperience.getProgress().getHeight();
        this.e = height != null ? height.intValue() : progressConfig.getHeight();
        this.f = progressConfig.getProgressPolling();
    }
}
