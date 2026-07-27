package q;

import a.AbstractC0086a;

/* loaded from: classes.dex */
public final class e extends AbstractC0086a {
    @Override // a.AbstractC0086a
    public final void K(f fVar, f fVar2) {
        fVar.f10250b = fVar2;
    }

    @Override // a.AbstractC0086a
    public final void L(f fVar, Thread thread) {
        fVar.f10249a = thread;
    }

    @Override // a.AbstractC0086a
    public final boolean e(g gVar, C1169c c1169c) {
        C1169c c1169c2 = C1169c.f10242b;
        synchronized (gVar) {
            try {
                if (gVar.f10255b != c1169c) {
                    return false;
                }
                gVar.f10255b = c1169c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0086a
    public final boolean f(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f10254a != obj) {
                    return false;
                }
                gVar.f10254a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // a.AbstractC0086a
    public final boolean g(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f10256c != fVar) {
                    return false;
                }
                gVar.f10256c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
