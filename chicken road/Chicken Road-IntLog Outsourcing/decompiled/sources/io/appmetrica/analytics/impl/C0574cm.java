package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import com.onesignal.session.internal.influence.impl.InfluenceConstants;
import io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.cm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0574cm {

    /* renamed from: a, reason: collision with root package name */
    public final Ea f8008a;

    /* renamed from: b, reason: collision with root package name */
    public final C0588da f8009b;

    /* renamed from: c, reason: collision with root package name */
    public final Ki f8010c;

    /* renamed from: d, reason: collision with root package name */
    public final Fe f8011d;

    /* renamed from: e, reason: collision with root package name */
    public final Lm f8012e;

    /* renamed from: f, reason: collision with root package name */
    public final C0865o3 f8013f;

    /* renamed from: g, reason: collision with root package name */
    public final C1071w2 f8014g;

    /* renamed from: h, reason: collision with root package name */
    public final C0873ob f8015h;

    /* renamed from: i, reason: collision with root package name */
    public final Im f8016i;

    /* renamed from: j, reason: collision with root package name */
    public final C1133yd f8017j;

    /* renamed from: k, reason: collision with root package name */
    public final K9 f8018k;

    public C0574cm() {
        this(new C0873ob(), new Ea(), new C0588da(), new Ki(), new Fe(), new Lm(), new C0865o3(), new C1071w2(), new Im(), new C1133yd(), new K9());
    }

    public final void a(C0703hm c0703hm, C0821mb c0821mb) {
        long j2;
        long j6;
        String str;
        ArrayList a6;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4 = c0821mb.optJSONObject("queries");
        if (optJSONObject4 != null && (optJSONObject2 = optJSONObject4.optJSONObject("list")) != null && (optJSONObject3 = optJSONObject2.optJSONObject("host")) != null) {
            c0703hm.f8347g = optJSONObject3.optString("url", null);
        }
        Object jSONObject = new JSONObject();
        try {
            jSONObject = c0821mb.get("distribution_customization");
        } catch (Throwable unused) {
        }
        JSONObject optJSONObject5 = ((JSONObject) jSONObject).optJSONObject("clids");
        if (optJSONObject5 != null) {
            HashMap hashMap = new HashMap();
            Iterator<String> keys = optJSONObject5.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                JSONObject optJSONObject6 = optJSONObject5.optJSONObject(next);
                if (optJSONObject6 != null && optJSONObject6.has("value")) {
                    hashMap.put(next, optJSONObject6.getString("value"));
                }
            }
            c0703hm.f8350j = Jm.a((Map) hashMap);
        }
        JSONObject optJSONObject7 = c0821mb.optJSONObject(CommonUrlParts.LOCALE);
        String str2 = "";
        c0703hm.f8353m = (optJSONObject7 == null || (optJSONObject = optJSONObject7.optJSONObject("country")) == null || !optJSONObject.optBoolean("reliable", false)) ? "" : optJSONObject.optString("value", "");
        JSONObject optJSONObject8 = c0821mb.optJSONObject(InfluenceConstants.TIME);
        if (optJSONObject8 != null) {
            try {
                c0703hm.f8352l = Long.valueOf(optJSONObject8.getLong("max_valid_difference_seconds"));
            } catch (Throwable unused2) {
            }
        }
        C1167zm c1167zm = new C1167zm();
        JSONObject optJSONObject9 = c0821mb.optJSONObject("stat_sending");
        if (optJSONObject9 != null) {
            c1167zm.f9676a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject9, "disabled_reporting_interval_seconds", c1167zm.f9676a);
        }
        this.f8012e.getClass();
        c0703hm.f8356p = new Km(c1167zm.f9676a);
        this.f8009b.getClass();
        C1065vm c1065vm = new C1065vm();
        try {
            Object jSONObject2 = new JSONObject();
            try {
                jSONObject2 = c0821mb.get("features");
            } catch (Throwable unused3) {
            }
            JSONObject optJSONObject10 = ((JSONObject) jSONObject2).optJSONObject("list");
            if (optJSONObject10 != null) {
                C0918q4 c0918q4 = new C0918q4();
                c0918q4.f9049a = C0588da.a(optJSONObject10, "permissions_collecting", c1065vm.f9483a);
                c0918q4.f9050b = C0588da.a(optJSONObject10, "features_collecting", c1065vm.f9484b);
                c0918q4.f9051c = C0588da.a(optJSONObject10, "google_aid", c1065vm.f9485c);
                c0918q4.f9052d = C0588da.a(optJSONObject10, "sim_info", c1065vm.f9486d);
                c0918q4.f9053e = C0588da.a(optJSONObject10, "huawei_oaid", c1065vm.f9487e);
                c0918q4.f9054f = optJSONObject10.has("ssl_pinning") ? Boolean.valueOf(optJSONObject10.getJSONObject("ssl_pinning").getBoolean("enabled")) : null;
                c0703hm.f8342b = new C0969s4(c0918q4);
            }
        } catch (Throwable unused4) {
        }
        this.f8008a.getClass();
        try {
            Object jSONObject3 = new JSONObject();
            try {
                jSONObject3 = c0821mb.get("query_hosts");
            } catch (Throwable unused5) {
            }
            JSONObject optJSONObject11 = ((JSONObject) jSONObject3).optJSONObject("list");
            if (optJSONObject11 != null) {
                try {
                    str = optJSONObject11.getJSONObject("get_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused6) {
                    str = "";
                }
                if (!TextUtils.isEmpty(str)) {
                    c0703hm.f8344d = str;
                }
                ArrayList a7 = Ea.a(optJSONObject11, "report");
                if (!AbstractC0860no.a((Collection) a7)) {
                    c0703hm.f8345e = a7;
                }
                try {
                    str2 = optJSONObject11.getJSONObject("report_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused7) {
                }
                if (!TextUtils.isEmpty(str2)) {
                    c0703hm.f8346f = str2;
                }
                ArrayList a8 = Ea.a(optJSONObject11, "startup");
                if (!AbstractC0860no.a((Collection) a8)) {
                    c0703hm.f8343c = a8;
                }
                ArrayList a9 = Ea.a(optJSONObject11, "diagnostic");
                if (!AbstractC0860no.a((Collection) a9)) {
                    c0703hm.f8354n = a9;
                }
                HashMap hashMap2 = new HashMap();
                Iterator<String> keys2 = optJSONObject11.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    if (!Ea.f6747a.contains(next2) && (a6 = Ea.a(optJSONObject11, next2)) != null) {
                        hashMap2.put(next2, a6);
                    }
                }
                c0703hm.f8355o = hashMap2;
            }
        } catch (Throwable unused8) {
        }
        this.f8010c.getClass();
        Am am = new Am();
        JSONObject optJSONObject12 = c0821mb.optJSONObject("retry_policy");
        int i2 = am.f6569w;
        int i3 = am.f6570x;
        if (optJSONObject12 != null) {
            i2 = optJSONObject12.optInt("max_interval_seconds", i2);
            i3 = optJSONObject12.optInt("exponential_multiplier", am.f6570x);
        }
        c0703hm.f8357q = new RetryPolicyConfig(i2, i3);
        this.f8011d.getClass();
        if (c0703hm.f8342b.f9228a) {
            JSONObject optJSONObject13 = c0821mb.optJSONObject("permissions_collecting");
            C1117xm c1117xm = new C1117xm();
            if (optJSONObject13 != null) {
                j2 = optJSONObject13.optLong("check_interval_seconds", c1117xm.f9581a);
                j6 = optJSONObject13.optLong("force_send_interval_seconds", c1117xm.f9582b);
            } else {
                j2 = c1117xm.f9581a;
                j6 = c1117xm.f9582b;
            }
            c0703hm.f8351k = new De(j2, j6);
        }
        C0865o3 c0865o3 = this.f8013f;
        c0865o3.getClass();
        C0987sm c0987sm = new C0987sm();
        JSONObject optJSONObject14 = c0821mb.optJSONObject("cache_control");
        if (optJSONObject14 != null) {
            c0987sm.f9267a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject14, "last_known_location_ttl", c0987sm.f9267a);
        }
        c0865o3.f8907a.getClass();
        c0703hm.f8358r = new C0787l3(c0987sm.f9267a);
        this.f8014g.getClass();
        C1071w2.a(c0703hm, c0821mb);
        Im im = this.f8016i;
        im.getClass();
        JSONObject optJSONObject15 = c0821mb.optJSONObject("startup_update");
        C1142ym c1142ym = new C1142ym();
        Integer a10 = AbstractC0847nb.a(optJSONObject15, "interval_seconds", null);
        if (a10 != null) {
            c1142ym.f9604a = a10.intValue();
        }
        im.f6976a.getClass();
        c0703hm.f8360t = new Gm(c1142ym.f9604a);
        Map<String, C0642fd> c2 = this.f8017j.f9597a.c();
        C1108xd c1108xd = new C1108xd(c0821mb);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C0642fd> entry : c2.entrySet()) {
            Object invoke = c1108xd.invoke(entry);
            if (invoke != null) {
                linkedHashMap.put(entry.getKey(), invoke);
            }
        }
        c0703hm.f8361u = linkedHashMap;
        J9 j9 = this.f8018k.f7032a;
        C1039um c1039um = new C1039um();
        JSONObject optJSONObject16 = c0821mb.optJSONObject("external_attribution");
        if (optJSONObject16 != null) {
            c1039um.f9419a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject16, "collecting_interval_seconds", c1039um.f9419a);
        }
        j9.getClass();
        c0703hm.f8362v = new I9(c1039um.f9419a);
    }

    public C0574cm(C0873ob c0873ob, Ea ea, C0588da c0588da, Ki ki, Fe fe, Lm lm, C0865o3 c0865o3, C1071w2 c1071w2, Im im, C1133yd c1133yd, K9 k9) {
        this.f8008a = ea;
        this.f8009b = c0588da;
        this.f8010c = ki;
        this.f8011d = fe;
        this.f8012e = lm;
        this.f8013f = c0865o3;
        this.f8014g = c1071w2;
        this.f8015h = c0873ob;
        this.f8016i = im;
        this.f8017j = c1133yd;
        this.f8018k = k9;
    }
}
