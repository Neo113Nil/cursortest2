package com.fyber.inneractive.sdk.activities;

/* loaded from: classes3.dex */
public final class p implements android.media.MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore f3533a;

    public p(com.fyber.inneractive.sdk.activities.InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.f3533a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(android.media.MediaPlayer mediaPlayer) {
        this.f3533a.finish();
    }
}
