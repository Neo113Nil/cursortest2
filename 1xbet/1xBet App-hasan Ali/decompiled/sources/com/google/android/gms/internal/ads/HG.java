package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class HG implements InterfaceC1558sG, H {

    /* renamed from: X, reason: collision with root package name */
    public static final Map f9356X;

    /* renamed from: Y, reason: collision with root package name */
    public static final C1407p f9357Y;

    /* renamed from: A, reason: collision with root package name */
    public MG[] f9358A;

    /* renamed from: B, reason: collision with root package name */
    public GG[] f9359B;

    /* renamed from: C, reason: collision with root package name */
    public boolean f9360C;

    /* renamed from: D, reason: collision with root package name */
    public boolean f9361D;

    /* renamed from: E, reason: collision with root package name */
    public boolean f9362E;

    /* renamed from: F, reason: collision with root package name */
    public boolean f9363F;

    /* renamed from: G, reason: collision with root package name */
    public C1071hd f9364G;

    /* renamed from: H, reason: collision with root package name */
    public U f9365H;

    /* renamed from: I, reason: collision with root package name */
    public long f9366I;
    public boolean J;
    public int K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f9367L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f9368M;

    /* renamed from: N, reason: collision with root package name */
    public boolean f9369N;

    /* renamed from: O, reason: collision with root package name */
    public int f9370O;

    /* renamed from: P, reason: collision with root package name */
    public boolean f9371P;

    /* renamed from: Q, reason: collision with root package name */
    public long f9372Q;

    /* renamed from: R, reason: collision with root package name */
    public long f9373R;

    /* renamed from: S, reason: collision with root package name */
    public boolean f9374S;

    /* renamed from: T, reason: collision with root package name */
    public int f9375T;

    /* renamed from: U, reason: collision with root package name */
    public boolean f9376U;

    /* renamed from: V, reason: collision with root package name */
    public boolean f9377V;

    /* renamed from: W, reason: collision with root package name */
    public final C1425pH f9378W;

    /* renamed from: k, reason: collision with root package name */
    public final Uri f9379k;

    /* renamed from: l, reason: collision with root package name */
    public final InterfaceC1402ov f9380l;

    /* renamed from: m, reason: collision with root package name */
    public final C1543s1 f9381m;

    /* renamed from: n, reason: collision with root package name */
    public final C1872zF f9382n;

    /* renamed from: o, reason: collision with root package name */
    public final C1872zF f9383o;

    /* renamed from: p, reason: collision with root package name */
    public final JG f9384p;

    /* renamed from: q, reason: collision with root package name */
    public final long f9385q;

    /* renamed from: r, reason: collision with root package name */
    public final long f9386r;

    /* renamed from: t, reason: collision with root package name */
    public final Fx f9388t;

    /* renamed from: x, reason: collision with root package name */
    public final Handler f9392x;

    /* renamed from: y, reason: collision with root package name */
    public InterfaceC1513rG f9393y;

    /* renamed from: z, reason: collision with root package name */
    public C0 f9394z;

    /* renamed from: s, reason: collision with root package name */
    public final C0905dr f9387s = new C0905dr(1);

    /* renamed from: u, reason: collision with root package name */
    public final H2.j f9389u = new H2.j(2);

    /* renamed from: v, reason: collision with root package name */
    public final CG f9390v = new CG(this, 1);

    /* renamed from: w, reason: collision with root package name */
    public final CG f9391w = new CG(this, 2);

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f9356X = Collections.unmodifiableMap(hashMap);
        C1649uH c1649uH = new C1649uH();
        c1649uH.f15839a = "icy";
        c1649uH.c("application/x-icy");
        f9357Y = new C1407p(c1649uH);
    }

    public HG(Uri uri, InterfaceC1402ov interfaceC1402ov, Fx fx, C1543s1 c1543s1, C1872zF c1872zF, C1872zF c1872zF2, JG jg, C1425pH c1425pH, int i, long j5) {
        this.f9379k = uri;
        this.f9380l = interfaceC1402ov;
        this.f9381m = c1543s1;
        this.f9383o = c1872zF;
        this.f9382n = c1872zF2;
        this.f9384p = jg;
        this.f9378W = c1425pH;
        this.f9385q = i;
        this.f9388t = fx;
        this.f9386r = j5;
        Looper myLooper = Looper.myLooper();
        AbstractC1668us.F(myLooper);
        this.f9392x = new Handler(myLooper, null);
        this.f9359B = new GG[0];
        this.f9358A = new MG[0];
        this.f9373R = -9223372036854775807L;
        this.K = 1;
    }

    public final boolean A() {
        return this.f9373R != -9223372036854775807L;
    }

    public final boolean B() {
        return this.f9368M || A();
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final void a(long j5) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final long b(long j5) {
        boolean g5;
        s();
        boolean[] zArr = (boolean[]) this.f9364G.f13762m;
        if (true != this.f9365H.g()) {
            j5 = 0;
        }
        this.f9368M = false;
        long j6 = this.f9372Q;
        this.f9372Q = j5;
        if (A()) {
            this.f9373R = j5;
            return j5;
        }
        if (this.K != 7 && (this.f9376U || ((HandlerC1559sH) this.f9387s.f13187m) != null)) {
            int length = this.f9358A.length;
            for (int i = 0; i < length; i++) {
                MG mg = this.f9358A[i];
                int i5 = mg.f10624o;
                if (mg.f10626q + i5 != 0 || j6 != j5) {
                    if (this.f9363F) {
                        synchronized (mg) {
                            mg.l();
                            int i6 = mg.f10624o;
                            if (i5 >= i6 && i5 <= mg.f10623n + i6) {
                                mg.f10627r = Long.MIN_VALUE;
                                mg.f10626q = i5 - i6;
                                g5 = true;
                            }
                            g5 = false;
                        }
                    } else {
                        g5 = mg.g(j5, false);
                    }
                    if (g5) {
                        continue;
                    } else if (!zArr[i] && this.f9362E) {
                    }
                }
            }
            return j5;
        }
        this.f9374S = false;
        this.f9373R = j5;
        this.f9376U = false;
        this.f9369N = false;
        C0905dr c0905dr = this.f9387s;
        if (!(((HandlerC1559sH) c0905dr.f13187m) != null)) {
            c0905dr.f13188n = null;
            for (MG mg2 : this.f9358A) {
                mg2.p(false);
            }
            return j5;
        }
        for (MG mg3 : this.f9358A) {
            mg3.o();
        }
        HandlerC1559sH handlerC1559sH = (HandlerC1559sH) this.f9387s.f13187m;
        AbstractC1668us.F(handlerC1559sH);
        handlerC1559sH.a(false);
        return j5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final long c(InterfaceC1200kH[] interfaceC1200kHArr, boolean[] zArr, NG[] ngArr, boolean[] zArr2, long j5) {
        boolean[] zArr3;
        InterfaceC1200kH interfaceC1200kH;
        s();
        C1071hd c1071hd = this.f9364G;
        TG tg = (TG) c1071hd.f13761l;
        int i = this.f9370O;
        int i5 = 0;
        while (true) {
            int length = interfaceC1200kHArr.length;
            zArr3 = (boolean[]) c1071hd.f13763n;
            if (i5 >= length) {
                break;
            }
            NG ng = ngArr[i5];
            if (ng != null && (interfaceC1200kHArr[i5] == null || !zArr[i5])) {
                int i6 = ((FG) ng).f8949a;
                AbstractC1668us.a0(zArr3[i6]);
                this.f9370O--;
                zArr3[i6] = false;
                ngArr[i5] = null;
            }
            i5++;
        }
        boolean z3 = !this.f9367L ? j5 == 0 || this.f9363F : i != 0;
        for (int i7 = 0; i7 < interfaceC1200kHArr.length; i7++) {
            if (ngArr[i7] == null && (interfaceC1200kH = interfaceC1200kHArr[i7]) != null) {
                AbstractC1668us.a0(interfaceC1200kH.j() == 1);
                AbstractC1668us.a0(interfaceC1200kH.a(0) == 0);
                int indexOf = tg.f11647b.indexOf(interfaceC1200kH.f());
                if (indexOf < 0) {
                    indexOf = -1;
                }
                AbstractC1668us.a0(!zArr3[indexOf]);
                this.f9370O++;
                zArr3[indexOf] = true;
                this.f9369N = interfaceC1200kH.c().f14910s | this.f9369N;
                ngArr[i7] = new FG(this, indexOf);
                zArr2[i7] = true;
                if (!z3) {
                    MG mg = this.f9358A[indexOf];
                    z3 = (mg.f10624o + mg.f10626q == 0 || mg.g(j5, true)) ? false : true;
                }
            }
        }
        if (this.f9370O == 0) {
            this.f9374S = false;
            this.f9368M = false;
            this.f9369N = false;
            C0905dr c0905dr = this.f9387s;
            if (((HandlerC1559sH) c0905dr.f13187m) != null) {
                for (MG mg2 : this.f9358A) {
                    mg2.o();
                }
                HandlerC1559sH handlerC1559sH = (HandlerC1559sH) c0905dr.f13187m;
                AbstractC1668us.F(handlerC1559sH);
                handlerC1559sH.a(false);
            } else {
                this.f9376U = false;
                for (MG mg3 : this.f9358A) {
                    mg3.p(false);
                }
            }
        } else if (z3) {
            j5 = b(j5);
            for (int i8 = 0; i8 < ngArr.length; i8++) {
                if (ngArr[i8] != null) {
                    zArr2[i8] = true;
                }
            }
        }
        this.f9367L = true;
        return j5;
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final long d() {
        long j5;
        boolean z3;
        s();
        if (this.f9376U || this.f9370O == 0) {
            return Long.MIN_VALUE;
        }
        if (A()) {
            return this.f9373R;
        }
        if (this.f9362E) {
            int length = this.f9358A.length;
            j5 = Long.MAX_VALUE;
            for (int i = 0; i < length; i++) {
                C1071hd c1071hd = this.f9364G;
                if (((boolean[]) c1071hd.f13762m)[i] && ((boolean[]) c1071hd.f13763n)[i]) {
                    MG mg = this.f9358A[i];
                    synchronized (mg) {
                        z3 = mg.f10630u;
                    }
                    if (!z3) {
                        j5 = Math.min(j5, this.f9358A[i].m());
                    }
                }
            }
        } else {
            j5 = Long.MAX_VALUE;
        }
        if (j5 == Long.MAX_VALUE) {
            j5 = p(false);
        }
        return j5 == Long.MIN_VALUE ? this.f9372Q : j5;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final void e(long j5) {
        long j6;
        long j7;
        int i;
        if (this.f9363F) {
            return;
        }
        s();
        if (A()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.f9364G.f13763n;
        int length = this.f9358A.length;
        int i5 = 0;
        while (i5 < length) {
            MG mg = this.f9358A[i5];
            boolean z3 = zArr[i5];
            KG kg = mg.f10612a;
            synchronized (mg) {
                try {
                    int i6 = mg.f10623n;
                    if (i6 != 0) {
                        long[] jArr = mg.f10621l;
                        int i7 = mg.f10625p;
                        if (j5 >= jArr[i7]) {
                            j6 = j5;
                            int h3 = mg.h(i7, (!z3 || (i = mg.f10626q) == i6) ? i6 : i + 1, j6, false);
                            j7 = h3 != -1 ? mg.j(h3) : -1L;
                        }
                    }
                    j6 = j5;
                } finally {
                }
            }
            kg.a(j7);
            i5++;
            j5 = j6;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final void f(InterfaceC1513rG interfaceC1513rG, long j5) {
        this.f9393y = interfaceC1513rG;
        this.f9389u.f();
        z();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final TG g() {
        s();
        return (TG) this.f9364G.f13761l;
    }

    public final void h(EG eg, boolean z3) {
        Uri uri = eg.f8495b.f8942l;
        C1199kG c1199kG = new C1199kG();
        C1469qG c1469qG = new C1469qG(-1, null, AbstractC1260lo.v(eg.i), AbstractC1260lo.v(this.f9366I));
        C1872zF c1872zF = this.f9382n;
        c1872zF.a(new C1693vG(c1872zF, c1199kG, c1469qG, 2));
        if (z3) {
            return;
        }
        for (MG mg : this.f9358A) {
            mg.p(false);
        }
        if (this.f9370O > 0) {
            InterfaceC1513rG interfaceC1513rG = this.f9393y;
            interfaceC1513rG.getClass();
            interfaceC1513rG.h(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final long i() {
        return d();
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final long j() {
        if (this.f9369N) {
            this.f9369N = false;
        } else {
            if (!this.f9368M) {
                return -9223372036854775807L;
            }
            if (!this.f9376U && o() <= this.f9375T) {
                return -9223372036854775807L;
            }
            this.f9368M = false;
        }
        return this.f9372Q;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    public final void k() {
        IOException iOException;
        int i = this.K == 7 ? 6 : 3;
        C0905dr c0905dr = this.f9387s;
        IOException iOException2 = (IOException) c0905dr.f13188n;
        if (iOException2 != null) {
            throw iOException2;
        }
        HandlerC1559sH handlerC1559sH = (HandlerC1559sH) c0905dr.f13187m;
        if (handlerC1559sH != null && (iOException = handlerC1559sH.f15481m) != null && handlerC1559sH.f15482n > i) {
            throw iOException;
        }
        if (this.f9376U && !this.f9361D) {
            throw B7.a(null, "Loading finished before preparation is complete.");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0081 A[RETURN] */
    @Override // com.google.android.gms.internal.ads.InterfaceC1558sG
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long l(long j5, LE le) {
        s();
        if (!this.f9365H.g()) {
            return 0L;
        }
        T c5 = this.f9365H.c(j5);
        V v4 = c5.f11607a;
        long j6 = le.f10331a;
        long j7 = le.f10332b;
        if (j6 == 0) {
            if (j7 == 0) {
                return j5;
            }
            j6 = 0;
        }
        long j8 = v4.f11848a;
        int i = AbstractC1260lo.f14419a;
        long j9 = j5 - j6;
        long j10 = j5 + j7;
        long j11 = j5 ^ j10;
        long j12 = j7 ^ j10;
        if (((j6 ^ j5) & (j5 ^ j9)) < 0) {
            j9 = Long.MIN_VALUE;
        }
        if ((j11 & j12) < 0) {
            j10 = Long.MAX_VALUE;
        }
        boolean z3 = j9 <= j8 && j8 <= j10;
        long j13 = c5.f11608b.f11848a;
        boolean z5 = j9 <= j13 && j13 <= j10;
        if (!z3 || !z5) {
            if (!z3) {
                return z5 ? j13 : j9;
            }
            return j8;
        }
        if (Math.abs(j8 - j5) <= Math.abs(j13 - j5)) {
            return j8;
        }
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final boolean m(C1511rE c1511rE) {
        if (this.f9376U) {
            return false;
        }
        C0905dr c0905dr = this.f9387s;
        if (((IOException) c0905dr.f13188n) != null || this.f9374S) {
            return false;
        }
        if (this.f9361D && this.f9370O == 0) {
            return false;
        }
        boolean f = this.f9389u.f();
        if (((HandlerC1559sH) c0905dr.f13187m) != null) {
            return f;
        }
        z();
        return true;
    }

    public final void n(EG eg) {
        U u5;
        if (this.f9366I == -9223372036854775807L && (u5 = this.f9365H) != null) {
            boolean g5 = u5.g();
            long p5 = p(true);
            long j5 = p5 == Long.MIN_VALUE ? 0L : p5 + 10000;
            this.f9366I = j5;
            this.f9384p.s(j5, g5, this.J);
        }
        Uri uri = eg.f8495b.f8942l;
        C1199kG c1199kG = new C1199kG();
        C1469qG c1469qG = new C1469qG(-1, null, AbstractC1260lo.v(eg.i), AbstractC1260lo.v(this.f9366I));
        C1872zF c1872zF = this.f9382n;
        c1872zF.a(new C1693vG(c1872zF, c1199kG, c1469qG, 1));
        this.f9376U = true;
        InterfaceC1513rG interfaceC1513rG = this.f9393y;
        interfaceC1513rG.getClass();
        interfaceC1513rG.h(this);
    }

    public final int o() {
        int i = 0;
        for (MG mg : this.f9358A) {
            i += mg.f10624o + mg.f10623n;
        }
        return i;
    }

    public final long p(boolean z3) {
        int i;
        long j5 = Long.MIN_VALUE;
        while (true) {
            MG[] mgArr = this.f9358A;
            if (i >= mgArr.length) {
                return j5;
            }
            if (!z3) {
                C1071hd c1071hd = this.f9364G;
                c1071hd.getClass();
                i = ((boolean[]) c1071hd.f13763n)[i] ? 0 : i + 1;
            }
            j5 = Math.max(j5, mgArr[i].m());
        }
    }

    public final InterfaceC0737a0 q(GG gg) {
        int length = this.f9358A.length;
        for (int i = 0; i < length; i++) {
            if (gg.equals(this.f9359B[i])) {
                return this.f9358A[i];
            }
        }
        if (this.f9360C) {
            JB.l("ProgressiveMediaPeriod", "Extractor added new track (id=" + gg.f9187a + ") after finishing tracks.");
            return new E();
        }
        MG mg = new MG(this.f9378W, this.f9381m, this.f9383o);
        mg.f10616e = this;
        int i5 = length + 1;
        GG[] ggArr = (GG[]) Arrays.copyOf(this.f9359B, i5);
        ggArr[length] = gg;
        int i6 = AbstractC1260lo.f14419a;
        this.f9359B = ggArr;
        MG[] mgArr = (MG[]) Arrays.copyOf(this.f9358A, i5);
        mgArr[length] = mg;
        this.f9358A = mgArr;
        return mg;
    }

    @Override // com.google.android.gms.internal.ads.OG
    public final boolean r() {
        boolean z3;
        if (((HandlerC1559sH) this.f9387s.f13187m) == null) {
            return false;
        }
        H2.j jVar = this.f9389u;
        synchronized (jVar) {
            z3 = jVar.f2300l;
        }
        return z3;
    }

    public final void s() {
        AbstractC1668us.a0(this.f9361D);
        this.f9364G.getClass();
        this.f9365H.getClass();
    }

    public final void t() {
        long j5;
        int i;
        C1407p c1407p;
        if (this.f9377V || this.f9361D || !this.f9360C || this.f9365H == null) {
            return;
        }
        for (MG mg : this.f9358A) {
            synchronized (mg) {
                c1407p = mg.f10632w ? null : mg.f10633x;
            }
            if (c1407p == null) {
                return;
            }
        }
        this.f9389u.e();
        int length = this.f9358A.length;
        C1292mb[] c1292mbArr = new C1292mb[length];
        boolean[] zArr = new boolean[length];
        int i5 = 0;
        while (true) {
            j5 = this.f9386r;
            if (i5 >= length) {
                break;
            }
            C1407p n5 = this.f9358A[i5].n();
            n5.getClass();
            String str = n5.f14904m;
            boolean equals = "audio".equals(AbstractC1593t6.h(str));
            boolean z3 = equals || AbstractC1593t6.g(str);
            zArr[i5] = z3;
            this.f9362E = z3 | this.f9362E;
            this.f9363F = j5 != -9223372036854775807L && length == 1 && ("image".equals(AbstractC1593t6.h(str)) || "application/x-image-uri".equals(str));
            C0 c02 = this.f9394z;
            if (c02 != null) {
                if (equals || this.f9359B[i5].f9188b) {
                    C5 c5 = n5.f14902k;
                    C5 c52 = c5 == null ? new C5(-9223372036854775807L, c02) : c5.a(c02);
                    C1649uH c1649uH = new C1649uH(n5);
                    c1649uH.f15846j = c52;
                    n5 = new C1407p(c1649uH);
                }
                if (equals && n5.f14899g == -1 && n5.f14900h == -1 && (i = c02.f7924k) != -1) {
                    C1649uH c1649uH2 = new C1649uH(n5);
                    c1649uH2.f15844g = i;
                    n5 = new C1407p(c1649uH2);
                }
            }
            this.f9381m.getClass();
            int i6 = n5.f14908q != null ? 1 : 0;
            C1649uH c1649uH3 = new C1649uH(n5);
            c1649uH3.f15838H = i6;
            C1407p c1407p2 = new C1407p(c1649uH3);
            c1292mbArr[i5] = new C1292mb(Integer.toString(i5), c1407p2);
            this.f9369N = c1407p2.f14910s | this.f9369N;
            i5++;
        }
        this.f9364G = new C1071hd(new TG(c1292mbArr), zArr);
        if (this.f9363F && this.f9366I == -9223372036854775807L) {
            this.f9366I = j5;
            this.f9365H = new DG(this, this.f9365H);
        }
        this.f9384p.s(this.f9366I, this.f9365H.g(), this.J);
        this.f9361D = true;
        InterfaceC1513rG interfaceC1513rG = this.f9393y;
        interfaceC1513rG.getClass();
        interfaceC1513rG.n(this);
    }

    public final void u(int i) {
        s();
        C1071hd c1071hd = this.f9364G;
        boolean[] zArr = (boolean[]) c1071hd.f13764o;
        if (zArr[i]) {
            return;
        }
        C1407p c1407p = ((TG) c1071hd.f13761l).a(i).f14498d[0];
        C1469qG c1469qG = new C1469qG(AbstractC1593t6.b(c1407p.f14904m), c1407p, AbstractC1260lo.v(this.f9372Q), -9223372036854775807L);
        C1872zF c1872zF = this.f9382n;
        c1872zF.a(new C1667ur(13, c1872zF, c1469qG, false));
        zArr[i] = true;
    }

    @Override // com.google.android.gms.internal.ads.H
    public final void v() {
        this.f9360C = true;
        this.f9392x.post(this.f9390v);
    }

    @Override // com.google.android.gms.internal.ads.H
    public final InterfaceC0737a0 w(int i, int i5) {
        return q(new GG(i, false));
    }

    @Override // com.google.android.gms.internal.ads.H
    public final void x(U u5) {
        this.f9392x.post(new RunnableC1081hn(18, this, u5));
    }

    public final void y(int i) {
        s();
        boolean[] zArr = (boolean[]) this.f9364G.f13762m;
        if (this.f9374S && zArr[i] && !this.f9358A[i].r(false)) {
            this.f9373R = 0L;
            this.f9374S = false;
            this.f9368M = true;
            this.f9372Q = 0L;
            this.f9375T = 0;
            for (MG mg : this.f9358A) {
                mg.p(false);
            }
            InterfaceC1513rG interfaceC1513rG = this.f9393y;
            interfaceC1513rG.getClass();
            interfaceC1513rG.h(this);
        }
    }

    public final void z() {
        EG eg = new EG(this, this.f9379k, this.f9380l, this.f9388t, this, this.f9389u);
        if (this.f9361D) {
            AbstractC1668us.a0(A());
            long j5 = this.f9366I;
            if (j5 != -9223372036854775807L && this.f9373R > j5) {
                this.f9376U = true;
                this.f9373R = -9223372036854775807L;
                return;
            }
            U u5 = this.f9365H;
            u5.getClass();
            V v4 = u5.c(this.f9373R).f11607a;
            long j6 = this.f9373R;
            eg.f.f658a = v4.f11849b;
            eg.i = j6;
            eg.f8500h = true;
            eg.f8503l = false;
            for (MG mg : this.f9358A) {
                mg.f10627r = this.f9373R;
            }
            this.f9373R = -9223372036854775807L;
        }
        this.f9375T = o();
        C0905dr c0905dr = this.f9387s;
        c0905dr.getClass();
        Looper myLooper = Looper.myLooper();
        AbstractC1668us.F(myLooper);
        c0905dr.f13188n = null;
        HandlerC1559sH handlerC1559sH = new HandlerC1559sH(c0905dr, myLooper, eg, this, SystemClock.elapsedRealtime());
        AbstractC1668us.a0(((HandlerC1559sH) c0905dr.f13187m) == null);
        c0905dr.f13187m = handlerC1559sH;
        SystemClock.elapsedRealtime();
        handlerC1559sH.f15480l.getClass();
        handlerC1559sH.f15481m = null;
        HandlerC1559sH handlerC1559sH2 = (HandlerC1559sH) c0905dr.f13187m;
        handlerC1559sH2.getClass();
        ((ExecutorC0599Gd) c0905dr.f13186l).execute(handlerC1559sH2);
        Uri uri = eg.f8501j.f12125a;
        C1199kG c1199kG = new C1199kG();
        C1469qG c1469qG = new C1469qG(-1, null, AbstractC1260lo.v(eg.i), AbstractC1260lo.v(this.f9366I));
        C1872zF c1872zF = this.f9382n;
        c1872zF.a(new C1693vG(c1872zF, c1199kG, c1469qG, 0));
    }
}
