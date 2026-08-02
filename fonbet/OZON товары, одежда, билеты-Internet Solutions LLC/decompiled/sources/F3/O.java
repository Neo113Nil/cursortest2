package F3;

import F3.F;
import F3.InterfaceC3017w;
import F3.T;
import F3.r;
import J3.j;
import N3.C3663n;
import N3.H;
import a4.C4940b;
import android.net.Uri;
import android.os.Handler;
import j3.C7253I;
import j3.C7272n;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import m3.C8050C;
import m3.C8067i;
import p3.C8847g;
import p3.InterfaceC8846f;
import p3.i;
import t3.C9730B;
import w3.i;

/* loaded from: classes8.dex */
final class O implements InterfaceC3017w, N3.r, j.a<b>, j.e, T.c {

    /* renamed from: Q, reason: collision with root package name */
    private static final Map<String, String> f8438Q;

    /* renamed from: R, reason: collision with root package name */
    private static final C7272n f8439R;

    /* renamed from: A, reason: collision with root package name */
    private e f8440A;

    /* renamed from: B, reason: collision with root package name */
    private N3.H f8441B;

    /* renamed from: C, reason: collision with root package name */
    private long f8442C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f8443D;

    /* renamed from: E, reason: collision with root package name */
    private int f8444E;

    /* renamed from: F, reason: collision with root package name */
    private boolean f8445F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f8446G;

    /* renamed from: H, reason: collision with root package name */
    private boolean f8447H;

    /* renamed from: I, reason: collision with root package name */
    private int f8448I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f8449J;

    /* renamed from: K, reason: collision with root package name */
    private long f8450K;

    /* renamed from: L, reason: collision with root package name */
    private long f8451L;

    /* renamed from: M, reason: collision with root package name */
    private boolean f8452M;

    /* renamed from: N, reason: collision with root package name */
    private int f8453N;

    /* renamed from: O, reason: collision with root package name */
    private boolean f8454O;

    /* renamed from: P, reason: collision with root package name */
    private boolean f8455P;

    /* renamed from: a, reason: collision with root package name */
    private final Uri f8456a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC8846f f8457b;

    /* renamed from: c, reason: collision with root package name */
    private final w3.j f8458c;

    /* renamed from: d, reason: collision with root package name */
    private final J3.h f8459d;

    /* renamed from: e, reason: collision with root package name */
    private final F.a f8460e;

    /* renamed from: f, reason: collision with root package name */
    private final i.a f8461f;

    /* renamed from: g, reason: collision with root package name */
    private final P f8462g;

    /* renamed from: h, reason: collision with root package name */
    private final J3.b f8463h;

    /* renamed from: i, reason: collision with root package name */
    private final String f8464i;

    /* renamed from: j, reason: collision with root package name */
    private final long f8465j;

    /* renamed from: k, reason: collision with root package name */
    private final C7272n f8466k;

    /* renamed from: l, reason: collision with root package name */
    private final long f8467l;

    /* renamed from: m, reason: collision with root package name */
    private final J3.j f8468m;

    /* renamed from: n, reason: collision with root package name */
    private final J f8469n;

    /* renamed from: o, reason: collision with root package name */
    private final C8067i f8470o;

    /* renamed from: p, reason: collision with root package name */
    private final L f8471p;

    /* renamed from: q, reason: collision with root package name */
    private final M f8472q;

    /* renamed from: r, reason: collision with root package name */
    private final Handler f8473r;

    /* renamed from: s, reason: collision with root package name */
    private InterfaceC3017w.a f8474s;

    /* renamed from: t, reason: collision with root package name */
    private C4940b f8475t;

    /* renamed from: u, reason: collision with root package name */
    private T[] f8476u;

    /* renamed from: v, reason: collision with root package name */
    private d[] f8477v;

    /* renamed from: w, reason: collision with root package name */
    private boolean f8478w;

    /* renamed from: x, reason: collision with root package name */
    private boolean f8479x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f8480y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f8481z;

    final class a extends N3.A {
        a(N3.H h11) {
            super(h11);
        }

        @Override // N3.A, N3.H
        public final long getDurationUs() {
            return O.this.f8442C;
        }
    }

    final class b implements j.d, r.a {

        /* renamed from: b, reason: collision with root package name */
        private final Uri f8484b;

