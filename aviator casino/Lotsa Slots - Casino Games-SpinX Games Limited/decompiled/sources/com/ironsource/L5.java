package com.ironsource;

/* loaded from: classes5.dex */
public final class L5 {

    /* renamed from: a, reason: collision with root package name */
    private final org.json.JSONObject f5814a;

    public L5(org.json.JSONObject jSONObject) {
        this.f5814a = jSONObject;
    }

    public final java.lang.Boolean a(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        org.json.JSONObject jSONObject = this.f5814a;
        java.lang.Object opt = jSONObject != null ? jSONObject.opt(key) : null;
        if (opt instanceof java.lang.Boolean) {
            return (java.lang.Boolean) opt;
        }
        return null;
    }

    public final java.lang.Integer b(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        org.json.JSONObject jSONObject = this.f5814a;
        java.lang.Object opt = jSONObject != null ? jSONObject.opt(key) : null;
        if (opt instanceof java.lang.Integer) {
            return (java.lang.Integer) opt;
        }
        return null;
    }

    public final java.lang.String c(java.lang.String key) {
        kotlin.jvm.internal.Intrinsics.checkNotNullParameter(key, "key");
        org.json.JSONObject jSONObject = this.f5814a;
        java.lang.Object opt = jSONObject != null ? jSONObject.opt(key) : null;
        if (opt instanceof java.lang.String) {
            return (java.lang.String) opt;
        }
        return null;
    }
}
