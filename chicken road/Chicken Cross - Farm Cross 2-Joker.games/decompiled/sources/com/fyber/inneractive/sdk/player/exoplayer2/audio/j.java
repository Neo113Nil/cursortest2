package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import android.media.AudioTrack;

/* loaded from: classes4.dex */
public final class j extends Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AudioTrack f5564a;
    public final /* synthetic */ r b;

    public j(r rVar, AudioTrack audioTrack) {
        this.b = rVar;
        this.f5564a = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f5564a.flush();
            this.f5564a.release();
        } finally {
            this.b.e.open();
        }
    }
}
