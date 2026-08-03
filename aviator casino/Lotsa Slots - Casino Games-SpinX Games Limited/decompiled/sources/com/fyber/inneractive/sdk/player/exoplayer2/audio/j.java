package com.fyber.inneractive.sdk.player.exoplayer2.audio;

/* loaded from: classes3.dex */
public final class j extends java.lang.Thread {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.media.AudioTrack f3910a;
    public final /* synthetic */ com.fyber.inneractive.sdk.player.exoplayer2.audio.r b;

    public j(com.fyber.inneractive.sdk.player.exoplayer2.audio.r rVar, android.media.AudioTrack audioTrack) {
        this.b = rVar;
        this.f3910a = audioTrack;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        try {
            this.f3910a.flush();
            this.f3910a.release();
        } finally {
            this.b.e.open();
        }
    }
}