        /* renamed from: c, reason: collision with root package name */
        private final p3.x f8485c;

        /* renamed from: d, reason: collision with root package name */
        private final J f8486d;

        /* renamed from: e, reason: collision with root package name */
        private final N3.r f8487e;

        /* renamed from: f, reason: collision with root package name */
        private final C8067i f8488f;

        /* renamed from: h, reason: collision with root package name */
        private volatile boolean f8490h;

        /* renamed from: j, reason: collision with root package name */
        private long f8492j;

        /* renamed from: l, reason: collision with root package name */
        private N3.M f8494l;

        /* renamed from: m, reason: collision with root package name */
        private boolean f8495m;

        /* renamed from: g, reason: collision with root package name */
        private final N3.G f8489g = new N3.G();

        /* renamed from: i, reason: collision with root package name */
        private boolean f8491i = true;

        /* renamed from: a, reason: collision with root package name */
        private final long f8483a = C3013s.a();

        /* renamed from: k, reason: collision with root package name */
        private p3.i f8493k = f(0);

        public b(Uri uri, InterfaceC8846f interfaceC8846f, J j11, N3.r rVar, C8067i c8067i) {
            this.f8484b = uri;
            this.f8485c = new p3.x(interfaceC8846f);
            this.f8486d = j11;
            this.f8487e = rVar;
            this.f8488f = c8067i;
        }

        static void e(b bVar, long j11, long j12) {
            bVar.f8489g.f18501a = j11;
            bVar.f8492j = j12;
            bVar.f8491i = true;
            bVar.f8495m = false;
        }

        private p3.i f(long j11) {
            i.a aVar = new i.a();
            aVar.i(this.f8484b);
            aVar.h(j11);
            aVar.f(O.this.f8464i);
            aVar.b(6);
            aVar.e(O.f8438Q);
            return aVar.a();
        }

        @Override // J3.j.d
        public final void cancelLoad() {
            this.f8490h = true;
        }

        public final void g(C8050C c8050c) {
            long max = !this.f8495m ? this.f8492j : Math.max(O.i(O.this), this.f8492j);
            int a11 = c8050c.a();
            N3.M m11 = this.f8494l;
            m11.getClass();
            m11.e(a11, c8050c);
            m11.b(max, 1, a11, 0, null);
            this.f8495m = true;
        }

        @Override // J3.j.d
        public final void load() throws IOException {
            int i11 = 0;
            while (i11 == 0 && !this.f8490h) {
                try {
                    long j11 = this.f8489g.f18501a;
                    p3.i f7 = f(j11);
                    this.f8493k = f7;
                    long open = this.f8485c.open(f7);
                    if (this.f8490h) {
                        if (i11 != 1 && ((C2998c) this.f8486d).b() != -1) {
                            this.f8489g.f18501a = ((C2998c) this.f8486d).b();
                        }
                        Hj0.T.b(this.f8485c);
                        return;
                    }
                    if (open != -1) {
                        open += j11;
                        O.m(O.this);
                    }
                    long j12 = open;
                    O.this.f8475t = C4940b.d(this.f8485c.getResponseHeaders());
                    InterfaceC8846f interfaceC8846f = this.f8485c;
                    if (O.this.f8475t != null && O.this.f8475t.f36259f != -1) {
                        interfaceC8846f = new r(this.f8485c, O.this.f8475t.f36259f, this);
                        N3.M t2 = O.this.t();
                        this.f8494l = t2;
                        t2.a(O.f8439R);
                    }
                    ((C2998c) this.f8486d).c(interfaceC8846f, this.f8484b, this.f8485c.getResponseHeaders(), j11, j12, this.f8487e);
                    if (O.this.f8475t != null) {
                        ((C2998c) this.f8486d).a();
                    }
                    if (this.f8491i) {
                        ((C2998c) this.f8486d).f(j11, this.f8492j);
                        this.f8491i = false;
                    }
                    while (i11 == 0 && !this.f8490h) {
                        try {
                            this.f8488f.a();
                            i11 = ((C2998c) this.f8486d).d(this.f8489g);
                            long b11 = ((C2998c) this.f8486d).b();
                            if (b11 > O.this.f8465j + j11) {
                                this.f8488f.e();
                                O.this.f8473r.post(O.this.f8472q);
                                j11 = b11;
                            }
                        } catch (InterruptedException unused) {
                            throw new InterruptedIOException();
                        }
                    }
                    if (i11 == 1) {
                        i11 = 0;
                    } else if (((C2998c) this.f8486d).b() != -1) {
                        this.f8489g.f18501a = ((C2998c) this.f8486d).b();
                    }
                    Hj0.T.b(this.f8485c);
                } catch (Throwable th2) {
                    if (i11 != 1 && ((C2998c) this.f8486d).b() != -1) {
                        this.f8489g.f18501a = ((C2998c) this.f8486d).b();
                    }
                    Hj0.T.b(this.f8485c);
                    throw th2;
                }
            }
        }
    }

