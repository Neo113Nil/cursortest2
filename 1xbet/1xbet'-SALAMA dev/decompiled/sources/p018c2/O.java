package p018c2;

import A1.C0045t0;
import A1.H0;
import A1.X;
import E1.h;
import F1.k;
import F1.m;
import F1.s;
import F1.v;
import F1.y;
import M4.e;
import android.net.Uri;
import android.os.Handler;
import com.google.android.exoplayer2.Format$Builder;
import com.google.android.exoplayer2.metadata.Metadata;
import com.google.android.exoplayer2.metadata.icy.IcyHeaders;
import com.google.android.gms.internal.ads.zzbbd;
import io.sentry.logger.LoggerBatchProcessor;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import p072k1.g;
import p139t2.c;
import p146u2.A;
import p146u2.C0955n;
import p146u2.F;
import p146u2.G;
import p146u2.H;
import p146u2.I;
import p146u2.InterfaceC0954m;
import p146u2.J;
import p146u2.K;
import p146u2.r;
import p151v2.a;
import p151v2.i;
import p151v2.t;
import p155w1.C1010l1;
import p155w1.C1017n0;

/* JADX INFO: loaded from: classes.dex */
public final class O implements B, m, F, I, U {
    public static final Map c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public static final X f10203d0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C1017n0 f10205B;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final K f10207D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final K f10208E;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public A f10210G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public IcyHeaders f10211H;

    /* JADX INFO: renamed from: K, reason: collision with root package name */
    public boolean f10214K;

    /* JADX INFO: renamed from: L, reason: collision with root package name */
    public boolean f10215L;

    /* JADX INFO: renamed from: M, reason: collision with root package name */
    public boolean f10216M;

    /* JADX INFO: renamed from: N, reason: collision with root package name */
    public g f10217N;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public s f10218O;

    /* JADX INFO: renamed from: Q, reason: collision with root package name */
    public boolean f10220Q;

    /* JADX INFO: renamed from: S, reason: collision with root package name */
    public boolean f10222S;

    /* JADX INFO: renamed from: T, reason: collision with root package name */
    public boolean f10223T;

    /* JADX INFO: renamed from: U, reason: collision with root package name */
    public int f10224U;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public long f10226W;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public boolean f10228Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public int f10229Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Uri f10230a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f10231a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC0954m f10232b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f10233b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final h f10234c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final e f10235d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final I f10236e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final B1.m f10237f;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final Q f10238x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final r f10239y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final long f10240z;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final K f10204A = new K("ProgressiveMediaPeriod");

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final y f10206C = new y();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Handler f10209F = t.m(null);

    /* JADX INFO: renamed from: J, reason: collision with root package name */
    public N[] f10213J = new N[0];

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public V[] f10212I = new V[0];

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public long f10227X = -9223372036854775807L;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public long f10225V = -1;

    /* JADX INFO: renamed from: P, reason: collision with root package name */
    public long f10219P = -9223372036854775807L;

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public int f10221R = 1;

