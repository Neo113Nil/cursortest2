package p000;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class a30 extends AbstractC0723tb {

    /* JADX INFO: renamed from: o */
    public final /* synthetic */ int f31o;

    /* JADX INFO: renamed from: p */
    public final Object f32p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ a30(InterfaceC0142dl interfaceC0142dl, Object obj, int i) {
        super(interfaceC0142dl);
        this.f31o = i;
        this.f32p = obj;
    }

    @Override // p000.InterfaceC0142dl
    /* JADX INFO: renamed from: d */
    public final boolean mo21d(Object obj) {
        int i = this.f31o;
        InterfaceC0142dl interfaceC0142dl = this.f7398j;
        Object obj2 = this.f32p;
        switch (i) {
            case 0:
                if (!this.f7401m) {
                    if (this.f7402n != 0) {
                        return interfaceC0142dl.mo21d(null);
                    }
                    try {
                        if (((nw0) obj2).test(obj) && interfaceC0142dl.mo21d(obj)) {
                            return true;
                        }
                    } catch (Throwable th) {
                        m4780a(th);
                        return true;
                    }
                }
                return false;
            default:
                if (this.f7401m) {
                    return false;
                }
                try {
                    Object objApply = ((r60) obj2).apply(obj);
                    zg1.m5905p(objApply, "The mapper function returned a null value.");
                    return interfaceC0142dl.mo21d(objApply);
                } catch (Throwable th2) {
                    m4780a(th2);
                    return true;
                }
        }
    }

    @Override // p000.y30
    public final void onNext(Object obj) {
        switch (this.f31o) {
            case 0:
                if (!mo21d(obj)) {
                    this.f7399k.request(1L);
                }
                break;
            default:
                if (!this.f7401m) {
                    int i = this.f7402n;
                    InterfaceC0142dl interfaceC0142dl = this.f7398j;
                    if (i != 0) {
                        interfaceC0142dl.onNext(null);
                    } else {
                        try {
                            Object objApply = ((r60) this.f32p).apply(obj);
                            zg1.m5905p(objApply, "The mapper function returned a null value.");
                            interfaceC0142dl.onNext(objApply);
                        } catch (Throwable th) {
                            m4780a(th);
                        }
                    }
                    break;
                }
                break;
        }
    }

    @Override // p000.y71
    public final Object poll() {
        int i = this.f31o;
        Object obj = this.f32p;
        switch (i) {
            case 0:
                fz0 fz0Var = this.f7400l;
                nw0 nw0Var = (nw0) obj;
                while (true) {
                    Object objPoll = fz0Var.poll();
                    if (objPoll == null) {
                        return null;
                    }
                    if (nw0Var.test(objPoll)) {
                        return objPoll;
                    }
                    if (this.f7402n == 2) {
                        fz0Var.request(1L);
                    }
                }
                break;
            default:
                Object objPoll2 = this.f7400l.poll();
                if (objPoll2 == null) {
                    return null;
                }
                Object objApply = ((r60) obj).apply(objPoll2);
                zg1.m5905p(objApply, "The mapper function returned a null value.");
                return objApply;
        }
    }
}