    private final class c implements U {

        /* renamed from: a, reason: collision with root package name */
        private final int f8497a;

        public c(int i11) {
            this.f8497a = i11;
        }

        @Override // F3.U
        public final boolean isReady() {
            return O.this.v(this.f8497a);
        }

        @Override // F3.U
        public final void maybeThrowError() throws IOException {
            O.this.z(this.f8497a);
        }

        @Override // F3.U
        public final int readData(C9730B c9730b, s3.f fVar, int i11) {
            return O.this.B(this.f8497a, c9730b, fVar, i11);
        }

        @Override // F3.U
        public final int skipData(long j11) {
            return O.this.E(this.f8497a, j11);
        }
    }

    private static final class d {

        /* renamed from: a, reason: collision with root package name */
        public final int f8499a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f8500b;

        public d(int i11, boolean z11) {
            this.f8499a = i11;
            this.f8500b = z11;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || d.class != obj.getClass()) {
                return false;
            }
            d dVar = (d) obj;
            return this.f8499a == dVar.f8499a && this.f8500b == dVar.f8500b;
        }

        public final int hashCode() {
            return (this.f8499a * 31) + (this.f8500b ? 1 : 0);
        }
    }

    private static final class e {

        /* renamed from: a, reason: collision with root package name */
        public final d0 f8501a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean[] f8502b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean[] f8503c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean[] f8504d;

        public e(d0 d0Var, boolean[] zArr) {
            this.f8501a = d0Var;
            this.f8502b = zArr;
            int i11 = d0Var.f8644a;
            this.f8503c = new boolean[i11];
            this.f8504d = new boolean[i11];
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("Icy-MetaData", "1");
        f8438Q = Collections.unmodifiableMap(hashMap);
        C7272n.a aVar = new C7272n.a();
        aVar.j0("icy");
        aVar.y0("application/x-icy");
        f8439R = aVar.P();
    }

    /* JADX WARN: Type inference failed for: r2v5, types: [F3.L] */
    /* JADX WARN: Type inference failed for: r2v6, types: [F3.M] */
    public O(Uri uri, InterfaceC8846f interfaceC8846f, J j11, w3.j jVar, i.a aVar, J3.h hVar, F.a aVar2, P p11, J3.b bVar, String str, int i11, C7272n c7272n, long j12, K3.b bVar2) {
        this.f8456a = uri;
        this.f8457b = interfaceC8846f;
        this.f8458c = jVar;
        this.f8461f = aVar;
        this.f8459d = hVar;
        this.f8460e = aVar2;
        this.f8462g = p11;
        this.f8463h = bVar;
        this.f8464i = str;
        this.f8465j = i11;
        this.f8466k = c7272n;
        this.f8468m = bVar2 != null ? new J3.j(bVar2) : new J3.j("ProgressiveMediaPeriod");
        this.f8469n = j11;
        this.f8467l = j12;
        this.f8470o = new C8067i();
        this.f8471p = new Runnable() { // from class: F3.L
            @Override // java.lang.Runnable
            public final void run() {
                O.this.w();
            }
        };
        this.f8472q = new Runnable() { // from class: F3.M
            @Override // java.lang.Runnable
            public final void run() {
                O.c(O.this);
            }
        };
        this.f8473r = m3.N.p(null);
        this.f8477v = new d[0];
        this.f8476u = new T[0];
        this.f8451L = -9223372036854775807L;
        this.f8444E = 1;
    }

    private N3.M A(d dVar) {
        int length = this.f8476u.length;
        for (int i11 = 0; i11 < length; i11++) {
            if (dVar.equals(this.f8477v[i11])) {
                return this.f8476u[i11];
            }
        }
        if (this.f8478w) {
            m3.s.f("ProgressiveMediaPeriod", "Extractor added new track (id=" + dVar.f8499a + ") after finishing tracks.");
            return new C3663n();
        }
        T g10 = T.g(this.f8463h, this.f8458c, this.f8461f);
        g10.M(this);
        int i12 = length + 1;
        d[] dVarArr = (d[]) Arrays.copyOf(this.f8477v, i12);
        dVarArr[length] = dVar;
        int i13 = m3.N.f74289a;
        this.f8477v = dVarArr;
        T[] tArr = (T[]) Arrays.copyOf(this.f8476u, i12);
        tArr[length] = g10;
        this.f8476u = tArr;
        return g10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D(N3.H h11) {
        this.f8441B = this.f8475t == null ? h11 : new H.b(-9223372036854775807L);
        this.f8442C = h11.getDurationUs();
        boolean z11 = !this.f8449J && h11.getDurationUs() == -9223372036854775807L;
        this.f8443D = z11;
        this.f8444E = z11 ? 7 : 1;
        if (this.f8479x) {
            this.f8462g.onSourceInfoRefreshed(this.f8442C, h11, z11);
        } else {
            w();
        }
    }

    private void F() {
        b bVar = new b(this.f8456a, this.f8457b, this.f8469n, this, this.f8470o);
        if (this.f8479x) {
            G10.a.h(u());
            long j11 = this.f8442C;
            if (j11 != -9223372036854775807L && this.f8451L > j11) {
                this.f8454O = true;
                this.f8451L = -9223372036854775807L;
                return;
            }
            N3.H h11 = this.f8441B;
            h11.getClass();
            b.e(bVar, h11.getSeekPoints(this.f8451L).f18502a.f18508b, this.f8451L);
            for (T t2 : this.f8476u) {
                t2.L(this.f8451L);
            }
            this.f8451L = -9223372036854775807L;
        }
        this.f8453N = r();
        this.f8468m.l(bVar, this, this.f8459d.b(this.f8444E));
    }

    private boolean G() {
        return this.f8446G || u();
    }

    public static void c(O o11) {
        if (o11.f8455P) {
            return;
        }
        InterfaceC3017w.a aVar = o11.f8474s;
        aVar.getClass();
        aVar.c(o11);
    }

    static /* synthetic */ long i(O o11) {
        return o11.s(true);
    }

    static void m(final O o11) {
        o11.f8473r.post(new Runnable() { // from class: F3.K
            @Override // java.lang.Runnable
            public final void run() {
                O.this.f8449J = true;
            }
        });
    }

    private void q() {
        G10.a.h(this.f8479x);
        this.f8440A.getClass();
        this.f8441B.getClass();
    }

    private int r() {
        int i11 = 0;
        for (T t2 : this.f8476u) {
            i11 += t2.w();
        }
        return i11;
    }

    private long s(boolean z11) {
        int i11;
        long j11 = Long.MIN_VALUE;
        while (i11 < this.f8476u.length) {
            if (!z11) {
                e eVar = this.f8440A;
                eVar.getClass();
                i11 = eVar.f8503c[i11] ? 0 : i11 + 1;
            }
            j11 = Math.max(j11, this.f8476u[i11].p());
        }
        return j11;
    }

    private boolean u() {
        return this.f8451L != -9223372036854775807L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w() {
        long j11;
        int i11;
        if (this.f8455P || this.f8479x || !this.f8478w || this.f8441B == null) {
            return;
        }
        for (T t2 : this.f8476u) {
            if (t2.v() == null) {
                return;
            }
        }
        this.f8470o.e();
        int length = this.f8476u.length;
        C7253I[] c7253iArr = new C7253I[length];
        boolean[] zArr = new boolean[length];
        int i12 = 0;
        while (true) {
            j11 = this.f8467l;
            if (i12 >= length) {
                break;
            }
            C7272n v11 = this.f8476u[i12].v();
            v11.getClass();
            String str = v11.f69127o;
            boolean i13 = j3.u.i(str);
            boolean z11 = i13 || j3.u.l(str);
            zArr[i12] = z11;
            this.f8480y = z11 | this.f8480y;
            this.f8481z = j11 != -9223372036854775807L && length == 1 && j3.u.j(str);
            C4940b c4940b = this.f8475t;
            if (c4940b != null) {
                if (i13 || this.f8477v[i12].f8500b) {
                    j3.t tVar = v11.f69124l;
                    j3.t tVar2 = tVar == null ? new j3.t(c4940b) : tVar.a(c4940b);
                    C7272n.a a11 = v11.a();
                    a11.r0(tVar2);
                    v11 = a11.P();
                }
                if (i13 && v11.f69120h == -1 && v11.f69121i == -1 && (i11 = c4940b.f36254a) != -1) {
                    C7272n.a a12 = v11.a();
                    a12.S(i11);
                    v11 = a12.P();
                }
            }
            C7272n b11 = v11.b(this.f8458c.b(v11));
            c7253iArr[i12] = new C7253I(Integer.toString(i12), b11);
            this.f8447H = b11.f69133u | this.f8447H;
            i12++;
        }
        this.f8440A = new e(new d0(c7253iArr), zArr);
        if (this.f8481z && this.f8442C == -9223372036854775807L) {
            this.f8442C = j11;
            this.f8441B = new a(this.f8441B);
        }
        this.f8462g.onSourceInfoRefreshed(this.f8442C, this.f8441B, this.f8443D);
        this.f8479x = true;
        InterfaceC3017w.a aVar = this.f8474s;
        aVar.getClass();
        aVar.e(this);
    }

    private void x(int i11) {
        q();
        e eVar = this.f8440A;
        boolean[] zArr = eVar.f8504d;
        if (zArr[i11]) {
            return;
        }
        C7272n a11 = eVar.f8501a.a(i11).a(0);
        this.f8460e.c(j3.u.h(a11.f69127o), a11, 0, null, this.f8450K);
        zArr[i11] = true;
    }

    private void y(int i11) {
        q();
        if (this.f8452M) {
            if ((!this.f8480y || this.f8440A.f8502b[i11]) && !this.f8476u[i11].z(false)) {
                this.f8451L = 0L;
                this.f8452M = false;
                this.f8446G = true;
                this.f8450K = 0L;
                this.f8453N = 0;
                for (T t2 : this.f8476u) {
                    t2.H(false);
                }
                InterfaceC3017w.a aVar = this.f8474s;
                aVar.getClass();
                aVar.c(this);
            }
        }
    }

    final int B(int i11, C9730B c9730b, s3.f fVar, int i12) {
        if (G()) {
            return -3;
        }
        x(i11);
        int F11 = this.f8476u[i11].F(c9730b, fVar, i12, this.f8454O);
        if (F11 == -3) {
            y(i11);
        }
        return F11;
    }

    public final void C() {
        if (this.f8479x) {
            for (T t2 : this.f8476u) {
                t2.E();
            }
        }
        this.f8468m.k(this);
        this.f8473r.removeCallbacksAndMessages(null);
        this.f8474s = null;
        this.f8455P = true;
    }

    final int E(int i11, long j11) {
        if (G()) {
            return 0;
        }
        x(i11);
        T t2 = this.f8476u[i11];
        int u11 = t2.u(j11, this.f8454O);
        t2.N(u11);
        if (u11 == 0) {
            y(i11);
        }
        return u11;
    }

    @Override // F3.V
    public final boolean continueLoading(androidx.media3.exoplayer.M m11) {
        if (this.f8454O) {
            return false;
        }
        J3.j jVar = this.f8468m;
        if (jVar.h() || this.f8452M) {
            return false;
        }
        if ((this.f8479x || this.f8466k != null) && this.f8448I == 0) {
            return false;
        }
        boolean g10 = this.f8470o.g();
        if (jVar.i()) {
            return g10;
        }
        F();
        return true;
    }

    @Override // F3.InterfaceC3017w
    public final void discardBuffer(long j11, boolean z11) {
        if (this.f8481z) {
            return;
        }
        q();
        if (u()) {
            return;
        }
        boolean[] zArr = this.f8440A.f8503c;
        int length = this.f8476u.length;
        for (int i11 = 0; i11 < length; i11++) {
            this.f8476u[i11].i(j11, z11, zArr[i11]);
        }
    }

    @Override // N3.r
    public final void endTracks() {
        this.f8478w = true;
        this.f8473r.post(this.f8471p);
    }

    @Override // F3.InterfaceC3017w
    public final long getAdjustedSeekPositionUs(long j11, t3.I i11) {
        q();
        if (!this.f8441B.isSeekable()) {
            return 0L;
        }
        H.a seekPoints = this.f8441B.getSeekPoints(j11);
        return i11.a(j11, seekPoints.f18502a.f18507a, seekPoints.f18503b.f18507a);
    }

    @Override // F3.V
    public final long getBufferedPositionUs() {
        long j11;
        q();
        if (this.f8454O || this.f8448I == 0) {
            return Long.MIN_VALUE;
        }
        if (u()) {
            return this.f8451L;
        }
        if (this.f8480y) {
            int length = this.f8476u.length;
            j11 = Long.MAX_VALUE;
            for (int i11 = 0; i11 < length; i11++) {
                e eVar = this.f8440A;
                if (eVar.f8502b[i11] && eVar.f8503c[i11] && !this.f8476u[i11].y()) {
                    j11 = Math.min(j11, this.f8476u[i11].p());
                }
            }
        } else {
            j11 = Long.MAX_VALUE;
        }
        if (j11 == Long.MAX_VALUE) {
            j11 = s(false);
        }
        return j11 == Long.MIN_VALUE ? this.f8450K : j11;
    }

    @Override // F3.V
    public final long getNextLoadPositionUs() {
        return getBufferedPositionUs();
    }

    @Override // F3.InterfaceC3017w
    public final d0 getTrackGroups() {
        q();
        return this.f8440A.f8501a;
    }

    @Override // F3.V
    public final boolean isLoading() {
        return this.f8468m.i() && this.f8470o.f();
    }

    @Override // F3.InterfaceC3017w
    public final void maybeThrowPrepareError() throws IOException {
        this.f8468m.j(this.f8459d.b(this.f8444E));
        if (this.f8454O && !this.f8479x) {
            throw j3.v.a(null, "Loading finished before preparation is complete.");
        }
    }

    @Override // J3.j.a
    public final void onLoadCanceled(b bVar, long j11, long j12, boolean z11) {
        b bVar2 = bVar;
        p3.x xVar = bVar2.f8485c;
        long unused = bVar2.f8483a;
        p3.i iVar = bVar2.f8493k;
        xVar.getClass();
        C3013s c3013s = new C3013s(iVar, xVar.k(), j12);
        long unused2 = bVar2.f8483a;
        this.f8459d.getClass();
        this.f8460e.d(c3013s, 1, -1, null, 0, null, bVar2.f8492j, this.f8442C);
        if (z11) {
            return;
        }
        for (T t2 : this.f8476u) {
            t2.H(false);
        }
        if (this.f8448I > 0) {
            InterfaceC3017w.a aVar = this.f8474s;
            aVar.getClass();
            aVar.c(this);
        }
    }

    @Override // J3.j.a
    public final void onLoadCompleted(b bVar, long j11, long j12) {
        b bVar2 = bVar;
        if (this.f8442C == -9223372036854775807L && this.f8441B != null) {
            long s11 = s(true);
            long j13 = s11 == Long.MIN_VALUE ? 0L : s11 + 10000;
            this.f8442C = j13;
            this.f8462g.onSourceInfoRefreshed(j13, this.f8441B, this.f8443D);
        }
        p3.x xVar = bVar2.f8485c;
        long unused = bVar2.f8483a;
        p3.i iVar = bVar2.f8493k;
        xVar.getClass();
        C3013s c3013s = new C3013s(iVar, xVar.k(), j12);
        long unused2 = bVar2.f8483a;
        this.f8459d.getClass();
        this.f8460e.e(c3013s, 1, -1, null, 0, null, bVar2.f8492j, this.f8442C);
        this.f8454O = true;
        InterfaceC3017w.a aVar = this.f8474s;
        aVar.getClass();
        aVar.c(this);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0071  */
    @Override // J3.j.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final j.b onLoadError(b bVar, long j11, long j12, IOException iOException, int i11) {
        long j13;
        j.b g10;
        N3.H h11;
        boolean c11;
        b bVar2 = bVar;
        p3.x xVar = bVar2.f8485c;
        long unused = bVar2.f8483a;
        p3.i iVar = bVar2.f8493k;
        xVar.getClass();
        C3013s c3013s = new C3013s(iVar, xVar.k(), j12);
        long unused2 = bVar2.f8492j;
        int i12 = m3.N.f74289a;
        int i13 = m3.N.f74289a;
        this.f8459d.getClass();
        if (!(iOException instanceof j3.v) && !(iOException instanceof FileNotFoundException) && !(iOException instanceof p3.o) && !(iOException instanceof j.g)) {
            int i14 = C8847g.f80059b;
            for (Throwable th2 = iOException; th2 != null; th2 = th2.getCause()) {
                if (!(th2 instanceof C8847g) || ((C8847g) th2).f80060a != 2008) {
                }
            }
            j13 = Math.min((i11 - 1) * 1000, 5000);
            if (j13 != -9223372036854775807L) {
                g10 = J3.j.f13800f;
            } else {
                int r11 = r();
                boolean z11 = r11 > this.f8453N;
                if (this.f8449J || !((h11 = this.f8441B) == null || h11.getDurationUs() == -9223372036854775807L)) {
                    this.f8453N = r11;
                } else if (!this.f8479x || G()) {
                    this.f8446G = this.f8479x;
                    this.f8450K = 0L;
                    this.f8453N = 0;
                    for (T t2 : this.f8476u) {
                        t2.H(false);
                    }
                    b.e(bVar2, 0L, 0L);
                } else {
                    this.f8452M = true;
                    g10 = J3.j.f13799e;
                }
                g10 = J3.j.g(j13, z11);
            }
            j.b bVar3 = g10;
            c11 = bVar3.c();
            this.f8460e.f(c3013s, 1, -1, null, 0, null, bVar2.f8492j, this.f8442C, iOException, !c11);
            if (!c11) {
                long unused3 = bVar2.f8483a;
            }
            return bVar3;
        }
        j13 = -9223372036854775807L;
        if (j13 != -9223372036854775807L) {
        }
        j.b bVar32 = g10;
        c11 = bVar32.c();
        this.f8460e.f(c3013s, 1, -1, null, 0, null, bVar2.f8492j, this.f8442C, iOException, !c11);
        if (!c11) {
        }
        return bVar32;
    }

    @Override // J3.j.a
    public final void onLoadStarted(b bVar, long j11, long j12, int i11) {
        C3013s c3013s;
        b bVar2 = bVar;
        p3.x xVar = bVar2.f8485c;
        if (i11 == 0) {
            long unused = bVar2.f8483a;
            c3013s = new C3013s(bVar2.f8493k);
        } else {
            long unused2 = bVar2.f8483a;
            p3.i iVar = bVar2.f8493k;
            xVar.getClass();
            c3013s = new C3013s(iVar, xVar.k(), j12);
        }
        this.f8460e.g(c3013s, 1, -1, null, 0, null, bVar2.f8492j, this.f8442C, i11);
    }

    @Override // J3.j.e
    public final void onLoaderReleased() {
        for (T t2 : this.f8476u) {
            t2.G();
        }
        ((C2998c) this.f8469n).e();
    }

    @Override // F3.T.c
    public final void onUpstreamFormatChanged(C7272n c7272n) {
        this.f8473r.post(this.f8471p);
    }

    @Override // F3.InterfaceC3017w
    public final void prepare(InterfaceC3017w.a aVar, long j11) {
        this.f8474s = aVar;
        C7272n c7272n = this.f8466k;
        if (c7272n == null) {
            this.f8470o.g();
            F();
        } else {
            track(0, 3).a(c7272n);
            D(new N3.E(-9223372036854775807L, new long[]{0}, new long[]{0}));
            endTracks();
            this.f8451L = j11;
        }
    }

    @Override // F3.InterfaceC3017w
    public final long readDiscontinuity() {
        if (this.f8447H) {
            this.f8447H = false;
            return this.f8450K;
        }
        if (!this.f8446G) {
            return -9223372036854775807L;
        }
        if (!this.f8454O && r() <= this.f8453N) {
            return -9223372036854775807L;
        }
        this.f8446G = false;
        return this.f8450K;
    }

    @Override // F3.V
    public final void reevaluateBuffer(long j11) {
    }

    @Override // N3.r
    public final void seekMap(final N3.H h11) {
        this.f8473r.post(new Runnable() { // from class: F3.N
            @Override // java.lang.Runnable
            public final void run() {
                O.this.D(h11);
            }
        });
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0070, code lost:
    
        if (r3 != false) goto L49;
     */
    @Override // F3.InterfaceC3017w
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final long seekToUs(long j11) {
        q();
        boolean[] zArr = this.f8440A.f8502b;
        if (!this.f8441B.isSeekable()) {
            j11 = 0;
        }
        this.f8446G = false;
        boolean z11 = true;
        boolean z12 = this.f8450K == j11;
        this.f8450K = j11;
        if (u()) {
            this.f8451L = j11;
            return j11;
        }
        int i11 = this.f8444E;
        J3.j jVar = this.f8468m;
        if (i11 != 7 && (this.f8454O || jVar.i())) {
            int length = this.f8476u.length;
            for (int i12 = 0; i12 < length; i12++) {
                T t2 = this.f8476u[i12];
                if (t2.s() != 0 || !z12) {
                    if (!(this.f8481z ? t2.I(t2.o()) : t2.J(j11, this.f8454O)) && (zArr[i12] || !this.f8480y)) {
                        z11 = false;
                        break;
                    }
                }
            }
        }
        this.f8452M = false;
        this.f8451L = j11;
        this.f8454O = false;
        this.f8447H = false;
        if (jVar.i()) {
            for (T t11 : this.f8476u) {
                t11.j();
            }
            jVar.e();
            return j11;
        }
        jVar.f();
        for (T t12 : this.f8476u) {
            t12.H(false);
        }
        return j11;
    }

    @Override // F3.InterfaceC3017w
    public final long selectTracks(I3.y[] yVarArr, boolean[] zArr, U[] uArr, boolean[] zArr2, long j11) {
        I3.y yVar;
        q();
        e eVar = this.f8440A;
        d0 d0Var = eVar.f8501a;
        boolean[] zArr3 = eVar.f8503c;
        int i11 = this.f8448I;
        int i12 = 0;
        for (int i13 = 0; i13 < yVarArr.length; i13++) {
            U u11 = uArr[i13];
            if (u11 != null && (yVarArr[i13] == null || !zArr[i13])) {
                int i14 = ((c) u11).f8497a;
                G10.a.h(zArr3[i14]);
                this.f8448I--;
                zArr3[i14] = false;
                uArr[i13] = null;
            }
        }
        boolean z11 = !this.f8445F ? j11 == 0 || this.f8481z : i11 != 0;
        for (int i15 = 0; i15 < yVarArr.length; i15++) {
            if (uArr[i15] == null && (yVar = yVarArr[i15]) != null) {
                G10.a.h(yVar.length() == 1);
                G10.a.h(yVar.c(0) == 0);
                int c11 = d0Var.c(yVar.g());
                G10.a.h(!zArr3[c11]);
                this.f8448I++;
                zArr3[c11] = true;
                this.f8447H = yVar.j().f69133u | this.f8447H;
                uArr[i15] = new c(c11);
                zArr2[i15] = true;
                if (!z11) {
                    T t2 = this.f8476u[c11];
                    z11 = (t2.s() == 0 || t2.J(j11, true)) ? false : true;
                }
            }
        }
        if (this.f8448I == 0) {
            this.f8452M = false;
            this.f8446G = false;
            this.f8447H = false;
            J3.j jVar = this.f8468m;
            if (jVar.i()) {
                T[] tArr = this.f8476u;
                int length = tArr.length;
                while (i12 < length) {
                    tArr[i12].j();
                    i12++;
                }
                jVar.e();
            } else {
                this.f8454O = false;
                for (T t11 : this.f8476u) {
                    t11.H(false);
                }
            }
        } else if (z11) {
            j11 = seekToUs(j11);
            while (i12 < uArr.length) {
                if (uArr[i12] != null) {
                    zArr2[i12] = true;
                }
                i12++;
            }
        }
        this.f8445F = true;
        return j11;
    }

    final N3.M t() {
        return A(new d(0, true));
    }

    @Override // N3.r
    public final N3.M track(int i11, int i12) {
        return A(new d(i11, false));
    }

    final boolean v(int i11) {
        return !G() && this.f8476u[i11].z(this.f8454O);
    }

    final void z(int i11) throws IOException {
        this.f8476u[i11].B();
        this.f8468m.j(this.f8459d.b(this.f8444E));
    }
}
