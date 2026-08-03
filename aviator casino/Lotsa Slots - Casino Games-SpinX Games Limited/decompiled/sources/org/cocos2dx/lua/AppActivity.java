package org.cocos2dx.lua;

/* loaded from: classes6.dex */
public class AppActivity extends org.cocos2dx.lib.Cocos2dxActivity {
    public static java.lang.String AMAZON = "amazon";
    public static java.lang.String ANDROID = "android";
    private static java.lang.String TAG = "AppActivity";
    public static java.lang.String adjDDL = "";
    public static java.lang.String deeplinkUrl = "";
    public static java.lang.String googleDDL = "";
    public static java.lang.String urlParameter = "";
    public java.lang.String PLATPORM = ANDROID;
    private final org.cocos2dx.bole.BatteryReceiver btyReceiver = new org.cocos2dx.bole.BatteryReceiver();
    private android.content.SharedPreferences.OnSharedPreferenceChangeListener deepLinkListener;
    private org.cocos2dx.lib.Cocos2dxGLSurfaceView glSurfaceView;
    private android.content.SharedPreferences preferences;

    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public org.cocos2dx.lib.Cocos2dxGLSurfaceView onCreateView() {
        org.cocos2dx.lib.Cocos2dxGLSurfaceView cocos2dxGLSurfaceView = new org.cocos2dx.lib.Cocos2dxGLSurfaceView(this);
        this.glSurfaceView = cocos2dxGLSurfaceView;
        cocos2dxGLSurfaceView.setEGLConfigChooser(5, 6, 5, 0, 16, 8);
        try {
            this.PLATPORM = getPackageManager().getApplicationInfo(getPackageName(), 128).metaData.getString("android.app.platform");
        } catch (java.lang.Exception unused) {
        }
        org.cocos2dx.plugin.PluginWrapper.init(this);
        org.cocos2dx.plugin.PluginWrapper.setGLSurfaceView(this.glSurfaceView);
        org.cocos2dx.bole.BoleJavaUtil.addShortCut();
        android.util.Log.d(com.ironsource.M6.H, "platform is " + this.PLATPORM);
        if (AMAZON.equals(this.PLATPORM.toLowerCase())) {
            org.cocos2dx.bole.amazon.iap.AmazonIapManager.setupIAPOnCreate(this);
        }
        org.cocos2dx.bole.BoleJavaUtil.addFirebaseCrashLog("glview end");
        return this.glSurfaceView;
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity
    protected void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        checkDeeplink();
        initFacebook();
        registerReceiver(this.btyReceiver, new android.content.IntentFilter("android.intent.action.BATTERY_CHANGED"));
        googleDDL();
        checkPush();
        org.cocos2dx.bole.GDPRHelper.onCreate(this);
        org.cocos2dx.bole.BoleJavaUtil.addFirebaseCrashLog("app end");
        org.cocos2dx.bole.sdk.SDKHelper.onActivityCreate(this);
        android.view.WindowManager.LayoutParams attributes = getWindow().getAttributes();
        attributes.rotationAnimation = 1;
        if (android.os.Build.VERSION.SDK_INT >= 28) {
            attributes.layoutInDisplayCutoutMode = 1;
        }
        getWindow().setAttributes(attributes);
        registerNavigationBarListener();
    }

