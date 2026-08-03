package com.fyber.inneractive.sdk.serverapi.extradata;

/* loaded from: classes3.dex */
public final class b implements com.fyber.inneractive.sdk.serverapi.extradata.c {
    @Override // com.fyber.inneractive.sdk.serverapi.extradata.c
    public final boolean a(java.lang.Object obj) {
        return ((org.json.JSONArray) obj).length() == 0;
    }

    @Override // com.fyber.inneractive.sdk.serverapi.extradata.c
    public final void a(java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(com.ironsource.X3.i.W, str);
        jSONObject.put("value", str2);
        ((org.json.JSONArray) obj).put(jSONObject);
    }
}
