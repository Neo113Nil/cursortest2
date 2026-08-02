package b1;

import k4.AbstractC2036a;

/* renamed from: b1.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0505f extends AbstractC2036a {
    @Override // k4.AbstractC2036a
    public final void Q(C0506g c0506g, C0506g c0506g2) {
        c0506g.f7199b = c0506g2;
    }

    @Override // k4.AbstractC2036a
    public final void R(C0506g c0506g, Thread thread) {
        c0506g.f7198a = thread;
    }

    @Override // k4.AbstractC2036a
    public final boolean k(AbstractC0507h abstractC0507h, C0503d c0503d, C0503d c0503d2) {
        synchronized (abstractC0507h) {
            try {
                if (abstractC0507h.f7205l != c0503d) {
                    return false;
                }
                abstractC0507h.f7205l = c0503d2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k4.AbstractC2036a
    public final boolean l(AbstractC0507h abstractC0507h, Object obj, Object obj2) {
        synchronized (abstractC0507h) {
            try {
                if (abstractC0507h.f7204k != obj) {
                    return false;
                }
                abstractC0507h.f7204k = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // k4.AbstractC2036a
    public final boolean m(AbstractC0507h abstractC0507h, C0506g c0506g, C0506g c0506g2) {
        synchronized (abstractC0507h) {
            try {
                if (abstractC0507h.f7206m != c0506g) {
                    return false;
                }
                abstractC0507h.f7206m = c0506g2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
