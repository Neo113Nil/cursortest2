package p000;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class m22 extends ct1 {

    /* JADX INFO: renamed from: k */
    public final oq0 f4963k;

    public m22(oq0 oq0Var) {
        this.f4963k = oq0Var;
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // p000.ct1, p000.ht1
    /* JADX INFO: renamed from: g */
    public final ht1 mo754g(String str, f71 f71Var, ArrayList arrayList) {
        int iHashCode = str.hashCode();
        oq0 oq0Var = this.f4963k;
        switch (iHashCode) {
            case 21624207:
                if (str.equals("getEventName")) {
                    wo1.m5396w("getEventName", 0, arrayList);
                    return new lt1(((pm1) oq0Var.f5841l).f6212a);
                }
                break;
            case 45521504:
                if (str.equals("getTimestamp")) {
                    wo1.m5396w("getTimestamp", 0, arrayList);
                    return new gr1(Double.valueOf(((pm1) oq0Var.f5841l).f6213b));
                }
                break;
            case 146575578:
                if (str.equals("getParamValue")) {
                    wo1.m5396w("getParamValue", 1, arrayList);
                    String strMo753f = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0)).mo753f();
                    HashMap map = ((pm1) oq0Var.f5841l).f6214c;
                    return j22.m2786E(map.containsKey(strMo753f) ? map.get(strMo753f) : null);
                }
                break;
            case 700587132:
                if (str.equals("getParams")) {
                    wo1.m5396w("getParams", 0, arrayList);
                    HashMap map2 = ((pm1) oq0Var.f5841l).f6214c;
                    ct1 ct1Var = new ct1();
                    for (String str2 : map2.keySet()) {
                        ct1Var.mo751c(str2, j22.m2786E(map2.get(str2)));
                    }
                    return ct1Var;
                }
                break;
            case 920706790:
                if (str.equals("setParamValue")) {
                    wo1.m5396w("setParamValue", 2, arrayList);
                    String strMo753f2 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0)).mo753f();
                    ht1 ht1VarM96t = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(1));
                    pm1 pm1Var = (pm1) oq0Var.f5841l;
                    Object objM5375F = wo1.m5375F(ht1VarM96t);
                    HashMap map3 = pm1Var.f6214c;
                    if (objM5375F == null) {
                        map3.remove(strMo753f2);
                        return ht1VarM96t;
                    }
                    map3.put(strMo753f2, pm1.m3970b(map3.get(strMo753f2), objM5375F, strMo753f2));
                    return ht1VarM96t;
                }
                break;
            case 1570616835:
                if (str.equals("setEventName")) {
                    wo1.m5396w("setEventName", 1, arrayList);
                    ht1 ht1VarM96t2 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) arrayList.get(0));
                    if (ht1.f3330b.equals(ht1VarM96t2) || ht1.f3331c.equals(ht1VarM96t2)) {
                        C0270h1.m2190f("Illegal event name");
                        return null;
                    }
                    ((pm1) oq0Var.f5841l).f6212a = ht1VarM96t2.mo753f();
                    return new lt1(ht1VarM96t2.mo753f());
                }
                break;
        }
        return super.mo754g(str, f71Var, arrayList);
    }
}
