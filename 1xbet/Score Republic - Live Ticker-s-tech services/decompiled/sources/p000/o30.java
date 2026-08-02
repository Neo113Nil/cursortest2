package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class o30 extends n30 {

    /* JADX INFO: renamed from: v */
    public final InterfaceC0142dl f5601v;

    /* JADX INFO: renamed from: w */
    public long f5602w;

    public o30(InterfaceC0142dl interfaceC0142dl, f51 f51Var, int i) {
        super(f51Var, i);
        this.f5601v = interfaceC0142dl;
    }

    @Override // p000.y30
    /* JADX INFO: renamed from: e */
    public final void mo933e(ib1 ib1Var) {
        if (jb1.m2846d(this.f5270n, ib1Var)) {
            this.f5270n = ib1Var;
            if (ib1Var instanceof fz0) {
                fz0 fz0Var = (fz0) ib1Var;
                int iMo592f = fz0Var.mo592f(7);
                if (iMo592f == 1) {
                    this.f5275s = 1;
                    this.f5271o = fz0Var;
                    this.f5273q = true;
                    this.f5601v.mo933e(this);
                    return;
                }
                if (iMo592f == 2) {
                    this.f5275s = 2;
                    this.f5271o = fz0Var;
                    this.f5601v.mo933e(this);
                    ib1Var.request(this.f5267k);
                    return;
                }
            }
            this.f5271o = new s91(this.f5267k);
            this.f5601v.mo933e(this);
            ib1Var.request(this.f5267k);
        }
    }

    @Override // p000.n30
    /* JADX INFO: renamed from: g */
    public final void mo3474g() {
        InterfaceC0142dl interfaceC0142dl = this.f5601v;
        y71 y71Var = this.f5271o;
        long j = this.f5276t;
        long j2 = this.f5602w;
        int iAddAndGet = 1;
        while (true) {
            long j3 = this.f5269m.get();
            while (j != j3) {
                boolean z = this.f5273q;
                try {
                    Object objPoll = y71Var.poll();
                    boolean z2 = objPoll == null;
                    if (m3473c(z, z2, interfaceC0142dl)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    if (interfaceC0142dl.mo21d(objPoll)) {
                        j++;
                    }
                    j2++;
                    if (j2 == this.f5268l) {
                        this.f5270n.request(j2);
                        j2 = 0;
                    }
                } catch (Throwable th) {
                    wo1.m5394u(th);
                    this.f5272p = true;
                    this.f5270n.cancel();
                    y71Var.clear();
                    interfaceC0142dl.onError(th);
                    this.f5266j.mo480c();
                    return;
                }
            }
            if (j == j3 && m3473c(this.f5273q, y71Var.isEmpty(), interfaceC0142dl)) {
                return;
            }
            int i = get();
            if (iAddAndGet == i) {
                this.f5276t = j;
                this.f5602w = j2;
                iAddAndGet = addAndGet(-iAddAndGet);
                if (iAddAndGet == 0) {
                    return;
                }
            } else {
                iAddAndGet = i;
            }
        }
    }

    @Override // p000.n30
    /* JADX INFO: renamed from: h */
    public final void mo3475h() {
        int iAddAndGet = 1;
        while (!this.f5272p) {
            boolean z = this.f5273q;
            this.f5601v.onNext(null);
            if (z) {
                this.f5272p = true;
                Throwable th = this.f5274r;
                InterfaceC0142dl interfaceC0142dl = this.f5601v;
                if (th != null) {
                    interfaceC0142dl.onError(th);
                } else {
                    interfaceC0142dl.onComplete();
                }
                this.f5266j.mo480c();
                return;
            }
            iAddAndGet = addAndGet(-iAddAndGet);
            if (iAddAndGet == 0) {
                return;
            }
        }
    }

    @Override // p000.n30
    /* JADX INFO: renamed from: i */
    public final void mo3476i() {
        InterfaceC0142dl interfaceC0142dl = this.f5601v;
        y71 y71Var = this.f5271o;
        long j = this.f5276t;
        int iAddAndGet = 1;
        while (true) {
            long j2 = this.f5269m.get();
            while (j != j2) {
                try {
                    Object objPoll = y71Var.poll();
                    if (this.f5272p) {
                        return;
                    }
                    if (objPoll == null) {
                        this.f5272p = true;
                        interfaceC0142dl.onComplete();
                        this.f5266j.mo480c();
                        return;
                    } else if (interfaceC0142dl.mo21d(objPoll)) {
                        j++;
                    }
                } catch (Throwable th) {
                    wo1.m5394u(th);
                    this.f5272p = true;
                    this.f5270n.cancel();
                    interfaceC0142dl.onError(th);
                    this.f5266j.mo480c();
                    return;
                }
            }
            if (this.f5272p) {
                return;
            }
            if (y71Var.isEmpty()) {
                this.f5272p = true;
                interfaceC0142dl.onComplete();
                this.f5266j.mo480c();
                return;
            } else {
                int i = get();
                if (iAddAndGet == i) {
                    this.f5276t = j;
                    iAddAndGet = addAndGet(-iAddAndGet);
                    if (iAddAndGet == 0) {
                        return;
                    }
                } else {
                    iAddAndGet = i;
                }
            }
        }
    }

    @Override // p000.y71
    public final Object poll() {
        Object objPoll = this.f5271o.poll();
        if (objPoll != null && this.f5275s != 1) {
            long j = this.f5602w + 1;
            if (j == this.f5268l) {
                this.f5602w = 0L;
                this.f5270n.request(j);
                return objPoll;
            }
            this.f5602w = j;
        }
        return objPoll;
    }
}
