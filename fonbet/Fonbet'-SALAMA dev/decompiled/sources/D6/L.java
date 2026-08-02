package D6;

import a.AbstractC0603a;
import f6.C1113f;
import f6.C1116i;
import i6.InterfaceC1287d;
import i6.InterfaceC1292i;
import java.util.concurrent.CancellationException;
import k6.AbstractC1356c;

/* loaded from: classes2.dex */
public abstract class L extends K6.h {

    /* renamed from: c, reason: collision with root package name */
    public int f1795c;

    public L(int i7) {
        super(0L, K6.j.f4172g);
        this.f1795c = i7;
    }

    public abstract void c(Object obj, CancellationException cancellationException);

    public abstract InterfaceC1287d e();

    public Throwable g(Object obj) {
        C0138v c0138v = obj instanceof C0138v ? (C0138v) obj : null;
        if (c0138v != null) {
            return c0138v.f1882a;
        }
        return null;
    }

    public final void i(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            Q0.a.c(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        t6.h.b(th);
        E.k(e().getContext(), new D("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object j();

    @Override // java.lang.Runnable
    public final void run() {
        Object obj = C1116i.f13008a;
        d1.n nVar = this.f4164b;
        try {
            InterfaceC1287d e7 = e();
            t6.h.c(e7, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            I6.h hVar = (I6.h) e7;
            AbstractC1356c abstractC1356c = hVar.f3731e;
            Object obj2 = hVar.f3733x;
            InterfaceC1292i context = abstractC1356c.getContext();
            Object m7 = I6.a.m(context, obj2);
            G0 w7 = m7 != I6.a.f3721f ? E.w(abstractC1356c, context, m7) : null;
            try {
                InterfaceC1292i context2 = abstractC1356c.getContext();
                Object j = j();
                Throwable g3 = g(j);
                InterfaceC0118e0 interfaceC0118e0 = (g3 == null && E.m(this.f1795c)) ? (InterfaceC0118e0) context2.get(B.f1775b) : null;
                if (interfaceC0118e0 != null && !interfaceC0118e0.isActive()) {
                    CancellationException cancellationException = interfaceC0118e0.getCancellationException();
                    c(j, cancellationException);
                    abstractC1356c.resumeWith(AbstractC0603a.h(cancellationException));
                } else if (g3 != null) {
                    abstractC1356c.resumeWith(AbstractC0603a.h(g3));
                } else {
                    abstractC1356c.resumeWith(h(j));
                }
                if (w7 == null || w7.R()) {
                    I6.a.g(context, m7);
                }
                try {
                    nVar.getClass();
                } catch (Throwable th) {
                    obj = AbstractC0603a.h(th);
                }
                i(null, C1113f.a(obj));
            } catch (Throwable th2) {
                if (w7 == null || w7.R()) {
                    I6.a.g(context, m7);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                nVar.getClass();
            } catch (Throwable th4) {
                obj = AbstractC0603a.h(th4);
            }
            i(th3, C1113f.a(obj));
        }
    }

    public Object h(Object obj) {
        return obj;
    }
}
