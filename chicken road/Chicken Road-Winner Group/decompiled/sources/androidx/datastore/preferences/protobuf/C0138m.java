package androidx.datastore.preferences.protobuf;

import a.AbstractC0086a;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* renamed from: androidx.datastore.preferences.protobuf.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0138m extends AbstractC0086a {

    /* renamed from: g, reason: collision with root package name */
    public static final Logger f2262g = Logger.getLogger(C0138m.class.getName());

    /* renamed from: h, reason: collision with root package name */
    public static final boolean f2263h = j0.f2255e;

    /* renamed from: b, reason: collision with root package name */
    public F f2264b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f2265c;

    /* renamed from: d, reason: collision with root package name */
    public final int f2266d;

    /* renamed from: e, reason: collision with root package name */
    public int f2267e;
    public final K.l0 f;

    public C0138m(K.l0 l0Var, int i3) {
        if (i3 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i3, 20);
        this.f2265c = new byte[max];
        this.f2266d = max;
        this.f = l0Var;
    }

    public static int o0(int i3, C0132g c0132g) {
        int q02 = q0(i3);
        int size = c0132g.size();
        return r0(size) + size + q02;
    }

    public static int p0(String str) {
        int length;
        try {
            length = m0.a(str);
        } catch (l0 unused) {
            length = str.getBytes(AbstractC0149y.f2300a).length;
        }
        return r0(length) + length;
    }

    public static int q0(int i3) {
        return r0(i3 << 3);
    }

    public static int r0(int i3) {
        return (352 - (Integer.numberOfLeadingZeros(i3) * 9)) >>> 6;
    }

    public static int s0(long j3) {
        return (640 - (Long.numberOfLeadingZeros(j3) * 9)) >>> 6;
    }

    public final void A0(int i3, int i4) {
        u0(14);
        l0(i3, 5);
        j0(i4);
    }

    public final void B0(int i3) {
        u0(4);
        j0(i3);
    }

    public final void C0(int i3, long j3) {
        u0(18);
        l0(i3, 1);
        k0(j3);
    }

    public final void D0(long j3) {
        u0(8);
        k0(j3);
    }

    public final void E0(int i3, int i4) {
        u0(20);
        l0(i3, 0);
        if (i4 >= 0) {
            m0(i4);
        } else {
            n0(i4);
        }
    }

    public final void F0(int i3) {
        if (i3 >= 0) {
            L0(i3);
        } else {
            N0(i3);
        }
    }

    public final void G0(int i3, AbstractC0126a abstractC0126a, W w3) {
        J0(i3, 2);
        L0(abstractC0126a.a(w3));
        w3.b(abstractC0126a, this.f2264b);
    }

    public final void H0(int i3, String str) {
        J0(i3, 2);
        I0(str);
    }

    public final void I0(String str) {
        try {
            int length = str.length() * 3;
            int r02 = r0(length);
            int i3 = r02 + length;
            int i4 = this.f2266d;
            if (i3 > i4) {
                byte[] bArr = new byte[length];
                int t3 = m0.f2268a.t(str, bArr, 0, length);
                L0(t3);
                w0(bArr, 0, t3);
                return;
            }
            if (i3 > i4 - this.f2267e) {
                t0();
            }
            int r03 = r0(str.length());
            int i5 = this.f2267e;
            byte[] bArr2 = this.f2265c;
            try {
                try {
                    if (r03 == r02) {
                        int i6 = i5 + r03;
                        this.f2267e = i6;
                        int t4 = m0.f2268a.t(str, bArr2, i6, i4 - i6);
                        this.f2267e = i5;
                        m0((t4 - i5) - r03);
                        this.f2267e = t4;
                    } else {
                        int a3 = m0.a(str);
                        m0(a3);
                        this.f2267e = m0.f2268a.t(str, bArr2, this.f2267e, a3);
                    }
                } catch (ArrayIndexOutOfBoundsException e3) {
                    throw new C0137l(e3);
                }
            } catch (l0 e4) {
                this.f2267e = i5;
                throw e4;
            }
        } catch (l0 e5) {
            f2262g.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e5);
            byte[] bytes = str.getBytes(AbstractC0149y.f2300a);
            try {
                L0(bytes.length);
                h0(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e6) {
                throw new C0137l(e6);
            }
        }
    }

    public final void J0(int i3, int i4) {
        L0((i3 << 3) | i4);
    }

    public final void K0(int i3, int i4) {
        u0(20);
        l0(i3, 0);
        m0(i4);
    }

    public final void L0(int i3) {
        u0(5);
        m0(i3);
    }

    public final void M0(int i3, long j3) {
        u0(20);
        l0(i3, 0);
        n0(j3);
    }

    public final void N0(long j3) {
        u0(10);
        n0(j3);
    }

    @Override // a.AbstractC0086a
    public final void h0(byte[] bArr, int i3, int i4) {
        w0(bArr, i3, i4);
    }

    public final void j0(int i3) {
        int i4 = this.f2267e;
        int i5 = i4 + 1;
        this.f2267e = i5;
        byte b3 = (byte) (i3 & KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = this.f2265c;
        bArr[i4] = b3;
        int i6 = i4 + 2;
        this.f2267e = i6;
        bArr[i5] = (byte) ((i3 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i7 = i4 + 3;
        this.f2267e = i7;
        bArr[i6] = (byte) ((i3 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f2267e = i4 + 4;
        bArr[i7] = (byte) ((i3 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public final void k0(long j3) {
        int i3 = this.f2267e;
        int i4 = i3 + 1;
        this.f2267e = i4;
        byte[] bArr = this.f2265c;
        bArr[i3] = (byte) (j3 & 255);
        int i5 = i3 + 2;
        this.f2267e = i5;
        bArr[i4] = (byte) ((j3 >> 8) & 255);
        int i6 = i3 + 3;
        this.f2267e = i6;
        bArr[i5] = (byte) ((j3 >> 16) & 255);
        int i7 = i3 + 4;
        this.f2267e = i7;
        bArr[i6] = (byte) (255 & (j3 >> 24));
        int i8 = i3 + 5;
        this.f2267e = i8;
        bArr[i7] = (byte) (((int) (j3 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i9 = i3 + 6;
        this.f2267e = i9;
        bArr[i8] = (byte) (((int) (j3 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i10 = i3 + 7;
        this.f2267e = i10;
        bArr[i9] = (byte) (((int) (j3 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f2267e = i3 + 8;
        bArr[i10] = (byte) (((int) (j3 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public final void l0(int i3, int i4) {
        m0((i3 << 3) | i4);
    }

    public final void m0(int i3) {
        boolean z3 = f2263h;
        byte[] bArr = this.f2265c;
        if (z3) {
            while ((i3 & (-128)) != 0) {
                int i4 = this.f2267e;
                this.f2267e = i4 + 1;
                j0.j(bArr, i4, (byte) ((i3 | 128) & KotlinVersion.MAX_COMPONENT_VALUE));
                i3 >>>= 7;
            }
            int i5 = this.f2267e;
            this.f2267e = i5 + 1;
            j0.j(bArr, i5, (byte) i3);
            return;
        }
        while ((i3 & (-128)) != 0) {
            int i6 = this.f2267e;
            this.f2267e = i6 + 1;
            bArr[i6] = (byte) ((i3 | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
            i3 >>>= 7;
        }
        int i7 = this.f2267e;
        this.f2267e = i7 + 1;
        bArr[i7] = (byte) i3;
    }

    public final void n0(long j3) {
        boolean z3 = f2263h;
        byte[] bArr = this.f2265c;
        if (z3) {
            while ((j3 & (-128)) != 0) {
                int i3 = this.f2267e;
                this.f2267e = i3 + 1;
                j0.j(bArr, i3, (byte) ((((int) j3) | 128) & KotlinVersion.MAX_COMPONENT_VALUE));
                j3 >>>= 7;
            }
            int i4 = this.f2267e;
            this.f2267e = i4 + 1;
            j0.j(bArr, i4, (byte) j3);
            return;
        }
        while ((j3 & (-128)) != 0) {
            int i5 = this.f2267e;
            this.f2267e = i5 + 1;
            bArr[i5] = (byte) ((((int) j3) | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
            j3 >>>= 7;
        }
        int i6 = this.f2267e;
        this.f2267e = i6 + 1;
        bArr[i6] = (byte) j3;
    }

    public final void t0() {
        this.f.write(this.f2265c, 0, this.f2267e);
        this.f2267e = 0;
    }

    public final void u0(int i3) {
        if (this.f2266d - this.f2267e < i3) {
            t0();
        }
    }

    public final void v0(byte b3) {
        if (this.f2267e == this.f2266d) {
            t0();
        }
        int i3 = this.f2267e;
        this.f2267e = i3 + 1;
        this.f2265c[i3] = b3;
    }

    public final void w0(byte[] bArr, int i3, int i4) {
        int i5 = this.f2267e;
        int i6 = this.f2266d;
        int i7 = i6 - i5;
        byte[] bArr2 = this.f2265c;
        if (i7 >= i4) {
            System.arraycopy(bArr, i3, bArr2, i5, i4);
            this.f2267e += i4;
            return;
        }
        System.arraycopy(bArr, i3, bArr2, i5, i7);
        int i8 = i3 + i7;
        int i9 = i4 - i7;
        this.f2267e = i6;
        t0();
        if (i9 > i6) {
            this.f.write(bArr, i8, i9);
        } else {
            System.arraycopy(bArr, i8, bArr2, 0, i9);
            this.f2267e = i9;
        }
    }

    public final void x0(int i3, boolean z3) {
        u0(11);
        l0(i3, 0);
        byte b3 = z3 ? (byte) 1 : (byte) 0;
        int i4 = this.f2267e;
        this.f2267e = i4 + 1;
        this.f2265c[i4] = b3;
    }

    public final void y0(int i3, C0132g c0132g) {
        J0(i3, 2);
        z0(c0132g);
    }

    public final void z0(C0132g c0132g) {
        L0(c0132g.size());
        h0(c0132g.f2233b, c0132g.f(), c0132g.size());
    }
}
