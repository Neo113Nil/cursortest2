package g;

/* loaded from: classes.dex */
public final class e extends V.a {
    @Override // V.a
    public final boolean f(g gVar, c cVar) {
        c cVar2 = c.f1053b;
        synchronized (gVar) {
            try {
                if (gVar.f1068b != cVar) {
                    return false;
                }
                gVar.f1068b = cVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // V.a
    public final boolean g(g gVar, Object obj, Object obj2) {
        synchronized (gVar) {
            try {
                if (gVar.f1067a != obj) {
                    return false;
                }
                gVar.f1067a = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // V.a
    public final boolean h(g gVar, f fVar, f fVar2) {
        synchronized (gVar) {
            try {
                if (gVar.f1069c != fVar) {
                    return false;
                }
                gVar.f1069c = fVar2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // V.a
    public final void v(f fVar, f fVar2) {
        fVar.f1062b = fVar2;
    }

    @Override // V.a
    public final void w(f fVar, Thread thread) {
        fVar.f1061a = thread;
    }
}
