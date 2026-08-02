package p000;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class ni0 extends oi0 {
    @Override // p000.oi0
    /* JADX INFO: renamed from: a */
    public final void mo3392a(Object obj, long j) {
        AbstractC0490n0 abstractC0490n0 = (AbstractC0490n0) ((de0) fg1.f2399c.m1207i(obj, j));
        if (abstractC0490n0.f5220j) {
            abstractC0490n0.f5220j = false;
        }
    }

    @Override // p000.oi0
    /* JADX INFO: renamed from: b */
    public final void mo3393b(long j, Object obj, Object obj2) {
        dg1 dg1Var = fg1.f2399c;
        de0 de0VarMo1171i = (de0) dg1Var.m1207i(obj, j);
        de0 de0Var = (de0) dg1Var.m1207i(obj2, j);
        int size = de0VarMo1171i.size();
        int size2 = de0Var.size();
        if (size > 0 && size2 > 0) {
            if (!((AbstractC0490n0) de0VarMo1171i).f5220j) {
                de0VarMo1171i = de0VarMo1171i.mo1171i(size2 + size);
            }
            de0VarMo1171i.addAll(de0Var);
        }
        if (size > 0) {
            de0Var = de0VarMo1171i;
        }
        fg1.m1790p(j, obj, de0Var);
    }

    @Override // p000.oi0
    /* JADX INFO: renamed from: c */
    public final List mo3394c(Object obj, long j) {
        de0 de0Var = (de0) fg1.f2399c.m1207i(obj, j);
        if (((AbstractC0490n0) de0Var).f5220j) {
            return de0Var;
        }
        int size = de0Var.size();
        de0 de0VarMo1171i = de0Var.mo1171i(size == 0 ? 10 : size * 2);
        fg1.m1790p(j, obj, de0VarMo1171i);
        return de0VarMo1171i;
    }
}
