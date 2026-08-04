package D6;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: classes2.dex */
public abstract class L extends K6.h {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f1795c;

    public L(int i7) {
        super(0L, K6.j.f4172g);
        this.f1795c = i7;
    }

    public abstract void c(Object obj, CancellationException cancellationException);

    public abstract p065i6.d e();

    public Throwable g(Object obj) {
        C0138v c0138v = obj instanceof C0138v ? (C0138v) obj : null;
        if (c0138v != null) {
            return c0138v.f1882a;
        }
        return null;
    }

    public final void i(Throwable th, Throwable th2) throws IllegalAccessException, InvocationTargetException {
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
    public final void run() throws IllegalAccessException, InvocationTargetException {
        Object objH = p044f6.i.f13014a;
        p023d1.n nVar = this.f4164b;
        try {
            p065i6.d dVarE = e();
            t6.h.c(dVarE, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            I6.h hVar = (I6.h) dVarE;
            p077k6.c cVar = hVar.f3731e;
            Object obj = hVar.f3733x;
            p065i6.i context = cVar.getContext();
            Object objM = I6.a.m(context, obj);
            G0 g0W = objM != I6.a.f3721f ? E.w(cVar, context, objM) : null;
            try {
                p065i6.i context2 = cVar.getContext();
                Object objJ = j();
                Throwable thG = g(objJ);
                InterfaceC0118e0 interfaceC0118e0 = (thG == null && E.m(this.f1795c)) ? (InterfaceC0118e0) context2.get(B.f1775b) : null;
                if (interfaceC0118e0 != null && !interfaceC0118e0.isActive()) {
                    CancellationException cancellationException = interfaceC0118e0.getCancellationException();
                    c(objJ, cancellationException);
                    cVar.resumeWith(p003a.a.h(cancellationException));
                } else if (thG != null) {
                    cVar.resumeWith(p003a.a.h(thG));
                } else {
                    cVar.resumeWith(h(objJ));
                }
                if (g0W == null || g0W.R()) {
                    I6.a.g(context, objM);
                }
                try {
                    nVar.getClass();
                } catch (Throwable th) {
                    objH = p003a.a.h(th);
                }
                i(null, p044f6.f.a(objH));
            } catch (Throwable th2) {
                if (g0W == null || g0W.R()) {
                    I6.a.g(context, objM);
                }
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                nVar.getClass();
            } catch (Throwable th4) {
                objH = p003a.a.h(th4);
            }
            i(th3, p044f6.f.a(objH));
        }
    }

    public Object h(Object obj) {
        return obj;
    }
}
