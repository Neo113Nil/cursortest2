package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class s20 extends AbstractC0723tb {

    /* JADX INFO: renamed from: o */
    public final InterfaceC0254gm f7015o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC0254gm f7016p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC0003a2 f7017q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC0003a2 f7018r;

    public s20(InterfaceC0142dl interfaceC0142dl, C0042ay c0042ay, nc1 nc1Var, o31 o31Var, o31 o31Var2) {
        super(interfaceC0142dl);
        this.f7015o = c0042ay;
        this.f7016p = nc1Var;
        this.f7017q = o31Var;
        this.f7018r = o31Var2;
    }

    @Override // p000.InterfaceC0142dl
    /* JADX INFO: renamed from: d */
    public final boolean mo21d(Object obj) {
        if (this.f7401m) {
            return false;
        }
        try {
            this.f7015o.accept(obj);
            return this.f7398j.mo21d(obj);
        } catch (Throwable th) {
            m4780a(th);
            return false;
        }
    }

    @Override // p000.AbstractC0723tb, p000.y30
    public final void onComplete() {
        if (this.f7401m) {
            return;
        }
        try {
            this.f7017q.run();
            this.f7401m = true;
            this.f7398j.onComplete();
            try {
                this.f7018r.run();
            } catch (Throwable th) {
                wo1.m5394u(th);
                vt1.m5196h(th);
            }
        } catch (Throwable th2) {
            m4780a(th2);
        }
    }

    @Override // p000.AbstractC0723tb, p000.y30
    public final void onError(Throwable th) {
        InterfaceC0142dl interfaceC0142dl = this.f7398j;
        if (this.f7401m) {
            vt1.m5196h(th);
            return;
        }
        this.f7401m = true;
        try {
            this.f7016p.accept(th);
            interfaceC0142dl.onError(th);
        } catch (Throwable th2) {
            wo1.m5394u(th2);
            interfaceC0142dl.onError(new C0658rk(th, th2));
        }
        try {
            this.f7018r.run();
        } catch (Throwable th3) {
            wo1.m5394u(th3);
            vt1.m5196h(th3);
        }
    }

    @Override // p000.y30
    public final void onNext(Object obj) {
        if (this.f7401m) {
            return;
        }
        int i = this.f7402n;
        InterfaceC0142dl interfaceC0142dl = this.f7398j;
        if (i != 0) {
            interfaceC0142dl.onNext(null);
            return;
        }
        try {
            this.f7015o.accept(obj);
            interfaceC0142dl.onNext(obj);
        } catch (Throwable th) {
            m4780a(th);
        }
    }

    @Override // p000.y71
    public final Object poll() throws Exception {
        InterfaceC0254gm interfaceC0254gm = this.f7016p;
        try {
            Object objPoll = this.f7400l.poll();
            InterfaceC0003a2 interfaceC0003a2 = this.f7018r;
            if (objPoll == null) {
                if (this.f7402n == 1) {
                    this.f7017q.run();
                    interfaceC0003a2.run();
                }
                return objPoll;
            }
            try {
                this.f7015o.accept(objPoll);
                interfaceC0003a2.run();
                return objPoll;
            } catch (Throwable th) {
                try {
                    wo1.m5394u(th);
                    try {
                        interfaceC0254gm.accept(th);
                        C0634qx c0634qx = AbstractC0671rx.f6987a;
                        if (th instanceof Exception) {
                            throw th;
                        }
                        throw th;
                    } catch (Throwable th2) {
                        throw new C0658rk(th, th2);
                    }
                } catch (Throwable th3) {
                    interfaceC0003a2.run();
                    throw th3;
                }
            }
        } catch (Throwable th4) {
            wo1.m5394u(th4);
            try {
                interfaceC0254gm.accept(th4);
                C0634qx c0634qx2 = AbstractC0671rx.f6987a;
                if (th4 instanceof Exception) {
                    throw th4;
                }
                throw th4;
            } catch (Throwable th5) {
                throw new C0658rk(th4, th5);
            }
        }
    }
}