    public void checkDeeplink() {
        android.net.Uri data;
        android.content.Intent intent = getIntent();
        if (intent == null || (data = intent.getData()) == null) {
            return;
        }
        deeplinkUrl = data.toString();
        java.lang.String queryParameter = data.getQueryParameter(com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
        if (queryParameter != null) {
            urlParameter = queryParameter;
            java.lang.System.out.println("-------URL message is " + queryParameter);
        }
        com.adjust.sdk.Adjust.processDeeplink(new com.adjust.sdk.AdjustDeeplink(data), getApplicationContext());
    }

    public void initFacebook() {
        try {
            org.cocos2dx.plugin.FacebookWrapper.onCreate(this);
            com.facebook.applinks.AppLinkData.fetchDeferredAppLinkData(this, new com.facebook.applinks.AppLinkData.CompletionHandler() { // from class: org.cocos2dx.lua.AppActivity.1
                @Override // com.facebook.applinks.AppLinkData.CompletionHandler
                public void onDeferredAppLinkDataFetched(com.facebook.applinks.AppLinkData appLinkData) {
                    android.net.Uri targetUri;
                    if (appLinkData == null || (targetUri = appLinkData.getTargetUri()) == null) {
                        return;
                    }
                    org.cocos2dx.lua.AppActivity.deeplinkUrl = targetUri.toString();
                    java.lang.String queryParameter = targetUri.getQueryParameter(com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
                    if (queryParameter != null) {
                        org.cocos2dx.lua.AppActivity.urlParameter = queryParameter;
                    }
                }
            });
        } catch (java.lang.Exception e) {
            android.util.Log.e(TAG, e.toString());
            e.printStackTrace();
        }
    }

    public void checkPush() {
        org.cocos2dx.bole.BoleJavaUtil.executeTask(new java.lang.Runnable() { // from class: org.cocos2dx.lua.AppActivity.2
            @Override // java.lang.Runnable
            public void run() {
                try {
                    android.content.SharedPreferences defaultSharedPreferences = android.preference.PreferenceManager.getDefaultSharedPreferences(this.getApplicationContext());
                    java.lang.String string = defaultSharedPreferences.getString("notification_authorization", "0");
                    android.content.SharedPreferences.Editor edit = defaultSharedPreferences.edit();
                    if (androidx.core.app.NotificationManagerCompat.from(this).areNotificationsEnabled()) {
                        edit.putString("notification_authorization", "1");
                    } else if (string != com.ironsource.C2945a2.f) {
                        edit.putString("notification_authorization", "0");
                    }
                    edit.commit();
                } catch (java.lang.Exception e) {
                    android.util.Log.e(org.cocos2dx.lua.AppActivity.TAG, "checkPush: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        });
    }

    public void registerNavigationBarListener() {
        android.view.View decorView = getWindow().getDecorView();
        decorView.setOnApplyWindowInsetsListener(new android.view.View.OnApplyWindowInsetsListener() { // from class: org.cocos2dx.lua.AppActivity$$ExternalSyntheticLambda1
            @Override // android.view.View.OnApplyWindowInsetsListener
            public final android.view.WindowInsets onApplyWindowInsets(android.view.View view, android.view.WindowInsets windowInsets) {
                return org.cocos2dx.lua.AppActivity.this.m12614x74217a27(view, windowInsets);
            }
        });
        decorView.requestApplyInsets();
    }

    /* renamed from: lambda$registerNavigationBarListener$0$org-cocos2dx-lua-AppActivity, reason: not valid java name */
    /* synthetic */ android.view.WindowInsets m12614x74217a27(android.view.View view, android.view.WindowInsets windowInsets) {
        if ((view.getSystemUiVisibility() & 2) == 0) {
            onNavigationBarChanged(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return windowInsets;
    }

    public void requestPermission(java.lang.String str) {
        if (android.os.Build.VERSION.SDK_INT >= 23) {
            requestPermissions(new java.lang.String[]{str}, 11002);
        }
    }

    void googleDDL() {
        try {
            android.content.SharedPreferences sharedPreferences = getSharedPreferences("google.analytics.deferred.deeplink.prefs", 0);
            this.preferences = sharedPreferences;
            java.lang.String string = sharedPreferences.getString(com.adjust.sdk.Constants.DEEPLINK, "");
            googleDDL = string;
            if (!string.isEmpty()) {
                android.content.SharedPreferences.Editor edit = this.preferences.edit();
                edit.clear();
                edit.commit();
            }
            this.deepLinkListener = new android.content.SharedPreferences.OnSharedPreferenceChangeListener() { // from class: org.cocos2dx.lua.AppActivity$$ExternalSyntheticLambda0
                @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
                public final void onSharedPreferenceChanged(android.content.SharedPreferences sharedPreferences2, java.lang.String str) {
                    org.cocos2dx.lua.AppActivity.lambda$googleDDL$1(sharedPreferences2, str);
                }
            };
        } catch (java.lang.Exception e) {
            android.util.Log.e(TAG, "googleDDL: " + e.getMessage());
            e.printStackTrace();
        }
    }

    static /* synthetic */ void lambda$googleDDL$1(android.content.SharedPreferences sharedPreferences, java.lang.String str) {
        if (com.adjust.sdk.Constants.DEEPLINK.equals(str)) {
            java.lang.String string = sharedPreferences.getString(str, "");
            googleDDL = string;
            if (string.isEmpty()) {
                return;
            }
            android.content.SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.clear();
            edit.commit();
        }
    }

    public static java.lang.String getUrlParameter() {
        return urlParameter;
    }

    public static java.lang.String getDeeplinkUrl() {
        if (deeplinkUrl.isEmpty()) {
            if (adjDDL.isEmpty()) {
                return googleDDL;
            }
            return adjDDL;
        }
        return deeplinkUrl;
    }

    public static java.lang.String getADJDDL() {
        return adjDDL;
    }

    public static java.lang.String getGoogleDDL() {
        return googleDDL;
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onLowMemory() {
        super.onLowMemory();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(android.content.res.Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    @Override // android.app.Activity
    public void onStart() {
        super.onStart();
        this.preferences.registerOnSharedPreferenceChangeListener(this.deepLinkListener);
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity
    protected void onResume() {
        org.cocos2dx.bole.BoleJavaUtil.addFirebaseCrashLog(com.ironsource.X3.i.u0);
        super.onResume();
        org.cocos2dx.plugin.PluginWrapper.onResume();
        if (AMAZON.equals(this.PLATPORM.toLowerCase())) {
            org.cocos2dx.bole.amazon.iap.AmazonIapManager.onResume();
        }
        org.cocos2dx.bole.sdk.SDKHelper.onResume();
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity
    protected void onPause() {
        org.cocos2dx.bole.BoleJavaUtil.addFirebaseCrashLog(com.ironsource.X3.i.t0);
        super.onPause();
        org.cocos2dx.plugin.PluginWrapper.onPause();
        org.cocos2dx.bole.sdk.SDKHelper.onPause();
    }

    @Override // android.app.Activity
    public void onStop() {
        super.onStop();
        this.preferences.unregisterOnSharedPreferenceChangeListener(this.deepLinkListener);
        this.deepLinkListener = null;
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
        unregisterReceiver(this.btyReceiver);
        org.cocos2dx.bole.sdk.SDKHelper.onDestroy();
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity
    protected void onActivityResult(int i, int i2, android.content.Intent intent) {
        if (!org.cocos2dx.plugin.PluginWrapper.onActivityResult(i, i2, intent)) {
            super.onActivityResult(i, i2, intent);
        }
        org.cocos2dx.plugin.FacebookWrapper.onAcitivityResult(i, i2, intent);
        org.cocos2dx.bole.sdk.SDKHelper.onActivityResult(i, i2, intent);
    }

    @Override // android.app.Activity
    public void onRequestPermissionsResult(int i, java.lang.String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        org.cocos2dx.bole.sdk.SDKHelper.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(android.os.Bundle bundle) {
        super.onSaveInstanceState(bundle);
        org.cocos2dx.plugin.FacebookWrapper.onSaveInstanceState(bundle);
    }

    @Override // android.app.Activity
    public void onBackPressed() {
        super.onBackPressed();
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity, android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            hideSystemUI();
        }
    }

    @Override // org.cocos2dx.lib.Cocos2dxActivity
    public void hideSystemUI() {
        super.hideSystemUI();
    }

    @Override // android.app.Activity
    protected void onNewIntent(android.content.Intent intent) {
        android.net.Uri data;
        super.onNewIntent(intent);
        setIntent(intent);
        if (intent != null && (data = intent.getData()) != null) {
            java.lang.String queryParameter = data.getQueryParameter(com.google.android.gms.ads.mediation.MediationConfiguration.CUSTOM_EVENT_SERVER_PARAMETER_FIELD);
            deeplinkUrl = data.toString();
            if (queryParameter != null) {
                urlParameter = queryParameter;
                java.lang.System.out.println("-------URL message is " + queryParameter);
            }
            com.adjust.sdk.Adjust.processDeeplink(new com.adjust.sdk.AdjustDeeplink(data), getApplicationContext());
        }
        org.cocos2dx.bole.sdk.SDKHelper.onNewIntent(intent);
    }
}
