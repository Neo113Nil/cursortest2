package io.appmetrica.analytics.impl;

import g4.AbstractC0467l;
import g4.AbstractC0476u;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Gc {
    public static final H9 a(Gc gc, Q9 q9, Map map) {
        int i2;
        Object value;
        gc.getClass();
        H9 h9 = new H9();
        switch (q9) {
            case UNKNOWN:
                i2 = 0;
                break;
            case APPSFLYER:
                i2 = 1;
                break;
            case ADJUST:
                i2 = 2;
                break;
            case KOCHAVA:
                i2 = 3;
                break;
            case TENJIN:
                i2 = 4;
                break;
            case AIRBRIDGE:
                i2 = 5;
                break;
            case SINGULAR:
                i2 = 6;
                break;
            default:
                throw new C1.b();
        }
        h9.f6866a = i2;
        Hc.f6874b.getClass();
        Set<Map.Entry> entrySet = map.entrySet();
        int W5 = AbstractC0476u.W(AbstractC0467l.D0(entrySet, 10));
        if (W5 < 16) {
            W5 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(W5);
        for (Map.Entry entry : entrySet) {
            Object key = entry.getKey();
            if (entry.getValue() instanceof Number) {
                Object value2 = entry.getValue();
                if (value2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Number");
                }
                double doubleValue = ((Number) value2).doubleValue();
                if (Double.isInfinite(doubleValue) || Double.isNaN(doubleValue)) {
                    value = null;
                    linkedHashMap.put(key, value);
                }
            }
            value = entry.getValue();
            linkedHashMap.put(key, value);
        }
        String jSONObject = new JSONObject(linkedHashMap).toString();
        if (jSONObject != null) {
            h9.f6867b = jSONObject.getBytes(B4.a.f287a);
        }
        return h9;
    }
}
