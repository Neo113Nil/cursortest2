package g;

import a.AbstractC0018a;

/* renamed from: g.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0035e extends AbstractC0018a {
    @Override // a.AbstractC0018a
    public final boolean d(AbstractFutureC0037g abstractFutureC0037g, C0033c c0033c) {
        C0033c c0033c2 = C0033c.f513b;
        synchronized (abstractFutureC0037g) {
            try {
                if (abstractFutureC0037g.f528c != c0033c) {
                    return false;
                }
                abstractFutureC0037g.f528c = c0033c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0018a
    public final boolean e(AbstractFutureC0037g abstractFutureC0037g, Object obj, Object obj2) {
        synchronized (abstractFutureC0037g) {
            try {
                if (abstractFutureC0037g.f527b != obj) {
                    return false;
                }
                abstractFutureC0037g.f527b = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0018a
    public final boolean f(AbstractFutureC0037g abstractFutureC0037g, C0036f c0036f, C0036f c0036f2) {
        synchronized (abstractFutureC0037g) {
            try {
                if (abstractFutureC0037g.f529d != c0036f) {
                    return false;
                }
                abstractFutureC0037g.f529d = c0036f2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0018a
    public final void u(C0036f c0036f, C0036f c0036f2) {
        c0036f.f522b = c0036f2;
    }

    @Override // a.AbstractC0018a
    public final void v(C0036f c0036f, Thread thread) {
        c0036f.f521a = thread;
    }
}
