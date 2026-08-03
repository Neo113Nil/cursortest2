package com.fyber.inneractive.sdk.player.exoplayer2.audio;

/* loaded from: classes3.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public android.media.AudioTrack f3911a;
    public boolean b;
    public int c;
    public long d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    public void a(android.media.AudioTrack audioTrack, boolean z) {
        this.f3911a = audioTrack;
        this.b = z;
        this.g = -9223372036854775807L;
        this.d = 0L;
        this.e = 0L;
        this.f = 0L;
        if (audioTrack != null) {
            this.c = audioTrack.getSampleRate();
        }
    }

    public long b() {
        throw new java.lang.UnsupportedOperationException();
    }

    public long c() {
        throw new java.lang.UnsupportedOperationException();
    }

    public final void d() {
        if (this.g != -9223372036854775807L) {
            return;
        }
        this.f3911a.pause();
    }

    public boolean e() {
        return false;
    }

    public final void a(long j) {
        this.h = a();
        this.g = android.os.SystemClock.elapsedRealtime() * 1000;
        this.i = j;
        this.f3911a.stop();
    }

    public final long a() {
        if (this.g != -9223372036854775807L) {
            return java.lang.Math.min(this.i, this.h + ((((android.os.SystemClock.elapsedRealtime() * 1000) - this.g) * this.c) / 1000000));
        }
        int playState = this.f3911a.getPlayState();
        if (playState == 1) {
            return 0L;
        }
        long playbackHeadPosition = this.f3911a.getPlaybackHeadPosition() & 4294967295L;
        if (this.b) {
            if (playState == 2 && playbackHeadPosition == 0) {
                this.f = this.d;
            }
            playbackHeadPosition += this.f;
        }
        if (this.d > playbackHeadPosition) {
            this.e++;
        }
        this.d = playbackHeadPosition;
        return playbackHeadPosition + (this.e << 32);
    }
}
