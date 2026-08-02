package p000;

/* JADX INFO: renamed from: zb */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0945zb implements InterfaceC0187eu, nw0 {

    /* JADX INFO: renamed from: j */
    public final ft0 f9718j;

    /* JADX INFO: renamed from: k */
    public final C0013ac f9719k;

    /* JADX INFO: renamed from: l */
    public boolean f9720l;

    /* JADX INFO: renamed from: m */
    public boolean f9721m;

    /* JADX INFO: renamed from: n */
    public C0163e6 f9722n;

    /* JADX INFO: renamed from: o */
    public boolean f9723o;

    /* JADX INFO: renamed from: p */
    public volatile boolean f9724p;

    /* JADX INFO: renamed from: q */
    public long f9725q;

    public C0945zb(ft0 ft0Var, C0013ac c0013ac) {
        this.f9718j = ft0Var;
        this.f9719k = c0013ac;
    }

    /* JADX INFO: renamed from: a */
    public final void m5871a(Object obj, long j) {
        if (this.f9724p) {
            return;
        }
        if (!this.f9723o) {
            synchronized (this) {
                try {
                    if (this.f9724p) {
                        return;
                    }
                    if (this.f9725q == j) {
                        return;
                    }
                    if (this.f9721m) {
                        C0163e6 c0163e6 = this.f9722n;
                        int i = 0;
                        if (c0163e6 == null) {
                            c0163e6 = new C0163e6(1, (byte) 0);
                            this.f9722n = c0163e6;
                        }
                        int i2 = c0163e6.f1964k;
                        if (i2 == 4) {
                            Object[] objArr = new Object[5];
                            ((Object[]) c0163e6.f1966m)[4] = objArr;
                            c0163e6.f1966m = objArr;
                        } else {
                            i = i2;
                        }
                        ((Object[]) c0163e6.f1966m)[i] = obj;
                        c0163e6.f1964k = i + 1;
                        return;
                    }
                    this.f9720l = true;
                    this.f9723o = true;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        test(obj);
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        if (this.f9724p) {
            return;
        }
        this.f9724p = true;
        this.f9719k.m171G(this);
    }

    @Override // p000.nw0
    public final boolean test(Object obj) {
        if (this.f9724p) {
            return true;
        }
        ft0 ft0Var = this.f9718j;
        if (obj == ps0.f6243j) {
            ft0Var.onComplete();
            return true;
        }
        if (obj instanceof os0) {
            ft0Var.onError(((os0) obj).f5852j);
            return true;
        }
        ft0Var.onNext(obj);
        return false;
    }
}
