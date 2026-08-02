package p000;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public interface zs1 {
    /* JADX INFO: renamed from: d */
    static ht1 m6030d(zs1 zs1Var, lt1 lt1Var, f71 f71Var, ArrayList arrayList) {
        String str = lt1Var.f4908j;
        if (!zs1Var.mo757l(str)) {
            if ("hasOwnProperty".equals(str)) {
                wo1.m5396w("hasOwnProperty", 1, arrayList);
                return zs1Var.mo757l(((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0)).mo753f()) ? ht1.f3335g : ht1.f3336h;
            }
            C0270h1.m2190f(AbstractC0024an.m283f("Object has no function ", str));
            return null;
        }
        ht1 ht1VarMo756j = zs1Var.mo756j(str);
        if (ht1VarMo756j instanceof bs1) {
            return ((bs1) ht1VarMo756j).mo749a(f71Var, arrayList);
        }
        throw new IllegalArgumentException(str + " is not a function");
    }

    /* JADX INFO: renamed from: c */
    void mo751c(String str, ht1 ht1Var);

    /* JADX INFO: renamed from: j */
    ht1 mo756j(String str);

    /* JADX INFO: renamed from: l */
    boolean mo757l(String str);
}
