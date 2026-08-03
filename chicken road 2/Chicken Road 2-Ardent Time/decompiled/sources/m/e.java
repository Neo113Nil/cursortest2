package m;

/* loaded from: classes.dex */
public final class e extends Q1.d {
    @Override // Q1.d
    public final boolean d(m.g gVar, m.c cVar) {
        m.c cVar2 = m.c.f8022b;
        synchronized (gVar) {
            try {
                if (gVar.f8037b != cVar) {
                    return false;
                }
                gVar.f8037b = cVar2;
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // Q1.d
    public final boolean e(m.g gVar, java.lang.Object obj, java.lang.Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f8036a != obj) {
                    return false;
                }
                gVar.f8036a = obj2;
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // Q1.d
    public final boolean f(m.g gVar, m.f fVar, m.f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f8038c != fVar) {
                    return false;
                }
                gVar.f8038c = fVar2;
                return true;
            } catch (java.lang.Throwable th) {
                throw th;
            }
        }
    }

    @Override // Q1.d
    public final void w(m.f fVar, m.f fVar2) {
        fVar.f8031b = fVar2;
    }

    @Override // Q1.d
    public final void x(m.f fVar, java.lang.Thread thread) {
        fVar.f8030a = thread;
    }
}
