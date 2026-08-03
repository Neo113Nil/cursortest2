package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.he, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0409he {
    public static final io.appmetrica.analytics.impl.A9 a(io.appmetrica.analytics.impl.C0409he c0409he, io.appmetrica.analytics.impl.J9 j9, java.lang.Object obj) {
        int i2;
        c0409he.getClass();
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
        io.appmetrica.analytics.impl.C0435ie.f6098b.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (java.lang.reflect.Field field : obj.getClass().getFields()) {
            try {
                jSONObject.put(field.getName(), field.get(obj));
            } catch (java.lang.Throwable unused) {
            }
        }
        a9.f4044b = jSONObject.toString().getBytes(y1.a.f8486a);
        return a9;
    }
}
