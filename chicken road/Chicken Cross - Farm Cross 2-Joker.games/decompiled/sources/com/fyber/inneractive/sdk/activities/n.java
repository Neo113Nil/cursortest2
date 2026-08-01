package com.fyber.inneractive.sdk.activities;

import android.media.MediaPlayer;
import com.fyber.inneractive.sdk.util.IAlog;

/* loaded from: classes4.dex */
public final class n implements MediaPlayer.OnPreparedListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InneractiveRichMediaVideoPlayerActivityCore f5180a;

    public n(InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore) {
        this.f5180a = inneractiveRichMediaVideoPlayerActivityCore;
    }

    @Override // android.media.MediaPlayer.OnPreparedListener
    public final void onPrepared(MediaPlayer mediaPlayer) {
        IAlog.a("onPrepared", new Object[0]);
        InneractiveRichMediaVideoPlayerActivityCore inneractiveRichMediaVideoPlayerActivityCore = this.f5180a;
        inneractiveRichMediaVideoPlayerActivityCore.f5166a.seekTo(inneractiveRichMediaVideoPlayerActivityCore.b);
        this.f5180a.f5166a.start();
    }
}
