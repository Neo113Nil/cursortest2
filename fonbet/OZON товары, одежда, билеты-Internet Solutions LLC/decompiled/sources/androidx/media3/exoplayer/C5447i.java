package androidx.media3.exoplayer;

import m3.C8053F;
import t3.InterfaceC9731C;

/* renamed from: androidx.media3.exoplayer.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C5447i implements InterfaceC9731C {

    /* renamed from: a, reason: collision with root package name */
    private final t3.J f44061a;

    /* renamed from: b, reason: collision with root package name */
    private final a f44062b;

    /* renamed from: c, reason: collision with root package name */
    private j0 f44063c;

    /* renamed from: d, reason: collision with root package name */
    private InterfaceC9731C f44064d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f44065e = true;

    /* renamed from: f, reason: collision with root package name */
    private boolean f44066f;

    /* renamed from: androidx.media3.exoplayer.i$a */
    public interface a {
    }

    public C5447i(a aVar, C8053F c8053f) {
        this.f44062b = aVar;
        this.f44061a = new t3.J(c8053f);
    }

    public final void a(j0 j0Var) {
        if (j0Var == this.f44063c) {
            this.f44064d = null;
            this.f44063c = null;
            this.f44065e = true;
        }
    }

    @Override // t3.InterfaceC9731C
    public final void b(j3.x xVar) {
        InterfaceC9731C interfaceC9731C = this.f44064d;
        if (interfaceC9731C != null) {
            interfaceC9731C.b(xVar);
            xVar = this.f44064d.d();
        }
        this.f44061a.b(xVar);
    }

    public final void c(j0 j0Var) throws C5449k {
        InterfaceC9731C interfaceC9731C;
        InterfaceC9731C q11 = j0Var.q();
        if (q11 == null || q11 == (interfaceC9731C = this.f44064d)) {
            return;
        }
        if (interfaceC9731C != null) {
            throw C5449k.f(new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.f44064d = q11;
        this.f44063c = j0Var;
        ((v3.J) q11).b(this.f44061a.d());
    }

    @Override // t3.InterfaceC9731C
    public final j3.x d() {
        InterfaceC9731C interfaceC9731C = this.f44064d;
        return interfaceC9731C != null ? interfaceC9731C.d() : this.f44061a.d();
    }

    public final void e(long j11) {
        this.f44061a.a(j11);
    }

    public final void f() {
        this.f44066f = true;
        this.f44061a.c();
    }

    public final void g() {
        this.f44066f = false;
        this.f44061a.e();
    }

    public final long h(boolean z11) {
        j0 j0Var = this.f44063c;
        t3.J j11 = this.f44061a;
        if (j0Var == null || j0Var.a() || ((z11 && this.f44063c.getState() != 2) || (!this.f44063c.isReady() && (z11 || this.f44063c.f())))) {
            this.f44065e = true;
            if (this.f44066f) {
                j11.c();
            }
        } else {
            InterfaceC9731C interfaceC9731C = this.f44064d;
            interfaceC9731C.getClass();
            long z12 = interfaceC9731C.z();
            if (this.f44065e) {
                if (z12 < j11.z()) {
                    j11.e();
                } else {
                    this.f44065e = false;
                    if (this.f44066f) {
                        j11.c();
                    }
                }
            }
            j11.a(z12);
            j3.x d11 = interfaceC9731C.d();
            if (!d11.equals(j11.d())) {
                j11.b(d11);
                ((K) this.f44062b).T(d11);
            }
        }
        return z();
    }

    @Override // t3.InterfaceC9731C
    public final boolean i() {
        if (this.f44065e) {
            this.f44061a.getClass();
            return false;
        }
        InterfaceC9731C interfaceC9731C = this.f44064d;
        interfaceC9731C.getClass();
        return interfaceC9731C.i();
    }

    @Override // t3.InterfaceC9731C
    public final long z() {
        if (this.f44065e) {
            return this.f44061a.z();
        }
        InterfaceC9731C interfaceC9731C = this.f44064d;
        interfaceC9731C.getClass();
        return interfaceC9731C.z();
    }
}
