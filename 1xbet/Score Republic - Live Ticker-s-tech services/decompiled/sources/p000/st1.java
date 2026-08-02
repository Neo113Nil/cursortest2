package p000;

import java.util.Arrays;
import java.util.Comparator;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class st1 implements Comparator {

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ bs1 f7211j;

    /* JADX INFO: renamed from: k */
    public final /* synthetic */ f71 f7212k;

    public st1(bs1 bs1Var, f71 f71Var) {
        this.f7211j = bs1Var;
        this.f7212k = f71Var;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        ht1 ht1Var = (ht1) obj;
        ht1 ht1Var2 = (ht1) obj2;
        if (ht1Var instanceof nt1) {
            return !(ht1Var2 instanceof nt1) ? 1 : 0;
        }
        if (ht1Var2 instanceof nt1) {
            return -1;
        }
        bs1 bs1Var = this.f7211j;
        return bs1Var == null ? ht1Var.mo753f().compareTo(ht1Var2.mo753f()) : (int) wo1.m5374E(bs1Var.mo749a(this.f7212k, Arrays.asList(ht1Var, ht1Var2)).mo755h().doubleValue());
    }
}
