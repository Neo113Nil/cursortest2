package F3;

import N3.M;
import j3.C7270l;
import j3.C7272n;
import j3.InterfaceC7268j;
import java.io.IOException;
import java.util.Objects;
import m3.C8050C;
import t3.C9730B;
import w3.g;
import w3.i;
import w3.j;

/* loaded from: classes.dex */
public class T implements N3.M {

    /* renamed from: A, reason: collision with root package name */
    private C7272n f8535A;

    /* renamed from: B, reason: collision with root package name */
    private C7272n f8536B;

    /* renamed from: C, reason: collision with root package name */
    private long f8537C;

    /* renamed from: E, reason: collision with root package name */
    private boolean f8539E;

    /* renamed from: F, reason: collision with root package name */
    private long f8540F;

    /* renamed from: G, reason: collision with root package name */
    private boolean f8541G;

    /* renamed from: a, reason: collision with root package name */
    private final Q f8542a;

    /* renamed from: d, reason: collision with root package name */
    private final w3.j f8545d;

    /* renamed from: e, reason: collision with root package name */
    private final i.a f8546e;

    /* renamed from: f, reason: collision with root package name */
    private Object f8547f;

    /* renamed from: g, reason: collision with root package name */
    private C7272n f8548g;

    /* renamed from: h, reason: collision with root package name */
    private w3.g f8549h;

    /* renamed from: p, reason: collision with root package name */
    private int f8557p;

    /* renamed from: q, reason: collision with root package name */
    private int f8558q;

    /* renamed from: r, reason: collision with root package name */
    private int f8559r;

    /* renamed from: s, reason: collision with root package name */
    private int f8560s;

    /* renamed from: w, reason: collision with root package name */
    private boolean f8564w;

    /* renamed from: z, reason: collision with root package name */
    private boolean f8567z;

    /* renamed from: b, reason: collision with root package name */
    private final a f8543b = new a();

    /* renamed from: i, reason: collision with root package name */
    private int f8550i = 1000;

    /* renamed from: j, reason: collision with root package name */
    private long[] f8551j = new long[1000];

    /* renamed from: k, reason: collision with root package name */
    private long[] f8552k = new long[1000];

    /* renamed from: n, reason: collision with root package name */
    private long[] f8555n = new long[1000];

    /* renamed from: m, reason: collision with root package name */
    private int[] f8554m = new int[1000];

    /* renamed from: l, reason: collision with root package name */
    private int[] f8553l = new int[1000];

    /* renamed from: o, reason: collision with root package name */
    private M.a[] f8556o = new M.a[1000];

    /* renamed from: c, reason: collision with root package name */
    private final a0<b> f8544c = new a0<>(new S());

    /* renamed from: t, reason: collision with root package name */
    private long f8561t = Long.MIN_VALUE;

    /* renamed from: u, reason: collision with root package name */
    private long f8562u = Long.MIN_VALUE;

    /* renamed from: v, reason: collision with root package name */
    private long f8563v = Long.MIN_VALUE;

    /* renamed from: y, reason: collision with root package name */
    private boolean f8566y = true;

    /* renamed from: x, reason: collision with root package name */
    private boolean f8565x = true;

    /* renamed from: D, reason: collision with root package name */
    private boolean f8538D = true;

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        public int f8568a;

        /* renamed from: b, reason: collision with root package name */
        public long f8569b;

        /* renamed from: c, reason: collision with root package name */
        public M.a f8570c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final C7272n f8571a;

        /* renamed from: b, reason: collision with root package name */
        public final j.b f8572b;

