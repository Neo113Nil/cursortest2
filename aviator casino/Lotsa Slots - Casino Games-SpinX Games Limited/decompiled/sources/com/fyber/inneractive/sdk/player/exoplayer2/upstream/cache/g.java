package com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache;

/* loaded from: classes3.dex */
public abstract class g implements java.lang.Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4079a;
    public final long b;
    public final long c;
    public final boolean d;
    public final java.io.File e;
    public final long f;

    public g(java.lang.String str, long j, long j2, long j3, java.io.File file) {
        this.f4079a = str;
        this.b = j;
        this.c = j2;
        this.d = file != null;
        this.e = file;
        this.f = j3;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.g gVar = (com.fyber.inneractive.sdk.player.exoplayer2.upstream.cache.g) obj;
        if (!this.f4079a.equals(gVar.f4079a)) {
            return this.f4079a.compareTo(gVar.f4079a);
        }
        long j = this.b - gVar.b;
        if (j == 0) {
            return 0;
        }
        return j < 0 ? -1 : 1;
    }
}
