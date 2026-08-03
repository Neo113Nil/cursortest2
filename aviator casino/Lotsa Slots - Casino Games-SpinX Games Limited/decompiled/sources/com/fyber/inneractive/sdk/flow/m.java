package com.fyber.inneractive.sdk.flow;

/* loaded from: classes3.dex */
public final class m extends com.fyber.inneractive.sdk.flow.o {
    public com.fyber.inneractive.sdk.flow.l g;

    public m(java.lang.String str) {
        super(str);
    }

    public static void a(boolean z, com.fyber.inneractive.sdk.response.e eVar, com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest) {
        java.lang.String str;
        java.lang.String spotId = inneractiveAdRequest.getSpotId();
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
        java.lang.String str2 = (java.lang.String) iAConfigManager.w.d.get("KEY_MISSMATCH_STATS_SPOTS");
        if (android.text.TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        if (str2.contains("-" + spotId + "-")) {
            return;
        }
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.t.MISSMATCH_SPOTID, inneractiveAdRequest, eVar);
        if (z) {
            str = "There is no " + spotId + " spot ID in current app config";
        } else {
            str = "spot ID " + spotId + " is not active in current app config";
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("reason", str);
        } catch (java.lang.Exception unused) {
            com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "reason", str);
        }
        wVar.f.put(jSONObject);
        wVar.a((java.lang.String) null);
        iAConfigManager.w.d.put("KEY_MISSMATCH_STATS_SPOTS", str2 + " -" + spotId + "-");
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public final void b() {
        com.fyber.inneractive.sdk.util.IAlog.a("%s onRetry()", com.fyber.inneractive.sdk.util.IAlog.a(this));
    }

