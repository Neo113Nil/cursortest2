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
public final class C0541bf extends Fd implements Do {

    /* renamed from: d, reason: collision with root package name */
    public static final long f7928d = 0;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7929e = -1;

    /* renamed from: f, reason: collision with root package name */
    public static final String f7930f = "";

    /* renamed from: g, reason: collision with root package name */
    public static final String f7931g = "";

    /* renamed from: r, reason: collision with root package name */
    public static final String f7942r = "SESSION_";

    /* renamed from: h, reason: collision with root package name */
    public static final C0593df f7932h = new C0593df("PERMISSIONS_CHECK_TIME", null);

    /* renamed from: i, reason: collision with root package name */
    public static final C0593df f7933i = new C0593df("PROFILE_ID", null);

    /* renamed from: j, reason: collision with root package name */
    public static final C0593df f7934j = new C0593df("APP_ENVIRONMENT", null);

    /* renamed from: k, reason: collision with root package name */
    public static final C0593df f7935k = new C0593df("APP_ENVIRONMENT_REVISION", null);

    /* renamed from: l, reason: collision with root package name */
    public static final C0593df f7936l = new C0593df("LAST_APP_VERSION_WITH_FEATURES", null);

    /* renamed from: m, reason: collision with root package name */
    public static final C0593df f7937m = new C0593df("APPLICATION_FEATURES", null);

    /* renamed from: n, reason: collision with root package name */
    public static final C0593df f7938n = new C0593df("CERTIFICATES_SHA1_FINGERPRINTS", null);

    /* renamed from: o, reason: collision with root package name */
    public static final C0593df f7939o = new C0593df("VITAL_DATA", null);

    /* renamed from: p, reason: collision with root package name */
    public static final C0593df f7940p = new C0593df("SENT_EXTERNAL_ATTRIBUTIONS", null);

    /* renamed from: q, reason: collision with root package name */
    public static final C0593df f7941q = new C0593df("AUTO_COLLECTED_DATA_SUBSCRIBERS", null);

    /* renamed from: s, reason: collision with root package name */
    public static final C0593df f7943s = new C0593df("MAIN_REPORTER_EVENTS_TRIGGER_CONDITION_MET", null);

    public C0541bf(Oa oa) {
        super(oa);
    }

    public final C0541bf a(C0707i0 c0707i0) {
        synchronized (this) {
            b(f7934j.f8043b, c0707i0.f8373a);
            b(f7935k.f8043b, c0707i0.f8374b);
        }
        return this;
    }

    public final void b(boolean z) {
        b(f7943s.f8043b, z);
    }

    @Override // io.appmetrica.analytics.impl.AbstractC0567cf
    public final Set<String> c() {
        return this.f7998a.a();
    }

    public final C0707i0 d() {
        C0707i0 c0707i0;
        synchronized (this) {
            c0707i0 = new C0707i0(this.f7998a.getString(f7934j.f8043b, "{}"), this.f7998a.getLong(f7935k.f8043b, 0L));
        }
        return c0707i0;
    }

    public final String e() {
        return this.f7998a.getString(f7937m.f8043b, "");
    }

    public final Map<String, Long> f() {
        HashMap hashMap = new HashMap();
        try {
            String string = this.f7998a.getString(f7941q.f8043b, null);
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
        String str = f7938n.f8043b;
        List emptyList = Collections.emptyList();
        String[] strArr = emptyList == null ? null : (String[]) emptyList.toArray(new String[emptyList.size()]);
        String string = this.f7998a.getString(str, null);
        if (!TextUtils.isEmpty(string)) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                strArr = new String[jSONArray.length()];
                for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                    strArr[i2] = jSONArray.optString(i2);
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
        return this.f7998a.getInt(f7936l.f8043b, -1);
    }

    public final long i() {
        return this.f7998a.getLong(f7932h.f8043b, 0L);
    }

    public final String j() {
        return this.f7998a.getString(f7933i.f8043b, null);
    }

    public final Map<Integer, String> k() {
        HashMap hashMap = new HashMap();
        try {
            String string = this.f7998a.getString(f7940p.f8043b, null);
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
        b(f7940p.f8043b, jSONObject.toString());
    }

    public final String h(String str) {
        return this.f7998a.getString(new C0593df(f7942r, str).f8043b, "");
    }

    public final C0541bf i(String str) {
        return (C0541bf) b(f7937m.f8043b, str);
    }

    public final C0541bf j(String str) {
        return (C0541bf) b(f7933i.f8043b, str);
    }

    public final C0541bf e(String str, String str2) {
        return (C0541bf) b(new C0593df(f7942r, str).f8043b, str2);
    }

    public final C0541bf a(long j2) {
        return (C0541bf) b(f7932h.f8043b, j2);
    }

    @Override // io.appmetrica.analytics.impl.Fd
    public final String f(String str) {
        return new C0593df(str, null).f8043b;
    }

    public final C0541bf a(int i2) {
        return (C0541bf) b(f7936l.f8043b, i2);
    }

    public final C0541bf a(List<String> list) {
        return (C0541bf) a(f7938n.f8043b, list);
    }

    public final boolean a(boolean z) {
        return this.f7998a.getBoolean(f7943s.f8043b, z);
    }

    @Override // io.appmetrica.analytics.impl.Do
    public final String a() {
        return this.f7998a.getString(f7939o.f8043b, null);
    }

    @Override // io.appmetrica.analytics.impl.Do
    public final void a(String str) {
        b(f7939o.f8043b, str);
    }

    public final void a(Map<String, Long> map) {
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry<String, Long> entry : map.entrySet()) {
            try {
                jSONObject.put(entry.getKey(), entry.getValue());
            } catch (Throwable unused) {
            }
        }
        b(f7941q.f8043b, jSONObject.toString());
    }
}
