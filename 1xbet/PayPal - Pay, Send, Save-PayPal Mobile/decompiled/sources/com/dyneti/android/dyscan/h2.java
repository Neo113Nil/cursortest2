package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public final com.dyneti.android.dyscan.m0 f3309a = com.dyneti.android.dyscan.m0.f3323a;
    public final android.content.SharedPreferences b;

    public h2(android.content.Context context) {
        this.b = context.getSharedPreferences("dyscan_sac.config", 0);
    }

    public final java.util.ArrayList a() {
        java.lang.String string = this.b.getString("dyscan_sac", null);
        if (string == null) {
            return new java.util.ArrayList();
        }
        com.dyneti.android.dyscan.l0 l0Var = com.dyneti.android.dyscan.l0.f3319a;
        org.json.JSONArray jSONArray = new org.json.JSONArray(string);
        long currentTimeMillis = java.lang.System.currentTimeMillis() / 1000;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            long j = jSONArray.getLong(i);
            if (currentTimeMillis - j < 300) {
                arrayList.add(java.lang.Long.valueOf(j));
            }
        }
        return arrayList;
    }
}
