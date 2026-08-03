package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public final org.json.JSONObject f3861a = new org.json.JSONObject();

    public final com.fyber.inneractive.sdk.network.x a(java.lang.Object obj, java.lang.String str) {
        try {
            this.f3861a.put(str, obj);
        } catch (java.lang.Exception unused) {
            com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", str, obj);
        }
        return this;
    }
}
