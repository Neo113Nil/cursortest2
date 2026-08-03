package P1;

/* loaded from: classes.dex */
public final class u implements V1.w {

    /* renamed from: a, reason: collision with root package name */
    public final V1.q f1544a;

    /* renamed from: b, reason: collision with root package name */
    public int f1545b;

    /* renamed from: c, reason: collision with root package name */
    public int f1546c;

    /* renamed from: d, reason: collision with root package name */
    public int f1547d;

    /* renamed from: e, reason: collision with root package name */
    public int f1548e;

    /* renamed from: f, reason: collision with root package name */
    public int f1549f;

    public u(V1.q source) {
        kotlin.jvm.internal.i.e(source, "source");
        this.f1544a = source;
    }

    @Override // V1.w
    public final long c(V1.g sink, long j2) {
        int i2;
        int l2;
        kotlin.jvm.internal.i.e(sink, "sink");
        do {
            int i3 = this.f1548e;
            V1.q qVar = this.f1544a;
            if (i3 != 0) {
                long c2 = qVar.c(sink, java.lang.Math.min(8192L, i3));
                if (c2 == -1) {
                    return -1L;
                }
                this.f1548e -= (int) c2;
                return c2;
            }
            qVar.r(this.f1549f);
            this.f1549f = 0;
            if ((this.f1546c & 4) != 0) {
                return -1L;
            }
            i2 = this.f1547d;
            int s2 = J1.b.s(qVar);
            this.f1548e = s2;
            this.f1545b = s2;
            int g2 = qVar.g() & 255;
            this.f1546c = qVar.g() & 255;
            java.util.logging.Logger logger = P1.v.f1550d;
            if (logger.isLoggable(java.util.logging.Level.FINE)) {
                V1.j jVar = P1.g.f1479a;
                logger.fine(P1.g.a(true, this.f1547d, this.f1545b, g2, this.f1546c));
            }
            l2 = qVar.l() & Integer.MAX_VALUE;
            this.f1547d = l2;
            if (g2 != 9) {
                throw new java.io.IOException(g2 + " != TYPE_CONTINUATION");
            }
        } while (l2 == i2);
        throw new java.io.IOException("TYPE_CONTINUATION streamId changed");
    }

    @Override // V1.w
    public final V1.y d() {
        return this.f1544a.f1784a.d();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }
}
