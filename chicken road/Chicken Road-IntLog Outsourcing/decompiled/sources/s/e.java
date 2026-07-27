package s;

/* loaded from: classes.dex */
public final class e extends K1.b {
    @Override // K1.b
    public final boolean F(g gVar, C1411c c1411c, C1411c c1411c2) {
        synchronized (gVar) {
            try {
                if (gVar.f11746b != c1411c) {
                    return false;
                }
                gVar.f11746b = c1411c2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K1.b
    public final boolean H(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f11745a != obj) {
                    return false;
                }
                gVar.f11745a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K1.b
    public final boolean J(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f11747c != fVar) {
                    return false;
                }
                gVar.f11747c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // K1.b
    public final void c0(f fVar, f fVar2) {
        fVar.f11740b = fVar2;
    }

    @Override // K1.b
    public final void e0(f fVar, Thread thread) {
        fVar.f11739a = thread;
    }
}
