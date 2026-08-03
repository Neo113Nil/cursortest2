package com.fyber.inneractive.sdk.external;

/* loaded from: classes3.dex */
public final class InneractiveAdManager implements com.fyber.inneractive.sdk.config.r {
    public static final java.lang.String GLOBAL_CONFIG_PARAM_FIRST_INIT_EVENT = "sdk_first_init";
    public static com.fyber.inneractive.sdk.config.IAConfigManager.OnConfigurationReadyAndValidListener e;
    public static com.fyber.inneractive.sdk.external.c f;

    /* renamed from: a, reason: collision with root package name */
    public volatile android.content.Context f3649a;
    public java.lang.String b;
    public boolean c = false;
    public boolean d;

    public enum GdprConsentSource {
        Internal,
        External
    }

    public static void a(com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener, com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus, java.lang.String str) {
        if (onFyberMarketplaceInitializedListener != null) {
            onFyberMarketplaceInitializedListener.onFyberMarketplaceInitialized(fyberInitStatus);
        }
        if (com.fyber.inneractive.sdk.external.d.f3660a.f3649a == null || fyberInitStatus == com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
            return;
        }
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.t.FMP_SDK_INIT_FAILED, (com.fyber.inneractive.sdk.external.InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.e) null);
        if (!android.text.TextUtils.isEmpty(str)) {
            wVar.a("message", str);
        }
        wVar.a("init_status", fyberInitStatus.name());
        wVar.a((java.lang.String) null);
    }

    @java.lang.Deprecated
    public static boolean areNativeAdsSupportedForOS() {
        return true;
    }

    public static void clearGdprConsentData() {
        com.fyber.inneractive.sdk.config.g gVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.C;
        if (gVar != null) {
            gVar.a();
        } else {
            com.fyber.inneractive.sdk.util.IAlog.f("clearGdprConsentData() was invoked, but Fyber SDK was not properly initialized", new java.lang.Object[0]);
        }
    }

    public static void clearImpressionDataListener() {
        com.fyber.inneractive.sdk.config.IAConfigManager.N.z.f4320a = null;
    }

    public static void clearLgpdConsentData() {
        com.fyber.inneractive.sdk.config.g gVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.C;
        if (gVar != null) {
            gVar.b();
        } else {
            com.fyber.inneractive.sdk.util.IAlog.f("clearLgpdConsentData was invoked, but Fyber SDK was not properly initialized", new java.lang.Object[0]);
        }
    }

    public static void clearUSPrivacyString() {
        com.fyber.inneractive.sdk.config.g gVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.C;
        if (gVar != null) {
            gVar.c();
        }
    }

    public static void currentAudienceAppliesToCoppa() {
        com.fyber.inneractive.sdk.config.g gVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.C;
        if (gVar == null) {
            com.fyber.inneractive.sdk.util.IAlog.f("currentAudienceAppliesToCoppa was invoked, but Fyber SDK was not properly initialized", new java.lang.Object[0]);
        } else if (com.fyber.inneractive.sdk.util.o.f4302a != null) {
            gVar.j = java.lang.Boolean.TRUE;
        } else {
            gVar.getClass();
            com.fyber.inneractive.sdk.util.IAlog.f("setCurrentAudienceAppliesToCoppa was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new java.lang.Object[0]);
        }
    }

    public static void currentAudienceIsAChild() {
        com.fyber.inneractive.sdk.external.d.f3660a.c = true;
    }

    public static void destroy() {
        com.fyber.inneractive.sdk.ignite.l lVar;
        com.fyber.inneractive.sdk.util.IAlog.a("InneractiveAdManager:destroy called", new java.lang.Object[0]);
        if (com.fyber.inneractive.sdk.external.d.f3660a.f3649a == null) {
            com.fyber.inneractive.sdk.util.IAlog.a("InneractiveAdManager:destroy called, but manager is not initialized", new java.lang.Object[0]);
            return;
        }
        com.fyber.inneractive.sdk.external.d.f3660a.f3649a = null;
        com.fyber.inneractive.sdk.config.IAConfigManager.removeListener(e);
        e = null;
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
        iAConfigManager.z.f4320a = null;
        iAConfigManager.h = false;
        try {
            com.fyber.inneractive.sdk.config.cellular.a aVar = iAConfigManager.M;
            if (aVar != null && aVar.f3588a != null) {
                aVar.c.clear();
                aVar.f3588a.a((com.fyber.inneractive.sdk.config.cellular.h) aVar);
                aVar.f3588a.a();
            }
        } catch (java.lang.Throwable th) {
            com.fyber.inneractive.sdk.util.IAlog.a("failed to destroy network watchdog", th, new java.lang.Object[0]);
        }
        com.fyber.inneractive.sdk.serverapi.extradata.d dVar = iAConfigManager.H;
        dVar.d.clear();
        dVar.f = null;
        com.fyber.inneractive.sdk.ignite.h hVar = iAConfigManager.D;
        if ((!android.text.TextUtils.isEmpty(hVar.l)) && (lVar = hVar.p) != null) {
            lVar.destroy();
            hVar.p = null;
        }
        com.fyber.inneractive.sdk.util.l0.f4298a.a();
        com.fyber.inneractive.sdk.util.b0 b0Var = com.fyber.inneractive.sdk.util.z.f4321a;
        synchronized (b0Var) {
            if (b0Var.c != null) {
                com.fyber.inneractive.sdk.util.IAlog.a("%sremoving screen state receiver and destroying singleton", com.fyber.inneractive.sdk.util.IAlog.a(b0Var));
                try {
                    b0Var.c.unregisterReceiver(b0Var.d);
                } catch (java.lang.Exception unused) {
                }
                b0Var.c = null;
                b0Var.d = null;
                b0Var.f4285a.clear();
            }
        }
        com.fyber.inneractive.sdk.factories.d.f3667a.f3668a.clear();
        com.fyber.inneractive.sdk.factories.b.f3665a.f3666a.clear();
        com.fyber.inneractive.sdk.factories.h.f3669a.f3670a.clear();
        com.fyber.inneractive.sdk.external.InneractiveAdSpotManager.destroy();
        com.fyber.inneractive.sdk.util.n.f4300a.clear();
        com.fyber.inneractive.sdk.bidder.b bVar = com.fyber.inneractive.sdk.bidder.b.h;
        com.fyber.inneractive.sdk.bidder.f fVar = bVar.d;
        if (fVar != null) {
            try {
                com.fyber.inneractive.sdk.util.o.f4302a.unregisterReceiver(fVar);
            } catch (java.lang.Exception unused2) {
            }
        }
        bVar.d = null;
        com.fyber.inneractive.sdk.config.cellular.a aVar2 = com.fyber.inneractive.sdk.config.IAConfigManager.N.M;
        if (aVar2 != null) {
            try {
                aVar2.c.remove(bVar);
            } catch (java.lang.Throwable th2) {
                com.fyber.inneractive.sdk.util.IAlog.a("failed to remove network observer", th2, new java.lang.Object[0]);
            }
        }
        com.fyber.inneractive.sdk.nativead.b.f.a();
    }

    public static java.lang.String getAppId() {
        return com.fyber.inneractive.sdk.config.IAConfigManager.N.c;
    }

    @java.lang.Deprecated
    public static java.lang.String getDevPlatform() {
        return com.fyber.inneractive.sdk.external.d.f3660a.b;
    }

    public static java.lang.Boolean getGdprConsent() {
        com.fyber.inneractive.sdk.config.g gVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.C;
        if (gVar != null) {
            return gVar.e();
        }
        return null;
    }

    public static com.fyber.inneractive.sdk.external.InneractiveAdManager.GdprConsentSource getGdprStatusSource() {
        com.fyber.inneractive.sdk.config.g gVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.C;
        if (gVar != null) {
            return gVar.f;
        }
        com.fyber.inneractive.sdk.util.IAlog.f("getGdprStatusSource() was invoked, but Fyber SDK was not properly initialized", new java.lang.Object[0]);
        return null;
    }

    public static boolean getMuteVideo() {
        return com.fyber.inneractive.sdk.config.IAConfigManager.N.k;
    }

    public static java.lang.String getUserId() {
        return com.fyber.inneractive.sdk.config.IAConfigManager.N.C.g;
    }

    public static com.fyber.inneractive.sdk.external.InneractiveUserConfig getUserParams() {
        return com.fyber.inneractive.sdk.config.IAConfigManager.N.j;
    }

    public static java.lang.String getVersion() {
        return "8.4.4";
    }

    public static void initialize(android.content.Context context, java.lang.String str) {
        initialize(context, str, null);
    }

    @java.lang.Deprecated
    public static boolean isCurrentDeviceSupportsVideo() {
        return true;
    }

    public static boolean isCurrentUserAChild() {
        return com.fyber.inneractive.sdk.external.d.f3660a.c;
    }

    @java.lang.Deprecated
    public static void setDevPlatform(java.lang.String str) {
        com.fyber.inneractive.sdk.external.d.f3660a.b = str;
    }

    public static void setExtraData(java.lang.String str, java.lang.String str2) {
        com.fyber.inneractive.sdk.serverapi.extradata.d dVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.H;
        dVar.getClass();
        if (!com.fyber.inneractive.sdk.util.v.a(str)) {
            com.fyber.inneractive.sdk.util.IAlog.a("%sCould not set extra data, key can't be null or empty", "UserExtraDataManager");
            return;
        }
        if (!com.fyber.inneractive.sdk.util.v.a(str2)) {
            dVar.d.remove(str.trim());
            com.fyber.inneractive.sdk.util.IAlog.a("%sCleared extra data successfully for key: %s", "UserExtraDataManager", str);
        } else {
            java.lang.String trim = str.trim();
            java.lang.String trim2 = str2.trim();
            dVar.d.put(trim, trim2);
            com.fyber.inneractive.sdk.util.IAlog.a("%sSet extra data successfully for key: %s, value: %s", "UserExtraDataManager", trim, trim2);
        }
    }

    public static void setGdprConsent(boolean z) {
        setGdprConsent(z, com.fyber.inneractive.sdk.external.InneractiveAdManager.GdprConsentSource.Internal);
    }

    public static void setGdprConsentString(java.lang.String str) {
        com.fyber.inneractive.sdk.config.g gVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.C;
        if (gVar == null) {
            com.fyber.inneractive.sdk.util.IAlog.f("setGdprConsentString() was invoked, but Fyber SDK was not properly initialized", new java.lang.Object[0]);
            return;
        }
        if (com.fyber.inneractive.sdk.util.o.f4302a == null) {
            gVar.getClass();
            com.fyber.inneractive.sdk.util.IAlog.f("SetGdprConsentString() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new java.lang.Object[0]);
        } else {
            gVar.d = str;
            if (!gVar.a("IAGdprConsentData", str)) {
                com.fyber.inneractive.sdk.util.IAlog.f("SetGdprConsentString() was invoked, but the Inneractive SDK was not properly initialized, destroyed, or data is empty.", new java.lang.Object[0]);
            }
        }
        a("GDPR", str);
    }

    public static void setImpressionDataListener(com.fyber.inneractive.sdk.external.OnGlobalImpressionDataListener onGlobalImpressionDataListener) {
        com.fyber.inneractive.sdk.config.IAConfigManager.N.z.f4320a = onGlobalImpressionDataListener;
    }

    public static void setLgpdConsent(boolean z) {
        com.fyber.inneractive.sdk.config.g gVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.C;
        if (gVar == null) {
            com.fyber.inneractive.sdk.util.IAlog.f("setLgpdConsent was invoked, but Fyber SDK was not properly initialized", new java.lang.Object[0]);
            return;
        }
        if (com.fyber.inneractive.sdk.util.o.f4302a == null) {
            gVar.getClass();
            com.fyber.inneractive.sdk.util.IAlog.f("setLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new java.lang.Object[0]);
        } else {
            gVar.i = java.lang.Boolean.valueOf(z);
            if (!gVar.a(z, "IALgpdConsentStatus")) {
                com.fyber.inneractive.sdk.util.IAlog.f("setLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new java.lang.Object[0]);
            }
        }
        a("LGPD", java.lang.String.valueOf(z));
    }

    public static void setLogLevel(int i) {
        com.fyber.inneractive.sdk.util.IAlog.f4283a = i;
    }

    public static void setMediationName(java.lang.String str) {
        com.fyber.inneractive.sdk.config.IAConfigManager.N.l = str;
    }

    public static void setMediationVersion(java.lang.String str) {
        if (str != null) {
            com.fyber.inneractive.sdk.config.IAConfigManager.N.n = str;
        }
    }

    public static void setMuteVideo(boolean z) {
        com.fyber.inneractive.sdk.config.IAConfigManager.N.k = z;
    }

    public static void setUSPrivacyString(java.lang.String str) {
        com.fyber.inneractive.sdk.config.g gVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.C;
        if (gVar == null) {
            com.fyber.inneractive.sdk.util.IAlog.f("setUSPrivacyString() was invoked, but Fyber SDK was not properly initialized", new java.lang.Object[0]);
            return;
        }
        if (com.fyber.inneractive.sdk.util.o.f4302a == null) {
            gVar.getClass();
            com.fyber.inneractive.sdk.util.IAlog.f("setUSPrivacyString() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new java.lang.Object[0]);
        } else {
            gVar.h = str;
            if (!gVar.a("IACCPAConsentData", str)) {
                com.fyber.inneractive.sdk.util.IAlog.f("setUSPrivacyString() was invoked, but the Inneractive SDK was not properly initialized, destroyed, or data is empty.", new java.lang.Object[0]);
            }
        }
        a("CCPA", str);
    }

    public static void setUseLocation(boolean z) {
        com.fyber.inneractive.sdk.config.IAConfigManager.N.getClass();
    }

    public static void setUserId(java.lang.String str) {
        if (com.fyber.inneractive.sdk.util.o.f4302a != null) {
            com.fyber.inneractive.sdk.config.IAConfigManager.N.C.a(str);
        } else {
            com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
            com.fyber.inneractive.sdk.util.IAlog.f("setUsedId() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new java.lang.Object[0]);
        }
    }

    public static void setUserParams(com.fyber.inneractive.sdk.external.InneractiveUserConfig inneractiveUserConfig) {
        com.fyber.inneractive.sdk.config.IAConfigManager.N.j = inneractiveUserConfig;
        com.fyber.inneractive.sdk.util.IAlog.a("config manager: setUserParams called with: age:" + inneractiveUserConfig.getAge() + " gender: " + inneractiveUserConfig.getGender() + " zip: " + inneractiveUserConfig.getZipCode(), new java.lang.Object[0]);
    }

    public static void useSecureConnections(boolean z) {
        com.fyber.inneractive.sdk.config.IAConfigManager.N.q = z;
        com.fyber.inneractive.sdk.util.IAlog.a("config manager: useSecureConnections called with: isSecured: + %s", java.lang.Boolean.valueOf(z));
        if (com.fyber.inneractive.sdk.util.s.a() || z) {
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.f("************************************************************************************************************************", new java.lang.Object[0]);
        com.fyber.inneractive.sdk.util.IAlog.f("*** useSecureConnections was set to false while secure traffic is enabled in the network security config", new java.lang.Object[0]);
        com.fyber.inneractive.sdk.util.IAlog.f("***  The traffic will be Secured  ", new java.lang.Object[0]);
        com.fyber.inneractive.sdk.util.IAlog.f("************************************************************************************************************************", new java.lang.Object[0]);
    }

    public static boolean wasInitialized() {
        return com.fyber.inneractive.sdk.external.d.f3660a.f3649a != null;
    }

    public android.content.Context getAppContext() {
        return this.f3649a;
    }

    @Override // com.fyber.inneractive.sdk.config.r
    public void onGlobalConfigChanged(com.fyber.inneractive.sdk.config.s sVar, com.fyber.inneractive.sdk.config.o oVar) {
        if (oVar == null || !oVar.a(false, GLOBAL_CONFIG_PARAM_FIRST_INIT_EVENT)) {
            return;
        }
        com.fyber.inneractive.sdk.util.r.b.post(new com.fyber.inneractive.sdk.external.b());
    }

    public static void initialize(android.content.Context context, java.lang.String str, com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener) {
        java.lang.String str2;
        java.util.List<android.content.pm.ResolveInfo> queryIntentServices;
        int i;
        char c;
        if (context == null || str == null) {
            com.fyber.inneractive.sdk.util.IAlog.b("InneractiveAdManager:initialize. No context or App Id given", new java.lang.Object[0]);
            a(onFyberMarketplaceInitializedListener, (str == null || android.text.TextUtils.isEmpty(str.trim())) ? com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID : com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED, (str == null ? com.google.ads.mediation.vungle.VungleConstants.KEY_APP_ID : "context").concat(" is null"));
            return;
        }
        java.lang.String str3 = com.fyber.inneractive.sdk.config.IAConfigManager.N.c;
        boolean z = (str3 == null || str3.equalsIgnoreCase(str)) ? false : true;
        if (com.fyber.inneractive.sdk.external.d.f3660a.f3649a != null && !z) {
            com.fyber.inneractive.sdk.util.IAlog.a("InneractiveAdManager:initialize called, but manager is already initialized. ignoring", new java.lang.Object[0]);
            a(onFyberMarketplaceInitializedListener, com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY, null);
            return;
        }
        com.fyber.inneractive.sdk.util.IAlog.c.retainAll(java.util.Collections.singleton(com.fyber.inneractive.sdk.util.IAlog.b));
        int i2 = com.fyber.inneractive.sdk.config.k.f3616a;
        java.lang.String property = java.lang.System.getProperty("ia.testEnvironmentConfiguration.logger");
        if (property != null) {
            for (java.lang.String str4 : property.split(",")) {
                try {
                    com.fyber.inneractive.sdk.logger.FMPLogger fMPLogger = (com.fyber.inneractive.sdk.logger.FMPLogger) java.lang.Class.forName(str4).newInstance();
                    fMPLogger.initialize(context);
                    com.fyber.inneractive.sdk.util.IAlog.c.add(fMPLogger);
                } catch (java.lang.Throwable unused) {
                }
            }
        }
        com.fyber.inneractive.sdk.util.o.f4302a = (android.app.Application) context.getApplicationContext();
        android.content.SharedPreferences sharedPreferences = context.getSharedPreferences("Fyber_Shared_File", 0);
        java.lang.String string = sharedPreferences.getString("FyberExceptionKey", "empty");
        java.lang.String string2 = sharedPreferences.getString("FyberDescriptionKey", "empty");
        java.lang.String string3 = sharedPreferences.getString("FyberNameKey", "empty");
        java.lang.String string4 = sharedPreferences.getString("FyberVersionKey", getVersion());
        boolean z2 = z;
        com.fyber.inneractive.sdk.util.IAlog.a(" name- %s   description - %s exception - %s", string3, string2, string);
        if (!string.contains("OutOfMemoryError") && !string.equals("empty") && !string2.equals("empty") && !string3.equals("empty")) {
            com.fyber.inneractive.sdk.util.IAlog.a("Firing Event 999 for %s", string);
            com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.u.IA_UNCAUGHT_EXCEPTION);
            org.json.JSONObject jSONObject = new org.json.JSONObject();
            try {
                jSONObject.put("exception_name", string3);
                i = 2;
                c = 1;
            } catch (java.lang.Exception unused2) {
                i = 2;
                c = 1;
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", "exception_name", string3);
            }
            try {
                jSONObject.put("description", string2);
            } catch (java.lang.Exception unused3) {
                java.lang.Object[] objArr = new java.lang.Object[i];
                objArr[0] = "description";
                objArr[c] = string2;
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", objArr);
            }
            try {
                jSONObject.put("stack_trace", string);
            } catch (java.lang.Exception unused4) {
                java.lang.Object[] objArr2 = new java.lang.Object[i];
                objArr2[0] = "stack_trace";
                objArr2[c] = string;
                com.fyber.inneractive.sdk.util.IAlog.f("Got exception adding param to json object: %s, %s", objArr2);
            }
            wVar.f.put(jSONObject);
            wVar.a(string4);
            sharedPreferences.edit().remove("FyberExceptionKey").remove("FyberVersionKey").remove("FyberDescriptionKey").remove("FyberNameKey").apply();
        }
        if (f == null) {
            f = new com.fyber.inneractive.sdk.external.c();
        }
        com.fyber.inneractive.sdk.external.c cVar = f;
        cVar.f3659a = sharedPreferences;
        java.lang.Thread.setDefaultUncaughtExceptionHandler(cVar);
        com.fyber.inneractive.sdk.util.b0 b0Var = com.fyber.inneractive.sdk.util.z.f4321a;
        android.content.Context applicationContext = context.getApplicationContext();
        b0Var.getClass();
        com.fyber.inneractive.sdk.util.IAlog.a("%sinit called", com.fyber.inneractive.sdk.util.IAlog.a(b0Var));
        b0Var.c = applicationContext;
        b0Var.d = new com.fyber.inneractive.sdk.util.y(b0Var);
        android.content.IntentFilter intentFilter = new android.content.IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        b0Var.c.registerReceiver(b0Var.d, intentFilter);
        android.content.Intent intent = new android.content.Intent();
        intent.setAction("com.fyber.inneractive.sdk.intent.action.REGISTER_KIT");
        intent.setPackage(com.fyber.inneractive.sdk.util.o.f4302a.getPackageName());
        android.content.Context applicationContext2 = context.getApplicationContext();
        if (applicationContext2 == null) {
            throw new java.lang.IllegalArgumentException("Context can't be null");
        }
        java.util.List<android.content.BroadcastReceiver> asList = java.util.Arrays.asList(new com.fyber.inneractive.sdk.mraid.IAMraidKit(), new com.fyber.inneractive.sdk.video.IAVideoKit(), new com.fyber.inneractive.sdk.nativead.e());
        for (android.content.BroadcastReceiver broadcastReceiver : asList) {
            try {
                broadcastReceiver.onReceive(applicationContext2, intent);
            } catch (java.lang.Throwable unused5) {
                com.fyber.inneractive.sdk.util.IAlog.f("%sCould not trigger receiver for %s", com.fyber.inneractive.sdk.util.IAlog.a(com.fyber.inneractive.sdk.a.class), broadcastReceiver);
            }
        }
        if (com.fyber.inneractive.sdk.factories.d.f3667a.f3668a.size() == 0) {
            android.util.Log.e("Inneractive_error", "Critical error raised while initializing SDK - please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project");
        }
        if (asList.size() == 0) {
            com.fyber.inneractive.sdk.util.IAlog.b("InneractiveAdManager:initialize. please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project", new java.lang.Object[0]);
            a(onFyberMarketplaceInitializedListener, com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED_NO_KITS_DETECTED, null);
            return;
        }
        com.fyber.inneractive.sdk.external.a aVar = new com.fyber.inneractive.sdk.external.a(context, onFyberMarketplaceInitializedListener);
        e = aVar;
        com.fyber.inneractive.sdk.config.IAConfigManager.addListener(aVar);
        if (z2) {
            com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
            iAConfigManager.c = str;
            java.util.HashMap hashMap = iAConfigManager.f3582a;
            if (hashMap != null) {
                hashMap.clear();
            }
            java.util.HashMap hashMap2 = iAConfigManager.b;
            if (hashMap2 != null) {
                hashMap2.clear();
            }
            iAConfigManager.e = null;
            iAConfigManager.d = "";
            com.fyber.inneractive.sdk.config.IAConfigManager.a();
        } else {
            android.content.Context applicationContext3 = context.getApplicationContext();
            com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager2 = com.fyber.inneractive.sdk.config.IAConfigManager.N;
            if (!iAConfigManager2.h) {
                android.content.SharedPreferences sharedPreferences2 = com.fyber.inneractive.sdk.util.o.f4302a.getSharedPreferences("IAConfigurationPreferences", 0);
                if (sharedPreferences2 != null) {
                    iAConfigManager2.I.set(sharedPreferences2.contains("privacy_api_usage_reported"));
                }
                iAConfigManager2.u = new com.fyber.inneractive.sdk.config.i(context, applicationContext3);
                com.fyber.inneractive.sdk.util.s1 s1Var = new com.fyber.inneractive.sdk.util.s1();
                iAConfigManager2.x = s1Var;
                s1Var.c = applicationContext3.getApplicationContext();
                com.fyber.inneractive.sdk.util.r.f4308a.execute(new com.fyber.inneractive.sdk.util.o1(s1Var));
                com.fyber.inneractive.sdk.network.l0 l0Var = iAConfigManager2.r;
                if (!l0Var.b) {
                    l0Var.b = true;
                    for (int i3 = 0; i3 < 6; i3++) {
                        l0Var.d.submit(l0Var.e);
                    }
                }
                com.fyber.inneractive.sdk.web.b1.c.getClass();
                iAConfigManager2.C = new com.fyber.inneractive.sdk.config.g();
                com.fyber.inneractive.sdk.config.s sVar = new com.fyber.inneractive.sdk.config.s(applicationContext3);
                iAConfigManager2.t = sVar;
                iAConfigManager2.v = new com.fyber.inneractive.sdk.config.t(sVar);
                iAConfigManager2.F.a((android.app.Application) applicationContext3.getApplicationContext());
                iAConfigManager2.t.c.add(new com.fyber.inneractive.sdk.config.x(iAConfigManager2));
                com.fyber.inneractive.sdk.config.s sVar2 = iAConfigManager2.t;
                sVar2.getClass();
                com.fyber.inneractive.sdk.config.IAConfigManager.N.r.a(new com.fyber.inneractive.sdk.network.v0(new com.fyber.inneractive.sdk.config.p(sVar2), sVar2.f3636a, sVar2.e));
                iAConfigManager2.y = new com.fyber.inneractive.sdk.config.global.a();
                com.fyber.inneractive.sdk.util.IAlog.a("Initializing config manager", new java.lang.Object[0]);
                com.fyber.inneractive.sdk.util.IAlog.a("Config manager: lib name = %s", com.ironsource.X3.d);
                com.fyber.inneractive.sdk.util.IAlog.a("Config manager: app version = %s", "8.4.4");
                com.fyber.inneractive.sdk.config.w wVar2 = com.fyber.inneractive.sdk.config.u.f3639a;
                if (wVar2.f3642a == null) {
                    wVar2.f3642a = applicationContext3;
                    new java.lang.Thread(new com.fyber.inneractive.sdk.config.m0(applicationContext3, wVar2)).start();
                }
                if (!str.matches("[0-9]+")) {
                    com.fyber.inneractive.sdk.util.IAlog.b("************************************************************************************************************************", new java.lang.Object[0]);
                    com.fyber.inneractive.sdk.util.IAlog.b("*************************************** APP ID Must contain only numbers ***********************************************", new java.lang.Object[0]);
                    com.fyber.inneractive.sdk.util.IAlog.b("*************************************** Are you sure that you are using the correct APP ID *****************************", new java.lang.Object[0]);
                    com.fyber.inneractive.sdk.util.IAlog.b("************************************************************************************************************************", new java.lang.Object[0]);
                }
                iAConfigManager2.f = applicationContext3;
                iAConfigManager2.c = str;
                iAConfigManager2.j = new com.fyber.inneractive.sdk.external.InneractiveUserConfig();
                iAConfigManager2.h = true;
                com.fyber.inneractive.sdk.config.x0 x0Var = iAConfigManager2.w;
                x0Var.getClass();
                com.fyber.inneractive.sdk.config.e eVar = new com.fyber.inneractive.sdk.config.e(x0Var);
                x0Var.b = eVar;
                eVar.a();
                x0Var.d.put("SESSION_STAMP", java.lang.Long.toString(android.os.SystemClock.elapsedRealtime()));
                com.fyber.inneractive.sdk.cache.session.e eVar2 = new com.fyber.inneractive.sdk.cache.session.e();
                x0Var.f3644a = eVar2;
                com.fyber.inneractive.sdk.cache.session.c cVar2 = new com.fyber.inneractive.sdk.cache.session.c(eVar2);
                java.util.concurrent.ThreadPoolExecutor threadPoolExecutor = com.fyber.inneractive.sdk.util.r.f4308a;
                threadPoolExecutor.execute(cVar2);
                iAConfigManager2.A = new com.fyber.inneractive.sdk.network.v0(new com.fyber.inneractive.sdk.config.b0(iAConfigManager2), iAConfigManager2.f, new com.fyber.inneractive.sdk.config.f());
                threadPoolExecutor.execute(new com.fyber.inneractive.sdk.config.d0(iAConfigManager2));
                try {
                    str2 = java.util.Locale.getDefault().getLanguage();
                    try {
                        com.fyber.inneractive.sdk.util.IAlog.a("Available device language: %s", str2);
                    } catch (java.lang.Exception unused6) {
                    }
                } catch (java.lang.Exception unused7) {
                    str2 = null;
                }
                iAConfigManager2.o = str2;
                com.fyber.inneractive.sdk.ignite.h hVar = iAConfigManager2.D;
                hVar.f3777a = applicationContext3;
                android.content.Intent intent2 = new android.content.Intent("com.digitalturbine.ignite.cl.IgniteRemoteService");
                android.content.Context context2 = hVar.f3777a;
                hVar.l = (context2 == null || (queryIntentServices = context2.getPackageManager().queryIntentServices(intent2, 0)) == null || queryIntentServices.size() <= 0) ? null : queryIntentServices.get(0).serviceInfo.packageName;
                com.fyber.inneractive.sdk.config.cellular.a aVar2 = new com.fyber.inneractive.sdk.config.cellular.a(iAConfigManager2.f);
                iAConfigManager2.M = aVar2;
                com.fyber.inneractive.sdk.config.cellular.d dVar = aVar2.f3588a;
                if (dVar != null) {
                    try {
                        dVar.a(aVar2);
                    } catch (java.lang.Throwable th) {
                        com.fyber.inneractive.sdk.util.IAlog.a("failed to register network detector", th, new java.lang.Object[0]);
                    }
                }
            }
        }
        com.fyber.inneractive.sdk.external.d.f3660a.f3649a = context.getApplicationContext();
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager3 = com.fyber.inneractive.sdk.config.IAConfigManager.N;
        iAConfigManager3.t.c.remove(com.fyber.inneractive.sdk.external.d.f3660a);
        iAConfigManager3.t.c.add(com.fyber.inneractive.sdk.external.d.f3660a);
    }

    public static void setGdprConsent(boolean z, com.fyber.inneractive.sdk.external.InneractiveAdManager.GdprConsentSource gdprConsentSource) {
        com.fyber.inneractive.sdk.config.g gVar = com.fyber.inneractive.sdk.config.IAConfigManager.N.C;
        if (gVar == null) {
            com.fyber.inneractive.sdk.util.IAlog.f("setGdprConsent() was invoked, but Fyber SDK was not properly initialized", new java.lang.Object[0]);
            return;
        }
        if (com.fyber.inneractive.sdk.util.o.f4302a == null) {
            gVar.getClass();
            com.fyber.inneractive.sdk.util.IAlog.f("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new java.lang.Object[0]);
        } else {
            gVar.f3598a = java.lang.Boolean.valueOf(z);
            if (!gVar.a(z, "IAGDPRBool")) {
                com.fyber.inneractive.sdk.util.IAlog.f("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new java.lang.Object[0]);
            }
            gVar.f = gdprConsentSource;
            if (!gVar.a("IAGdprSource", gdprConsentSource.name())) {
                com.fyber.inneractive.sdk.util.IAlog.f("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new java.lang.Object[0]);
            }
        }
        a("GDPR", java.lang.String.valueOf(z));
    }

    public static void setMediationName(com.fyber.inneractive.sdk.external.InneractiveMediationName inneractiveMediationName) {
        if (inneractiveMediationName != null) {
            com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
            iAConfigManager.m = inneractiveMediationName;
            iAConfigManager.l = inneractiveMediationName.getKey();
        }
    }

    public static void a(java.lang.String str, java.lang.String str2) {
        com.fyber.inneractive.sdk.config.IAConfigManager iAConfigManager = com.fyber.inneractive.sdk.config.IAConfigManager.N;
        if (com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts.MAX.equalsIgnoreCase(iAConfigManager.l)) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s Mediation is MAX, not reporting publisher privacy api usage", "InneractiveAdManager");
            return;
        }
        if (iAConfigManager.I.get()) {
            com.fyber.inneractive.sdk.util.IAlog.a("%s Already reported publisher privacy api usage", "InneractiveAdManager");
            return;
        }
        com.fyber.inneractive.sdk.config.IAConfigManager.e();
        com.fyber.inneractive.sdk.network.w wVar = new com.fyber.inneractive.sdk.network.w(com.fyber.inneractive.sdk.network.u.PUBLISHER_PRIVACY_API_USAGE);
        if (str2 == null) {
            str2 = "";
        }
        wVar.a(str, str2).a((java.lang.String) null);
    }
}
