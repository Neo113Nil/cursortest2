package androidx.datastore.preferences.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;
import u1.AbstractC1477a;

/* renamed from: androidx.datastore.preferences.protobuf.l, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0217l extends AbstractC1477a {

    /* renamed from: h, reason: collision with root package name */
    public static final Logger f4467h = Logger.getLogger(C0217l.class.getName());

    /* renamed from: i, reason: collision with root package name */
    public static final boolean f4468i = i0.f4459d;

    /* renamed from: c, reason: collision with root package name */
    public E f4469c;

    /* renamed from: d, reason: collision with root package name */
    public final byte[] f4470d;

    /* renamed from: e, reason: collision with root package name */
    public final int f4471e;

    /* renamed from: f, reason: collision with root package name */
    public int f4472f;

    /* renamed from: g, reason: collision with root package name */
    public final M.m0 f4473g;

    public C0217l(M.m0 m0Var, int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException("bufferSize must be >= 0");
        }
        int max = Math.max(i2, 20);
        this.f4470d = new byte[max];
        this.f4471e = max;
        this.f4473g = m0Var;
    }

    public static int J(int i2) {
        return Z(i2) + 1;
    }

    public static int K(int i2, C0212g c0212g) {
        int Z2 = Z(i2);
        int size = c0212g.size();
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

    public static int Q(int i2, AbstractC0206a abstractC0206a, V v4) {
        return abstractC0206a.a(v4) + (Z(i2) * 2);
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

    public static int X(int i2, String str) {
        return Y(str) + Z(i2);
    }

    public static int Y(String str) {
        int length;
        try {
            length = l0.a(str);
        } catch (k0 unused) {
            length = str.getBytes(AbstractC0228x.f4508a).length;
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
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    public static int c0(int i2, long j2) {
        return d0(j2) + Z(i2);
    }

    public static int d0(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    @Override // u1.AbstractC1477a
    public final void D(byte[] bArr, int i2, int i3) {
        h0(bArr, i2, i3);
    }

    public final void E(int i2) {
        int i3 = this.f4472f;
        int i6 = i3 + 1;
        this.f4472f = i6;
        byte b6 = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
        byte[] bArr = this.f4470d;
        bArr[i3] = b6;
        int i7 = i3 + 2;
        this.f4472f = i7;
        bArr[i6] = (byte) ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i8 = i3 + 3;
        this.f4472f = i8;
        bArr[i7] = (byte) ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f4472f = i3 + 4;
        bArr[i8] = (byte) ((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public final void F(long j2) {
        int i2 = this.f4472f;
        int i3 = i2 + 1;
        this.f4472f = i3;
        byte[] bArr = this.f4470d;
        bArr[i2] = (byte) (j2 & 255);
        int i6 = i2 + 2;
        this.f4472f = i6;
        bArr[i3] = (byte) ((j2 >> 8) & 255);
        int i7 = i2 + 3;
        this.f4472f = i7;
        bArr[i6] = (byte) ((j2 >> 16) & 255);
        int i8 = i2 + 4;
        this.f4472f = i8;
        bArr[i7] = (byte) (255 & (j2 >> 24));
        int i9 = i2 + 5;
        this.f4472f = i9;
        bArr[i8] = (byte) (((int) (j2 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i10 = i2 + 6;
        this.f4472f = i10;
        bArr[i9] = (byte) (((int) (j2 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
        int i11 = i2 + 7;
        this.f4472f = i11;
        bArr[i10] = (byte) (((int) (j2 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
        this.f4472f = i2 + 8;
        bArr[i11] = (byte) (((int) (j2 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
    }

    public final void G(int i2, int i3) {
        H((i2 << 3) | i3);
    }

    public final void H(int i2) {
        boolean z = f4468i;
        byte[] bArr = this.f4470d;
        if (z) {
            while ((i2 & (-128)) != 0) {
                int i3 = this.f4472f;
                this.f4472f = i3 + 1;
                i0.j(bArr, i3, (byte) ((i2 | 128) & KotlinVersion.MAX_COMPONENT_VALUE));
                i2 >>>= 7;
            }
            int i6 = this.f4472f;
            this.f4472f = i6 + 1;
            i0.j(bArr, i6, (byte) i2);
            return;
        }
        while ((i2 & (-128)) != 0) {
            int i7 = this.f4472f;
            this.f4472f = i7 + 1;
            bArr[i7] = (byte) ((i2 | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
            i2 >>>= 7;
        }
        int i8 = this.f4472f;
        this.f4472f = i8 + 1;
        bArr[i8] = (byte) i2;
    }

    public final void I(long j2) {
        boolean z = f4468i;
        byte[] bArr = this.f4470d;
        if (z) {
            while ((j2 & (-128)) != 0) {
                int i2 = this.f4472f;
                this.f4472f = i2 + 1;
                i0.j(bArr, i2, (byte) ((((int) j2) | 128) & KotlinVersion.MAX_COMPONENT_VALUE));
                j2 >>>= 7;
            }
            int i3 = this.f4472f;
            this.f4472f = i3 + 1;
            i0.j(bArr, i3, (byte) j2);
            return;
        }
        while ((j2 & (-128)) != 0) {
            int i6 = this.f4472f;
            this.f4472f = i6 + 1;
            bArr[i6] = (byte) ((((int) j2) | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
            j2 >>>= 7;
        }
        int i7 = this.f4472f;
        this.f4472f = i7 + 1;
        bArr[i7] = (byte) j2;
    }

    public final void e0() {
        this.f4473g.write(this.f4470d, 0, this.f4472f);
        this.f4472f = 0;
    }

    public final void f0(int i2) {
        if (this.f4471e - this.f4472f < i2) {
            e0();
        }
    }

    public final void g0(byte b6) {
        if (this.f4472f == this.f4471e) {
            e0();
        }
        int i2 = this.f4472f;
        this.f4472f = i2 + 1;
        this.f4470d[i2] = b6;
    }

    public final void h0(byte[] bArr, int i2, int i3) {
        int i6 = this.f4472f;
        int i7 = this.f4471e;
        int i8 = i7 - i6;
        byte[] bArr2 = this.f4470d;
        if (i8 >= i3) {
            System.arraycopy(bArr, i2, bArr2, i6, i3);
            this.f4472f += i3;
            return;
        }
        System.arraycopy(bArr, i2, bArr2, i6, i8);
        int i9 = i2 + i8;
        int i10 = i3 - i8;
        this.f4472f = i7;
        e0();
        if (i10 > i7) {
            this.f4473g.write(bArr, i9, i10);
        } else {
            System.arraycopy(bArr, i9, bArr2, 0, i10);
            this.f4472f = i10;
        }
    }

    public final void i0(int i2, boolean z) {
        f0(11);
        G(i2, 0);
        byte b6 = z ? (byte) 1 : (byte) 0;
        int i3 = this.f4472f;
        this.f4472f = i3 + 1;
        this.f4470d[i3] = b6;
    }

    public final void j0(int i2, C0212g c0212g) {
        t0(i2, 2);
        k0(c0212g);
    }

    public final void k0(C0212g c0212g) {
        v0(c0212g.size());
        D(c0212g.f4439b, c0212g.f(), c0212g.size());
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

    public final void r0(int i2, String str) {
        t0(i2, 2);
        s0(str);
    }

    public final void s0(String str) {
        try {
            int length = str.length() * 3;
            int b02 = b0(length);
            int i2 = b02 + length;
            int i3 = this.f4471e;
            if (i2 > i3) {
                byte[] bArr = new byte[length];
                int l2 = l0.f4474a.l(str, bArr, 0, length);
                v0(l2);
                h0(bArr, 0, l2);
                return;
            }
            if (i2 > i3 - this.f4472f) {
                e0();
            }
            int b03 = b0(str.length());
            int i6 = this.f4472f;
            byte[] bArr2 = this.f4470d;
            try {
                if (b03 == b02) {
                    int i7 = i6 + b03;
                    this.f4472f = i7;
                    int l6 = l0.f4474a.l(str, bArr2, i7, i3 - i7);
                    this.f4472f = i6;
                    H((l6 - i6) - b03);
                    this.f4472f = l6;
                } else {
                    int a6 = l0.a(str);
                    H(a6);
                    this.f4472f = l0.f4474a.l(str, bArr2, this.f4472f, a6);
                }
            } catch (k0 e3) {
                this.f4472f = i6;
                throw e3;
            } catch (ArrayIndexOutOfBoundsException e6) {
                throw new C0216k(e6);
            }
        } catch (k0 e7) {
            f4467h.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e7);
            byte[] bytes = str.getBytes(AbstractC0228x.f4508a);
            try {
                v0(bytes.length);
                D(bytes, 0, bytes.length);
            } catch (IndexOutOfBoundsException e8) {
                throw new C0216k(e8);
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
