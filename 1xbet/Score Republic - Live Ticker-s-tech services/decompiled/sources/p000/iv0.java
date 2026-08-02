package p000;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class iv0 extends nj0 {
    /* JADX INFO: renamed from: d */
    public static dr0 m2713d(Map map) {
        bv0 bv0Var;
        bv0 bv0Var2;
        Integer num;
        Integer num2;
        Integer num3 = 5;
        Integer num4 = 100;
        Long lM5389n = wo1.m5389n("interval", map);
        Long lM5389n2 = wo1.m5389n("baseEjectionTime", map);
        Long lM5389n3 = wo1.m5389n("maxEjectionTime", map);
        Integer numM5386k = wo1.m5386k("maxEjectionPercentage", map);
        Long l = lM5389n != null ? lM5389n : 10000000000L;
        Long l2 = lM5389n2 != null ? lM5389n2 : 30000000000L;
        Long l3 = lM5389n3 != null ? lM5389n3 : 300000000000L;
        Integer num5 = numM5386k != null ? numM5386k : 10;
        Map mapM5387l = wo1.m5387l("successRateEjection", map);
        List list = null;
        if (mapM5387l != null) {
            Integer numM5386k2 = wo1.m5386k("stdevFactor", mapM5387l);
            Integer numM5386k3 = wo1.m5386k("enforcementPercentage", mapM5387l);
            Integer numM5386k4 = wo1.m5386k("minimumHosts", mapM5387l);
            Integer numM5386k5 = wo1.m5386k("requestVolume", mapM5387l);
            Integer num6 = numM5386k2 != null ? numM5386k2 : 1900;
            if (numM5386k3 != null) {
                a90.m123g(numM5386k3.intValue() >= 0 && numM5386k3.intValue() <= 100);
                num = numM5386k3;
            } else {
                num = num4;
            }
            if (numM5386k4 != null) {
                a90.m123g(numM5386k4.intValue() >= 0);
                num2 = numM5386k4;
            } else {
                num2 = num3;
            }
            if (numM5386k5 != null) {
                a90.m123g(numM5386k5.intValue() >= 0);
            } else {
                numM5386k5 = num4;
            }
            bv0Var = new bv0(num6, num, num2, numM5386k5);
        } else {
            bv0Var = null;
        }
        Map mapM5387l2 = wo1.m5387l("failurePercentageEjection", map);
        if (mapM5387l2 != null) {
            Integer num7 = 85;
            Integer num8 = 50;
            Integer numM5386k6 = wo1.m5386k("threshold", mapM5387l2);
            Integer numM5386k7 = wo1.m5386k("enforcementPercentage", mapM5387l2);
            Integer numM5386k8 = wo1.m5386k("minimumHosts", mapM5387l2);
            Integer numM5386k9 = wo1.m5386k("requestVolume", mapM5387l2);
            if (numM5386k6 != null) {
                a90.m123g(numM5386k6.intValue() >= 0 && numM5386k6.intValue() <= 100);
                num7 = numM5386k6;
            }
            if (numM5386k7 != null) {
                a90.m123g(numM5386k7.intValue() >= 0 && numM5386k7.intValue() <= 100);
                num4 = numM5386k7;
            }
            if (numM5386k8 != null) {
                a90.m123g(numM5386k8.intValue() >= 0);
                num3 = numM5386k8;
            }
            if (numM5386k9 != null) {
                a90.m123g(numM5386k9.intValue() >= 0);
                num8 = numM5386k9;
            }
            bv0Var2 = new bv0(num7, num4, num3, num8);
        } else {
            bv0Var2 = null;
        }
        List listM5383h = wo1.m5383h("childPolicy", map);
        if (listM5383h != null) {
            wo1.m5379d(listM5383h);
            list = listM5383h;
        }
        List listM1116q = d71.m1116q(list);
        if (listM1116q == null || listM1116q.isEmpty()) {
            return new dr0(ja1.f3882l.m2840h("No child policy in outlier_detection_experimental LB policy: " + map));
        }
        dr0 dr0VarM1114o = d71.m1114o(listM1116q, oj0.m3693a());
        if (dr0VarM1114o.f1802a != null) {
            return dr0VarM1114o;
        }
        c71 c71Var = (c71) dr0VarM1114o.f1803b;
        a90.m133q(c71Var != null);
        a90.m133q(c71Var != null);
        return new dr0(new cv0(l, l2, l3, num5, bv0Var, bv0Var2, c71Var));
    }

    @Override // p000.nj0
    /* JADX INFO: renamed from: a */
    public final String mo1102a() {
        return "outlier_detection_experimental";
    }

    @Override // p000.nj0
    /* JADX INFO: renamed from: b */
    public final mj0 mo1103b(AbstractC0477mo abstractC0477mo) {
        return new hv0(abstractC0477mo);
    }

    @Override // p000.nj0
    /* JADX INFO: renamed from: c */
    public final dr0 mo1104c(Map map) {
        try {
            return m2713d(map);
        } catch (RuntimeException e) {
            return new dr0(ja1.f3883m.m2839g(e).m2840h("Failed parsing configuration for outlier_detection_experimental"));
        }
    }
}
