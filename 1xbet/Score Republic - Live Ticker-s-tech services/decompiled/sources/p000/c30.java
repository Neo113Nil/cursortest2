package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class c30 extends AbstractC0637r {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f1078l;

    /* JADX INFO: renamed from: m */
    public final Object f1079m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c30(g30 g30Var) {
        super(g30Var);
        this.f1078l = 2;
        this.f1079m = EnumC0830w7.f8448j;
    }

    @Override // p000.g20
    /* JADX INFO: renamed from: e */
    public final void mo844e(y30 y30Var) {
        int i = this.f1078l;
        g20 g20Var = this.f6642k;
        Object obj = this.f1079m;
        switch (i) {
            case 0:
                nw0 nw0Var = (nw0) obj;
                if (!(y30Var instanceof InterfaceC0142dl)) {
                    g20Var.m1973d(new b30(y30Var, nw0Var));
                } else {
                    g20Var.m1973d(new a30((InterfaceC0142dl) y30Var, nw0Var, 0));
                }
                break;
            case 1:
                b90 b90Var = (b90) obj;
                if (!(y30Var instanceof InterfaceC0142dl)) {
                    g20Var.m1973d(new m30(y30Var, b90Var));
                } else {
                    g20Var.m1973d(new a30((InterfaceC0142dl) y30Var, b90Var, 1));
                }
                break;
            default:
                try {
                    ((EnumC0830w7) obj).getClass();
                    ArrayList arrayList = new ArrayList();
                    z30 z30Var = new z30(y30Var);
                    z30Var.f6569k = arrayList;
                    g20Var.m1973d(z30Var);
                } catch (Throwable th) {
                    wo1.m5394u(th);
                    EnumC0559ow.m3802b(th, y30Var);
                    return;
                }
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c30(g20 g20Var, Object obj, int i) {
        super(g20Var);
        this.f1078l = i;
        this.f1079m = obj;
    }
}