    public final void c(com.fyber.inneractive.sdk.external.InneractiveAdRequest inneractiveAdRequest) {
        com.fyber.inneractive.sdk.flow.o oVar;
        com.fyber.inneractive.sdk.config.t0 t0Var;
        com.fyber.inneractive.sdk.config.enums.UnitDisplayType unitDisplayType;
        com.fyber.inneractive.sdk.flow.n nVar;
        if (!com.fyber.inneractive.sdk.external.InneractiveAdManager.wasInitialized() && (nVar = this.b) != null) {
            ((com.fyber.inneractive.sdk.flow.e0) nVar).a(inneractiveAdRequest, c(), new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.SDK_NOT_INITIALIZED, com.fyber.inneractive.sdk.flow.i.NO_APP_CONFIG_AVAILABLE));
        }
        java.lang.String spotId = inneractiveAdRequest.getSpotId();
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
        java.util.HashMap hashMap = iAConfigManager.f3582a;
        com.fyber.inneractive.sdk.config.q0 q0Var = (hashMap == null || !hashMap.containsKey(spotId)) ? null : (com.fyber.inneractive.sdk.config.q0) iAConfigManager.f3582a.get(spotId);
        com.fyber.inneractive.sdk.response.e c = c();
        if (q0Var != null && !q0Var.b) {
            a(false, c, inneractiveAdRequest);
            ((com.fyber.inneractive.sdk.flow.e0) this.b).a(inneractiveAdRequest, c(), new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.SPOT_DISABLED, com.fyber.inneractive.sdk.flow.i.NO_APP_CONFIG_AVAILABLE));
            return;
        }
        if (q0Var == null || !q0Var.f3626a.iterator().hasNext()) {
            if (q0Var == null) {
                a(true, c, inneractiveAdRequest);
                com.fyber.inneractive.sdk.config.IAConfigManager.a();
            }
            com.fyber.inneractive.sdk.util.IAlog.f("************************************************************************************************************************", new java.lang.Object[0]);
            com.fyber.inneractive.sdk.util.IAlog.f("*** Requested spot id '%s' doesn't exist within this application config - application Id: '%s'", inneractiveAdRequest.getSpotId(), iAConfigManager.c);
            com.fyber.inneractive.sdk.util.IAlog.f("*** Are you sure that you are using the correct application and spot ids, as defined for this application in the Inneractive console?", new java.lang.Object[0]);
            com.fyber.inneractive.sdk.util.IAlog.f("************************************************************************************************************************", new java.lang.Object[0]);
            ((com.fyber.inneractive.sdk.flow.e0) this.b).a(inneractiveAdRequest, c, new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.ERROR_CONFIGURATION_NO_SUCH_SPOT, com.fyber.inneractive.sdk.flow.i.NO_APP_CONFIG_AVAILABLE));
            return;
        }
        com.fyber.inneractive.sdk.config.r0 r0Var = (com.fyber.inneractive.sdk.config.r0) q0Var.f3626a.get(0);
        if (r0Var.e != null || (r0Var.c == null && ((t0Var = r0Var.f) == null || ((unitDisplayType = t0Var.j) != com.fyber.inneractive.sdk.config.enums.UnitDisplayType.INTERSTITIAL && unitDisplayType != com.fyber.inneractive.sdk.config.enums.UnitDisplayType.REWARDED)))) {
            ((com.fyber.inneractive.sdk.flow.e0) this.b).a(inneractiveAdRequest, c(), new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.UNSUPPORTED_SPOT, com.fyber.inneractive.sdk.flow.i.NO_APP_CONFIG_AVAILABLE));
            return;
        }
        com.fyber.inneractive.sdk.config.global.r a2 = com.fyber.inneractive.sdk.config.global.r.a();
        this.c = a2;
        a2.a(false, inneractiveAdRequest.getSpotId());
        com.fyber.inneractive.sdk.network.s sVar = new com.fyber.inneractive.sdk.network.s(inneractiveAdRequest, inneractiveAdRequest.b, this.c, this);
        this.d = sVar;
        sVar.b = false;
        com.fyber.inneractive.sdk.util.IAlog.a("IARemoteAdFetcher: requestAd called", new java.lang.Object[0]);
        if (android.text.TextUtils.isEmpty(inneractiveAdRequest.getSpotId())) {
            com.fyber.inneractive.sdk.util.IAlog.b("appID is null or empty. Please provide a valid appID and re-try.", new java.lang.Object[0]);
        } else {
            if (com.fyber.inneractive.sdk.util.o.a("android.permission.INTERNET")) {
                if (!com.fyber.inneractive.sdk.util.o.a("android.permission.ACCESS_NETWORK_STATE")) {
                    com.fyber.inneractive.sdk.util.IAlog.b("It is recommended to add ACCESS_NETWORK_STATE permission to the Manifest for better targetting", new java.lang.Object[0]);
                }
                if (!com.fyber.inneractive.sdk.util.o.a("android.permission.READ_PHONE_STATE")) {
                    com.fyber.inneractive.sdk.util.IAlog.f("It is recomended to add the READ_PHONE_STATE permission to the manifest for better targetting", new java.lang.Object[0]);
                }
                iAConfigManager.r.a(sVar.f);
                return;
            }
            com.fyber.inneractive.sdk.util.IAlog.b("INTERNET permission is missing. Please add it to the Manifest and re-try, otherwise ads will not be requested and displayed! ", new java.lang.Object[0]);
        }
        com.fyber.inneractive.sdk.external.InneractiveInfrastructureError inneractiveInfrastructureError = new com.fyber.inneractive.sdk.external.InneractiveInfrastructureError(com.fyber.inneractive.sdk.external.InneractiveErrorCode.INVALID_INPUT, com.fyber.inneractive.sdk.flow.i.VALIDATE_PARAMS_FAILED, new java.lang.Exception("appID is null or empty or INTERNET permission is missing"));
        if (sVar.b || (oVar = sVar.f3848a) == null) {
            return;
        }
        oVar.a(inneractiveAdRequest, null, inneractiveInfrastructureError);
    }

    @Override // com.fyber.inneractive.sdk.flow.o
    public final java.lang.String d() {
        return com.fyber.inneractive.sdk.util.IAlog.a(this);
    }

    @Override // com.fyber.inneractive.sdk.interfaces.b
    public final void a() {
        com.fyber.inneractive.sdk.util.IAlog.a("%s onTimeout()", com.fyber.inneractive.sdk.util.IAlog.a(this));
    }
}
