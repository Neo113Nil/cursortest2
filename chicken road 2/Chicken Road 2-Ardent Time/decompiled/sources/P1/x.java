package P1;

/* loaded from: classes.dex */
public final class x implements V1.w {

    /* renamed from: a, reason: collision with root package name */
    public final long f1558a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1559b;

    /* renamed from: c, reason: collision with root package name */
    public final V1.g f1560c;

    /* renamed from: d, reason: collision with root package name */
    public final V1.g f1561d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ P1.z f1563f;

    public x(P1.z this$0, long j2, boolean z2) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        this.f1563f = this$0;
        this.f1558a = j2;
        this.f1559b = z2;
        this.f1560c = new V1.g();
        this.f1561d = new V1.g();
    }

    public final void a(long j2) {
        byte[] bArr = J1.b.f932a;
        this.f1563f.f1566b.l(j2);
    }

    @Override // V1.w
    public final long c(V1.g sink, long j2) {
        java.lang.Throwable th;
        boolean z2;
        long j3;
        kotlin.jvm.internal.i.e(sink, "sink");
        do {
            P1.z zVar = this.f1563f;
            synchronized (zVar) {
                zVar.f1575k.h();
                try {
                    if (zVar.f() == null || this.f1559b) {
                        th = null;
                    } else {
                        th = zVar.f1578n;
                        if (th == null) {
                            P1.EnumC0054b f2 = zVar.f();
                            kotlin.jvm.internal.i.b(f2);
                            th = new P1.F(f2);
                        }
                    }
                    if (this.f1562e) {
                        throw new java.io.IOException("stream closed");
                    }
                    V1.g gVar = this.f1561d;
                    long j4 = gVar.f1764b;
                    z2 = false;
                    if (j4 > 0) {
                        j3 = gVar.c(sink, java.lang.Math.min(8192L, j4));
                        long j5 = zVar.f1567c + j3;
                        zVar.f1567c = j5;
                        long j6 = j5 - zVar.f1568d;
                        if (th == null && j6 >= zVar.f1566b.f1527p.a() / 2) {
                            zVar.f1566b.o(zVar.f1565a, j6);
                            zVar.f1568d = zVar.f1567c;
                        }
                    } else {
                        if (!this.f1559b && th == null) {
                            zVar.l();
                            z2 = true;
                        }
                        j3 = -1;
                    }
                    zVar.f1575k.k();
                } finally {
                }
            }
        } while (z2);
        if (j3 != -1) {
            a(j3);
            return j3;
        }
        if (th == null) {
            return -1L;
        }
        throw th;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        long j2;
        P1.z zVar = this.f1563f;
        synchronized (zVar) {
            this.f1562e = true;
            V1.g gVar = this.f1561d;
            j2 = gVar.f1764b;
            gVar.o(j2);
            zVar.notifyAll();
        }
        if (j2 > 0) {
            a(j2);
        }
        this.f1563f.a();
    }

    @Override // V1.w
    public final V1.y d() {
        return this.f1563f.f1575k;
    }
}
