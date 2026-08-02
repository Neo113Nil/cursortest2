package p000;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-738170b7fb69b873ed7524d5270c8e05c6f5fb40ea1ade7a72c8ed7a70699269 */
/* JADX INFO: loaded from: classes.dex */
public final class sl0 {

    /* JADX INFO: renamed from: a */
    public final ql0 f7140a;

    /* JADX INFO: renamed from: b */
    public final Map f7141b;

    /* JADX INFO: renamed from: c */
    public final Map f7142c;

    /* JADX INFO: renamed from: d */
    public final j31 f7143d;

    /* JADX INFO: renamed from: e */
    public final Object f7144e;

    /* JADX INFO: renamed from: f */
    public final Map f7145f;

    public sl0(ql0 ql0Var, HashMap map, HashMap map2, j31 j31Var, Object obj, Map map3) {
        this.f7140a = ql0Var;
        this.f7141b = AbstractC0024an.m288k(map);
        this.f7142c = AbstractC0024an.m288k(map2);
        this.f7143d = j31Var;
        this.f7144e = obj;
        this.f7145f = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    /* JADX INFO: renamed from: a */
    public static sl0 m4534a(Map map, boolean z, int i, int i2, Object obj) {
        j31 j31Var;
        Map mapM5387l;
        j31 j31Var2;
        if (z) {
            if (map == null || (mapM5387l = wo1.m5387l("retryThrottling", map)) == null) {
                j31Var2 = null;
            } else {
                float fFloatValue = wo1.m5385j("maxTokens", mapM5387l).floatValue();
                float fFloatValue2 = wo1.m5385j("tokenRatio", mapM5387l).floatValue();
                a90.m132p("maxToken should be greater than zero", fFloatValue > 0.0f);
                a90.m132p("tokenRatio should be greater than zero", fFloatValue2 > 0.0f);
                j31Var2 = new j31(fFloatValue, fFloatValue2);
            }
            j31Var = j31Var2;
        } else {
            j31Var = null;
        }
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Map mapM5387l2 = map == null ? null : wo1.m5387l("healthCheckConfig", map);
        List<Map> listM5383h = wo1.m5383h("methodConfig", map);
        if (listM5383h == null) {
            listM5383h = null;
        } else {
            wo1.m5379d(listM5383h);
        }
        if (listM5383h == null) {
            return new sl0(null, map2, map3, j31Var, obj, mapM5387l2);
        }
        ql0 ql0Var = null;
        for (Map map4 : listM5383h) {
            ql0 ql0Var2 = new ql0(map4, z, i, i2);
            List<Map> listM5383h2 = wo1.m5383h("name", map4);
            if (listM5383h2 == null) {
                listM5383h2 = null;
            } else {
                wo1.m5379d(listM5383h2);
            }
            if (listM5383h2 != null && !listM5383h2.isEmpty()) {
                for (Map map5 : listM5383h2) {
                    String strM5388m = wo1.m5388m("service", map5);
                    String strM5388m2 = wo1.m5388m("method", map5);
                    if (gw0.m2161a(strM5388m)) {
                        a90.m121e(strM5388m2, "missing service name for method %s", gw0.m2161a(strM5388m2));
                        a90.m121e(map, "Duplicate default method config in service config %s", ql0Var == null);
                        ql0Var = ql0Var2;
                    } else if (gw0.m2161a(strM5388m2)) {
                        a90.m121e(strM5388m, "Duplicate service %s", !map3.containsKey(strM5388m));
                        map3.put(strM5388m, ql0Var2);
                    } else {
                        String strM5409a = wp0.m5409a(strM5388m, strM5388m2);
                        a90.m121e(strM5409a, "Duplicate method name %s", !map2.containsKey(strM5409a));
                        map2.put(strM5409a, ql0Var2);
                    }
                }
            }
        }
        return new sl0(ql0Var, map2, map3, j31Var, obj, mapM5387l2);
    }

    /* JADX INFO: renamed from: b */
    public final rl0 m4535b() {
        if (this.f7142c.isEmpty() && this.f7141b.isEmpty() && this.f7140a == null) {
            return null;
        }
        return new rl0(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && sl0.class == obj.getClass()) {
            sl0 sl0Var = (sl0) obj;
            if (AbstractC0875xf.m5649f(this.f7140a, sl0Var.f7140a) && AbstractC0875xf.m5649f(this.f7141b, sl0Var.f7141b) && AbstractC0875xf.m5649f(this.f7142c, sl0Var.f7142c) && AbstractC0875xf.m5649f(this.f7143d, sl0Var.f7143d) && AbstractC0875xf.m5649f(this.f7144e, sl0Var.f7144e)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7140a, this.f7141b, this.f7142c, this.f7143d, this.f7144e});
    }

    public final String toString() {
        C0809vn c0809vnM5362k = wm1.m5362k(this);
        c0809vnM5362k.m5172c(this.f7140a, "defaultMethodConfig");
        c0809vnM5362k.m5172c(this.f7141b, "serviceMethodMap");
        c0809vnM5362k.m5172c(this.f7142c, "serviceMap");
        c0809vnM5362k.m5172c(this.f7143d, "retryThrottling");
        c0809vnM5362k.m5172c(this.f7144e, "loadBalancingConfig");
        return c0809vnM5362k.toString();
    }
}
