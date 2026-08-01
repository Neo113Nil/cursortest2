package com.inmobi.ads.listeners;

import com.inmobi.ads.InMobiNative;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\b&\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u000fH\u0016¨\u0006\u0010"}, d2 = {"Lcom/inmobi/ads/listeners/VideoEventListener;", "", "<init>", "()V", "onVideoStarted", "", "ad", "Lcom/inmobi/ads/InMobiNative;", "onVideoResumed", "onVideoPaused", "onVideoCompleted", "onVideoSkipped", "onAudioStateChanged", "inMobiNative", "isMuted", "", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class VideoEventListener {
    public void onAudioStateChanged(InMobiNative inMobiNative, boolean isMuted) {
        Intrinsics.checkNotNullParameter(inMobiNative, "inMobiNative");
    }

    public void onVideoCompleted(InMobiNative ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
    }

    public void onVideoPaused(InMobiNative ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
    }

    public void onVideoResumed(InMobiNative ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
    }

    public void onVideoSkipped(InMobiNative ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
    }

    public void onVideoStarted(InMobiNative ad) {
        Intrinsics.checkNotNullParameter(ad, "ad");
    }
}
