package androidx.datastore.preferences.protobuf;

import W5.C0495d1;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: androidx.datastore.preferences.protobuf.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0687k extends Q0.a {

    /* renamed from: r, reason: collision with root package name */
    public static final Logger f9214r = Logger.getLogger(C0687k.class.getName());

    /* renamed from: s, reason: collision with root package name */
    public static final boolean f9215s = h0.f9198e;

    /* renamed from: m, reason: collision with root package name */
    public D f9216m;

    /* renamed from: n, reason: collision with root package name */
    public final byte[] f9217n;

    /* renamed from: o, reason: collision with root package name */
    public final int f9218o;

    /* renamed from: p, reason: collision with root package name */
    public int f9219p;

    /* renamed from: q, reason: collision with root package name */
    public final C0495d1 f9220q;

    public C0687k(C0495d1 c0495d1, int i7) {
        if (i7 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i7, 20);
        this.f9217n = new byte[max];
        this.f9218o = max;
        this.f9220q = c0495d1;
    }

    public static int A0(int i7) {
        return K0(i7) + 4;
    }

    public static int B0(int i7, AbstractC0677a abstractC0677a, U u4) {
        return abstractC0677a.a(u4) + (K0(i7) * 2);
    }

    public static int C0(int i7, int i8) {
        return O0(i8) + K0(i7);
    }

    public static int D0(int i7, long j) {
        return O0(j) + K0(i7);
    }

    public static int E0(int i7) {
        return K0(i7) + 4;
    }

    public static int F0(int i7) {
        return K0(i7) + 8;
    }

    public static int G0(int i7, int i8) {
        return M0((i8 >> 31) ^ (i8 << 1)) + K0(i7);
    }

    public static int H0(int i7, long j) {
        return O0((j >> 63) ^ (j << 1)) + K0(i7);
    }

    public static int I0(int i7, String str) {
        return J0(str) + K0(i7);
    }

    public static int J0(String str) {
        int length;
        try {
            length = k0.a(str);
        } catch (j0 unused) {
            length = str.getBytes(AbstractC0698w.f9255a).length;
        }
        return M0(length) + length;
    }

    public static int K0(int i7) {
        return M0(i7 << 3);
    }

    public static int L0(int i7, int i8) {
        return M0(i8) + K0(i7);
    }

    public static int M0(int i7) {
        return (352 - (Integer.numberOfLeadingZeros(i7) * 9)) >>> 6;
    }

    public static int N0(int i7, long j) {
        return O0(j) + K0(i7);
    }

    public static int O0(long j) {
        return (640 - (Long.numberOfLeadingZeros(j) * 9)) >>> 6;
    }

    public static int u0(int i7) {
        return K0(i7) + 1;
    }

    public static int v0(int i7, C0683g c0683g) {
        int K02 = K0(i7);
        int size = c0683g.size();
        return M0(size) + size + K02;
    }

    public static int w0(int i7) {
        return K0(i7) + 8;
    }

    public static int x0(int i7, int i8) {
        return O0(i8) + K0(i7);
    }

    public static int y0(int i7) {
        return K0(i7) + 4;
    }

    public static int z0(int i7) {
        return K0(i7) + 8;
    }

    public final void P0() {
        this.f9220q.write(this.f9217n, 0, this.f9219p);
        this.f9219p = 0;
    }

    public final void Q0(int i7) {
        if (this.f9218o - this.f9219p < i7) {
            P0();
        }
    }

    public final void R0(byte b7) {
        if (this.f9219p == this.f9218o) {
            P0();
        }
        int i7 = this.f9219p;
        this.f9219p = i7 + 1;
        this.f9217n[i7] = b7;
    }

    public final void S0(byte[] bArr, int i7, int i8) {
        int i9 = this.f9219p;
        int i10 = this.f9218o;
        int i11 = i10 - i9;
        byte[] bArr2 = this.f9217n;
        if (i11 >= i8) {
            System.arraycopy(bArr, i7, bArr2, i9, i8);
            this.f9219p += i8;
            return;
        }
        System.arraycopy(bArr, i7, bArr2, i9, i11);
        int i12 = i7 + i11;
        int i13 = i8 - i11;
        this.f9219p = i10;
        P0();
        if (i13 > i10) {
            this.f9220q.write(bArr, i12, i13);
        } else {
            System.arraycopy(bArr, i12, bArr2, 0, i13);
            this.f9219p = i13;
        }
    }

    public final void T0(int i7, boolean z4) {
        Q0(11);
        r0(i7, 0);
        byte b7 = z4 ? (byte) 1 : (byte) 0;
        int i8 = this.f9219p;
        this.f9219p = i8 + 1;
        this.f9217n[i8] = b7;
    }

    public final void U0(int i7, C0683g c0683g) {
        e1(i7, 2);
        V0(c0683g);
    }

    public final void V0(C0683g c0683g) {
        g1(c0683g.size());
        d0(c0683g.f9185b, c0683g.z(), c0683g.size());
    }

    public final void W0(int i7, int i8) {
        Q0(14);
        r0(i7, 5);
        p0(i8);
    }

    public final void X0(int i7) {
        Q0(4);
        p0(i7);
    }

    public final void Y0(int i7, long j) {
        Q0(18);
        r0(i7, 1);
        q0(j);
    }

    public final void Z0(long j) {
        Q0(8);
        q0(j);
    }

    public final void a1(int i7, int i8) {
        Q0(20);
        r0(i7, 0);
        if (i8 >= 0) {
            s0(i8);
        } else {
            t0(i8);
        }
    }

    public final void b1(int i7) {
        if (i7 >= 0) {
            g1(i7);
        } else {
            i1(i7);
        }
    }

    public final void c1(int i7, String str) {
        e1(i7, 2);
        d1(str);
    }

    @Override // Q0.a
    public final void d0(byte[] bArr, int i7, int i8) {
        S0(bArr, i7, i8);
    }

    public final void d1(String str) {
        try {
            int length = str.length() * 3;
            int M02 = M0(length);
            int i7 = M02 + length;
            int i8 = this.f9218o;
            if (i7 > i8) {
                byte[] bArr = new byte[length];
                int s7 = k0.f9221a.s(str, bArr, 0, length);
                g1(s7);
                S0(bArr, 0, s7);
                return;
            }
            if (i7 > i8 - this.f9219p) {
                P0();
            }
            int M03 = M0(str.length());
            int i9 = this.f9219p;
            byte[] bArr2 = this.f9217n;
            try {
                try {
                    if (M03 == M02) {
                        int i10 = i9 + M03;
                        this.f9219p = i10;
                        int s8 = k0.f9221a.s(str, bArr2, i10, i8 - i10);
                        this.f9219p = i9;
                        s0((s8 - i9) - M03);
                        this.f9219p = s8;
                    } else {
                        int a2 = k0.a(str);
                        s0(a2);
                        this.f9219p = k0.f9221a.s(str, bArr2, this.f9219p, a2);
                    }
                } catch (j0 e7) {
                    this.f9219p = i9;
                    throw e7;
                }
            } catch (ArrayIndexOutOfBoundsException e8) {
                throw new Z4.b(e8);
            }
        } catch (j0 e9) {
            f9214r.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e9);
            byte[] bytes = str.getBytes(AbstractC0698w.f9255a);
            try {
                g1(bytes.length);
                d0(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e10) {
                throw new Z4.b(e10);
            }
        }
    }

    public final void e1(int i7, int i8) {
        g1((i7 << 3) | i8);
    }

    public final void f1(int i7, int i8) {
        Q0(20);
        r0(i7, 0);
        s0(i8);
    }

    public final void g1(int i7) {
        Q0(5);
        s0(i7);
    }

    public final void h1(int i7, long j) {
        Q0(20);
        r0(i7, 0);
        t0(j);
    }

    public final void i1(long j) {
        Q0(10);
        t0(j);
    }

    public final void p0(int i7) {
        int i8 = this.f9219p;
        int i9 = i8 + 1;
        this.f9219p = i9;
        byte[] bArr = this.f9217n;
        bArr[i8] = (byte) (i7 & 255);
        int i10 = i8 + 2;
        this.f9219p = i10;
        bArr[i9] = (byte) ((i7 >> 8) & 255);
        int i11 = i8 + 3;
        this.f9219p = i11;
        bArr[i10] = (byte) ((i7 >> 16) & 255);
        this.f9219p = i8 + 4;
        bArr[i11] = (byte) ((i7 >> 24) & 255);
    }

    public final void q0(long j) {
        int i7 = this.f9219p;
        int i8 = i7 + 1;
        this.f9219p = i8;
        byte[] bArr = this.f9217n;
        bArr[i7] = (byte) (j & 255);
        int i9 = i7 + 2;
        this.f9219p = i9;
        bArr[i8] = (byte) ((j >> 8) & 255);
        int i10 = i7 + 3;
        this.f9219p = i10;
        bArr[i9] = (byte) ((j >> 16) & 255);
        int i11 = i7 + 4;
        this.f9219p = i11;
        bArr[i10] = (byte) (255 & (j >> 24));
        int i12 = i7 + 5;
        this.f9219p = i12;
        bArr[i11] = (byte) (((int) (j >> 32)) & 255);
        int i13 = i7 + 6;
        this.f9219p = i13;
        bArr[i12] = (byte) (((int) (j >> 40)) & 255);
        int i14 = i7 + 7;
        this.f9219p = i14;
        bArr[i13] = (byte) (((int) (j >> 48)) & 255);
        this.f9219p = i7 + 8;
        bArr[i14] = (byte) (((int) (j >> 56)) & 255);
    }

    public final void r0(int i7, int i8) {
        s0((i7 << 3) | i8);
    }

    public final void s0(int i7) {
        boolean z4 = f9215s;
        byte[] bArr = this.f9217n;
        if (z4) {
            while ((i7 & (-128)) != 0) {
                int i8 = this.f9219p;
                this.f9219p = i8 + 1;
                h0.j(bArr, i8, (byte) ((i7 | 128) & 255));
                i7 >>>= 7;
            }
            int i9 = this.f9219p;
            this.f9219p = i9 + 1;
            h0.j(bArr, i9, (byte) i7);
            return;
        }
        while ((i7 & (-128)) != 0) {
            int i10 = this.f9219p;
            this.f9219p = i10 + 1;
            bArr[i10] = (byte) ((i7 | 128) & 255);
            i7 >>>= 7;
        }
        int i11 = this.f9219p;
        this.f9219p = i11 + 1;
        bArr[i11] = (byte) i7;
    }

    public final void t0(long j) {
        boolean z4 = f9215s;
        byte[] bArr = this.f9217n;
        if (z4) {
            while ((j & (-128)) != 0) {
                int i7 = this.f9219p;
                this.f9219p = i7 + 1;
                h0.j(bArr, i7, (byte) ((((int) j) | 128) & 255));
                j >>>= 7;
            }
            int i8 = this.f9219p;
            this.f9219p = i8 + 1;
            h0.j(bArr, i8, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            int i9 = this.f9219p;
            this.f9219p = i9 + 1;
            bArr[i9] = (byte) ((((int) j) | 128) & 255);
            j >>>= 7;
        }
        int i10 = this.f9219p;
        this.f9219p = i10 + 1;
        bArr[i10] = (byte) j;
    }
}
