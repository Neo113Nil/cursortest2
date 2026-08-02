package p000;

import android.view.LayoutInflater;

/* JADX INFO: renamed from: cb */
/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class C0092cb implements ly0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f1209a;

    /* JADX INFO: renamed from: b */
    public final ly0 f1210b;

    /* JADX INFO: renamed from: c */
    public final ly0 f1211c;

    /* JADX INFO: renamed from: d */
    public final ly0 f1212d;

    public /* synthetic */ C0092cb(ly0 ly0Var, ly0 ly0Var2, ly0 ly0Var3, int i) {
        this.f1209a = i;
        this.f1210b = ly0Var;
        this.f1211c = ly0Var2;
        this.f1212d = ly0Var3;
    }

    @Override // p000.ny0
    public final Object get() {
        int i = this.f1209a;
        ly0 ly0Var = this.f1212d;
        ly0 ly0Var2 = this.f1211c;
        ly0 ly0Var3 = this.f1210b;
        switch (i) {
            case 0:
                return new C0056bb((ad0) ly0Var3.get(), (LayoutInflater) ly0Var2.get(), (zc0) ly0Var.get());
            case 1:
                C0209ff c0209ff = new C0209ff((ad0) ly0Var3.get(), (LayoutInflater) ly0Var2.get(), (zc0) ly0Var.get());
                c0209ff.f2393n = new ViewTreeObserverOnGlobalLayoutListenerC0570p6(2, c0209ff);
                return c0209ff;
            case 2:
                cq0 cq0Var = new cq0((ad0) ly0Var3.get(), (LayoutInflater) ly0Var2.get(), (zc0) ly0Var.get());
                cq0Var.f1430m = new ViewTreeObserverOnGlobalLayoutListenerC0570p6(4, cq0Var);
                return cq0Var;
            default:
                return new bc0((ad0) ly0Var3.get(), (LayoutInflater) ly0Var2.get(), (zc0) ((rd0) ly0Var).get());
        }
    }
}
