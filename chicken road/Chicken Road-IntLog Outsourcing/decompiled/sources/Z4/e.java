package Z4;

import j5.j;
import j5.p;
import j5.u;
import j5.y;

/* loaded from: classes.dex */
public final class e implements u {

    /* renamed from: a, reason: collision with root package name */
    public final j f3804a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f3805b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ g f3806c;

    public e(g gVar) {
        this.f3806c = gVar;
        this.f3804a = new j(((p) gVar.f3811c.f313d).f10515a.d());
    }

    @Override // j5.u
    public final void B(j5.f fVar, long j2) {
        if (this.f3805b) {
            throw new IllegalStateException("closed");
        }
        U4.c.a(fVar.f10495b, 0L, j2);
        ((p) this.f3806c.f3811c.f313d).B(fVar, j2);
    }

    @Override // j5.u, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f3805b) {
            return;
        }
        this.f3805b = true;
        g gVar = this.f3806c;
        gVar.getClass();
        j jVar = this.f3804a;
        y yVar = jVar.f10500e;
        jVar.f10500e = y.f10533d;
        yVar.a();
        yVar.b();
        gVar.f3812d = 3;
    }

    @Override // j5.u
    public final y d() {
        return this.f3804a;
    }

    @Override // j5.u, java.io.Flushable
    public final void flush() {
        if (this.f3805b) {
            return;
        }
        ((p) this.f3806c.f3811c.f313d).flush();
    }
}
