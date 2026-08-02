package p000;

/* JADX INFO: renamed from: t0 */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0712t0 extends hn0 {
    @Override // p000.hn0
    /* JADX INFO: renamed from: d */
    public final boolean mo2324d(AbstractC0786v0 abstractC0786v0, C0638r0 c0638r0, C0638r0 c0638r1) {
        synchronized (abstractC0786v0) {
            try {
                if (abstractC0786v0.f7981k != c0638r0) {
                    return false;
                }
                abstractC0786v0.f7981k = c0638r1;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.hn0
    /* JADX INFO: renamed from: e */
    public final boolean mo2325e(AbstractC0786v0 abstractC0786v0, Object obj, Object obj2) {
        synchronized (abstractC0786v0) {
            try {
                if (abstractC0786v0.f7980j != obj) {
                    return false;
                }
                abstractC0786v0.f7980j = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.hn0
    /* JADX INFO: renamed from: f */
    public final boolean mo2326f(AbstractC0786v0 abstractC0786v0, C0749u0 c0749u0, C0749u0 c0749u1) {
        synchronized (abstractC0786v0) {
            try {
                if (abstractC0786v0.f7982l != c0749u0) {
                    return false;
                }
                abstractC0786v0.f7982l = c0749u1;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.hn0
    /* JADX INFO: renamed from: l */
    public final void mo2327l(C0749u0 c0749u0, C0749u0 c0749u1) {
        c0749u0.f7634b = c0749u1;
    }

    @Override // p000.hn0
    /* JADX INFO: renamed from: m */
    public final void mo2328m(C0749u0 c0749u0, Thread thread) {
        c0749u0.f7633a = thread;
    }
}
