package z1;

/* loaded from: classes.dex */
public abstract class A extends G1.h {

    /* renamed from: c, reason: collision with root package name */
    public int f8520c;

    public A(int i2) {
        super(0L, G1.k.f592g);
        this.f8520c = i2;
    }

    public abstract void b(java.lang.Object obj, java.util.concurrent.CancellationException cancellationException);

    public abstract k1.d e();

    public java.lang.Throwable g(java.lang.Object obj) {
        z1.C1061n c1061n = obj instanceof z1.C1061n ? (z1.C1061n) obj : null;
        if (c1061n != null) {
            return c1061n.f8581a;
        }
        return null;
    }

    public final void i(java.lang.Throwable th, java.lang.Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            Q1.d.b(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.i.b(th);
        z1.AbstractC1068v.d(new r1.C0988a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th), e().getContext());
    }

    public abstract java.lang.Object j();

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Object obj = h1.C0177i.f3302a;
        G1.i iVar = this.f583b;
        try {
            k1.d e2 = e();
            kotlin.jvm.internal.i.c(e2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            E1.h hVar = (E1.h) e2;
            m1.AbstractC0931b abstractC0931b = hVar.f276e;
            java.lang.Object obj2 = hVar.f278g;
            k1.i context = abstractC0931b.getContext();
            java.lang.Object m2 = E1.AbstractC0000a.m(context, obj2);
            z1.j0 m3 = m2 != E1.AbstractC0000a.f266f ? z1.AbstractC1068v.m(abstractC0931b, context, m2) : null;
            try {
                k1.i context2 = abstractC0931b.getContext();
                java.lang.Object j2 = j();
                java.lang.Throwable g2 = g(j2);
                z1.P p2 = (g2 == null && z1.AbstractC1068v.f(this.f8520c)) ? (z1.P) context2.m(z1.C1066t.f8592b) : null;
                if (p2 != null && !p2.b()) {
                    java.util.concurrent.CancellationException z2 = ((z1.Z) p2).z();
                    b(j2, z2);
                    abstractC0931b.l(a.AbstractC0059a.i(z2));
                } else if (g2 != null) {
                    abstractC0931b.l(a.AbstractC0059a.i(g2));
                } else {
                    abstractC0931b.l(h(j2));
                }
                if (m3 == null || m3.W()) {
                    E1.AbstractC0000a.g(context, m2);
                }
                try {
                    iVar.getClass();
                } catch (java.lang.Throwable th) {
                    obj = a.AbstractC0059a.i(th);
                }
                i(null, h1.AbstractC0174f.a(obj));
            } catch (java.lang.Throwable th2) {
                if (m3 == null || m3.W()) {
                    E1.AbstractC0000a.g(context, m2);
                }
                throw th2;
            }
        } catch (java.lang.Throwable th3) {
            try {
                iVar.getClass();
            } catch (java.lang.Throwable th4) {
                obj = a.AbstractC0059a.i(th4);
            }
            i(th3, h1.AbstractC0174f.a(obj));
        }
    }

    public java.lang.Object h(java.lang.Object obj) {
        return obj;
    }
}