        b(C7272n c7272n, j.b bVar) {
            this.f8571a = c7272n;
            this.f8572b = bVar;
        }
    }

    public interface c {
        void onUpstreamFormatChanged(C7272n c7272n);
    }

    protected T(J3.b bVar, w3.j jVar, i.a aVar) {
        this.f8545d = jVar;
        this.f8546e = aVar;
        this.f8542a = new Q(bVar);
    }

    private boolean A(int i11) {
        w3.g gVar = this.f8549h;
        if (gVar == null || gVar.getState() == 4) {
            return true;
        }
        return (this.f8554m[i11] & 1073741824) == 0 && this.f8549h.b();
    }

    private void C(C7272n c7272n, C9730B c9730b) {
        C7272n c7272n2 = this.f8548g;
        boolean z11 = c7272n2 == null;
        C7270l c7270l = c7272n2 == null ? null : c7272n2.f69131s;
        this.f8548g = c7272n;
        C7270l c7270l2 = c7272n.f69131s;
        w3.j jVar = this.f8545d;
        c9730b.f98980b = jVar != null ? c7272n.b(jVar.b(c7272n)) : c7272n;
        c9730b.f98979a = this.f8549h;
        if (jVar == null) {
            return;
        }
        if (z11 || !Objects.equals(c7270l, c7270l2)) {
            w3.g gVar = this.f8549h;
            i.a aVar = this.f8546e;
            w3.g a11 = jVar.a(aVar, c7272n);
            this.f8549h = a11;
            c9730b.f98979a = a11;
            if (gVar != null) {
                gVar.a(aVar);
            }
        }
    }

    public static T g(J3.b bVar, w3.j jVar, i.a aVar) {
        jVar.getClass();
        aVar.getClass();
        return new T(bVar, jVar, aVar);
    }

    private long h(int i11) {
        this.f8562u = Math.max(this.f8562u, r(i11));
        this.f8557p -= i11;
        int i12 = this.f8558q + i11;
        this.f8558q = i12;
        int i13 = this.f8559r + i11;
        this.f8559r = i13;
        int i14 = this.f8550i;
        if (i13 >= i14) {
            this.f8559r = i13 - i14;
        }
        int i15 = this.f8560s - i11;
        this.f8560s = i15;
        if (i15 < 0) {
            this.f8560s = 0;
        }
        this.f8544c.d(i12);
        if (this.f8557p != 0) {
            return this.f8552k[this.f8559r];
        }
        int i16 = this.f8559r;
        if (i16 == 0) {
            i16 = this.f8550i;
        }
        return this.f8552k[i16 - 1] + this.f8553l[r6];
    }

    private long k(int i11) {
        int w11 = w() - i11;
        boolean z11 = false;
        G10.a.c(w11 >= 0 && w11 <= this.f8557p - this.f8560s);
        int i12 = this.f8557p - w11;
        this.f8557p = i12;
        this.f8563v = Math.max(this.f8562u, r(i12));
        if (w11 == 0 && this.f8564w) {
            z11 = true;
        }
        this.f8564w = z11;
        this.f8544c.c(i11);
        int i13 = this.f8557p;
        if (i13 == 0) {
            return 0L;
        }
        return this.f8552k[t(i13 - 1)] + this.f8553l[r9];
    }

    private int m(int i11, int i12, long j11, boolean z11) {
        int i13 = -1;
        for (int i14 = 0; i14 < i12; i14++) {
            long j12 = this.f8555n[i11];
            if (j12 > j11) {
                break;
            }
            if (!z11 || (this.f8554m[i11] & 1) != 0) {
                if (j12 == j11) {
                    return i14;
                }
                i13 = i14;
            }
            i11++;
            if (i11 == this.f8550i) {
                i11 = 0;
            }
        }
        return i13;
    }

    private long r(int i11) {
        long j11 = Long.MIN_VALUE;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int t2 = t(i11 - 1);
        for (int i12 = 0; i12 < i11; i12++) {
            j11 = Math.max(j11, this.f8555n[t2]);
            if ((this.f8554m[t2] & 1) != 0) {
                return j11;
            }
            t2--;
            if (t2 == -1) {
                t2 = this.f8550i - 1;
            }
        }
        return j11;
    }

    private int t(int i11) {
        int i12 = this.f8559r + i11;
        int i13 = this.f8550i;
        return i12 < i13 ? i12 : i12 - i13;
    }

    public final void B() throws IOException {
        w3.g gVar = this.f8549h;
        if (gVar == null || gVar.getState() != 1) {
            return;
        }
        g.a error = this.f8549h.getError();
        error.getClass();
        throw error;
    }

    public final synchronized long D() {
        try {
        } catch (Throwable th2) {
            throw th2;
        }
        return this.f8560s != this.f8557p ? this.f8551j[t(this.f8560s)] : this.f8537C;
    }

    public final void E() {
        j();
        w3.g gVar = this.f8549h;
        if (gVar != null) {
            gVar.a(this.f8546e);
            this.f8549h = null;
            this.f8548g = null;
        }
    }

    public final int F(C9730B c9730b, s3.f fVar, int i11, boolean z11) {
        int i12;
        boolean z12 = (i11 & 2) != 0;
        a aVar = this.f8543b;
        synchronized (this) {
            try {
                fVar.f98185e = false;
                i12 = -3;
                if (this.f8560s != this.f8557p) {
                    C7272n c7272n = this.f8544c.e(s()).f8571a;
                    if (!z12 && c7272n == this.f8548g) {
                        int t2 = t(this.f8560s);
                        if (A(t2)) {
                            fVar.m(this.f8554m[t2]);
                            if (this.f8560s == this.f8557p - 1 && (z11 || this.f8564w)) {
                                fVar.e(536870912);
                            }
                            fVar.f98186f = this.f8555n[t2];
                            aVar.f8568a = this.f8553l[t2];
                            aVar.f8569b = this.f8552k[t2];
                            aVar.f8570c = this.f8556o[t2];
                            i12 = -4;
                        } else {
                            fVar.f98185e = true;
                        }
                    }
                    C(c7272n, c9730b);
                    i12 = -5;
                } else {
                    if (!z11 && !this.f8564w) {
                        C7272n c7272n2 = this.f8536B;
                        if (c7272n2 == null || (!z12 && c7272n2 == this.f8548g)) {
                        }
                        C(c7272n2, c9730b);
                        i12 = -5;
                    }
                    fVar.m(4);
                    fVar.f98186f = Long.MIN_VALUE;
                    i12 = -4;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (i12 == -4 && !fVar.i()) {
            boolean z13 = (i11 & 1) != 0;
            if ((i11 & 4) == 0) {
                if (z13) {
                    this.f8542a.d(fVar, this.f8543b);
                } else {
                    this.f8542a.i(fVar, this.f8543b);
                }
            }
            if (!z13) {
                this.f8560s++;
            }
        }
        return i12;
    }

    public final void G() {
        H(true);
        w3.g gVar = this.f8549h;
        if (gVar != null) {
            gVar.a(this.f8546e);
            this.f8549h = null;
            this.f8548g = null;
        }
    }

    public final void H(boolean z11) {
        this.f8542a.j();
        this.f8557p = 0;
        this.f8558q = 0;
        this.f8559r = 0;
        this.f8560s = 0;
        this.f8565x = true;
        this.f8561t = Long.MIN_VALUE;
        this.f8562u = Long.MIN_VALUE;
        this.f8563v = Long.MIN_VALUE;
        this.f8564w = false;
        this.f8544c.b();
        if (z11) {
            this.f8535A = null;
            this.f8536B = null;
            this.f8566y = true;
            this.f8538D = true;
        }
    }

    public final synchronized boolean I(int i11) {
        synchronized (this) {
            this.f8560s = 0;
            this.f8542a.k();
        }
        int i12 = this.f8558q;
        if (i11 >= i12 && i11 <= this.f8557p + i12) {
            this.f8561t = Long.MIN_VALUE;
            this.f8560s = i11 - i12;
            return true;
        }
        return false;
    }

    /* JADX WARN: Finally extract failed */
    public final synchronized boolean J(long j11, boolean z11) {
        Throwable th2;
        T t2;
        long j12;
        int m11;
        try {
            synchronized (this) {
                try {
                    try {
                        this.f8560s = 0;
                        this.f8542a.k();
                        int t11 = t(this.f8560s);
                        int i11 = this.f8560s;
                        int i12 = this.f8557p;
                        if (!(i11 != i12) || j11 < this.f8555n[t11] || (j11 > this.f8563v && !z11)) {
                            return false;
                        }
                        if (this.f8538D) {
                            int i13 = i12 - i11;
                            int i14 = 0;
                            while (true) {
                                if (i14 < i13) {
                                    try {
                                        if (this.f8555n[t11] >= j11) {
                                            i13 = i14;
                                            break;
                                        }
                                        t11++;
                                        if (t11 == this.f8550i) {
                                            t11 = 0;
                                        }
                                        i14++;
                                    } catch (Throwable th3) {
                                        th2 = th3;
                                        throw th2;
                                    }
                                } else if (!z11) {
                                    i13 = -1;
                                }
                            }
                            j12 = j11;
                            m11 = i13;
                            t2 = this;
                        } else {
                            int i15 = i12 - i11;
                            t2 = this;
                            j12 = j11;
                            m11 = t2.m(t11, i15, j12, true);
                        }
                        if (m11 == -1) {
                            return false;
                        }
                        t2.f8561t = j12;
                        t2.f8560s += m11;
                        return true;
                    } catch (Throwable th4) {
                        th = th4;
                        while (true) {
                            try {
                                throw th;
                            } catch (Throwable th5) {
                                th = th5;
                            }
                        }
                    }
                } catch (Throwable th6) {
                    th = th6;
                    th2 = th;
                    throw th2;
                }
            }
        } catch (Throwable th7) {
            th = th7;
        }
    }

    public final void K(long j11) {
        if (this.f8540F != j11) {
            this.f8540F = j11;
            this.f8567z = true;
        }
    }

    public final void L(long j11) {
        this.f8561t = j11;
    }

    public final void M(c cVar) {
        this.f8547f = cVar;
    }

    public final synchronized void N(int i11) {
        boolean z11;
        if (i11 >= 0) {
            try {
                if (this.f8560s + i11 <= this.f8557p) {
                    z11 = true;
                    G10.a.c(z11);
                    this.f8560s += i11;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        z11 = false;
        G10.a.c(z11);
        this.f8560s += i11;
    }

    public final void O(long j11) {
        this.f8537C = j11;
    }

    public final void P() {
        this.f8541G = true;
    }

    /* JADX WARN: Type inference failed for: r5v17, types: [F3.T$c, java.lang.Object] */
    @Override // N3.M
    public final void a(C7272n c7272n) {
        C7272n n11 = n(c7272n);
        boolean z11 = false;
        this.f8567z = false;
        this.f8535A = c7272n;
        synchronized (this) {
            try {
                this.f8566y = false;
                if (!Objects.equals(n11, this.f8536B)) {
                    if (this.f8544c.g() || !this.f8544c.f().f8571a.equals(n11)) {
                        this.f8536B = n11;
                    } else {
                        this.f8536B = this.f8544c.f().f8571a;
                    }
                    boolean z12 = this.f8538D;
                    C7272n c7272n2 = this.f8536B;
                    this.f8538D = z12 & j3.u.a(c7272n2.f69127o, c7272n2.f69123k);
                    this.f8539E = false;
                    z11 = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        ?? r52 = this.f8547f;
        if (r52 == 0 || !z11) {
            return;
        }
        r52.onUpstreamFormatChanged(n11);
    }

    @Override // N3.M
    public void b(long j11, int i11, int i12, int i13, M.a aVar) {
        boolean z11;
        if (this.f8567z) {
            C7272n c7272n = this.f8535A;
            G10.a.i(c7272n);
            a(c7272n);
        }
        int i14 = i11 & 1;
        boolean z12 = i14 != 0;
        if (this.f8565x) {
            if (!z12) {
                return;
            } else {
                this.f8565x = false;
            }
        }
        long j12 = j11 + this.f8540F;
        if (this.f8538D) {
            if (j12 < this.f8561t) {
                return;
            }
            if (i14 == 0) {
                if (!this.f8539E) {
                    m3.s.f("SampleQueue", "Overriding unexpected non-sync sample for format: " + this.f8536B);
                    this.f8539E = true;
                }
                i11 |= 1;
            }
        }
        if (this.f8541G) {
            if (!z12) {
                return;
            }
            synchronized (this) {
                if (this.f8557p == 0) {
                    z11 = j12 > this.f8562u;
                } else if (q() >= j12) {
                    z11 = false;
                } else {
                    int i15 = this.f8557p;
                    int t2 = t(i15 - 1);
                    while (i15 > this.f8560s && this.f8555n[t2] >= j12) {
                        i15--;
                        t2--;
                        if (t2 == -1) {
                            t2 = this.f8550i - 1;
                        }
                    }
                    k(this.f8558q + i15);
                    z11 = true;
                }
            }
            if (!z11) {
                return;
            } else {
                this.f8541G = false;
            }
        }
        long c11 = (this.f8542a.c() - i12) - i13;
        synchronized (this) {
            try {
                int i16 = this.f8557p;
                if (i16 > 0) {
                    int t11 = t(i16 - 1);
                    G10.a.c(this.f8552k[t11] + ((long) this.f8553l[t11]) <= c11);
                }
                this.f8564w = (536870912 & i11) != 0;
                this.f8563v = Math.max(this.f8563v, j12);
                int t12 = t(this.f8557p);
                this.f8555n[t12] = j12;
                this.f8552k[t12] = c11;
                this.f8553l[t12] = i12;
                this.f8554m[t12] = i11;
                this.f8556o[t12] = aVar;
                this.f8551j[t12] = this.f8537C;
                if (this.f8544c.g() || !this.f8544c.f().f8571a.equals(this.f8536B)) {
                    C7272n c7272n2 = this.f8536B;
                    c7272n2.getClass();
                    w3.j jVar = this.f8545d;
                    this.f8544c.a(w(), new b(c7272n2, jVar != null ? jVar.d(this.f8546e, c7272n2) : j.b.f103482m0));
                }
                int i17 = this.f8557p + 1;
                this.f8557p = i17;
                int i18 = this.f8550i;
                if (i17 == i18) {
                    int i19 = i18 + 1000;
                    long[] jArr = new long[i19];
                    long[] jArr2 = new long[i19];
                    long[] jArr3 = new long[i19];
                    int[] iArr = new int[i19];
                    int[] iArr2 = new int[i19];
                    M.a[] aVarArr = new M.a[i19];
                    int i21 = this.f8559r;
                    int i22 = i18 - i21;
                    System.arraycopy(this.f8552k, i21, jArr2, 0, i22);
                    System.arraycopy(this.f8555n, this.f8559r, jArr3, 0, i22);
                    System.arraycopy(this.f8554m, this.f8559r, iArr, 0, i22);
                    System.arraycopy(this.f8553l, this.f8559r, iArr2, 0, i22);
                    System.arraycopy(this.f8556o, this.f8559r, aVarArr, 0, i22);
                    System.arraycopy(this.f8551j, this.f8559r, jArr, 0, i22);
                    int i23 = this.f8559r;
                    System.arraycopy(this.f8552k, 0, jArr2, i22, i23);
                    System.arraycopy(this.f8555n, 0, jArr3, i22, i23);
                    System.arraycopy(this.f8554m, 0, iArr, i22, i23);
                    System.arraycopy(this.f8553l, 0, iArr2, i22, i23);
                    System.arraycopy(this.f8556o, 0, aVarArr, i22, i23);
                    System.arraycopy(this.f8551j, 0, jArr, i22, i23);
                    this.f8552k = jArr2;
                    this.f8555n = jArr3;
                    this.f8554m = iArr;
                    this.f8553l = iArr2;
                    this.f8556o = aVarArr;
                    this.f8551j = jArr;
                    this.f8559r = 0;
                    this.f8550i = i19;
                }
            } finally {
            }
        }
    }

    @Override // N3.M
    public final int c(InterfaceC7268j interfaceC7268j, int i11, boolean z11) throws IOException {
        return this.f8542a.l(interfaceC7268j, i11, z11);
    }

    @Override // N3.M
    public final void f(C8050C c8050c, int i11, int i12) {
        this.f8542a.m(i11, c8050c);
    }

    public final void i(long j11, boolean z11, boolean z12) {
        Throwable th2;
        Q q11 = this.f8542a;
        synchronized (this) {
            try {
                try {
                    int i11 = this.f8557p;
                    long j12 = -1;
                    if (i11 != 0) {
                        long[] jArr = this.f8555n;
                        int i12 = this.f8559r;
                        if (j11 >= jArr[i12]) {
                            if (z12) {
                                try {
                                    int i13 = this.f8560s;
                                    if (i13 != i11) {
                                        i11 = i13 + 1;
                                    }
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    throw th2;
                                }
                            }
                            int m11 = m(i12, i11, j11, z11);
                            if (m11 != -1) {
                                j12 = h(m11);
                            }
                            q11.a(j12);
                        }
                    }
                    q11.a(j12);
                } catch (Throwable th4) {
                    th = th4;
                    th2 = th;
                    throw th2;
                }
            } catch (Throwable th5) {
                th = th5;
                th2 = th;
                throw th2;
            }
        }
    }

    public final void j() {
        long h11;
        Q q11 = this.f8542a;
        synchronized (this) {
            int i11 = this.f8557p;
            h11 = i11 == 0 ? -1L : h(i11);
        }
        q11.a(h11);
    }

    public final void l(int i11) {
        this.f8542a.b(k(i11));
    }

    protected C7272n n(C7272n c7272n) {
        if (this.f8540F == 0 || c7272n.f69132t == Long.MAX_VALUE) {
            return c7272n;
        }
        C7272n.a a11 = c7272n.a();
        a11.C0(c7272n.f69132t + this.f8540F);
        return a11.P();
    }

    public final int o() {
        return this.f8558q;
    }

    public final synchronized long p() {
        return this.f8563v;
    }

    public final synchronized long q() {
        return Math.max(this.f8562u, r(this.f8560s));
    }

    public final int s() {
        return this.f8558q + this.f8560s;
    }

    public final synchronized int u(long j11, boolean z11) {
        try {
            try {
                int t2 = t(this.f8560s);
                int i11 = this.f8560s;
                int i12 = this.f8557p;
                if (!(i11 != i12) || j11 < this.f8555n[t2]) {
                    return 0;
                }
                if (j11 > this.f8563v && z11) {
                    return i12 - i11;
                }
                int m11 = m(t2, i12 - i11, j11, true);
                if (m11 == -1) {
                    return 0;
                }
                return m11;
            } catch (Throwable th2) {
                th = th2;
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            throw th;
        }
    }

    public final synchronized C7272n v() {
        return this.f8566y ? null : this.f8536B;
    }

    public final int w() {
        return this.f8558q + this.f8557p;
    }

    protected final void x() {
        this.f8567z = true;
    }

    public final synchronized boolean y() {
        return this.f8564w;
    }

    public final synchronized boolean z(boolean z11) {
        C7272n c7272n;
        boolean z12 = false;
        if (this.f8560s != this.f8557p) {
            if (this.f8544c.e(s()).f8571a != this.f8548g) {
                return true;
            }
            return A(t(this.f8560s));
        }
        if (z11 || this.f8564w || ((c7272n = this.f8536B) != null && c7272n != this.f8548g)) {
            z12 = true;
        }
        return z12;
    }
}
