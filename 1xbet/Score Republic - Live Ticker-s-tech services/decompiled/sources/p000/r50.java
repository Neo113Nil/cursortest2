package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class r50 implements q50 {

    /* JADX INFO: renamed from: a */
    public final int f6713a;

    /* JADX INFO: renamed from: b */
    public final /* synthetic */ t50 f6714b;

    public r50(t50 t50Var, int i) {
        this.f6714b = t50Var;
        this.f6713a = i;
    }

    @Override // p000.q50
    /* JADX INFO: renamed from: a */
    public final boolean mo4037a(ArrayList arrayList, ArrayList arrayList2) {
        t50 t50Var = this.f6714b;
        c50 c50Var = t50Var.f7322z;
        int i = this.f6713a;
        if (c50Var == null || i >= 0 || !c50Var.m866h().m4707Q()) {
            return t50Var.m4708R(arrayList, arrayList2, i, 1);
        }
        return false;
    }
}
