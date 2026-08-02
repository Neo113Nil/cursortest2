package c;

import A0.AbstractC0015c;
import G1.C0145p;
import a1.C0455b;

/* renamed from: c.A, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0514A extends I1.d {

    /* renamed from: d, reason: collision with root package name */
    public final C0145p f7299d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7300e;

    public C0514A(C0145p c0145p, C0515B c0515b) {
        kotlin.jvm.internal.l.f("onBackPressedCallback", c0145p);
        boolean z3 = c0145p.f1926b;
        this.f2570a = c0515b;
        this.f2571b = z3;
        this.f7299d = c0145p;
        this.f7300e = true;
    }

    @Override // I1.d
    public final void a() {
        C0145p c0145p = this.f7299d;
        switch (c0145p.f1928d) {
            case 2:
                ((AbstractC0015c) c0145p.f1929e).g();
                break;
        }
    }

    @Override // I1.d
    public final void b() {
        C0145p c0145p = this.f7299d;
        switch (c0145p.f1928d) {
            case 0:
                ((G1.E) c0145p.f1929e).m();
                return;
            case 1:
                ((C0455b) c0145p.f1929e).c(c0145p);
                return;
            case 2:
                ((AbstractC0015c) c0145p.f1929e).h();
                return;
            default:
                ((T2.r) c0145p.f1929e).i();
                throw null;
        }
    }

    @Override // I1.d
    public final void c(I1.b bVar) {
        C0522a c0522a = new C0522a(bVar);
        C0145p c0145p = this.f7299d;
        switch (c0145p.f1928d) {
            case 2:
                ((AbstractC0015c) c0145p.f1929e).i(c0522a);
                break;
        }
    }

    @Override // I1.d
    public final void d(I1.b bVar) {
        kotlin.jvm.internal.l.f("event", bVar);
        new C0522a(bVar);
        C0145p c0145p = this.f7299d;
        switch (c0145p.f1928d) {
            case 2:
                ((AbstractC0015c) c0145p.f1929e).j();
                break;
        }
    }

    public final void g(boolean z3) {
        this.f7300e = z3;
        f(z3 && this.f7299d.f1926b);
    }
}
