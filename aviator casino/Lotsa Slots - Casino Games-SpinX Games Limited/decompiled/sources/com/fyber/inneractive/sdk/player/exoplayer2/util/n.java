package com.fyber.inneractive.sdk.player.exoplayer2.util;

/* loaded from: classes3.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    public byte[] f4112a;
    public int b;
    public int c;

    public n() {
    }

    public final int a() {
        byte[] bArr = this.f4112a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final int b() {
        byte[] bArr = this.f4112a;
        int i = this.b;
        int i2 = ((bArr[i + 1] & 255) << 16) | ((bArr[i] & 255) << 24);
        int i3 = i + 3;
        int i4 = i2 | ((bArr[i + 2] & 255) << 8);
        this.b = i + 4;
        return (bArr[i3] & 255) | i4;
    }

    public final void c(int i) {
        this.f4112a = a() < i ? new byte[i] : this.f4112a;
        this.c = i;
        this.b = 0;
    }

    public final void d(int i) {
        if (i < 0 || i > this.f4112a.length) {
            throw new java.lang.IllegalArgumentException();
        }
        this.c = i;
    }

    public final void e(int i) {
        if (i < 0 || i > this.c) {
            throw new java.lang.IllegalArgumentException();
        }
        this.b = i;
    }

    public final int f() {
        byte[] bArr = this.f4112a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = bArr[i] & 255;
        this.b = i + 2;
        return ((bArr[i2] & 255) << 8) | i3;
    }

    public final long g() {
        byte[] bArr = this.f4112a;
        int i = this.b;
        int i2 = i + 7;
        long j = ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
        this.b = i + 8;
        return (bArr[i2] & 255) | j;
    }

    public final void h() {
        int i = this.c;
        int i2 = this.b;
        if (i - i2 == 0) {
            return;
        }
        while (i2 < this.c && this.f4112a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.f4112a;
        int i3 = this.b;
        new java.lang.String(bArr, i3, i2 - i3);
        this.b = i2;
        if (i2 < this.c) {
            this.b = i2 + 1;
        }
    }

    public final int i() {
        return (j() << 21) | (j() << 14) | (j() << 7) | j();
    }

    public final int j() {
        byte[] bArr = this.f4112a;
        int i = this.b;
        this.b = i + 1;
        return bArr[i] & 255;
    }

    public final long k() {
        byte[] bArr = this.f4112a;
        int i = this.b;
        int i2 = i + 3;
        long j = ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
        this.b = i + 4;
        return (bArr[i2] & 255) | j;
    }

    public final int l() {
        byte[] bArr = this.f4112a;
        int i = this.b;
        int i2 = i + 2;
        int i3 = ((bArr[i + 1] & 255) << 8) | ((bArr[i] & 255) << 16);
        this.b = i + 3;
        return (bArr[i2] & 255) | i3;
    }

    public final int m() {
        int b = b();
        if (b >= 0) {
            return b;
        }
        throw new java.lang.IllegalStateException(com.fyber.inneractive.sdk.player.exoplayer2.m.a("Top bit not zero: ", b));
    }

    public final long n() {
        long g = g();
        if (g >= 0) {
            return g;
        }
        throw new java.lang.IllegalStateException("Top bit not zero: " + g);
    }

    public final int o() {
        byte[] bArr = this.f4112a;
        int i = this.b;
        int i2 = i + 1;
        int i3 = (bArr[i] & 255) << 8;
        this.b = i + 2;
        return (bArr[i2] & 255) | i3;
    }

    public n(int i) {
        this.f4112a = new byte[i];
        this.c = i;
    }

    public final void a(byte[] bArr, int i, int i2) {
        java.lang.System.arraycopy(this.f4112a, this.b, bArr, i, i2);
        this.b += i2;
    }

    public final java.lang.String b(int i) {
        java.lang.String str = new java.lang.String(this.f4112a, this.b, i, java.nio.charset.Charset.defaultCharset());
        this.b += i;
        return str;
    }

    public final java.lang.String a(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.b;
        int i3 = (i2 + i) - 1;
        java.lang.String str = new java.lang.String(this.f4112a, i2, (i3 >= this.c || this.f4112a[i3] != 0) ? i : i - 1);
        this.b += i;
        return str;
    }

    public final int d() {
        byte[] bArr = this.f4112a;
        int i = this.b;
        int i2 = ((bArr[i + 1] & 255) << 8) | (bArr[i] & 255);
        int i3 = i + 3;
        int i4 = i2 | ((bArr[i + 2] & 255) << 16);
        this.b = i + 4;
        return ((bArr[i3] & 255) << 24) | i4;
    }

    public final long e() {
        byte[] bArr = this.f4112a;
        int i = this.b;
        int i2 = i + 3;
        long j = (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << 16);
        this.b = i + 4;
        return ((bArr[i2] & 255) << 24) | j;
    }

    public n(byte[] bArr) {
        this.f4112a = bArr;
        this.c = bArr.length;
    }

    public final java.lang.String c() {
        int i = this.c;
        int i2 = this.b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.c) {
            byte b = this.f4112a[i2];
            int i3 = com.fyber.inneractive.sdk.player.exoplayer2.util.z.f4120a;
            if (b == 10 || b == 13) {
                break;
            }
            i2++;
        }
        int i4 = this.b;
        if (i2 - i4 >= 3) {
            byte[] bArr = this.f4112a;
            if (bArr[i4] == -17 && bArr[i4 + 1] == -69 && bArr[i4 + 2] == -65) {
                this.b = i4 + 3;
            }
        }
        byte[] bArr2 = this.f4112a;
        int i5 = this.b;
        java.lang.String str = new java.lang.String(bArr2, i5, i2 - i5);
        this.b = i2;
        int i6 = this.c;
        if (i2 == i6) {
            return str;
        }
        byte[] bArr3 = this.f4112a;
        if (bArr3[i2] == 13) {
            int i7 = i2 + 1;
            this.b = i7;
            if (i7 == i6) {
                return str;
            }
        }
        int i8 = this.b;
        if (bArr3[i8] == 10) {
            this.b = i8 + 1;
        }
        return str;
    }

    public n(int i, byte[] bArr) {
        this.f4112a = bArr;
        this.c = i;
    }
}
