package com.fyber.inneractive.sdk.player.exoplayer2.audio;

/* loaded from: classes3.dex */
public final class l extends com.fyber.inneractive.sdk.player.exoplayer2.audio.k {
    public final android.media.AudioTimestamp j = new android.media.AudioTimestamp();
    public long k;
    public long l;
    public long m;

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final void a(android.media.AudioTrack audioTrack, boolean z) {
        super.a(audioTrack, z);
        this.k = 0L;
        this.l = 0L;
        this.m = 0L;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final long b() {
        return this.m;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final long c() {
        return this.j.nanoTime;
    }

    @Override // com.fyber.inneractive.sdk.player.exoplayer2.audio.k
    public final boolean e() {
        boolean timestamp = this.f3911a.getTimestamp(this.j);
        if (timestamp) {
            long j = this.j.framePosition;
            if (this.l > j) {
                this.k++;
            }
            this.l = j;
            this.m = j + (this.k << 32);
        }
        return timestamp;
    }
}
