package s;

import p6.AbstractC1539a;

/* loaded from: classes.dex */
public final class e extends AbstractC1539a {
    @Override // p6.AbstractC1539a
    public final boolean b(g gVar, c cVar, c cVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f16082b != cVar) {
                    return false;
                }
                gVar.f16082b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p6.AbstractC1539a
    public final boolean c(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f16081a != obj) {
                    return false;
                }
                gVar.f16081a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p6.AbstractC1539a
    public final boolean d(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f16083c != fVar) {
                    return false;
                }
                gVar.f16083c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p6.AbstractC1539a
    public final void f(f fVar, f fVar2) {
        fVar.f16076b = fVar2;
    }

    @Override // p6.AbstractC1539a
    public final void g(f fVar, Thread thread) {
        fVar.f16075a = thread;
    }
}
