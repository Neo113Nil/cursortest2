package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Yl {

    /* renamed from: a, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0819xa f5355a;

    /* renamed from: b, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.W9 f5356b;

    /* renamed from: c, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Fi f5357c;

    /* renamed from: d, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0875ze f5358d;

    /* renamed from: e, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Hm f5359e;

    /* renamed from: f, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0372g3 f5360f;

    /* renamed from: g, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0578o2 f5361g;

    /* renamed from: h, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0406hb f5362h;

    /* renamed from: i, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.Em f5363i;

    /* renamed from: j, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.C0666rd f5364j;

    /* renamed from: k, reason: collision with root package name */
    public final io.appmetrica.analytics.impl.D9 f5365k;

    public Yl() {
        this(new io.appmetrica.analytics.impl.C0406hb(), new io.appmetrica.analytics.impl.C0819xa(), new io.appmetrica.analytics.impl.W9(), new io.appmetrica.analytics.impl.Fi(), new io.appmetrica.analytics.impl.C0875ze(), new io.appmetrica.analytics.impl.Hm(), new io.appmetrica.analytics.impl.C0372g3(), new io.appmetrica.analytics.impl.C0578o2(), new io.appmetrica.analytics.impl.Em(), new io.appmetrica.analytics.impl.C0666rd(), new io.appmetrica.analytics.impl.D9());
    }

    public final void a(io.appmetrica.analytics.impl.C0314dm c0314dm, io.appmetrica.analytics.impl.C0354fb c0354fb) {
        long j2;
        long j3;
        java.lang.String str;
        java.util.ArrayList a2;
        org.json.JSONObject optJSONObject;
        org.json.JSONObject optJSONObject2;
        org.json.JSONObject optJSONObject3;
        org.json.JSONObject optJSONObject4 = c0354fb.optJSONObject("queries");
        if (optJSONObject4 != null && (optJSONObject2 = optJSONObject4.optJSONObject("list")) != null && (optJSONObject3 = optJSONObject2.optJSONObject("host")) != null) {
            c0314dm.f5739g = optJSONObject3.optString("url", null);
        }
        java.lang.Object jSONObject = new org.json.JSONObject();
        try {
            jSONObject = c0354fb.get("distribution_customization");
        } catch (java.lang.Throwable unused) {
        }
        org.json.JSONObject optJSONObject5 = ((org.json.JSONObject) jSONObject).optJSONObject("clids");
        if (optJSONObject5 != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            java.util.Iterator<java.lang.String> keys = optJSONObject5.keys();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                org.json.JSONObject optJSONObject6 = optJSONObject5.optJSONObject(next);
                if (optJSONObject6 != null && optJSONObject6.has("value")) {
                    hashMap.put(next, optJSONObject6.getString("value"));
                }
            }
            c0314dm.f5742j = io.appmetrica.analytics.impl.Fm.a((java.util.Map) hashMap);
        }
        org.json.JSONObject optJSONObject7 = c0354fb.optJSONObject(io.appmetrica.analytics.networktasks.internal.CommonUrlParts.LOCALE);
        java.lang.String str2 = "";
        c0314dm.f5745m = (optJSONObject7 == null || (optJSONObject = optJSONObject7.optJSONObject("country")) == null || !optJSONObject.optBoolean("reliable", false)) ? "" : optJSONObject.optString("value", "");
        org.json.JSONObject optJSONObject8 = c0354fb.optJSONObject("time");
        if (optJSONObject8 != null) {
            try {
                c0314dm.f5744l = java.lang.Long.valueOf(optJSONObject8.getLong("max_valid_difference_seconds"));
            } catch (java.lang.Throwable unused2) {
            }
        }
        io.appmetrica.analytics.impl.C0779vm c0779vm = new io.appmetrica.analytics.impl.C0779vm();
        org.json.JSONObject optJSONObject9 = c0354fb.optJSONObject("stat_sending");
        if (optJSONObject9 != null) {
            c0779vm.f6985a = io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject9, "disabled_reporting_interval_seconds", c0779vm.f6985a);
        }
        this.f5359e.getClass();
        c0314dm.f5748p = new io.appmetrica.analytics.impl.Gm(c0779vm.f6985a);
        this.f5356b.getClass();
        io.appmetrica.analytics.impl.C0675rm c0675rm = new io.appmetrica.analytics.impl.C0675rm();
        try {
            java.lang.Object jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2 = c0354fb.get("features");
            } catch (java.lang.Throwable unused3) {
            }
            org.json.JSONObject optJSONObject10 = ((org.json.JSONObject) jSONObject2).optJSONObject("list");
            if (optJSONObject10 != null) {
                io.appmetrica.analytics.impl.C0450j4 c0450j4 = new io.appmetrica.analytics.impl.C0450j4();
                c0450j4.f6153a = io.appmetrica.analytics.impl.W9.a(optJSONObject10, "permissions_collecting", c0675rm.f6757a);
                c0450j4.f6154b = io.appmetrica.analytics.impl.W9.a(optJSONObject10, "features_collecting", c0675rm.f6758b);
                c0450j4.f6155c = io.appmetrica.analytics.impl.W9.a(optJSONObject10, "google_aid", c0675rm.f6759c);
                c0450j4.f6156d = io.appmetrica.analytics.impl.W9.a(optJSONObject10, "sim_info", c0675rm.f6760d);
                c0450j4.f6157e = io.appmetrica.analytics.impl.W9.a(optJSONObject10, "huawei_oaid", c0675rm.f6761e);
                c0450j4.f6158f = optJSONObject10.has("ssl_pinning") ? java.lang.Boolean.valueOf(optJSONObject10.getJSONObject("ssl_pinning").getBoolean("enabled")) : null;
                c0314dm.f5734b = new io.appmetrica.analytics.impl.C0502l4(c0450j4);
            }
        } catch (java.lang.Throwable unused4) {
        }
        this.f5355a.getClass();
        try {
            java.lang.Object jSONObject3 = new org.json.JSONObject();
            try {
                jSONObject3 = c0354fb.get("query_hosts");
            } catch (java.lang.Throwable unused5) {
            }
            org.json.JSONObject optJSONObject11 = ((org.json.JSONObject) jSONObject3).optJSONObject("list");
            if (optJSONObject11 != null) {
                try {
                    str = optJSONObject11.getJSONObject("get_ad").getJSONArray("urls").getString(0);
                } catch (java.lang.Throwable unused6) {
                    str = "";
                }
                if (!android.text.TextUtils.isEmpty(str)) {
                    c0314dm.f5736d = str;
                }
                java.util.ArrayList a3 = io.appmetrica.analytics.impl.C0819xa.a(optJSONObject11, "report");
                if (!io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Collection) a3)) {
                    c0314dm.f5737e = a3;
                }
                try {
                    str2 = optJSONObject11.getJSONObject("report_ad").getJSONArray("urls").getString(0);
                } catch (java.lang.Throwable unused7) {
                }
                if (!android.text.TextUtils.isEmpty(str2)) {
                    c0314dm.f5738f = str2;
                }
                java.util.ArrayList a4 = io.appmetrica.analytics.impl.C0819xa.a(optJSONObject11, "startup");
                if (!io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Collection) a4)) {
                    c0314dm.f5735c = a4;
                }
                java.util.ArrayList a5 = io.appmetrica.analytics.impl.C0819xa.a(optJSONObject11, "diagnostic");
                if (!io.appmetrica.analytics.impl.AbstractC0522lo.a((java.util.Collection) a5)) {
                    c0314dm.f5746n = a5;
                }
                java.util.HashMap hashMap2 = new java.util.HashMap();
                java.util.Iterator<java.lang.String> keys2 = optJSONObject11.keys();
                while (keys2.hasNext()) {
                    java.lang.String next2 = keys2.next();
                    if (!io.appmetrica.analytics.impl.C0819xa.f7105a.contains(next2) && (a2 = io.appmetrica.analytics.impl.C0819xa.a(optJSONObject11, next2)) != null) {
                        hashMap2.put(next2, a2);
                    }
                }
                c0314dm.f5747o = hashMap2;
            }
        } catch (java.lang.Throwable unused8) {
        }
        this.f5357c.getClass();
        io.appmetrica.analytics.impl.C0805wm c0805wm = new io.appmetrica.analytics.impl.C0805wm();
        org.json.JSONObject optJSONObject12 = c0354fb.optJSONObject("retry_policy");
        int i2 = c0805wm.f7060w;
        int i3 = c0805wm.f7061x;
        if (optJSONObject12 != null) {
            i2 = optJSONObject12.optInt("max_interval_seconds", i2);
            i3 = optJSONObject12.optInt("exponential_multiplier", c0805wm.f7061x);
        }
        c0314dm.f5749q = new io.appmetrica.analytics.networktasks.internal.RetryPolicyConfig(i2, i3);
        this.f5358d.getClass();
        if (c0314dm.f5734b.f6323a) {
            org.json.JSONObject optJSONObject13 = c0354fb.optJSONObject("permissions_collecting");
            io.appmetrica.analytics.impl.C0727tm c0727tm = new io.appmetrica.analytics.impl.C0727tm();
            if (optJSONObject13 != null) {
                j2 = optJSONObject13.optLong("check_interval_seconds", c0727tm.f6865a);
                j3 = optJSONObject13.optLong("force_send_interval_seconds", c0727tm.f6866b);
            } else {
                j2 = c0727tm.f6865a;
                j3 = c0727tm.f6866b;
            }
            c0314dm.f5743k = new io.appmetrica.analytics.impl.C0823xe(j2, j3);
        }
        io.appmetrica.analytics.impl.C0372g3 c0372g3 = this.f5360f;
        c0372g3.getClass();
        io.appmetrica.analytics.impl.C0598om c0598om = new io.appmetrica.analytics.impl.C0598om();
        org.json.JSONObject optJSONObject14 = c0354fb.optJSONObject("cache_control");
        if (optJSONObject14 != null) {
            c0598om.f6604a = io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject14, "last_known_location_ttl", c0598om.f6604a);
        }
        c0372g3.f5959a.getClass();
        c0314dm.f5750r = new io.appmetrica.analytics.impl.C0295d3(c0598om.f6604a);
        this.f5361g.getClass();
        io.appmetrica.analytics.impl.C0578o2.a(c0314dm, c0354fb);
        io.appmetrica.analytics.impl.Em em = this.f5363i;
        em.getClass();
        org.json.JSONObject optJSONObject15 = c0354fb.optJSONObject("startup_update");
        io.appmetrica.analytics.impl.C0753um c0753um = new io.appmetrica.analytics.impl.C0753um();
        java.lang.Integer a6 = io.appmetrica.analytics.impl.AbstractC0380gb.a(optJSONObject15, "interval_seconds", null);
        if (a6 != null) {
            c0753um.f6934a = a6.intValue();
        }
        em.f4274a.getClass();
        c0314dm.t = new io.appmetrica.analytics.impl.Cm(c0753um.f6934a);
        java.util.Map<java.lang.String, io.appmetrica.analytics.impl.Yc> c2 = this.f5364j.f6728a.c();
        io.appmetrica.analytics.impl.C0641qd c0641qd = new io.appmetrica.analytics.impl.C0641qd(c0354fb);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        for (java.util.Map.Entry<java.lang.String, io.appmetrica.analytics.impl.Yc> entry : c2.entrySet()) {
            java.lang.Object invoke = c0641qd.invoke(entry);
            if (invoke != null) {
                linkedHashMap.put(entry.getKey(), invoke);
            }
        }
        c0314dm.f5752u = linkedHashMap;
        io.appmetrica.analytics.impl.C9 c9 = this.f5365k.f4204a;
        io.appmetrica.analytics.impl.C0650qm c0650qm = new io.appmetrica.analytics.impl.C0650qm();
        org.json.JSONObject optJSONObject16 = c0354fb.optJSONObject("external_attribution");
        if (optJSONObject16 != null) {
            c0650qm.f6700a = io.appmetrica.analytics.coreutils.internal.parsing.RemoteConfigJsonUtils.extractMillisFromSecondsOrDefault(optJSONObject16, "collecting_interval_seconds", c0650qm.f6700a);
        }
        c9.getClass();
        c0314dm.f5753v = new io.appmetrica.analytics.impl.B9(c0650qm.f6700a);
    }

    public Yl(io.appmetrica.analytics.impl.C0406hb c0406hb, io.appmetrica.analytics.impl.C0819xa c0819xa, io.appmetrica.analytics.impl.W9 w9, io.appmetrica.analytics.impl.Fi fi, io.appmetrica.analytics.impl.C0875ze c0875ze, io.appmetrica.analytics.impl.Hm hm, io.appmetrica.analytics.impl.C0372g3 c0372g3, io.appmetrica.analytics.impl.C0578o2 c0578o2, io.appmetrica.analytics.impl.Em em, io.appmetrica.analytics.impl.C0666rd c0666rd, io.appmetrica.analytics.impl.D9 d9) {
        this.f5355a = c0819xa;
        this.f5356b = w9;
        this.f5357c = fi;
        this.f5358d = c0875ze;
        this.f5359e = hm;
        this.f5360f = c0372g3;
        this.f5361g = c0578o2;
        this.f5362h = c0406hb;
        this.f5363i = em;
        this.f5364j = c0666rd;
        this.f5365k = d9;
    }
}
