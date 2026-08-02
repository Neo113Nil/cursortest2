package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class h1 {

    /* renamed from: a, reason: collision with root package name */
    public int f3308a = 0;
    public com.dyneti.android.dyscan.g1 b;

    public final boolean a(java.lang.String str) {
        int i = this.f3308a;
        if (i < 0 || i > 1) {
            return true;
        }
        java.util.Iterator it = this.b.f3305a.iterator();
        while (it.hasNext()) {
            com.dyneti.android.dyscan.f1 f1Var = (com.dyneti.android.dyscan.f1) it.next();
            if (str.length() == f1Var.b && str.startsWith(f1Var.f3301a)) {
                return true;
            }
        }
        return false;
    }

    public final boolean b(java.lang.String str) {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            int i = jSONObject.getInt("version");
            this.f3308a = i;
            if (i >= 0 && i <= 1) {
                this.b = new com.dyneti.android.dyscan.g1(jSONObject.getJSONObject("config"));
                return true;
            }
        } catch (org.json.JSONException unused) {
        }
        return false;
    }
}
