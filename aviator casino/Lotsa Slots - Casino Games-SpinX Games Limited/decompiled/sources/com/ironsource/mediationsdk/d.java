package com.ironsource.mediationsdk;

/* loaded from: classes5.dex */
public class d {
    public static final boolean A = false;
    private static com.ironsource.mediationsdk.d B = new com.ironsource.mediationsdk.d();
    public static final java.lang.String c = "auctionId";
    public static final java.lang.String d = "armData";
    public static final java.lang.String e = "larmData";
    public static final java.lang.String f = "isAdUnitCapped";
    public static final java.lang.String g = "settings";
    public static final java.lang.String h = "waterfall";
    public static final java.lang.String i = "genericParams";
    public static final java.lang.String j = "configurations";
    public static final java.lang.String k = "instances";
    public static final java.lang.String l = "${AUCTION_LOSS}";
    public static final java.lang.String m = "${AUCTION_MBR}";
    public static final java.lang.String n = "${AUCTION_PRICE}";
    public static final java.lang.String o = "${DYNAMIC_DEMAND_SOURCE}";
    public static final java.lang.String p = "${INSTANCE}";
    public static final java.lang.String q = "${INSTANCE_TYPE}";
    public static final java.lang.String r = "${PLACEMENT_NAME}";
    private static final java.lang.String s = "adMarkup";
    private static final java.lang.String t = "dynamicDemandSource";
    private static final java.lang.String u = "params";
    public static final java.lang.String v = "dlpl";
    public static final java.lang.String w = "adUnit";
    public static final java.lang.String x = "parallelLoad";
    public static final java.lang.String y = "bidderExclusive";
    public static final java.lang.String z = "showPriorityEnabled";

    /* renamed from: a, reason: collision with root package name */
    private final java.util.concurrent.atomic.AtomicBoolean f6407a = new java.util.concurrent.atomic.AtomicBoolean(false);
    private final com.ironsource.InterfaceC3362x7 b = com.ironsource.Jb.Y().a();

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private java.lang.String f6408a;
        private java.util.List<com.ironsource.C3232q2> b;
        private com.ironsource.C3232q2 c;
        private org.json.JSONObject d;
        private org.json.JSONObject e;
        private int f;
        private java.lang.String g;
        private com.ironsource.X1 h;

        public a(java.lang.String str) {
            this.f6408a = str;
        }

        public java.lang.String a() {
            return this.f6408a;
        }

        public org.json.JSONObject b() {
            return this.e;
        }

        public int c() {
            return this.f;
        }

        public java.lang.String d() {
            return this.g;
        }

        public com.ironsource.C3232q2 e() {
            return this.c;
        }

        public org.json.JSONObject f() {
            return this.d;
        }

        public com.ironsource.X1 g() {
            return this.h;
        }

        public java.util.List<com.ironsource.C3232q2> h() {
            return this.b;
        }

