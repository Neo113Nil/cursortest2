package p000;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class y12 extends bs1 {

    /* JADX INFO: renamed from: l */
    public final /* synthetic */ int f9130l = 4;

    /* JADX INFO: renamed from: m */
    public final Object f9131m;

    public y12(an0 an0Var) {
        super("internal.logger");
        this.f9131m = an0Var;
        this.f975k.put("log", new j82(this, false, true));
        this.f975k.put("silent", new m42("silent", 1));
        ((bs1) this.f975k.get("silent")).mo751c("log", new j82(this, true, true));
        this.f975k.put("unmonitored", new m42("unmonitored", 2));
        ((bs1) this.f975k.get("unmonitored")).mo751c("log", new j82(this, false, false));
    }

    @Override // p000.bs1
    /* JADX INFO: renamed from: a */
    public final ht1 mo749a(f71 f71Var, List list) {
        TreeMap treeMap;
        int i = this.f9130l;
        String str = this.f974j;
        nt1 nt1Var = ht1.f3330b;
        Object obj = this.f9131m;
        String str2 = null;
        switch (i) {
            case 0:
                wo1.m5396w(str, 3, list);
                String strMo753f = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) list.get(0)).mo753f();
                ht1 ht1Var = (ht1) list.get(1);
                a81 a81Var = (a81) f71Var.f2335l;
                long jM5374E = (long) wo1.m5374E(a81Var.m96t(f71Var, ht1Var).mo755h().doubleValue());
                ht1 ht1VarM96t = a81Var.m96t(f71Var, (ht1) list.get(2));
                HashMap mapM5376G = ht1VarM96t instanceof ct1 ? wo1.m5376G((ct1) ht1VarM96t) : new HashMap();
                oq0 oq0Var = (oq0) obj;
                oq0Var.getClass();
                HashMap map = new HashMap();
                for (String str3 : mapM5376G.keySet()) {
                    HashMap map2 = ((pm1) oq0Var.f5840k).f6214c;
                    map.put(str3, pm1.m3970b(map2.containsKey(str3) ? map2.get(str3) : null, mapM5376G.get(str3), str3));
                }
                ((ArrayList) oq0Var.f5842m).add(new pm1(strMo753f, jM5374E, map));
                return nt1Var;
            case 1:
                wo1.m5396w("getValue", 2, list);
                ht1 ht1VarM96t2 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) list.get(0));
                ht1 ht1VarM96t3 = ((a81) f71Var.f2335l).m96t(f71Var, (ht1) list.get(1));
                String strMo753f2 = ht1VarM96t2.mo753f();
                a81 a81Var2 = (a81) obj;
                Map map3 = (Map) ((sz1) a81Var2.f64l).f7234m.get((String) a81Var2.f63k);
                if (map3 != null && map3.containsKey(strMo753f2)) {
                    str2 = (String) map3.get(strMo753f2);
                }
                return str2 != null ? new lt1(str2) : ht1VarM96t3;
            case 2:
                return nt1Var;
            case 3:
                try {
                    return j22.m2786E(((nz1) obj).call());
                } catch (Exception unused) {
                    return nt1Var;
                }
            default:
                wo1.m5396w(str, 3, list);
                ((a81) f71Var.f2335l).m96t(f71Var, (ht1) list.get(0)).mo753f();
                ht1 ht1Var2 = (ht1) list.get(1);
                a81 a81Var3 = (a81) f71Var.f2335l;
                ht1 ht1VarM96t4 = a81Var3.m96t(f71Var, ht1Var2);
                if (ht1VarM96t4 instanceof ft1) {
                    ht1 ht1VarM96t5 = a81Var3.m96t(f71Var, (ht1) list.get(2));
                    if (ht1VarM96t5 instanceof ct1) {
                        ct1 ct1Var = (ct1) ht1VarM96t5;
                        HashMap map4 = ct1Var.f1452j;
                        if (map4.containsKey("type")) {
                            String strMo753f3 = ct1Var.mo756j("type").mo753f();
                            int iM5373D = map4.containsKey("priority") ? wo1.m5373D(ct1Var.mo756j("priority").mo755h().doubleValue()) : 1000;
                            a81 a81Var4 = (a81) obj;
                            ft1 ft1Var = (ft1) ht1VarM96t4;
                            a81Var4.getClass();
                            if ("create".equals(strMo753f3)) {
                                treeMap = (TreeMap) a81Var4.f64l;
                            } else if ("edit".equals(strMo753f3)) {
                                treeMap = (TreeMap) a81Var4.f63k;
                            } else {
                                C0270h1.m2191g("Unknown callback type: ".concat(String.valueOf(strMo753f3)));
                            }
                            if (treeMap.containsKey(Integer.valueOf(iM5373D))) {
                                iM5373D = ((Integer) treeMap.lastKey()).intValue() + 1;
                            }
                            treeMap.put(Integer.valueOf(iM5373D), ft1Var);
                            return nt1Var;
                        }
                        C0270h1.m2190f("Undefined rule type");
                    } else {
                        C0270h1.m2190f("Invalid callback params");
                    }
                } else {
                    C0270h1.m2190f("Invalid callback type");
                }
                return null;
        }
    }

    public y12(oq0 oq0Var) {
        super("internal.eventLogger");
        this.f9131m = oq0Var;
    }

    public y12(a81 a81Var) {
        super("internal.registerCallback");
        this.f9131m = a81Var;
    }

    public y12(nz1 nz1Var) {
        super("internal.appMetadata");
        this.f9131m = nz1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y12(m42 m42Var, a81 a81Var) {
        super("getValue");
        this.f9131m = a81Var;
    }
}
