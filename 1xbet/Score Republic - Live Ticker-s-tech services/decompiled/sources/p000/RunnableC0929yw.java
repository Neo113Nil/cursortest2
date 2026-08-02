package p000;

/* JADX INFO: renamed from: yw */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class RunnableC0929yw implements Runnable {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f9520j;

    /* JADX INFO: renamed from: k */
    public final h81 f9521k;

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ C0078bx f9522l;

    public /* synthetic */ RunnableC0929yw(C0078bx c0078bx, h81 h81Var, int i) {
        this.f9520j = i;
        this.f9522l = c0078bx;
        this.f9521k = h81Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f9520j) {
            case 0:
                h81 h81Var = this.f9521k;
                h81Var.f3101b.m2011a();
                synchronized (h81Var.f3102c) {
                    synchronized (this.f9522l) {
                        try {
                            if (this.f9522l.f1022j.f653j.contains(new C0966zw(this.f9521k, wm1.f8587b))) {
                                C0078bx c0078bx = this.f9522l;
                                h81 h81Var2 = this.f9521k;
                                c0078bx.getClass();
                                try {
                                    h81Var2.m2232f(c0078bx.f1038z, 5);
                                } catch (Throwable th) {
                                    throw new C0246ge(th);
                                }
                            }
                            this.f9522l.m791c();
                        } catch (Throwable th2) {
                            throw th2;
                        }
                        break;
                    }
                }
                return;
            default:
                h81 h81Var3 = this.f9521k;
                h81Var3.f3101b.m2011a();
                synchronized (h81Var3.f3102c) {
                    synchronized (this.f9522l) {
                        try {
                            if (this.f9522l.f1022j.f653j.contains(new C0966zw(this.f9521k, wm1.f8587b))) {
                                this.f9522l.f1019B.m1323a();
                                C0078bx c0078bx2 = this.f9522l;
                                h81 h81Var4 = this.f9521k;
                                c0078bx2.getClass();
                                try {
                                    h81Var4.m2233g(c0078bx2.f1019B, c0078bx2.f1036x);
                                    this.f9522l.m795g(this.f9521k);
                                } catch (Throwable th3) {
                                    throw new C0246ge(th3);
                                }
                            }
                            this.f9522l.m791c();
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
                return;
        }
    }
}
