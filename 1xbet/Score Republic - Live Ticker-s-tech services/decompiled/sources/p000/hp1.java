package p000;

import java.util.AbstractList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class hp1 extends AbstractList {

    /* JADX INFO: renamed from: j */
    public final fp1 f3293j;

    /* JADX INFO: renamed from: k */
    public final gp1 f3294k;

    public hp1(fp1 fp1Var, gp1 gp1Var) {
        this.f3293j = fp1Var;
        this.f3294k = gp1Var;
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int iM457d = ((ap1) this.f3293j).m457d(i);
        ((zw1) this.f3294k).getClass();
        zn1 zn1VarM5941b = zn1.m5941b(iM457d);
        return zn1VarM5941b == null ? zn1.f9866k : zn1VarM5941b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return ((ap1) this.f3293j).f591l;
    }
}
