package P1;

/* loaded from: classes.dex */
public final class r implements java.io.Closeable {

    /* renamed from: z, reason: collision with root package name */
    public static final P1.E f1511z;

    /* renamed from: a, reason: collision with root package name */
    public final P1.j f1512a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.LinkedHashMap f1513b = new java.util.LinkedHashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f1514c;

    /* renamed from: d, reason: collision with root package name */
    public int f1515d;

    /* renamed from: e, reason: collision with root package name */
    public int f1516e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1517f;

    /* renamed from: g, reason: collision with root package name */
    public final L1.d f1518g;

    /* renamed from: h, reason: collision with root package name */
    public final L1.c f1519h;

    /* renamed from: i, reason: collision with root package name */
    public final L1.c f1520i;

    /* renamed from: j, reason: collision with root package name */
    public final L1.c f1521j;

    /* renamed from: k, reason: collision with root package name */
    public final P1.D f1522k;

    /* renamed from: l, reason: collision with root package name */
    public long f1523l;

    /* renamed from: m, reason: collision with root package name */
    public long f1524m;

    /* renamed from: n, reason: collision with root package name */
    public long f1525n;

    /* renamed from: o, reason: collision with root package name */
    public long f1526o;

    /* renamed from: p, reason: collision with root package name */
    public final P1.E f1527p;

    /* renamed from: q, reason: collision with root package name */
    public P1.E f1528q;

    /* renamed from: r, reason: collision with root package name */
    public long f1529r;

    /* renamed from: s, reason: collision with root package name */
    public long f1530s;
    public long t;

    /* renamed from: u, reason: collision with root package name */
    public long f1531u;

    /* renamed from: v, reason: collision with root package name */
    public final java.net.Socket f1532v;

    /* renamed from: w, reason: collision with root package name */
    public final P1.A f1533w;

    /* renamed from: x, reason: collision with root package name */
    public final P1.m f1534x;

    /* renamed from: y, reason: collision with root package name */
    public final java.util.LinkedHashSet f1535y;

    static {
        P1.E e2 = new P1.E();
        e2.c(7, 65535);
        e2.c(5, 16384);
        f1511z = e2;
    }

    public r(P1.h hVar) {
        this.f1512a = (P1.j) hVar.f1488f;
        java.lang.String str = (java.lang.String) hVar.f1485c;
        if (str == null) {
            kotlin.jvm.internal.i.i("connectionName");
            throw null;
        }
        this.f1514c = str;
        this.f1516e = 3;
        L1.d dVar = (L1.d) hVar.f1483a;
        this.f1518g = dVar;
        this.f1519h = dVar.e();
        this.f1520i = dVar.e();
        this.f1521j = dVar.e();
        this.f1522k = P1.D.f1440a;
        P1.E e2 = new P1.E();
        e2.c(7, 16777216);
        this.f1527p = e2;
        this.f1528q = f1511z;
        this.f1531u = r0.a();
        java.net.Socket socket = (java.net.Socket) hVar.f1484b;
        if (socket == null) {
            kotlin.jvm.internal.i.i("socket");
            throw null;
        }
        this.f1532v = socket;
        V1.p pVar = (V1.p) hVar.f1487e;
        if (pVar == null) {
            kotlin.jvm.internal.i.i("sink");
            throw null;
        }
        this.f1533w = new P1.A(pVar);
        V1.q qVar = (V1.q) hVar.f1486d;
        if (qVar == null) {
            kotlin.jvm.internal.i.i(io.appmetrica.analytics.modulesapi.internal.client.adrevenue.AdRevenueConstants.SOURCE_KEY);
            throw null;
        }
        this.f1534x = new P1.m(this, new P1.v(qVar));
        this.f1535y = new java.util.LinkedHashSet();
    }

    public final void a(P1.EnumC0054b enumC0054b, P1.EnumC0054b enumC0054b2, java.io.IOException iOException) {
        int i2;
        java.lang.Object[] objArr;
        byte[] bArr = J1.b.f932a;
        try {
            k(enumC0054b);
        } catch (java.io.IOException unused) {
        }
        synchronized (this) {
            if (this.f1513b.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.f1513b.values().toArray(new P1.z[0]);
                if (objArr == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
                }
                this.f1513b.clear();
            }
        }
        P1.z[] zVarArr = (P1.z[]) objArr;
        if (zVarArr != null) {
            for (P1.z zVar : zVarArr) {
                try {
                    zVar.c(enumC0054b2, iOException);
                } catch (java.io.IOException unused2) {
                }
            }
        }
        try {
            this.f1533w.close();
        } catch (java.io.IOException unused3) {
        }
        try {
            this.f1532v.close();
        } catch (java.io.IOException unused4) {
        }
        this.f1519h.e();
        this.f1520i.e();
        this.f1521j.e();
    }

    public final void b(java.io.IOException iOException) {
        P1.EnumC0054b enumC0054b = P1.EnumC0054b.PROTOCOL_ERROR;
        a(enumC0054b, enumC0054b, iOException);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(P1.EnumC0054b.NO_ERROR, P1.EnumC0054b.CANCEL, null);
    }

    public final void flush() {
        this.f1533w.flush();
    }

    public final synchronized P1.z g(int i2) {
        return (P1.z) this.f1513b.get(java.lang.Integer.valueOf(i2));
    }

    public final synchronized P1.z j(int i2) {
        P1.z zVar;
        zVar = (P1.z) this.f1513b.remove(java.lang.Integer.valueOf(i2));
        notifyAll();
        return zVar;
    }

    public final void k(P1.EnumC0054b enumC0054b) {
        synchronized (this.f1533w) {
            synchronized (this) {
                if (this.f1517f) {
                    return;
                }
                this.f1517f = true;
                this.f1533w.j(this.f1515d, enumC0054b, J1.b.f932a);
            }
        }
    }

    public final synchronized void l(long j2) {
        long j3 = this.f1529r + j2;
        this.f1529r = j3;
        long j4 = j3 - this.f1530s;
        if (j4 >= this.f1527p.a() / 2) {
            o(0, j4);
            this.f1530s += j4;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0035, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.f1533w.f1431c);
        r6 = r2;
        r8.t += r6;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m(int i2, boolean z2, V1.g gVar, long j2) {
        int min;
        long j3;
        if (j2 == 0) {
            this.f1533w.b(z2, i2, gVar, 0);
            return;
        }
        while (j2 > 0) {
            synchronized (this) {
                while (true) {
                    try {
                        try {
                            long j4 = this.t;
                            long j5 = this.f1531u;
                            if (j4 < j5) {
                                break;
                            } else {
                                if (!this.f1513b.containsKey(java.lang.Integer.valueOf(i2))) {
                                    throw new java.io.IOException("stream closed");
                                }
                                wait();
                            }
                        } catch (java.lang.InterruptedException unused) {
                            java.lang.Thread.currentThread().interrupt();
                            throw new java.io.InterruptedIOException();
                        }
                    } catch (java.lang.Throwable th) {
                        throw th;
                    }
                }
            }
            j2 -= j3;
            this.f1533w.b(z2 && j2 == 0, i2, gVar, min);
        }
    }

    public final void n(int i2, P1.EnumC0054b enumC0054b) {
        this.f1519h.c(new P1.p(this.f1514c + '[' + i2 + "] writeSynReset", this, i2, enumC0054b), 0L);
    }

    public final void o(int i2, long j2) {
        this.f1519h.c(new P1.q(this.f1514c + '[' + i2 + "] windowUpdate", this, i2, j2), 0L);
    }
}
