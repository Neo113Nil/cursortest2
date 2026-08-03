package com.fyber.marketplace.fairbid.impl;

/* loaded from: classes3.dex */
public abstract class e {
    com.fyber.marketplace.fairbid.impl.k adSpot;
    com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters mMarketplaceAuctionParameters;
    private com.fyber.marketplace.fairbid.impl.h mMarketplaceAuctionResponse;
    private boolean mMuted;
    protected java.lang.String mPlacementId;

    public e(java.lang.String str, org.json.JSONObject jSONObject, java.util.Map map, boolean z, com.fyber.marketplace.fairbid.bridge.MarketplaceAuctionParameters marketplaceAuctionParameters) {
        java.util.Map<java.lang.String, java.lang.String> lowerCaseHeaders = lowerCaseHeaders(map);
        com.fyber.inneractive.sdk.response.a responseAdType = getResponseAdType(lowerCaseHeaders);
        this.mMarketplaceAuctionParameters = marketplaceAuctionParameters;
        this.mPlacementId = str;
        if (responseAdType != null) {
            this.mMarketplaceAuctionResponse = new com.fyber.marketplace.fairbid.impl.h(jSONObject, responseAdType, lowerCaseHeaders);
        }
        this.mMuted = z;
    }

    public static void access$000(com.fyber.marketplace.fairbid.impl.e eVar, com.fyber.inneractive.sdk.external.InneractiveUnitController inneractiveUnitController, com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener marketplaceAdLoadListener, com.fyber.inneractive.sdk.response.e eVar2, com.fyber.inneractive.sdk.interfaces.c cVar) {
        eVar.getClass();
        if (eVar2 == null || cVar == null) {
            return;
        }
        com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.marketplace.fairbid.impl.c(eVar, inneractiveUnitController, marketplaceAdLoadListener, eVar2, cVar));
    }

    public com.fyber.inneractive.sdk.interfaces.c getAdContentLoader(com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener<? extends com.fyber.marketplace.fairbid.bridge.MarketplaceBridgeAd> marketplaceAdLoadListener, com.fyber.inneractive.sdk.response.a aVar) {
        com.fyber.inneractive.sdk.factories.e eVar = (com.fyber.inneractive.sdk.factories.e) com.fyber.inneractive.sdk.factories.d.f3667a.f3668a.get(aVar);
        com.fyber.inneractive.sdk.interfaces.c a2 = eVar != null ? eVar.a() : null;
        if (a2 != null) {
            return a2;
        }
        notifyFailToListener(com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadError.UNSUPPORTED_AD_TYPE, marketplaceAdLoadListener);
        return null;
    }

    public com.fyber.inneractive.sdk.response.a getResponseAdType(java.util.Map<java.lang.String, java.lang.String> map) {
        java.lang.String str = map.get(com.fyber.inneractive.sdk.network.n.RETURNED_AD_TYPE.a().toLowerCase(java.util.Locale.ENGLISH));
        if (str == null) {
            return null;
        }
        try {
            return com.fyber.inneractive.sdk.response.a.a(java.lang.Integer.parseInt(str));
        } catch (java.lang.NumberFormatException unused) {
            return null;
        }
    }

    public abstract void internalOnAdLoaded(com.fyber.marketplace.fairbid.impl.e eVar, com.fyber.marketplace.fairbid.impl.k kVar);

    public abstract boolean isFullscreen();

    public boolean isMuted() {
        return this.mMuted;
    }

    public void loadAd(com.fyber.inneractive.sdk.external.InneractiveUnitController<?> inneractiveUnitController, com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener<? extends com.fyber.marketplace.fairbid.bridge.MarketplaceBridgeAd> marketplaceAdLoadListener) {
        com.fyber.marketplace.fairbid.impl.h hVar = this.mMarketplaceAuctionResponse;
        if (hVar == null) {
            notifyFailToListener(com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadError.FAILED_TO_PARSE_AD_CONTENT, marketplaceAdLoadListener);
            return;
        }
        com.fyber.inneractive.sdk.response.a aVar = hVar.b;
        java.lang.String str = hVar.f4374a;
        java.util.Map map = hVar.c;
        if (aVar == null || str == null || map.isEmpty()) {
            notifyFailToListener(com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadError.FAILED_TO_PARSE_AD_CONTENT, marketplaceAdLoadListener);
        } else {
            com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.marketplace.fairbid.impl.a(this, marketplaceAdLoadListener, aVar, str, map, inneractiveUnitController));
        }
    }

    public java.util.Map<java.lang.String, java.lang.String> lowerCaseHeaders(java.util.Map<java.lang.String, java.lang.String> map) {
        java.util.HashMap hashMap = new java.util.HashMap();
        if (map != null) {
            for (java.lang.String str : map.keySet()) {
                hashMap.put(android.text.TextUtils.isEmpty(str) ? str : str.toLowerCase(java.util.Locale.ENGLISH), map.get(str));
            }
        }
        return hashMap;
    }

    public void notifyFailToListener(com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadError marketplaceAdLoadError, com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener<? extends com.fyber.marketplace.fairbid.bridge.MarketplaceBridgeAd> marketplaceAdLoadListener) {
        if (isFullscreen()) {
            com.fyber.inneractive.sdk.util.IAlog.a("Firing Event 801 - AdLoadFailed - errorCode - %s", marketplaceAdLoadError.getErrorMessage());
            com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.t.IA_AD_LOAD_FAILED, (com.fyber.inneractive.sdk.external.InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.e) null);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            java.lang.String obj = marketplaceAdLoadError.toString();
            try {
                jSONObject.put("message", obj);
            } catch (java.lang.Exception unused) {
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "message", obj);
            }
            java.lang.String errorMessage = marketplaceAdLoadError.getErrorMessage();
            try {
                jSONObject.put("extra_description", errorMessage);
            } catch (java.lang.Exception unused2) {
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "extra_description", errorMessage);
            }
            wVar.f.put(jSONObject);
            wVar.a((java.lang.String) null);
        }
        marketplaceAdLoadListener.onAdLoadFailed(marketplaceAdLoadError);
    }

    public com.fyber.inneractive.sdk.response.e parseResponseData(com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadListener<? extends com.fyber.marketplace.fairbid.bridge.MarketplaceBridgeAd> marketplaceAdLoadListener, com.fyber.inneractive.sdk.response.a aVar, java.lang.String str, java.util.Map<java.lang.String, java.lang.String> map) {
        com.fyber.inneractive.sdk.factories.e eVar = (com.fyber.inneractive.sdk.factories.e) com.fyber.inneractive.sdk.factories.d.f3667a.f3668a.get(aVar);
        com.fyber.inneractive.sdk.response.b b = eVar != null ? eVar.b() : null;
        com.fyber.inneractive.sdk.util.IAlog.a("IA Exchange response handler: final headers: %s", map);
        if (b != null) {
            com.fyber.marketplace.fairbid.impl.d dVar = new com.fyber.marketplace.fairbid.impl.d(map, str);
            b.f4250a = b.a();
            b.c = new com.fyber.inneractive.sdk.response.k(dVar);
        }
        try {
            com.fyber.inneractive.sdk.response.e a2 = b.a(str);
            com.fyber.inneractive.sdk.external.InneractiveErrorCode b2 = a2.b();
            if (b2 == null) {
                return a2;
            }
            notifyFailToListener(com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadError.RESPONSE_VALIDATION_FAILED, marketplaceAdLoadListener);
            com.fyber.inneractive.sdk.util.IAlog.a("failed parsing response data with error: %s", b2.toString());
            return null;
        } catch (java.lang.Exception e) {
            notifyFailToListener(com.fyber.marketplace.fairbid.bridge.MarketplaceAdLoadError.FAILED_TO_PARSE_AD_CONTENT, marketplaceAdLoadListener);
            if (e.getMessage() != null) {
                com.fyber.inneractive.sdk.util.IAlog.a("failed parsing response data with error: %s", e.getMessage());
            }
            return null;
        }
    }
}
