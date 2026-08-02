package com.google.android.gms.internal.ads;

import B.C0072a;

/* renamed from: com.google.android.gms.internal.ads.o0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1363o0 {

    /* renamed from: a, reason: collision with root package name */
    public final C1676v f14741a;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1856z f14742b;

    /* renamed from: c, reason: collision with root package name */
    public C1721w f14743c;

    /* renamed from: d, reason: collision with root package name */
    public final int f14744d;

    public C1363o0(InterfaceC1766x interfaceC1766x, InterfaceC1856z interfaceC1856z, long j5, long j6, long j7, long j8, long j9, int i) {
        this.f14742b = interfaceC1856z;
        this.f14744d = i;
        this.f14741a = new C1676v(interfaceC1766x, j5, j6, j7, j8, j9);
    }

    public static final int c(B b3, long j5, C0072a c0072a) {
        if (j5 == b3.f7752n) {
            return 0;
        }
        c0072a.f658a = j5;
        return 1;
    }

    public static /* bridge */ /* synthetic */ int d(int i, byte[] bArr) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x00bc, code lost:
    
        return c(r28, r8, r29);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int a(B b3, C0072a c0072a) {
        while (true) {
            C1721w c1721w = this.f14743c;
            AbstractC1668us.F(c1721w);
            long j5 = c1721w.f;
            long j6 = c1721w.f16078g;
            long j7 = c1721w.f16079h;
            long j8 = j6 - j5;
            long j9 = this.f14744d;
            InterfaceC1856z interfaceC1856z = this.f14742b;
            if (j8 <= j9) {
                this.f14743c = null;
                interfaceC1856z.mo18d();
                return c(b3, j5, c0072a);
            }
            long j10 = j7 - b3.f7752n;
            if (j10 < 0 || j10 > 262144) {
                break;
            }
            b3.k((int) j10);
            b3.f7754p = 0;
            C1811y c5 = interfaceC1856z.c(b3, c1721w.f16074b);
            int i = c5.f16373a;
            if (i == -3) {
                this.f14743c = null;
                interfaceC1856z.mo18d();
                return c(b3, j7, c0072a);
            }
            long j11 = c5.f16374b;
            long j12 = c5.f16375c;
            if (i == -2) {
                c1721w.f16076d = j11;
                c1721w.f = j12;
                c1721w.f16079h = C1721w.a(c1721w.f16074b, j11, c1721w.f16077e, j12, c1721w.f16078g, c1721w.f16075c);
            } else {
                if (i != -1) {
                    long j13 = j12 - b3.f7752n;
                    if (j13 >= 0 && j13 <= 262144) {
                        b3.k((int) j13);
                    }
                    this.f14743c = null;
                    interfaceC1856z.mo18d();
                    return c(b3, j12, c0072a);
                }
                c1721w.f16077e = j11;
                c1721w.f16078g = j12;
                c1721w.f16079h = C1721w.a(c1721w.f16074b, c1721w.f16076d, j11, c1721w.f, j12, c1721w.f16075c);
            }
        }
    }

    public final void b(long j5) {
        C1721w c1721w = this.f14743c;
        if (c1721w == null || c1721w.f16073a != j5) {
            C1676v c1676v = this.f14741a;
            long i = c1676v.f15940a.i(j5);
            long j6 = c1676v.f15944e;
            long j7 = c1676v.f;
            long j8 = c1676v.f15942c;
            long j9 = c1676v.f15943d;
            C1721w c1721w2 = new C1721w();
            c1721w2.f16073a = j5;
            c1721w2.f16074b = i;
            c1721w2.f16076d = 0L;
            c1721w2.f16077e = j8;
            c1721w2.f = j9;
            c1721w2.f16078g = j6;
            c1721w2.f16075c = j7;
            c1721w2.f16079h = C1721w.a(i, 0L, j8, j9, j6, j7);
            this.f14743c = c1721w2;
        }
    }
}
