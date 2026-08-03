package com.ironsource;

/* renamed from: com.ironsource.ga, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
class C3061ga extends com.ironsource.AbstractC3014e {
    private final java.lang.String i = "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";
    private final java.lang.String j = "super.dwh.mediation_events";
    private final java.lang.String k = com.ironsource.B5.R;
    private final java.lang.String l = "data";

    C3061ga(int i) {
        this.g = i;
    }

    @Override // com.ironsource.AbstractC3014e
    public java.lang.String a() {
        return "https://o-sdk.mediation.unity3d.com/mediation?adUnit=2";
    }

    @Override // com.ironsource.AbstractC3014e
    public java.lang.String c() {
        return "ironbeast";
    }

    @Override // com.ironsource.AbstractC3014e
    public java.lang.String a(java.util.ArrayList<com.ironsource.C3360x5> arrayList, org.json.JSONObject jSONObject) {
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        if (jSONObject == null) {
            this.f = new org.json.JSONObject();
        } else {
            this.f = jSONObject;
        }
        try {
            org.json.JSONArray jSONArray = new org.json.JSONArray();
            if (arrayList != null && !arrayList.isEmpty()) {
                java.util.Iterator<com.ironsource.C3360x5> it = arrayList.iterator();
                while (it.hasNext()) {
                    org.json.JSONObject a2 = a(it.next());
                    if (a2 != null) {
                        jSONArray.put(a2);
                    }
                }
            }
            jSONObject2.put(com.ironsource.B5.R, "super.dwh.mediation_events");
            jSONObject2.put("data", a(jSONArray));
            return jSONObject2.toString();
        } catch (org.json.JSONException e) {
            com.ironsource.C3180n4.d().a(e);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error(e.toString());
            return "";
        }
    }
}
