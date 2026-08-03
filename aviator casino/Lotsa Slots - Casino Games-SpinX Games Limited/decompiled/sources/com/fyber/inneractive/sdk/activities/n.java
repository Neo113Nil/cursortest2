package com.fyber.inneractive.sdk.activities;

/* loaded from: classes3.dex */
public final class n implements android.media.MediaPlayer.OnPreparedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore f3531a;

    public n(com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.f3531a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(android.media.MediaPlayer mediaPlayer) {
        com.fyber.inneractive.sdk.util.IAlog.a("onPrepared", new java.lang.Object[0]);
        com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore = this.f3531a;
        inneractiveRichMediaVideoPlayerActivityCore.f3517a.seekTo(inneractiveRichMediaVideoPlayerActivityCore.b);
        this.f3531a.f3517a.start();
    }
}
