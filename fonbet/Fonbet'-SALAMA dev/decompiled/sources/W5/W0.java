package W5;

import a.AbstractC0603a;
import io.sentry.protocol.Request;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import n3.AbstractC1464a;

/* loaded from: classes2.dex */
public final class W0 {

    /* renamed from: a, reason: collision with root package name */
    public final U0 f7079a;

    /* renamed from: b, reason: collision with root package name */
    public final Map f7080b;

    /* renamed from: c, reason: collision with root package name */
    public final Map f7081c;

    /* renamed from: d, reason: collision with root package name */
    public final N1 f7082d;

    /* renamed from: e, reason: collision with root package name */
    public final Object f7083e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f7084f;

    public W0(U0 u02, HashMap hashMap, HashMap hashMap2, N1 n12, Object obj, Map map) {
        this.f7079a = u02;
        this.f7080b = Collections.unmodifiableMap(new HashMap(hashMap));
        this.f7081c = Collections.unmodifiableMap(new HashMap(hashMap2));
        this.f7082d = n12;
        this.f7083e = obj;
        this.f7084f = map != null ? Collections.unmodifiableMap(new HashMap(map)) : null;
    }

    public static W0 a(Map map, boolean z4, int i7, int i8, Object obj) {
        N1 n12;
        Map g3;
        N1 n13;
        if (z4) {
            if (map == null || (g3 = AbstractC0547v0.g("retryThrottling", map)) == null) {
                n13 = null;
            } else {
                float floatValue = AbstractC0547v0.e("maxTokens", g3).floatValue();
                float floatValue2 = AbstractC0547v0.e("tokenRatio", g3).floatValue();
                p3.f.q("maxToken should be greater than zero", floatValue > 0.0f);
                p3.f.q("tokenRatio should be greater than zero", floatValue2 > 0.0f);
                n13 = new N1(floatValue, floatValue2);
            }
            n12 = n13;
        } else {
            n12 = null;
        }
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        Map g7 = map == null ? null : AbstractC0547v0.g("healthCheckConfig", map);
        List<Map> c3 = AbstractC0547v0.c("methodConfig", map);
        if (c3 == null) {
            c3 = null;
        } else {
            AbstractC0547v0.a(c3);
        }
        if (c3 == null) {
            return new W0(null, hashMap, hashMap2, n12, obj, g7);
        }
        U0 u02 = null;
        for (Map map2 : c3) {
            U0 u03 = new U0(map2, z4, i7, i8);
            List<Map> c4 = AbstractC0547v0.c("name", map2);
            if (c4 == null) {
                c4 = null;
            } else {
                AbstractC0547v0.a(c4);
            }
            if (c4 != null && !c4.isEmpty()) {
                for (Map map3 : c4) {
                    String h6 = AbstractC0547v0.h("service", map3);
                    String h7 = AbstractC0547v0.h(Request.JsonKeys.METHOD, map3);
                    if (P6.b.x(h6)) {
                        p3.f.h(P6.b.x(h7), "missing service name for method %s", h7);
                        p3.f.h(u02 == null, "Duplicate default method config in service config %s", map);
                        u02 = u03;
                    } else if (P6.b.x(h7)) {
                        p3.f.h(!hashMap2.containsKey(h6), "Duplicate service %s", h6);
                        hashMap2.put(h6, u03);
                    } else {
                        String b7 = H2.r.b(h6, h7);
                        p3.f.h(!hashMap.containsKey(b7), "Duplicate method name %s", b7);
                        hashMap.put(b7, u03);
                    }
                }
            }
        }
        return new W0(u02, hashMap, hashMap2, n12, obj, g7);
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
        W0 w02 = (W0) obj;
        return AbstractC1464a.t(this.f7079a, w02.f7079a) && AbstractC1464a.t(this.f7080b, w02.f7080b) && AbstractC1464a.t(this.f7081c, w02.f7081c) && AbstractC1464a.t(this.f7082d, w02.f7082d) && AbstractC1464a.t(this.f7083e, w02.f7083e);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f7079a, this.f7080b, this.f7081c, this.f7082d, this.f7083e});
    }

    public final String toString() {
        D3.j u02 = AbstractC0603a.u0(this);
        u02.a(this.f7079a, "defaultMethodConfig");
        u02.a(this.f7080b, "serviceMethodMap");
        u02.a(this.f7081c, "serviceMap");
        u02.a(this.f7082d, "retryThrottling");
        u02.a(this.f7083e, "loadBalancingConfig");
        return u02.toString();
    }
}
