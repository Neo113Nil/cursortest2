package com.fyber.inneractive.sdk.player.exoplayer2.trackselection;

/* loaded from: classes3.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.source.y f4069a;
    public final int b;
    public final int[] c;
    public final com.fyber.inneractive.sdk.player.exoplayer2.o[] d;
    public final long[] e;
    public int f;

    public b(com.fyber.inneractive.sdk.player.exoplayer2.source.y yVar, int... iArr) {
        if (iArr.length <= 0) {
            throw new java.lang.IllegalStateException();
        }
        yVar.getClass();
        this.f4069a = yVar;
        int length = iArr.length;
        this.b = length;
        this.d = new com.fyber.inneractive.sdk.player.exoplayer2.o[length];
        int i = 0;
        for (int i2 = 0; i2 < iArr.length; i2++) {
            this.d[i2] = yVar.b[iArr[i2]];
        }
        java.util.Arrays.sort(this.d, new com.fyber.inneractive.sdk.player.exoplayer2.trackselection.a());
        this.c = new int[this.b];
        while (true) {
            int i3 = this.b;
            if (i >= i3) {
                this.e = new long[i3];
                return;
            } else {
                this.c[i] = yVar.a(this.d[i]);
                i++;
            }
        }
    }

    public abstract int a();

    public final boolean a(int i) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        boolean z = this.e[i] > elapsedRealtime;
        int i2 = 0;
        while (i2 < this.b && !z) {
            z = i2 != i && this.e[i2] <= elapsedRealtime;
            i2++;
        }
        if (!z) {
            return false;
        }
        long[] jArr = this.e;
        jArr[i] = java.lang.Math.max(jArr[i], elapsedRealtime + 60000);
        return true;
    }

    public abstract java.lang.Object b();

    public abstract int c();

    public abstract void d();

    public final boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b bVar = (com.fyber.inneractive.sdk.player.exoplayer2.trackselection.b) obj;
        return this.f4069a == bVar.f4069a && java.util.Arrays.equals(this.c, bVar.c);
    }

    public final int hashCode() {
        if (this.f == 0) {
            this.f = java.util.Arrays.hashCode(this.c) + (java.lang.System.identityHashCode(this.f4069a) * 31);
        }
        return this.f;
    }
}
