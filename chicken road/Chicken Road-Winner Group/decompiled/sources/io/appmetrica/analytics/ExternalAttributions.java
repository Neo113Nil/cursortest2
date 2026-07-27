package io.appmetrica.analytics;

import io.appmetrica.analytics.impl.C0646lb;
import io.appmetrica.analytics.impl.C0649le;
import io.appmetrica.analytics.impl.C0753pe;
import io.appmetrica.analytics.impl.Hc;
import io.appmetrica.analytics.impl.Q9;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class ExternalAttributions {
    public static ExternalAttribution adjust(Object obj) {
        return obj == null ? new C0649le(Q9.ADJUST) : new C0753pe(Q9.ADJUST, obj);
    }

    public static ExternalAttribution airbridge(Map<String, String> map) {
        return map == null ? new C0649le(Q9.AIRBRIDGE) : new Hc(Q9.AIRBRIDGE, map);
    }

    public static ExternalAttribution appsflyer(Map<String, Object> map) {
        return map == null ? new C0649le(Q9.APPSFLYER) : new Hc(Q9.APPSFLYER, map);
    }

    public static ExternalAttribution kochava(JSONObject jSONObject) {
        return jSONObject == null ? new C0649le(Q9.KOCHAVA) : new C0646lb(Q9.KOCHAVA, jSONObject);
    }

    public static ExternalAttribution singular(Map<String, Object> map) {
        return map == null ? new C0649le(Q9.SINGULAR) : new Hc(Q9.SINGULAR, map);
    }

    public static ExternalAttribution tenjin(Map<String, String> map) {
        return map == null ? new C0649le(Q9.TENJIN) : new Hc(Q9.TENJIN, map);
    }
}
