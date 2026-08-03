package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Sk {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f4974a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f4975b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f4976c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f4977d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f4978e;

    /* renamed from: f, reason: collision with root package name */
    public final int f4979f;

    /* renamed from: g, reason: collision with root package name */
    public final int f4980g;

    public Sk(org.json.JSONObject jSONObject) {
        this.f4974a = jSONObject.optString("analyticsSdkVersionName", "");
        this.f4975b = jSONObject.optString("kitBuildNumber", "");
        this.f4976c = jSONObject.optString("appVer", "");
        this.f4977d = jSONObject.optString("appBuild", "");
        this.f4978e = jSONObject.optString("osVer", "");
        this.f4979f = jSONObject.optInt("osApiLev", -1);
        this.f4980g = jSONObject.optInt("attribution_id", 0);
    }

    public final java.lang.String toString() {
        return "SessionRequestParams(kitVersionName='" + this.f4974a + "', kitBuildNumber='" + this.f4975b + "', appVersion='" + this.f4976c + "', appBuild='" + this.f4977d + "', osVersion='" + this.f4978e + "', apiLevel=" + this.f4979f + ", attributionId=" + this.f4980g + ')';
    }
}
