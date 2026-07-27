package io.appmetrica.analytics.impl;

import org.json.JSONObject;

/* loaded from: classes.dex */
public final class Xk {

    /* renamed from: a, reason: collision with root package name */
    public final String f6834a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6835b;

    /* renamed from: c, reason: collision with root package name */
    public final String f6836c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6837d;

    /* renamed from: e, reason: collision with root package name */
    public final String f6838e;
    public final int f;

    /* renamed from: g, reason: collision with root package name */
    public final int f6839g;

    public Xk(JSONObject jSONObject) {
        this.f6834a = jSONObject.optString("analyticsSdkVersionName", "");
        this.f6835b = jSONObject.optString("kitBuildNumber", "");
        this.f6836c = jSONObject.optString("appVer", "");
        this.f6837d = jSONObject.optString("appBuild", "");
        this.f6838e = jSONObject.optString("osVer", "");
        this.f = jSONObject.optInt("osApiLev", -1);
        this.f6839g = jSONObject.optInt("attribution_id", 0);
    }

    public final String toString() {
        return "SessionRequestParams(kitVersionName='" + this.f6834a + "', kitBuildNumber='" + this.f6835b + "', appVersion='" + this.f6836c + "', appBuild='" + this.f6837d + "', osVersion='" + this.f6838e + "', apiLevel=" + this.f + ", attributionId=" + this.f6839g + ')';
    }
}
