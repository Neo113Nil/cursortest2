package c2;

import A1.C0045t0;
import A1.H0;
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
import u2.C1621A;
import u2.C1637n;
import u2.InterfaceC1636m;
import v2.AbstractC1664a;
import w1.C1719l1;
import w1.C1726n0;

/* loaded from: classes.dex */
public final class O implements InterfaceC0794B, F1.m, u2.F, u2.I, U {
    public static final Map c0;

    /* renamed from: d0, reason: collision with root package name */
    public static final A1.X f10203d0;

    /* renamed from: B, reason: collision with root package name */
    public final C1726n0 f10205B;

    /* renamed from: D, reason: collision with root package name */
    public final K f10207D;

    /* renamed from: E, reason: collision with root package name */
    public final K f10208E;

    /* renamed from: G, reason: collision with root package name */
    public InterfaceC0793A f10210G;

    /* renamed from: H, reason: collision with root package name */
    public IcyHeaders f10211H;

    /* renamed from: K, reason: collision with root package name */
    public boolean f10214K;

    /* renamed from: L, reason: collision with root package name */
    public boolean f10215L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f10216M;

    /* renamed from: N, reason: collision with root package name */
    public k1.g f10217N;

    /* renamed from: O, reason: collision with root package name */
    public F1.s f10218O;

    /* renamed from: Q, reason: collision with root package name */
    public boolean f10220Q;

    /* renamed from: S, reason: collision with root package name */
    public boolean f10222S;

    /* renamed from: T, reason: collision with root package name */
    public boolean f10223T;

    /* renamed from: U, reason: collision with root package name */
    public int f10224U;

    /* renamed from: W, reason: collision with root package name */
    public long f10226W;

    /* renamed from: Y, reason: collision with root package name */
    public boolean f10228Y;

    /* renamed from: Z, reason: collision with root package name */
    public int f10229Z;

    /* renamed from: a, reason: collision with root package name */
    public final Uri f10230a;

    /* renamed from: a0, reason: collision with root package name */
    public boolean f10231a0;

    /* renamed from: b, reason: collision with root package name */
    public final InterfaceC1636m f10232b;

    /* renamed from: b0, reason: collision with root package name */
    public boolean f10233b0;

    /* renamed from: c, reason: collision with root package name */
    public final E1.h f10234c;

    /* renamed from: d, reason: collision with root package name */
    public final M4.e f10235d;

    /* renamed from: e, reason: collision with root package name */
    public final I f10236e;

    /* renamed from: f, reason: collision with root package name */
    public final B1.m f10237f;

    /* renamed from: x, reason: collision with root package name */
    public final Q f10238x;

    /* renamed from: y, reason: collision with root package name */
    public final u2.r f10239y;

    /* renamed from: z, reason: collision with root package name */
    public final long f10240z;

    /* renamed from: A, reason: collision with root package name */
    public final u2.K f10204A = new u2.K("ProgressiveMediaPeriod");

    /* renamed from: C, reason: collision with root package name */
    public final F1.y f10206C = new F1.y();

    /* renamed from: F, reason: collision with root package name */
    public final Handler f10209F = v2.t.m(null);

    /* renamed from: J, reason: collision with root package name */
    public N[] f10213J = new N[0];

    /* renamed from: I, reason: collision with root package name */
    public V[] f10212I = new V[0];

    /* renamed from: X, reason: collision with root package name */
    public long f10227X = -9223372036854775807L;

    /* renamed from: V, reason: collision with root package name */
    public long f10225V = -1;

    /* renamed from: P, reason: collision with root package name */
    public long f10219P = -9223372036854775807L;

