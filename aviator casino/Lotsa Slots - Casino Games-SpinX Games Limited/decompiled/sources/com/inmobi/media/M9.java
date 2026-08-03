package com.inmobi.media;

/* loaded from: classes5.dex */
public abstract class M9 {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.Object f4833a = new java.lang.Object();
    public static final java.lang.Object b = new java.lang.Object();
    public static boolean c;
    public static boolean d;
    public static org.json.JSONObject e;
    public static org.json.JSONObject f;

    public static final void a(org.json.JSONObject jSONObject) {
        synchronized (b) {
            java.util.Objects.toString(f);
            java.util.Objects.toString(jSONObject);
            f = jSONObject;
            d = true;
            android.content.Context context = com.inmobi.media.Xi.f5051a;
            if (context != null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                com.inmobi.media.La a2 = com.inmobi.media.Ka.a(context, "unified_id_info_store");
                org.json.JSONObject jSONObject2 = f;
                if (jSONObject2 == null) {
                    a2.a("publisher_provided_unified_id");
                } else {
                    a2.a("publisher_provided_unified_id", java.lang.String.valueOf(jSONObject2), false);
                    kotlin.Unit unit = kotlin.Unit.INSTANCE;
                }
            }
        }
    }

    public static final org.json.JSONObject b() {
        synchronized (f4833a) {
            if (c) {
                return e;
            }
            c = true;
            android.content.Context context = com.inmobi.media.Xi.f5051a;
            if (context != null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                com.inmobi.media.La a2 = com.inmobi.media.Ka.a(context, "unified_id_info_store");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("ufids", com.ironsource.X3.i.W);
                java.lang.String string = a2.f4815a.getString("ufids", null);
                if (string != null) {
                    try {
                        e = new org.json.JSONObject(string);
                    } catch (org.json.JSONException e2) {
                        e2.getMessage();
                    }
                    return e;
                }
            }
            return null;
        }
    }

    public static final org.json.JSONObject a() {
        synchronized (b) {
            if (d) {
                java.util.Objects.toString(f);
                return f;
            }
            d = true;
            android.content.Context context = com.inmobi.media.Xi.f5051a;
            java.lang.String str = null;
            if (context != null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                com.inmobi.media.La a2 = com.inmobi.media.Ka.a(context, "unified_id_info_store");
                kotlin.jvm.internal.Intrinsics.checkNotNullParameter("publisher_provided_unified_id", com.ironsource.X3.i.W);
                str = a2.f4815a.getString("publisher_provided_unified_id", null);
            }
            try {
                try {
                    f = new org.json.JSONObject(str);
                } catch (org.json.JSONException e2) {
                    e2.getMessage();
                }
            } catch (java.lang.NullPointerException e3) {
                e3.getMessage();
            }
            java.util.Objects.toString(f);
            return f;
        }
    }

    public static final void b(org.json.JSONObject jSONObject) {
        synchronized (f4833a) {
            e = jSONObject;
            c = true;
            android.content.Context context = com.inmobi.media.Xi.f5051a;
            if (context != null) {
                java.util.concurrent.ConcurrentHashMap concurrentHashMap = com.inmobi.media.La.b;
                com.inmobi.media.La a2 = com.inmobi.media.Ka.a(context, "unified_id_info_store");
                org.json.JSONObject jSONObject2 = e;
                if (jSONObject2 == null) {
                    a2.a("ufids");
                } else {
                    a2.a("ufids", java.lang.String.valueOf(jSONObject2), false);
                }
                android.content.SharedPreferences.Editor edit = android.preference.PreferenceManager.getDefaultSharedPreferences(context).edit();
                org.json.JSONObject jSONObject3 = e;
                if (jSONObject3 == null) {
                    edit.remove("InMobi_unifiedId");
                } else {
                    edit.putString("InMobi_unifiedId", java.lang.String.valueOf(jSONObject3));
                }
                edit.apply();
            }
        }
    }
}
