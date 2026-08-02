package p000;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class g30 extends AbstractC0637r {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f2589l = 1;

    /* JADX INFO: renamed from: m */
    public final int f2590m;

    /* JADX INFO: renamed from: n */
    public final Object f2591n;

    public g30(g20 g20Var, r60 r60Var) {
        super(g20Var);
        this.f2591n = r60Var;
        this.f2590m = Integer.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p000.g20
    /* JADX INFO: renamed from: e */
    public final void mo844e(y30 y30Var) {
        int i = this.f2589l;
        g20 g20Var = this.f6642k;
        Object obj = this.f2591n;
        int i2 = this.f2590m;
        switch (i) {
            case 0:
                g20Var.m1973d(new f30(y30Var, (r60) obj, i2));
                break;
            case 1:
                wa0 wa0Var = (wa0) obj;
                if (!(g20Var instanceof Callable)) {
                    g20Var.m1973d(new h30(y30Var, wa0Var, i2));
                } else {
                    try {
                        Object objCall = ((Callable) g20Var).call();
                        if (objCall == null) {
                            EnumC0559ow.m3801a(y30Var);
                        } else {
                            try {
                                wa0Var.getClass();
                                r20.m4235f(y30Var, ((Iterable) objCall).iterator());
                            } catch (Throwable th) {
                                wo1.m5394u(th);
                                EnumC0559ow.m3802b(th, y30Var);
                                return;
                            }
                        }
                    } catch (Throwable th2) {
                        wo1.m5394u(th2);
                        EnumC0559ow.m3802b(th2, y30Var);
                        return;
                    }
                }
                break;
            default:
                f51 f51VarMo1301a = ((g51) obj).mo1301a();
                if (!(y30Var instanceof InterfaceC0142dl)) {
                    g20Var.m1973d(new p30(y30Var, f51VarMo1301a, i2));
                } else {
                    g20Var.m1973d(new o30((InterfaceC0142dl) y30Var, f51VarMo1301a, i2));
                }
                break;
        }
    }

    public g30(g20 g20Var, g51 g51Var, int i) {
        super(g20Var);
        this.f2591n = g51Var;
        this.f2590m = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g30(c30 c30Var, int i) {
        super(c30Var);
        wa0 wa0Var = t22.f7257b;
        this.f2591n = wa0Var;
        this.f2590m = i;
    }
}
