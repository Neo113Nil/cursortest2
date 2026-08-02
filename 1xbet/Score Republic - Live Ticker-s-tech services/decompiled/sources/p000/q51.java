package p000;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class q51 implements InterfaceC0968zy {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6383a;

    /* JADX INFO: renamed from: b */
    public final ny0 f6384b;

    /* JADX INFO: renamed from: c */
    public final ny0 f6385c;

    /* JADX INFO: renamed from: d */
    public final InterfaceC0968zy f6386d;

    public /* synthetic */ q51(ny0 ny0Var, ny0 ny0Var2, InterfaceC0968zy interfaceC0968zy, int i) {
        this.f6383a = i;
        this.f6384b = ny0Var;
        this.f6385c = ny0Var2;
        this.f6386d = interfaceC0968zy;
    }

    @Override // p000.ny0
    public final Object get() {
        int i = this.f6383a;
        InterfaceC0968zy interfaceC0968zy = this.f6386d;
        ny0 ny0Var = this.f6385c;
        ny0 ny0Var2 = this.f6384b;
        switch (i) {
            case 0:
                return new qd0((Context) ny0Var2.get(), (g41) ny0Var.get(), (C0500na) ((C0745tx) interfaceC0968zy).get(), 25);
            default:
                return new se1(new aa0(20), new x80(18), (C0035ar) ((C0072br) ny0Var2).get(), (ng1) ((og1) ny0Var).get(), (f71) ((qk1) interfaceC0968zy).get());
        }
    }
}
