package P1;

/* loaded from: classes.dex */
public final class w implements V1.u {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f1554a;

    /* renamed from: b, reason: collision with root package name */
    public final V1.g f1555b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f1556c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ P1.z f1557d;

    public w(P1.z this$0, boolean z2) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        this.f1557d = this$0;
        this.f1554a = z2;
        this.f1555b = new V1.g();
    }

    public final void a(boolean z2) {
        long min;
        boolean z3;
        P1.z zVar = this.f1557d;
        synchronized (zVar) {
            zVar.f1576l.h();
            while (zVar.f1569e >= zVar.f1570f && !this.f1554a && !this.f1556c && zVar.f() == null) {
                try {
                    zVar.l();
                } finally {
                    zVar.f1576l.k();
                }
            }
            zVar.f1576l.k();
            zVar.b();
            min = java.lang.Math.min(zVar.f1570f - zVar.f1569e, this.f1555b.f1764b);
            zVar.f1569e += min;
            z3 = z2 && min == this.f1555b.f1764b;
        }
        this.f1557d.f1576l.h();
        try {
            P1.z zVar2 = this.f1557d;
            zVar2.f1566b.m(zVar2.f1565a, z3, this.f1555b, min);
        } finally {
            zVar = this.f1557d;
        }
    }

    @Override // V1.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        P1.z zVar = this.f1557d;
        byte[] bArr = J1.b.f932a;
        synchronized (zVar) {
            if (this.f1556c) {
                return;
            }
            boolean z2 = zVar.f() == null;
            P1.z zVar2 = this.f1557d;
            if (!zVar2.f1574j.f1554a) {
                if (this.f1555b.f1764b > 0) {
                    while (this.f1555b.f1764b > 0) {
                        a(true);
                    }
                } else if (z2) {
                    zVar2.f1566b.m(zVar2.f1565a, true, null, 0L);
                }
            }
            synchronized (this.f1557d) {
                this.f1556c = true;
            }
            this.f1557d.f1566b.flush();
            this.f1557d.a();
        }
    }

    @Override // V1.u
    public final V1.y d() {
        return this.f1557d.f1576l;
    }

    @Override // V1.u
    public final void e(V1.g gVar, long j2) {
        byte[] bArr = J1.b.f932a;
        V1.g gVar2 = this.f1555b;
        gVar2.e(gVar, j2);
        while (gVar2.f1764b >= 16384) {
            a(false);
        }
    }

    @Override // V1.u, java.io.Flushable
    public final void flush() {
        P1.z zVar = this.f1557d;
        byte[] bArr = J1.b.f932a;
        synchronized (zVar) {
            zVar.b();
        }
        while (this.f1555b.f1764b > 0) {
            a(false);
            this.f1557d.f1566b.flush();
        }
    }
}
