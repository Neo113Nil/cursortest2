package com.fyber.marketplace.fairbid.impl;

/* loaded from: classes3.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4374a;
    public final com.fyber.inneractive.sdk.response.a b;
    public final java.util.Map c;

    public h(org.json.JSONObject jSONObject, com.fyber.inneractive.sdk.response.a aVar, java.util.Map map) {
        try {
            this.f4374a = jSONObject.getJSONObject("ad").optString("markup");
        } catch (org.json.JSONException e) {
            com.fyber.inneractive.sdk.util.IAlog.a("Failed extracting markup", e, new java.lang.Object[0]);
        }
        this.b = aVar;
        this.c = map;
    }
}
