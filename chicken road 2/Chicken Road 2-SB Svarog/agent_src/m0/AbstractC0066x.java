package m0;

import a.AbstractC0018a;
import java.util.concurrent.CancellationException;
import r0.AbstractC0088a;

/* renamed from: m0.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0066x extends s0.h {

    /* renamed from: d, reason: collision with root package name */
    public int f956d;

    public AbstractC0066x(int i2) {
        super(0L, s0.j.f1242g);
        this.f956d = i2;
    }

    public abstract void b(Object obj, CancellationException cancellationException);

    public abstract Y.d c();

    public Throwable d(Object obj) {
        C0054k c0054k = obj instanceof C0054k ? (C0054k) obj : null;
        if (c0054k != null) {
            return c0054k.f934a;
        }
        return null;
    }

    public final void g(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            AbstractC0018a.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        g0.h.b(th);
        AbstractC0062t.c(c().h(), new C0061s("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r5 = (m0.K) r5.d(m0.C0060q.f943c);
     */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void run() {
        Object obj = W.g.f394a;
        F.E e2 = this.f1234c;
        try {
            Y.d c2 = c();
            g0.h.c(c2, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<T of kotlinx.coroutines.DispatchedTask>");
            r0.h hVar = (r0.h) c2;
            a0.b bVar = hVar.f1170f;
            Object obj2 = hVar.f1172h;
            Y.i iVar = bVar.f419c;
            g0.h.b(iVar);
            Object k2 = AbstractC0088a.k(iVar, obj2);
            if (k2 != AbstractC0088a.f1160f) {
                AbstractC0062t.h(bVar, iVar);
            }
            try {
                Y.i iVar2 = bVar.f419c;
                g0.h.b(iVar2);
                Object i2 = i();
                Throwable d2 = d(i2);
                if (d2 == null) {
                    int i3 = this.f956d;
                    boolean z2 = true;
                    if (i3 != 1 && i3 != 2) {
                        z2 = false;
                    }
                }
                K k3 = null;
                if (k3 != null && !k3.b()) {
                    CancellationException v = ((T) k3).v();
                    b(i2, v);
                    bVar.k(AbstractC0018a.h(v));
                } else if (d2 != null) {
                    bVar.k(AbstractC0018a.h(d2));
                } else {
                    bVar.k(e(i2));
                }
                AbstractC0088a.f(iVar, k2);
                try {
                    e2.getClass();
                } catch (Throwable th) {
                    obj = AbstractC0018a.h(th);
                }
                g(null, W.d.a(obj));
            } catch (Throwable th2) {
                AbstractC0088a.f(iVar, k2);
                throw th2;
            }
        } catch (Throwable th3) {
            try {
                e2.getClass();
            } catch (Throwable th4) {
                obj = AbstractC0018a.h(th4);
            }
            g(th3, W.d.a(obj));
        }
    }

    public Object e(Object obj) {
        return obj;
    }
}
