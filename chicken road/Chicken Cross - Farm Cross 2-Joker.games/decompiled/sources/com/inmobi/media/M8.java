package com.inmobi.media;

import com.inmobi.media.videoPlayer.model.HtmlVideoPlaybackState;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class M8 extends AbstractC3691eo {

    /* renamed from: a, reason: collision with root package name */
    public final HtmlVideoPlaybackState f6711a;
    public final int b;

    public M8(HtmlVideoPlaybackState videoReadyEvent, int i) {
        Intrinsics.checkNotNullParameter(videoReadyEvent, "videoReadyEvent");
        this.f6711a = videoReadyEvent;
        this.b = i;
    }
}
