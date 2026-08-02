package W5;

import U5.AbstractC0442i;
import U5.C0443j;
import U5.C0451s;
import U5.C0452t;
import U5.InterfaceC0444k;

/* renamed from: W5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0484a {

    /* renamed from: a, reason: collision with root package name */
    public C0489b1 f7105a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f7106b = new Object();

    /* renamed from: c, reason: collision with root package name */
    public final h2 f7107c;

    /* renamed from: d, reason: collision with root package name */
    public final C0489b1 f7108d;

    /* renamed from: e, reason: collision with root package name */
    public int f7109e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f7110f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f7111g;

    /* renamed from: h, reason: collision with root package name */
    public final d2 f7112h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f7113i;
    public InterfaceC0546v j;

    /* renamed from: k, reason: collision with root package name */
    public C0452t f7114k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f7115l;

    /* renamed from: m, reason: collision with root package name */
    public A2.c f7116m;

    /* renamed from: n, reason: collision with root package name */
    public volatile boolean f7117n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f7118o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f7119p;

    public AbstractC0484a(int i7, d2 d2Var, h2 h2Var) {
        p3.f.k(h2Var, "transportTracer");
        this.f7107c = h2Var;
        C0489b1 c0489b1 = new C0489b1(this, i7, d2Var, h2Var);
        this.f7108d = c0489b1;
        this.f7105a = c0489b1;
        this.f7114k = C0452t.f6588d;
        this.f7115l = false;
        this.f7112h = d2Var;
    }

    public abstract void a(int i7);

    public final void b(U5.l0 l0Var, EnumC0543u enumC0543u, U5.b0 b0Var) {
        if (this.f7113i) {
            return;
        }
        this.f7113i = true;
        d2 d2Var = this.f7112h;
        if (d2Var.f7183b.compareAndSet(false, true)) {
            for (AbstractC0442i abstractC0442i : d2Var.f7182a) {
                abstractC0442i.m(l0Var);
            }
        }
        if (this.f7107c != null) {
            l0Var.e();
        }
        this.j.F(l0Var, enumC0543u, b0Var);
    }

    public abstract void c(boolean z4);

    public final void d(U5.b0 b0Var) {
        p3.f.q("Received headers on closed stream", !this.f7118o);
        for (AbstractC0442i abstractC0442i : this.f7112h.f7182a) {
            abstractC0442i.b();
        }
        C0443j c0443j = C0443j.f6510b;
        String str = (String) b0Var.c(AbstractC0494d0.f7166d);
        if (str != null) {
            C0451s c0451s = (C0451s) this.f7114k.f6589a.get(str);
            InterfaceC0444k interfaceC0444k = c0451s != null ? c0451s.f6585a : null;
            if (interfaceC0444k == null) {
                ((X5.i) this).m(new U5.n0(U5.l0.f6543m.g("Can't find decompressor for ".concat(str))));
                return;
            } else if (interfaceC0444k != c0443j) {
                C0489b1 c0489b1 = this.f7105a;
                c0489b1.getClass();
                p3.f.q("Already set full stream decompressor", true);
                c0489b1.f7143e = interfaceC0444k;
            }
        }
        this.j.d(b0Var);
    }

    public final boolean e() {
        boolean z4;
        synchronized (this.f7106b) {
            try {
                z4 = this.f7110f && this.f7109e < 32768 && !this.f7111g;
            } finally {
            }
        }
        return z4;
    }

    public final void f(U5.l0 l0Var, EnumC0543u enumC0543u, boolean z4, U5.b0 b0Var) {
        p3.f.k(l0Var, "status");
        if (!this.f7118o || z4) {
            this.f7118o = true;
            this.f7119p = l0Var.e();
            synchronized (this.f7106b) {
                this.f7111g = true;
            }
            if (this.f7115l) {
                this.f7116m = null;
                b(l0Var, enumC0543u, b0Var);
                return;
            }
            this.f7116m = new A2.c(this, l0Var, enumC0543u, b0Var, 8, false);
            if (z4) {
                this.f7105a.close();
                return;
            }
            C0489b1 c0489b1 = this.f7105a;
            if (c0489b1.b()) {
                return;
            }
            if (c0489b1.f7132C.f7416c == 0) {
                c0489b1.close();
            } else {
                c0489b1.f7137H = true;
            }
        }
    }

    public final void g(U5.l0 l0Var, boolean z4, U5.b0 b0Var) {
        f(l0Var, EnumC0543u.f7372a, z4, b0Var);
    }
}
