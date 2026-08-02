package com.google.android.gms.internal.ads;

import B.C0072a;
import android.util.Pair;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.i3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1098i3 implements F {

    /* renamed from: a, reason: collision with root package name */
    public HG f13863a;

    /* renamed from: b, reason: collision with root package name */
    public InterfaceC0737a0 f13864b;

    /* renamed from: c, reason: collision with root package name */
    public int f13865c;

    /* renamed from: d, reason: collision with root package name */
    public long f13866d;

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1008g3 f13867e;
    public int f;

    /* renamed from: g, reason: collision with root package name */
    public long f13868g;

    @Override // com.google.android.gms.internal.ads.F
    public final void d(long j5, long j6) {
        this.f13865c = j5 == 0 ? 0 : 4;
        InterfaceC1008g3 interfaceC1008g3 = this.f13867e;
        if (interfaceC1008g3 != null) {
            interfaceC1008g3.a(j6);
        }
    }

    @Override // com.google.android.gms.internal.ads.F
    public final boolean e(G g5) {
        return AbstractC1803xs.F((B) g5);
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0181, code lost:
    
        if (r14 != 65534) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0188, code lost:
    
        if (r18 == 32) goto L54;
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01aa  */
    @Override // com.google.android.gms.internal.ads.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int f(G g5, C0072a c0072a) {
        byte[] bArr;
        int i;
        AbstractC1668us.F(this.f13864b);
        int i5 = AbstractC1260lo.f14419a;
        int i6 = this.f13865c;
        int i7 = 4;
        if (i6 == 0) {
            AbstractC1668us.a0(((B) g5).f7752n == 0);
            int i8 = this.f;
            if (i8 != -1) {
                ((B) g5).k(i8);
                this.f13865c = 4;
                return 0;
            }
            B b3 = (B) g5;
            if (!AbstractC1803xs.F(b3)) {
                throw B7.a(null, "Unsupported or unrecognized wav file type.");
            }
            b3.k((int) (b3.b() - b3.f7752n));
            this.f13865c = 1;
            return 0;
        }
        long j5 = -1;
        if (i6 == 1) {
            C1617tm c1617tm = new C1617tm(8);
            B b5 = (B) g5;
            C1141j3 a5 = C1141j3.a(b5, c1617tm);
            if (a5.f14059a != 1685272116) {
                b5.f7754p = 0;
            } else {
                b5.g(8, false);
                c1617tm.j(0);
                B b6 = (B) g5;
                b6.G(c1617tm.f15724a, 0, 8, false);
                j5 = c1617tm.A();
                b6.k(((int) a5.f14060b) + 8);
            }
            this.f13866d = j5;
            this.f13865c = 2;
            return 0;
        }
        if (i6 != 2) {
            if (i6 != 3) {
                AbstractC1668us.a0(this.f13868g != -1);
                long j6 = this.f13868g - ((B) g5).f7752n;
                InterfaceC1008g3 interfaceC1008g3 = this.f13867e;
                interfaceC1008g3.getClass();
                return interfaceC1008g3.c((B) g5, j6) ? -1 : 0;
            }
            ((B) g5).f7754p = 0;
            B b7 = (B) g5;
            C1141j3 K = AbstractC1803xs.K(1684108385, b7, new C1617tm(8));
            b7.k(8);
            Pair create = Pair.create(Long.valueOf(b7.f7752n), Long.valueOf(K.f14060b));
            this.f = ((Long) create.first).intValue();
            long longValue = ((Long) create.second).longValue();
            long j7 = this.f13866d;
            if (j7 != -1 && longValue == 4294967295L) {
                longValue = j7;
            }
            long j8 = this.f + longValue;
            this.f13868g = j8;
            long j9 = b7.f7751m;
            if (j9 != -1 && j8 > j9) {
                JB.l("WavExtractor", "Data exceeds input length: " + j8 + ", " + j9);
                this.f13868g = j9;
                j8 = j9;
            }
            InterfaceC1008g3 interfaceC1008g32 = this.f13867e;
            interfaceC1008g32.getClass();
            interfaceC1008g32.b(this.f, j8);
            this.f13865c = 4;
            return 0;
        }
        C1617tm c1617tm2 = new C1617tm(16);
        B b8 = (B) g5;
        long j10 = AbstractC1803xs.K(1718449184, b8, c1617tm2).f14060b;
        AbstractC1668us.a0(j10 >= 16);
        b8.G(c1617tm2.f15724a, 0, 16, false);
        c1617tm2.j(0);
        int t5 = c1617tm2.t();
        int t6 = c1617tm2.t();
        int s2 = c1617tm2.s();
        c1617tm2.s();
        int t7 = c1617tm2.t();
        int t8 = c1617tm2.t();
        int i9 = ((int) j10) - 16;
        if (i9 > 0) {
            bArr = new byte[i9];
            ((B) g5).G(bArr, 0, i9, false);
        } else {
            bArr = AbstractC1260lo.f;
        }
        byte[] bArr2 = bArr;
        B b9 = (B) g5;
        b9.k((int) (b9.b() - b9.f7752n));
        P0.h hVar = new P0.h(t5, t6, s2, t7, t8, bArr2);
        if (t5 == 17) {
            this.f13867e = new C0963f3(this.f13863a, this.f13864b, hVar);
        } else if (t5 == 6) {
            this.f13867e = new C1053h3(this.f13863a, this.f13864b, hVar, "audio/g711-alaw", -1);
        } else if (t5 == 7) {
            this.f13867e = new C1053h3(this.f13863a, this.f13864b, hVar, "audio/g711-mlaw", -1);
        } else {
            if (t5 != 1) {
                if (t5 != 3) {
                }
                i = 0;
                if (i != 0) {
                    throw B7.b("Unsupported WAV format type: " + t5);
                }
                this.f13867e = new C1053h3(this.f13863a, this.f13864b, hVar, "audio/raw", i);
            }
            i7 = AbstractC1260lo.q(t8);
            i = i7;
            if (i != 0) {
            }
        }
        this.f13865c = 3;
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.F
    public final void h(H h3) {
        HG hg = (HG) h3;
        this.f13863a = hg;
        this.f13864b = hg.w(0, 1);
        hg.v();
    }

    @Override // com.google.android.gms.internal.ads.F
    public final List j() {
        C0954ev c0954ev = AbstractC1044gv.f13676l;
        return C1761wv.f16184o;
    }
}
