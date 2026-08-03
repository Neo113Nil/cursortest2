package com.ironsource;

/* loaded from: classes5.dex */
public class J6 {
    public static final java.lang.String b = "userId";
    public static final java.lang.String c = "appKey";
    private static com.ironsource.J6 d;

    /* renamed from: a, reason: collision with root package name */
    private final org.json.JSONObject f5769a = new org.json.JSONObject();

    private J6() {
    }

    public static synchronized com.ironsource.J6 a() {
        com.ironsource.J6 j6;
        synchronized (com.ironsource.J6.class) {
            if (d == null) {
                d = new com.ironsource.J6();
            }
            j6 = d;
        }
        return j6;
    }

    public synchronized org.json.JSONObject b() throws org.json.JSONException {
        if (com.ironsource.Jb.Y().h().v()) {
            return new org.json.JSONObject(this.f5769a.toString());
        }
        return this.f5769a;
    }

    public synchronized void a(java.util.Map<java.lang.String, java.lang.Object> map) {
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                a(str, map.get(str));
            }
        }
    }

    public synchronized void a(java.lang.String str, java.lang.Object obj) {
        try {
            this.f5769a.put(str, obj);
        } catch (java.lang.Exception e) {
            com.ironsource.C3180n4.d().a(e);
        }
    }

    public synchronized java.lang.String a(java.lang.String str) {
        return this.f5769a.optString(str);
    }
}
