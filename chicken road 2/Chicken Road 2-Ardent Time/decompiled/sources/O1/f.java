package O1;

/* loaded from: classes.dex */
public final class f implements V1.u {

    /* renamed from: a, reason: collision with root package name */
    public final V1.k f1180a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1181b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M1.o f1182c;

    public f(M1.o this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        this.f1182c = this$0;
        this.f1180a = new V1.k(((V1.p) this$0.f1099e).f1781a.d());
    }

    @Override // V1.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f1181b) {
            return;
        }
        this.f1181b = true;
        M1.o oVar = this.f1182c;
        oVar.getClass();
        V1.k kVar = this.f1180a;
        V1.y yVar = kVar.f1769e;
        kVar.f1769e = V1.y.f1800d;
        yVar.a();
        yVar.b();
        oVar.f1095a = 3;
    }

    @Override // V1.u
    public final V1.y d() {
        return this.f1180a;
    }

    @Override // V1.u
    public final void e(V1.g gVar, long j2) {
        if (this.f1181b) {
            throw new java.lang.IllegalStateException("closed");
        }
        J1.b.c(gVar.f1764b, 0L, j2);
        ((V1.p) this.f1182c.f1099e).e(gVar, j2);
    }

    @Override // V1.u, java.io.Flushable
    public final void flush() {
        if (this.f1181b) {
            return;
        }
        ((V1.p) this.f1182c.f1099e).flush();
    }
}
