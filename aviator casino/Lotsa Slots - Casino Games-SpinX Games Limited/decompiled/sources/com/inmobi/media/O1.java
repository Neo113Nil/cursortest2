package com.inmobi.media;

/* loaded from: classes5.dex */
public final class O1 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f4865a;
    public final int b;
    public final int c;
    public final com.inmobi.media.C2432gc d;
    public final int e;

    public O1(com.inmobi.media.ads.network.inmobiJson.model.VideoExperience videoExperience, com.inmobi.media.core.config.models.AdConfig.VideoPlayerAudioConfig audioConfig) {
        com.inmobi.media.C2432gc c2432gc;
        com.inmobi.media.C2432gc c2432gc2;
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(videoExperience, "videoExperience");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioConfig, "audioConfig");
        java.lang.Boolean startMuted = videoExperience.getAudio().getStartMuted();
        this.f4865a = startMuted != null ? startMuted.booleanValue() : audioConfig.getStartMuted();
        java.lang.Integer muteIconWidth = videoExperience.getAudio().getMuteIconWidth();
        this.b = muteIconWidth != null ? muteIconWidth.intValue() : audioConfig.getMuteIconWidth();
        java.lang.Integer muteIconHeight = videoExperience.getAudio().getMuteIconHeight();
        this.c = muteIconHeight != null ? muteIconHeight.intValue() : audioConfig.getMuteIconHeight();
        int[] muteIconMargin = videoExperience.getAudio().getMuteIconMargin();
        if (muteIconMargin != null) {
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(muteIconMargin, "<this>");
            if (muteIconMargin.length != 4) {
                c2432gc2 = new com.inmobi.media.C2432gc(0, 0, 0, 0);
            } else {
                c2432gc = new com.inmobi.media.C2432gc(muteIconMargin[0], muteIconMargin[1], muteIconMargin[2], muteIconMargin[3]);
                c2432gc2 = c2432gc;
            }
        } else {
            java.util.List<java.lang.Integer> muteIconMargin2 = audioConfig.getMuteIconMargin();
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(muteIconMargin2, "<this>");
            if (muteIconMargin2.size() != 4) {
                c2432gc2 = new com.inmobi.media.C2432gc(0, 0, 0, 0);
            } else {
                c2432gc = new com.inmobi.media.C2432gc(muteIconMargin2.get(0).intValue(), muteIconMargin2.get(1).intValue(), muteIconMargin2.get(2).intValue(), muteIconMargin2.get(3).intValue());
                c2432gc2 = c2432gc;
            }
        }
        this.d = c2432gc2;
        java.lang.Integer muteIconPosition = videoExperience.getAudio().getMuteIconPosition();
        this.e = muteIconPosition != null ? muteIconPosition.intValue() : audioConfig.getMuteIconPosition();
    }
}