        public com.ironsource.mediationsdk.demandOnly.p a(java.lang.String str) {
            com.ironsource.X1 x1 = this.h;
            return x1 != null ? x1.a(str) : new com.ironsource.mediationsdk.demandOnly.p.b();
        }
    }

    static class b implements java.lang.Runnable {
        private static final int d = 15000;

        /* renamed from: a, reason: collision with root package name */
        private java.lang.String f6409a;
        private java.lang.String b;
        private java.lang.String c;

        public b(java.lang.String str, java.lang.String str2, java.lang.String str3) {
            this.f6409a = str;
            this.b = str2;
            this.c = str3;
        }

        /* JADX WARN: Removed duplicated region for block: B:11:0x007c A[Catch: Exception -> 0x0092, TryCatch #0 {Exception -> 0x0092, blocks: (B:3:0x0020, B:9:0x0055, B:11:0x007c, B:12:0x0081, B:16:0x007f), top: B:2:0x0020 }] */
        /* JADX WARN: Removed duplicated region for block: B:16:0x007f A[Catch: Exception -> 0x0092, TryCatch #0 {Exception -> 0x0092, blocks: (B:3:0x0020, B:9:0x0055, B:11:0x007c, B:12:0x0081, B:16:0x007f), top: B:2:0x0020 }] */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public void run() {
            boolean z;
            java.lang.String str = this.f6409a + ";" + this.b + ";" + this.c;
            try {
                java.net.HttpURLConnection httpURLConnection = (java.net.HttpURLConnection) new java.net.URL(this.c).openConnection();
                httpURLConnection.setRequestMethod("GET");
                httpURLConnection.setReadTimeout(15000);
                httpURLConnection.setConnectTimeout(15000);
                httpURLConnection.connect();
                int responseCode = httpURLConnection.getResponseCode();
                java.lang.String responseMessage = httpURLConnection.getResponseMessage();
                httpURLConnection.disconnect();
                if (responseCode != 200 && responseCode != 204) {
                    z = false;
                    com.ironsource.Jb.Y().q().a(new com.ironsource.C3360x5(!z ? com.ironsource.EnumC3378y5.TROUBLESHOOTING_SEND_AUCTION_URL_SUCCESS : com.ironsource.EnumC3378y5.TROUBLESHOOTING_FAILED_TO_SEND_AUCTION_URL, new org.json.JSONObject().put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "Mediation").put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROGRAMMATIC, 1).put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, str).put("errorCode", responseCode).put("reason", responseMessage)));
                }
                z = true;
                com.ironsource.Jb.Y().q().a(new com.ironsource.C3360x5(!z ? com.ironsource.EnumC3378y5.TROUBLESHOOTING_SEND_AUCTION_URL_SUCCESS : com.ironsource.EnumC3378y5.TROUBLESHOOTING_FAILED_TO_SEND_AUCTION_URL, new org.json.JSONObject().put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROVIDER, "Mediation").put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_PROGRAMMATIC, 1).put(com.ironsource.mediationsdk.utils.IronSourceConstants.EVENTS_EXT1, str).put("errorCode", responseCode).put("reason", responseMessage)));
            } catch (java.lang.Exception e) {
                com.ironsource.C3180n4.d().a(e);
                com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("Send auction url failed with params - " + str + ";" + e.getMessage());
            }
        }
    }

    private enum c {
        NOT_SECURE,
        SECURE
    }

    public static com.ironsource.mediationsdk.d b() {
        return B;
    }

    public com.ironsource.mediationsdk.d.a a(org.json.JSONObject jSONObject) throws org.json.JSONException {
        java.lang.String optString = jSONObject.optString("auctionId");
        if (android.text.TextUtils.isEmpty(optString)) {
            throw new org.json.JSONException("Invalid auction response - auction id is missing");
        }
        com.ironsource.mediationsdk.d.a aVar = new com.ironsource.mediationsdk.d.a(optString);
        if (jSONObject.has("settings")) {
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("settings");
            aVar.c = new com.ironsource.C3232q2(jSONObject2);
            r3 = jSONObject2.has(d) ? jSONObject2.optJSONObject(d) : null;
            if (jSONObject2.has("genericParams")) {
                aVar.d = jSONObject2.optJSONObject("genericParams");
            }
            if (jSONObject2.has("configurations")) {
                aVar.e = jSONObject2.optJSONObject("configurations");
            }
            if (jSONObject2.has(k)) {
                aVar.h = new com.ironsource.X1.a(jSONObject2.optJSONObject(k));
            }
        }
        aVar.b = new java.util.ArrayList();
        if (jSONObject.has(h)) {
            org.json.JSONArray jSONArray = jSONObject.getJSONArray(h);
            for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                com.ironsource.C3232q2 c3232q2 = new com.ironsource.C3232q2(jSONArray.getJSONObject(i2), i2, r3);
                if (!c3232q2.n()) {
                    aVar.f = 1002;
                    aVar.g = "waterfall " + i2;
                    com.ironsource.mediationsdk.logger.IronLog.INTERNAL.verbose("AuctionResponseItem " + i2 + " not valid - parsing error");
                    throw new org.json.JSONException("invalid response");
                }
                aVar.b.add(c3232q2);
            }
        }
        return aVar;
    }

    public java.lang.String c(java.lang.String str) {
        java.lang.String str2 = "";
        try {
            if (android.text.TextUtils.isEmpty(str) || !com.ironsource.C3079ha.a(str)) {
                return "";
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (!jSONObject.has("params")) {
                return "";
            }
            org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("params");
            com.ironsource.mediationsdk.logger.IronLog ironLog = com.ironsource.mediationsdk.logger.IronLog.INTERNAL;
            ironLog.verbose("parameters = " + jSONObject2);
            if (!jSONObject2.has("dynamicDemandSource")) {
                return "";
            }
            str2 = jSONObject2.getString("dynamicDemandSource");
            ironLog.verbose("demand source = " + str2);
            return str2;
        } catch (org.json.JSONException e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("exception " + e2.getMessage());
            return str2;
        }
    }

    public java.util.Map<java.lang.String, java.lang.String> b(java.lang.String str) {
        java.util.HashMap hashMap = new java.util.HashMap();
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            if (jSONObject.has("params")) {
                org.json.JSONObject jSONObject2 = jSONObject.getJSONObject("params");
                java.util.Iterator<java.lang.String> keys = jSONObject2.keys();
                while (keys.hasNext()) {
                    java.lang.String next = keys.next();
                    java.lang.Object obj = jSONObject2.get(next);
                    if (obj instanceof java.lang.String) {
                        hashMap.put(next, (java.lang.String) obj);
                    }
                }
            }
        } catch (org.json.JSONException e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("exception " + e2.getMessage());
        }
        return hashMap;
    }

    private com.ironsource.mediationsdk.d.c a() {
        com.ironsource.mediationsdk.d.c cVar = com.ironsource.mediationsdk.d.c.SECURE;
        int i2 = android.os.Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return android.security.NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted() ? com.ironsource.mediationsdk.d.c.NOT_SECURE : cVar;
        }
        if (i2 >= 23) {
            return (com.ironsource.environment.ContextProvider.getInstance().getApplicationContext().getApplicationInfo().flags & 134217728) != 0 ? com.ironsource.mediationsdk.d.c.NOT_SECURE : cVar;
        }
        return com.ironsource.mediationsdk.d.c.NOT_SECURE;
    }

    org.json.JSONObject a(com.ironsource.mediationsdk.h hVar) throws org.json.JSONException {
        com.ironsource.mediationsdk.ISBannerSize iSBannerSize;
        com.ironsource.C2953aa c2953aa;
        int i2;
        com.ironsource.mediationsdk.IronSource.a c2 = hVar.c();
        boolean u2 = hVar.u();
        java.util.Map<java.lang.String, java.lang.Object> h2 = hVar.h();
        java.util.List<java.lang.String> l2 = hVar.l();
        com.ironsource.C2963b2 e2 = hVar.e();
        int p2 = hVar.p();
        com.ironsource.mediationsdk.ISBannerSize f2 = hVar.f();
        com.ironsource.C2953aa o2 = hVar.o();
        boolean q2 = hVar.q();
        boolean r2 = hVar.r();
        java.util.ArrayList<com.ironsource.C3106j2> k2 = hVar.k();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        java.lang.String n2 = hVar.n();
        if (n2 != null) {
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            jSONObject3.put(com.ironsource.M6.y0, 1);
            jSONObject3.put(com.ironsource.M6.B0, e2 != null ? e2.a(n2) : "");
            iSBannerSize = f2;
            jSONObject3.put(com.ironsource.M6.C0, true);
            jSONObject2.put(n2, jSONObject3);
        } else {
            iSBannerSize = f2;
        }
        java.util.Iterator<java.lang.String> it = h2.keySet().iterator();
        while (true) {
            c2953aa = o2;
            if (!it.hasNext()) {
                break;
            }
            java.lang.String next = it.next();
            java.util.Iterator<java.lang.String> it2 = it;
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            jSONObject4.put(com.ironsource.M6.y0, 2);
            java.util.Map<java.lang.String, java.lang.Object> map = h2;
            jSONObject4.put(com.ironsource.M6.p0, new org.json.JSONObject((java.util.Map) h2.get(next)));
            jSONObject4.put(com.ironsource.M6.B0, e2 != null ? e2.a(next) : "");
            jSONObject4.put("ts", r2 ? 1 : 0);
            jSONObject2.put(next, jSONObject4);
            o2 = c2953aa;
            it = it2;
            h2 = map;
        }
        for (java.lang.String str : l2) {
            org.json.JSONObject jSONObject5 = new org.json.JSONObject();
            jSONObject5.put(com.ironsource.M6.y0, 1);
            jSONObject5.put(com.ironsource.M6.B0, e2 != null ? e2.a(str) : "");
            jSONObject2.put(str, jSONObject5);
        }
        java.util.Iterator<com.ironsource.C3106j2> it3 = k2.iterator();
        while (it3.hasNext()) {
            com.ironsource.C3106j2 next2 = it3.next();
            org.json.JSONObject jSONObject6 = new org.json.JSONObject();
            jSONObject6.put(com.ironsource.M6.y0, next2.e() ? 2 : 1);
            java.util.Map<java.lang.String, java.lang.Object> f3 = next2.f();
            if (!f3.isEmpty()) {
                jSONObject6.put(com.ironsource.M6.p0, new org.json.JSONObject(f3));
            }
            jSONObject6.put(com.ironsource.M6.B0, e2 != null ? e2.a(next2.g()) : "");
            jSONObject6.put("ts", r2 ? 1 : 0);
            if (!next2.h().isEmpty()) {
                jSONObject6.put(v, next2.h());
            }
            jSONObject2.put(next2.g(), jSONObject6);
        }
        jSONObject.put(com.ironsource.M6.x0, jSONObject2);
        if (hVar.w()) {
            i2 = 1;
            jSONObject.put(com.ironsource.M6.z1, 1);
        } else {
            i2 = 1;
        }
        if (hVar.t()) {
            jSONObject.put(com.ironsource.M6.y1, i2);
        }
        new com.ironsource.T9().b(com.ironsource.environment.ContextProvider.getInstance().getApplicationContext());
        org.json.JSONObject a2 = new com.ironsource.C3035f2(com.ironsource.W0.a(c2)).a();
        a(a2, false);
        a2.put(com.ironsource.M6.z0, p2);
        a2.put(com.ironsource.M6.A0, a().ordinal());
        if (c2953aa != null) {
            a2.put(com.ironsource.M6.l1, c2953aa.i());
        }
        jSONObject.put(com.ironsource.M6.u0, a2);
        if (iSBannerSize != null) {
            org.json.JSONObject jSONObject7 = new org.json.JSONObject();
            jSONObject7.put(com.ironsource.M6.r0, iSBannerSize.getDescription());
            jSONObject7.put(com.ironsource.M6.t0, iSBannerSize.getWidth());
            jSONObject7.put(com.ironsource.M6.s0, iSBannerSize.getHeight());
            jSONObject.put(com.ironsource.M6.q0, jSONObject7);
        }
        jSONObject.put(com.ironsource.M6.l0, c2.toString());
        if (hVar.b() != null) {
            jSONObject.put("adf", hVar.b());
        }
        if (hVar.d() != null) {
            jSONObject.put("mediationAdUnitId", hVar.d());
        }
        if (hVar.v() != null) {
            jSONObject.put(com.ironsource.M6.o0, hVar.v());
        }
        jSONObject.put(com.ironsource.M6.v0, !u2 ? 1 : 0);
        if (hVar.g() != null) {
            jSONObject.put(com.ironsource.M6.v1, new org.json.JSONObject().put(com.ironsource.M6.w1, hVar.g()));
        } else {
            java.lang.Object remove = a2.remove(com.ironsource.M6.v1);
            if (remove != null) {
                jSONObject.put(com.ironsource.M6.v1, remove);
            }
        }
        if (q2) {
            jSONObject.put(com.ironsource.M6.t1, 1);
        }
        return jSONObject;
    }

    public java.lang.String a(java.lang.String str, java.lang.String str2, int i2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7) {
        return str.replace(n, str4).replace(l, str6).replace(m, str5).replace(p, str2).replace(q, java.lang.Integer.toString(i2)).replace(o, str3).replace(r, str7);
    }

    public java.lang.String a(java.lang.String str, int i2, com.ironsource.C3232q2 c3232q2, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        java.lang.String i3 = c3232q2.i();
        return a(str, c3232q2.c(), i2, b().c(c3232q2.k()), i3, b().a(i3, str2), str3, str4);
    }

    public void a(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.ironsource.environment.thread.IronSourceThreadManager.INSTANCE.postMediationBackgroundTask(new com.ironsource.mediationsdk.d.b(str, str2, str3));
    }

    public java.lang.String a(java.lang.String str) {
        try {
            if (android.text.TextUtils.isEmpty(str)) {
                return str;
            }
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            return jSONObject.has("adMarkup") ? jSONObject.getString("adMarkup") : str;
        } catch (org.json.JSONException e2) {
            com.ironsource.C3180n4.d().a(e2);
            com.ironsource.mediationsdk.logger.IronLog.INTERNAL.error("exception " + e2.getMessage());
            return str;
        }
    }

    private java.lang.String a(java.lang.String str, java.lang.String str2) {
        if (android.text.TextUtils.isEmpty(str) || android.text.TextUtils.isEmpty(str2)) {
            return "";
        }
        double parseDouble = java.lang.Double.parseDouble(str);
        return java.lang.Double.parseDouble(str2) == 0.0d ? "" : java.lang.String.valueOf(java.lang.Math.round((parseDouble / r7) * 1000.0d) / 1000.0d);
    }

    public void a(org.json.JSONObject jSONObject, boolean z2) {
        if (jSONObject == null || jSONObject.length() <= 0 || android.text.TextUtils.isEmpty(jSONObject.optString(com.ironsource.M6.n1)) || !this.f6407a.compareAndSet(false, true)) {
            return;
        }
        com.ironsource.Jb.Y().q().a(new com.ironsource.C3360x5(com.ironsource.EnumC3378y5.TROUBLESHOOTING_MEDIATION_TCS_CALCULATED, com.ironsource.mediationsdk.utils.IronSourceUtils.a(z2, true, -1)));
    }
}
