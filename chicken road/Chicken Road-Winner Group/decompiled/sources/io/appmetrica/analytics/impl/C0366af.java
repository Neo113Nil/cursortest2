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
public final class C0366af extends Fd {

    /* renamed from: d, reason: collision with root package name */
    public static final C0444df f6969d = new C0444df("UUID_RESULT", null);

    /* renamed from: e, reason: collision with root package name */
    public static final C0444df f6970e = new C0444df("DEVICE_ID_RESULT", null);
    public static final C0444df f = new C0444df("DEVICE_ID_HASH_RESULT", null);

    /* renamed from: g, reason: collision with root package name */
    public static final C0444df f6971g = new C0444df("AD_URL_GET_RESULT", null);

    /* renamed from: h, reason: collision with root package name */
    public static final C0444df f6972h = new C0444df("AD_URL_REPORT_RESULT", null);

    /* renamed from: i, reason: collision with root package name */
    public static final C0444df f6973i = new C0444df("CUSTOM_HOSTS", null);

    /* renamed from: j, reason: collision with root package name */
    public static final C0444df f6974j = new C0444df("SERVER_TIME_OFFSET", null);

    /* renamed from: k, reason: collision with root package name */
    public static final C0444df f6975k = new C0444df("RESPONSE_CLIDS_RESULT", null);

    /* renamed from: l, reason: collision with root package name */
    public static final C0444df f6976l = new C0444df("CUSTOM_SDK_HOSTS", null);

    /* renamed from: m, reason: collision with root package name */
    public static final C0444df f6977m = new C0444df("CLIENT_CLIDS", null);

    /* renamed from: n, reason: collision with root package name */
    public static final C0444df f6978n = new C0444df("DEFERRED_DEEP_LINK_WAS_CHECKED", null);

    /* renamed from: o, reason: collision with root package name */
    public static final C0444df f6979o = new C0444df("API_LEVEL", null);

    /* renamed from: p, reason: collision with root package name */
    public static final C0444df f6980p = new C0444df("NEXT_STARTUP_TIME", null);

    /* renamed from: q, reason: collision with root package name */
    public static final C0444df f6981q = new C0444df("GAID", null);

    /* renamed from: r, reason: collision with root package name */
    public static final C0444df f6982r = new C0444df("HOAID", null);

    /* renamed from: s, reason: collision with root package name */
    public static final C0444df f6983s = new C0444df("YANDEX_ADV_ID", null);

    /* renamed from: t, reason: collision with root package name */
    public static final C0444df f6984t = new C0444df("CLIENT_CLIDS_CHANGED_AFTER_LAST_IDENTIFIERS_UPDATE", null);

    /* renamed from: u, reason: collision with root package name */
    public static final C0444df f6985u = new C0444df("SCREEN_INFO", null);

    /* renamed from: v, reason: collision with root package name */
    public static final C0444df f6986v = new C0444df("SCREEN_SIZE_CHECKED_BY_DEPRECATED", null);

    /* renamed from: w, reason: collision with root package name */
    public static final C0444df f6987w = new C0444df("FEATURES", null);

    /* renamed from: x, reason: collision with root package name */
    public static final C0444df f6988x = new C0444df("APPMETRICA_CLIENT_CONFIG", null);

    public C0366af(Oa oa) {
        super(oa);
    }

    public final boolean a(boolean z3) {
        return this.f7110a.getBoolean(f6984t.f7153b, z3);
    }

    public final long b(long j3) {
        return this.f7110a.getLong(f6974j.f7152a, j3);
    }

    public final C0366af c(IdentifiersResult identifiersResult) {
        return a(f6976l.f7153b, identifiersResult);
    }

    public final IdentifiersResult d() {
        return h(f6971g.f7153b);
    }

    public final IdentifiersResult e() {
        return h(f6972h.f7153b);
    }

    public final C0366af f(IdentifiersResult identifiersResult) {
        return a(f6981q.f7153b, identifiersResult);
    }

    public final IdentifiersResult h() {
        return h(f6976l.f7153b);
    }

    public final IdentifiersResult i() {
        return h(f.f7153b);
    }

    public final IdentifiersResult j() {
        return h(f6970e.f7153b);
    }

