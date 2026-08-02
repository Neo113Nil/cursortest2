package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ws0 implements ft0, InterfaceC0187eu {

    /* JADX INFO: renamed from: j */
    public final c81 f8653j;

    /* JADX INFO: renamed from: k */
    public final g72 f8654k;

    /* JADX INFO: renamed from: l */
    public InterfaceC0187eu f8655l;

    /* JADX INFO: renamed from: m */
    public boolean f8656m;

    public ws0(c81 c81Var, g72 g72Var) {
        this.f8653j = c81Var;
        this.f8654k = g72Var;
    }

    @Override // p000.ft0
    /* JADX INFO: renamed from: a */
    public final void mo172a(InterfaceC0187eu interfaceC0187eu) {
        if (EnumC0262gu.m2150f(this.f8655l, interfaceC0187eu)) {
            this.f8655l = interfaceC0187eu;
            this.f8653j.mo77a(this);
        }
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        this.f8655l.mo480c();
    }

    @Override // p000.ft0
    public final void onComplete() {
        if (this.f8656m) {
            return;
        }
        this.f8656m = true;
        this.f8653j.mo78b(Boolean.FALSE);
    }

    @Override // p000.ft0
    public final void onError(Throwable th) {
        if (this.f8656m) {
            vt1.m5196h(th);
        } else {
            this.f8656m = true;
            this.f8653j.onError(th);
        }
    }

    @Override // p000.ft0
    public final void onNext(Object obj) {
        if (this.f8656m) {
            return;
        }
        try {
            if (this.f8654k.test(obj)) {
                this.f8656m = true;
                this.f8655l.mo480c();
                this.f8653j.mo78b(Boolean.TRUE);
            }
        } catch (Throwable th) {
            wo1.m5394u(th);
            this.f8655l.mo480c();
            onError(th);
        }
    }
}
