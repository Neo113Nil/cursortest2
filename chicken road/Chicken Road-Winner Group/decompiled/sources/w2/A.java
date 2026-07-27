package w2;

import d2.AbstractC0276f;
import d2.C0279i;
import g2.InterfaceC0319c;
import i2.AbstractC0343b;
import java.util.concurrent.CancellationException;

/* loaded from: classes.dex */
public abstract class A extends D2.h {

    /* renamed from: c, reason: collision with root package name */
    public int f10461c;

    public A(int i3) {
        super(0L, D2.k.f324g);
        this.f10461c = i3;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract InterfaceC0319c d();

    public Throwable g(Object obj) {
        C1235n c1235n = obj instanceof C1235n ? (C1235n) obj : null;
        if (c1235n != null) {
            return c1235n.f10517a;
        }
        return null;
    }

    public final void i(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            F2.b.d(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        kotlin.jvm.internal.j.b(th);
        AbstractC1242v.e(d().getContext(), new n2.a("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r7 = (w2.P) r7.k(w2.C1240t.f10525b);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj = C0279i.f4852a;
        D2.i iVar = this.f316b;
        try {
            InterfaceC0319c d3 = d();
            kotlin.jvm.internal.j.c(d3, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            B2.h hVar = (B2.h) d3;
            AbstractC0343b abstractC0343b = hVar.f160e;
            Object obj2 = hVar.f161g;
            g2.h context = abstractC0343b.getContext();
            Object l3 = B2.a.l(context, obj2);
            j0 m3 = l3 != B2.a.f ? AbstractC1242v.m(abstractC0343b, context, l3) : null;
            try {
                g2.h context2 = abstractC0343b.getContext();
                Object j3 = j();
                Throwable g3 = g(j3);
                if (g3 == null) {
                    int i3 = this.f10461c;
                    boolean z3 = true;
                    if (i3 != 1 && i3 != 2) {
                        z3 = false;
                    }
                }
                P p3 = null;
                if (p3 != null && !p3.a()) {
                    CancellationException y = ((Z) p3).y();
                    b(j3, y);
                    abstractC0343b.e(X0.a.n(y));
                } else if (g3 != null) {
                    abstractC0343b.e(X0.a.n(g3));
                } else {
                    abstractC0343b.e(h(j3));
                }
                if (m3 == null || m3.V()) {
                    B2.a.f(context, l3);
                }
                try {
                    iVar.getClass();
                } catch (Throwable th) {
                    obj = X0.a.n(th);
                }
                i(null, AbstractC0276f.a(obj));
            } catch (Throwable th2) {
                if (m3 == null || m3.V()) {
                    B2.a.f(context, l3);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                iVar.getClass();
            } catch (Throwable th4) {
                obj = X0.a.n(th4);
            }
            i(th3, AbstractC0276f.a(obj));
        }
    }

    public Object h(Object obj) {
        return obj;
    }
}
