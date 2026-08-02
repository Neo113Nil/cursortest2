package com.google.android.gms.internal.ads;

import java.io.EOFException;

/* loaded from: classes.dex */
public final class G1 {

    /* renamed from: a, reason: collision with root package name */
    public int f9152a;

    /* renamed from: b, reason: collision with root package name */
    public long f9153b;

    /* renamed from: c, reason: collision with root package name */
    public int f9154c;

    /* renamed from: d, reason: collision with root package name */
    public int f9155d;

    /* renamed from: e, reason: collision with root package name */
    public int f9156e;
    public final int[] f = new int[255];

    /* renamed from: g, reason: collision with root package name */
    public final C1617tm f9157g = new C1617tm(255);

    public final boolean a(B b3, boolean z3) {
        boolean z5;
        boolean z6;
        this.f9152a = 0;
        this.f9153b = 0L;
        this.f9154c = 0;
        this.f9155d = 0;
        this.f9156e = 0;
        C1617tm c1617tm = this.f9157g;
        c1617tm.g(27);
        try {
            z5 = b3.G(c1617tm.f15724a, 0, 27, z3);
        } catch (EOFException e3) {
            if (!z3) {
                throw e3;
            }
            z5 = false;
        }
        if (z5 && c1617tm.D() == 1332176723) {
            if (c1617tm.v() == 0) {
                this.f9152a = c1617tm.v();
                this.f9153b = c1617tm.A();
                c1617tm.B();
                c1617tm.B();
                c1617tm.B();
                int v4 = c1617tm.v();
                this.f9154c = v4;
                this.f9155d = v4 + 27;
                c1617tm.g(v4);
                try {
                    z6 = b3.G(c1617tm.f15724a, 0, this.f9154c, z3);
                } catch (EOFException e5) {
                    if (!z3) {
                        throw e5;
                    }
                    z6 = false;
                }
                if (z6) {
                    for (int i = 0; i < this.f9154c; i++) {
                        int v5 = c1617tm.v();
                        this.f[i] = v5;
                        this.f9156e += v5;
                    }
                    return true;
                }
            } else if (!z3) {
                throw B7.b("unsupported bit stream revision");
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0047, code lost:
    
        if (r13 == (-1)) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r12.f7752n >= r13) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0079, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004f, code lost:
    
        r0 = java.lang.Math.min(r12.f7755q, 1);
        r12.n(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
    
        if (r0 != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
    
        r5 = r12;
        r0 = r5.l(r12.f7749k, 0, java.lang.Math.min(1, 4096), 0, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x006e, code lost:
    
        if (r0 == (-1)) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0070, code lost:
    
        r5.f7752n += r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0077, code lost:
    
        if (r0 != (-1)) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x007a, code lost:
    
        r12 = r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
    
        r5 = r12;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean b(B b3, long j5) {
        boolean z3;
        AbstractC1668us.S(b3.f7752n == b3.b());
        C1617tm c1617tm = this.f9157g;
        c1617tm.g(4);
        while (true) {
            if (j5 != -1 && b3.f7752n + 4 >= j5) {
                break;
            }
            try {
                z3 = b3.G(c1617tm.f15724a, 0, 4, true);
            } catch (EOFException unused) {
                z3 = false;
            }
            if (!z3) {
                break;
            }
            c1617tm.j(0);
            if (c1617tm.D() == 1332176723) {
                b3.f7754p = 0;
                return true;
            }
            b3.k(1);
        }
    }
}
