package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class t20 extends AbstractC0760ub {

    /* JADX INFO: renamed from: o */
    public final InterfaceC0254gm f7252o;

    /* JADX INFO: renamed from: p */
    public final InterfaceC0254gm f7253p;

    /* JADX INFO: renamed from: q */
    public final InterfaceC0003a2 f7254q;

    /* JADX INFO: renamed from: r */
    public final InterfaceC0003a2 f7255r;

    public t20(y30 y30Var, C0042ay c0042ay, nc1 nc1Var, o31 o31Var, o31 o31Var2) {
        super(y30Var);
        this.f7252o = c0042ay;
        this.f7253p = nc1Var;
        this.f7254q = o31Var;
        this.f7255r = o31Var2;
    }

    @Override // p000.AbstractC0760ub, p000.y30
    public final void onComplete() {
        if (this.f7749m) {
            return;
        }
        try {
            this.f7254q.run();
            this.f7749m = true;
            this.f7746j.onComplete();
            try {
                this.f7255r.run();
            } catch (Throwable th) {
                wo1.m5394u(th);
                vt1.m5196h(th);
            }
        } catch (Throwable th2) {
            wo1.m5394u(th2);
            this.f7747k.cancel();
            onError(th2);
        }
    }

    @Override // p000.AbstractC0760ub, p000.y30
    public final void onError(Throwable th) {
        y30 y30Var = this.f7746j;
        if (this.f7749m) {
            vt1.m5196h(th);
            return;
        }
        this.f7749m = true;
        try {
            this.f7253p.accept(th);
            y30Var.onError(th);
        } catch (Throwable th2) {
            wo1.m5394u(th2);
            y30Var.onError(new C0658rk(th, th2));
        }
        try {
            this.f7255r.run();
        } catch (Throwable th3) {
            wo1.m5394u(th3);
            vt1.m5196h(th3);
        }
    }

    @Override // p000.y30
    public final void onNext(Object obj) {
        if (this.f7749m) {
            return;
        }
        int i = this.f7750n;
        y30 y30Var = this.f7746j;
        if (i != 0) {
            y30Var.onNext(null);
            return;
        }
        try {
            this.f7252o.accept(obj);
            y30Var.onNext(obj);
        } catch (Throwable th) {
            wo1.m5394u(th);
            this.f7747k.cancel();
            onError(th);
        }
    }

    @Override // p000.y71
    public final Object poll() throws Exception {
        InterfaceC0254gm interfaceC0254gm = this.f7253p;
        try {
            Object objPoll = this.f7748l.poll();
            InterfaceC0003a2 interfaceC0003a2 = this.f7255r;
            if (objPoll == null) {
                if (this.f7750n == 1) {
                    this.f7254q.run();
                    interfaceC0003a2.run();
                }
                return objPoll;
            }
            try {
                this.f7252o.accept(objPoll);
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
