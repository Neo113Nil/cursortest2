package com.inmobi.media;

import com.inmobi.media.ads.network.inmobiJson.model.VideoExperience;
import com.inmobi.media.core.config.models.AdConfig;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.inmobi.media.h2, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3753h2 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7133a;
    public final int b;
    public final int c;
    public final Yc d;
    public final int e;

    public C3753h2(VideoExperience videoExperience, AdConfig.VideoPlayerAudioConfig audioConfig) {
        Yc yc;
        Yc yc2;
        Intrinsics.checkNotNullParameter(videoExperience, "videoExperience");
        Intrinsics.checkNotNullParameter(audioConfig, "audioConfig");
        Boolean startMuted = videoExperience.getAudio().getStartMuted();
        this.f7133a = startMuted != null ? startMuted.booleanValue() : audioConfig.getStartMuted();
        Integer muteIconWidth = videoExperience.getAudio().getMuteIconWidth();
        this.b = muteIconWidth != null ? muteIconWidth.intValue() : audioConfig.getMuteIconWidth();
        Integer muteIconHeight = videoExperience.getAudio().getMuteIconHeight();
        this.c = muteIconHeight != null ? muteIconHeight.intValue() : audioConfig.getMuteIconHeight();
        int[] muteIconMargin = videoExperience.getAudio().getMuteIconMargin();
        if (muteIconMargin != null) {
            Intrinsics.checkNotNullParameter(muteIconMargin, "<this>");
            if (muteIconMargin.length != 4) {
                yc2 = new Yc(0, 0, 0, 0);
            } else {
                yc = new Yc(muteIconMargin[0], muteIconMargin[1], muteIconMargin[2], muteIconMargin[3]);
                yc2 = yc;
            }
        } else {
            List<Integer> muteIconMargin2 = audioConfig.getMuteIconMargin();
            Intrinsics.checkNotNullParameter(muteIconMargin2, "<this>");
            if (muteIconMargin2.size() != 4) {
                yc2 = new Yc(0, 0, 0, 0);
            } else {
                yc = new Yc(muteIconMargin2.get(0).intValue(), muteIconMargin2.get(1).intValue(), muteIconMargin2.get(2).intValue(), muteIconMargin2.get(3).intValue());
                yc2 = yc;
            }
        }
        this.d = yc2;
        Integer muteIconPosition = videoExperience.getAudio().getMuteIconPosition();
        this.e = muteIconPosition != null ? muteIconPosition.intValue() : audioConfig.getMuteIconPosition();
    }
}
