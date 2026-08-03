package com.fyber.inneractive.sdk.player.exoplayer2.upstream;

/* loaded from: classes3.dex */
public final class k {

    /* renamed from: a, reason: collision with root package name */
    public final android.net.Uri f4091a;
    public final long b;
    public final long c;
    public final long d;
    public final java.lang.String e;
    public final int f;

    public k(android.net.Uri uri, long j, long j2, long j3, java.lang.String str, int i) {
        if (j < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        if (j2 < 0) {
            throw new java.lang.IllegalArgumentException();
        }
        if (j3 <= 0 && j3 != -1) {
            throw new java.lang.IllegalArgumentException();
        }
        this.f4091a = uri;
        this.b = j;
        this.c = j2;
        this.d = j3;
        this.e = str;
        this.f = i;
    }

    public final java.lang.String toString() {
        return "DataSpec[" + this.f4091a + ", " + java.util.Arrays.toString((byte[]) null) + ", " + this.b + ", " + this.c + ", " + this.d + ", " + this.e + ", " + this.f + com.ironsource.X3.j.e;
    }
}
