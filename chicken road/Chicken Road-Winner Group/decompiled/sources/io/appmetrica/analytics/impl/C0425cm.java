package io.appmetrica.analytics.impl;

import android.text.TextUtils;
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
public final class C0425cm {

    /* renamed from: a, reason: collision with root package name */
    public final Ea f7120a;

    /* renamed from: b, reason: collision with root package name */
    public final C0439da f7121b;

    /* renamed from: c, reason: collision with root package name */
    public final Ki f7122c;

    /* renamed from: d, reason: collision with root package name */
    public final Fe f7123d;

    /* renamed from: e, reason: collision with root package name */
    public final Lm f7124e;
    public final C0716o3 f;

    /* renamed from: g, reason: collision with root package name */
    public final C0922w2 f7125g;

    /* renamed from: h, reason: collision with root package name */
    public final C0724ob f7126h;

    /* renamed from: i, reason: collision with root package name */
    public final Im f7127i;

    /* renamed from: j, reason: collision with root package name */
    public final C0984yd f7128j;

    /* renamed from: k, reason: collision with root package name */
    public final K9 f7129k;

    public C0425cm() {
        this(new C0724ob(), new Ea(), new C0439da(), new Ki(), new Fe(), new Lm(), new C0716o3(), new C0922w2(), new Im(), new C0984yd(), new K9());
    }

