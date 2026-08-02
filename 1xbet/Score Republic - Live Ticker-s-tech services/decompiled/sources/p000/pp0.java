package p000;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class pp0 implements InterfaceC0968zy {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6226a;

    /* JADX INFO: renamed from: b */
    public final ny0 f6227b;

    /* JADX INFO: renamed from: c */
    public final ny0 f6228c;

    public /* synthetic */ pp0(ny0 ny0Var, ny0 ny0Var2, int i) {
        this.f6226a = i;
        this.f6227b = ny0Var;
        this.f6228c = ny0Var2;
    }

    @Override // p000.ny0
    public final Object get() {
        int i = this.f6226a;
        ny0 ny0Var = this.f6227b;
        switch (i) {
            case 0:
                return new op0((Context) ((C0735tn) ny0Var).f7534b, (qd0) ((C0735tn) this.f6228c).get());
            default:
                return new g41(new aa0(20), new x80(18), C0906y9.f9221f, (u51) ny0Var.get(), this.f6228c);
        }
    }
}
