package com.google.protobuf;

import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.protobuf.q, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0923q extends w0 {

    /* renamed from: d, reason: collision with root package name */
    public static final Logger f12259d = Logger.getLogger(AbstractC0923q.class.getName());

    /* renamed from: e, reason: collision with root package name */
    public static final boolean f12260e = K0.f12119e;

    /* renamed from: c, reason: collision with root package name */
    public X f12261c;

    public static int X(int i7) {
        return p0(i7) + 1;
    }

    public static int Y(int i7, AbstractC0911k abstractC0911k) {
        return Z(abstractC0911k) + p0(i7);
    }

    public static int Z(AbstractC0911k abstractC0911k) {
        int size = abstractC0911k.size();
        return r0(size) + size;
    }

    public static int a0(int i7) {
        return p0(i7) + 8;
    }

    public static int b0(int i7, int i8) {
        return h0(i8) + p0(i7);
    }

    public static int c0(int i7) {
        return p0(i7) + 4;
    }

    public static int d0(int i7) {
        return p0(i7) + 8;
    }

    public static int e0(int i7) {
        return p0(i7) + 4;
    }

    public static int f0(int i7, AbstractC0891a abstractC0891a, InterfaceC0925r0 interfaceC0925r0) {
        return abstractC0891a.c(interfaceC0925r0) + (p0(i7) * 2);
    }

    public static int g0(int i7, int i8) {
        return h0(i8) + p0(i7);
    }

    public static int h0(int i7) {
        if (i7 >= 0) {
            return r0(i7);
        }
        return 10;
    }

    public static int i0(int i7, long j) {
        return t0(j) + p0(i7);
    }

    public static int j0(int i7) {
        return p0(i7) + 4;
    }

    public static int k0(int i7) {
        return p0(i7) + 8;
    }

    public static int l0(int i7, int i8) {
        return r0((i8 >> 31) ^ (i8 << 1)) + p0(i7);
    }

    public static int m0(int i7, long j) {
        return t0((j >> 63) ^ (j << 1)) + p0(i7);
    }

    public static int n0(int i7, String str) {
        return o0(str) + p0(i7);
    }

    public static int o0(String str) {
        int length;
        try {
            length = N0.c(str);
        } catch (M0 unused) {
            length = str.getBytes(K.f12112a).length;
        }
        return r0(length) + length;
    }

    public static int p0(int i7) {
        return r0(i7 << 3);
    }

    public static int q0(int i7, int i8) {
        return r0(i8) + p0(i7);
    }

    public static int r0(int i7) {
        if ((i7 & (-128)) == 0) {
            return 1;
        }
        if ((i7 & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i7) == 0) {
            return 3;
        }
        return (i7 & (-268435456)) == 0 ? 4 : 5;
    }

    public static int s0(int i7, long j) {
        return t0(j) + p0(i7);
    }

    public static int t0(long j) {
        int i7;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            j >>>= 28;
            i7 = 6;
        } else {
            i7 = 2;
        }
        if (((-2097152) & j) != 0) {
            i7 += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i7 + 1 : i7;
    }

    public abstract void A0(int i7, int i8);

    public abstract void B0(int i7);

    public abstract void C0(int i7, long j);

    public abstract void D0(long j);

    public abstract void E0(int i7, int i8);

    public abstract void F0(int i7);

    public abstract void G0(int i7, AbstractC0891a abstractC0891a, InterfaceC0925r0 interfaceC0925r0);

    public abstract void H0(AbstractC0891a abstractC0891a);

    public abstract void I0(int i7, String str);

    public abstract void J0(String str);

    public abstract void K0(int i7, int i8);

    public abstract void L0(int i7, int i8);

    public abstract void M0(int i7);

    public abstract void N0(int i7, long j);

    public abstract void O0(long j);

    public final void u0(String str, M0 m02) {
        f12259d.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) m02);
        byte[] bytes = str.getBytes(K.f12112a);
        try {
            M0(bytes.length);
            W(bytes, 0, bytes.length);
        } catch (IndexOutOfBoundsException e7) {
            throw new Z4.b(e7);
        }
    }

    public abstract void v0(byte b7);

    public abstract void w0(int i7, boolean z4);

    public abstract void x0(int i7, byte[] bArr);

    public abstract void y0(int i7, AbstractC0911k abstractC0911k);

    public abstract void z0(AbstractC0911k abstractC0911k);
}
