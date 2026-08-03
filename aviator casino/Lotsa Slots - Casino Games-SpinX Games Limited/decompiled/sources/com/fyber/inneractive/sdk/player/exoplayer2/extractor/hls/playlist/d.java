package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

/* loaded from: classes3.dex */
public final class d extends com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.e {
    public final int b;
    public final long c;
    public final long d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final long i;
    public final boolean j;
    public final boolean k;
    public final com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c l;
    public final java.util.List m;
    public final java.util.List n;
    public final long o;

    public d(int i, java.lang.String str, long j, long j2, boolean z, int i2, int i3, int i4, long j3, boolean z2, boolean z3, com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c cVar, java.util.List list, java.util.List list2) {
        super(str);
        this.b = i;
        this.d = j2;
        this.e = z;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = j3;
        this.j = z2;
        this.k = z3;
        this.l = cVar;
        this.m = java.util.Collections.unmodifiableList(list);
        if (list.isEmpty()) {
            this.o = 0L;
        } else {
            com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c cVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist.c) list.get(list.size() - 1);
            this.o = cVar2.d + cVar2.b;
        }
        this.c = j == -9223372036854775807L ? -9223372036854775807L : j >= 0 ? j : this.o + j;
        this.n = java.util.Collections.unmodifiableList(list2);
    }
}
