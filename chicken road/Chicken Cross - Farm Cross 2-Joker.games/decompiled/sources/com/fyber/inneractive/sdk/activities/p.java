package com.fyber.inneractive.sdk.activities;

import android.media.MediaPlayer;

/* loaded from: classes4.dex */
public final class p implements MediaPlayer.OnCompletionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore f5182a;

    public p(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.f5182a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    @Override // android.media.MediaPlayer.OnCompletionListener
    public final void onCompletion(MediaPlayer mediaPlayer) {
        this.f5182a.finish();
    }
}
