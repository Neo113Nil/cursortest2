package b1;

import java.util.concurrent.CancellationException;

/* renamed from: b1.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0034w extends h1.h {

    /* renamed from: c, reason: collision with root package name */
    public int f692c;

    public AbstractC0034w(int i2) {
        super(0L, h1.k.f1253g);
        this.f692c = i2;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract M0.d d();

    public Throwable e(Object obj) {
        C0023k c0023k = obj instanceof C0023k ? (C0023k) obj : null;
        if (c0023k != null) {
            return c0023k.f668a;
        }
        return null;
    }

    public final void h(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            V.a.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.j.b(th);
        AbstractC0030s.c(d().getContext(), new T0.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = K0.i.f206a;
        h1.i iVar = this.f1244b;
        try {
            M0.d d2 = d();
            kotlin.jvm.internal.j.c(d2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            g1.h hVar = (g1.h) d2;
            O0.b bVar = hVar.f1151e;
            Object obj2 = hVar.f1153g;
            M0.i iVar2 = bVar.f277b;
            kotlin.jvm.internal.j.b(iVar2);
            Object m2 = g1.a.m(iVar2, obj2);
            if (m2 != g1.a.f1141f) {
                AbstractC0030s.i(bVar, iVar2);
            }
            try {
                M0.i iVar3 = bVar.f277b;
                kotlin.jvm.internal.j.b(iVar3);
                Object i2 = i();
                Throwable e2 = e(i2);
                J j2 = (e2 == null && AbstractC0030s.e(this.f692c)) ? (J) iVar3.i(C0029q.f679b) : null;
                if (j2 != null && !j2.b()) {
                    CancellationException u2 = ((S) j2).u();
                    b(i2, u2);
                    bVar.f(V.a.k(u2));
                } else if (e2 != null) {
                    bVar.f(V.a.k(e2));
                } else {
                    bVar.f(g(i2));
                }
                g1.a.h(iVar2, m2);
                try {
                    iVar.getClass();
                } catch (Throwable th) {
                    obj = V.a.k(th);
                }
                h(null, K0.f.a(obj));
            } catch (Throwable th2) {
                g1.a.h(iVar2, m2);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                iVar.getClass();
            } catch (Throwable th4) {
                obj = V.a.k(th4);
            }
            h(th3, K0.f.a(obj));
        }
    }

    public Object g(Object obj) {
        return obj;
    }
}
