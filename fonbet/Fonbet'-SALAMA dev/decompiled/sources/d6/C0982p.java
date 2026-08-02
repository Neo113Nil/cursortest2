package d6;

import U5.AbstractC0442i;
import U5.C0435b;
import U5.b0;
import U5.l0;
import a.AbstractC0603a;
import java.util.concurrent.atomic.AtomicLong;

/* renamed from: d6.p, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0982p extends AbstractC0442i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0442i f12461b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C0984r f12462c;

    public C0982p(C0984r c0984r, AbstractC0442i abstractC0442i) {
        this.f12462c = c0984r;
        this.f12461b = abstractC0442i;
    }

    @Override // U5.AbstractC0442i
    public final void a() {
        this.f12461b.a();
    }

    @Override // U5.AbstractC0442i
    public final void b() {
        this.f12461b.b();
    }

    @Override // U5.AbstractC0442i
    public final void c(int i7) {
        this.f12461b.c(i7);
    }

    @Override // U5.AbstractC0442i
    public final void d(int i7, long j) {
        this.f12461b.d(i7, j);
    }

    @Override // U5.AbstractC0442i
    public final void e(b0 b0Var) {
        this.f12461b.e(b0Var);
    }

    @Override // U5.AbstractC0442i
    public final void f(long j) {
        this.f12461b.f(j);
    }

    @Override // U5.AbstractC0442i
    public final void g(long j) {
        this.f12461b.g(j);
    }

    @Override // U5.AbstractC0442i
    public final void h() {
        this.f12461b.h();
    }

    @Override // U5.AbstractC0442i
    public final void i(int i7) {
        this.f12461b.i(i7);
    }

    @Override // U5.AbstractC0442i
    public final void j(int i7, long j, long j3) {
        this.f12461b.j(i7, j, j3);
    }

    @Override // U5.AbstractC0442i
    public final void k(long j) {
        this.f12461b.k(j);
    }

    @Override // U5.AbstractC0442i
    public final void l(long j) {
        this.f12461b.l(j);
    }

    @Override // U5.AbstractC0442i
    public final void m(l0 l0Var) {
        C0978l c0978l = this.f12462c.f12464a;
        boolean e7 = l0Var.e();
        C0981o c0981o = c0978l.f12443a;
        if (c0981o.f12458e != null || c0981o.f12459f != null) {
            if (e7) {
                ((AtomicLong) c0978l.f12444b.f12441b).getAndIncrement();
            } else {
                ((AtomicLong) c0978l.f12444b.f12442c).getAndIncrement();
            }
        }
        this.f12461b.m(l0Var);
    }

    @Override // U5.AbstractC0442i
    public final void n(C0435b c0435b, b0 b0Var) {
        this.f12461b.n(c0435b, b0Var);
    }

    public final String toString() {
        D3.j u02 = AbstractC0603a.u0(this);
        u02.a(this.f12461b, "delegate");
        return u02.toString();
    }
}
