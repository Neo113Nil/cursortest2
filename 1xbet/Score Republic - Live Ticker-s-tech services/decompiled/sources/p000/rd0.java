package p000;

import android.app.Application;
import android.view.LayoutInflater;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class rd0 implements ly0 {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f6824a;

    /* JADX INFO: renamed from: b */
    public final qd0 f6825b;

    public /* synthetic */ rd0(qd0 qd0Var, int i) {
        this.f6824a = i;
        this.f6825b = qd0Var;
    }

    @Override // p000.ny0
    public final Object get() {
        int i = this.f6824a;
        qd0 qd0Var = this.f6825b;
        switch (i) {
            case 0:
                ad0 ad0Var = (ad0) qd0Var.f6472l;
                af0.m188b(ad0Var);
                return ad0Var;
            case 1:
                zc0 zc0Var = (zc0) qd0Var.f6471k;
                af0.m188b(zc0Var);
                return zc0Var;
            default:
                LayoutInflater layoutInflater = (LayoutInflater) ((Application) qd0Var.f6473m).getSystemService("layout_inflater");
                af0.m188b(layoutInflater);
                return layoutInflater;
        }
    }
}
