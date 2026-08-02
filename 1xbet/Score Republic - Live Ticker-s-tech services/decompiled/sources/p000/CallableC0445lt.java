package p000;

import java.util.concurrent.Callable;

/* JADX INFO: renamed from: lt */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class CallableC0445lt implements Callable, r60 {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ int f4897j;

    /* JADX INFO: renamed from: k */
    public final Object f4898k;

    public CallableC0445lt(b12 b12Var, fu1 fu1Var, String str) {
        this.f4897j = 3;
        this.f4898k = b12Var;
    }

    @Override // p000.r60
    public Object apply(Object obj) {
        return this.f4898k;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f4897j) {
            case 0:
                synchronized (((C0556ot) this.f4898k)) {
                    try {
                        C0556ot c0556ot = (C0556ot) this.f4898k;
                        if (c0556ot.f5862r != null) {
                            c0556ot.m3766v();
                            if (((C0556ot) this.f4898k).m3761o()) {
                                ((C0556ot) this.f4898k).m3765t();
                                ((C0556ot) this.f4898k).f5864t = 0;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return null;
            case 1:
                return this.f4898k;
            case 2:
                return new y12(((sz1) this.f4898k).f7242u);
            case 3:
                b12 b12Var = (b12) this.f4898k;
                b12Var.f681b.m5550W();
                ry1 ry1Var = b12Var.f681b.f8828q;
                x62.m5533U(ry1Var);
                ry1Var.mo11z();
                throw new IllegalStateException("Unexpected call on client side");
            default:
                a81 a81Var = (a81) this.f4898k;
                synchronized (((a92) a81Var.f64l).f102g) {
                    a81Var.f63k = null;
                    break;
                }
                return null;
        }
    }

    public /* synthetic */ CallableC0445lt(int i, Object obj) {
        this.f4897j = i;
        this.f4898k = obj;
    }
}
