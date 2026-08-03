package org.cocos2dx.bole;

/* loaded from: classes6.dex */
public class BoleApplication extends androidx.multidex.MultiDexApplication {
    private static final java.lang.String ONESIGNAL_APP_ID = "d9e873d5-366f-4b66-af88-ef15fe3258a2";
    static boolean helpshift = false;

    @Override // android.app.Application
    public void onCreate() {
        registerActivityLifecycleCallbacks(new org.cocos2dx.bole.ActivityLifeManager());
        super.onCreate();
        webviewSetPath(this);
        org.cocos2dx.bole.BoleJavaUtil.addFirebaseCrashLog("app create");
        initHelpshift();
        initAjust();
        org.cocos2dx.bole.BoleJavaUtil.getADID(this);
        org.cocos2dx.bole.sdk.SDKHelper.onAppCreate(this);
    }

    void initHelpshift() {
        java.util.HashMap<java.lang.String, java.lang.Object> config = org.cocos2dx.bole.BoleJavaUtil.getConfig(this);
        java.lang.String str = (java.lang.String) config.get("HELPSHIFT_API_KEY");
        java.lang.String str2 = (java.lang.String) config.get("HELPSHIFT_DOMAIN");
        java.lang.String str3 = (java.lang.String) config.get("HELPSHIFT_APP_ID");
        if (str != null) {
            try {
                com.helpshift.Helpshift.install(this, str3, str2, new java.util.HashMap());
                helpshift = true;
            } catch (java.lang.Exception unused) {
            }
        }
    }

    void initAjust() {
        com.adjust.sdk.oaid.AdjustOaid.doNotReadOaid();
        int identifier = getResources().getIdentifier("adjust_token", "string", getPackageName());
        java.lang.Integer valueOf = java.lang.Integer.valueOf(identifier);
        android.content.res.Resources resources = getResources();
        valueOf.getClass();
        com.adjust.sdk.AdjustConfig adjustConfig = new com.adjust.sdk.AdjustConfig(this, resources.getString(identifier), com.adjust.sdk.AdjustConfig.ENVIRONMENT_PRODUCTION);
        adjustConfig.setFbAppId("318215931980023");
        try {
            if (java.util.Objects.equals(getPackageManager().getApplicationInfo(getPackageName(), 128).metaData.getString("android.app.platform"), "SAMSUNG_CLOUD")) {
                adjustConfig.setDefaultTracker("1lfua3qw");
                adjustConfig.enableFirstSessionDelay();
            }
        } catch (java.lang.Exception e) {
            e.printStackTrace();
        }
        adjustConfig.setOnDeferredDeeplinkResponseListener(new com.adjust.sdk.OnDeferredDeeplinkResponseListener() { // from class: org.cocos2dx.bole.BoleApplication.1
            @Override // com.adjust.sdk.OnDeferredDeeplinkResponseListener
            public boolean launchReceivedDeeplink(android.net.Uri uri) {
                if (uri == null) {
                    return true;
                }
                org.cocos2dx.lua.AppActivity.adjDDL = uri.toString();
                return true;
            }
        });
        com.adjust.sdk.Adjust.initSdk(adjustConfig);
        if (getPackageName().equals(com.diamondlife.slots.vegas.free.BuildConfig.APPLICATION_ID)) {
            com.adjust.sdk.Adjust.trackEvent(new com.adjust.sdk.AdjustEvent("rn24wl"));
        }
    }

    public static boolean hasHelpshift() {
        return helpshift;
    }

    public void webviewSetPath(android.content.Context context) {
        try {
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                java.lang.String processName = getProcessName(context.getApplicationContext());
                if (processName == null) {
                    processName = "bole-lotsa";
                }
                android.webkit.WebView.setDataDirectorySuffix(processName);
            }
        } catch (java.lang.Exception unused) {
        }
    }

    public java.lang.String getProcessName(android.content.Context context) {
        if (context == null) {
            return null;
        }
        for (android.app.ActivityManager.RunningAppProcessInfo runningAppProcessInfo : ((android.app.ActivityManager) context.getSystemService("activity")).getRunningAppProcesses()) {
            if (runningAppProcessInfo.pid == android.os.Process.myPid()) {
                return runningAppProcessInfo.processName + runningAppProcessInfo.pid;
            }
        }
        return null;
    }
}
