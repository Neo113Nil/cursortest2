package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ys0 implements ft0, dz0 {

    /* JADX INFO: renamed from: j */
    public final ft0 f9454j;

    /* JADX INFO: renamed from: k */
    public InterfaceC0187eu f9455k;

    /* JADX INFO: renamed from: l */
    public dz0 f9456l;

    /* JADX INFO: renamed from: m */
    public boolean f9457m;

    /* JADX INFO: renamed from: n */
    public final /* synthetic */ int f9458n;

    /* JADX INFO: renamed from: o */
    public final Object f9459o;

    public ys0(ft0 ft0Var, Object obj, int i) {
        this.f9458n = i;
        this.f9454j = ft0Var;
        this.f9459o = obj;
    }

    @Override // p000.ft0
    /* JADX INFO: renamed from: a */
    public final void mo172a(InterfaceC0187eu interfaceC0187eu) {
        if (EnumC0262gu.m2150f(this.f9455k, interfaceC0187eu)) {
            this.f9455k = interfaceC0187eu;
            if (interfaceC0187eu instanceof dz0) {
                this.f9456l = (dz0) interfaceC0187eu;
            }
            this.f9454j.mo172a(this);
        }
    }

    @Override // p000.InterfaceC0187eu
    /* JADX INFO: renamed from: c */
    public final void mo480c() {
        this.f9455k.mo480c();
    }

    @Override // p000.y71
    public final void clear() {
        this.f9456l.clear();
    }

    @Override // p000.y71
    public final boolean isEmpty() {
        return this.f9456l.isEmpty();
    }

    @Override // p000.y71
    public final boolean offer(Object obj) {
        throw new UnsupportedOperationException("Should not be called!");
    }

    @Override // p000.ft0
    public final void onComplete() {
        if (this.f9457m) {
            return;
        }
        this.f9457m = true;
        this.f9454j.onComplete();
    }

    @Override // p000.ft0
    public final void onError(Throwable th) {
        if (this.f9457m) {
            vt1.m5196h(th);
        } else {
            this.f9457m = true;
            this.f9454j.onError(th);
        }
    }

    @Override // p000.ft0
    public final void onNext(Object obj) {
        int i = this.f9458n;
        ft0 ft0Var = this.f9454j;
        Object obj2 = this.f9459o;
        switch (i) {
            case 0:
                try {
                    if (((vz0) obj2).test(obj)) {
                        ft0Var.onNext(obj);
                    }
                } catch (Throwable th) {
                    wo1.m5394u(th);
                    this.f9455k.mo480c();
                    onError(th);
                    return;
                }
                break;
            default:
                if (!this.f9457m) {
                    try {
                        Object objApply = ((r60) obj2).apply(obj);
                        zg1.m5905p(objApply, "The mapper function returned a null value.");
                        ft0Var.onNext(objApply);
                    } catch (Throwable th2) {
                        wo1.m5394u(th2);
                        this.f9455k.mo480c();
                        onError(th2);
                    }
                    break;
                }
                break;
        }
    }

    @Override // p000.y71
    public final Object poll() {
        Object objPoll;
        int i = this.f9458n;
        Object obj = this.f9459o;
        switch (i) {
            case 0:
                break;
            default:
                Object objPoll2 = this.f9456l.poll();
                if (objPoll2 == null) {
                    return null;
                }
                Object objApply = ((r60) obj).apply(objPoll2);
                zg1.m5905p(objApply, "The mapper function returned a null value.");
                return objApply;
        }
        do {
            objPoll = this.f9456l.poll();
            if (objPoll != null) {
            }
            return objPoll;
        } while (!((vz0) obj).test(objPoll));
        return objPoll;
    }
}
