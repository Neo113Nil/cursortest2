package p129s;

import p115p6.a;

/* JADX INFO: loaded from: classes.dex */
public final class e extends a {
    @Override // p115p6.a
    public final boolean b(g gVar, c cVar, c cVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f16088b != cVar) {
                    return false;
                }
                gVar.f16088b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p115p6.a
    public final boolean c(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f16087a != obj) {
                    return false;
                }
                gVar.f16087a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p115p6.a
    public final boolean d(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f16089c != fVar) {
                    return false;
                }
                gVar.f16089c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p115p6.a
    public final void f(f fVar, f fVar2) {
        fVar.f16082b = fVar2;
    }

    @Override // p115p6.a
    public final void g(f fVar, Thread thread) {
        fVar.f16081a = thread;
    }
}
