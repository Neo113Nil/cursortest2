package com.ironsource;

/* loaded from: classes5.dex */
class Tc extends com.ironsource.AbstractC3014e {
    private final java.lang.String i = com.ironsource.C3046fd.f6260a;

    Tc(int i) {
        this.g = i;
    }

    @Override // com.ironsource.AbstractC3014e
    public java.lang.String a() {
        return com.ironsource.C3046fd.f6260a;
    }

    @Override // com.ironsource.AbstractC3014e
    public java.lang.String c() {
        return "outcome";
    }

    @Override // com.ironsource.AbstractC3014e
    public java.lang.String a(java.util.ArrayList<com.ironsource.C3360x5> arrayList, org.json.JSONObject jSONObject) {
        if (jSONObject == null) {
            this.f = new org.json.JSONObject();
        } else {
            this.f = jSONObject;
        }
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
        return a(jSONArray);
    }
}
