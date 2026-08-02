package p000;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class r20 extends g20 {

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ int f6665k;

    /* JADX INFO: renamed from: l */
    public final Object f6666l;

    public /* synthetic */ r20(int i, Object obj) {
        this.f6665k = i;
        this.f6666l = obj;
    }

    /* JADX INFO: renamed from: f */
    public static void m4235f(y30 y30Var, Iterator it) {
        try {
            if (!it.hasNext()) {
                EnumC0559ow.m3801a(y30Var);
            } else if (y30Var instanceof InterfaceC0142dl) {
                y30Var.mo933e(new j30((InterfaceC0142dl) y30Var, it, 0));
            } else {
                y30Var.mo933e(new j30(y30Var, it, 1));
            }
        } catch (Throwable th) {
            wo1.m5394u(th);
            EnumC0559ow.m3802b(th, y30Var);
        }
    }

    @Override // p000.g20
    /* JADX INFO: renamed from: e */
    public final void mo844e(y30 y30Var) {
        n20 q20Var;
        int i = this.f6665k;
        Object obj = this.f6666l;
        switch (i) {
            case 0:
                int iM292o = AbstractC0024an.m292o(3);
                if (iM292o == 0) {
                    q20Var = new q20(y30Var);
                } else if (iM292o == 1) {
                    q20Var = new p20(y30Var, 1);
                } else if (iM292o != 3) {
                    q20Var = iM292o != 4 ? new o20(y30Var, g20.f2582j) : new o20(y30Var);
                } else {
                    q20Var = new p20(y30Var, 0);
                }
                y30Var.mo933e(q20Var);
                try {
                    ((s30) obj).mo1170b(q20Var);
                } catch (Throwable th) {
                    wo1.m5394u(th);
                    q20Var.m3468c(th);
                    return;
                }
                break;
            case 1:
                Object[] objArr = (Object[]) obj;
                if (!(y30Var instanceof InterfaceC0142dl)) {
                    y30Var.mo933e(new i30(y30Var, objArr, 1));
                } else {
                    y30Var.mo933e(new i30((InterfaceC0142dl) y30Var, objArr, 0));
                }
                break;
            case 2:
                try {
                    m4235f(y30Var, ((de0) obj).iterator());
                } catch (Throwable th2) {
                    wo1.m5394u(th2);
                    EnumC0559ow.m3802b(th2, y30Var);
                    return;
                }
                break;
            case 3:
                ((AbstractC0959zp) obj).m5993v(new k30(y30Var));
                break;
            default:
                ((hm0) obj).m2293b(new zm0(y30Var));
                break;
        }
    }
}
