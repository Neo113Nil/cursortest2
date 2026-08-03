package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.xa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0819xa {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.HashSet f7105a;

    static {
        java.util.HashSet hashSet = new java.util.HashSet();
        f7105a = hashSet;
        hashSet.add("get_ad");
        hashSet.add("report");
        hashSet.add("report_ad");
        hashSet.add("startup");
        hashSet.add("diagnostic");
    }

    public static java.util.ArrayList a(org.json.JSONObject jSONObject, java.lang.String str) {
        try {
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject != null) {
                return io.appmetrica.analytics.impl.AbstractC0380gb.a(optJSONObject.getJSONArray("urls"));
            }
        } catch (java.lang.Throwable unused) {
        }
        return null;
    }
}
