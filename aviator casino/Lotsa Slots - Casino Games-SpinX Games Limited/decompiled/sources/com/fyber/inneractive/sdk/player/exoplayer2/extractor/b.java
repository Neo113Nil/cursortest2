package com.fyber.inneractive.sdk.player.exoplayer2.extractor;

/* loaded from: classes3.dex */
public final class b {
    public static final byte[] g = new byte[4096];

    /* renamed from: a, reason: collision with root package name */
    public final com.fyber.inneractive.sdk.player.exoplayer2.upstream.h f3926a;
    public final long b;
    public long c;
    public byte[] d = new byte[65536];
    public int e;
    public int f;

    public b(com.fyber.inneractive.sdk.player.exoplayer2.upstream.h hVar, long j, long j2) {
        this.f3926a = hVar;
        this.c = j;
        this.b = j2;
    }

    public final boolean a(byte[] bArr, int i, int i2, boolean z) {
        if (!a(i2, z)) {
            return false;
        }
        java.lang.System.arraycopy(this.d, this.e - i2, bArr, i, i2);
        return true;
    }

    public final boolean b(byte[] bArr, int i, int i2, boolean z) {
        int i3;
        int i4 = this.f;
        if (i4 == 0) {
            i3 = 0;
        } else {
            int min = java.lang.Math.min(i4, i2);
            java.lang.System.arraycopy(this.d, 0, bArr, i, min);
            b(min);
            i3 = min;
        }
        while (i3 < i2 && i3 != -1) {
            i3 = a(bArr, i, i2, i3, z);
        }
        if (i3 != -1) {
            this.c += i3;
        }
        return i3 != -1;
    }

    public final boolean a(int i, boolean z) {
        int i2 = this.e + i;
        byte[] bArr = this.d;
        if (i2 > bArr.length) {
            int i3 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a;
            this.d = java.util.Arrays.copyOf(this.d, java.lang.Math.max(65536 + i2, java.lang.Math.min(bArr.length * 2, i2 + 524288)));
        }
        int min = java.lang.Math.min(this.f - this.e, i);
        while (min < i) {
            min = a(this.d, this.e, i, min, z);
            if (min == -1) {
                return false;
            }
        }
        int i4 = this.e + i;
        this.e = i4;
        this.f = java.lang.Math.max(this.f, i4);
        return true;
    }

    public final void b(int i) {
        int i2 = this.f - i;
        this.f = i2;
        this.e = 0;
        byte[] bArr = this.d;
        byte[] bArr2 = i2 < bArr.length - 524288 ? new byte[65536 + i2] : bArr;
        java.lang.System.arraycopy(bArr, i, bArr2, 0, i2);
        this.d = bArr2;
    }

    public final void a(int i) {
        int min = java.lang.Math.min(this.f, i);
        b(min);
        int i2 = min;
        while (i2 < i && i2 != -1) {
            i2 = a(g, -i2, java.lang.Math.min(i, i2 + 4096), i2, false);
        }
        if (i2 != -1) {
            this.c += i2;
        }
    }

    public final int a(byte[] bArr, int i, int i2, int i3, boolean z) {
        if (!java.lang.Thread.interrupted()) {
            int read = this.f3926a.read(bArr, i + i3, i2 - i3);
            if (read != -1) {
                return i3 + read;
            }
            if (i3 == 0 && z) {
                return -1;
            }
            throw new java.io.EOFException();
        }
        throw new java.lang.InterruptedException();
    }
}
