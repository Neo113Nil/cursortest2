package o1;

import n3.AbstractC1464a;

/* renamed from: o1.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1497g extends AbstractC1464a {
    @Override // n3.AbstractC1464a
    public final void N(C1498h c1498h, C1498h c1498h2) {
        c1498h.f15562b = c1498h2;
    }

    @Override // n3.AbstractC1464a
    public final void O(C1498h c1498h, Thread thread) {
        c1498h.f15561a = thread;
    }

    @Override // n3.AbstractC1464a
    public final boolean f(AbstractC1499i abstractC1499i, C1494d c1494d, C1494d c1494d2) {
        synchronized (abstractC1499i) {
            try {
                if (abstractC1499i.f15568b != c1494d) {
                    return false;
                }
                abstractC1499i.f15568b = c1494d2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // n3.AbstractC1464a
    public final boolean g(AbstractC1499i abstractC1499i, Object obj, Object obj2) {
        synchronized (abstractC1499i) {
            try {
                if (abstractC1499i.f15567a != obj) {
                    return false;
                }
                abstractC1499i.f15567a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // n3.AbstractC1464a
    public final boolean h(AbstractC1499i abstractC1499i, C1498h c1498h, C1498h c1498h2) {
        synchronized (abstractC1499i) {
            try {
                if (abstractC1499i.f15569c != c1498h) {
                    return false;
                }
                abstractC1499i.f15569c = c1498h2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
