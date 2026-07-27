package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.bf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0392bf extends Fd implements Do {

    /* renamed from: d, reason: collision with root package name */
    public static final long f7043d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7044e = -1;
    public static final String f = "";

    /* renamed from: g, reason: collision with root package name */
    public static final String f7045g = "";

    /* renamed from: r, reason: collision with root package name */
    public static final String f7056r = "SESSION_";

    /* renamed from: h, reason: collision with root package name */
    public static final C0444df f7046h = new C0444df("PERMISSIONS_CHECK_TIME", null);

    /* renamed from: i, reason: collision with root package name */
    public static final C0444df f7047i = new C0444df("PROFILE_ID", null);

    /* renamed from: j, reason: collision with root package name */
    public static final C0444df f7048j = new C0444df("APP_ENVIRONMENT", null);

    /* renamed from: k, reason: collision with root package name */
    public static final C0444df f7049k = new C0444df("APP_ENVIRONMENT_REVISION", null);

    /* renamed from: l, reason: collision with root package name */
    public static final C0444df f7050l = new C0444df("LAST_APP_VERSION_WITH_FEATURES", null);

    /* renamed from: m, reason: collision with root package name */
    public static final C0444df f7051m = new C0444df("APPLICATION_FEATURES", null);

    /* renamed from: n, reason: collision with root package name */
    public static final C0444df f7052n = new C0444df("CERTIFICATES_SHA1_FINGERPRINTS", null);

    /* renamed from: o, reason: collision with root package name */
    public static final C0444df f7053o = new C0444df("VITAL_DATA", null);

    /* renamed from: p, reason: collision with root package name */
    public static final C0444df f7054p = new C0444df("SENT_EXTERNAL_ATTRIBUTIONS", null);

    /* renamed from: q, reason: collision with root package name */
    public static final C0444df f7055q = new C0444df("AUTO_COLLECTED_DATA_SUBSCRIBERS", null);

    /* renamed from: s, reason: collision with root package name */
    public static final C0444df f7057s = new C0444df("MAIN_REPORTER_EVENTS_TRIGGER_CONDITION_MET", null);

    public C0392bf(Oa oa) {
        super(oa);
    }

    public final C0392bf a(C0558i0 c0558i0) {
        synchronized (this) {
            b(f7048j.f7153b, c0558i0.f7467a);
            b(f7049k.f7153b, c0558i0.f7468b);
        }
        return this;
    }

    public final void b(boolean z3) {
        b(f7057s.f7153b, z3);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0418cf
    public final Set<String> c() {
        return this.f7110a.a();
    }

    public final C0558i0 d() {
        C0558i0 c0558i0;
        synchronized (this) {
            c0558i0 = new C0558i0(this.f7110a.getString(f7048j.f7153b, "{}"), this.f7110a.getLong(f7049k.f7153b, 0L));
        }
        return c0558i0;
    }

    public final String e() {
        return this.f7110a.getString(f7051m.f7153b, "");
    }

    public final Map<String, Long> f() {
        HashMap hashMap = new HashMap();
        try {
            String string = this.f7110a.getString(f7055q.f7153b, null);
            if (!TextUtils.isEmpty(string)) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, Long.valueOf(jSONObject.getLong(next)));
                }
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    public final List<String> g() {
        String str = f7052n.f7153b;
        List list = Collections.EMPTY_LIST;
        String[] strArr = list == null ? null : (String[]) list.toArray(new String[list.size()]);
        String string = this.f7110a.getString(str, null);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                strArr = new String[jSONArray.length()];
                for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                    strArr[i3] = jSONArray.optString(i3);
                }
            } catch (Throwable unused) {
            }
        }
        if (strArr == null) {
            return null;
        }
        return Arrays.asList(strArr);
    }

    public final int h() {
        return this.f7110a.getInt(f7050l.f7153b, -1);
    }

    public final long i() {
        return this.f7110a.getLong(f7046h.f7153b, 0L);
    }

    public final String j() {
        return this.f7110a.getString(f7047i.f7153b, null);
    }

    public final Map<Integer, String> k() {
        HashMap hashMap = new HashMap();
        try {
            String string = this.f7110a.getString(f7054p.f7153b, null);
            if (string != null) {
                JSONObject jSONObject = new JSONObject(string);
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(Integer.valueOf(Integer.parseInt(next)), jSONObject.getString(next));
                }
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    public final void b(Map<Integer, String> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey().toString(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        b(f7054p.f7153b, jSONObject.toString());
    }

    public final String h(String str) {
        return this.f7110a.getString(new C0444df(f7056r, str).f7153b, "");
    }

    public final C0392bf i(String str) {
        return (C0392bf) b(f7051m.f7153b, str);
    }

    public final C0392bf j(String str) {
        return (C0392bf) b(f7047i.f7153b, str);
    }

    public final C0392bf e(String str, String str2) {
        return (C0392bf) b(new C0444df(f7056r, str).f7153b, str2);
    }

    public final C0392bf a(long j3) {
        return (C0392bf) b(f7046h.f7153b, j3);
    }

    @Override // io.appmetrica.analytics.impl.Fd
    public final String f(String str) {
        return new C0444df(str, null).f7153b;
    }

    public final C0392bf a(int i3) {
        return (C0392bf) b(f7050l.f7153b, i3);
    }

    public final C0392bf a(List<String> list) {
        return (C0392bf) a(f7052n.f7153b, list);
    }

    public final boolean a(boolean z3) {
        return this.f7110a.getBoolean(f7057s.f7153b, z3);
    }

    @Override // io.appmetrica.analytics.impl.Do
    public final String a() {
        return this.f7110a.getString(f7053o.f7153b, null);
    }

    @Override // io.appmetrica.analytics.impl.Do
    public final void a(String str) {
        b(f7053o.f7153b, str);
    }

    public final void a(Map<String, Long> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        b(f7055q.f7153b, jSONObject.toString());
    }
}
