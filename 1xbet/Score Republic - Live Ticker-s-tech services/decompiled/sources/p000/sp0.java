package p000;

import android.util.SparseArray;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class sp0 {

    /* JADX INFO: renamed from: a */
    public final SparseArray f7184a;

    /* JADX INFO: renamed from: b */
    public af1 f7185b;

    public sp0(int i) {
        this.f7184a = new SparseArray(i);
    }

    /* JADX INFO: renamed from: a */
    public final void m4574a(af1 af1Var, int i, int i2) {
        int iM201a = af1Var.m201a(i);
        SparseArray sparseArray = this.f7184a;
        sp0 sp0Var = sparseArray == null ? null : (sp0) sparseArray.get(iM201a);
        if (sp0Var == null) {
            sp0Var = new sp0(1);
            sparseArray.put(af1Var.m201a(i), sp0Var);
        }
        if (i2 > i) {
            sp0Var.m4574a(af1Var, i + 1, i2);
        } else {
            sp0Var.f7185b = af1Var;
        }
    }
}
