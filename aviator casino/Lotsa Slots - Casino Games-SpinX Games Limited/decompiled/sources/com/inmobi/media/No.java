package com.inmobi.media;

/* loaded from: classes5.dex */
public final class No {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f4863a = new java.util.concurrent.ConcurrentHashMap();

    public final org.json.JSONObject a() {
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            for (java.util.Map.Entry entry : this.f4863a.entrySet()) {
                jSONObject.put(java.lang.String.valueOf(com.inmobi.media.Mf.a((com.inmobi.media.Lf) entry.getKey())), ((com.inmobi.media.Mo) entry.getValue()).a());
            }
            return jSONObject;
        } catch (java.lang.Exception e) {
            kotlin.Lazy lazy = com.inmobi.media.W9.f5027a;
            com.inmobi.media.W9.a(new com.inmobi.media.M2(e));
            return new org.json.JSONObject();
        }
    }
}
