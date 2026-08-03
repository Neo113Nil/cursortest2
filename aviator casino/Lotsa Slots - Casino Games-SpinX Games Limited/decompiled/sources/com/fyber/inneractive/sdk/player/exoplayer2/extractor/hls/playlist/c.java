package com.fyber.inneractive.sdk.player.exoplayer2.extractor.hls.playlist;

/* loaded from: classes3.dex */
public final class c implements java.lang.Comparable {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f3945a;
    public final long b;
    public final int c;
    public final long d;
    public final boolean e;
    public final java.lang.String f;
    public final java.lang.String g;
    public final long h;
    public final long i;

    public c(java.lang.String str, long j, int i, long j2, boolean z, java.lang.String str2, java.lang.String str3, long j3, long j4) {
        this.f3945a = str;
        this.b = j;
        this.c = i;
        this.d = j2;
        this.e = z;
        this.f = str2;
        this.g = str3;
        this.h = j3;
        this.i = j4;
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object obj) {
        java.lang.Long l = (java.lang.Long) obj;
        if (this.d > l.longValue()) {
            return 1;
        }
        return this.d < l.longValue() ? -1 : 0;
    }
}
