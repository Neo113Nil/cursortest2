package p000;

/* JADX INFO: renamed from: dx */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0153dx implements v11 {

    /* JADX INFO: renamed from: j */
    public final boolean f1861j;

    /* JADX INFO: renamed from: k */
    public final boolean f1862k;

    /* JADX INFO: renamed from: l */
    public final v11 f1863l;

    /* JADX INFO: renamed from: m */
    public final C0892xw f1864m;

    /* JADX INFO: renamed from: n */
    public final xg0 f1865n;

    /* JADX INFO: renamed from: o */
    public int f1866o;

    /* JADX INFO: renamed from: p */
    public boolean f1867p;

    public C0153dx(v11 v11Var, boolean z, boolean z2, xg0 xg0Var, C0892xw c0892xw) {
        o80.m3647h(v11Var, "Argument must not be null");
        this.f1863l = v11Var;
        this.f1861j = z;
        this.f1862k = z2;
        this.f1865n = xg0Var;
        o80.m3647h(c0892xw, "Argument must not be null");
        this.f1864m = c0892xw;
    }

    /* JADX INFO: renamed from: a */
    public final synchronized void m1323a() {
        if (this.f1867p) {
            throw new IllegalStateException("Cannot acquire a recycled resource");
        }
        this.f1866o++;
    }

    /* JADX INFO: renamed from: b */
    public final void m1324b() {
        boolean z;
        synchronized (this) {
            int i = this.f1866o;
            if (i <= 0) {
                throw new IllegalStateException("Cannot release a recycled or not yet acquired resource");
            }
            z = true;
            int i2 = i - 1;
            this.f1866o = i2;
            if (i2 != 0) {
                z = false;
            }
        }
        if (z) {
            this.f1864m.m5696e(this.f1865n, this);
        }
    }

    @Override // p000.v11
    /* JADX INFO: renamed from: c */
    public final int mo267c() {
        return this.f1863l.mo267c();
    }

    @Override // p000.v11
    /* JADX INFO: renamed from: d */
    public final Class mo268d() {
        return this.f1863l.mo268d();
    }

    @Override // p000.v11
    /* JADX INFO: renamed from: e */
    public final synchronized void mo269e() {
        if (this.f1866o > 0) {
            throw new IllegalStateException("Cannot recycle a resource while it is still acquired");
        }
        if (this.f1867p) {
            throw new IllegalStateException("Cannot recycle a resource that has already been recycled");
        }
        this.f1867p = true;
        if (this.f1862k) {
            this.f1863l.mo269e();
        }
    }

    @Override // p000.v11
    public final Object get() {
        return this.f1863l.get();
    }

    public final synchronized String toString() {
        return "EngineResource{isMemoryCacheable=" + this.f1861j + ", listener=" + this.f1864m + ", key=" + this.f1865n + ", acquired=" + this.f1866o + ", isRecycled=" + this.f1867p + ", resource=" + this.f1863l + '}';
    }
}
