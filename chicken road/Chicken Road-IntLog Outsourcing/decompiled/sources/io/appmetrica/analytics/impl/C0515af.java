package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.AppMetricaConfig;
import io.appmetrica.analytics.coreapi.internal.identifiers.IdentifierStatus;
import io.appmetrica.analytics.coreapi.internal.model.ScreenInfo;
import io.appmetrica.analytics.coreutils.internal.parsing.JsonUtils;
import io.appmetrica.analytics.internal.IdentifiersResult;
import java.util.Collection;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.af, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0515af extends Fd {

    /* renamed from: d, reason: collision with root package name */
    public static final C0593df f7850d = new C0593df("UUID_RESULT", null);

    /* renamed from: e, reason: collision with root package name */
    public static final C0593df f7851e = new C0593df("DEVICE_ID_RESULT", null);

    /* renamed from: f, reason: collision with root package name */
    public static final C0593df f7852f = new C0593df("DEVICE_ID_HASH_RESULT", null);

    /* renamed from: g, reason: collision with root package name */
    public static final C0593df f7853g = new C0593df("AD_URL_GET_RESULT", null);

    /* renamed from: h, reason: collision with root package name */
    public static final C0593df f7854h = new C0593df("AD_URL_REPORT_RESULT", null);

    /* renamed from: i, reason: collision with root package name */
    public static final C0593df f7855i = new C0593df("CUSTOM_HOSTS", null);

    /* renamed from: j, reason: collision with root package name */
    public static final C0593df f7856j = new C0593df("SERVER_TIME_OFFSET", null);

    /* renamed from: k, reason: collision with root package name */
    public static final C0593df f7857k = new C0593df("RESPONSE_CLIDS_RESULT", null);

    /* renamed from: l, reason: collision with root package name */
    public static final C0593df f7858l = new C0593df("CUSTOM_SDK_HOSTS", null);

    /* renamed from: m, reason: collision with root package name */
    public static final C0593df f7859m = new C0593df("CLIENT_CLIDS", null);

    /* renamed from: n, reason: collision with root package name */
    public static final C0593df f7860n = new C0593df("DEFERRED_DEEP_LINK_WAS_CHECKED", null);

    /* renamed from: o, reason: collision with root package name */
    public static final C0593df f7861o = new C0593df("API_LEVEL", null);

    /* renamed from: p, reason: collision with root package name */
    public static final C0593df f7862p = new C0593df("NEXT_STARTUP_TIME", null);

    /* renamed from: q, reason: collision with root package name */
    public static final C0593df f7863q = new C0593df("GAID", null);

    /* renamed from: r, reason: collision with root package name */
    public static final C0593df f7864r = new C0593df("HOAID", null);

    /* renamed from: s, reason: collision with root package name */
    public static final C0593df f7865s = new C0593df("YANDEX_ADV_ID", null);

    /* renamed from: t, reason: collision with root package name */
    public static final C0593df f7866t = new C0593df("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);

    /* renamed from: u, reason: collision with root package name */
    public static final C0593df f7867u = new C0593df("SCREEN_INFO", null);

    /* renamed from: v, reason: collision with root package name */
    public static final C0593df f7868v = new C0593df("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);

    /* renamed from: w, reason: collision with root package name */
    public static final C0593df f7869w = new C0593df("FEATURES", null);

    /* renamed from: x, reason: collision with root package name */
    public static final C0593df f7870x = new C0593df("APPMETRICA_CLIENT_CONFIG", null);

    public C0515af(Oa oa) {
        super(oa);
    }

    public final boolean a(boolean z) {
        return this.f7998a.getBoolean(f7866t.f8043b, z);
    }

    public final long b(long j2) {
        return this.f7998a.getLong(f7856j.f8042a, j2);
    }

    public final C0515af c(IdentifiersResult identifiersResult) {
        return a(f7858l.f8043b, identifiersResult);
    }

    public final IdentifiersResult d() {
        return h(f7853g.f8043b);
    }

    public final IdentifiersResult e() {
        return h(f7854h.f8043b);
    }

    public final C0515af f(IdentifiersResult identifiersResult) {
        return a(f7863q.f8043b, identifiersResult);
    }

    public final IdentifiersResult h() {
        return h(f7858l.f8043b);
    }

    public final IdentifiersResult i() {
        return h(f7852f.f8043b);
    }

    public final IdentifiersResult j() {
        return h(f7851e.f8043b);
    }

    public final C0562ca k() {
        String string = this.f7998a.getString(f7869w.f8043b, null);
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                return new C0562ca(JsonUtils.optBooleanOrNull(jSONObject, "libSslEnabled"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new C0562ca(null, IdentifierStatus.UNKNOWN, null);
    }

    public final IdentifiersResult l() {
        return h(f7863q.f8043b);
    }

    public final IdentifiersResult m() {
        return h(f7864r.f8043b);
    }

    public final long n() {
        return this.f7998a.getLong(f7862p.f8043b, 0L);
    }

    public final IdentifiersResult o() {
        return h(f7857k.f8043b);
    }

    public final ScreenInfo p() {
        return AbstractC0847nb.e(this.f7998a.getString(f7867u.f8043b, null));
    }

    public final IdentifiersResult q() {
        return h(f7850d.f8043b);
    }

    public final IdentifiersResult r() {
        return h(f7865s.f8043b);
    }

    public final boolean s() {
        return this.f7998a.getBoolean(f7860n.f8043b, false);
    }

    public final boolean t() {
        return this.f7998a.getBoolean(f7868v.f8043b, false);
    }

    public final C0515af u() {
        return (C0515af) b(f7860n.f8043b, true);
    }

    public final void v() {
        b(f7868v.f8043b, true);
    }

    public final List<String> g() {
        String string = this.f7998a.getString(f7855i.f8043b, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return AbstractC0847nb.b(string);
    }

    public final long a(long j2) {
        return this.f7998a.getLong(f7861o.f8043b, j2);
    }

    public final C0515af b(IdentifiersResult identifiersResult) {
        return a(f7854h.f8043b, identifiersResult);
    }

    public final C0515af c(long j2) {
        return (C0515af) b(f7861o.f8043b, j2);
    }

    public final C0515af d(IdentifiersResult identifiersResult) {
        return a(f7852f.f8043b, identifiersResult);
    }

    public final C0515af e(IdentifiersResult identifiersResult) {
        return a(f7851e.f8043b, identifiersResult);
    }

    public final AppMetricaConfig.Builder f() {
        String string = this.f7998a.getString(f7870x.f8043b, null);
        if (string == null) {
            return null;
        }
        return new O3().a(string);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final IdentifiersResult h(String str) {
        IdentifiersResult identifiersResult;
        String string;
        try {
            string = this.f7998a.getString(str, null);
        } catch (Throwable unused) {
        }
        if (string != null) {
            JSONObject jSONObject = new JSONObject(string);
            identifiersResult = new IdentifiersResult(JsonUtils.optStringOrNull(jSONObject, "ID"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            return identifiersResult != null ? new IdentifiersResult(null, IdentifierStatus.UNKNOWN, "no identifier in preferences") : identifiersResult;
        }
        identifiersResult = null;
        if (identifiersResult != null) {
        }
    }

    public final C0515af i(IdentifiersResult identifiersResult) {
        return a(f7850d.f8043b, identifiersResult);
    }

    public final C0515af j(IdentifiersResult identifiersResult) {
        return a(f7865s.f8043b, identifiersResult);
    }

    public final C0515af g(IdentifiersResult identifiersResult) {
        return a(f7864r.f8043b, identifiersResult);
    }

    public final C0515af a(IdentifiersResult identifiersResult) {
        return a(f7853g.f8043b, identifiersResult);
    }

    public final C0515af b(boolean z) {
        return (C0515af) b(f7866t.f8043b, z);
    }

    public final C0515af d(long j2) {
        return (C0515af) b(f7862p.f8043b, j2);
    }

    public final C0515af e(long j2) {
        return (C0515af) b(f7856j.f8043b, j2);
    }

    public final String i(String str) {
        return this.f7998a.getString(f7859m.f8043b, str);
    }

    public final C0515af j(String str) {
        return (C0515af) b(f7859m.f8043b, str);
    }

    @Override // io.appmetrica.analytics.impl.Fd
    public final String f(String str) {
        return new C0593df(str, null).f8043b;
    }

    public final C0515af a(List<String> list) {
        return (C0515af) b(f7855i.f8043b, AbstractC0860no.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
    }

    public final C0515af h(IdentifiersResult identifiersResult) {
        return a(f7857k.f8043b, identifiersResult);
    }

    @Override // io.appmetrica.analytics.impl.Fd
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final C0515af g(String str) {
        return (C0515af) d(new C0593df(str, null).f8043b);
    }

    public final C0515af a(C0562ca c0562ca) {
        String str = f7869w.f8043b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", c0562ca.f7988a).put("STATUS", c0562ca.f7989b.getValue()).putOpt("ERROR_EXPLANATION", c0562ca.f7990c);
        } catch (Throwable unused) {
        }
        return (C0515af) b(str, jSONObject.toString());
    }

    public final void a(ScreenInfo screenInfo) {
        b(f7867u.f8043b, AbstractC0847nb.a(screenInfo));
    }

    public final void a(AppMetricaConfig appMetricaConfig) {
        b(f7870x.f8043b, appMetricaConfig.toJson());
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0515af a(String str, IdentifiersResult identifiersResult) {
        String jSONObject;
        if (identifiersResult != null) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("ID", identifiersResult.id).put("STATUS", identifiersResult.status.getValue()).put("ERROR_EXPLANATION", identifiersResult.errorExplanation);
                } catch (Throwable unused) {
                }
                jSONObject = jSONObject2.toString();
            } catch (Throwable unused2) {
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
