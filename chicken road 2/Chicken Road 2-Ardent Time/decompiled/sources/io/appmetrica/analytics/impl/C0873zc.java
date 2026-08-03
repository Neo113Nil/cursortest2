package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.zc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0873zc {
    public static final io.appmetrica.analytics.impl.A9 a(io.appmetrica.analytics.impl.C0873zc c0873zc, io.appmetrica.analytics.impl.J9 j9, java.util.Map map) {
        int i2;
        java.lang.Object value;
        c0873zc.getClass();
        io.appmetrica.analytics.impl.A9 a9 = new io.appmetrica.analytics.impl.A9();
        switch (j9) {
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
                throw new E1.A();
        }
        a9.f4043a = i2;
        io.appmetrica.analytics.impl.Ac.f4051b.getClass();
        java.util.Set<java.util.Map.Entry> entrySet = map.entrySet();
        int E2 = i1.AbstractC0203v.E(i1.AbstractC0192k.K(entrySet));
        if (E2 < 16) {
            E2 = 16;
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap(E2);
        for (java.util.Map.Entry entry : entrySet) {
            java.lang.Object key = entry.getKey();
            if (entry.getValue() instanceof java.lang.Number) {
                java.lang.Object value2 = entry.getValue();
                if (value2 == null) {
                    throw new java.lang.NullPointerException("null cannot be cast to non-null type kotlin.Number");
                }
                double doubleValue = ((java.lang.Number) value2).doubleValue();
                if (java.lang.Double.isInfinite(doubleValue) || java.lang.Double.isNaN(doubleValue)) {
                    value = null;
                    linkedHashMap.put(key, value);
                }
            }
            value = entry.getValue();
            linkedHashMap.put(key, value);
        }
        java.lang.String jSONObject = new org.json.JSONObject(linkedHashMap).toString();
        if (jSONObject != null) {
            a9.f4044b = jSONObject.getBytes(y1.a.f8486a);
        }
        return a9;
    }
}
