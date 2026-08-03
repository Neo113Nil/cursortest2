package com.inmobi.ads.listeners;

@kotlin.Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0018\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\tH\u0016J\u0010\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J\u0010\u0010\r\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002H\u0016J$\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00110\u0010H\u0016J\u0018\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0014H\u0016¨\u0006\u0015"}, d2 = {"Lcom/inmobi/ads/listeners/AudioAdEventListener;", "Lcom/inmobi/ads/listeners/AdEventListener;", "Lcom/inmobi/ads/InMobiAudio;", "<init>", "()V", "onAdFetchFailed", "", "ad", "status", "Lcom/inmobi/ads/InMobiAdRequestStatus;", "onAdDisplayed", "onAdDisplayFailed", "onAdDismissed", "onUserLeftApplication", "onRewardsUnlocked", "rewards", "", "", "onAudioStatusChanged", "audioStatus", "Lcom/inmobi/ads/AudioStatus;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AudioAdEventListener extends com.inmobi.ads.listeners.AdEventListener<com.inmobi.ads.InMobiAudio> {
    public void onAdDismissed(com.inmobi.ads.InMobiAudio ad) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
    }

    public void onAdDisplayFailed(com.inmobi.ads.InMobiAudio ad) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
    }

    public void onAdDisplayed(com.inmobi.ads.InMobiAudio ad) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
    }

    public void onAdFetchFailed(com.inmobi.ads.InMobiAudio ad, com.inmobi.ads.InMobiAdRequestStatus status) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(status, "status");
    }

    public void onAudioStatusChanged(com.inmobi.ads.InMobiAudio ad, com.inmobi.ads.AudioStatus audioStatus) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(audioStatus, "audioStatus");
    }

    public void onRewardsUnlocked(com.inmobi.ads.InMobiAudio ad, java.util.Map<java.lang.Object, ? extends java.lang.Object> rewards) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(rewards, "rewards");
    }

    public void onUserLeftApplication(com.inmobi.ads.InMobiAudio ad) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(ad, "ad");
    }
}
