package com.fyber.inneractive.sdk.activities;

/* loaded from: classes3.dex */
public final class q implements android.media.MediaPlayer.OnErrorListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore f3534a;

    public q(com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.f3534a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    @Override // android.media.MediaPlayer.OnErrorListener
    public final boolean onError(android.media.MediaPlayer mediaPlayer, int i, int i2) {
        com.fyber.inneractive.sdk.util.IAlog.a("Error: video can not be played.", new java.lang.Object[0]);
        this.f3534a.finish();
        return false;
    }
}
