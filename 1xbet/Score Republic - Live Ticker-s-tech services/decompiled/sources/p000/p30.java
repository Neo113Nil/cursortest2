package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class p30 extends n30 {

    /* JADX INFO: renamed from: v */
    public final y30 f5970v;

    public p30(y30 y30Var, f51 f51Var, int i) {
        super(f51Var, i);
        this.f5970v = y30Var;
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
                    this.f5970v.mo933e(this);
                    return;
                }
                if (iMo592f == 2) {
                    this.f5275s = 2;
                    this.f5271o = fz0Var;
                    this.f5970v.mo933e(this);
                    ib1Var.request(this.f5267k);
                    return;
                }
            }
            this.f5271o = new s91(this.f5267k);
            this.f5970v.mo933e(this);
            ib1Var.request(this.f5267k);
        }
    }

    @Override // p000.n30
    /* JADX INFO: renamed from: g */
    public final void mo3474g() {
        y30 y30Var = this.f5970v;
        y71 y71Var = this.f5271o;
        long j = this.f5276t;
        int iAddAndGet = 1;
        while (true) {
            long jAddAndGet = this.f5269m.get();
            while (j != jAddAndGet) {
                boolean z = this.f5273q;
                try {
                    Object objPoll = y71Var.poll();
                    boolean z2 = objPoll == null;
                    if (m3473c(z, z2, y30Var)) {
                        return;
                    }
                    if (z2) {
                        break;
                    }
                    y30Var.onNext(objPoll);
                    j++;
                    if (j == this.f5268l) {
                        if (jAddAndGet != Long.MAX_VALUE) {
                            jAddAndGet = this.f5269m.addAndGet(-j);
                        }
                        this.f5270n.request(j);
                        j = 0;
                    }
                } catch (Throwable th) {
                    wo1.m5394u(th);
                    this.f5272p = true;
                    this.f5270n.cancel();
                    y71Var.clear();
                    y30Var.onError(th);
                    this.f5266j.mo480c();
                    return;
                }
            }
            if (j == jAddAndGet && m3473c(this.f5273q, y71Var.isEmpty(), y30Var)) {
                return;
            }
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

    @Override // p000.n30
    /* JADX INFO: renamed from: h */
    public final void mo3475h() {
        int iAddAndGet = 1;
        while (!this.f5272p) {
            boolean z = this.f5273q;
            this.f5970v.onNext(null);
            if (z) {
                this.f5272p = true;
                Throwable th = this.f5274r;
                y30 y30Var = this.f5970v;
                if (th != null) {
                    y30Var.onError(th);
                } else {
                    y30Var.onComplete();
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
        y30 y30Var = this.f5970v;
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
                        y30Var.onComplete();
                        this.f5266j.mo480c();
                        return;
                    }
                    y30Var.onNext(objPoll);
                    j++;
                } catch (Throwable th) {
                    wo1.m5394u(th);
                    this.f5272p = true;
                    this.f5270n.cancel();
                    y30Var.onError(th);
                    this.f5266j.mo480c();
                    return;
                }
            }
            if (this.f5272p) {
                return;
            }
            if (y71Var.isEmpty()) {
                this.f5272p = true;
                y30Var.onComplete();
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
            long j = this.f5276t + 1;
            if (j == this.f5268l) {
                this.f5276t = 0L;
                this.f5270n.request(j);
                return objPoll;
            }
            this.f5276t = j;
        }
        return objPoll;
    }
}
