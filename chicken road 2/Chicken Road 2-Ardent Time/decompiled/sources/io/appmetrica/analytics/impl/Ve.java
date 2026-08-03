package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Ve extends io.appmetrica.analytics.impl.AbstractC0848yd {

    /* renamed from: d, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5143d = new io.appmetrica.analytics.impl.Ye("UUID_RESULT", null);

    /* renamed from: e, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5144e = new io.appmetrica.analytics.impl.Ye("DEVICE_ID_RESULT", null);

    /* renamed from: f, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5145f = new io.appmetrica.analytics.impl.Ye("DEVICE_ID_HASH_RESULT", null);

    /* renamed from: g, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5146g = new io.appmetrica.analytics.impl.Ye("AD_URL_GET_RESULT", null);

    /* renamed from: h, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5147h = new io.appmetrica.analytics.impl.Ye("AD_URL_REPORT_RESULT", null);

    /* renamed from: i, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5148i = new io.appmetrica.analytics.impl.Ye("CUSTOM_HOSTS", null);

    /* renamed from: j, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5149j = new io.appmetrica.analytics.impl.Ye("SERVER_TIME_OFFSET", null);

    /* renamed from: k, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5150k = new io.appmetrica.analytics.impl.Ye("RESPONSE_CLIDS_RESULT", null);

    /* renamed from: l, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5151l = new io.appmetrica.analytics.impl.Ye("CUSTOM_SDK_HOSTS", null);

    /* renamed from: m, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5152m = new io.appmetrica.analytics.impl.Ye("CLIENT_CLIDS", null);

    /* renamed from: n, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5153n = new io.appmetrica.analytics.impl.Ye("DEFERRED_DEEP_LINK_WAS_CHECKED", null);

    /* renamed from: o, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5154o = new io.appmetrica.analytics.impl.Ye("API_LEVEL", null);

    /* renamed from: p, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5155p = new io.appmetrica.analytics.impl.Ye("NEXT_STARTUP_TIME", null);

    /* renamed from: q, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5156q = new io.appmetrica.analytics.impl.Ye("GAID", null);

    /* renamed from: r, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5157r = new io.appmetrica.analytics.impl.Ye("HOAID", null);

    /* renamed from: s, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5158s = new io.appmetrica.analytics.impl.Ye("YANDEX_ADV_ID", null);
    public static final io.appmetrica.analytics.impl.Ye t = new io.appmetrica.analytics.impl.Ye("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);

    /* renamed from: u, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5159u = new io.appmetrica.analytics.impl.Ye("SCREEN_INFO", null);

    /* renamed from: v, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5160v = new io.appmetrica.analytics.impl.Ye("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);

    /* renamed from: w, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5161w = new io.appmetrica.analytics.impl.Ye("FEATURES", null);

    /* renamed from: x, reason: collision with root package name */
    public static final io.appmetrica.analytics.impl.Ye f5162x = new io.appmetrica.analytics.impl.Ye("APPMETRICA_CLIENT_CONFIG", null);

    public Ve(io.appmetrica.analytics.impl.Ha ha) {
        super(ha);
    }

    public final boolean a(boolean z2) {
        return this.f5302a.getBoolean(t.f5343b, z2);
    }

    public final long b(long j2) {
        return this.f5302a.getLong(f5149j.f5342a, j2);
    }

    public final io.appmetrica.analytics.impl.Ve c(io.appmetrica.analytics.internal.IdentifiersResult identifiersResult) {
        return a(f5151l.f5343b, identifiersResult);
    }

    public final io.appmetrica.analytics.internal.IdentifiersResult d() {
        return h(f5146g.f5343b);
    }

    public final io.appmetrica.analytics.internal.IdentifiersResult e() {
        return h(f5147h.f5343b);
    }

    public final io.appmetrica.analytics.impl.Ve f(io.appmetrica.analytics.internal.IdentifiersResult identifiersResult) {
        return a(f5156q.f5343b, identifiersResult);
    }

    public final io.appmetrica.analytics.internal.IdentifiersResult h() {
        return h(f5151l.f5343b);
    }

    public final io.appmetrica.analytics.internal.IdentifiersResult i() {
        return h(f5145f.f5343b);
    }

    public final io.appmetrica.analytics.internal.IdentifiersResult j() {
        return h(f5144e.f5343b);
    }

    public final io.appmetrica.analytics.impl.V9 k() {
        java.lang.String string = this.f5302a.getString(f5161w.f5343b, null);
        try {
            if (!android.text.TextUtils.isEmpty(string)) {
                org.json.JSONObject jSONObject = new org.json.JSONObject(string);
                return new io.appmetrica.analytics.impl.V9(io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optBooleanOrNull(jSONObject, "libSslEnabled"), io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.from(io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(jSONObject, "STATUS")), io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (java.lang.Throwable unused) {
        }
        return new io.appmetrica.analytics.impl.V9(null, io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.UNKNOWN, null);
    }

    public final io.appmetrica.analytics.internal.IdentifiersResult l() {
        return h(f5156q.f5343b);
    }

    public final io.appmetrica.analytics.internal.IdentifiersResult m() {
        return h(f5157r.f5343b);
    }

    public final long n() {
        return this.f5302a.getLong(f5155p.f5343b, 0L);
    }

    public final io.appmetrica.analytics.internal.IdentifiersResult o() {
        return h(f5150k.f5343b);
    }

    public final io.appmetrica.analytics.coreapi.internal.model.ScreenInfo p() {
        return io.appmetrica.analytics.impl.AbstractC0380gb.e(this.f5302a.getString(f5159u.f5343b, null));
    }

    public final io.appmetrica.analytics.internal.IdentifiersResult q() {
        return h(f5143d.f5343b);
    }

    public final io.appmetrica.analytics.internal.IdentifiersResult r() {
        return h(f5158s.f5343b);
    }

    public final boolean s() {
        return this.f5302a.getBoolean(f5153n.f5343b, false);
    }

    public final boolean t() {
        return this.f5302a.getBoolean(f5160v.f5343b, false);
    }

    public final io.appmetrica.analytics.impl.Ve u() {
        return (io.appmetrica.analytics.impl.Ve) b(f5153n.f5343b, true);
    }

    public final void v() {
        b(f5160v.f5343b, true);
    }

    public final java.util.List<java.lang.String> g() {
        java.lang.String string = this.f5302a.getString(f5148i.f5343b, null);
        if (android.text.TextUtils.isEmpty(string)) {
            return null;
        }
        return io.appmetrica.analytics.impl.AbstractC0380gb.b(string);
    }

    public final long a(long j2) {
        return this.f5302a.getLong(f5154o.f5343b, j2);
    }

    public final io.appmetrica.analytics.impl.Ve b(io.appmetrica.analytics.internal.IdentifiersResult identifiersResult) {
        return a(f5147h.f5343b, identifiersResult);
    }

    public final io.appmetrica.analytics.impl.Ve c(long j2) {
        return (io.appmetrica.analytics.impl.Ve) b(f5154o.f5343b, j2);
    }

    public final io.appmetrica.analytics.impl.Ve d(io.appmetrica.analytics.internal.IdentifiersResult identifiersResult) {
        return a(f5145f.f5343b, identifiersResult);
    }

    public final io.appmetrica.analytics.impl.Ve e(io.appmetrica.analytics.internal.IdentifiersResult identifiersResult) {
        return a(f5144e.f5343b, identifiersResult);
    }

    public final io.appmetrica.analytics.AppMetricaConfig.Builder f() {
        java.lang.String string = this.f5302a.getString(f5162x.f5343b, null);
        if (string == null) {
            return null;
        }
        return new io.appmetrica.analytics.impl.G3().a(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.appmetrica.analytics.internal.IdentifiersResult h(java.lang.String str) {
        io.appmetrica.analytics.internal.IdentifiersResult identifiersResult;
        java.lang.String string;
        try {
            string = this.f5302a.getString(str, null);
        } catch (java.lang.Throwable unused) {
        }
        if (string != null) {
            org.json.JSONObject jSONObject = new org.json.JSONObject(string);
            identifiersResult = new io.appmetrica.analytics.internal.IdentifiersResult(io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(jSONObject, "ID"), io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.from(io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(jSONObject, "STATUS")), io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            return identifiersResult != null ? new io.appmetrica.analytics.internal.IdentifiersResult(null, io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus.UNKNOWN, "no identifier in preferences") : identifiersResult;
        }
        identifiersResult = null;
        if (identifiersResult != null) {
        }
    }

    public final io.appmetrica.analytics.impl.Ve i(io.appmetrica.analytics.internal.IdentifiersResult identifiersResult) {
        return a(f5143d.f5343b, identifiersResult);
    }

    public final io.appmetrica.analytics.impl.Ve j(io.appmetrica.analytics.internal.IdentifiersResult identifiersResult) {
        return a(f5158s.f5343b, identifiersResult);
    }

    public final io.appmetrica.analytics.impl.Ve g(io.appmetrica.analytics.internal.IdentifiersResult identifiersResult) {
        return a(f5157r.f5343b, identifiersResult);
    }

    public final io.appmetrica.analytics.impl.Ve a(io.appmetrica.analytics.internal.IdentifiersResult identifiersResult) {
        return a(f5146g.f5343b, identifiersResult);
    }

    public final io.appmetrica.analytics.impl.Ve b(boolean z2) {
        return (io.appmetrica.analytics.impl.Ve) b(t.f5343b, z2);
    }

    public final io.appmetrica.analytics.impl.Ve d(long j2) {
        return (io.appmetrica.analytics.impl.Ve) b(f5155p.f5343b, j2);
    }

    public final io.appmetrica.analytics.impl.Ve e(long j2) {
        return (io.appmetrica.analytics.impl.Ve) b(f5149j.f5343b, j2);
    }

    public final java.lang.String i(java.lang.String str) {
        return this.f5302a.getString(f5152m.f5343b, str);
    }

    public final io.appmetrica.analytics.impl.Ve j(java.lang.String str) {
        return (io.appmetrica.analytics.impl.Ve) b(f5152m.f5343b, str);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0848yd
    public final java.lang.String f(java.lang.String str) {
        return new io.appmetrica.analytics.impl.Ye(str, null).f5343b;
    }

    public final io.appmetrica.analytics.impl.Ve a(java.util.List<java.lang.String> list) {
        return (io.appmetrica.analytics.impl.Ve) b(f5148i.f5343b, io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Collection) list) ? null : new org.json.JSONArray((java.util.Collection) list).toString());
    }

    public final io.appmetrica.analytics.impl.Ve h(io.appmetrica.analytics.internal.IdentifiersResult identifiersResult) {
        return a(f5150k.f5343b, identifiersResult);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0848yd
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final io.appmetrica.analytics.impl.Ve g(java.lang.String str) {
        return (io.appmetrica.analytics.impl.Ve) d(new io.appmetrica.analytics.impl.Ye(str, null).f5343b);
    }

    public final io.appmetrica.analytics.impl.Ve a(io.appmetrica.analytics.impl.V9 v9) {
        java.lang.String str = f5161w.f5343b;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", v9.f5134a).put("STATUS", v9.f5135b.getValue()).putOpt("ERROR_EXPLANATION", v9.f5136c);
        } catch (java.lang.Throwable unused) {
        }
        return (io.appmetrica.analytics.impl.Ve) b(str, jSONObject.toString());
    }

    public final void a(io.appmetrica.analytics.coreapi.internal.model.ScreenInfo screenInfo) {
        b(f5159u.f5343b, io.appmetrica.analytics.impl.AbstractC0380gb.a(screenInfo));
    }

    public final void a(io.appmetrica.analytics.AppMetricaConfig appMetricaConfig) {
        b(f5162x.f5343b, appMetricaConfig.toJson());
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final io.appmetrica.analytics.impl.Ve a(java.lang.String str, io.appmetrica.analytics.internal.IdentifiersResult identifiersResult) {
        java.lang.String jSONObject;
        if (identifiersResult != null) {
            try {
                org.json.JSONObject jSONObject2 = new org.json.JSONObject();
                try {
                    jSONObject2.put("ID", identifiersResult.id).put("STATUS", identifiersResult.status.getValue()).put("ERROR_EXPLANATION", identifiersResult.errorExplanation);
                } catch (java.lang.Throwable unused) {
                }
                jSONObject = jSONObject2.toString();
            } catch (java.lang.Throwable unused2) {
            }
            if (jSONObject != null) {
                b(str, jSONObject);
            }
            return this;
        }
        jSONObject = null;
        if (jSONObject != null) {
        }
        return this;
    }
}
