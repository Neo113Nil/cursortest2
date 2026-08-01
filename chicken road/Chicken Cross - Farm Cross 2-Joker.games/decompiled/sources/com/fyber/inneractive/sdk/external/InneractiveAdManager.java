package com.fyber.inneractive.sdk.external;

import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.content.pm.ResolveInfo;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.a0;
import com.fyber.inneractive.sdk.config.c1;
import com.fyber.inneractive.sdk.config.f0;
import com.fyber.inneractive.sdk.config.h;
import com.fyber.inneractive.sdk.config.h0;
import com.fyber.inneractive.sdk.config.j;
import com.fyber.inneractive.sdk.config.m;
import com.fyber.inneractive.sdk.config.r0;
import com.fyber.inneractive.sdk.config.u;
import com.fyber.inneractive.sdk.config.x;
import com.fyber.inneractive.sdk.external.OnFyberMarketplaceInitializedListener;
import com.fyber.inneractive.sdk.ignite.l;
import com.fyber.inneractive.sdk.logger.FMPLogger;
import com.fyber.inneractive.sdk.mraid.IAMraidKit;
import com.fyber.inneractive.sdk.network.t;
import com.fyber.inneractive.sdk.network.v0;
import com.fyber.inneractive.sdk.network.w;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.b0;
import com.fyber.inneractive.sdk.util.l0;
import com.fyber.inneractive.sdk.util.n;
import com.fyber.inneractive.sdk.util.o;
import com.fyber.inneractive.sdk.util.p1;
import com.fyber.inneractive.sdk.util.r;
import com.fyber.inneractive.sdk.util.s;
import com.fyber.inneractive.sdk.util.t1;
import com.fyber.inneractive.sdk.util.v;
import com.fyber.inneractive.sdk.util.y;
import com.fyber.inneractive.sdk.util.z;
import com.fyber.inneractive.sdk.video.IAVideoKit;
import com.fyber.inneractive.sdk.web.b1;
import com.ironsource.U3;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.ThreadPoolExecutor;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class InneractiveAdManager implements u {
    public static final String GLOBAL_CONFIG_PARAM_FIRST_INIT_EVENT = "sdk_first_init";
    public static IAConfigManager.OnConfigurationReadyAndValidListener d;
    public static b e;

    /* renamed from: a, reason: collision with root package name */
    public volatile Context f5302a;
    public String b;
    public boolean c = false;

    public enum GdprConsentSource {
        Internal,
        External
    }

    public static void a() {
        SharedPreferences sharedPreferences = o.f5960a.getSharedPreferences("Fyber_Shared_File", 0);
        String string = sharedPreferences.getString("FyberExceptionKey", "empty");
        String string2 = sharedPreferences.getString("FyberDescriptionKey", "empty");
        String string3 = sharedPreferences.getString("FyberNameKey", "empty");
        String string4 = sharedPreferences.getString("FyberVersionKey", getVersion());
        IAlog.a(" name- %s   description - %s exception - %s", string3, string2, string);
        if (string.contains("OutOfMemoryError") || string.equals("empty") || string2.equals("empty") || string3.equals("empty")) {
            return;
        }
        IAlog.a("Firing Event 999 for %s", string);
        w wVar = new w(com.fyber.inneractive.sdk.network.u.IA_UNCAUGHT_EXCEPTION);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("exception_name", string3);
        } catch (Exception unused) {
            IAlog.f("Got exception adding param to json object: %s, %s", "exception_name", string3);
        }
        try {
            jSONObject.put("description", string2);
        } catch (Exception unused2) {
            IAlog.f("Got exception adding param to json object: %s, %s", "description", string2);
        }
        try {
            jSONObject.put("stack_trace", string);
        } catch (Exception unused3) {
            IAlog.f("Got exception adding param to json object: %s, %s", "stack_trace", string);
        }
        wVar.f.put(jSONObject);
        if (wVar.a(string4)) {
            sharedPreferences.edit().remove("FyberExceptionKey").remove("FyberVersionKey").remove("FyberDescriptionKey").remove("FyberNameKey").apply();
        }
    }

    @Deprecated
    public static boolean areNativeAdsSupportedForOS() {
        return true;
    }

    public static void clearGdprConsentData() {
        h hVar = IAConfigManager.R.E;
        if (hVar != null) {
            hVar.a();
        } else {
            IAlog.f("clearGdprConsentData() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        }
    }

    public static void clearImpressionDataListener() {
        IAConfigManager.R.A.f5978a = null;
    }

    public static void clearLgpdConsentData() {
        h hVar = IAConfigManager.R.E;
        if (hVar != null) {
            hVar.b();
        } else {
            IAlog.f("clearLgpdConsentData was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        }
    }

    public static void clearUSPrivacyString() {
        h hVar = IAConfigManager.R.E;
        if (hVar != null) {
            hVar.c();
        }
    }

    public static void currentAudienceAppliesToCoppa() {
        h hVar = IAConfigManager.R.E;
        if (hVar == null) {
            IAlog.f("currentAudienceAppliesToCoppa was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        } else if (o.f5960a != null) {
            hVar.j = Boolean.TRUE;
        } else {
            hVar.getClass();
            IAlog.f("setCurrentAudienceAppliesToCoppa was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        }
    }

    public static void currentAudienceIsAChild() {
        c.f5313a.c = true;
    }

    public static void destroy() {
        l lVar;
        IAlog.a("InneractiveAdManager:destroy called", new Object[0]);
        if (c.f5313a.f5302a == null) {
            IAlog.a("InneractiveAdManager:destroy called, but manager is not initialized", new Object[0]);
            return;
        }
        c.f5313a.f5302a = null;
        IAConfigManager.removeListener(d);
        d = null;
        IAConfigManager iAConfigManager = IAConfigManager.R;
        iAConfigManager.A.f5978a = null;
        iAConfigManager.i = false;
        h hVar = iAConfigManager.E;
        if (hVar != null) {
            com.fyber.inneractive.sdk.privacy.c cVar = hVar.m;
            cVar.getClass();
            synchronized (com.fyber.inneractive.sdk.privacy.c.g) {
                if (cVar.c) {
                    cVar.c = false;
                    r.b.removeCallbacks(cVar.d);
                    cVar.b.set(null);
                    SharedPreferences sharedPreferences = cVar.e;
                    if (sharedPreferences == null) {
                        IAlog.a("%sUnable to unregister SharedPreferences observer, mAppDefaultPrefs are null", "PrivacyFlagsObserver: ");
                    } else {
                        sharedPreferences.unregisterOnSharedPreferenceChangeListener(cVar.f);
                        cVar.e = null;
                        IAlog.a("%sUnregistered IAB app default SharedPreferences observer", "PrivacyFlagsObserver: ");
                    }
                }
            }
        }
        try {
            com.fyber.inneractive.sdk.config.cellular.a aVar = iAConfigManager.P;
            if (aVar != null && aVar.f5238a != null) {
                aVar.c.clear();
                aVar.f5238a.a((com.fyber.inneractive.sdk.config.cellular.h) aVar);
                aVar.f5238a.a();
            }
        } catch (Throwable th) {
            IAlog.a("failed to destroy network watchdog", th, new Object[0]);
        }
        com.fyber.inneractive.sdk.serverapi.extradata.d dVar = iAConfigManager.J;
        dVar.d.clear();
        dVar.f = null;
        com.fyber.inneractive.sdk.ignite.h hVar2 = iAConfigManager.F;
        if (!TextUtils.isEmpty(hVar2.k) && (lVar = hVar2.o) != null) {
            lVar.destroy();
            hVar2.o = null;
        }
        l0.f5956a.a();
        b0.a();
        com.fyber.inneractive.sdk.factories.d.f5320a.f5321a.clear();
        com.fyber.inneractive.sdk.factories.b.f5318a.f5319a.clear();
        com.fyber.inneractive.sdk.factories.h.f5322a.f5323a.clear();
        InneractiveAdSpotManager.destroy();
        n.f5958a.clear();
        com.fyber.inneractive.sdk.bidder.b bVar = com.fyber.inneractive.sdk.bidder.b.h;
        com.fyber.inneractive.sdk.bidder.f fVar = bVar.d;
        if (fVar != null) {
            try {
                o.f5960a.unregisterReceiver(fVar);
            } catch (Exception unused) {
            }
        }
        bVar.d = null;
        com.fyber.inneractive.sdk.config.cellular.a aVar2 = IAConfigManager.R.P;
        if (aVar2 != null) {
            try {
                aVar2.c.remove(bVar);
            } catch (Throwable th2) {
                IAlog.a("failed to remove network observer", th2, new Object[0]);
            }
        }
        com.fyber.inneractive.sdk.nativead.b.f.a();
    }

    public static String getAppId() {
        return IAConfigManager.R.c;
    }

    @Deprecated
    public static String getDevPlatform() {
        return c.f5313a.b;
    }

    public static Boolean getGdprConsent() {
        h hVar = IAConfigManager.R.E;
        if (hVar != null) {
            return hVar.e();
        }
        return null;
    }

    public static GdprConsentSource getGdprStatusSource() {
        h hVar = IAConfigManager.R.E;
        if (hVar != null) {
            return hVar.f;
        }
        IAlog.f("getGdprStatusSource() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
        return null;
    }

    public static boolean getMuteVideo() {
        return IAConfigManager.R.l;
    }

    public static String getUserId() {
        return IAConfigManager.R.E.g;
    }

    public static InneractiveUserConfig getUserParams() {
        return IAConfigManager.R.k;
    }

    public static String getVersion() {
        return "8.4.6";
    }

    public static void initialize(Context context, String str) {
        initialize(context, str, null);
    }

    @Deprecated
    public static boolean isCurrentDeviceSupportsVideo() {
        return true;
    }

    public static boolean isCurrentUserAChild() {
        return c.f5313a.c;
    }

    @Deprecated
    public static void setDevPlatform(String str) {
        c.f5313a.b = str;
    }

    public static void setExtraData(String str, String str2) {
        com.fyber.inneractive.sdk.serverapi.extradata.d dVar = IAConfigManager.R.J;
        dVar.getClass();
        if (!v.a(str)) {
            IAlog.a("%sCould not set extra data, key can't be null or empty", "UserExtraDataManager");
            return;
        }
        if (!v.a(str2)) {
            dVar.d.remove(str.trim());
            IAlog.a("%sCleared extra data successfully for key: %s", "UserExtraDataManager", str);
        } else {
            String trim = str.trim();
            String trim2 = str2.trim();
            dVar.d.put(trim, trim2);
            IAlog.a("%sSet extra data successfully for key: %s, value: %s", "UserExtraDataManager", trim, trim2);
        }
    }

    public static void setGdprConsent(boolean z) {
        setGdprConsent(z, GdprConsentSource.Internal);
    }

    public static void setGdprConsentString(String str) {
        h hVar = IAConfigManager.R.E;
        if (hVar == null) {
            IAlog.f("setGdprConsentString() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
            return;
        }
        if (o.f5960a == null) {
            hVar.getClass();
            IAlog.f("SetGdprConsentString() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        } else {
            hVar.d = str;
            if (!hVar.a("IAGdprConsentData", str)) {
                IAlog.f("SetGdprConsentString() was invoked, but the Inneractive SDK was not properly initialized, destroyed, or data is empty.", new Object[0]);
            }
        }
        IAConfigManager.a("GDPR", str);
    }

    public static void setImpressionDataListener(OnGlobalImpressionDataListener onGlobalImpressionDataListener) {
        IAConfigManager.R.A.f5978a = onGlobalImpressionDataListener;
    }

    public static void setLgpdConsent(boolean z) {
        h hVar = IAConfigManager.R.E;
        if (hVar == null) {
            IAlog.f("setLgpdConsent was invoked, but Fyber SDK was not properly initialized", new Object[0]);
            return;
        }
        if (o.f5960a == null) {
            hVar.getClass();
            IAlog.f("setLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        } else {
            hVar.i = Boolean.valueOf(z);
            if (!hVar.a(z, "IALgpdConsentStatus")) {
                IAlog.f("setLgpdConsentStatus was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            }
        }
        IAConfigManager.a("LGPD", String.valueOf(z));
    }

    public static void setLogLevel(int i) {
        IAlog.f5940a = i;
    }

    public static void setMediationName(String str) {
        IAConfigManager.R.m = str;
    }

    public static void setMediationVersion(String str) {
        if (str != null) {
            IAConfigManager.R.o = str;
        }
    }

    public static void setMuteVideo(boolean z) {
        IAConfigManager.R.l = z;
    }

    public static void setUSPrivacyString(String str) {
        h hVar = IAConfigManager.R.E;
        if (hVar == null) {
            IAlog.f("setUSPrivacyString() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
            return;
        }
        if (o.f5960a == null) {
            hVar.getClass();
            IAlog.f("setUSPrivacyString() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        } else {
            hVar.h = str;
            if (!hVar.a("IACCPAConsentData", str)) {
                IAlog.f("setUSPrivacyString() was invoked, but the Inneractive SDK was not properly initialized, destroyed, or data is empty.", new Object[0]);
            }
        }
        IAConfigManager.a("CCPA", str);
    }

    public static void setUseLocation(boolean z) {
        IAConfigManager.R.getClass();
    }

    public static void setUserId(String str) {
        if (o.f5960a != null) {
            IAConfigManager.R.E.a(str);
        } else {
            IAConfigManager iAConfigManager = IAConfigManager.R;
            IAlog.f("setUsedId() was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        }
    }

    public static void setUserParams(InneractiveUserConfig inneractiveUserConfig) {
        IAConfigManager.R.k = inneractiveUserConfig;
        IAlog.a("config manager: setUserParams called with: gender:" + inneractiveUserConfig.getGender() + " zip: " + inneractiveUserConfig.getZipCode(), new Object[0]);
    }

    public static void useSecureConnections(boolean z) {
        IAConfigManager.R.r = z;
        IAlog.a("config manager: useSecureConnections called with: isSecured: + %s", Boolean.valueOf(z));
        if (s.a() || z) {
            return;
        }
        IAlog.f("************************************************************************************************************************", new Object[0]);
        IAlog.f("*** useSecureConnections was set to false while secure traffic is enabled in the network security config", new Object[0]);
        IAlog.f("***  The traffic will be Secured  ", new Object[0]);
        IAlog.f("************************************************************************************************************************", new Object[0]);
    }

    public static boolean wasInitialized() {
        return c.f5313a.f5302a != null;
    }

    public Context getAppContext() {
        return this.f5302a;
    }

    @Override // com.fyber.inneractive.sdk.config.u
    public void onGlobalConfigChanged(com.fyber.inneractive.sdk.config.v vVar, com.fyber.inneractive.sdk.config.r rVar) {
        if (rVar == null || !rVar.a(false, GLOBAL_CONFIG_PARAM_FIRST_INIT_EVENT)) {
            return;
        }
        IAConfigManager iAConfigManager = IAConfigManager.R;
        r.b.post(new a0());
    }

    public static void initialize(Context context, String str, OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener) {
        String str2;
        List<ResolveInfo> queryIntentServices;
        if (context == null || str == null) {
            IAlog.b("InneractiveAdManager:initialize. No context or App Id given", new Object[0]);
            a(onFyberMarketplaceInitializedListener, (str == null || TextUtils.isEmpty(str.trim())) ? OnFyberMarketplaceInitializedListener.FyberInitStatus.INVALID_APP_ID : OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED, (str == null ? "appid" : "context").concat(" is null"));
            return;
        }
        String str3 = IAConfigManager.R.c;
        boolean z = (str3 == null || str3.equalsIgnoreCase(str)) ? false : true;
        String str4 = null;
        if (c.f5313a.f5302a != null && !z) {
            IAlog.a("InneractiveAdManager:initialize called, but manager is already initialized. ignoring", new Object[0]);
            a(onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY, null);
            return;
        }
        IAlog.c.retainAll(Collections.singleton(IAlog.b));
        int i = com.fyber.inneractive.sdk.config.n.f5271a;
        String property = System.getProperty("ia.testEnvironmentConfiguration.logger");
        if (property != null) {
            for (String str5 : property.split(",")) {
                try {
                    FMPLogger fMPLogger = (FMPLogger) Class.forName(str5).newInstance();
                    fMPLogger.initialize(context);
                    IAlog.c.add(fMPLogger);
                } catch (Throwable unused) {
                }
            }
        }
        o.f5960a = (Application) context.getApplicationContext();
        SharedPreferences sharedPreferences = context.getSharedPreferences("Fyber_Shared_File", 0);
        if (e == null) {
            e = new b();
        }
        b bVar = e;
        bVar.f5312a = sharedPreferences;
        Thread.setDefaultUncaughtExceptionHandler(bVar);
        b0 b0Var = z.f5979a;
        Context applicationContext = context.getApplicationContext();
        b0Var.getClass();
        IAlog.a("%sinit called", IAlog.a(b0Var));
        b0Var.c = applicationContext;
        b0Var.d = new y(b0Var);
        IntentFilter intentFilter = new IntentFilter("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        intentFilter.addAction("android.intent.action.USER_PRESENT");
        b0Var.c.registerReceiver(b0Var.d, intentFilter);
        Intent intent = new Intent();
        intent.setAction("com.fyber.inneractive.sdk.intent.action.REGISTER_KIT");
        intent.setPackage(o.f5960a.getPackageName());
        Context applicationContext2 = context.getApplicationContext();
        if (applicationContext2 == null) {
            throw new IllegalArgumentException("Context can't be null");
        }
        List<BroadcastReceiver> asList = Arrays.asList(new IAMraidKit(), new IAVideoKit(), new com.fyber.inneractive.sdk.nativead.e());
        for (BroadcastReceiver broadcastReceiver : asList) {
            try {
                broadcastReceiver.onReceive(applicationContext2, intent);
            } catch (Throwable unused2) {
                IAlog.f("%sCould not trigger receiver for %s", IAlog.a(com.fyber.inneractive.sdk.a.class), broadcastReceiver);
            }
        }
        if (com.fyber.inneractive.sdk.factories.d.f5320a.f5321a.size() == 0) {
            Log.e("Inneractive_error", "Critical error raised while initializing SDK - please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project");
        }
        if (asList.size() == 0) {
            IAlog.b("InneractiveAdManager:initialize. please make sure you have added all the required fyber libraries (ia-mraid-kit, ia-video-kit) to your project", new Object[0]);
            a(onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus.FAILED_NO_KITS_DETECTED, null);
            return;
        }
        a aVar = new a(context, onFyberMarketplaceInitializedListener);
        d = aVar;
        IAConfigManager.addListener(aVar);
        if (z) {
            IAConfigManager iAConfigManager = IAConfigManager.R;
            iAConfigManager.c = str;
            HashMap hashMap = iAConfigManager.f5233a;
            if (hashMap != null) {
                hashMap.clear();
            }
            HashMap hashMap2 = iAConfigManager.b;
            if (hashMap2 != null) {
                hashMap2.clear();
            }
            iAConfigManager.e = null;
            iAConfigManager.d = "";
            IAConfigManager.a();
        } else {
            Context applicationContext3 = context.getApplicationContext();
            IAConfigManager iAConfigManager2 = IAConfigManager.R;
            if (!iAConfigManager2.i) {
                SharedPreferences sharedPreferences2 = o.f5960a.getSharedPreferences("IAConfigurationPreferences", 0);
                if (sharedPreferences2 != null) {
                    iAConfigManager2.K.set(sharedPreferences2.contains("privacy_api_usage_reported"));
                }
                iAConfigManager2.v = new j(context, applicationContext3);
                t1 t1Var = new t1();
                iAConfigManager2.y = t1Var;
                t1Var.c = applicationContext3.getApplicationContext();
                r.f5965a.execute(new p1(t1Var));
                com.fyber.inneractive.sdk.network.l0 l0Var = iAConfigManager2.s;
                if (!l0Var.b) {
                    l0Var.b = true;
                    for (int i2 = 0; i2 < 6; i2++) {
                        l0Var.d.submit(l0Var.e);
                    }
                }
                b1.c.getClass();
                iAConfigManager2.E = new h();
                com.fyber.inneractive.sdk.config.v vVar = new com.fyber.inneractive.sdk.config.v(applicationContext3);
                iAConfigManager2.u = vVar;
                iAConfigManager2.w = new com.fyber.inneractive.sdk.config.w(vVar);
                iAConfigManager2.H.a((Application) applicationContext3.getApplicationContext());
                iAConfigManager2.u.c.add(new com.fyber.inneractive.sdk.config.b0(iAConfigManager2));
                com.fyber.inneractive.sdk.config.v vVar2 = iAConfigManager2.u;
                vVar2.getClass();
                IAConfigManager.R.s.a(new v0(new com.fyber.inneractive.sdk.config.s(vVar2), vVar2.f5290a, vVar2.e));
                iAConfigManager2.z = new com.fyber.inneractive.sdk.config.global.a();
                IAlog.a("Initializing config manager", new Object[0]);
                IAlog.a("Config manager: lib name = %s", U3.d);
                IAlog.a("Config manager: app version = %s", "8.4.6");
                com.fyber.inneractive.sdk.config.z zVar = x.f5294a;
                if (zVar.f5297a == null) {
                    zVar.f5297a = applicationContext3;
                    new Thread(new r0(applicationContext3, zVar)).start();
                }
                if (!str.matches("[0-9]+")) {
                    IAlog.b("************************************************************************************************************************", new Object[0]);
                    IAlog.b("*************************************** APP ID Must contain only numbers ***********************************************", new Object[0]);
                    IAlog.b("*************************************** Are you sure that you are using the correct APP ID *****************************", new Object[0]);
                    IAlog.b("************************************************************************************************************************", new Object[0]);
                }
                iAConfigManager2.g = applicationContext3;
                iAConfigManager2.c = str;
                iAConfigManager2.k = new InneractiveUserConfig();
                iAConfigManager2.i = true;
                c1 c1Var = iAConfigManager2.x;
                c1Var.getClass();
                com.fyber.inneractive.sdk.config.e eVar = new com.fyber.inneractive.sdk.config.e(c1Var);
                c1Var.b = eVar;
                eVar.a();
                c1Var.d.put("SESSION_STAMP", Long.toString(SystemClock.elapsedRealtime()));
                com.fyber.inneractive.sdk.cache.session.e eVar2 = new com.fyber.inneractive.sdk.cache.session.e();
                c1Var.f5237a = eVar2;
                com.fyber.inneractive.sdk.cache.session.c cVar = new com.fyber.inneractive.sdk.cache.session.c(eVar2);
                ThreadPoolExecutor threadPoolExecutor = r.f5965a;
                threadPoolExecutor.execute(cVar);
                iAConfigManager2.C = new m(iAConfigManager2.g);
                iAConfigManager2.B = new com.fyber.inneractive.sdk.config.g(new f0(iAConfigManager2), iAConfigManager2.g);
                threadPoolExecutor.execute(new h0(iAConfigManager2));
                h hVar = iAConfigManager2.E;
                hVar.j();
                SharedPreferences sharedPreferences3 = hVar.l;
                if (sharedPreferences3 == null) {
                    IAlog.a("%sregisterIabAppDefaultPreferenceObserver App default shared prefs is null - returning", "ConfigDataProtectionProvider: ");
                } else {
                    com.fyber.inneractive.sdk.privacy.c cVar2 = hVar.m;
                    cVar2.getClass();
                    synchronized (com.fyber.inneractive.sdk.privacy.c.g) {
                        if (!cVar2.c) {
                            cVar2.e = sharedPreferences3;
                            sharedPreferences3.registerOnSharedPreferenceChangeListener(cVar2.f);
                            cVar2.c = true;
                            IAlog.a("%sRegistered IAB app default SharedPreferences observer", "PrivacyFlagsObserver: ");
                        }
                    }
                }
                try {
                    str2 = Locale.getDefault().getLanguage();
                    try {
                        IAlog.a("Available device language: %s", str2);
                    } catch (Exception unused3) {
                    }
                } catch (Exception unused4) {
                    str2 = null;
                }
                iAConfigManager2.p = str2;
                com.fyber.inneractive.sdk.ignite.h hVar2 = iAConfigManager2.F;
                hVar2.f5431a = applicationContext3;
                Intent intent2 = new Intent("com.digitalturbine.ignite.cl.IgniteRemoteService");
                Context context2 = hVar2.f5431a;
                if (context2 != null && (queryIntentServices = context2.getPackageManager().queryIntentServices(intent2, 0)) != null && queryIntentServices.size() > 0) {
                    str4 = queryIntentServices.get(0).serviceInfo.packageName;
                }
                hVar2.k = str4;
                com.fyber.inneractive.sdk.config.cellular.a aVar2 = new com.fyber.inneractive.sdk.config.cellular.a(iAConfigManager2.g);
                iAConfigManager2.P = aVar2;
                com.fyber.inneractive.sdk.config.cellular.d dVar = aVar2.f5238a;
                if (dVar != null) {
                    try {
                        dVar.a(aVar2);
                    } catch (Throwable th) {
                        IAlog.a("failed to register network detector", th, new Object[0]);
                    }
                }
            }
        }
        c.f5313a.f5302a = context.getApplicationContext();
        IAConfigManager iAConfigManager3 = IAConfigManager.R;
        iAConfigManager3.u.c.remove(c.f5313a);
        iAConfigManager3.u.c.add(c.f5313a);
    }

    public static void setGdprConsent(boolean z, GdprConsentSource gdprConsentSource) {
        h hVar = IAConfigManager.R.E;
        if (hVar == null) {
            IAlog.f("setGdprConsent() was invoked, but Fyber SDK was not properly initialized", new Object[0]);
            return;
        }
        if (o.f5960a == null) {
            hVar.getClass();
            IAlog.f("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
        } else {
            hVar.f5262a = Boolean.valueOf(z);
            if (!hVar.a(z, "IAGDPRBool")) {
                IAlog.f("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            }
            hVar.f = gdprConsentSource;
            if (!hVar.a("IAGdprSource", gdprConsentSource.name())) {
                IAlog.f("SetGdprConsent(boolean) was invoked, but the Inneractive SDK was not properly initialized, or destroyed.", new Object[0]);
            }
        }
        IAConfigManager.a("GDPR", String.valueOf(z));
    }

    public static void setMediationName(InneractiveMediationName inneractiveMediationName) {
        if (inneractiveMediationName != null) {
            IAConfigManager iAConfigManager = IAConfigManager.R;
            iAConfigManager.n = inneractiveMediationName;
            iAConfigManager.m = inneractiveMediationName.getKey();
        }
    }

    public static void a(OnFyberMarketplaceInitializedListener onFyberMarketplaceInitializedListener, OnFyberMarketplaceInitializedListener.FyberInitStatus fyberInitStatus, String str) {
        if (onFyberMarketplaceInitializedListener != null) {
            onFyberMarketplaceInitializedListener.onFyberMarketplaceInitialized(fyberInitStatus);
        }
        if (c.f5313a.f5302a == null || fyberInitStatus == OnFyberMarketplaceInitializedListener.FyberInitStatus.SUCCESSFULLY) {
            return;
        }
        w wVar = new w(t.FMP_SDK_INIT_FAILED, (InneractiveAdRequest) null, (com.fyber.inneractive.sdk.response.e) null);
        if (!TextUtils.isEmpty(str)) {
            wVar.a("message", str);
        }
        wVar.a("init_status", fyberInitStatus.name());
        wVar.a((String) null);
    }

    public static void a(Context context, Throwable th) {
        SharedPreferences sharedPreferences = context.getSharedPreferences("Fyber_Shared_File", 0);
        if (!sharedPreferences.getBoolean("FyberKotlinDependenciesExceptionReportedKey", false) && com.fyber.inneractive.sdk.network.z.a(th.getClass().getSimpleName(), "Unable resolve Kotlin dependencies: " + th.getMessage(), null, null)) {
            sharedPreferences.edit().putBoolean("FyberKotlinDependenciesExceptionReportedKey", true).apply();
        }
    }
}