    public final C0413ca k() {
        String string = this.f7110a.getString(f6987w.f7153b, null);
        try {
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                return new C0413ca(JsonUtils.optBooleanOrNull(jSONObject, "libSslEnabled"), IdentifierStatus.from(JsonUtils.optStringOrNull(jSONObject, "STATUS")), JsonUtils.optStringOrNull(jSONObject, "ERROR_EXPLANATION"));
            }
        } catch (Throwable unused) {
        }
        return new C0413ca(null, IdentifierStatus.UNKNOWN, null);
    }

    public final IdentifiersResult l() {
        return h(f6981q.f7153b);
    }

    public final IdentifiersResult m() {
        return h(f6982r.f7153b);
    }

    public final long n() {
        return this.f7110a.getLong(f6980p.f7153b, 0L);
    }

    public final IdentifiersResult o() {
        return h(f6975k.f7153b);
    }

    public final ScreenInfo p() {
        return AbstractC0698nb.e(this.f7110a.getString(f6985u.f7153b, null));
    }

    public final IdentifiersResult q() {
        return h(f6969d.f7153b);
    }

    public final IdentifiersResult r() {
        return h(f6983s.f7153b);
    }

    public final boolean s() {
        return this.f7110a.getBoolean(f6978n.f7153b, false);
    }

    public final boolean t() {
        return this.f7110a.getBoolean(f6986v.f7153b, false);
    }

    public final C0366af u() {
        return (C0366af) b(f6978n.f7153b, true);
    }

    public final void v() {
        b(f6986v.f7153b, true);
    }

    public final List<String> g() {
        String string = this.f7110a.getString(f6973i.f7153b, null);
        if (TextUtils.isEmpty(string)) {
            return null;
        }
        return AbstractC0698nb.b(string);
    }

    public final long a(long j3) {
        return this.f7110a.getLong(f6979o.f7153b, j3);
    }

    public final C0366af b(IdentifiersResult identifiersResult) {
        return a(f6972h.f7153b, identifiersResult);
    }

    public final C0366af c(long j3) {
        return (C0366af) b(f6979o.f7153b, j3);
    }

    public final C0366af d(IdentifiersResult identifiersResult) {
        return a(f.f7153b, identifiersResult);
    }

    public final C0366af e(IdentifiersResult identifiersResult) {
        return a(f6970e.f7153b, identifiersResult);
    }

    public final AppMetricaConfig.Builder f() {
        String string = this.f7110a.getString(f6988x.f7153b, null);
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
            string = this.f7110a.getString(str, null);
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

    public final C0366af i(IdentifiersResult identifiersResult) {
        return a(f6969d.f7153b, identifiersResult);
    }

    public final C0366af j(IdentifiersResult identifiersResult) {
        return a(f6983s.f7153b, identifiersResult);
    }

    public final C0366af g(IdentifiersResult identifiersResult) {
        return a(f6982r.f7153b, identifiersResult);
    }

    public final C0366af a(IdentifiersResult identifiersResult) {
        return a(f6971g.f7153b, identifiersResult);
    }

    public final C0366af b(boolean z3) {
        return (C0366af) b(f6984t.f7153b, z3);
    }

    public final C0366af d(long j3) {
        return (C0366af) b(f6980p.f7153b, j3);
    }

    public final C0366af e(long j3) {
        return (C0366af) b(f6974j.f7153b, j3);
    }

    public final String i(String str) {
        return this.f7110a.getString(f6977m.f7153b, str);
    }

    public final C0366af j(String str) {
        return (C0366af) b(f6977m.f7153b, str);
    }

    @Override // io.appmetrica.analytics.impl.Fd
    public final String f(String str) {
        return new C0444df(str, null).f7153b;
    }

    public final C0366af a(List<String> list) {
        return (C0366af) b(f6973i.f7153b, AbstractC0711no.a((Collection) list) ? null : new JSONArray((Collection) list).toString());
    }

    public final C0366af h(IdentifiersResult identifiersResult) {
        return a(f6975k.f7153b, identifiersResult);
    }

    @Override // io.appmetrica.analytics.impl.Fd
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public final C0366af g(String str) {
        return (C0366af) d(new C0444df(str, null).f7153b);
    }

    public final C0366af a(C0413ca c0413ca) {
        String str = f6987w.f7153b;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("libSslEnabled", c0413ca.f7100a).put("STATUS", c0413ca.f7101b.getValue()).putOpt("ERROR_EXPLANATION", c0413ca.f7102c);
        } catch (Throwable unused) {
        }
        return (C0366af) b(str, jSONObject.toString());
    }

    public final void a(ScreenInfo screenInfo) {
        b(f6985u.f7153b, AbstractC0698nb.a(screenInfo));
    }

    public final void a(AppMetricaConfig appMetricaConfig) {
        b(f6988x.f7153b, appMetricaConfig.toJson());
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final C0366af a(String str, IdentifiersResult identifiersResult) {
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
