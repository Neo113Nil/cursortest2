package q2;

import r3.AbstractC2349a;

/* renamed from: q2.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2303f extends AbstractC2349a {
    @Override // r3.AbstractC2349a
    public final void J(C2304g c2304g, C2304g c2304g2) {
        c2304g.f18876b = c2304g2;
    }

    @Override // r3.AbstractC2349a
    public final void K(C2304g c2304g, Thread thread) {
        c2304g.f18875a = thread;
    }

    @Override // r3.AbstractC2349a
    public final boolean o(AbstractC2305h abstractC2305h, C2300c c2300c, C2300c c2300c2) {
        synchronized (abstractC2305h) {
            try {
                if (abstractC2305h.f18882l != c2300c) {
                    return false;
                }
                abstractC2305h.f18882l = c2300c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // r3.AbstractC2349a
    public final boolean p(AbstractC2305h abstractC2305h, Object obj, Object obj2) {
        synchronized (abstractC2305h) {
            try {
                if (abstractC2305h.f18881k != obj) {
                    return false;
                }
                abstractC2305h.f18881k = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // r3.AbstractC2349a
    public final boolean q(AbstractC2305h abstractC2305h, C2304g c2304g, C2304g c2304g2) {
        synchronized (abstractC2305h) {
            try {
                if (abstractC2305h.f18883m != c2304g) {
                    return false;
                }
                abstractC2305h.f18883m = c2304g2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
