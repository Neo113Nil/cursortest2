package com.vungle.ads.internal.ui.view;

import android.media.MediaPlayer;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes7.dex */
public final class a implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final WeakReference f12165a;

    public a(d adVideoView) {
        Intrinsics.checkNotNullParameter(adVideoView, "adVideoView");
        this.f12165a = new WeakReference(adVideoView);
    }

    @Override // java.lang.Runnable
    public final void run() {
        MediaPlayer mediaPlayer;
        d dVar = (d) this.f12165a.get();
        if (dVar == null) {
            return;
        }
        dVar.b();
        if (!dVar.i.get() || (mediaPlayer = dVar.g) == null || !mediaPlayer.isPlaying() || dVar.q) {
            return;
        }
        dVar.w.postDelayed(this, 1000L);
    }
}
