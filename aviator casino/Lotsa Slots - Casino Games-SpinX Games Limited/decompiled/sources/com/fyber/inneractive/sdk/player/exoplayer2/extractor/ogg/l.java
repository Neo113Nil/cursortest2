package com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg;

/* loaded from: classes3.dex */
public abstract class l {

    /* renamed from: a, reason: collision with root package name */
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.f f3990a;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.r b;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.j c;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.h d;
    public long e;
    public long f;
    public long g;
    public int h;
    public int i;
    public com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.j j;
    public long k;
    public boolean l;
    public boolean m;

    public abstract long a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar);

    public void a(boolean z) {
        if (z) {
            this.j = new com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.j();
            this.f = 0L;
            this.h = 0;
        } else {
            this.h = 1;
        }
        this.e = -1L;
        this.g = 0L;
    }

    public abstract boolean a(com.fyber.inneractive.sdk.player.exoplayer2.util.n nVar, long j, com.fyber.inneractive.sdk.player.exoplayer2.extractor.ogg.j jVar);

    public void a(long j) {
        this.g = j;
    }
}
