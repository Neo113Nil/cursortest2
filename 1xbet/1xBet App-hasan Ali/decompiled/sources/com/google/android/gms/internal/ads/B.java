package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.InterruptedIOException;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class B implements G {

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC1402ov f7750l;

    /* renamed from: m, reason: collision with root package name */
    public final long f7751m;

    /* renamed from: n, reason: collision with root package name */
    public long f7752n;

    /* renamed from: p, reason: collision with root package name */
    public int f7754p;

    /* renamed from: q, reason: collision with root package name */
    public int f7755q;

    /* renamed from: o, reason: collision with root package name */
    public byte[] f7753o = new byte[65536];

    /* renamed from: k, reason: collision with root package name */
    public final byte[] f7749k = new byte[4096];

    static {
        AbstractC0830c4.a("media3.extractor");
    }

    public B(InterfaceC1402ov interfaceC1402ov, long j5, long j6) {
        this.f7750l = interfaceC1402ov;
        this.f7752n = j5;
        this.f7751m = j6;
    }

    @Override // com.google.android.gms.internal.ads.G
    public final void B(int i) {
        g(i, false);
    }

    @Override // com.google.android.gms.internal.ads.G
    public final void C(int i) {
        k(i);
    }

    @Override // com.google.android.gms.internal.ads.G
    public final void D(byte[] bArr, int i, int i5) {
        F(bArr, i, i5, false);
    }

    @Override // com.google.android.gms.internal.ads.G
    public final void E(byte[] bArr, int i, int i5) {
        G(bArr, i, i5, false);
    }

    @Override // com.google.android.gms.internal.ads.G
    public final boolean F(byte[] bArr, int i, int i5, boolean z3) {
        int min;
        int i6 = this.f7755q;
        if (i6 == 0) {
            min = 0;
        } else {
            min = Math.min(i6, i5);
            System.arraycopy(this.f7753o, 0, bArr, i, min);
            n(min);
        }
        int i7 = min;
        while (i7 < i5 && i7 != -1) {
            i7 = l(bArr, i, i5, i7, z3);
        }
        if (i7 != -1) {
            this.f7752n += i7;
        }
        return i7 != -1;
    }

    @Override // com.google.android.gms.internal.ads.G
    public final boolean G(byte[] bArr, int i, int i5, boolean z3) {
        if (!g(i5, z3)) {
            return false;
        }
        System.arraycopy(this.f7753o, this.f7754p - i5, bArr, i, i5);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.G
    public final long b() {
        return this.f7752n + this.f7754p;
    }

    @Override // com.google.android.gms.internal.ads.G
    public final long c() {
        return this.f7752n;
    }

    @Override // com.google.android.gms.internal.ads.DE
    public final int e(byte[] bArr, int i, int i5) {
        B b3;
        int i6 = this.f7755q;
        int i7 = 0;
        if (i6 != 0) {
            int min = Math.min(i6, i5);
            System.arraycopy(this.f7753o, 0, bArr, i, min);
            n(min);
            i7 = min;
        }
        if (i7 == 0) {
            b3 = this;
            i7 = b3.l(bArr, i, i5, 0, true);
        } else {
            b3 = this;
        }
        if (i7 != -1) {
            b3.f7752n += i7;
        }
        return i7;
    }

    public final int f(byte[] bArr, int i, int i5) {
        B b3;
        int min;
        m(i5);
        int i6 = this.f7755q;
        int i7 = this.f7754p;
        int i8 = i6 - i7;
        if (i8 == 0) {
            b3 = this;
            min = b3.l(this.f7753o, i7, i5, 0, true);
            if (min == -1) {
                return -1;
            }
            b3.f7755q += min;
        } else {
            b3 = this;
            min = Math.min(i5, i8);
        }
        System.arraycopy(b3.f7753o, b3.f7754p, bArr, i, min);
        b3.f7754p += min;
        return min;
    }

    public final boolean g(int i, boolean z3) {
        m(i);
        int i5 = this.f7755q - this.f7754p;
        while (i5 < i) {
            int i6 = i;
            boolean z5 = z3;
            i5 = l(this.f7753o, this.f7754p, i6, i5, z5);
            if (i5 == -1) {
                return false;
            }
            this.f7755q = this.f7754p + i5;
            i = i6;
            z3 = z5;
        }
        this.f7754p += i;
        return true;
    }

    @Override // com.google.android.gms.internal.ads.G
    public final void h() {
        this.f7754p = 0;
    }

    @Override // com.google.android.gms.internal.ads.G
    public final long j() {
        return this.f7751m;
    }

    public final void k(int i) {
        int min = Math.min(this.f7755q, i);
        n(min);
        int i5 = min;
        while (i5 < i && i5 != -1) {
            i5 = l(this.f7749k, -i5, Math.min(i, i5 + 4096), i5, false);
        }
        if (i5 != -1) {
            this.f7752n += i5;
        }
    }

    public final int l(byte[] bArr, int i, int i5, int i6, boolean z3) {
        if (Thread.interrupted()) {
            throw new InterruptedIOException();
        }
        int e3 = this.f7750l.e(bArr, i + i6, i5 - i6);
        if (e3 != -1) {
            return i6 + e3;
        }
        if (i6 == 0 && z3) {
            return -1;
        }
        throw new EOFException();
    }

    public final void m(int i) {
        int i5 = this.f7754p + i;
        int length = this.f7753o.length;
        if (i5 > length) {
            this.f7753o = Arrays.copyOf(this.f7753o, Math.max(65536 + i5, Math.min(length + length, i5 + 524288)));
        }
    }

    public final void n(int i) {
        int i5 = this.f7755q - i;
        this.f7755q = i5;
        this.f7754p = 0;
        byte[] bArr = this.f7753o;
        byte[] bArr2 = i5 < bArr.length + (-524288) ? new byte[65536 + i5] : bArr;
        System.arraycopy(bArr, i, bArr2, 0, i5);
        this.f7753o = bArr2;
    }
}
