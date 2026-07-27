package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.services.FrameworkDetector;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* renamed from: io.appmetrica.analytics.impl.t7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0849t7 {

    /* renamed from: a, reason: collision with root package name */
    public final String f8333a;

    /* renamed from: b, reason: collision with root package name */
    public final String f8334b;

    /* renamed from: c, reason: collision with root package name */
    public final String f8335c;

    /* renamed from: d, reason: collision with root package name */
    public final String f8336d;

    /* renamed from: e, reason: collision with root package name */
    public final String f8337e;
    public final String f;

    /* renamed from: g, reason: collision with root package name */
    public final String f8338g;

    /* renamed from: h, reason: collision with root package name */
    public final String f8339h;

    /* renamed from: i, reason: collision with root package name */
    public final String f8340i;

    /* renamed from: j, reason: collision with root package name */
    public final String f8341j;

    /* renamed from: k, reason: collision with root package name */
    public final String f8342k;

    /* renamed from: l, reason: collision with root package name */
    public final String f8343l;

    /* renamed from: m, reason: collision with root package name */
    public final String f8344m;

    /* renamed from: n, reason: collision with root package name */
    public final String f8345n;

    public C0849t7(C0672mb c0672mb) {
        this.f8333a = c0672mb.b("dId");
        this.f8334b = c0672mb.b("uId");
        this.f8335c = c0672mb.b("analyticsSdkVersionName");
        this.f8336d = c0672mb.b("kitBuildNumber");
        this.f8337e = c0672mb.b("kitBuildType");
        this.f = c0672mb.b("appVer");
        this.f8338g = c0672mb.optString("app_debuggable", CommonUrlParts.Values.FALSE_INTEGER);
        this.f8339h = c0672mb.b("appBuild");
        this.f8340i = c0672mb.b("osVer");
        this.f8342k = c0672mb.b("lang");
        this.f8343l = c0672mb.b("root");
        this.f8344m = c0672mb.optString(CommonUrlParts.APP_FRAMEWORK, FrameworkDetector.framework());
        int optInt = c0672mb.optInt("osApiLev", -1);
        this.f8341j = optInt == -1 ? null : String.valueOf(optInt);
        int optInt2 = c0672mb.optInt("attribution_id", 0);
        this.f8345n = optInt2 > 0 ? String.valueOf(optInt2) : null;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DbNetworkTaskConfig{deviceId='");
        sb.append(this.f8333a);
        sb.append("', uuid='");
        sb.append(this.f8334b);
        sb.append("', analyticsSdkVersionName='");
        sb.append(this.f8335c);
        sb.append("', kitBuildNumber='");
        sb.append(this.f8336d);
        sb.append("', kitBuildType='");
        sb.append(this.f8337e);
        sb.append("', appVersion='");
        sb.append(this.f);
        sb.append("', appDebuggable='");
        sb.append(this.f8338g);
        sb.append("', appBuildNumber='");
        sb.append(this.f8339h);
        sb.append("', osVersion='");
        sb.append(this.f8340i);
        sb.append("', osApiLevel='");
        sb.append(this.f8341j);
        sb.append("', locale='");
        sb.append(this.f8342k);
        sb.append("', deviceRootStatus='");
        sb.append(this.f8343l);
        sb.append("', appFramework='");
        sb.append(this.f8344m);
        sb.append("', attributionId='");
        return B0.c.l(sb, this.f8345n, "'}");
    }

    public C0849t7() {
        this.f8333a = null;
        this.f8334b = null;
        this.f8335c = null;
        this.f8336d = null;
        this.f8337e = null;
        this.f = null;
        this.f8338g = null;
        this.f8339h = null;
        this.f8340i = null;
        this.f8341j = null;
        this.f8342k = null;
        this.f8343l = null;
        this.f8344m = null;
        this.f8345n = null;
    }
}
