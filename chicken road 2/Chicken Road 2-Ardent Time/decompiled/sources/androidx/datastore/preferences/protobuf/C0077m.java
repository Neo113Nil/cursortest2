package androidx.datastore.preferences.protobuf;

/* renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0077m extends Q1.d {

    /* renamed from: f, reason: collision with root package name */
    public static final java.util.logging.Logger f2335f = java.util.logging.Logger.getLogger(androidx.datastore.preferences.protobuf.C0077m.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f2336g = androidx.datastore.preferences.protobuf.j0.f2327d;

    /* renamed from: a, reason: collision with root package name */
    public androidx.datastore.preferences.protobuf.F f2337a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f2338b;

    /* renamed from: c, reason: collision with root package name */
    public final int f2339c;

    /* renamed from: d, reason: collision with root package name */
    public int f2340d;

    /* renamed from: e, reason: collision with root package name */
    public final F.m0 f2341e;

    public C0077m(F.m0 m0Var, int i2) {
        if (i2 < 0) {
            throw new java.lang.IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = java.lang.Math.max(i2, 20);
        this.f2338b = new byte[max];
        this.f2339c = max;
        this.f2341e = m0Var;
    }

    public static int J(int i2) {
        return Z(i2) + 1;
    }

    public static int K(int i2, androidx.datastore.preferences.protobuf.C0071g c0071g) {
        int Z2 = Z(i2);
        int size = c0071g.size();
        return b0(size) + size + Z2;
    }

    public static int L(int i2) {
        return Z(i2) + 8;
    }

    public static int M(int i2, int i3) {
        return d0(i3) + Z(i2);
    }

    public static int N(int i2) {
        return Z(i2) + 4;
    }

    public static int O(int i2) {
        return Z(i2) + 8;
    }

    public static int P(int i2) {
        return Z(i2) + 4;
    }

    public static int Q(int i2, androidx.datastore.preferences.protobuf.AbstractC0065a abstractC0065a, androidx.datastore.preferences.protobuf.W w2) {
        return abstractC0065a.a(w2) + (Z(i2) * 2);
    }

    public static int R(int i2, int i3) {
        return d0(i3) + Z(i2);
    }

    public static int S(int i2, long j2) {
        return d0(j2) + Z(i2);
    }

    public static int T(int i2) {
        return Z(i2) + 4;
    }

    public static int U(int i2) {
        return Z(i2) + 8;
    }

    public static int V(int i2, int i3) {
        return b0((i3 >> 31) ^ (i3 << 1)) + Z(i2);
    }

    public static int W(int i2, long j2) {
        return d0((j2 >> 63) ^ (j2 << 1)) + Z(i2);
    }

    public static int X(int i2, java.lang.String str) {
        return Y(str) + Z(i2);
    }

    public static int Y(java.lang.String str) {
        int length;
        try {
            length = androidx.datastore.preferences.protobuf.m0.a(str);
        } catch (androidx.datastore.preferences.protobuf.l0 unused) {
            length = str.getBytes(androidx.datastore.preferences.protobuf.AbstractC0088y.f2376a).length;
        }
        return b0(length) + length;
    }

    public static int Z(int i2) {
        return b0(i2 << 3);
    }

    public static int a0(int i2, int i3) {
        return b0(i3) + Z(i2);
    }

    public static int b0(int i2) {
        return (352 - (java.lang.Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    public static int c0(int i2, long j2) {
        return d0(j2) + Z(i2);
    }

    public static int d0(long j2) {
        return (640 - (java.lang.Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    @Override // Q1.d
    public final void D(byte[] bArr, int i2, int i3) {
        h0(bArr, i2, i3);
    }

    public final void E(int i2) {
        int i3 = this.f2340d;
        int i4 = i3 + 1;
        this.f2340d = i4;
        byte b2 = (byte) (i2 & kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = this.f2338b;
        bArr[i3] = b2;
        int i5 = i3 + 2;
        this.f2340d = i5;
        bArr[i4] = (byte) ((i2 >> 8) & kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
        int i6 = i3 + 3;
        this.f2340d = i6;
        bArr[i5] = (byte) ((i2 >> 16) & kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
        this.f2340d = i3 + 4;
        bArr[i6] = (byte) ((i2 >> 24) & kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public final void F(long j2) {
        int i2 = this.f2340d;
        int i3 = i2 + 1;
        this.f2340d = i3;
        byte[] bArr = this.f2338b;
        bArr[i2] = (byte) (j2 & 255);
        int i4 = i2 + 2;
        this.f2340d = i4;
        bArr[i3] = (byte) ((j2 >> 8) & 255);
        int i5 = i2 + 3;
        this.f2340d = i5;
        bArr[i4] = (byte) ((j2 >> 16) & 255);
        int i6 = i2 + 4;
        this.f2340d = i6;
        bArr[i5] = (byte) (255 & (j2 >> 24));
        int i7 = i2 + 5;
        this.f2340d = i7;
        bArr[i6] = (byte) (((int) (j2 >> 32)) & kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
        int i8 = i2 + 6;
        this.f2340d = i8;
        bArr[i7] = (byte) (((int) (j2 >> 40)) & kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
        int i9 = i2 + 7;
        this.f2340d = i9;
        bArr[i8] = (byte) (((int) (j2 >> 48)) & kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
        this.f2340d = i2 + 8;
        bArr[i9] = (byte) (((int) (j2 >> 56)) & kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public final void G(int i2, int i3) {
        H((i2 << 3) | i3);
    }

    public final void H(int i2) {
        boolean z2 = f2336g;
        byte[] bArr = this.f2338b;
        if (z2) {
            while ((i2 & (-128)) != 0) {
                int i3 = this.f2340d;
                this.f2340d = i3 + 1;
                androidx.datastore.preferences.protobuf.j0.j(bArr, i3, (byte) ((i2 | 128) & kotlin.KotlinVersion.MAX_COMPONENT_VALUE));
                i2 >>>= 7;
            }
            int i4 = this.f2340d;
            this.f2340d = i4 + 1;
            androidx.datastore.preferences.protobuf.j0.j(bArr, i4, (byte) i2);
            return;
        }
        while ((i2 & (-128)) != 0) {
            int i5 = this.f2340d;
            this.f2340d = i5 + 1;
            bArr[i5] = (byte) ((i2 | 128) & kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
            i2 >>>= 7;
        }
        int i6 = this.f2340d;
        this.f2340d = i6 + 1;
        bArr[i6] = (byte) i2;
    }

    public final void I(long j2) {
        boolean z2 = f2336g;
        byte[] bArr = this.f2338b;
        if (z2) {
            while ((j2 & (-128)) != 0) {
                int i2 = this.f2340d;
                this.f2340d = i2 + 1;
                androidx.datastore.preferences.protobuf.j0.j(bArr, i2, (byte) ((((int) j2) | 128) & kotlin.KotlinVersion.MAX_COMPONENT_VALUE));
                j2 >>>= 7;
            }
            int i3 = this.f2340d;
            this.f2340d = i3 + 1;
            androidx.datastore.preferences.protobuf.j0.j(bArr, i3, (byte) j2);
            return;
        }
        while ((j2 & (-128)) != 0) {
            int i4 = this.f2340d;
            this.f2340d = i4 + 1;
            bArr[i4] = (byte) ((((int) j2) | 128) & kotlin.KotlinVersion.MAX_COMPONENT_VALUE);
            j2 >>>= 7;
        }
        int i5 = this.f2340d;
        this.f2340d = i5 + 1;
        bArr[i5] = (byte) j2;
    }

    public final void e0() {
        this.f2341e.write(this.f2338b, 0, this.f2340d);
        this.f2340d = 0;
    }

    public final void f0(int i2) {
        if (this.f2339c - this.f2340d < i2) {
            e0();
        }
    }

    public final void g0(byte b2) {
        if (this.f2340d == this.f2339c) {
            e0();
        }
        int i2 = this.f2340d;
        this.f2340d = i2 + 1;
        this.f2338b[i2] = b2;
    }

    public final void h0(byte[] bArr, int i2, int i3) {
        int i4 = this.f2340d;
        int i5 = this.f2339c;
        int i6 = i5 - i4;
        byte[] bArr2 = this.f2338b;
        if (i6 >= i3) {
            java.lang.System.arraycopy(bArr, i2, bArr2, i4, i3);
            this.f2340d += i3;
            return;
        }
        java.lang.System.arraycopy(bArr, i2, bArr2, i4, i6);
        int i7 = i2 + i6;
        int i8 = i3 - i6;
        this.f2340d = i5;
        e0();
        if (i8 > i5) {
            this.f2341e.write(bArr, i7, i8);
        } else {
            java.lang.System.arraycopy(bArr, i7, bArr2, 0, i8);
            this.f2340d = i8;
        }
    }

    public final void i0(int i2, boolean z2) {
        f0(11);
        G(i2, 0);
        byte b2 = z2 ? (byte) 1 : (byte) 0;
        int i3 = this.f2340d;
        this.f2340d = i3 + 1;
        this.f2338b[i3] = b2;
    }

    public final void j0(int i2, androidx.datastore.preferences.protobuf.C0071g c0071g) {
        t0(i2, 2);
        k0(c0071g);
    }

    public final void k0(androidx.datastore.preferences.protobuf.C0071g c0071g) {
        v0(c0071g.size());
        D(c0071g.f2304b, c0071g.e(), c0071g.size());
    }

    public final void l0(int i2, int i3) {
        f0(14);
        G(i2, 5);
        E(i3);
    }

    public final void m0(int i2) {
        f0(4);
        E(i2);
    }

    public final void n0(int i2, long j2) {
        f0(18);
        G(i2, 1);
        F(j2);
    }

    public final void o0(long j2) {
        f0(8);
        F(j2);
    }

    public final void p0(int i2, int i3) {
        f0(20);
        G(i2, 0);
        if (i3 >= 0) {
            H(i3);
        } else {
            I(i3);
        }
    }

    public final void q0(int i2) {
        if (i2 >= 0) {
            v0(i2);
        } else {
            x0(i2);
        }
    }

    public final void r0(int i2, java.lang.String str) {
        t0(i2, 2);
        s0(str);
    }

    public final void s0(java.lang.String str) {
        try {
            int length = str.length() * 3;
            int b02 = b0(length);
            int i2 = b02 + length;
            int i3 = this.f2339c;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int k2 = androidx.datastore.preferences.protobuf.m0.f2342a.k(str, bArr, 0, length);
                v0(k2);
                h0(bArr, 0, k2);
                return;
            }
            if (i2 > i3 - this.f2340d) {
                e0();
            }
            int b03 = b0(str.length());
            int i4 = this.f2340d;
            byte[] bArr2 = this.f2338b;
            try {
                try {
                    if (b03 == b02) {
                        int i5 = i4 + b03;
                        this.f2340d = i5;
                        int k3 = androidx.datastore.preferences.protobuf.m0.f2342a.k(str, bArr2, i5, i3 - i5);
                        this.f2340d = i4;
                        H((k3 - i4) - b03);
                        this.f2340d = k3;
                    } else {
                        int a2 = androidx.datastore.preferences.protobuf.m0.a(str);
                        H(a2);
                        this.f2340d = androidx.datastore.preferences.protobuf.m0.f2342a.k(str, bArr2, this.f2340d, a2);
                    }
                } catch (java.lang.ArrayIndexOutOfBoundsException e2) {
                    throw new androidx.datastore.preferences.protobuf.C0076l(e2);
                }
            } catch (androidx.datastore.preferences.protobuf.l0 e3) {
                this.f2340d = i4;
                throw e3;
            }
        } catch (androidx.datastore.preferences.protobuf.l0 e4) {
            f2335f.log(java.util.logging.Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (java.lang.Throwable) e4);
            byte[] bytes = str.getBytes(androidx.datastore.preferences.protobuf.AbstractC0088y.f2376a);
            try {
                v0(bytes.length);
                D(bytes, 0, bytes.length);
            } catch (java.lang.IndexOutOfBoundsException e5) {
                throw new androidx.datastore.preferences.protobuf.C0076l(e5);
            }
        }
    }

    public final void t0(int i2, int i3) {
        v0((i2 << 3) | i3);
    }

    public final void u0(int i2, int i3) {
        f0(20);
        G(i2, 0);
        H(i3);
    }

    public final void v0(int i2) {
        f0(5);
        H(i2);
    }

    public final void w0(int i2, long j2) {
        f0(20);
        G(i2, 0);
        I(j2);
    }

    public final void x0(long j2) {
        f0(10);
        I(j2);
    }
}
