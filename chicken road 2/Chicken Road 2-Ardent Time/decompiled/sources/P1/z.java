package P1;

/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final int f1565a;

    /* renamed from: b, reason: collision with root package name */
    public final P1.r f1566b;

    /* renamed from: c, reason: collision with root package name */
    public long f1567c;

    /* renamed from: d, reason: collision with root package name */
    public long f1568d;

    /* renamed from: e, reason: collision with root package name */
    public long f1569e;

    /* renamed from: f, reason: collision with root package name */
    public long f1570f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.ArrayDeque f1571g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f1572h;

    /* renamed from: i, reason: collision with root package name */
    public final P1.x f1573i;

    /* renamed from: j, reason: collision with root package name */
    public final P1.w f1574j;

    /* renamed from: k, reason: collision with root package name */
    public final P1.y f1575k;

    /* renamed from: l, reason: collision with root package name */
    public final P1.y f1576l;

    /* renamed from: m, reason: collision with root package name */
    public P1.EnumC0054b f1577m;

    /* renamed from: n, reason: collision with root package name */
    public java.io.IOException f1578n;

    public z(int i2, P1.r connection, boolean z2, boolean z3, I1.m mVar) {
        kotlin.jvm.internal.i.e(connection, "connection");
        this.f1565a = i2;
        this.f1566b = connection;
        this.f1570f = connection.f1528q.a();
        java.util.ArrayDeque arrayDeque = new java.util.ArrayDeque();
        this.f1571g = arrayDeque;
        this.f1573i = new P1.x(this, connection.f1527p.a(), z3);
        this.f1574j = new P1.w(this, z2);
        this.f1575k = new P1.y(this);
        this.f1576l = new P1.y(this);
        if (mVar == null) {
            if (!h()) {
                throw new java.lang.IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (h()) {
                throw new java.lang.IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(mVar);
        }
    }

    public final void a() {
        boolean z2;
        boolean i2;
        byte[] bArr = J1.b.f932a;
        synchronized (this) {
            P1.x xVar = this.f1573i;
            if (!xVar.f1559b && xVar.f1562e) {
                P1.w wVar = this.f1574j;
                if (wVar.f1554a || wVar.f1556c) {
                    z2 = true;
                    i2 = i();
                }
            }
            z2 = false;
            i2 = i();
        }
        if (z2) {
            c(P1.EnumC0054b.CANCEL, null);
        } else {
            if (i2) {
                return;
            }
            this.f1566b.j(this.f1565a);
        }
    }

    public final void b() {
        P1.w wVar = this.f1574j;
        if (wVar.f1556c) {
            throw new java.io.IOException("stream closed");
        }
        if (wVar.f1554a) {
            throw new java.io.IOException("stream finished");
        }
        if (this.f1577m != null) {
            java.io.IOException iOException = this.f1578n;
            if (iOException != null) {
                throw iOException;
            }
            P1.EnumC0054b enumC0054b = this.f1577m;
            kotlin.jvm.internal.i.b(enumC0054b);
            throw new P1.F(enumC0054b);
        }
    }

    public final void c(P1.EnumC0054b enumC0054b, java.io.IOException iOException) {
        if (d(enumC0054b, iOException)) {
            this.f1566b.f1533w.m(this.f1565a, enumC0054b);
        }
    }

    public final boolean d(P1.EnumC0054b enumC0054b, java.io.IOException iOException) {
        byte[] bArr = J1.b.f932a;
        synchronized (this) {
            if (f() != null) {
                return false;
            }
            if (this.f1573i.f1559b && this.f1574j.f1554a) {
                return false;
            }
            this.f1577m = enumC0054b;
            this.f1578n = iOException;
            notifyAll();
            this.f1566b.j(this.f1565a);
            return true;
        }
    }

    public final void e(P1.EnumC0054b enumC0054b) {
        if (d(enumC0054b, null)) {
            this.f1566b.n(this.f1565a, enumC0054b);
        }
    }

    public final synchronized P1.EnumC0054b f() {
        return this.f1577m;
    }

    public final P1.w g() {
        synchronized (this) {
            if (!this.f1572h && !h()) {
                throw new java.lang.IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f1574j;
    }

    public final boolean h() {
        boolean z2 = (this.f1565a & 1) == 1;
        this.f1566b.getClass();
        return true == z2;
    }

    public final synchronized boolean i() {
        if (this.f1577m != null) {
            return false;
        }
        P1.x xVar = this.f1573i;
        if (xVar.f1559b || xVar.f1562e) {
            P1.w wVar = this.f1574j;
            if (wVar.f1554a || wVar.f1556c) {
                if (this.f1572h) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021 A[Catch: all -> 0x0016, TryCatch #0 {all -> 0x0016, blocks: (B:4:0x0008, B:8:0x0010, B:10:0x0021, B:11:0x0025, B:19:0x0018), top: B:3:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(I1.m headers, boolean z2) {
        boolean i2;
        kotlin.jvm.internal.i.e(headers, "headers");
        byte[] bArr = J1.b.f932a;
        synchronized (this) {
            try {
                if (this.f1572h && z2) {
                    this.f1573i.getClass();
                    if (z2) {
                        this.f1573i.f1559b = true;
                    }
                    i2 = i();
                    notifyAll();
                }
                this.f1572h = true;
                this.f1571g.add(headers);
                if (z2) {
                }
                i2 = i();
                notifyAll();
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
        if (i2) {
            return;
        }
        this.f1566b.j(this.f1565a);
    }

    public final synchronized void k(P1.EnumC0054b enumC0054b) {
        if (this.f1577m == null) {
            this.f1577m = enumC0054b;
            notifyAll();
        }
    }

    public final void l() {
        try {
            wait();
        } catch (java.lang.InterruptedException unused) {
            java.lang.Thread.currentThread().interrupt();
            throw new java.io.InterruptedIOException();
        }
    }
}
