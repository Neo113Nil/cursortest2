package com.inmobi.media;

/* loaded from: classes5.dex */
public final class Og {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4878a;
    public final boolean b;
    public final int[] c;
    public final int[] d;
    public final int e;
    public final long f;

    public Og(com.inmobi.media.ads.network.inmobiJson.model.VideoExperience videoExperience, boolean z, com.inmobi.media.core.config.models.AdConfig.VideoPlayerProgressConfig progressConfig) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoExperience, "videoExperience");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(progressConfig, "progressConfig");
        java.lang.Boolean showProgress = videoExperience.getProgress().getShowProgress();
        this.f4878a = showProgress != null ? showProgress.booleanValue() : progressConfig.getShowProgress();
        this.b = !(videoExperience.getLoopVideoOnComplete() != null ? r0.booleanValue() : z);
        int[] color = videoExperience.getProgress().getColor();
        this.c = color == null ? kotlin.collections.CollectionsKt.toIntArray(progressConfig.getForegroundColor()) : color;
        this.d = kotlin.collections.CollectionsKt.toIntArray(progressConfig.getBackgroundColor());
        java.lang.Integer height = videoExperience.getProgress().getHeight();
        this.e = height != null ? height.intValue() : progressConfig.getHeight();
        this.f = progressConfig.getProgressPolling();
    }
}
