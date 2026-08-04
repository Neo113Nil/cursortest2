package p028d6;

import D3.j;
import U5.AbstractC0442i;
import U5.C0435b;
import U5.b0;
import U5.l0;
import java.util.concurrent.atomic.AtomicLong;
import p003a.a;

/* JADX INFO: loaded from: classes2.dex */
public final class p extends AbstractC0442i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ AbstractC0442i f12467b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final /* synthetic */ r f12468c;

    public p(r rVar, AbstractC0442i abstractC0442i) {
        this.f12468c = rVar;
        this.f12467b = abstractC0442i;
    }

    @Override // U5.AbstractC0442i
    public final void a() {
        this.f12467b.a();
    }

    @Override // U5.AbstractC0442i
    public final void b() {
        this.f12467b.b();
    }

    @Override // U5.AbstractC0442i
    public final void c(int i7) {
        this.f12467b.c(i7);
    }

    @Override // U5.AbstractC0442i
    public final void d(int i7, long j) {
        this.f12467b.d(i7, j);
    }

    @Override // U5.AbstractC0442i
    public final void e(b0 b0Var) {
        this.f12467b.e(b0Var);
    }

    @Override // U5.AbstractC0442i
    public final void f(long j) {
        this.f12467b.f(j);
    }

    @Override // U5.AbstractC0442i
    public final void g(long j) {
        this.f12467b.g(j);
    }

    @Override // U5.AbstractC0442i
    public final void h() {
        this.f12467b.h();
    }

    @Override // U5.AbstractC0442i
    public final void i(int i7) {
        this.f12467b.i(i7);
    }

    @Override // U5.AbstractC0442i
    public final void j(int i7, long j, long j3) {
        this.f12467b.j(i7, j, j3);
    }

    @Override // U5.AbstractC0442i
    public final void k(long j) {
        this.f12467b.k(j);
    }

    @Override // U5.AbstractC0442i
    public final void l(long j) {
        this.f12467b.l(j);
    }

    @Override // U5.AbstractC0442i
    public final void m(l0 l0Var) {
        l lVar = this.f12468c.f12470a;
        boolean zE = l0Var.e();
        o oVar = lVar.f12449a;
        if (oVar.f12464e != null || oVar.f12465f != null) {
            if (zE) {
                ((AtomicLong) lVar.f12450b.f12447b).getAndIncrement();
            } else {
                ((AtomicLong) lVar.f12450b.f12448c).getAndIncrement();
            }
        }
        this.f12467b.m(l0Var);
    }

    @Override // U5.AbstractC0442i
    public final void n(C0435b c0435b, b0 b0Var) {
        this.f12467b.n(c0435b, b0Var);
    }

    public final String toString() {
        j jVarU0 = a.u0(this);
        jVarU0.a(this.f12467b, "delegate");
        return jVarU0.toString();
    }
}
