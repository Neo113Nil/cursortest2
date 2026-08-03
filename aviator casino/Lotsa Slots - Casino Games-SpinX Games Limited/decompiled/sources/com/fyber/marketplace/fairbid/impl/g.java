package com.fyber.marketplace.fairbid.impl;

/* loaded from: classes3.dex */
public final class g implements com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f4373a = new java.util.HashMap();
    public final com.fyber.inneractive.sdk.serverapi.d b;
    public java.lang.String c;

    public g(com.fyber.inneractive.sdk.serverapi.c cVar) {
        this.b = cVar;
    }

    public static org.json.JSONObject a(java.util.HashMap hashMap, com.fyber.marketplace.fairbid.impl.f... fVarArr) {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        for (com.fyber.marketplace.fairbid.impl.f fVar : fVarArr) {
            java.lang.String str = (java.lang.String) hashMap.get(fVar.marketPlaceParam);
            if (!android.text.TextUtils.isEmpty(str)) {
                try {
                    java.lang.Object a2 = a(fVar.type, str);
                    if (a2 != null) {
                        jSONObject.put(fVar.fairBidParam, a2);
                    }
                } catch (org.json.JSONException unused) {
                }
            }
        }
        return jSONObject;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final java.lang.String getAdvertisingId() {
        com.fyber.inneractive.sdk.config.v vVar = com.fyber.inneractive.sdk.config.u.f3639a.b;
        if (vVar != null && vVar.c) {
            return null;
        }
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
        int i = com.fyber.inneractive.sdk.config.k.f3616a;
        java.lang.String property = java.lang.System.getProperty("ia.testEnvironmentConfiguration.device");
        if (android.text.TextUtils.isEmpty(property)) {
            com.fyber.inneractive.sdk.config.v vVar2 = com.fyber.inneractive.sdk.config.u.f3639a.b;
            if (vVar2 == null) {
                return null;
            }
            property = vVar2.f3641a;
        }
        return property;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final java.lang.String getAmazonAdvertisingId() {
        com.fyber.inneractive.sdk.config.v vVar = com.fyber.inneractive.sdk.config.u.f3639a.b;
        if (vVar == null || !vVar.c) {
            return null;
        }
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
        int i = com.fyber.inneractive.sdk.config.k.f3616a;
        java.lang.String property = java.lang.System.getProperty("ia.testEnvironmentConfiguration.device");
        if (android.text.TextUtils.isEmpty(property)) {
            com.fyber.inneractive.sdk.config.v vVar2 = com.fyber.inneractive.sdk.config.u.f3639a.b;
            if (vVar2 == null) {
                return null;
            }
            property = vVar2.f3641a;
        }
        return property;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final java.lang.String getAppVersion() {
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
        return com.fyber.inneractive.sdk.util.k.l();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final java.lang.String getBundleId() {
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
        return com.fyber.inneractive.sdk.util.o.f4302a.getPackageName();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final java.lang.String getCarrier() {
        return ((com.fyber.inneractive.sdk.serverapi.c) this.b).a();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final java.lang.String getDeviceModel() {
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
        return com.fyber.inneractive.sdk.util.k.j();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final com.fyber.inneractive.sdk.config.global.r getFeatureProvider(java.lang.String str) {
        return (com.fyber.inneractive.sdk.config.global.r) this.f4373a.get(str);
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final int getHeight() {
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
        return com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.d());
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final java.lang.String getHorizontalAccuracy() {
        return null;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final java.util.List getInputLanguages() {
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
        return com.fyber.inneractive.sdk.config.IAConfigManager.N.p;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final java.lang.String getLanguage() {
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
        return com.fyber.inneractive.sdk.config.IAConfigManager.N.o;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final java.lang.String getLatitudeLongitude() {
        return null;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final org.json.JSONObject getMarketplaceEntry() {
        java.util.HashMap hashMap = new java.util.HashMap();
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).a(this.c, hashMap);
        if (!com.fyber.inneractive.sdk.external.InneractiveAdManager.isCurrentUserAChild()) {
            java.lang.String str = com.fyber.marketplace.fairbid.impl.f.KEY_COUNTRY_CODE.marketPlaceParam;
            ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
            hashMap.put(str, com.fyber.inneractive.sdk.util.k.i());
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("client_params", a(hashMap, com.fyber.marketplace.fairbid.impl.f.KEY_TIME_OF_DAY));
        } catch (java.lang.Exception unused) {
        }
        try {
            jSONObject.put("device_params", a(hashMap, com.fyber.marketplace.fairbid.impl.f.KEY_AVAILABLE_DISK_SPACE, com.fyber.marketplace.fairbid.impl.f.KEY_DO_NOT_DISTURB, com.fyber.marketplace.fairbid.impl.f.KEY_AIRPLANE_MODE, com.fyber.marketplace.fairbid.impl.f.KEY_ANDROID_LEVEL, com.fyber.marketplace.fairbid.impl.f.KEY_IS_MUTED, com.fyber.marketplace.fairbid.impl.f.KEY_HEADSET, com.fyber.marketplace.fairbid.impl.f.KEY_BATTERY_CONNECTED, com.fyber.marketplace.fairbid.impl.f.KEY_BATTERY_LEVEL, com.fyber.marketplace.fairbid.impl.f.KEY_BLUETOOTH_CONNECTED, com.fyber.marketplace.fairbid.impl.f.KEY_LOW_POWER_MODE, com.fyber.marketplace.fairbid.impl.f.KEY_COUNTRY_CODE, com.fyber.marketplace.fairbid.impl.f.KEY_DARK_MODE, com.fyber.marketplace.fairbid.impl.f.KEY_TOTAL_DISK_SPACE, com.fyber.marketplace.fairbid.impl.f.KEY_MEDIA_MUTED, com.fyber.marketplace.fairbid.impl.f.KEY_AD_SERVICES_VERSION));
        } catch (java.lang.Exception unused2) {
        }
        try {
            jSONObject.put("content_params", a(hashMap, com.fyber.marketplace.fairbid.impl.f.KEY_LAST_BUNDLE_SHOWED, com.fyber.marketplace.fairbid.impl.f.KEY_LAST_DOMAIN_SHOWED));
        } catch (java.lang.Exception unused3) {
        }
        com.fyber.inneractive.sdk.config.global.r a2 = com.fyber.inneractive.sdk.config.global.r.a();
        this.f4373a.put(this.c, a2);
        a2.a(false, this.c);
        org.json.JSONArray a3 = com.fyber.inneractive.sdk.config.global.g.a(a2.b, true);
        com.fyber.inneractive.sdk.util.IAlog.a("%s: active experiments json set = %s", "SupportedFeaturesProvider", a3);
        if (a3 != null && a3.length() > 0) {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            try {
                jSONObject2.put(com.ironsource.C3369xe.d, a3);
            } catch (java.lang.Exception unused4) {
            }
            try {
                jSONObject.put("sdk_experiments", jSONObject2);
            } catch (java.lang.Exception unused5) {
            }
        }
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
        java.lang.StringBuilder sb = new java.lang.StringBuilder("2.2.0-Android-8.4.4");
        if (!android.text.TextUtils.isEmpty(com.fyber.inneractive.sdk.external.InneractiveAdManager.getDevPlatform())) {
            sb.append('-');
            sb.append(com.fyber.inneractive.sdk.external.InneractiveAdManager.getDevPlatform());
        }
        try {
            jSONObject.put("version", sb.toString());
        } catch (org.json.JSONException unused6) {
        }
        com.fyber.inneractive.sdk.ignite.h hVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.D;
        if (hVar != null) {
            com.fyber.inneractive.sdk.ignite.l lVar = hVar.p;
            java.lang.String i = lVar != null ? lVar.f3496a.i() : null;
            com.fyber.inneractive.sdk.ignite.l lVar2 = hVar.p;
            java.lang.String d = lVar2 != null ? lVar2.f3496a.d() : null;
            org.json.JSONObject jSONObject3 = new org.json.JSONObject();
            if (!android.text.TextUtils.isEmpty(i) && !android.text.TextUtils.isEmpty(d)) {
                try {
                    jSONObject3.put("version", i);
                } catch (org.json.JSONException unused7) {
                }
                try {
                    jSONObject3.put("package_name", d);
                } catch (org.json.JSONException unused8) {
                }
                try {
                    jSONObject.put("ignite_params", jSONObject3);
                } catch (java.lang.Exception unused9) {
                }
            }
        }
        com.fyber.inneractive.sdk.util.IAlog.a("getMarketplaceEntry:Json object - %s", jSONObject.toString());
        return jSONObject;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final java.lang.String getMobileCountryCode() {
        java.lang.String str = ((com.fyber.inneractive.sdk.serverapi.c) this.b).b;
        return str == null ? "" : str.substring(0, java.lang.Math.min(3, str.length()));
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final java.lang.String getMobileNetworkCode() {
        java.lang.String str = ((com.fyber.inneractive.sdk.serverapi.c) this.b).b;
        return str == null ? "" : str.substring(java.lang.Math.min(3, str.length()));
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final java.lang.String getNetwork() {
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
        com.fyber.inneractive.sdk.util.a1 a2 = com.fyber.inneractive.sdk.util.a1.a();
        com.fyber.inneractive.sdk.util.IAlog.a("ExchangeRequestParamsProvider: getNetwork : type: %s value: %s", a2, a2.b());
        return a2.b();
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final java.util.List getSupportedApis() {
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
        return com.fyber.inneractive.sdk.serverapi.c.c;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final java.util.List getSupportedProtocols() {
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
        return com.fyber.inneractive.sdk.serverapi.c.d;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final int getSupportedTypesBitwise() {
        this.b.getClass();
        return 372;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final java.lang.String getTimeAccuracy() {
        return null;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final java.lang.String getVerticalAccuracy() {
        return null;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final int getWidth() {
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
        return com.fyber.inneractive.sdk.util.o.c(com.fyber.inneractive.sdk.util.o.e());
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final boolean hasAmazonAdvertisingId() {
        com.fyber.inneractive.sdk.config.v vVar = com.fyber.inneractive.sdk.config.u.f3639a.b;
        if (vVar != null) {
            return vVar.c;
        }
        return false;
    }

    @Override // com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters
    public final java.lang.Boolean isLimitTrackingEnabled() {
        ((com.fyber.inneractive.sdk.serverapi.c) this.b).getClass();
        com.fyber.inneractive.sdk.config.v vVar = com.fyber.inneractive.sdk.config.u.f3639a.b;
        return java.lang.Boolean.valueOf(vVar != null ? vVar.b : false);
    }

    public static java.lang.Object a(java.lang.Object obj, java.lang.String str) {
        if (android.text.TextUtils.isEmpty(str)) {
            return null;
        }
        java.lang.String obj2 = obj.toString();
        if (android.text.TextUtils.equals(obj2, java.lang.Integer.class.toString())) {
            try {
                return java.lang.Integer.valueOf(str);
            } catch (java.lang.NumberFormatException unused) {
                return null;
            }
        }
        if (android.text.TextUtils.equals(obj2, java.lang.String.class.toString())) {
            return str;
        }
        if (android.text.TextUtils.equals(obj2, java.lang.Boolean.class.toString())) {
            if (str.equalsIgnoreCase("1")) {
                return java.lang.Boolean.TRUE;
            }
            if (str.equalsIgnoreCase("0")) {
                return java.lang.Boolean.FALSE;
            }
        }
        return null;
    }
}
