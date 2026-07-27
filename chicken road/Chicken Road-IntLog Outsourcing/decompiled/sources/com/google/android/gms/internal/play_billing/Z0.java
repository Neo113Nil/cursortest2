package com.google.android.gms.internal.play_billing;

import androidx.datastore.preferences.protobuf.C0216k;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class Z0 extends AbstractC0325d1 {

    /* renamed from: f, reason: collision with root package name */
    public static final Logger f5147f = Logger.getLogger(Z0.class.getName());

    /* renamed from: g, reason: collision with root package name */
    public static final boolean f5148g = M1.f5083e;

    /* renamed from: b, reason: collision with root package name */
    public C0366r1 f5149b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f5150c;

    /* renamed from: d, reason: collision with root package name */
    public final int f5151d;

    /* renamed from: e, reason: collision with root package name */
    public int f5152e;

    public Z0(int i2, byte[] bArr) {
        super(11);
        int length = bArr.length;
        if (((length - i2) | i2) < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException(B0.o.h("Array range is invalid. Buffer.length=", length, i2, ", offset=0, length="));
        }
        this.f5150c = bArr;
        this.f5152e = 0;
        this.f5151d = i2;
    }

    public static int V(long j2) {
        return (640 - (Long.numberOfLeadingZeros(j2) * 9)) >>> 6;
    }

    public static int k0(int i2, S0 s02, D1 d12) {
        int n02 = n0(i2 << 3);
        return s02.a(d12) + n02 + n02;
    }

    public static int l0(S0 s02, D1 d12) {
        int a6 = s02.a(d12);
        return n0(a6) + a6;
    }

    public static int m0(String str) {
        int length;
        try {
            length = O1.c(str);
        } catch (N1 unused) {
            length = str.getBytes(AbstractC0349l1.f5205a).length;
        }
        return n0(length) + length;
    }

    public static int n0(int i2) {
        return (352 - (Integer.numberOfLeadingZeros(i2) * 9)) >>> 6;
    }

    public final void W(int i2, byte[] bArr) {
        try {
            System.arraycopy(bArr, 0, this.f5150c, this.f5152e, i2);
            this.f5152e += i2;
        } catch (IndexOutOfBoundsException e3) {
            throw new C0216k(this.f5152e, this.f5151d, i2, e3);
        }
    }

    public final void X(int i2, Y0 y02) {
        h0((i2 << 3) | 2);
        h0(y02.d());
        W(y02.d(), y02.f5144b);
    }

    public final void Y(int i2, int i3) {
        h0((i2 << 3) | 5);
        Z(i3);
    }

    public final void Z(int i2) {
        int i3 = this.f5152e;
        try {
            byte[] bArr = this.f5150c;
            bArr[i3] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i3 + 1] = (byte) ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i3 + 2] = (byte) ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i3 + 3] = (byte) ((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f5152e = i3 + 4;
        } catch (IndexOutOfBoundsException e3) {
            throw new C0216k(i3, this.f5151d, 4, e3);
        }
    }

    public final void a0(int i2, long j2) {
        h0((i2 << 3) | 1);
        b0(j2);
    }

    public final void b0(long j2) {
        int i2 = this.f5152e;
        try {
            byte[] bArr = this.f5150c;
            bArr[i2] = (byte) (((int) j2) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i2 + 1] = (byte) (((int) (j2 >> 8)) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i2 + 2] = (byte) (((int) (j2 >> 16)) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i2 + 3] = (byte) (((int) (j2 >> 24)) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i2 + 4] = (byte) (((int) (j2 >> 32)) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i2 + 5] = (byte) (((int) (j2 >> 40)) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i2 + 6] = (byte) (((int) (j2 >> 48)) & KotlinVersion.MAX_COMPONENT_VALUE);
            bArr[i2 + 7] = (byte) (((int) (j2 >> 56)) & KotlinVersion.MAX_COMPONENT_VALUE);
            this.f5152e = i2 + 8;
        } catch (IndexOutOfBoundsException e3) {
            throw new C0216k(i2, this.f5151d, 8, e3);
        }
    }

    public final void c0(int i2, int i3) {
        h0(i2 << 3);
        d0(i3);
    }

    public final void d0(int i2) {
        if (i2 >= 0) {
            h0(i2);
        } else {
            j0(i2);
        }
    }

    public final void e0(int i2, String str) {
        h0((i2 << 3) | 2);
        int i3 = this.f5152e;
        try {
            int n02 = n0(str.length() * 3);
            int n03 = n0(str.length());
            byte[] bArr = this.f5150c;
            int i6 = this.f5151d;
            if (n03 == n02) {
                int i7 = i3 + n03;
                this.f5152e = i7;
                int b6 = O1.b(str, bArr, i7, i6 - i7);
                this.f5152e = i3;
                h0((b6 - i3) - n03);
                this.f5152e = b6;
            } else {
                h0(O1.c(str));
                int i8 = this.f5152e;
                this.f5152e = O1.b(str, bArr, i8, i6 - i8);
            }
        } catch (N1 e3) {
            this.f5152e = i3;
            f5147f.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e3);
            byte[] bytes = str.getBytes(AbstractC0349l1.f5205a);
            try {
                int length = bytes.length;
                h0(length);
                W(length, bytes);
            } catch (IndexOutOfBoundsException e6) {
                throw new C0216k(e6);
            }
        } catch (IndexOutOfBoundsException e7) {
            throw new C0216k(e7);
        }
    }

    public final void f0(int i2, int i3) {
        h0((i2 << 3) | i3);
    }

    public final void g0(int i2, int i3) {
        h0(i2 << 3);
        h0(i3);
    }

    public final void h0(int i2) {
        while (true) {
            int i3 = i2 & (-128);
            byte[] bArr = this.f5150c;
            if (i3 == 0) {
                int i6 = this.f5152e;
                this.f5152e = i6 + 1;
                bArr[i6] = (byte) i2;
                return;
            } else {
                try {
                    int i7 = this.f5152e;
                    this.f5152e = i7 + 1;
                    bArr[i7] = (byte) ((i2 | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
                    i2 >>>= 7;
                } catch (IndexOutOfBoundsException e3) {
                    throw new C0216k(this.f5152e, this.f5151d, 1, e3);
                }
            }
            throw new C0216k(this.f5152e, this.f5151d, 1, e3);
        }
    }

    public final void i0(int i2, long j2) {
        h0(i2 << 3);
        j0(j2);
    }

    public final void j0(long j2) {
        byte[] bArr = this.f5150c;
        boolean z = f5148g;
        int i2 = this.f5151d;
        if (!z || i2 - this.f5152e < 10) {
            while ((j2 & (-128)) != 0) {
                try {
                    int i3 = this.f5152e;
                    this.f5152e = i3 + 1;
                    bArr[i3] = (byte) ((((int) j2) | 128) & KotlinVersion.MAX_COMPONENT_VALUE);
                    j2 >>>= 7;
                } catch (IndexOutOfBoundsException e3) {
                    throw new C0216k(this.f5152e, i2, 1, e3);
                }
            }
            int i6 = this.f5152e;
            this.f5152e = i6 + 1;
            bArr[i6] = (byte) j2;
            return;
        }
        while (true) {
            int i7 = (int) j2;
            if ((j2 & (-128)) == 0) {
                int i8 = this.f5152e;
                this.f5152e = i8 + 1;
                M1.f5081c.d(bArr, M1.f5084f + i8, (byte) i7);
                return;
            }
            int i9 = this.f5152e;
            this.f5152e = i9 + 1;
            long j6 = i9;
            M1.f5081c.d(bArr, M1.f5084f + j6, (byte) ((i7 | 128) & KotlinVersion.MAX_COMPONENT_VALUE));
            j2 >>>= 7;
        }
    }
}
