package com.dyneti.android.dyscan;

/* loaded from: classes8.dex */
public final class g1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f3305a;

    public g1(org.json.JSONObject jSONObject) {
        org.json.JSONArray jSONArray = jSONObject.getJSONArray("matchesAny");
        this.f3305a = new java.util.ArrayList();
        for (int i = 0; i < jSONArray.length(); i++) {
            this.f3305a.add(new com.dyneti.android.dyscan.f1(jSONArray.getJSONObject(i)));
        }
    }
}
