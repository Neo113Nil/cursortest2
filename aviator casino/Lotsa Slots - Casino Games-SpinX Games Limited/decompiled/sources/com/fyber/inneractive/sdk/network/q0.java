package com.fyber.inneractive.sdk.network;

/* loaded from: classes3.dex */
public final class q0 extends com.fyber.inneractive.sdk.network.t0 implements com.fyber.inneractive.sdk.network.o {
    public final com.fyber.inneractive.sdk.external.InneractiveAdRequest p;
    public java.util.HashMap q;
    public java.lang.StringBuffer r;
    public final com.fyber.inneractive.sdk.serverapi.d s;
    public boolean t;
    public final com.fyber.inneractive.sdk.network.timeouts.request.a u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.fyber.inneractive.sdk.network.q qVar, com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest, com.fyber.inneractive.sdk.config.global.r rVar) {
        super(qVar, com.fyber.inneractive.sdk.network.g0.c.a(), rVar);
        com.fyber.inneractive.sdk.serverapi.c cVar = new com.fyber.inneractive.sdk.serverapi.c(rVar);
        this.t = false;
        this.o = true;
        this.p = inneractiveAdRequest;
        this.s = cVar;
        if (inneractiveAdRequest != null) {
            java.lang.String a2 = com.fyber.inneractive.sdk.util.n1.a(inneractiveAdRequest.getSpotId());
            java.lang.String mediationName = inneractiveAdRequest.getMediationName();
            com.fyber.inneractive.sdk.config.global.features.k kVar = (com.fyber.inneractive.sdk.config.global.features.k) rVar.a(com.fyber.inneractive.sdk.config.global.features.k.class);
            this.u = android.text.TextUtils.isEmpty(mediationName) ? new com.fyber.inneractive.sdk.network.timeouts.request.b(kVar, a2) : new com.fyber.inneractive.sdk.network.timeouts.request.d(a2, kVar, mediationName);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.o
    public final java.lang.StringBuffer a() {
        return this.r;
    }

    @Override // com.fyber.inneractive.sdk.network.o
    public final java.util.Map b() {
        return this.q;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void c(long j) {
        super.c(j);
        com.fyber.inneractive.sdk.util.IAlog.a("%s : NetworkRequestAd : set start connection timestamp", com.fyber.inneractive.sdk.util.IAlog.a(this));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void d() {
        super.d();
        com.fyber.inneractive.sdk.util.IAlog.a("%s : NetworkRequestAd cancel by timeout - resolve request with no fill", com.fyber.inneractive.sdk.util.IAlog.a(this));
        this.f3857a = true;
        a((java.lang.Object) null, (java.lang.Exception) new com.fyber.inneractive.sdk.network.k1("no fill", 204), false);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final byte[] f() {
        org.json.JSONArray jSONArray;
        byte[] bArr = new byte[0];
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            com.fyber.inneractive.sdk.config.global.r rVar = ((com.fyber.inneractive.sdk.serverapi.c) this.s).f4264a;
            if (rVar != null) {
                jSONArray = com.fyber.inneractive.sdk.config.global.g.a(rVar.b, true);
                com.fyber.inneractive.sdk.util.IAlog.a("%s: active experiments json set = %s", "SupportedFeaturesProvider", jSONArray);
            } else {
                jSONArray = null;
            }
            if (jSONArray != null && jSONArray.length() > 0) {
                jSONObject2.put(com.ironsource.C3369xe.d, jSONArray);
                jSONObject.put("sdk_experiments", jSONObject2);
            }
            org.json.JSONArray a2 = com.fyber.inneractive.sdk.config.IAConfigManager.N.w.a(com.fyber.inneractive.sdk.serverapi.b.a(this.p.getSpotId()));
            if (a2 != null && a2.length() > 0) {
                jSONObject.put("user_sessions", a2);
            }
            try {
                java.lang.Object b = com.fyber.inneractive.sdk.config.IAConfigManager.b();
                if (b != null) {
                    jSONObject.put("pub_extra_data", b);
                }
            } catch (org.json.JSONException e) {
                com.fyber.inneractive.sdk.util.IAlog.a("Failed to add extra data to ad request body!", e, new java.lang.Object[0]);
            }
            a(jSONObject);
            java.lang.String jSONObject3 = jSONObject.toString();
            bArr = jSONObject3.getBytes(java.nio.charset.StandardCharsets.UTF_8);
            com.fyber.inneractive.sdk.util.IAlog.a("request json body - %s", jSONObject3);
            com.fyber.inneractive.sdk.util.IAlog.d("request json body - %s", jSONObject3);
            return bArr;
        } catch (java.lang.Exception unused) {
            com.fyber.inneractive.sdk.util.IAlog.a("Failed building body for ad request!", new java.lang.Object[0]);
            return bArr;
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int g() {
        return 0;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int j() {
        return q();
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final java.util.Map l() {
        int i = com.fyber.inneractive.sdk.config.k.f3616a;
        java.lang.String property = java.lang.System.getProperty("ia.testEnvironmentConfiguration.response");
        if (android.text.TextUtils.isEmpty(property)) {
            return null;
        }
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("mockadnetworkresponseid", property);
        com.fyber.inneractive.sdk.util.IAlog.a("NetworkRequestAd: Adding mock response header - %s", property);
        return hashMap;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.network.m0 m() {
        return com.fyber.inneractive.sdk.network.m0.POST;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.network.g1 o() {
        return com.fyber.inneractive.sdk.network.g1.HIGH;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.network.l1 p() {
        com.fyber.inneractive.sdk.network.timeouts.request.a aVar = this.u;
        return new com.fyber.inneractive.sdk.network.l1(aVar.i, aVar.h);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final java.lang.String r() {
        java.lang.String str;
        java.lang.String str2;
        int i = com.fyber.inneractive.sdk.config.k.f3616a;
        java.lang.String property = java.lang.System.getProperty("ia.testEnvironmentConfiguration.name");
        java.lang.String a2 = android.text.TextUtils.isEmpty(property) ? "https://" + com.fyber.inneractive.sdk.config.IAConfigManager.N.i.e : com.fyber.inneractive.sdk.config.a.a(property, "clientRequestEnhancedXmlAd");
        if (this.p.getFloorPrice() != null) {
            java.lang.String property2 = java.lang.System.getProperty("ia.testEnvironmentConfiguration.name");
            a2 = android.text.TextUtils.isEmpty(property2) ? "https://" + com.fyber.inneractive.sdk.config.IAConfigManager.N.i.g : com.fyber.inneractive.sdk.config.a.a(property2, "clientRequestEnhancedXmlAd");
        }
        com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest = this.p;
        com.fyber.inneractive.sdk.serverapi.d dVar = this.s;
        com.fyber.inneractive.sdk.network.r0 r0Var = new com.fyber.inneractive.sdk.network.r0(inneractiveAdRequest, dVar);
        r0Var.b = new java.util.HashMap();
        r0Var.a("fromSDK", java.lang.Boolean.toString(true));
        r0Var.a("po", java.lang.System.getProperty("ia.testEnvironmentConfiguration.number"));
        r0Var.a("secure", (com.fyber.inneractive.sdk.util.s.a() ^ true) || com.fyber.inneractive.sdk.config.IAConfigManager.N.q ? "1" : "0");
        r0Var.a("spotid", inneractiveAdRequest.getSpotId());
        java.lang.String property3 = java.lang.System.getProperty("ia.testEnvironmentConfiguration.chosenUnitId");
        if (property3 == null) {
            property3 = inneractiveAdRequest.getSelectedUnitConfig() == null ? null : ((com.fyber.inneractive.sdk.config.r0) inneractiveAdRequest.getSelectedUnitConfig()).f3627a;
        }
        r0Var.a("uid", property3);
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
        if (android.text.TextUtils.isEmpty(iAConfigManager.n)) {
            r0Var.a("med", iAConfigManager.l);
        } else {
            r0Var.a("med", iAConfigManager.l + "_" + iAConfigManager.n);
        }
        dVar.getClass();
        r0Var.a(com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_FEMALE, java.lang.Integer.toString(372));
        com.fyber.inneractive.sdk.serverapi.c cVar = (com.fyber.inneractive.sdk.serverapi.c) dVar;
        java.util.List list = com.fyber.inneractive.sdk.serverapi.c.d;
        if (!list.isEmpty()) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.String.valueOf((java.lang.Integer) it.next()));
            }
            r0Var.a("protocols", com.fyber.inneractive.sdk.util.o.a(arrayList));
        }
        java.util.List list2 = com.fyber.inneractive.sdk.serverapi.c.c;
        if (!list2.isEmpty()) {
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                arrayList2.add(java.lang.String.valueOf((java.lang.Integer) it2.next()));
            }
            r0Var.a("api", com.fyber.inneractive.sdk.util.o.a(arrayList2));
        }
        if (!com.fyber.inneractive.sdk.external.InneractiveAdManager.isCurrentUserAChild()) {
            r0Var.a("zip", iAConfigManager.j.getZipCode());
        }
        r0Var.a("a", java.lang.Integer.toString(iAConfigManager.j.getAge()));
        com.fyber.inneractive.sdk.external.InneractiveUserConfig.Gender gender = iAConfigManager.j.getGender();
        if (com.fyber.inneractive.sdk.external.InneractiveUserConfig.Gender.MALE.equals(gender)) {
            r0Var.a("g", com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_MALE);
        } else if (com.fyber.inneractive.sdk.external.InneractiveUserConfig.Gender.FEMALE.equals(gender)) {
            r0Var.a("g", com.fyber.inneractive.sdk.external.InneractiveMediationDefs.GENDER_FEMALE);
        }
        r0Var.a("t", java.lang.Long.toString(java.lang.System.currentTimeMillis()));
        java.lang.StringBuilder sb = new java.lang.StringBuilder("2.2.0-Android-8.4.4");
        if (!android.text.TextUtils.isEmpty(com.fyber.inneractive.sdk.external.InneractiveAdManager.getDevPlatform())) {
            sb.append('-');
            sb.append(com.fyber.inneractive.sdk.external.InneractiveAdManager.getDevPlatform());
        }
        r0Var.a("v", sb.toString());
        java.lang.Boolean e = iAConfigManager.C.e();
        if (e != null) {
            r0Var.a("gdpr_privacy_consent", e.booleanValue() ? "1" : "0");
        }
        com.fyber.inneractive.sdk.config.g gVar = iAConfigManager.C;
        if (gVar != null) {
            java.lang.Boolean bool = com.fyber.inneractive.sdk.util.o.f4302a == null ? null : gVar.i;
            if (bool != null) {
                r0Var.a("lgpd_consent", bool.booleanValue() ? "1" : "0");
            }
            java.lang.Boolean bool2 = iAConfigManager.C.j;
            if (bool2 != null && bool2.booleanValue()) {
                r0Var.a("coppaApplies", "1");
            }
        }
        if (!com.fyber.inneractive.sdk.external.InneractiveAdManager.isCurrentUserAChild()) {
            java.lang.String property4 = java.lang.System.getProperty("ia.testEnvironmentConfiguration.device");
            com.fyber.inneractive.sdk.config.v vVar = com.fyber.inneractive.sdk.config.u.f3639a.b;
            java.lang.String str3 = (vVar == null || !vVar.c) ? "aaid" : "amazonId";
            if (android.text.TextUtils.isEmpty(property4)) {
                com.fyber.inneractive.sdk.config.v vVar2 = com.fyber.inneractive.sdk.config.u.f3639a.b;
                property4 = vVar2 != null ? vVar2.f3641a : null;
            }
            r0Var.a(str3, property4);
        }
        if (!com.fyber.inneractive.sdk.external.InneractiveAdManager.isCurrentUserAChild()) {
            com.fyber.inneractive.sdk.config.v vVar3 = com.fyber.inneractive.sdk.config.u.f3639a.b;
            r0Var.a("dnt", java.lang.Boolean.toString(vVar3 != null ? vVar3.b : false));
        }
        r0Var.a("dml", com.fyber.inneractive.sdk.util.k.j());
        int c = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.e());
        int c2 = com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.d());
        if (c > 0 && c2 > 0) {
            r0Var.a("w", java.lang.Integer.toString(c));
            r0Var.a(androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAMING_FORMAT_HLS, java.lang.Integer.toString(c2));
        }
        int c3 = com.fyber.inneractive.sdk.util.o.c();
        r0Var.a("o", c3 == 1 ? "p" : c3 == 2 ? androidx.media3.exoplayer.upstream.CmcdData.Factory.STREAM_TYPE_LIVE : "u");
        if (!com.fyber.inneractive.sdk.external.InneractiveAdManager.isCurrentUserAChild()) {
            r0Var.a("ciso", com.fyber.inneractive.sdk.util.k.i());
            java.lang.String str4 = cVar.b;
            r0Var.a("mcc", str4 == null ? "" : str4.substring(0, java.lang.Math.min(3, str4.length())));
            java.lang.String str5 = cVar.b;
            r0Var.a("mnc", str5 == null ? "" : str5.substring(java.lang.Math.min(3, str5.length())));
            com.fyber.inneractive.sdk.util.a1 a3 = com.fyber.inneractive.sdk.util.a1.a();
            com.fyber.inneractive.sdk.util.IAlog.a("ExchangeRequestParamsProvider: getNetwork : type: %s value: %s", a3, a3.b());
            r0Var.a("nt", a3.b());
            r0Var.a("crn", cVar.a());
        }
        r0Var.a(com.ironsource.M6.F, com.ironsource.X3.d);
        r0Var.a("lng", iAConfigManager.o);
        java.util.ArrayList arrayList3 = iAConfigManager.p;
        if (arrayList3 != null && !arrayList3.isEmpty()) {
            r0Var.a("in_lng", com.fyber.inneractive.sdk.util.o.a(arrayList3));
        }
        r0Var.a(com.ironsource.M6.f, com.fyber.inneractive.sdk.util.o.f4302a.getPackageName());
        r0Var.a("appv", com.fyber.inneractive.sdk.util.k.l());
        com.fyber.inneractive.sdk.config.g gVar2 = iAConfigManager.C;
        if (gVar2.m() == com.fyber.inneractive.sdk.config.enums.IabTcfGdprAppliesStatus.DOES_NOT_APPLY || com.fyber.inneractive.sdk.util.o.f4302a == null) {
            str = null;
        } else {
            gVar2.o();
            if (gVar2.e == null) {
                gVar2.k();
            }
            str = gVar2.d;
            if (str == null) {
                str = gVar2.e;
            }
        }
        r0Var.a("gdpr_consent_data", str);
        com.fyber.inneractive.sdk.config.g gVar3 = iAConfigManager.C;
        if (com.fyber.inneractive.sdk.util.o.f4302a == null) {
            gVar3.getClass();
            str2 = null;
        } else {
            str2 = gVar3.h;
        }
        r0Var.a("us_privacy", str2);
        r0Var.a("mute_video", java.lang.Boolean.toString(iAConfigManager.k));
        r0Var.a("osv", android.os.Build.VERSION.RELEASE);
        com.fyber.inneractive.sdk.ignite.l lVar = iAConfigManager.D.p;
        r0Var.a("ignitep", lVar != null ? lVar.f3496a.d() : null);
        com.fyber.inneractive.sdk.ignite.l lVar2 = iAConfigManager.D.p;
        r0Var.a("ignitev", lVar2 != null ? lVar2.f3496a.i() : null);
        java.util.HashMap hashMap = new java.util.HashMap();
        cVar.a(inneractiveAdRequest.getSpotId(), hashMap);
        for (java.util.Map.Entry entry : hashMap.entrySet()) {
            r0Var.a((java.lang.String) entry.getKey(), (java.lang.String) entry.getValue());
        }
        if (com.fyber.inneractive.sdk.external.InneractiveAdManager.isCurrentUserAChild()) {
            r0Var.a("childMode", "1");
        }
        com.fyber.inneractive.sdk.ignite.l lVar3 = com.fyber.inneractive.sdk.config.IAConfigManager.N.D.p;
        r0Var.a("odt", lVar3 != null ? lVar3.getOdt() : "");
        java.lang.Double floorPrice = r0Var.f3855a.getFloorPrice();
        r0Var.a("floorprice", floorPrice != null ? com.fyber.inneractive.sdk.network.q0$$ExternalSyntheticBackportWithForwarding0.m(new java.math.BigDecimal(java.lang.Double.toString(floorPrice.doubleValue())).setScale(5, java.math.RoundingMode.CEILING)).toPlainString() : null);
        java.lang.String a4 = com.fyber.inneractive.sdk.util.f1.a(a2, r0Var.b);
        if (!this.t) {
            com.fyber.inneractive.sdk.util.IAlog.d("%s %s", "AD_REQUEST", a4);
            this.t = true;
        }
        return a4;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final int s() {
        return this.u.f;
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final boolean u() {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:38:0x00a9 A[Catch: Exception -> 0x00b6, TryCatch #0 {Exception -> 0x00b6, blocks: (B:30:0x0085, B:32:0x0089, B:34:0x009f, B:38:0x00a9, B:39:0x00af), top: B:29:0x0085 }] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ae  */
    @Override // com.fyber.inneractive.sdk.network.t0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final com.fyber.inneractive.sdk.network.o0 a(com.fyber.inneractive.sdk.network.l lVar, java.util.Map map, int i) {
        java.lang.StringBuffer stringBuffer;
        java.lang.String str;
        java.util.List list;
        if (map != null) {
            java.util.HashMap hashMap = new java.util.HashMap();
            for (java.lang.String str2 : map.keySet()) {
                if (str2 != null && (list = (java.util.List) map.get(str2)) != null && list.size() > 0) {
                    hashMap.put(str2.toLowerCase(java.util.Locale.US), (java.lang.String) list.get(0));
                }
            }
            this.q = hashMap;
        }
        java.io.InputStream inputStream = lVar == null ? null : lVar.c;
        super.d(java.lang.System.currentTimeMillis());
        com.fyber.inneractive.sdk.util.IAlog.a("%s : NetworkRequestAd : set start read timestamp", com.fyber.inneractive.sdk.util.IAlog.a(this));
        if (inputStream != null) {
            try {
                stringBuffer = com.fyber.inneractive.sdk.util.v.b(inputStream);
            } catch (java.lang.Exception e) {
                com.fyber.inneractive.sdk.util.IAlog.a("failed create response builder in network request ad for url: %s msg: %s", r(), e.getMessage());
                stringBuffer = null;
            }
            this.r = stringBuffer;
        }
        b(java.lang.System.currentTimeMillis());
        com.fyber.inneractive.sdk.network.o0 o0Var = new com.fyber.inneractive.sdk.network.o0();
        try {
            java.util.HashMap hashMap2 = this.q;
            if (hashMap2 != null) {
                str = (java.lang.String) hashMap2.get(com.fyber.inneractive.sdk.network.n.RETURNED_AD_TYPE.key.toLowerCase(java.util.Locale.US));
                if (!android.text.TextUtils.isEmpty(str) && android.text.TextUtils.isDigitsOnly(str)) {
                    o0Var.f3851a = a(str == null ? java.lang.Integer.parseInt(str) : 6, this, (com.fyber.inneractive.sdk.response.j) null);
                    return o0Var;
                }
            }
            str = null;
            o0Var.f3851a = a(str == null ? java.lang.Integer.parseInt(str) : 6, this, (com.fyber.inneractive.sdk.response.j) null);
            return o0Var;
        } catch (java.lang.Exception e2) {
            b(java.lang.System.currentTimeMillis());
            com.fyber.inneractive.sdk.util.IAlog.a("failed parse ad network request url: %s msg: %s", r(), e2.getMessage());
            throw new com.fyber.inneractive.sdk.network.n0(e2);
        }
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void b(long j) {
        super.b(j);
        com.fyber.inneractive.sdk.util.IAlog.a("%s : NetworkRequestAd : set end read timestamp, total execution time: %d", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Integer.valueOf(q()));
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final com.fyber.inneractive.sdk.network.l a(java.lang.String str) {
        com.fyber.inneractive.sdk.util.IAlog.a("%s: NetworkRequestAd Ad request execution started, timeouts(connection: %d read: %d)", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Integer.valueOf(p().f3847a), java.lang.Integer.valueOf(p().b));
        return super.a(str);
    }

    @Override // com.fyber.inneractive.sdk.network.t0
    public final void a(long j) {
        super.a(j);
        com.fyber.inneractive.sdk.util.IAlog.a("%s : NetworkRequestAd : set end connection timestamp, total execution time: %d", com.fyber.inneractive.sdk.util.IAlog.a(this), java.lang.Integer.valueOf(q()));
    }

    public final void a(org.json.JSONObject jSONObject) {
        com.fyber.inneractive.sdk.config.g gVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.C;
        if (gVar == null) {
            com.fyber.inneractive.sdk.util.IAlog.b("%sFailed to add GPP sections to GPP object, ConfigDataProtectionProvider is null!", com.fyber.inneractive.sdk.util.IAlog.a(this));
            return;
        }
        org.json.JSONObject jSONObject2 = new org.json.JSONObject();
        try {
            com.fyber.inneractive.sdk.gpp.a aVar = gVar.m;
            java.lang.String str = aVar.f3769a.get() == null ? null : aVar.b;
            if (str != null && !str.trim().isEmpty()) {
                jSONObject2.put("gppSid", str);
            }
        } catch (org.json.JSONException e) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sFailed to add GPP sections to GPP object!", e, com.fyber.inneractive.sdk.util.IAlog.a(this));
        }
        try {
            java.lang.String str2 = gVar.m.d;
            if (str2 != null && !str2.trim().isEmpty()) {
                jSONObject2.put("gppEncodedString", str2);
            }
        } catch (org.json.JSONException e2) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sFailed to add GPP string to GPP object!", e2, com.fyber.inneractive.sdk.util.IAlog.a(this));
        }
        if (jSONObject2.length() <= 0) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sGPP object is empty, not adding to request", com.fyber.inneractive.sdk.util.IAlog.a(this));
            return;
        }
        try {
            jSONObject.put("gpp", jSONObject2);
        } catch (org.json.JSONException e3) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sFailed to add GPP to ad request body!", e3, com.fyber.inneractive.sdk.util.IAlog.a(this));
        }
    }
}