    static {
        HashMap map = new HashMap();
        map.put("Icy-MetaData", "1");
        c0 = Collections.unmodifiableMap(map);
        Format$Builder format$Builder = new Format$Builder();
        format$Builder.f10528a = "icy";
        format$Builder.f10537k = "application/x-icy";
        f10203d0 = new X(format$Builder);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [c2.K] */
    /* JADX WARN: Type inference failed for: r1v5, types: [c2.K] */
    public O(Uri uri, InterfaceC0954m interfaceC0954m, C1017n0 c1017n0, h hVar, B1.m mVar, e eVar, I i7, Q q7, r rVar, int i8) {
        this.f10230a = uri;
        this.f10232b = interfaceC0954m;
        this.f10234c = hVar;
        this.f10237f = mVar;
        this.f10235d = eVar;
        this.f10236e = i7;
        this.f10238x = q7;
        this.f10239y = rVar;
        this.f10240z = i8;
        this.f10205B = c1017n0;
        final int i9 = 0;
        this.f10207D = new Runnable(this) { // from class: c2.K

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ O f10184b;

            {
                this.f10184b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i9) {
                    case 0:
                        this.f10184b.h();
                        break;
                    default:
                        O o7 = this.f10184b;
                        if (!o7.f10233b0) {
                            A a2 = o7.f10210G;
                            a2.getClass();
                            a2.b(o7);
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f10208E = new Runnable(this) { // from class: c2.K

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ O f10184b;

            {
                this.f10184b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                switch (i10) {
                    case 0:
                        this.f10184b.h();
                        break;
                    default:
                        O o7 = this.f10184b;
                        if (!o7.f10233b0) {
                            A a2 = o7.f10210G;
                            a2.getClass();
                            a2.b(o7);
                        }
                        break;
                }
            }
        };
    }

    @Override // p018c2.B
    public final long I(c[] cVarArr, boolean[] zArr, W[] wArr, boolean[] zArr2, long j) {
        c cVar;
        c();
        g gVar = this.f10217N;
        f0 f0Var = (f0) gVar.f14680a;
        boolean[] zArr3 = (boolean[]) gVar.f14682c;
        int i7 = this.f10224U;
        int i8 = 0;
        for (int i9 = 0; i9 < cVarArr.length; i9++) {
            W w7 = wArr[i9];
            if (w7 != null && (cVarArr[i9] == null || !zArr[i9])) {
                int i10 = ((M) w7).f10199a;
                a.h(zArr3[i10]);
                this.f10224U--;
                zArr3[i10] = false;
                wArr[i9] = null;
            }
        }
        boolean z4 = !this.f10222S ? j == 0 : i7 != 0;
        for (int i11 = 0; i11 < cVarArr.length; i11++) {
            if (wArr[i11] == null && (cVar = cVarArr[i11]) != null) {
                int[] iArr = cVar.f16304c;
                a.h(iArr.length == 1);
                a.h(iArr[0] == 0);
                int iB = f0Var.b(cVar.f16302a);
                a.h(!zArr3[iB]);
                this.f10224U++;
                zArr3[iB] = true;
                wArr[i11] = new M(this, iB);
                zArr2[i11] = true;
                if (!z4) {
                    V v6 = this.f10212I[iB];
                    z4 = (v6.z(j, true) || v6.n() == 0) ? false : true;
                }
            }
        }
        if (this.f10224U == 0) {
            this.f10228Y = false;
            this.f10223T = false;
            K k7 = this.f10204A;
            if (k7.d()) {
                V[] vArr = this.f10212I;
                int length = vArr.length;
                while (i8 < length) {
                    vArr[i8].h();
                    i8++;
                }
                k7.a();
            } else {
                for (V v7 : this.f10212I) {
                    v7.y(false);
                }
            }
        } else if (z4) {
            j = v(j);
            while (i8 < wArr.length) {
                if (wArr[i8] != null) {
                    zArr2[i8] = true;
                }
                i8++;
            }
        }
        this.f10222S = true;
        return j;
    }

    @Override // p018c2.B
    public final long M() {
        if (!this.f10223T) {
            return -9223372036854775807L;
        }
        if (!this.f10231a0 && d() <= this.f10229Z) {
            return -9223372036854775807L;
        }
        this.f10223T = false;
        return this.f10226W;
    }

    @Override // p018c2.B
    public final f0 P() {
        c();
        return (f0) this.f10217N.f14680a;
    }

    @Override // p018c2.Y
    public final long T() {
        long jE;
        boolean z4;
        long j;
        c();
        boolean[] zArr = (boolean[]) this.f10217N.f14681b;
        if (this.f10231a0) {
            return Long.MIN_VALUE;
        }
        if (f()) {
            return this.f10227X;
        }
        if (this.f10216M) {
            int length = this.f10212I.length;
            jE = Long.MAX_VALUE;
            for (int i7 = 0; i7 < length; i7++) {
                if (zArr[i7]) {
                    V v6 = this.f10212I[i7];
                    synchronized (v6) {
                        z4 = v6.f10289w;
                    }
                    if (z4) {
                        continue;
                    } else {
                        V v7 = this.f10212I[i7];
                        synchronized (v7) {
                            j = v7.f10288v;
                        }
                        jE = Math.min(jE, j);
                    }
                }
            }
        } else {
            jE = Long.MAX_VALUE;
        }
        if (jE == Long.MAX_VALUE) {
            jE = e();
        }
        return jE == Long.MIN_VALUE ? this.f10226W : jE;
    }

    @Override // p146u2.I
    public final void a() {
        for (V v6 : this.f10212I) {
            v6.y(true);
            C1010l1 c1010l1 = v6.f10275h;
            if (c1010l1 != null) {
                c1010l1.F(v6.f10272e);
                v6.f10275h = null;
                v6.f10274g = null;
            }
        }
        C1017n0 c1017n0 = this.f10205B;
        k kVar = (k) c1017n0.f17812c;
        if (kVar != null) {
            kVar.release();
            c1017n0.f17812c = null;
        }
        c1017n0.f17813d = null;
    }

    @Override // p018c2.U
    public final void b() {
        this.f10209F.post(this.f10207D);
    }

    public final void c() {
        a.h(this.f10215L);
        this.f10217N.getClass();
        this.f10218O.getClass();
    }

    public final int d() {
        int i7 = 0;
        for (V v6 : this.f10212I) {
            i7 += v6.f10283q + v6.f10282p;
        }
        return i7;
    }

    public final long e() {
        long j;
        long jMax = Long.MIN_VALUE;
        for (V v6 : this.f10212I) {
            synchronized (v6) {
                j = v6.f10288v;
            }
            jMax = Math.max(jMax, j);
        }
        return jMax;
    }

    public final boolean f() {
        return this.f10227X != -9223372036854775807L;
    }

    @Override // p146u2.F
    public final void g(H h6, long j, long j3) {
        s sVar;
        L l7 = (L) h6;
        if (this.f10219P == -9223372036854775807L && (sVar = this.f10218O) != null) {
            boolean zD = sVar.d();
            long jE = e();
            long j7 = jE == Long.MIN_VALUE ? 0L : jE + 10000;
            this.f10219P = j7;
            this.f10238x.r(j7, zD, this.f10220Q);
        }
        Uri uri = l7.f10191b.f16761c;
        C0774u c0774u = new C0774u();
        this.f10235d.getClass();
        this.f10236e.f(c0774u, 1, -1, null, 0, null, l7.f10198z, this.f10219P);
        if (this.f10225V == -1) {
            this.f10225V = l7.f10186B;
        }
        this.f10231a0 = true;
        A a2 = this.f10210G;
        a2.getClass();
        a2.b(this);
    }

    public final void h() {
        Metadata metadata;
        int i7;
        if (this.f10233b0 || this.f10215L || !this.f10214K || this.f10218O == null) {
            return;
        }
        for (V v6 : this.f10212I) {
            if (v6.q() == null) {
                return;
            }
        }
        y yVar = this.f10206C;
        synchronized (yVar) {
            yVar.f2588a = false;
        }
        int length = this.f10212I.length;
        e0[] e0VarArr = new e0[length];
        boolean[] zArr = new boolean[length];
        for (int i8 = 0; i8 < length; i8++) {
            X xQ = this.f10212I[i8].q();
            xQ.getClass();
            String str = xQ.f283C;
            boolean zH = i.h(str);
            boolean z4 = zH || i.j(str);
            zArr[i8] = z4;
            this.f10216M = z4 | this.f10216M;
            IcyHeaders icyHeaders = this.f10211H;
            if (icyHeaders != null) {
                if (zH || this.f10213J[i8].f10202b) {
                    Metadata metadata2 = xQ.f281A;
                    if (metadata2 == null) {
                        metadata = new Metadata(icyHeaders);
                    } else {
                        int i9 = t.f17159a;
                        Metadata.Entry[] entryArr = metadata2.f10562a;
                        Object[] objArrCopyOf = Arrays.copyOf(entryArr, entryArr.length + 1);
                        System.arraycopy(new Metadata.Entry[]{icyHeaders}, 0, objArrCopyOf, entryArr.length, 1);
                        metadata = new Metadata((Metadata.Entry[]) objArrCopyOf);
                    }
                    Format$Builder format$BuilderA = xQ.a();
                    format$BuilderA.f10536i = metadata;
                    xQ = new X(format$BuilderA);
                }
                if (zH && xQ.f309f == -1 && xQ.f310x == -1 && (i7 = icyHeaders.f10593a) != -1) {
                    Format$Builder format$BuilderA2 = xQ.a();
                    format$BuilderA2.f10533f = i7;
                    xQ = new X(format$BuilderA2);
                }
            }
            int iB = this.f10234c.b(xQ);
            Format$Builder format$BuilderA3 = xQ.a();
            format$BuilderA3.f10527D = iB;
            e0VarArr[i8] = new e0(Integer.toString(i8), new X(format$BuilderA3));
        }
        f0 f0Var = new f0(e0VarArr);
        g gVar = new g();
        gVar.f14680a = f0Var;
        gVar.f14681b = zArr;
        int i10 = f0Var.f10347a;
        gVar.f14682c = new boolean[i10];
        gVar.f14683d = new boolean[i10];
        this.f10217N = gVar;
        this.f10215L = true;
        A a2 = this.f10210G;
        a2.getClass();
        a2.f(this);
    }

    @Override // p146u2.F
    public final Q1.e i(H h6, IOException iOException, int i7) {
        long jMin;
        Q1.e eVar;
        s sVar;
        L l7 = (L) h6;
        if (this.f10225V == -1) {
            this.f10225V = l7.f10186B;
        }
        Uri uri = l7.f10191b.f16761c;
        C0774u c0774u = new C0774u();
        int i8 = t.f17159a;
        this.f10235d.getClass();
        if ((iOException instanceof C0045t0) || (iOException instanceof FileNotFoundException) || (iOException instanceof A) || (iOException instanceof J)) {
            jMin = -9223372036854775807L;
            break;
        }
        int i9 = C0955n.f16799b;
        Throwable cause = iOException;
        while (true) {
            if (cause == null) {
                jMin = Math.min((i7 - 1) * zzbbd.zzq.zzf, LoggerBatchProcessor.FLUSH_AFTER_MS);
                break;
            }
            if ((cause instanceof C0955n) && ((C0955n) cause).f16800a == 2008) {
                jMin = -9223372036854775807L;
                break;
            }
            cause = cause.getCause();
        }
        if (jMin == -9223372036854775807L) {
            eVar = K.f16730f;
        } else {
            int iD = d();
            int i10 = iD > this.f10229Z ? 1 : 0;
            if (this.f10225V != -1 || ((sVar = this.f10218O) != null && sVar.i() != -9223372036854775807L)) {
                this.f10229Z = iD;
            } else if (!this.f10215L || x()) {
                this.f10223T = this.f10215L;
                this.f10226W = 0L;
                this.f10229Z = 0;
                for (V v6 : this.f10212I) {
                    v6.y(false);
                }
                l7.f10195f.f2247a = 0L;
                l7.f10198z = 0L;
                l7.f10197y = true;
                l7.f10188D = false;
            } else {
                this.f10228Y = true;
                eVar = K.f16729e;
            }
            eVar = new Q1.e(jMin, i10, false);
        }
        Q1.e eVar2 = eVar;
        this.f10236e.h(c0774u, 1, -1, null, 0, null, l7.f10198z, this.f10219P, iOException, !eVar2.a());
        return eVar2;
    }

    @Override // p018c2.Y
    public final boolean isLoading() {
        boolean z4;
        if (this.f10204A.d()) {
            y yVar = this.f10206C;
            synchronized (yVar) {
                z4 = yVar.f2588a;
            }
            if (z4) {
                return true;
            }
        }
        return false;
    }

    public final void j(int i7) {
        c();
        g gVar = this.f10217N;
        boolean[] zArr = (boolean[]) gVar.f14683d;
        if (zArr[i7]) {
            return;
        }
        X x4 = ((f0) gVar.f14680a).a(i7).f10344d[0];
        this.f10236e.b(i.g(x4.f283C), x4, 0, null, this.f10226W);
        zArr[i7] = true;
    }

    @Override // p018c2.Y
    public final long k() {
        if (this.f10224U == 0) {
            return Long.MIN_VALUE;
        }
        return T();
    }

    @Override // p146u2.F
    public final void l(H h6, long j, long j3, boolean z4) {
        L l7 = (L) h6;
        Uri uri = l7.f10191b.f16761c;
        C0774u c0774u = new C0774u();
        this.f10235d.getClass();
        this.f10236e.d(c0774u, 1, -1, null, 0, null, l7.f10198z, this.f10219P);
        if (z4) {
            return;
        }
        if (this.f10225V == -1) {
            this.f10225V = l7.f10186B;
        }
        for (V v6 : this.f10212I) {
            v6.y(false);
        }
        if (this.f10224U > 0) {
            A a2 = this.f10210G;
            a2.getClass();
            a2.b(this);
        }
    }

    @Override // F1.m
    public final void m(s sVar) {
        this.f10209F.post(new K5.a(8, this, sVar));
    }

    @Override // F1.m
    public final void n() {
        this.f10214K = true;
        this.f10209F.post(this.f10207D);
    }

    @Override // p018c2.B
    public final long o(long j, H0 h6) {
        c();
        if (!this.f10218O.d()) {
            return 0L;
        }
        F1.r rVarH = this.f10218O.h(j);
        return h6.a(j, rVarH.f2567a.f2570a, rVarH.f2568b.f2570a);
    }

    @Override // p018c2.B
    public final void p(A a2, long j) {
        this.f10210G = a2;
        this.f10206C.a();
        u();
    }

    @Override // p018c2.B
    public final void q() throws IOException {
        int iU = this.f10235d.u(this.f10221R);
        K k7 = this.f10204A;
        IOException iOException = k7.f16733c;
        if (iOException != null) {
            throw iOException;
        }
        G g3 = k7.f16732b;
        if (g3 != null) {
            if (iU == Integer.MIN_VALUE) {
                iU = g3.f16719a;
            }
            IOException iOException2 = g3.f16723e;
            if (iOException2 != null && g3.f16724f > iU) {
                throw iOException2;
            }
        }
        if (this.f10231a0 && !this.f10215L) {
            throw C0045t0.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // F1.m
    public final v r(int i7, int i8) {
        return t(new N(i7, false));
    }

    public final void s(int i7) {
        c();
        boolean[] zArr = (boolean[]) this.f10217N.f14681b;
        if (this.f10228Y && zArr[i7] && !this.f10212I[i7].s(false)) {
            this.f10227X = 0L;
            this.f10228Y = false;
            this.f10223T = true;
            this.f10226W = 0L;
            this.f10229Z = 0;
            for (V v6 : this.f10212I) {
                v6.y(false);
            }
            A a2 = this.f10210G;
            a2.getClass();
            a2.b(this);
        }
    }

    public final V t(N n2) {
        int length = this.f10212I.length;
        for (int i7 = 0; i7 < length; i7++) {
            if (n2.equals(this.f10213J[i7])) {
                return this.f10212I[i7];
            }
        }
        B1.m mVar = this.f10237f;
        h hVar = this.f10234c;
        hVar.getClass();
        V v6 = new V(this.f10239y, hVar, mVar);
        v6.f10273f = this;
        int i8 = length + 1;
        N[] nArr = (N[]) Arrays.copyOf(this.f10213J, i8);
        nArr[length] = n2;
        int i9 = t.f17159a;
        this.f10213J = nArr;
        V[] vArr = (V[]) Arrays.copyOf(this.f10212I, i8);
        vArr[length] = v6;
        this.f10212I = vArr;
        return v6;
    }

    public final void u() {
        L l7 = new L(this, this.f10230a, this.f10232b, this.f10205B, this, this.f10206C);
        if (this.f10215L) {
            a.h(f());
            long j = this.f10219P;
            if (j != -9223372036854775807L && this.f10227X > j) {
                this.f10231a0 = true;
                this.f10227X = -9223372036854775807L;
                return;
            }
            s sVar = this.f10218O;
            sVar.getClass();
            long j3 = sVar.h(this.f10227X).f2567a.f2571b;
            long j7 = this.f10227X;
            l7.f10195f.f2247a = j3;
            l7.f10198z = j7;
            l7.f10197y = true;
            l7.f10188D = false;
            for (V v6 : this.f10212I) {
                v6.f10286t = this.f10227X;
            }
            this.f10227X = -9223372036854775807L;
        }
        this.f10229Z = d();
        this.f10204A.f(l7, this, this.f10235d.u(this.f10221R));
        this.f10236e.k(new C0774u(l7.f10185A), 1, -1, null, 0, null, l7.f10198z, this.f10219P);
    }

    @Override // p018c2.B
    public final long v(long j) {
        c();
        boolean[] zArr = (boolean[]) this.f10217N.f14681b;
        if (!this.f10218O.d()) {
            j = 0;
        }
        this.f10223T = false;
        this.f10226W = j;
        if (f()) {
            this.f10227X = j;
            return j;
        }
        if (this.f10221R != 7) {
            int length = this.f10212I.length;
            for (int i7 = 0; i7 < length; i7++) {
                if (this.f10212I[i7].z(j, false) || (!zArr[i7] && this.f10216M)) {
                }
            }
            return j;
        }
        this.f10228Y = false;
        this.f10227X = j;
        this.f10231a0 = false;
        K k7 = this.f10204A;
        if (k7.d()) {
            for (V v6 : this.f10212I) {
                v6.h();
            }
            k7.a();
        } else {
            k7.f16733c = null;
            for (V v7 : this.f10212I) {
                v7.y(false);
            }
        }
        return j;
    }

    @Override // p018c2.B
    public final void w(long j) {
        c();
        if (f()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.f10217N.f14682c;
        int length = this.f10212I.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.f10212I[i7].g(j, zArr[i7]);
        }
    }

    public final boolean x() {
        return this.f10223T || f();
    }

    @Override // p018c2.Y
    public final boolean y(long j) {
        if (this.f10231a0) {
            return false;
        }
        K k7 = this.f10204A;
        if (k7.b() || this.f10228Y) {
            return false;
        }
        if (this.f10215L && this.f10224U == 0) {
            return false;
        }
        boolean zA = this.f10206C.a();
        if (k7.d()) {
            return zA;
        }
        u();
        return true;
    }

    @Override // p018c2.Y
    public final void Y(long j) {
    }
}