    /* renamed from: R, reason: collision with root package name */
    public int f10221R = 1;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        c0 = Collections.unmodifiableMap(hashMap);
        Format$Builder format$Builder = new Format$Builder();
        format$Builder.f10528a = "icy";
        format$Builder.f10537k = "application/x-icy";
        f10203d0 = new A1.X(format$Builder);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [c2.K] */
    /* JADX WARN: Type inference failed for: r1v5, types: [c2.K] */
    public O(Uri uri, InterfaceC1636m interfaceC1636m, C1726n0 c1726n0, E1.h hVar, B1.m mVar, M4.e eVar, I i7, Q q7, u2.r rVar, int i8) {
        this.f10230a = uri;
        this.f10232b = interfaceC1636m;
        this.f10234c = hVar;
        this.f10237f = mVar;
        this.f10235d = eVar;
        this.f10236e = i7;
        this.f10238x = q7;
        this.f10239y = rVar;
        this.f10240z = i8;
        this.f10205B = c1726n0;
        final int i9 = 0;
        this.f10207D = new Runnable(this) { // from class: c2.K

            /* renamed from: b, reason: collision with root package name */
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
                            InterfaceC0793A interfaceC0793A = o7.f10210G;
                            interfaceC0793A.getClass();
                            interfaceC0793A.b(o7);
                            break;
                        }
                        break;
                }
            }
        };
        final int i10 = 1;
        this.f10208E = new Runnable(this) { // from class: c2.K

            /* renamed from: b, reason: collision with root package name */
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
                            InterfaceC0793A interfaceC0793A = o7.f10210G;
                            interfaceC0793A.getClass();
                            interfaceC0793A.b(o7);
                            break;
                        }
                        break;
                }
            }
        };
    }

    @Override // c2.InterfaceC0794B
    public final long I(t2.c[] cVarArr, boolean[] zArr, W[] wArr, boolean[] zArr2, long j) {
        t2.c cVar;
        c();
        k1.g gVar = this.f10217N;
        f0 f0Var = (f0) gVar.f14674a;
        boolean[] zArr3 = (boolean[]) gVar.f14676c;
        int i7 = this.f10224U;
        int i8 = 0;
        for (int i9 = 0; i9 < cVarArr.length; i9++) {
            W w7 = wArr[i9];
            if (w7 != null && (cVarArr[i9] == null || !zArr[i9])) {
                int i10 = ((M) w7).f10199a;
                AbstractC1664a.h(zArr3[i10]);
                this.f10224U--;
                zArr3[i10] = false;
                wArr[i9] = null;
            }
        }
        boolean z4 = !this.f10222S ? j == 0 : i7 != 0;
        for (int i11 = 0; i11 < cVarArr.length; i11++) {
            if (wArr[i11] == null && (cVar = cVarArr[i11]) != null) {
                int[] iArr = cVar.f16298c;
                AbstractC1664a.h(iArr.length == 1);
                AbstractC1664a.h(iArr[0] == 0);
                int b7 = f0Var.b(cVar.f16296a);
                AbstractC1664a.h(!zArr3[b7]);
                this.f10224U++;
                zArr3[b7] = true;
                wArr[i11] = new M(this, b7);
                zArr2[i11] = true;
                if (!z4) {
                    V v6 = this.f10212I[b7];
                    z4 = (v6.z(j, true) || v6.n() == 0) ? false : true;
                }
            }
        }
        if (this.f10224U == 0) {
            this.f10228Y = false;
            this.f10223T = false;
            u2.K k7 = this.f10204A;
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

    @Override // c2.InterfaceC0794B
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

    @Override // c2.InterfaceC0794B
    public final f0 P() {
        c();
        return (f0) this.f10217N.f14674a;
    }

    @Override // c2.Y
    public final long T() {
        long j;
        boolean z4;
        long j3;
        c();
        boolean[] zArr = (boolean[]) this.f10217N.f14675b;
        if (this.f10231a0) {
            return Long.MIN_VALUE;
        }
        if (f()) {
            return this.f10227X;
        }
        if (this.f10216M) {
            int length = this.f10212I.length;
            j = Long.MAX_VALUE;
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
                            j3 = v7.f10288v;
                        }
                        j = Math.min(j, j3);
                    }
                }
            }
        } else {
            j = Long.MAX_VALUE;
        }
        if (j == Long.MAX_VALUE) {
            j = e();
        }
        return j == Long.MIN_VALUE ? this.f10226W : j;
    }

    @Override // u2.I
    public final void a() {
        for (V v6 : this.f10212I) {
            v6.y(true);
            C1719l1 c1719l1 = v6.f10275h;
            if (c1719l1 != null) {
                c1719l1.F(v6.f10272e);
                v6.f10275h = null;
                v6.f10274g = null;
            }
        }
        C1726n0 c1726n0 = this.f10205B;
        F1.k kVar = (F1.k) c1726n0.f17806c;
        if (kVar != null) {
            kVar.release();
            c1726n0.f17806c = null;
        }
        c1726n0.f17807d = null;
    }

    @Override // c2.U
    public final void b() {
        this.f10209F.post(this.f10207D);
    }

    public final void c() {
        AbstractC1664a.h(this.f10215L);
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
        long j3 = Long.MIN_VALUE;
        for (V v6 : this.f10212I) {
            synchronized (v6) {
                j = v6.f10288v;
            }
            j3 = Math.max(j3, j);
        }
        return j3;
    }

    public final boolean f() {
        return this.f10227X != -9223372036854775807L;
    }

    @Override // u2.F
    public final void g(u2.H h6, long j, long j3) {
        F1.s sVar;
        L l7 = (L) h6;
        if (this.f10219P == -9223372036854775807L && (sVar = this.f10218O) != null) {
            boolean d7 = sVar.d();
            long e7 = e();
            long j7 = e7 == Long.MIN_VALUE ? 0L : e7 + 10000;
            this.f10219P = j7;
            this.f10238x.r(j7, d7, this.f10220Q);
        }
        Uri uri = l7.f10191b.f16755c;
        C0814u c0814u = new C0814u();
        this.f10235d.getClass();
        this.f10236e.f(c0814u, 1, -1, null, 0, null, l7.f10198z, this.f10219P);
        if (this.f10225V == -1) {
            this.f10225V = l7.f10186B;
        }
        this.f10231a0 = true;
        InterfaceC0793A interfaceC0793A = this.f10210G;
        interfaceC0793A.getClass();
        interfaceC0793A.b(this);
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
        F1.y yVar = this.f10206C;
        synchronized (yVar) {
            yVar.f2588a = false;
        }
        int length = this.f10212I.length;
        e0[] e0VarArr = new e0[length];
        boolean[] zArr = new boolean[length];
        for (int i8 = 0; i8 < length; i8++) {
            A1.X q7 = this.f10212I[i8].q();
            q7.getClass();
            String str = q7.f283C;
            boolean h6 = v2.i.h(str);
            boolean z4 = h6 || v2.i.j(str);
            zArr[i8] = z4;
            this.f10216M = z4 | this.f10216M;
            IcyHeaders icyHeaders = this.f10211H;
            if (icyHeaders != null) {
                if (h6 || this.f10213J[i8].f10202b) {
                    Metadata metadata2 = q7.f281A;
                    if (metadata2 == null) {
                        metadata = new Metadata(icyHeaders);
                    } else {
                        int i9 = v2.t.f17153a;
                        Metadata.Entry[] entryArr = metadata2.f10562a;
                        Object[] copyOf = Arrays.copyOf(entryArr, entryArr.length + 1);
                        System.arraycopy(new Metadata.Entry[]{icyHeaders}, 0, copyOf, entryArr.length, 1);
                        metadata = new Metadata((Metadata.Entry[]) copyOf);
                    }
                    Format$Builder a2 = q7.a();
                    a2.f10536i = metadata;
                    q7 = new A1.X(a2);
                }
                if (h6 && q7.f309f == -1 && q7.f310x == -1 && (i7 = icyHeaders.f10593a) != -1) {
                    Format$Builder a4 = q7.a();
                    a4.f10533f = i7;
                    q7 = new A1.X(a4);
                }
            }
            int b7 = this.f10234c.b(q7);
            Format$Builder a7 = q7.a();
            a7.f10527D = b7;
            e0VarArr[i8] = new e0(Integer.toString(i8), new A1.X(a7));
        }
        f0 f0Var = new f0(e0VarArr);
        k1.g gVar = new k1.g();
        gVar.f14674a = f0Var;
        gVar.f14675b = zArr;
        int i10 = f0Var.f10347a;
        gVar.f14676c = new boolean[i10];
        gVar.f14677d = new boolean[i10];
        this.f10217N = gVar;
        this.f10215L = true;
        InterfaceC0793A interfaceC0793A = this.f10210G;
        interfaceC0793A.getClass();
        interfaceC0793A.f(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0068  */
    @Override // u2.F
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Q1.e i(u2.H h6, IOException iOException, int i7) {
        long j;
        Q1.e eVar;
        F1.s sVar;
        L l7 = (L) h6;
        if (this.f10225V == -1) {
            this.f10225V = l7.f10186B;
        }
        Uri uri = l7.f10191b.f16755c;
        C0814u c0814u = new C0814u();
        int i8 = v2.t.f17153a;
        this.f10235d.getClass();
        if (!(iOException instanceof C0045t0) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof C1621A) && !(iOException instanceof u2.J)) {
            int i9 = C1637n.f16793b;
            for (Throwable th = iOException; th != null; th = th.getCause()) {
                if (!(th instanceof C1637n) || ((C1637n) th).f16794a != 2008) {
                }
            }
            j = Math.min((i7 - 1) * zzbbd.zzq.zzf, LoggerBatchProcessor.FLUSH_AFTER_MS);
            if (j != -9223372036854775807L) {
                eVar = u2.K.f16724f;
            } else {
                int d7 = d();
                int i10 = d7 > this.f10229Z ? 1 : 0;
                if (this.f10225V != -1 || ((sVar = this.f10218O) != null && sVar.i() != -9223372036854775807L)) {
                    this.f10229Z = d7;
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
                    eVar = u2.K.f16723e;
                }
                eVar = new Q1.e(j, i10, false);
            }
            Q1.e eVar2 = eVar;
            this.f10236e.h(c0814u, 1, -1, null, 0, null, l7.f10198z, this.f10219P, iOException, !eVar2.a());
            return eVar2;
        }
        j = -9223372036854775807L;
        if (j != -9223372036854775807L) {
        }
        Q1.e eVar22 = eVar;
        this.f10236e.h(c0814u, 1, -1, null, 0, null, l7.f10198z, this.f10219P, iOException, !eVar22.a());
        return eVar22;
    }

    @Override // c2.Y
    public final boolean isLoading() {
        boolean z4;
        if (this.f10204A.d()) {
            F1.y yVar = this.f10206C;
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
        k1.g gVar = this.f10217N;
        boolean[] zArr = (boolean[]) gVar.f14677d;
        if (zArr[i7]) {
            return;
        }
        A1.X x4 = ((f0) gVar.f14674a).a(i7).f10344d[0];
        this.f10236e.b(v2.i.g(x4.f283C), x4, 0, null, this.f10226W);
        zArr[i7] = true;
    }

    @Override // c2.Y
    public final long k() {
        if (this.f10224U == 0) {
            return Long.MIN_VALUE;
        }
        return T();
    }

    @Override // u2.F
    public final void l(u2.H h6, long j, long j3, boolean z4) {
        L l7 = (L) h6;
        Uri uri = l7.f10191b.f16755c;
        C0814u c0814u = new C0814u();
        this.f10235d.getClass();
        this.f10236e.d(c0814u, 1, -1, null, 0, null, l7.f10198z, this.f10219P);
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
            InterfaceC0793A interfaceC0793A = this.f10210G;
            interfaceC0793A.getClass();
            interfaceC0793A.b(this);
        }
    }

    @Override // F1.m
    public final void m(F1.s sVar) {
        this.f10209F.post(new K5.a(8, this, sVar));
    }

    @Override // F1.m
    public final void n() {
        this.f10214K = true;
        this.f10209F.post(this.f10207D);
    }

    @Override // c2.InterfaceC0794B
    public final long o(long j, H0 h02) {
        c();
        if (!this.f10218O.d()) {
            return 0L;
        }
        F1.r h6 = this.f10218O.h(j);
        return h02.a(j, h6.f2567a.f2570a, h6.f2568b.f2570a);
    }

    @Override // c2.InterfaceC0794B
    public final void p(InterfaceC0793A interfaceC0793A, long j) {
        this.f10210G = interfaceC0793A;
        this.f10206C.a();
        u();
    }

    @Override // c2.InterfaceC0794B
    public final void q() {
        int u4 = this.f10235d.u(this.f10221R);
        u2.K k7 = this.f10204A;
        IOException iOException = k7.f16727c;
        if (iOException != null) {
            throw iOException;
        }
        u2.G g3 = k7.f16726b;
        if (g3 != null) {
            if (u4 == Integer.MIN_VALUE) {
                u4 = g3.f16713a;
            }
            IOException iOException2 = g3.f16717e;
            if (iOException2 != null && g3.f16718f > u4) {
                throw iOException2;
            }
        }
        if (this.f10231a0 && !this.f10215L) {
            throw C0045t0.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // F1.m
    public final F1.v r(int i7, int i8) {
        return t(new N(i7, false));
    }

    public final void s(int i7) {
        c();
        boolean[] zArr = (boolean[]) this.f10217N.f14675b;
        if (this.f10228Y && zArr[i7] && !this.f10212I[i7].s(false)) {
            this.f10227X = 0L;
            this.f10228Y = false;
            this.f10223T = true;
            this.f10226W = 0L;
            this.f10229Z = 0;
            for (V v6 : this.f10212I) {
                v6.y(false);
            }
            InterfaceC0793A interfaceC0793A = this.f10210G;
            interfaceC0793A.getClass();
            interfaceC0793A.b(this);
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
        E1.h hVar = this.f10234c;
        hVar.getClass();
        V v6 = new V(this.f10239y, hVar, mVar);
        v6.f10273f = this;
        int i8 = length + 1;
        N[] nArr = (N[]) Arrays.copyOf(this.f10213J, i8);
        nArr[length] = n2;
        int i9 = v2.t.f17153a;
        this.f10213J = nArr;
        V[] vArr = (V[]) Arrays.copyOf(this.f10212I, i8);
        vArr[length] = v6;
        this.f10212I = vArr;
        return v6;
    }

    public final void u() {
        L l7 = new L(this, this.f10230a, this.f10232b, this.f10205B, this, this.f10206C);
        if (this.f10215L) {
            AbstractC1664a.h(f());
            long j = this.f10219P;
            if (j != -9223372036854775807L && this.f10227X > j) {
                this.f10231a0 = true;
                this.f10227X = -9223372036854775807L;
                return;
            }
            F1.s sVar = this.f10218O;
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
        this.f10236e.k(new C0814u(l7.f10185A), 1, -1, null, 0, null, l7.f10198z, this.f10219P);
    }

    @Override // c2.InterfaceC0794B
    public final long v(long j) {
        int i7;
        c();
        boolean[] zArr = (boolean[]) this.f10217N.f14675b;
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
            for (0; i7 < length; i7 + 1) {
                i7 = (this.f10212I[i7].z(j, false) || (!zArr[i7] && this.f10216M)) ? i7 + 1 : 0;
            }
            return j;
        }
        this.f10228Y = false;
        this.f10227X = j;
        this.f10231a0 = false;
        u2.K k7 = this.f10204A;
        if (k7.d()) {
            for (V v6 : this.f10212I) {
                v6.h();
            }
            k7.a();
        } else {
            k7.f16727c = null;
            for (V v7 : this.f10212I) {
                v7.y(false);
            }
        }
        return j;
    }

    @Override // c2.InterfaceC0794B
    public final void w(long j) {
        c();
        if (f()) {
            return;
        }
        boolean[] zArr = (boolean[]) this.f10217N.f14676c;
        int length = this.f10212I.length;
        for (int i7 = 0; i7 < length; i7++) {
            this.f10212I[i7].g(j, zArr[i7]);
        }
    }

    public final boolean x() {
        return this.f10223T || f();
    }

    @Override // c2.Y
    public final boolean y(long j) {
        if (this.f10231a0) {
            return false;
        }
        u2.K k7 = this.f10204A;
        if (k7.b() || this.f10228Y) {
            return false;
        }
        if (this.f10215L && this.f10224U == 0) {
            return false;
        }
        boolean a2 = this.f10206C.a();
        if (k7.d()) {
            return a2;
        }
        u();
        return true;
    }

    @Override // c2.Y
    public final void Y(long j) {
    }
}
