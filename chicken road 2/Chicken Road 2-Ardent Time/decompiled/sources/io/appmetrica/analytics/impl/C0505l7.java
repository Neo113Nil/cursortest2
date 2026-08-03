package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.l7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0505l7 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f6333a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f6334b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f6335c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f6336d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f6337e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f6338f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f6339g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f6340h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f6341i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f6342j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f6343k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f6344l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f6345m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f6346n;

    public C0505l7(io.appmetrica.analytics.impl.C0354fb c0354fb) {
        this.f6333a = c0354fb.b("dId");
        this.f6334b = c0354fb.b("uId");
        this.f6335c = c0354fb.b("analyticsSdkVersionName");
        this.f6336d = c0354fb.b("kitBuildNumber");
        this.f6337e = c0354fb.b("kitBuildType");
        this.f6338f = c0354fb.b("appVer");
        this.f6339g = c0354fb.optString("app_debuggable", io.appmetrica.analytics.networktasks.internal.CommonUrlParts.Values.FALSE_INTEGER);
        this.f6340h = c0354fb.b("appBuild");
        this.f6341i = c0354fb.b("osVer");
        this.f6343k = c0354fb.b("lang");
        this.f6344l = c0354fb.b("root");
        this.f6345m = c0354fb.optString(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.APP_FRAMEWORK, io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector.framework());
        int optInt = c0354fb.optInt("osApiLev", -1);
        this.f6342j = optInt == -1 ? null : java.lang.String.valueOf(optInt);
        int optInt2 = c0354fb.optInt("attribution_id", 0);
        this.f6346n = optInt2 > 0 ? java.lang.String.valueOf(optInt2) : null;
    }

    public final java.lang.String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder("DbNetworkTaskConfig{deviceId='");
        sb.append(this.f6333a);
        sb.append("', uuid='");
        sb.append(this.f6334b);
        sb.append("', analyticsSdkVersionName='");
        sb.append(this.f6335c);
        sb.append("', kitBuildNumber='");
        sb.append(this.f6336d);
        sb.append("', kitBuildType='");
        sb.append(this.f6337e);
        sb.append("', appVersion='");
        sb.append(this.f6338f);
        sb.append("', appDebuggable='");
        sb.append(this.f6339g);
        sb.append("', appBuildNumber='");
        sb.append(this.f6340h);
        sb.append("', osVersion='");
        sb.append(this.f6341i);
        sb.append("', osApiLevel='");
        sb.append(this.f6342j);
        sb.append("', locale='");
        sb.append(this.f6343k);
        sb.append("', deviceRootStatus='");
        sb.append(this.f6344l);
        sb.append("', appFramework='");
        sb.append(this.f6345m);
        sb.append("', attributionId='");
        return B1.a.j(sb, this.f6346n, "'}");
    }

    public C0505l7() {
        this.f6333a = null;
        this.f6334b = null;
        this.f6335c = null;
        this.f6336d = null;
        this.f6337e = null;
        this.f6338f = null;
        this.f6339g = null;
        this.f6340h = null;
        this.f6341i = null;
        this.f6342j = null;
        this.f6343k = null;
        this.f6344l = null;
        this.f6345m = null;
        this.f6346n = null;
    }
}
