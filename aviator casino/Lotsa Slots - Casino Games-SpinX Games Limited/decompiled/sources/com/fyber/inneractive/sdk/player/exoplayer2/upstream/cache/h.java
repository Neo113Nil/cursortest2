package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final int f4080a;
    public final java.lang.String b;
    public final java.util.TreeSet c = new java.util.TreeSet();
    public long d;

    public h(int i, java.lang.String str, long j) {
        this.f4080a = i;
        this.b = str;
        this.d = j;
    }

    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.m a(long j) {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.m mVar = new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.m(this.b, j, -1L, -9223372036854775807L, null);
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.m mVar2 = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.m) this.c.floor(mVar);
        if (mVar2 != null && mVar2.b + mVar2.c > j) {
            return mVar2;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.m mVar3 = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.m) this.c.ceiling(mVar);
        return mVar3 == null ? new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.m(this.b, j, -1L, -9223372036854775807L, null) : new com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.m(this.b, j, mVar3.b - j, -9223372036854775807L, null);
    }
}