    public final void a(C0554hm c0554hm, C0672mb c0672mb) {
        long j3;
        long j4;
        String str;
        ArrayList a3;
        JSONObject optJSONObject;
        JSONObject optJSONObject2;
        JSONObject optJSONObject3;
        JSONObject optJSONObject4 = c0672mb.optJSONObject("queries");
        if (optJSONObject4 != null && (optJSONObject2 = optJSONObject4.optJSONObject("list")) != null && (optJSONObject3 = optJSONObject2.optJSONObject("host")) != null) {
            c0554hm.f7442g = optJSONObject3.optString("url", null);
        }
        Object jSONObject = new JSONObject();
        try {
            jSONObject = c0672mb.get("distribution_customization");
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
            c0554hm.f7445j = Jm.a((Map) hashMap);
        }
        JSONObject optJSONObject7 = c0672mb.optJSONObject(CommonUrlParts.LOCALE);
        String str2 = "";
        c0554hm.f7448m = (optJSONObject7 == null || (optJSONObject = optJSONObject7.optJSONObject("country")) == null || !optJSONObject.optBoolean("reliable", false)) ? "" : optJSONObject.optString("value", "");
        JSONObject optJSONObject8 = c0672mb.optJSONObject("time");
        if (optJSONObject8 != null) {
            try {
                c0554hm.f7447l = Long.valueOf(optJSONObject8.getLong("max_valid_difference_seconds"));
            } catch (Throwable unused2) {
            }
        }
        C1018zm c1018zm = new C1018zm();
        JSONObject optJSONObject9 = c0672mb.optJSONObject("stat_sending");
        if (optJSONObject9 != null) {
            c1018zm.f8713a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject9, "disabled_reporting_interval_seconds", c1018zm.f8713a);
        }
        this.f7124e.getClass();
        c0554hm.f7451p = new Km(c1018zm.f8713a);
        this.f7121b.getClass();
        C0916vm c0916vm = new C0916vm();
        try {
            Object jSONObject2 = new JSONObject();
            try {
                jSONObject2 = c0672mb.get("features");
            } catch (Throwable unused3) {
            }
            JSONObject optJSONObject10 = ((JSONObject) jSONObject2).optJSONObject("list");
            if (optJSONObject10 != null) {
                C0769q4 c0769q4 = new C0769q4();
                c0769q4.f8111a = C0439da.a(optJSONObject10, "permissions_collecting", c0916vm.f8528a);
                c0769q4.f8112b = C0439da.a(optJSONObject10, "features_collecting", c0916vm.f8529b);
                c0769q4.f8113c = C0439da.a(optJSONObject10, "google_aid", c0916vm.f8530c);
                c0769q4.f8114d = C0439da.a(optJSONObject10, "sim_info", c0916vm.f8531d);
                c0769q4.f8115e = C0439da.a(optJSONObject10, "huawei_oaid", c0916vm.f8532e);
                c0769q4.f = optJSONObject10.has("ssl_pinning") ? Boolean.valueOf(optJSONObject10.getJSONObject("ssl_pinning").getBoolean("enabled")) : null;
                c0554hm.f7438b = new C0820s4(c0769q4);
            }
        } catch (Throwable unused4) {
        }
        this.f7120a.getClass();
        try {
            Object jSONObject3 = new JSONObject();
            try {
                jSONObject3 = c0672mb.get("query_hosts");
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
                    c0554hm.f7440d = str;
                }
                ArrayList a4 = Ea.a(optJSONObject11, "report");
                if (!AbstractC0711no.a((Collection) a4)) {
                    c0554hm.f7441e = a4;
                }
                try {
                    str2 = optJSONObject11.getJSONObject("report_ad").getJSONArray("urls").getString(0);
                } catch (Throwable unused7) {
                }
                if (!TextUtils.isEmpty(str2)) {
                    c0554hm.f = str2;
                }
                ArrayList a5 = Ea.a(optJSONObject11, "startup");
                if (!AbstractC0711no.a((Collection) a5)) {
                    c0554hm.f7439c = a5;
                }
                ArrayList a6 = Ea.a(optJSONObject11, "diagnostic");
                if (!AbstractC0711no.a((Collection) a6)) {
                    c0554hm.f7449n = a6;
                }
                HashMap hashMap2 = new HashMap();
                Iterator<String> keys2 = optJSONObject11.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    if (!Ea.f5906a.contains(next2) && (a3 = Ea.a(optJSONObject11, next2)) != null) {
                        hashMap2.put(next2, a3);
                    }
                }
                c0554hm.f7450o = hashMap2;
            }
        } catch (Throwable unused8) {
        }
        this.f7122c.getClass();
        Am am = new Am();
        JSONObject optJSONObject12 = c0672mb.optJSONObject("retry_policy");
        int i3 = am.f5737w;
        int i4 = am.f5738x;
        if (optJSONObject12 != null) {
            i3 = optJSONObject12.optInt("max_interval_seconds", i3);
            i4 = optJSONObject12.optInt("exponential_multiplier", am.f5738x);
        }
        c0554hm.f7452q = new RetryPolicyConfig(i3, i4);
        this.f7123d.getClass();
        if (c0554hm.f7438b.f8282a) {
            JSONObject optJSONObject13 = c0672mb.optJSONObject("permissions_collecting");
            C0968xm c0968xm = new C0968xm();
            if (optJSONObject13 != null) {
                j3 = optJSONObject13.optLong("check_interval_seconds", c0968xm.f8622a);
                j4 = optJSONObject13.optLong("force_send_interval_seconds", c0968xm.f8623b);
            } else {
                j3 = c0968xm.f8622a;
                j4 = c0968xm.f8623b;
            }
            c0554hm.f7446k = new De(j3, j4);
        }
        C0716o3 c0716o3 = this.f;
        c0716o3.getClass();
        C0838sm c0838sm = new C0838sm();
        JSONObject optJSONObject14 = c0672mb.optJSONObject("cache_control");
        if (optJSONObject14 != null) {
            c0838sm.f8319a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject14, "last_known_location_ttl", c0838sm.f8319a);
        }
        c0716o3.f7976a.getClass();
        c0554hm.f7453r = new C0638l3(c0838sm.f8319a);
        this.f7125g.getClass();
        C0922w2.a(c0554hm, c0672mb);
        Im im = this.f7127i;
        im.getClass();
        JSONObject optJSONObject15 = c0672mb.optJSONObject("startup_update");
        C0993ym c0993ym = new C0993ym();
        Integer a7 = AbstractC0698nb.a(optJSONObject15, "interval_seconds", null);
        if (a7 != null) {
            c0993ym.f8645a = a7.intValue();
        }
        im.f6125a.getClass();
        c0554hm.f7455t = new Gm(c0993ym.f8645a);
        Map<String, C0493fd> c3 = this.f7128j.f8638a.c();
        C0959xd c0959xd = new C0959xd(c0672mb);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, C0493fd> entry : c3.entrySet()) {
            Object invoke = c0959xd.invoke(entry);
            if (invoke != null) {
                linkedHashMap.put(entry.getKey(), invoke);
            }
        }
        c0554hm.f7456u = linkedHashMap;
        J9 j9 = this.f7129k.f6179a;
        C0890um c0890um = new C0890um();
        JSONObject optJSONObject16 = c0672mb.optJSONObject("external_attribution");
        if (optJSONObject16 != null) {
            c0890um.f8466a = RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject16, "collecting_interval_seconds", c0890um.f8466a);
        }
        j9.getClass();
        c0554hm.f7457v = new I9(c0890um.f8466a);
    }

    public C0425cm(C0724ob c0724ob, Ea ea, C0439da c0439da, Ki ki, Fe fe, Lm lm, C0716o3 c0716o3, C0922w2 c0922w2, Im im, C0984yd c0984yd, K9 k9) {
        this.f7120a = ea;
        this.f7121b = c0439da;
        this.f7122c = ki;
        this.f7123d = fe;
        this.f7124e = lm;
        this.f = c0716o3;
        this.f7125g = c0922w2;
        this.f7126h = c0724ob;
        this.f7127i = im;
        this.f7128j = c0984yd;
        this.f7129k = k9;
    }
}
