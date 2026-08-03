package com.ironsource;

/* renamed from: com.ironsource.ca, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public class C2989ca {
    private static final java.lang.String b = "ca";
    private static final java.lang.String c = "supersonic_shared_preferen";
    private static final java.lang.String d = "version";
    private static final java.lang.String e = "back_button_state";
    private static final java.lang.String f = "search_keys";
    private static final java.lang.String g = "^\\d+_\\d+$";
    private static com.ironsource.C2989ca h;

    /* renamed from: a, reason: collision with root package name */
    private android.content.SharedPreferences f6187a;

    private C2989ca(android.content.Context context) {
        this.f6187a = context.getSharedPreferences("supersonic_shared_preferen", 0);
    }

    public static synchronized com.ironsource.C2989ca a(android.content.Context context) {
        com.ironsource.C2989ca c2989ca;
        synchronized (com.ironsource.C2989ca.class) {
            if (h == null) {
                h = new com.ironsource.C2989ca(context);
            }
            c2989ca = h;
        }
        return c2989ca;
    }

    public static synchronized com.ironsource.C2989ca e() {
        com.ironsource.C2989ca c2989ca;
        synchronized (com.ironsource.C2989ca.class) {
            c2989ca = h;
        }
        return c2989ca;
    }

    public com.ironsource.C3202o8.a b() {
        int parseInt = java.lang.Integer.parseInt(this.f6187a.getString(e, "2"));
        return parseInt == 0 ? com.ironsource.C3202o8.a.None : parseInt == 1 ? com.ironsource.C3202o8.a.Device : parseInt == 2 ? com.ironsource.C3202o8.a.Controller : com.ironsource.C3202o8.a.Controller;
    }

    public void c(java.lang.String str) {
        android.content.SharedPreferences.Editor edit = this.f6187a.edit();
        edit.putString(e, str);
        edit.apply();
    }

    public java.util.List<java.lang.String> d() {
        java.lang.String string = this.f6187a.getString(f, null);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (string != null) {
            com.ironsource.C3101ie c3101ie = new com.ironsource.C3101ie(string);
            if (c3101ie.a(com.ironsource.X3.i.R)) {
                try {
                    arrayList.addAll(c3101ie.a((org.json.JSONArray) c3101ie.b(com.ironsource.X3.i.R)));
                } catch (org.json.JSONException e2) {
                    com.ironsource.C3180n4.d().a(e2);
                    com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
                }
            }
        }
        return arrayList;
    }

    public void e(java.lang.String str) {
        android.content.SharedPreferences.Editor edit = this.f6187a.edit();
        edit.putString(f, str);
        edit.apply();
    }

    public void a(java.lang.String str, java.lang.String str2) {
        android.content.SharedPreferences.Editor edit = this.f6187a.edit();
        edit.putString(str, str2);
        edit.apply();
    }

    public java.lang.String c() {
        return this.f6187a.getString("version", com.ironsource.C2945a2.f);
    }

    public java.lang.String a(java.lang.String str) {
        java.lang.String string = this.f6187a.getString(str, null);
        return string != null ? string : "{}";
    }

    private boolean b(java.lang.String str) {
        return str.matches(g);
    }

    public boolean a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        java.lang.String string = this.f6187a.getString("ssaUserData", null);
        if (android.text.TextUtils.isEmpty(string)) {
            return false;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(string);
            if (jSONObject.isNull(str2)) {
                return false;
            }
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject(str2);
            if (jSONObject2.isNull(str3)) {
                return false;
            }
            jSONObject2.getJSONObject(str3).put(com.ironsource.C4.a.d, str);
            android.content.SharedPreferences.Editor edit = this.f6187a.edit();
            edit.putString("ssaUserData", jSONObject.toString());
            edit.apply();
            return true;
        } catch (org.json.JSONException e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e2.toString());
            return false;
        }
    }

    public void d(java.lang.String str) {
        if (c().equalsIgnoreCase(str)) {
            return;
        }
        android.content.SharedPreferences.Editor edit = this.f6187a.edit();
        edit.putString("version", str);
        edit.apply();
    }

    public java.util.ArrayList<java.lang.String> a() {
        java.util.ArrayList<java.lang.String> arrayList = new java.util.ArrayList<>();
        java.lang.String[] strArr = (java.lang.String[]) this.f6187a.getAll().keySet().toArray(new java.lang.String[0]);
        android.content.SharedPreferences.Editor edit = this.f6187a.edit();
        for (java.lang.String str : strArr) {
            if (b(str)) {
                arrayList.add(str);
                edit.remove(str);
            }
        }
        edit.apply();
        return arrayList;
    }
}
