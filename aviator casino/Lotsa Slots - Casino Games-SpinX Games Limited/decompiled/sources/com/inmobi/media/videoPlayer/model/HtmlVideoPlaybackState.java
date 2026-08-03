package com.inmobi.media.videoPlayer.model;

@kotlin.Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u0010\n\u0002\u0010\u0013\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001a\u001a\u00020\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u0015X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0017\"\u0004\b!\u0010\u0019¨\u0006\""}, d2 = {"Lcom/inmobi/media/videoPlayer/model/HtmlVideoPlaybackState;", "", "<init>", "()V", com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_DURATION, "", "getDuration", "()F", "setDuration", "(F)V", "time", "getTime", "setTime", "latency", "", "getLatency", "()Ljava/lang/Long;", "setLatency", "(Ljava/lang/Long;)V", "Ljava/lang/Long;", "videoUrl", "", "getVideoUrl", "()Ljava/lang/String;", "setVideoUrl", "(Ljava/lang/String;)V", "isMuted", "", "()Z", "setMuted", "(Z)V", "state", "getState", "setState", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class HtmlVideoPlaybackState {
    private float duration;
    private boolean isMuted;
    private java.lang.Long latency;
    private java.lang.String state;
    private float time;
    private java.lang.String videoUrl;

    public HtmlVideoPlaybackState() {
        com.inmobi.media.EnumC2612n8[] enumC2612n8Arr = com.inmobi.media.EnumC2612n8.f5353a;
        this.state = "loading";
    }

    public final float getDuration() {
        return this.duration;
    }

    public final java.lang.Long getLatency() {
        return this.latency;
    }

    public final java.lang.String getState() {
        return this.state;
    }

    public final float getTime() {
        return this.time;
    }

    public final java.lang.String getVideoUrl() {
        return this.videoUrl;
    }

    /* renamed from: isMuted, reason: from getter */
    public final boolean getIsMuted() {
        return this.isMuted;
    }

    public final void setDuration(float f) {
        this.duration = f;
    }

    public final void setLatency(java.lang.Long l) {
        this.latency = l;
    }

    public final void setMuted(boolean z) {
        this.isMuted = z;
    }

    public final void setState(java.lang.String str) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.state = str;
    }

    public final void setTime(float f) {
        this.time = f;
    }

    public final void setVideoUrl(java.lang.String str) {
        this.videoUrl = str;
    }
}
