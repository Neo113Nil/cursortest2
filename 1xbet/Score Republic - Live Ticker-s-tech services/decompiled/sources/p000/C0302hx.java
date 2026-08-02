package p000;

/* JADX INFO: renamed from: hx */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0302hx implements k11, h11 {

    /* JADX INFO: renamed from: a */
    public final Object f3352a;

    /* JADX INFO: renamed from: b */
    public final k11 f3353b;

    /* JADX INFO: renamed from: c */
    public volatile h11 f3354c;

    /* JADX INFO: renamed from: d */
    public volatile h11 f3355d;

    /* JADX INFO: renamed from: e */
    public int f3356e = 3;

    /* JADX INFO: renamed from: f */
    public int f3357f = 3;

    public C0302hx(Object obj, k11 k11Var) {
        this.f3352a = obj;
        this.f3353b = k11Var;
    }

    @Override // p000.k11, p000.h11
    /* JADX INFO: renamed from: a */
    public final boolean mo2194a() {
        boolean z;
        synchronized (this.f3352a) {
            try {
                z = this.f3354c.mo2194a() || this.f3355d.mo2194a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.h11
    /* JADX INFO: renamed from: b */
    public final boolean mo2195b(h11 h11Var) {
        if (h11Var instanceof C0302hx) {
            C0302hx c0302hx = (C0302hx) h11Var;
            if (this.f3354c.mo2195b(c0302hx.f3354c) && this.f3355d.mo2195b(c0302hx.f3355d)) {
                return true;
            }
        }
        return false;
    }

    @Override // p000.k11
    /* JADX INFO: renamed from: c */
    public final boolean mo2341c(h11 h11Var) {
        boolean z;
        synchronized (this.f3352a) {
            k11 k11Var = this.f3353b;
            z = (k11Var == null || k11Var.mo2341c(this)) && h11Var.equals(this.f3354c);
        }
        return z;
    }

    @Override // p000.h11
    public final void clear() {
        synchronized (this.f3352a) {
            try {
                this.f3356e = 3;
                this.f3354c.clear();
                if (this.f3357f != 3) {
                    this.f3357f = 3;
                    this.f3355d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.k11
    /* JADX INFO: renamed from: d */
    public final boolean mo2342d(h11 h11Var) {
        boolean z;
        boolean zEquals;
        int i;
        synchronized (this.f3352a) {
            k11 k11Var = this.f3353b;
            z = false;
            if (k11Var == null || k11Var.mo2342d(this)) {
                if (this.f3356e != 5) {
                    zEquals = h11Var.equals(this.f3354c);
                } else {
                    zEquals = h11Var.equals(this.f3355d) && ((i = this.f3357f) == 4 || i == 5);
                }
                if (zEquals) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // p000.k11
    /* JADX INFO: renamed from: e */
    public final void mo2343e(h11 h11Var) {
        synchronized (this.f3352a) {
            try {
                if (h11Var.equals(this.f3355d)) {
                    this.f3357f = 5;
                    k11 k11Var = this.f3353b;
                    if (k11Var != null) {
                        k11Var.mo2343e(this);
                    }
                    return;
                }
                this.f3356e = 5;
                if (this.f3357f != 1) {
                    this.f3357f = 1;
                    this.f3355d.mo2198j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.k11
    /* JADX INFO: renamed from: f */
    public final boolean mo2344f(h11 h11Var) {
        boolean z;
        synchronized (this.f3352a) {
            k11 k11Var = this.f3353b;
            z = k11Var == null || k11Var.mo2344f(this);
        }
        return z;
    }

    @Override // p000.k11
    /* JADX INFO: renamed from: g */
    public final void mo2345g(h11 h11Var) {
        synchronized (this.f3352a) {
            try {
                if (h11Var.equals(this.f3354c)) {
                    this.f3356e = 4;
                } else if (h11Var.equals(this.f3355d)) {
                    this.f3357f = 4;
                }
                k11 k11Var = this.f3353b;
                if (k11Var != null) {
                    k11Var.mo2345g(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [k11] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5 */
    @Override // p000.k11
    public final k11 getRoot() {
        ?? root;
        synchronized (this.f3352a) {
            try {
                k11 k11Var = this.f3353b;
                this = this;
                if (k11Var != null) {
                    root = k11Var.getRoot();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // p000.h11
    /* JADX INFO: renamed from: h */
    public final boolean mo2196h() {
        boolean z;
        synchronized (this.f3352a) {
            try {
                z = this.f3356e == 3 && this.f3357f == 3;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.h11
    /* JADX INFO: renamed from: i */
    public final void mo2197i() {
        synchronized (this.f3352a) {
            try {
                if (this.f3356e == 1) {
                    this.f3356e = 2;
                    this.f3354c.mo2197i();
                }
                if (this.f3357f == 1) {
                    this.f3357f = 2;
                    this.f3355d.mo2197i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.h11
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f3352a) {
            try {
                z = true;
                if (this.f3356e != 1 && this.f3357f != 1) {
                    z = false;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.h11
    /* JADX INFO: renamed from: j */
    public final void mo2198j() {
        synchronized (this.f3352a) {
            try {
                if (this.f3356e != 1) {
                    this.f3356e = 1;
                    this.f3354c.mo2198j();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.h11
    /* JADX INFO: renamed from: k */
    public final boolean mo2199k() {
        boolean z;
        synchronized (this.f3352a) {
            try {
                z = this.f3356e == 4 || this.f3357f == 4;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }
}
