package O1;

/* loaded from: classes.dex */
public final class c implements V1.u {

    /* renamed from: a, reason: collision with root package name */
    public final V1.k f1171a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1172b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ M1.o f1173c;

    public c(M1.o this$0) {
        kotlin.jvm.internal.i.e(this$0, "this$0");
        this.f1173c = this$0;
        this.f1171a = new V1.k(((V1.p) this$0.f1099e).f1781a.d());
    }

    @Override // V1.u, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        if (this.f1172b) {
            return;
        }
        this.f1172b = true;
        ((V1.p) this.f1173c.f1099e).h("0\r\n\r\n");
        M1.o oVar = this.f1173c;
        V1.k kVar = this.f1171a;
        oVar.getClass();
        V1.y yVar = kVar.f1769e;
        kVar.f1769e = V1.y.f1800d;
        yVar.a();
        yVar.b();
        this.f1173c.f1095a = 3;
    }

    @Override // V1.u
    public final V1.y d() {
        return this.f1171a;
    }

    @Override // V1.u
    public final void e(V1.g gVar, long j2) {
        if (this.f1172b) {
            throw new java.lang.IllegalStateException("closed");
        }
        if (j2 == 0) {
            return;
        }
        M1.o oVar = this.f1173c;
        V1.p pVar = (V1.p) oVar.f1099e;
        if (pVar.f1783c) {
            throw new java.lang.IllegalStateException("closed");
        }
        pVar.f1782b.v(j2);
        pVar.a();
        V1.p pVar2 = (V1.p) oVar.f1099e;
        pVar2.h("\r\n");
        pVar2.e(gVar, j2);
        pVar2.h("\r\n");
    }

    @Override // V1.u, java.io.Flushable
    public final synchronized void flush() {
        if (this.f1172b) {
            return;
        }
        ((V1.p) this.f1173c.f1099e).flush();
    }
}
