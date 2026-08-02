package p000;

import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class x30 extends g20 {

    /* JADX INFO: renamed from: k */
    public final Object f8775k;

    /* JADX INFO: renamed from: l */
    public final r60 f8776l;

    public x30(Object obj, r60 r60Var) {
        this.f8775k = obj;
        this.f8776l = r60Var;
    }

    @Override // p000.g20
    /* JADX INFO: renamed from: e */
    public final void mo844e(y30 y30Var) {
        try {
            Object objApply = this.f8776l.apply(this.f8775k);
            zg1.m5905p(objApply, "The mapper returned a null Publisher");
            vy0 vy0Var = (vy0) objApply;
            if (!(vy0Var instanceof Callable)) {
                vy0Var.mo1970a(y30Var);
                return;
            }
            try {
                Object objCall = ((Callable) vy0Var).call();
                if (objCall == null) {
                    EnumC0559ow.m3801a(y30Var);
                } else {
                    y30Var.mo933e(new b51(y30Var, objCall));
                }
            } catch (Throwable th) {
                wo1.m5394u(th);
                EnumC0559ow.m3802b(th, y30Var);
            }
        } catch (Throwable th2) {
            EnumC0559ow.m3802b(th2, y30Var);
        }
    }
}
