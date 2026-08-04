package W5;

import io.sentry.protocol.Request;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public final class W0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final U0 f7079a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f7080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f7081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N1 f7082d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Object f7083e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f7084f;

    public W0(U0 u4, HashMap map, HashMap map2, N1 n2, Object obj, Map map3) {
        this.f7079a = u4;
        this.f7080b = Collections.unmodifiableMap(new HashMap(map));
        this.f7081c = Collections.unmodifiableMap(new HashMap(map2));
        this.f7082d = n2;
        this.f7083e = obj;
        this.f7084f = map3 != null ? Collections.unmodifiableMap(new HashMap(map3)) : null;
    }

    public static W0 a(Map map, boolean z4, int i7, int i8, Object obj) {
        N1 n2;
        Map mapG;
        N1 n7;
        if (z4) {
            if (map == null || (mapG = AbstractC0547v0.g("retryThrottling", map)) == null) {
                n7 = null;
            } else {
                float fFloatValue = AbstractC0547v0.e("maxTokens", mapG).floatValue();
                float fFloatValue2 = AbstractC0547v0.e("tokenRatio", mapG).floatValue();
                p113p3.f.q("maxToken should be greater than zero", fFloatValue > 0.0f);
                p113p3.f.q("tokenRatio should be greater than zero", fFloatValue2 > 0.0f);
                n7 = new N1(fFloatValue, fFloatValue2);
            }
            n2 = n7;
        } else {
            n2 = null;
        }
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        Map mapG2 = map == null ? null : AbstractC0547v0.g("healthCheckConfig", map);
        List<Map> listC = AbstractC0547v0.c("methodConfig", map);
        if (listC == null) {
            listC = null;
        } else {
            AbstractC0547v0.a(listC);
        }
        if (listC == null) {
            return new W0(null, map2, map3, n2, obj, mapG2);
        }
        U0 u4 = null;
        for (Map map4 : listC) {
            U0 u7 = new U0(map4, z4, i7, i8);
            List<Map> listC2 = AbstractC0547v0.c("name", map4);
            if (listC2 == null) {
                listC2 = null;
            } else {
                AbstractC0547v0.a(listC2);
            }
            if (listC2 != null && !listC2.isEmpty()) {
                for (Map map5 : listC2) {
                    String strH = AbstractC0547v0.h("service", map5);
                    String strH2 = AbstractC0547v0.h(Request.JsonKeys.METHOD, map5);
                    if (P6.b.x(strH)) {
                        p113p3.f.h(P6.b.x(strH2), "missing service name for method %s", strH2);
                        p113p3.f.h(u4 == null, "Duplicate default method config in service config %s", map);
                        u4 = u7;
                    } else if (P6.b.x(strH2)) {
                        p113p3.f.h(!map3.containsKey(strH), "Duplicate service %s", strH);
                        map3.put(strH, u7);
                    } else {
                        String strB = H2.r.b(strH, strH2);
                        p113p3.f.h(!map2.containsKey(strB), "Duplicate method name %s", strB);
                        map2.put(strB, u7);
                    }
                }
            }
        }
        return new W0(u4, map2, map3, n2, obj, mapG2);
    }

    public final V0 b() {
        if (this.f7081c.isEmpty() && this.f7080b.isEmpty() && this.f7079a == null) {
            return null;
        }
        return new V0(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || W0.class != obj.getClass()) {
            return false;
        }
        W0 w7 = (W0) obj;
        return p097n3.a.t(this.f7079a, w7.f7079a) && p097n3.a.t(this.f7080b, w7.f7080b) && p097n3.a.t(this.f7081c, w7.f7081c) && p097n3.a.t(this.f7082d, w7.f7082d) && p097n3.a.t(this.f7083e, w7.f7083e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7079a, this.f7080b, this.f7081c, this.f7082d, this.f7083e});
    }

    public final String toString() {
        D3.j jVarU0 = p003a.a.u0(this);
        jVarU0.a(this.f7079a, "defaultMethodConfig");
        jVarU0.a(this.f7080b, "serviceMethodMap");
        jVarU0.a(this.f7081c, "serviceMap");
        jVarU0.a(this.f7082d, "retryThrottling");
        jVarU0.a(this.f7083e, "loadBalancingConfig");
        return jVarU0.toString();
    }
}
