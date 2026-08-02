package p000;

/* JADX INFO: renamed from: y */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0896y extends kd0 {
    @Override // p000.kd0
    /* JADX INFO: renamed from: c */
    public final boolean mo1540c(AbstractC0269h0 abstractC0269h0, C0785v c0785v, C0785v c0785v2) {
        synchronized (abstractC0269h0) {
            try {
                if (abstractC0269h0.f2978k != c0785v) {
                    return false;
                }
                abstractC0269h0.f2978k = c0785v2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.kd0
    /* JADX INFO: renamed from: d */
    public final boolean mo1541d(AbstractC0269h0 abstractC0269h0, Object obj, Object obj2) {
        synchronized (abstractC0269h0) {
            try {
                if (abstractC0269h0.f2977j != obj) {
                    return false;
                }
                abstractC0269h0.f2977j = obj2;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.kd0
    /* JADX INFO: renamed from: e */
    public final boolean mo1542e(AbstractC0269h0 abstractC0269h0, C0231g0 c0231g0, C0231g0 c0231g1) {
        synchronized (abstractC0269h0) {
            try {
                if (abstractC0269h0.f2979l != c0231g0) {
                    return false;
                }
                abstractC0269h0.f2979l = c0231g1;
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.kd0
    /* JADX INFO: renamed from: g */
    public final C0785v mo1543g(AbstractC0269h0 abstractC0269h0) {
        C0785v c0785v;
        C0785v c0785v2 = C0785v.f7972d;
        synchronized (abstractC0269h0) {
            try {
                c0785v = abstractC0269h0.f2978k;
                if (c0785v != c0785v2) {
                    abstractC0269h0.f2978k = c0785v2;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0785v;
    }

    @Override // p000.kd0
    /* JADX INFO: renamed from: h */
    public final C0231g0 mo1544h(AbstractC0269h0 abstractC0269h0) {
        C0231g0 c0231g0;
        C0231g0 c0231g1 = C0231g0.f2566c;
        synchronized (abstractC0269h0) {
            try {
                c0231g0 = abstractC0269h0.f2979l;
                if (c0231g0 != c0231g1) {
                    abstractC0269h0.f2979l = c0231g1;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c0231g0;
    }

    @Override // p000.kd0
    /* JADX INFO: renamed from: k */
    public final void mo1545k(C0231g0 c0231g0, C0231g0 c0231g1) {
        c0231g0.f2568b = c0231g1;
    }

    @Override // p000.kd0
    /* JADX INFO: renamed from: l */
    public final void mo1546l(C0231g0 c0231g0, Thread thread) {
        c0231g0.f2567a = thread;
    }
}
