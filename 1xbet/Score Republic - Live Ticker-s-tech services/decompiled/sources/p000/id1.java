package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class id1 implements k11, h11 {

    /* JADX INFO: renamed from: a */
    public final k11 f3549a;

    /* JADX INFO: renamed from: b */
    public final Object f3550b;

    /* JADX INFO: renamed from: c */
    public volatile h81 f3551c;

    /* JADX INFO: renamed from: d */
    public volatile h11 f3552d;

    /* JADX INFO: renamed from: e */
    public int f3553e = 3;

    /* JADX INFO: renamed from: f */
    public int f3554f = 3;

    /* JADX INFO: renamed from: g */
    public boolean f3555g;

    public id1(Object obj, k11 k11Var) {
        this.f3550b = obj;
        this.f3549a = k11Var;
    }

    @Override // p000.k11, p000.h11
    /* JADX INFO: renamed from: a */
    public final boolean mo2194a() {
        boolean z;
        synchronized (this.f3550b) {
            try {
                z = this.f3552d.mo2194a() || this.f3551c.mo2194a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.h11
    /* JADX INFO: renamed from: b */
    public final boolean mo2195b(h11 h11Var) {
        if (!(h11Var instanceof id1)) {
            return false;
        }
        id1 id1Var = (id1) h11Var;
        if (this.f3551c == null) {
            if (id1Var.f3551c != null) {
                return false;
            }
        } else if (!this.f3551c.mo2195b(id1Var.f3551c)) {
            return false;
        }
        if (this.f3552d == null) {
            return id1Var.f3552d == null;
        }
        return this.f3552d.mo2195b(id1Var.f3552d);
    }

    @Override // p000.k11
    /* JADX INFO: renamed from: c */
    public final boolean mo2341c(h11 h11Var) {
        boolean z;
        synchronized (this.f3550b) {
            try {
                k11 k11Var = this.f3549a;
                z = (k11Var == null || k11Var.mo2341c(this)) && h11Var.equals(this.f3551c) && this.f3553e != 2;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.h11
    public final void clear() {
        synchronized (this.f3550b) {
            this.f3555g = false;
            this.f3553e = 3;
            this.f3554f = 3;
            this.f3552d.clear();
            this.f3551c.clear();
        }
    }

    @Override // p000.k11
    /* JADX INFO: renamed from: d */
    public final boolean mo2342d(h11 h11Var) {
        boolean z;
        synchronized (this.f3550b) {
            try {
                k11 k11Var = this.f3549a;
                z = (k11Var == null || k11Var.mo2342d(this)) && h11Var.equals(this.f3551c) && !mo2194a();
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.k11
    /* JADX INFO: renamed from: e */
    public final void mo2343e(h11 h11Var) {
        synchronized (this.f3550b) {
            try {
                if (!h11Var.equals(this.f3551c)) {
                    this.f3554f = 5;
                    return;
                }
                this.f3553e = 5;
                k11 k11Var = this.f3549a;
                if (k11Var != null) {
                    k11Var.mo2343e(this);
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
        synchronized (this.f3550b) {
            try {
                k11 k11Var = this.f3549a;
                z = (k11Var == null || k11Var.mo2344f(this)) && (h11Var.equals(this.f3551c) || this.f3553e != 4);
            } catch (Throwable th) {
                throw th;
            }
        }
        return z;
    }

    @Override // p000.k11
    /* JADX INFO: renamed from: g */
    public final void mo2345g(h11 h11Var) {
        synchronized (this.f3550b) {
            try {
                if (h11Var.equals(this.f3552d)) {
                    this.f3554f = 4;
                    return;
                }
                this.f3553e = 4;
                k11 k11Var = this.f3549a;
                if (k11Var != null) {
                    k11Var.mo2345g(this);
                }
                if (!j11.m2769d(this.f3554f)) {
                    this.f3552d.clear();
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
        synchronized (this.f3550b) {
            try {
                k11 k11Var = this.f3549a;
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
        synchronized (this.f3550b) {
            z = this.f3553e == 3;
        }
        return z;
    }

    @Override // p000.h11
    /* JADX INFO: renamed from: i */
    public final void mo2197i() {
        synchronized (this.f3550b) {
            try {
                if (!j11.m2769d(this.f3554f)) {
                    this.f3554f = 2;
                    this.f3552d.mo2197i();
                }
                if (!j11.m2769d(this.f3553e)) {
                    this.f3553e = 2;
                    this.f3551c.mo2197i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // p000.h11
    public final boolean isRunning() {
        boolean z;
        synchronized (this.f3550b) {
            z = true;
            if (this.f3553e != 1) {
                z = false;
            }
        }
        return z;
    }

    @Override // p000.h11
    /* JADX INFO: renamed from: j */
    public final void mo2198j() {
        synchronized (this.f3550b) {
            try {
                this.f3555g = true;
                try {
                    if (this.f3553e != 4 && this.f3554f != 1) {
                        this.f3554f = 1;
                        this.f3552d.mo2198j();
                    }
                    if (this.f3555g && this.f3553e != 1) {
                        this.f3553e = 1;
                        this.f3551c.mo2198j();
                    }
                    this.f3555g = false;
                } catch (Throwable th) {
                    this.f3555g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // p000.h11
    /* JADX INFO: renamed from: k */
    public final boolean mo2199k() {
        boolean z;
        synchronized (this.f3550b) {
            z = this.f3553e == 4;
        }
        return z;
    }
}
