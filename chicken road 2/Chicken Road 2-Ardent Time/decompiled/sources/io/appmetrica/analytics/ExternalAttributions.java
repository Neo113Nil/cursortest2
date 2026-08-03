package io.appmetrica.analytics;

/* loaded from: classes.dex */
public final class ExternalAttributions {
    public static io.appmetrica.analytics.ExternalAttribution adjust(java.lang.Object obj) {
        return obj == null ? new io.appmetrica.analytics.impl.C0331ee(io.appmetrica.analytics.impl.J9.ADJUST) : new io.appmetrica.analytics.impl.C0435ie(io.appmetrica.analytics.impl.J9.ADJUST, obj);
    }

    public static io.appmetrica.analytics.ExternalAttribution airbridge(java.util.Map<java.lang.String, java.lang.String> map) {
        return map == null ? new io.appmetrica.analytics.impl.C0331ee(io.appmetrica.analytics.impl.J9.AIRBRIDGE) : new io.appmetrica.analytics.impl.Ac(io.appmetrica.analytics.impl.J9.AIRBRIDGE, map);
    }

    public static io.appmetrica.analytics.ExternalAttribution appsflyer(java.util.Map<java.lang.String, java.lang.Object> map) {
        return map == null ? new io.appmetrica.analytics.impl.C0331ee(io.appmetrica.analytics.impl.J9.APPSFLYER) : new io.appmetrica.analytics.impl.Ac(io.appmetrica.analytics.impl.J9.APPSFLYER, map);
    }

    public static io.appmetrica.analytics.ExternalAttribution kochava(org.json.JSONObject jSONObject) {
        return jSONObject == null ? new io.appmetrica.analytics.impl.C0331ee(io.appmetrica.analytics.impl.J9.KOCHAVA) : new io.appmetrica.analytics.impl.C0328eb(io.appmetrica.analytics.impl.J9.KOCHAVA, jSONObject);
    }

    public static io.appmetrica.analytics.ExternalAttribution singular(java.util.Map<java.lang.String, java.lang.Object> map) {
        return map == null ? new io.appmetrica.analytics.impl.C0331ee(io.appmetrica.analytics.impl.J9.SINGULAR) : new io.appmetrica.analytics.impl.Ac(io.appmetrica.analytics.impl.J9.SINGULAR, map);
    }

    public static io.appmetrica.analytics.ExternalAttribution tenjin(java.util.Map<java.lang.String, java.lang.String> map) {
        return map == null ? new io.appmetrica.analytics.impl.C0331ee(io.appmetrica.analytics.impl.J9.TENJIN) : new io.appmetrica.analytics.impl.Ac(io.appmetrica.analytics.impl.J9.TENJIN, map);
    }
}
